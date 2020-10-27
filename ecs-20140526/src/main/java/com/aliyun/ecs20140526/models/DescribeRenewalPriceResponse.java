// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribeRenewalPriceResponsePriceInfo priceInfo;

    public static DescribeRenewalPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponse self = new DescribeRenewalPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenewalPriceResponse setPriceInfo(DescribeRenewalPriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeRenewalPriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribeRenewalPriceResponsePriceInfoRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeRenewalPriceResponsePriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoRulesRule self = new DescribeRenewalPriceResponsePriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeRenewalPriceResponsePriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoRulesRule> rule;

        public static DescribeRenewalPriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoRules self = new DescribeRenewalPriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoRules setRule(java.util.List<DescribeRenewalPriceResponsePriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponsePriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules setRule(java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel extends TeaModel {
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
        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules subRules;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel setSubRules(DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModelSubRules getSubRules() {
            return this.subRules;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel;

        public static DescribeRenewalPriceResponsePriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPriceDetailInfos self = new DescribeRenewalPriceResponsePriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfos setResourcePriceModel(java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel) {
            this.resourcePriceModel = resourcePriceModel;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponsePriceInfoPriceDetailInfosResourcePriceModel> getResourcePriceModel() {
            return this.resourcePriceModel;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoPrice extends TeaModel {
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

        @NameInMap("DetailInfos")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfos detailInfos;

        public static DescribeRenewalPriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoPrice self = new DescribeRenewalPriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponsePriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponsePriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeRenewalPriceResponsePriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRenewalPriceResponsePriceInfoPrice setDetailInfos(DescribeRenewalPriceResponsePriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoRules rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoPrice price;

        public static DescribeRenewalPriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfo self = new DescribeRenewalPriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfo setRules(DescribeRenewalPriceResponsePriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoRules getRules() {
            return this.rules;
        }

        public DescribeRenewalPriceResponsePriceInfo setPrice(DescribeRenewalPriceResponsePriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoPrice getPrice() {
            return this.price;
        }

    }

}
