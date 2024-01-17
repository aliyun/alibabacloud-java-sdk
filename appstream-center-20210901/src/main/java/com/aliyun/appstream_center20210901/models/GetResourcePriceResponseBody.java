// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourcePriceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PriceList")
    public java.util.List<GetResourcePriceResponseBodyPriceList> priceList;

    @NameInMap("PriceModel")
    public GetResourcePriceResponseBodyPriceModel priceModel;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourcePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePriceResponseBody self = new GetResourcePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcePriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourcePriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourcePriceResponseBody setPriceList(java.util.List<GetResourcePriceResponseBodyPriceList> priceList) {
        this.priceList = priceList;
        return this;
    }
    public java.util.List<GetResourcePriceResponseBodyPriceList> getPriceList() {
        return this.priceList;
    }

    public GetResourcePriceResponseBody setPriceModel(GetResourcePriceResponseBodyPriceModel priceModel) {
        this.priceModel = priceModel;
        return this;
    }
    public GetResourcePriceResponseBodyPriceModel getPriceModel() {
        return this.priceModel;
    }

    public GetResourcePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourcePriceResponseBodyPriceListPricePromotions extends TeaModel {
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

        public static GetResourcePriceResponseBodyPriceListPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceListPricePromotions self = new GetResourcePriceResponseBodyPriceListPricePromotions();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceListPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public GetResourcePriceResponseBodyPriceListPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetResourcePriceResponseBodyPriceListPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public GetResourcePriceResponseBodyPriceListPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetResourcePriceResponseBodyPriceListPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class GetResourcePriceResponseBodyPriceListPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public String discountPrice;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("Promotions")
        public java.util.List<GetResourcePriceResponseBodyPriceListPricePromotions> promotions;

        @NameInMap("TradePrice")
        public String tradePrice;

        public static GetResourcePriceResponseBodyPriceListPrice build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceListPrice self = new GetResourcePriceResponseBodyPriceListPrice();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceListPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetResourcePriceResponseBodyPriceListPrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourcePriceResponseBodyPriceListPrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourcePriceResponseBodyPriceListPrice setPromotions(java.util.List<GetResourcePriceResponseBodyPriceListPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<GetResourcePriceResponseBodyPriceListPricePromotions> getPromotions() {
            return this.promotions;
        }

        public GetResourcePriceResponseBodyPriceListPrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class GetResourcePriceResponseBodyPriceListRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static GetResourcePriceResponseBodyPriceListRules build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceListRules self = new GetResourcePriceResponseBodyPriceListRules();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceListRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourcePriceResponseBodyPriceListRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetResourcePriceResponseBodyPriceList extends TeaModel {
        @NameInMap("Price")
        public GetResourcePriceResponseBodyPriceListPrice price;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("Rules")
        public java.util.List<GetResourcePriceResponseBodyPriceListRules> rules;

        public static GetResourcePriceResponseBodyPriceList build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceList self = new GetResourcePriceResponseBodyPriceList();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceList setPrice(GetResourcePriceResponseBodyPriceListPrice price) {
            this.price = price;
            return this;
        }
        public GetResourcePriceResponseBodyPriceListPrice getPrice() {
            return this.price;
        }

        public GetResourcePriceResponseBodyPriceList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public GetResourcePriceResponseBodyPriceList setRules(java.util.List<GetResourcePriceResponseBodyPriceListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetResourcePriceResponseBodyPriceListRules> getRules() {
            return this.rules;
        }

    }

    public static class GetResourcePriceResponseBodyPriceModelPricePromotions extends TeaModel {
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

        public static GetResourcePriceResponseBodyPriceModelPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceModelPricePromotions self = new GetResourcePriceResponseBodyPriceModelPricePromotions();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceModelPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public GetResourcePriceResponseBodyPriceModelPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetResourcePriceResponseBodyPriceModelPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public GetResourcePriceResponseBodyPriceModelPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetResourcePriceResponseBodyPriceModelPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class GetResourcePriceResponseBodyPriceModelPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public String discountPrice;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("Promotions")
        public java.util.List<GetResourcePriceResponseBodyPriceModelPricePromotions> promotions;

        @NameInMap("TradePrice")
        public String tradePrice;

        public static GetResourcePriceResponseBodyPriceModelPrice build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceModelPrice self = new GetResourcePriceResponseBodyPriceModelPrice();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceModelPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetResourcePriceResponseBodyPriceModelPrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourcePriceResponseBodyPriceModelPrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourcePriceResponseBodyPriceModelPrice setPromotions(java.util.List<GetResourcePriceResponseBodyPriceModelPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<GetResourcePriceResponseBodyPriceModelPricePromotions> getPromotions() {
            return this.promotions;
        }

        public GetResourcePriceResponseBodyPriceModelPrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class GetResourcePriceResponseBodyPriceModelRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static GetResourcePriceResponseBodyPriceModelRules build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceModelRules self = new GetResourcePriceResponseBodyPriceModelRules();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceModelRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourcePriceResponseBodyPriceModelRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetResourcePriceResponseBodyPriceModel extends TeaModel {
        @NameInMap("Price")
        public GetResourcePriceResponseBodyPriceModelPrice price;

        @NameInMap("Rules")
        public java.util.List<GetResourcePriceResponseBodyPriceModelRules> rules;

        public static GetResourcePriceResponseBodyPriceModel build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePriceResponseBodyPriceModel self = new GetResourcePriceResponseBodyPriceModel();
            return TeaModel.build(map, self);
        }

        public GetResourcePriceResponseBodyPriceModel setPrice(GetResourcePriceResponseBodyPriceModelPrice price) {
            this.price = price;
            return this;
        }
        public GetResourcePriceResponseBodyPriceModelPrice getPrice() {
            return this.price;
        }

        public GetResourcePriceResponseBodyPriceModel setRules(java.util.List<GetResourcePriceResponseBodyPriceModelRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetResourcePriceResponseBodyPriceModelRules> getRules() {
            return this.rules;
        }

    }

}
