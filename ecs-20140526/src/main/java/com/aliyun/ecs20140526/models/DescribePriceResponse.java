// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribePriceResponsePriceInfo priceInfo;

    public static DescribePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponse self = new DescribePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponse setPriceInfo(DescribePriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribePriceResponsePriceInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePriceResponsePriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRulesRule self = new DescribePriceResponsePriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponsePriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoRulesRule> rule;

        public static DescribePriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRules self = new DescribePriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoRules setRule(java.util.List<DescribePriceResponsePriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponsePriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule self = new DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule;

        public static DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules self = new DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules setRule(java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public String resource;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("SubRules")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules subRules;

        public static DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel self = new DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel setSubRules(DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules getSubRules() {
            return this.subRules;
        }

    }

    public static class DescribePriceResponsePriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel;

        public static DescribePriceResponsePriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPriceDetailInfos self = new DescribePriceResponsePriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPriceDetailInfos setResourcePriceModel(java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel) {
            this.resourcePriceModel = resourcePriceModel;
            return this;
        }
        public java.util.List<DescribePriceResponsePriceInfoPriceDetailInfosResourcePriceModel> getResourcePriceModel() {
            return this.resourcePriceModel;
        }

    }

    public static class DescribePriceResponsePriceInfoPrice extends TeaModel {
        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("ReservedInstanceHourPrice")
        @Validation(required = true)
        public Float reservedInstanceHourPrice;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("DetailInfos")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPriceDetailInfos detailInfos;

        public static DescribePriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPrice self = new DescribePriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponsePriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponsePriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponsePriceInfoPrice setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
            this.reservedInstanceHourPrice = reservedInstanceHourPrice;
            return this;
        }
        public Float getReservedInstanceHourPrice() {
            return this.reservedInstanceHourPrice;
        }

        public DescribePriceResponsePriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponsePriceInfoPrice setDetailInfos(DescribePriceResponsePriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribePriceResponsePriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

    }

    public static class DescribePriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoRules rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPrice price;

        public static DescribePriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfo self = new DescribePriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfo setRules(DescribePriceResponsePriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribePriceResponsePriceInfoRules getRules() {
            return this.rules;
        }

        public DescribePriceResponsePriceInfo setPrice(DescribePriceResponsePriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribePriceResponsePriceInfoPrice getPrice() {
            return this.price;
        }

    }

}
