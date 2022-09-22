// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public PriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceModificationPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceResponseBody self = new DescribeInstanceModificationPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceResponseBody setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeInstanceModificationPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Price extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static Price build(java.util.Map<String, ?> map) throws Exception {
            Price self = new Price();
            return TeaModel.build(map, self);
        }

        public Price setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public Price setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public Price setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public Price setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class Rule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static Rule build(java.util.Map<String, ?> map) throws Exception {
            Rule self = new Rule();
            return TeaModel.build(map, self);
        }

        public Rule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Rule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class Rules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<Rule> rule;

        public static Rules build(java.util.Map<String, ?> map) throws Exception {
            Rules self = new Rules();
            return TeaModel.build(map, self);
        }

        public Rules setRule(java.util.List<Rule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

    }

    public static class PriceInfo extends TeaModel {
        @NameInMap("Price")
        public Price price;

        @NameInMap("Rules")
        public Rules rules;

        public static PriceInfo build(java.util.Map<String, ?> map) throws Exception {
            PriceInfo self = new PriceInfo();
            return TeaModel.build(map, self);
        }

        public PriceInfo setPrice(Price price) {
            this.price = price;
            return this;
        }
        public Price getPrice() {
            return this.price;
        }

        public PriceInfo setRules(Rules rules) {
            this.rules = rules;
            return this;
        }
        public Rules getRules() {
            return this.rules;
        }

    }

}
