// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribeModificationPriceResponsePriceInfo priceInfo;

    public static DescribeModificationPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModificationPriceResponse self = new DescribeModificationPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModificationPriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModificationPriceResponse setPriceInfo(DescribeModificationPriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeModificationPriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribeModificationPriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeModificationPriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponsePriceInfoRules self = new DescribeModificationPriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponsePriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeModificationPriceResponsePriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeModificationPriceResponsePriceInfoPricePromotions extends TeaModel {
        @NameInMap("OptionCode")
        @Validation(required = true)
        public String optionCode;

        @NameInMap("PromotionId")
        @Validation(required = true)
        public String promotionId;

        @NameInMap("PromotionName")
        @Validation(required = true)
        public String promotionName;

        @NameInMap("PromotionDesc")
        @Validation(required = true)
        public String promotionDesc;

        @NameInMap("Selected")
        @Validation(required = true)
        public Boolean selected;

        public static DescribeModificationPriceResponsePriceInfoPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponsePriceInfoPricePromotions self = new DescribeModificationPriceResponsePriceInfoPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponsePriceInfoPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeModificationPriceResponsePriceInfoPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeModificationPriceResponsePriceInfoPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeModificationPriceResponsePriceInfoPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeModificationPriceResponsePriceInfoPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeModificationPriceResponsePriceInfoPrice extends TeaModel {
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

        @NameInMap("Promotions")
        @Validation(required = true)
        public java.util.List<DescribeModificationPriceResponsePriceInfoPricePromotions> promotions;

        public static DescribeModificationPriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponsePriceInfoPrice self = new DescribeModificationPriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponsePriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeModificationPriceResponsePriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeModificationPriceResponsePriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeModificationPriceResponsePriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeModificationPriceResponsePriceInfoPrice setPromotions(java.util.List<DescribeModificationPriceResponsePriceInfoPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeModificationPriceResponsePriceInfoPricePromotions> getPromotions() {
            return this.promotions;
        }

    }

    public static class DescribeModificationPriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public java.util.List<DescribeModificationPriceResponsePriceInfoRules> rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribeModificationPriceResponsePriceInfoPrice price;

        public static DescribeModificationPriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponsePriceInfo self = new DescribeModificationPriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponsePriceInfo setRules(java.util.List<DescribeModificationPriceResponsePriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeModificationPriceResponsePriceInfoRules> getRules() {
            return this.rules;
        }

        public DescribeModificationPriceResponsePriceInfo setPrice(DescribeModificationPriceResponsePriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeModificationPriceResponsePriceInfoPrice getPrice() {
            return this.price;
        }

    }

}
