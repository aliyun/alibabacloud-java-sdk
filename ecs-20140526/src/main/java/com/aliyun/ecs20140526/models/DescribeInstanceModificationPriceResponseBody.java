// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceResponseBody extends TeaModel {
    /**
     * <p>$.parameters[4].schema.enumValueTitles</p>
     */
    @NameInMap("PriceInfo")
    public DescribeInstanceModificationPriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>$.parameters[4].schema.example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceModificationPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceResponseBody self = new DescribeInstanceModificationPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceResponseBody setPriceInfo(DescribeInstanceModificationPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeInstanceModificationPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeInstanceModificationPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>WB01405484</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>DescribeInstanceModificationPrice</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoPrice self = new DescribeInstanceModificationPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule extends TeaModel {
        /**
         * <p>$.parameters[5].schema.example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>$.parameters[5].schema.enumValueTitles</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule self = new DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule> rule;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoRules self = new DescribeInstanceModificationPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoRules setRule(java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <p>Queries the pricing information about newly attached subscription data disks or about the new instance types when you upgrade the configurations of unexpired subscription Elastic Compute Service (ECS) instances.</p>
         */
        @NameInMap("Price")
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice price;

        /**
         * <p>$.parameters[5].schema.description</p>
         */
        @NameInMap("Rules")
        public DescribeInstanceModificationPriceResponseBodyPriceInfoRules rules;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfo self = new DescribeInstanceModificationPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfo setPrice(DescribeInstanceModificationPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfo setRules(DescribeInstanceModificationPriceResponseBodyPriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeInstanceModificationPriceResponseBodyPriceInfoRules getRules() {
            return this.rules;
        }

    }

}
