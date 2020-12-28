// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PriceInfo")
    public DescribePriceResponseBodyPriceInfo priceInfo;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setPriceInfo(DescribePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules self = new DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPriceDetailInfos extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("SubRules")
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules> subRules;

        public static DescribePriceResponseBodyPriceInfoPriceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPriceDetailInfos self = new DescribePriceResponseBodyPriceInfoPriceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoPriceDetailInfos setSubRules(java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules> subRules) {
            this.subRules = subRules;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfosSubRules> getSubRules() {
            return this.subRules;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPrice extends TeaModel {
        @NameInMap("ReservedInstanceHourPrice")
        public Float reservedInstanceHourPrice;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("DetailInfos")
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfos> detailInfos;

        @NameInMap("Currency")
        public String currency;

        public static DescribePriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPrice self = new DescribePriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPrice setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
            this.reservedInstanceHourPrice = reservedInstanceHourPrice;
            return this;
        }
        public Float getReservedInstanceHourPrice() {
            return this.reservedInstanceHourPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setDetailInfos(java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfos> detailInfos) {
            this.detailInfos = detailInfos;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPriceDetailInfos> getDetailInfos() {
            return this.detailInfos;
        }

        public DescribePriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRules self = new DescribePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Price")
        public DescribePriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public java.util.List<DescribePriceResponseBodyPriceInfoRules> rules;

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

        public DescribePriceResponseBodyPriceInfo setRules(java.util.List<DescribePriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

    }

}
