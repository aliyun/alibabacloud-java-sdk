// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInstanceGroupPriceResponseBody extends TeaModel {
    /**
     * <p>The price.</p>
     */
    @NameInMap("Price")
    public DescribeInstanceGroupPriceResponseBodyPrice price;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E4F2B7-BBDA-534D-B872-CCC798996F69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule information.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeInstanceGroupPriceResponseBodyRules> rules;

    public static DescribeInstanceGroupPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGroupPriceResponseBody self = new DescribeInstanceGroupPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGroupPriceResponseBody setPrice(DescribeInstanceGroupPriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeInstanceGroupPriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeInstanceGroupPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceGroupPriceResponseBody setRules(java.util.List<DescribeInstanceGroupPriceResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeInstanceGroupPriceResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeInstanceGroupPriceResponseBodyPricePromotions extends TeaModel {
        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The coupon description.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular promotion</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86744342****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The coupon name.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular promotion</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Indicates whether the promotion is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("selected")
        public Boolean selected;

        public static DescribeInstanceGroupPriceResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGroupPriceResponseBodyPricePromotions self = new DescribeInstanceGroupPriceResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGroupPriceResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeInstanceGroupPriceResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeInstanceGroupPriceResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeInstanceGroupPriceResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeInstanceGroupPriceResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeInstanceGroupPriceResponseBodyPrice extends TeaModel {
        /**
         * <p>The currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>12618.0</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>18134.0</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The promotion information.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<DescribeInstanceGroupPriceResponseBodyPricePromotions> promotions;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>70.0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeInstanceGroupPriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGroupPriceResponseBodyPrice self = new DescribeInstanceGroupPriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGroupPriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeInstanceGroupPriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeInstanceGroupPriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeInstanceGroupPriceResponseBodyPrice setPromotions(java.util.List<DescribeInstanceGroupPriceResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeInstanceGroupPriceResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeInstanceGroupPriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeInstanceGroupPriceResponseBodyRules extends TeaModel {
        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Regular promotion</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yhpcxb4qhgp2k4****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeInstanceGroupPriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGroupPriceResponseBodyRules self = new DescribeInstanceGroupPriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGroupPriceResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceGroupPriceResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
