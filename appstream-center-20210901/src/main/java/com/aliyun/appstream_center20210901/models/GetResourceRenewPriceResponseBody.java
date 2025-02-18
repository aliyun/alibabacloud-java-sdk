// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceRenewPriceResponseBody extends TeaModel {
    /**
     * <p>The price object.</p>
     */
    @NameInMap("Data")
    public GetResourceRenewPriceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
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
         * <p>139965*****</p>
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
         * <p>1</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <p>The coupon description.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<GetResourceRenewPriceResponseBodyDataPricePromotions> promotions;

        /**
         * <p>The actual price. The actual price is calculated based on the following formula: Actual price = Original price - Discount.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The description of the price calculation rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the price calculation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20002****</p>
         */
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
        /**
         * <p>The price details.</p>
         */
        @NameInMap("Price")
        public GetResourceRenewPriceResponseBodyDataPrice price;

        /**
         * <p>The price calculation rules.</p>
         */
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
