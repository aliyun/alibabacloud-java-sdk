// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupPriceResponseBody extends TeaModel {
    /**
     * <p>The information about the prices and discount rules.</p>
     */
    @NameInMap("PriceInfo")
    public DescribeContainerGroupPriceResponseBodyPriceInfo priceInfo;

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

    public DescribeContainerGroupPriceResponseBody setPriceInfo(DescribeContainerGroupPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeContainerGroupPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeContainerGroupPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule extends TeaModel {
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

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule self = new DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule> rule;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules self = new DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules setRule(java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo extends TeaModel {
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
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules rules;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000098</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo self = new DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setRules(DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules getRules() {
            return this.rules;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos self = new DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos setDetailInfo(java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoPrice extends TeaModel {
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
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

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

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPrice self = new DescribeContainerGroupPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setDetailInfos(DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule extends TeaModel {
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

        public static DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule self = new DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule> rule;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoRules self = new DescribeContainerGroupPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoRules setRule(java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice extends TeaModel {
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

        public static DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice self = new DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice setOriginPrice(Float originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Float getOriginPrice() {
            return this.originPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice setSpotPrice(Float spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Float getSpotPrice() {
            return this.spotPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices extends TeaModel {
        @NameInMap("SpotPrice")
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice> spotPrice;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices self = new DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices setSpotPrice(java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public java.util.List<DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice> getSpotPrice() {
            return this.spotPrice;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice price;

        /**
         * <p>Details about the promotion rules.</p>
         */
        @NameInMap("Rules")
        public DescribeContainerGroupPriceResponseBodyPriceInfoRules rules;

        /**
         * <p>The information about the prices of preemptible elastic container instances.</p>
         */
        @NameInMap("SpotPrices")
        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices spotPrices;

        public static DescribeContainerGroupPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfo self = new DescribeContainerGroupPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfo setPrice(DescribeContainerGroupPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfo setRules(DescribeContainerGroupPriceResponseBodyPriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoRules getRules() {
            return this.rules;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfo setSpotPrices(DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices spotPrices) {
            this.spotPrices = spotPrices;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices getSpotPrices() {
            return this.spotPrices;
        }

    }

}
