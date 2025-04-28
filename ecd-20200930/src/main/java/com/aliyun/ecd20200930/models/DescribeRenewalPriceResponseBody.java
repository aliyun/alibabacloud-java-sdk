// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponseBody extends TeaModel {
    /**
     * <p>The price details.</p>
     */
    @NameInMap("PriceInfo")
    public DescribeRenewalPriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72E47B1E-6B11-5A11-A27C-7A80F866****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRenewalPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponseBody self = new DescribeRenewalPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceResponseBody setPriceInfo(DescribeRenewalPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeRenewalPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeRenewalPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPricePromotions extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotion description.</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>promo_option</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The promotion name.</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Indicates whether an item is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeRenewalPriceResponseBodyPriceInfoPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPricePromotions self = new DescribeRenewalPriceResponseBodyPriceInfoPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPrice extends TeaModel {
        /**
         * <p>The unit of currency (USD).</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discounted amount.</p>
         * 
         * <strong>example:</strong>
         * <p>15.8</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The orders.</p>
         */
        @NameInMap("OrderLines")
        public java.util.Map<String, String> orderLines;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>79.0</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The promotions.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPricePromotions> promotions;

        /**
         * <p>The actual price. The actual price is the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>63.2</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeRenewalPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPrice self = new DescribeRenewalPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setOrderLines(java.util.Map<String, String> orderLines) {
            this.orderLines = orderLines;
            return this;
        }
        public java.util.Map<String, String> getOrderLines() {
            return this.orderLines;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setPromotions(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoRules extends TeaModel {
        /**
         * <p>The rule description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29644</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeRenewalPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoRules self = new DescribeRenewalPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public DescribeRenewalPriceResponseBodyPriceInfoPrice price;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoRules> rules;

        public static DescribeRenewalPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfo self = new DescribeRenewalPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setPrice(DescribeRenewalPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setRules(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

    }

}
