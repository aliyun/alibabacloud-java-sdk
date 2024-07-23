// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <p>The information about the prices and promotion rules.</p>
     */
    @NameInMap("PriceInfo")
    public DescribePriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule extends TeaModel {
        /**
         * <p>The description of the pricing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Receive a 15% discount on a 1-year subscription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the pricing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>587</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> rule;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules setRule(java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo extends TeaModel {
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
         * <p>The resource name. Valid values:</p>
         * <ul>
         * <li>InstanceType</li>
         * <li>bandwidth</li>
         * <li>image</li>
         * <li>SystemDisk</li>
         * <li>DataDisk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>Details about the pricing rules.</p>
         */
        @NameInMap("SubRules")
        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules subRules;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>3712.8</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setSubRules(DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules subRules) {
            this.subRules = subRules;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfoSubRules getSubRules() {
            return this.subRules;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfos self = new DescribePriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setDetailInfo(java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosDetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPrice extends TeaModel {
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
         * <p>The information about the price.</p>
         * <blockquote>
         * <p> This parameter is returned only when ResourceType is set to instance.</p>
         * </blockquote>
         */
        @NameInMap("DetailInfos")
        public DescribePriceResponseBodyPriceInfoPriceDetailInfos detailInfos;

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
         * <p>The hourly price of the reserved instance for which the No Upfront or Partial Upfront payment option is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReservedInstanceHourPrice")
        public Float reservedInstanceHourPrice;

        /**
         * <p>The transaction price of the order. The transaction price is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>3712.8</p>
         */
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

    public static class DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice extends TeaModel {
        /**
         * <p>The currency unit.</p>
         * <p>China site (aliyun.com): CNY</p>
         * <p>International site (alibabacloud.com): USD</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

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
         * <p>100</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice self = new DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRelatedPrice extends TeaModel {
        /**
         * <p>The Alibaba Cloud Marketplace image price.</p>
         */
        @NameInMap("MarketplaceImagePrice")
        public DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice marketplaceImagePrice;

        public static DescribePriceResponseBodyPriceInfoRelatedPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRelatedPrice self = new DescribePriceResponseBodyPriceInfoRelatedPrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRelatedPrice setMarketplaceImagePrice(DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice marketplaceImagePrice) {
            this.marketplaceImagePrice = marketplaceImagePrice;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoRelatedPriceMarketplaceImagePrice getMarketplaceImagePrice() {
            return this.marketplaceImagePrice;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRulesRule extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Receive a 15% discount on a 1-year subscription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the pricing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>587</p>
         */
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
        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public DescribePriceResponseBodyPriceInfoPrice price;

        /**
         * <p>The related price.</p>
         */
        @NameInMap("RelatedPrice")
        public DescribePriceResponseBodyPriceInfoRelatedPrice relatedPrice;

        /**
         * <p>The information about the promotion rules.</p>
         */
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

        public DescribePriceResponseBodyPriceInfo setRelatedPrice(DescribePriceResponseBodyPriceInfoRelatedPrice relatedPrice) {
            this.relatedPrice = relatedPrice;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoRelatedPrice getRelatedPrice() {
            return this.relatedPrice;
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
