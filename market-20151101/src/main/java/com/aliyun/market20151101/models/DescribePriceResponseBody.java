// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("Coupons")
    public DescribePriceResponseBodyCoupons coupons;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("Cuxiao")
    public Boolean cuxiao;

    @NameInMap("Cycle")
    public String cycle;

    @NameInMap("DiscountPrice")
    public Float discountPrice;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("ExpressionCode")
    public String expressionCode;

    @NameInMap("ExpressionMessage")
    public String expressionMessage;

    @NameInMap("InfoTitle")
    public String infoTitle;

    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PromotionRules")
    public DescribePriceResponseBodyPromotionRules promotionRules;

    @NameInMap("TradePrice")
    public Float tradePrice;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setCoupons(DescribePriceResponseBodyCoupons coupons) {
        this.coupons = coupons;
        return this;
    }
    public DescribePriceResponseBodyCoupons getCoupons() {
        return this.coupons;
    }

    public DescribePriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribePriceResponseBody setCuxiao(Boolean cuxiao) {
        this.cuxiao = cuxiao;
        return this;
    }
    public Boolean getCuxiao() {
        return this.cuxiao;
    }

    public DescribePriceResponseBody setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public DescribePriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public DescribePriceResponseBody setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribePriceResponseBody setExpressionCode(String expressionCode) {
        this.expressionCode = expressionCode;
        return this;
    }
    public String getExpressionCode() {
        return this.expressionCode;
    }

    public DescribePriceResponseBody setExpressionMessage(String expressionMessage) {
        this.expressionMessage = expressionMessage;
        return this;
    }
    public String getExpressionMessage() {
        return this.expressionMessage;
    }

    public DescribePriceResponseBody setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
        return this;
    }
    public String getInfoTitle() {
        return this.infoTitle;
    }

    public DescribePriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public DescribePriceResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePriceResponseBody setPromotionRules(DescribePriceResponseBodyPromotionRules promotionRules) {
        this.promotionRules = promotionRules;
        return this;
    }
    public DescribePriceResponseBodyPromotionRules getPromotionRules() {
        return this.promotionRules;
    }

    public DescribePriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static class DescribePriceResponseBodyCouponsCoupon extends TeaModel {
        @NameInMap("CanPromFee")
        public Float canPromFee;

        @NameInMap("CouponDesc")
        public String couponDesc;

        @NameInMap("CouponName")
        public String couponName;

        @NameInMap("CouponOptionCode")
        public String couponOptionCode;

        @NameInMap("CouponOptionNo")
        public String couponOptionNo;

        @NameInMap("IsSelected")
        public Boolean isSelected;

        public static DescribePriceResponseBodyCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyCouponsCoupon self = new DescribePriceResponseBodyCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyCouponsCoupon setCanPromFee(Float canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public Float getCanPromFee() {
            return this.canPromFee;
        }

        public DescribePriceResponseBodyCouponsCoupon setCouponDesc(String couponDesc) {
            this.couponDesc = couponDesc;
            return this;
        }
        public String getCouponDesc() {
            return this.couponDesc;
        }

        public DescribePriceResponseBodyCouponsCoupon setCouponName(String couponName) {
            this.couponName = couponName;
            return this;
        }
        public String getCouponName() {
            return this.couponName;
        }

        public DescribePriceResponseBodyCouponsCoupon setCouponOptionCode(String couponOptionCode) {
            this.couponOptionCode = couponOptionCode;
            return this;
        }
        public String getCouponOptionCode() {
            return this.couponOptionCode;
        }

        public DescribePriceResponseBodyCouponsCoupon setCouponOptionNo(String couponOptionNo) {
            this.couponOptionNo = couponOptionNo;
            return this;
        }
        public String getCouponOptionNo() {
            return this.couponOptionNo;
        }

        public DescribePriceResponseBodyCouponsCoupon setIsSelected(Boolean isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public Boolean getIsSelected() {
            return this.isSelected;
        }

    }

    public static class DescribePriceResponseBodyCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribePriceResponseBodyCouponsCoupon> coupon;

        public static DescribePriceResponseBodyCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyCoupons self = new DescribePriceResponseBodyCoupons();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyCoupons setCoupon(java.util.List<DescribePriceResponseBodyCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribePriceResponseBodyPromotionRulesPromotionRule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Title")
        public String title;

        public static DescribePriceResponseBodyPromotionRulesPromotionRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPromotionRulesPromotionRule self = new DescribePriceResponseBodyPromotionRulesPromotionRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPromotionRulesPromotionRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyPromotionRulesPromotionRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponseBodyPromotionRulesPromotionRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribePriceResponseBodyPromotionRules extends TeaModel {
        @NameInMap("PromotionRule")
        public java.util.List<DescribePriceResponseBodyPromotionRulesPromotionRule> promotionRule;

        public static DescribePriceResponseBodyPromotionRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPromotionRules self = new DescribePriceResponseBodyPromotionRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPromotionRules setPromotionRule(java.util.List<DescribePriceResponseBodyPromotionRulesPromotionRule> promotionRule) {
            this.promotionRule = promotionRule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPromotionRulesPromotionRule> getPromotionRule() {
            return this.promotionRule;
        }

    }

}
