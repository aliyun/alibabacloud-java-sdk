// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribeInstanceModificationPriceResponsePriceInfo priceInfo;

    public static DescribeInstanceModificationPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceResponse self = new DescribeInstanceModificationPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceModificationPriceResponse setPriceInfo(DescribeInstanceModificationPriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeInstanceModificationPriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribeInstanceModificationPriceResponsePriceInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeInstanceModificationPriceResponsePriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponsePriceInfoRulesRule self = new DescribeInstanceModificationPriceResponsePriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponsePriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeInstanceModificationPriceResponsePriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeInstanceModificationPriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeInstanceModificationPriceResponsePriceInfoRulesRule> rule;

        public static DescribeInstanceModificationPriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponsePriceInfoRules self = new DescribeInstanceModificationPriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponsePriceInfoRules setRule(java.util.List<DescribeInstanceModificationPriceResponsePriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeInstanceModificationPriceResponsePriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeInstanceModificationPriceResponsePriceInfoPrice extends TeaModel {
        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        public static DescribeInstanceModificationPriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponsePriceInfoPrice self = new DescribeInstanceModificationPriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponsePriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeInstanceModificationPriceResponsePriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeInstanceModificationPriceResponsePriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeInstanceModificationPriceResponsePriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

    public static class DescribeInstanceModificationPriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public DescribeInstanceModificationPriceResponsePriceInfoRules rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribeInstanceModificationPriceResponsePriceInfoPrice price;

        public static DescribeInstanceModificationPriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponsePriceInfo self = new DescribeInstanceModificationPriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponsePriceInfo setRules(DescribeInstanceModificationPriceResponsePriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeInstanceModificationPriceResponsePriceInfoRules getRules() {
            return this.rules;
        }

        public DescribeInstanceModificationPriceResponsePriceInfo setPrice(DescribeInstanceModificationPriceResponsePriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeInstanceModificationPriceResponsePriceInfoPrice getPrice() {
            return this.price;
        }

    }

}
