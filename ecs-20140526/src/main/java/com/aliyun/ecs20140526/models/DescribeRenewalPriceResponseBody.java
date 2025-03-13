// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponseBody extends TeaModel {
    /**
     * <p>Details about the prices and promotion rules.</p>
     */
    @NameInMap("PriceInfo")
    public DescribeRenewalPriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
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

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule extends TeaModel {
        /**
         * <p>The description of the pricing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Receive a 15% discount on a 1-year subscription.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the pricing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> rule;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules setRule(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo extends TeaModel {
        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>655.2</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>4368</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The name of the resource that corresponds to the price.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The pricing rules.</p>
         */
        @NameInMap("SubRules")
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules subRules;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>3712.8</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setSubRules(DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules getSubRules() {
            return this.subRules;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo;

        public static DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos self = new DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos setDetailInfo(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoPrice extends TeaModel {
        /**
         * <p>The currency unit.</p>
         * <p>Alibaba Cloud China site (aliyun.com): CNY.</p>
         * <p>Alibaba Cloud International site (alibabacloud.com): USD.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>Details about the resource prices.</p>
         */
        @NameInMap("DetailInfos")
        public DescribeRenewalPriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>655.2</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>4368</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>3712.8</p>
         */
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
         * <p>1234567890</p>
         */
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
        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public DescribeRenewalPriceResponseBodyPriceInfoPrice price;

        /**
         * <p>The information about the promotion rules.</p>
         */
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
