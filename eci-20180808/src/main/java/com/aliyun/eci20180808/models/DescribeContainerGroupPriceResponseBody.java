// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupPriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PriceInfo")
    public DescribeContainerGroupPriceResponseBodyPriceInfo priceInfo;

    public static DescribeContainerGroupPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupPriceResponseBody self = new DescribeContainerGroupPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerGroupPriceResponseBody setPriceInfo(DescribeContainerGroupPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeContainerGroupPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SpotPrice")
        public Float spotPrice;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OriginPrice")
        public Float originPrice;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice self = new DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPricesSpotPrice setSpotPrice(Float spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Float getSpotPrice() {
            return this.spotPrice;
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

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

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
        @NameInMap("Resource")
        public String resource;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Rules")
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules rules;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo self = new DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setRules(DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoRules getRules() {
            return this.rules;
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
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("DetailInfos")
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

        @NameInMap("Currency")
        public String currency;

        public static DescribeContainerGroupPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfoPrice self = new DescribeContainerGroupPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setDetailInfos(DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

    public static class DescribeContainerGroupPriceResponseBodyPriceInfoRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

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

    public static class DescribeContainerGroupPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("SpotPrices")
        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices spotPrices;

        @NameInMap("Price")
        public DescribeContainerGroupPriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public DescribeContainerGroupPriceResponseBodyPriceInfoRules rules;

        public static DescribeContainerGroupPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupPriceResponseBodyPriceInfo self = new DescribeContainerGroupPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupPriceResponseBodyPriceInfo setSpotPrices(DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices spotPrices) {
            this.spotPrices = spotPrices;
            return this;
        }
        public DescribeContainerGroupPriceResponseBodyPriceInfoSpotPrices getSpotPrices() {
            return this.spotPrices;
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

    }

}
