// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupPriceResponseBody extends TeaModel {
    /**
     * <p>The information about the prices and discount rules.</p>
     */
    @NameInMap("PriceInfo")
    public PriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A872585-33C7-4D69-AB8E-412E81EBA387</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerGroupPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupPriceResponseBody self = new DescribeContainerGroupPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupPriceResponseBody setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeContainerGroupPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Rule extends TeaModel {
        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Receive a 15% discount on a 1-year subscription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
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

    public static class DetailInfo extends TeaModel {
        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000098</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>Details about the pricing rules.</p>
         */
        @NameInMap("Rules")
        public Rules rules;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000098</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DetailInfo self = new DetailInfo();
            return TeaModel.build(map, self);
        }

        public DetailInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DetailInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DetailInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DetailInfo setRules(Rules rules) {
            this.rules = rules;
            return this;
        }
        public Rules getRules() {
            return this.rules;
        }

        public DetailInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<DetailInfo> detailInfo;

        public static DetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DetailInfos self = new DetailInfos();
            return TeaModel.build(map, self);
        }

        public DetailInfos setDetailInfo(java.util.List<DetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<DetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

    }

    public static class Price extends TeaModel {
        /**
         * <p>The currency unit. Valid values:</p>
         * <ul>
         * <li>CNY: This value only applies to the China site (aliyun.com).</li>
         * <li>USD: This value only applies to the International site (alibabacloud.com).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The information about the price.</p>
         */
        @NameInMap("DetailInfos")
        public DetailInfos detailInfos;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00012252</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00012252</p>
         */
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

        public Price setDetailInfos(DetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DetailInfos getDetailInfos() {
            return this.detailInfos;
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

    public static class RulesRule extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Receive a 15% discount on a 1-year subscription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static RulesRule build(java.util.Map<String, ?> map) throws Exception {
            RulesRule self = new RulesRule();
            return TeaModel.build(map, self);
        }

        public RulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class PriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<RulesRule> rule;

        public static PriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            PriceInfoRules self = new PriceInfoRules();
            return TeaModel.build(map, self);
        }

        public PriceInfoRules setRule(java.util.List<RulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<RulesRule> getRule() {
            return this.rule;
        }

    }

    public static class SpotPrice extends TeaModel {
        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.622</p>
         */
        @NameInMap("OriginPrice")
        public Float originPrice;

        /**
         * <p>The prices of preemptible elastic container instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0.056</p>
         */
        @NameInMap("SpotPrice")
        public Float spotPrice;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static SpotPrice build(java.util.Map<String, ?> map) throws Exception {
            SpotPrice self = new SpotPrice();
            return TeaModel.build(map, self);
        }

        public SpotPrice setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SpotPrice setOriginPrice(Float originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Float getOriginPrice() {
            return this.originPrice;
        }

        public SpotPrice setSpotPrice(Float spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        public SpotPrice setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class SpotPrices extends TeaModel {
        @NameInMap("SpotPrice")
        public java.util.List<SpotPrice> spotPrice;

        public static SpotPrices build(java.util.Map<String, ?> map) throws Exception {
            SpotPrices self = new SpotPrices();
            return TeaModel.build(map, self);
        }

        public SpotPrices setSpotPrice(java.util.List<SpotPrice> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public java.util.List<SpotPrice> getSpotPrice() {
            return this.spotPrice;
        }

    }

    public static class PriceInfo extends TeaModel {
        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public Price price;

        /**
         * <p>Details about the promotion rules.</p>
         */
        @NameInMap("Rules")
        public PriceInfoRules rules;

        /**
         * <p>The information about the prices of preemptible elastic container instances.</p>
         */
        @NameInMap("SpotPrices")
        public SpotPrices spotPrices;

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

        public PriceInfo setRules(PriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public PriceInfoRules getRules() {
            return this.rules;
        }

        public PriceInfo setSpotPrices(SpotPrices spotPrices) {
            this.spotPrices = spotPrices;
            return this;
        }
        public SpotPrices getSpotPrices() {
            return this.spotPrices;
        }

    }

}
