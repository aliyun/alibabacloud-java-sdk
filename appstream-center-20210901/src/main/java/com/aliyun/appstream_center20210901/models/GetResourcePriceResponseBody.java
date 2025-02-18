// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourcePriceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.ProductType</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter ProductType is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The price objects.</p>
     * <p>This parameter is returned only if a value is specified for AppInstanceType.</p>
     */
    @NameInMap("PriceList")
    public java.util.List<GetResourcePriceResponseBodyPriceList> priceList;

    /**
     * <p>The price object.</p>
     * <p>This parameter is returned only if a value is specified for NodeInstanceType.</p>
     */
    @NameInMap("PriceModel")
    public GetResourcePriceResponseBodyPriceModel priceModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
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
        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>coupon****</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The coupon description.</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1847709****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The coupon name.</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Indicates whether the coupon was used.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The currency type.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
         * 
         * <strong>example:</strong>
         * <p>999.0</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>6700</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <p>The coupon metadata.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<GetResourcePriceResponseBodyPriceListPricePromotions> promotions;

        /**
         * <p>The actual price. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
         * 
         * <strong>example:</strong>
         * <p>5278.0</p>
         */
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
        /**
         * <p>The description of the price calculation rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the price calculation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>260904273633****</p>
         */
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
        /**
         * <p>The price details.</p>
         */
        @NameInMap("Price")
        public GetResourcePriceResponseBodyPriceListPrice price;

        /**
         * <p>The price type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Connected: in use</li>
         * <li>Standby: pending for use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standby</p>
         */
        @NameInMap("PriceType")
        public String priceType;

        /**
         * <p>The price calculation rules.</p>
         */
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
        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>coupon****</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The coupon description.</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17440009****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The coupon name.</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Indicates whether the coupon was used.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The currency type.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>11.00</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <p>The coupon metadata.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<GetResourcePriceResponseBodyPriceModelPricePromotions> promotions;

        /**
         * <p>The actual price. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
         * 
         * <strong>example:</strong>
         * <p>10.00</p>
         */
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
        /**
         * <p>The description of the price calculation rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the price calculation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>102002100393****</p>
         */
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
        /**
         * <p>The price details.</p>
         */
        @NameInMap("Price")
        public GetResourcePriceResponseBodyPriceModelPrice price;

        /**
         * <p>The price calculation rules.</p>
         */
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
