// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public PriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBandwidthPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPriceResponseBody self = new DescribeBandwidthPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPriceResponseBody setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeBandwidthPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RuleIdSet extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static RuleIdSet build(java.util.Map<String, ?> map) throws Exception {
            RuleIdSet self = new RuleIdSet();
            return TeaModel.build(map, self);
        }

        public RuleIdSet setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class Order extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("RuleIdSet")
        public RuleIdSet ruleIdSet;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static Order build(java.util.Map<String, ?> map) throws Exception {
            Order self = new Order();
            return TeaModel.build(map, self);
        }

        public Order setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public Order setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public Order setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public Order setRuleIdSet(RuleIdSet ruleIdSet) {
            this.ruleIdSet = ruleIdSet;
            return this;
        }
        public RuleIdSet getRuleIdSet() {
            return this.ruleIdSet;
        }

        public Order setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class Rule extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Title")
        public String title;

        public static Rule build(java.util.Map<String, ?> map) throws Exception {
            Rule self = new Rule();
            return TeaModel.build(map, self);
        }

        public Rule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Rule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public Rule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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
        @NameInMap("Order")
        public Order order;

        @NameInMap("Rules")
        public Rules rules;

        public static PriceInfo build(java.util.Map<String, ?> map) throws Exception {
            PriceInfo self = new PriceInfo();
            return TeaModel.build(map, self);
        }

        public PriceInfo setOrder(Order order) {
            this.order = order;
            return this;
        }
        public Order getOrder() {
            return this.order;
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
