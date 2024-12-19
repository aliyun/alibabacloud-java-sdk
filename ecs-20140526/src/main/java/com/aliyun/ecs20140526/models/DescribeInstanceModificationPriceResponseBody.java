// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceResponseBody extends TeaModel {
    /**
     * <p>Details about the prices and promotion rules.</p>
     */
    @NameInMap("PriceInfo")
    public DescribeInstanceModificationPriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3DC3196-379B-4F32-A2C5-B937134FAD8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceModificationPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceResponseBody self = new DescribeInstanceModificationPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceResponseBody setPriceInfo(DescribeInstanceModificationPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeInstanceModificationPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeInstanceModificationPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule self = new DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> rule;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules self = new DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules setRule(java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo extends TeaModel {
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("SubRules")
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules subRules;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo self = new DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setSubRules(DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules getSubRules() {
            return this.subRules;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos self = new DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos setDetailInfo(java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoPrice extends TeaModel {
        /**
         * <p>The currency unit.</p>
         * <p>Alibaba Cloud China site (aliyun.com): CNY</p>
         * <p>Alibaba Cloud International site (alibabacloud.com): USD</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DetailInfos")
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>61.320</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>175.200</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>113.880</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoPrice self = new DescribeInstanceModificationPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setDetailInfos(DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPriceDetailInfos getDetailInfos() {
            return this.detailInfos;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade offers</p>
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

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule self = new DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule> rule;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfoRules self = new DescribeInstanceModificationPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfoRules setRule(java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeInstanceModificationPriceResponseBodyPriceInfoRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeInstanceModificationPriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice price;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public DescribeInstanceModificationPriceResponseBodyPriceInfoRules rules;

        public static DescribeInstanceModificationPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceModificationPriceResponseBodyPriceInfo self = new DescribeInstanceModificationPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfo setPrice(DescribeInstanceModificationPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeInstanceModificationPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeInstanceModificationPriceResponseBodyPriceInfo setRules(DescribeInstanceModificationPriceResponseBodyPriceInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeInstanceModificationPriceResponseBodyPriceInfoRules getRules() {
            return this.rules;
        }

    }

}
