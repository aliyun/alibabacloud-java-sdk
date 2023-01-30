// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceRenewPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetResourceRenewPriceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceRenewPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRenewPriceResponseBody self = new GetResourceRenewPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceRenewPriceResponseBody setData(GetResourceRenewPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceRenewPriceResponseBodyData getData() {
        return this.data;
    }

    public GetResourceRenewPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceRenewPriceResponseBodyDataPricePromotions extends TeaModel {
        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromotionDesc")
        public String promotionDesc;

        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("Selected")
        public Boolean selected;

        public static GetResourceRenewPriceResponseBodyDataPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            GetResourceRenewPriceResponseBodyDataPricePromotions self = new GetResourceRenewPriceResponseBodyDataPricePromotions();
            return TeaModel.build(map, self);
        }

        public GetResourceRenewPriceResponseBodyDataPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public GetResourceRenewPriceResponseBodyDataPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetResourceRenewPriceResponseBodyDataPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public GetResourceRenewPriceResponseBodyDataPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetResourceRenewPriceResponseBodyDataPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class GetResourceRenewPriceResponseBodyDataPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public String discountPrice;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("Promotions")
        public java.util.List<GetResourceRenewPriceResponseBodyDataPricePromotions> promotions;

        @NameInMap("TradePrice")
        public String tradePrice;

        public static GetResourceRenewPriceResponseBodyDataPrice build(java.util.Map<String, ?> map) throws Exception {
            GetResourceRenewPriceResponseBodyDataPrice self = new GetResourceRenewPriceResponseBodyDataPrice();
            return TeaModel.build(map, self);
        }

        public GetResourceRenewPriceResponseBodyDataPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetResourceRenewPriceResponseBodyDataPrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourceRenewPriceResponseBodyDataPrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourceRenewPriceResponseBodyDataPrice setPromotions(java.util.List<GetResourceRenewPriceResponseBodyDataPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<GetResourceRenewPriceResponseBodyDataPricePromotions> getPromotions() {
            return this.promotions;
        }

        public GetResourceRenewPriceResponseBodyDataPrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class GetResourceRenewPriceResponseBodyDataRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static GetResourceRenewPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            GetResourceRenewPriceResponseBodyDataRules self = new GetResourceRenewPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public GetResourceRenewPriceResponseBodyDataRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceRenewPriceResponseBodyDataRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetResourceRenewPriceResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public GetResourceRenewPriceResponseBodyDataPrice price;

        @NameInMap("Rules")
        public java.util.List<GetResourceRenewPriceResponseBodyDataRules> rules;

        public static GetResourceRenewPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceRenewPriceResponseBodyData self = new GetResourceRenewPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceRenewPriceResponseBodyData setPrice(GetResourceRenewPriceResponseBodyDataPrice price) {
            this.price = price;
            return this;
        }
        public GetResourceRenewPriceResponseBodyDataPrice getPrice() {
            return this.price;
        }

        public GetResourceRenewPriceResponseBodyData setRules(java.util.List<GetResourceRenewPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetResourceRenewPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
