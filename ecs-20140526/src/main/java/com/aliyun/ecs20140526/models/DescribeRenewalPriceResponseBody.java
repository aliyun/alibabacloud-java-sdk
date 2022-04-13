// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribeRenewalPriceResponseBodyPriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRenewalPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponseBody self = new DescribeRenewalPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceResponseBody setPriceInfo(DescribeRenewalPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeRenewalPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeRenewalPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules setRule(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel extends TeaModel {
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("SubRules")
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules subRules;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setSubRules(DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModelSubRules getSubRules() {
            return this.subRules;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("ResourcePriceModel")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos setResourcePriceModel(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel> resourcePriceModel) {
            this.resourcePriceModel = resourcePriceModel;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosResourcePriceModel> getResourcePriceModel() {
            return this.resourcePriceModel;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DetailInfos")
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeRenewalPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPrice self = new DescribeRenewalPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setDetailInfos(DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeRenewalPriceResponseBodyPriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoRulesRule self = new DescribeRenewalPriceResponseBodyPriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoRulesRule> rule;

        public static DescribeRenewalPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoRules self = new DescribeRenewalPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoRules setRule(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Price")
        public DescribeRenewalPriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public DescribeRenewalPriceResponseBodyPriceInfoRules rules;

        public static DescribeRenewalPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfo self = new DescribeRenewalPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setPrice(DescribeRenewalPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setRules(DescribeRenewalPriceResponseBodyPriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoRules getRules() {
            return this.rules;
        }

    }

}
