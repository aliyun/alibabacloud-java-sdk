// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intlmarket20250812.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Coupons")
    public java.util.List<DescribePriceResponseBodyCoupons> coupons;

    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    @NameInMap("Cuxiao")
    public Boolean cuxiao;

    /**
     * <strong>example:</strong>
     * <p>once</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscountPrice")
    public Float discountPrice;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>NO_AVAILABLE_PAYMENT_METHOD</p>
     */
    @NameInMap("ExpressionCode")
    public String expressionCode;

    /**
     * <strong>example:</strong>
     * <p>ExpressionMessage</p>
     */
    @NameInMap("ExpressionMessage")
    public String expressionMessage;

    /**
     * <strong>example:</strong>
     * <p>139.41</p>
     */
    @NameInMap("InfoTitle")
    public String infoTitle;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2099.0</p>
     */
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    /**
     * <strong>example:</strong>
     * <p>csas</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PromotionRules")
    public java.util.List<DescribePriceResponseBodyPromotionRules> promotionRules;

    /**
     * <strong>example:</strong>
     * <p>054AF571-C86F-533F-8A7B-F62206FA4367</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1320.0</p>
     */
    @NameInMap("TradePrice")
    public Float tradePrice;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePriceResponseBody setCoupons(java.util.List<DescribePriceResponseBodyCoupons> coupons) {
        this.coupons = coupons;
        return this;
    }
    public java.util.List<DescribePriceResponseBodyCoupons> getCoupons() {
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

    public DescribePriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public DescribePriceResponseBody setPromotionRules(java.util.List<DescribePriceResponseBodyPromotionRules> promotionRules) {
        this.promotionRules = promotionRules;
        return this;
    }
    public java.util.List<DescribePriceResponseBodyPromotionRules> getPromotionRules() {
        return this.promotionRules;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static class DescribePriceResponseBodyCoupons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CanPromFee</p>
         */
        @NameInMap("CanPromFee")
        public Long canPromFee;

        /**
         * <strong>example:</strong>
         * <p>CouponName</p>
         */
        @NameInMap("CouponName")
        public String couponName;

        /**
         * <strong>example:</strong>
         * <p>CouponOptionCode</p>
         */
        @NameInMap("CouponOptionCode")
        public String couponOptionCode;

        /**
         * <strong>example:</strong>
         * <p>CouponOptionNo</p>
         */
        @NameInMap("CouponOptionNo")
        public String couponOptionNo;

        /**
         * <strong>example:</strong>
         * <p>IsSelected</p>
         */
        @NameInMap("IsSelected")
        public Boolean isSelected;

        /**
         * <strong>example:</strong>
         * <p>PromotionDesc</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        public static DescribePriceResponseBodyCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyCoupons self = new DescribePriceResponseBodyCoupons();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyCoupons setCanPromFee(Long canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public Long getCanPromFee() {
            return this.canPromFee;
        }

        public DescribePriceResponseBodyCoupons setCouponName(String couponName) {
            this.couponName = couponName;
            return this;
        }
        public String getCouponName() {
            return this.couponName;
        }

        public DescribePriceResponseBodyCoupons setCouponOptionCode(String couponOptionCode) {
            this.couponOptionCode = couponOptionCode;
            return this;
        }
        public String getCouponOptionCode() {
            return this.couponOptionCode;
        }

        public DescribePriceResponseBodyCoupons setCouponOptionNo(String couponOptionNo) {
            this.couponOptionNo = couponOptionNo;
            return this;
        }
        public String getCouponOptionNo() {
            return this.couponOptionNo;
        }

        public DescribePriceResponseBodyCoupons setIsSelected(Boolean isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public Boolean getIsSelected() {
            return this.isSelected;
        }

        public DescribePriceResponseBodyCoupons setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

    }

    public static class DescribePriceResponseBodyPromotionRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alb-xdnghlhvm9vvo1sk54_Accelerator</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1827975</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePriceResponseBodyPromotionRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPromotionRules self = new DescribePriceResponseBodyPromotionRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPromotionRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyPromotionRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponseBodyPromotionRules setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
