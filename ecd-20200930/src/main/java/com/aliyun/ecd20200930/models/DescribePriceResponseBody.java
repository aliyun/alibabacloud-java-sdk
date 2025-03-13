// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <p>The price details.</p>
     */
    @NameInMap("PriceInfo")
    public DescribePriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B1175630-3C44-4389-A3C1-15639FFC8EBC</p>
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

    public static class DescribePriceResponseBodyPriceInfoPricePromotions extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The description of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>Get started with new services with a discount.</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The promotion name.</p>
         * 
         * <strong>example:</strong>
         * <p>Special Offer</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Indicates whether an item is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribePriceResponseBodyPriceInfoPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoPricePromotions self = new DescribePriceResponseBodyPriceInfoPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodyPriceInfoPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribePriceResponseBodyPriceInfoPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribePriceResponseBodyPriceInfoPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribePriceResponseBodyPriceInfoPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoPrice extends TeaModel {
        /**
         * <p>The unit of currency (USD).</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The discounted amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <p>The orders.</p>
         */
        @NameInMap("OrderLines")
        public java.util.Map<String, String> orderLines;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>2.796</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The promotions.</p>
         */
        @NameInMap("Promotions")
        public java.util.List<DescribePriceResponseBodyPriceInfoPricePromotions> promotions;

        /**
         * <p>The price under an effective savings plan.</p>
         * 
         * <strong>example:</strong>
         * <p>50.00</p>
         */
        @NameInMap("SpPrice")
        public Long spPrice;

        /**
         * <p>The actual price. The original price minus the discounted amount equals the actual price.</p>
         * 
         * <strong>example:</strong>
         * <p>2.796</p>
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

        public DescribePriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setOrderLines(java.util.Map<String, String> orderLines) {
            this.orderLines = orderLines;
            return this;
        }
        public java.util.Map<String, String> getOrderLines() {
            return this.orderLines;
        }

        public DescribePriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setPromotions(java.util.List<DescribePriceResponseBodyPriceInfoPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribePriceResponseBodyPriceInfoPrice setSpPrice(Long spPrice) {
            this.spPrice = spPrice;
            return this;
        }
        public Long getSpPrice() {
            return this.spPrice;
        }

        public DescribePriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRules extends TeaModel {
        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Receive a 15% discount on a one-year subscription.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>587</p>
         */
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
        /**
         * <p>Indicates whether a free enterprise drive is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FreeCdsQuota")
        public Boolean freeCdsQuota;

        /**
         * <p>The free capacity provided by the enterprise drive. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FreeCdsSize")
        public Long freeCdsSize;

        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public DescribePriceResponseBodyPriceInfoPrice price;

        /**
         * <p>The details of the promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribePriceResponseBodyPriceInfoRules> rules;

        public static DescribePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfo self = new DescribePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfo setFreeCdsQuota(Boolean freeCdsQuota) {
            this.freeCdsQuota = freeCdsQuota;
            return this;
        }
        public Boolean getFreeCdsQuota() {
            return this.freeCdsQuota;
        }

        public DescribePriceResponseBodyPriceInfo setFreeCdsSize(Long freeCdsSize) {
            this.freeCdsSize = freeCdsSize;
            return this;
        }
        public Long getFreeCdsSize() {
            return this.freeCdsSize;
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
