// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInstanceGroupPriceForRenewResponseBody extends TeaModel {
    /**
     * <p>The price.</p>
     */
    @NameInMap("Price")
    public DescribeInstanceGroupPriceForRenewResponseBodyPrice price;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8451630-77B9-5259-A9BC-950E9BC586B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The promotion rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeInstanceGroupPriceForRenewResponseBodyRules> rules;

    public static DescribeInstanceGroupPriceForRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGroupPriceForRenewResponseBody self = new DescribeInstanceGroupPriceForRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGroupPriceForRenewResponseBody setPrice(DescribeInstanceGroupPriceForRenewResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeInstanceGroupPriceForRenewResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeInstanceGroupPriceForRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceGroupPriceForRenewResponseBody setRules(java.util.List<DescribeInstanceGroupPriceForRenewResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeInstanceGroupPriceForRenewResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions extends TeaModel {
        /**
         * <p>The option code.</p>
         * 
         * <strong>example:</strong>
         * <p>youhui_quan</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotion description.</p>
         * 
         * <strong>example:</strong>
         * <p>20 off on orders over 40</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87996380****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The promotion name.</p>
         * 
         * <strong>example:</strong>
         * <p>20 off on orders over 40</p>
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

        public static DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions self = new DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeInstanceGroupPriceForRenewResponseBodyPrice extends TeaModel {
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
         * <p>1098.99</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>5007.0</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The promotion information.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions> promotions;

        /**
         * <p>The transaction amount.</p>
         * 
         * <strong>example:</strong>
         * <p>34.02</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeInstanceGroupPriceForRenewResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGroupPriceForRenewResponseBodyPrice self = new DescribeInstanceGroupPriceForRenewResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPrice setPromotions(java.util.List<DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeInstanceGroupPriceForRenewResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeInstanceGroupPriceForRenewResponseBodyRules extends TeaModel {
        /**
         * <p>The activity description.</p>
         * 
         * <strong>example:</strong>
         * <p>20 off on orders over 40</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t1uf7xt141ut5i****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeInstanceGroupPriceForRenewResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGroupPriceForRenewResponseBodyRules self = new DescribeInstanceGroupPriceForRenewResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceGroupPriceForRenewResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
