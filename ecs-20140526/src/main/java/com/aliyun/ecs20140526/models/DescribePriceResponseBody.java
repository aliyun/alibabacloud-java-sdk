// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribePriceResponseBodyPriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setPriceInfo(DescribePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules setRule(java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel extends TeaModel {
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("SubRules")
        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules subRules;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setSubRules(DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules getSubRules() {
            return this.subRules;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfos self = new DescribePriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setResourcePriceModel(java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel) {
            this.resourcePriceModel = resourcePriceModel;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel> getResourcePriceModel() {
            return this.resourcePriceModel;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DetailInfos")
        public DescribePriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("ReservedInstanceHourPrice")
        public Float reservedInstanceHourPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribePriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPrice self = new DescribePriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyPriceInfoPrice setDetailInfos(DescribePriceResponseBodyPriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public DescribePriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
            this.reservedInstanceHourPrice = reservedInstanceHourPrice;
            return this;
        }
        public Float getReservedInstanceHourPrice() {
            return this.reservedInstanceHourPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribePriceResponseBodyPriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRulesRule self = new DescribePriceResponseBodyPriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyPriceInfoRulesRule> rule;

        public static DescribePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRules self = new DescribePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRules setRule(java.util.List<DescribePriceResponseBodyPriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Price")
        public DescribePriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public DescribePriceResponseBodyPriceInfoRules rules;

        public static DescribePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfo self = new DescribePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfo setPrice(DescribePriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribePriceResponseBodyPriceInfo setRules(DescribePriceResponseBodyPriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoRules getRules() {
            return this.rules;
        }

    }

}
