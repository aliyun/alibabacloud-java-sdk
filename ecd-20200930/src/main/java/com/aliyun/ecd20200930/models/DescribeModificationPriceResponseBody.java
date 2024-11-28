// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribeModificationPriceResponseBodyPriceInfo priceInfo;

    /**
     * <strong>example:</strong>
     * <p>48174475-5EB2-5F99-A9E9-6F892D645****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModificationPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModificationPriceResponseBody self = new DescribeModificationPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModificationPriceResponseBody setPriceInfo(DescribeModificationPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeModificationPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeModificationPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModificationPriceResponseBodyPriceInfoPricePromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>promo_option</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeModificationPriceResponseBodyPriceInfoPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponseBodyPriceInfoPricePromotions self = new DescribeModificationPriceResponseBodyPriceInfoPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponseBodyPriceInfoPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeModificationPriceResponseBodyPriceInfoPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>15.8</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OrderLines")
        public java.util.Map<String, String> orderLines;

        /**
         * <strong>example:</strong>
         * <p>79.0</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Promotions")
        public java.util.List<DescribeModificationPriceResponseBodyPriceInfoPricePromotions> promotions;

        /**
         * <strong>example:</strong>
         * <p>63.2</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeModificationPriceResponseBodyPriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponseBodyPriceInfoPrice self = new DescribeModificationPriceResponseBodyPriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponseBodyPriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPrice setOrderLines(java.util.Map<String, String> orderLines) {
            this.orderLines = orderLines;
            return this;
        }
        public java.util.Map<String, String> getOrderLines() {
            return this.orderLines;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPrice setPromotions(java.util.List<DescribeModificationPriceResponseBodyPriceInfoPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeModificationPriceResponseBodyPriceInfoPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeModificationPriceResponseBodyPriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeModificationPriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>14806</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeModificationPriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponseBodyPriceInfoRules self = new DescribeModificationPriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeModificationPriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeModificationPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Price")
        public DescribeModificationPriceResponseBodyPriceInfoPrice price;

        @NameInMap("Rules")
        public java.util.List<DescribeModificationPriceResponseBodyPriceInfoRules> rules;

        public static DescribeModificationPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceResponseBodyPriceInfo self = new DescribeModificationPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceResponseBodyPriceInfo setPrice(DescribeModificationPriceResponseBodyPriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribeModificationPriceResponseBodyPriceInfoPrice getPrice() {
            return this.price;
        }

        public DescribeModificationPriceResponseBodyPriceInfo setRules(java.util.List<DescribeModificationPriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeModificationPriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

    }

}
