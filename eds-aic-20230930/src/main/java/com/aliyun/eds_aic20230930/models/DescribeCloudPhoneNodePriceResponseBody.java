// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodePriceResponseBody extends TeaModel {
    @NameInMap("Price")
    public DescribeCloudPhoneNodePriceResponseBodyPrice price;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeCloudPhoneNodePriceResponseBodyRules> rules;

    public static DescribeCloudPhoneNodePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodePriceResponseBody self = new DescribeCloudPhoneNodePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodePriceResponseBody setPrice(DescribeCloudPhoneNodePriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeCloudPhoneNodePriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeCloudPhoneNodePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudPhoneNodePriceResponseBody setRules(java.util.List<DescribeCloudPhoneNodePriceResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeCloudPhoneNodePriceResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1978.2</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <strong>example:</strong>
         * <p>PhoneData</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>8990</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <strong>example:</strong>
         * <p>1666.0</p>
         */
        @NameInMap("TradePrice")
        public String tradePrice;

        public static DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice self = new DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1978.2</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("ModulePrice")
        public java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice> modulePrice;

        /**
         * <strong>example:</strong>
         * <p>4199</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <strong>example:</strong>
         * <p>CloudPhoneMatrix</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>892.0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail self = new DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail setModulePrice(java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice> modulePrice) {
            this.modulePrice = modulePrice;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePriceDetailModulePrice> getModulePrice() {
            return this.modulePrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCloudPhoneNodePriceResponseBodyPricePromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>82842468****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("selected")
        public Boolean selected;

        public static DescribeCloudPhoneNodePriceResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodePriceResponseBodyPricePromotions self = new DescribeCloudPhoneNodePriceResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeCloudPhoneNodePriceResponseBodyPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>878.15</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>2710</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("PriceDetail")
        public java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail> priceDetail;

        @NameInMap("Promotions")
        public java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePromotions> promotions;

        /**
         * <strong>example:</strong>
         * <p>99.0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeCloudPhoneNodePriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodePriceResponseBodyPrice self = new DescribeCloudPhoneNodePriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodePriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPrice setPriceDetail(java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail> priceDetail) {
            this.priceDetail = priceDetail;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePriceDetail> getPriceDetail() {
            return this.priceDetail;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPrice setPromotions(java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodePriceResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeCloudPhoneNodePriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCloudPhoneNodePriceResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>t1uf7xt141ut5i****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeCloudPhoneNodePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodePriceResponseBodyRules self = new DescribeCloudPhoneNodePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodePriceResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudPhoneNodePriceResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
