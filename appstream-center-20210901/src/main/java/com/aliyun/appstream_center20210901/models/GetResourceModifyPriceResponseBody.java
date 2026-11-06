// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceModifyPriceResponseBody extends TeaModel {
    /**
     * <p>The quote for the resource scale-out of the delivery group, which includes the price details and pricing rules.</p>
     */
    @NameInMap("Data")
    public GetResourceModifyPriceResponseBodyData data;

    /**
     * <p>The unique ID of the request, which is used to locate and troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceModifyPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceModifyPriceResponseBody self = new GetResourceModifyPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceModifyPriceResponseBody setData(GetResourceModifyPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceModifyPriceResponseBodyData getData() {
        return this.data;
    }

    public GetResourceModifyPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceModifyPriceResponseBodyDataPricePromotions extends TeaModel {
        /**
         * <p>The option code of the coupon, which identifies the coupon returned in the quote together with PromotionId.</p>
         * 
         * <strong>example:</strong>
         * <p>coupon****</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The description of the coupon, which is used to display information about the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>**Discount during the promotion</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The ID of the coupon, which is used to identify the coupon returned in the quote.</p>
         * 
         * <strong>example:</strong>
         * <p>17440009****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The name of the coupon, which is used to display the available discount in the quote.</p>
         * 
         * <strong>example:</strong>
         * <p>**Discount</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Specifies whether the coupon is selected in the quote. Valid values:</p>
         * <ul>
         * <li>true: Selected. The coupon is applied in the quote.</li>
         * <li>false: Not selected. The coupon is not applied in the quote.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static GetResourceModifyPriceResponseBodyDataPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            GetResourceModifyPriceResponseBodyDataPricePromotions self = new GetResourceModifyPriceResponseBodyDataPricePromotions();
            return TeaModel.build(map, self);
        }

        public GetResourceModifyPriceResponseBodyDataPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public GetResourceModifyPriceResponseBodyDataPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetResourceModifyPriceResponseBodyDataPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public GetResourceModifyPriceResponseBodyDataPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetResourceModifyPriceResponseBodyDataPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class GetResourceModifyPriceResponseBodyDataPrice extends TeaModel {
        /**
         * <p>The currency code of the price amount. CNY indicates Chinese Yuan. Use this field to interpret the amounts in OriginalPrice, DiscountPrice, and TradePrice.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discount amount for the scale-out, not the discount percentage.</p>
         * <p>The final price TradePrice is obtained by subtracting this value from the original price OriginalPrice. For the currency, see Currency.</p>
         * 
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("DiscountPrice")
        public Double discountPrice;

        /**
         * <p>The original price of the scale-out, which is the amount before discounts. For the currency, see Currency.</p>
         * 
         * <strong>example:</strong>
         * <p>11.00</p>
         */
        @NameInMap("OriginalPrice")
        public Double originalPrice;

        /**
         * <p>The list of available coupons returned in the quote. Each item includes the coupon ID, name, description, and selection status.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<GetResourceModifyPriceResponseBodyDataPricePromotions> promotions;

        /**
         * <p>The final price of the scale-out after discounts.</p>
         * <p>Calculation formula: TradePrice = OriginalPrice - DiscountPrice. For the currency, see Currency. This operation returns only a quote and does not execute payment.</p>
         * 
         * <strong>example:</strong>
         * <p>10.00</p>
         */
        @NameInMap("TradePrice")
        public Double tradePrice;

        public static GetResourceModifyPriceResponseBodyDataPrice build(java.util.Map<String, ?> map) throws Exception {
            GetResourceModifyPriceResponseBodyDataPrice self = new GetResourceModifyPriceResponseBodyDataPrice();
            return TeaModel.build(map, self);
        }

        public GetResourceModifyPriceResponseBodyDataPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetResourceModifyPriceResponseBodyDataPrice setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public GetResourceModifyPriceResponseBodyDataPrice setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public GetResourceModifyPriceResponseBodyDataPrice setPromotions(java.util.List<GetResourceModifyPriceResponseBodyDataPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<GetResourceModifyPriceResponseBodyDataPricePromotions> getPromotions() {
            return this.promotions;
        }

        public GetResourceModifyPriceResponseBodyDataPrice setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class GetResourceModifyPriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>The description of the pricing rule, such as the user discount applicable to the quote.</p>
         * 
         * <strong>example:</strong>
         * <p>User discount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the pricing rule, which is used to identify the rule applied in the quote.</p>
         * 
         * <strong>example:</strong>
         * <p>102002100393****</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static GetResourceModifyPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            GetResourceModifyPriceResponseBodyDataRules self = new GetResourceModifyPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public GetResourceModifyPriceResponseBodyDataRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceModifyPriceResponseBodyDataRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetResourceModifyPriceResponseBodyData extends TeaModel {
        /**
         * <p>The price details of the scale-out. For the currency, see Currency. For the coupon selection status, see Promotions.</p>
         */
        @NameInMap("Price")
        public GetResourceModifyPriceResponseBodyDataPrice price;

        /**
         * <p>The list of pricing rules for the quote, which describes the applicable pricing or discount rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<GetResourceModifyPriceResponseBodyDataRules> rules;

        public static GetResourceModifyPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceModifyPriceResponseBodyData self = new GetResourceModifyPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceModifyPriceResponseBodyData setPrice(GetResourceModifyPriceResponseBodyDataPrice price) {
            this.price = price;
            return this;
        }
        public GetResourceModifyPriceResponseBodyDataPrice getPrice() {
            return this.price;
        }

        public GetResourceModifyPriceResponseBodyData setRules(java.util.List<GetResourceModifyPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetResourceModifyPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

    }

}
