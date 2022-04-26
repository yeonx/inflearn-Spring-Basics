package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountDFixAmount = 1000; //1000dnjs gkfdls
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountDFixAmount;
        }else {
            return 0;
        }
    }
}
