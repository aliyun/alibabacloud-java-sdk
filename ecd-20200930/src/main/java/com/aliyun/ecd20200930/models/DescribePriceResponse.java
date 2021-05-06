// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

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

    public static class DescribePriceResponsePriceInfoRules extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePriceResponsePriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRules self = new DescribePriceResponsePriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponsePriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePriceResponsePriceInfoPricePromotions extends TeaModel {
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

        public static DescribePriceResponsePriceInfoPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPricePromotions self = new DescribePriceResponsePriceInfoPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponsePriceInfoPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribePriceResponsePriceInfoPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribePriceResponsePriceInfoPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribePriceResponsePriceInfoPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
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

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("Promotions")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoPricePromotions> promotions;

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

        public DescribePriceResponsePriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponsePriceInfoPrice setPromotions(java.util.List<DescribePriceResponsePriceInfoPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribePriceResponsePriceInfoPricePromotions> getPromotions() {
            return this.promotions;
        }

    }

    public static class DescribePriceResponsePriceInfo extends TeaModel {
        @NameInMap("Rules")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoRules> rules;

        @NameInMap("Price")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPrice price;

        public static DescribePriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfo self = new DescribePriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfo setRules(java.util.List<DescribePriceResponsePriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribePriceResponsePriceInfoRules> getRules() {
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
