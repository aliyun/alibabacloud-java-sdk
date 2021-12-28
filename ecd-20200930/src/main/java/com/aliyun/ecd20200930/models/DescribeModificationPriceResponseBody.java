// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribeModificationPriceResponseBodyPriceInfo priceInfo;

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
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Promotions")
        public java.util.List<DescribeModificationPriceResponseBodyPriceInfoPricePromotions> promotions;

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
