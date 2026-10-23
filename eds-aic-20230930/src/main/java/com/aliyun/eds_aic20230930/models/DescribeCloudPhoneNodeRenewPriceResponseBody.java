// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodeRenewPriceResponseBody extends TeaModel {
    @NameInMap("Price")
    public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice price;

    /**
     * <strong>example:</strong>
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyRules> rules;

    public static DescribeCloudPhoneNodeRenewPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodeRenewPriceResponseBody self = new DescribeCloudPhoneNodeRenewPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodeRenewPriceResponseBody setPrice(DescribeCloudPhoneNodeRenewPriceResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeCloudPhoneNodeRenewPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudPhoneNodeRenewPriceResponseBody setRules(java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>878.15</p>
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
         * <p>1090</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <strong>example:</strong>
         * <p>73.87</p>
         */
        @NameInMap("TradePrice")
        public String tradePrice;

        public static DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice self = new DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>274.75</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>cpn-9rz9ou1l0wq30****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModulePrice")
        public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice> modulePrice;

        /**
         * <strong>example:</strong>
         * <p>2087.0</p>
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
         * <p>1099.0</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail self = new DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail setModulePrice(java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice> modulePrice) {
            this.modulePrice = modulePrice;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetailModulePrice> getModulePrice() {
            return this.modulePrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>youhui_quan</p>
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
         * <p>91381816****</p>
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

        public static DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions self = new DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeCloudPhoneNodeRenewPriceResponseBodyPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>274.75</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1860</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("PriceDetail")
        public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail> priceDetail;

        @NameInMap("Promotions")
        public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions> promotions;

        /**
         * <strong>example:</strong>
         * <p>769.3</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeCloudPhoneNodeRenewPriceResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodeRenewPriceResponseBodyPrice self = new DescribeCloudPhoneNodeRenewPriceResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice setPriceDetail(java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail> priceDetail) {
            this.priceDetail = priceDetail;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePriceDetail> getPriceDetail() {
            return this.priceDetail;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice setPromotions(java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodeRenewPriceResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCloudPhoneNodeRenewPriceResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>满40减20</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2023110611****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeCloudPhoneNodeRenewPriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodeRenewPriceResponseBodyRules self = new DescribeCloudPhoneNodeRenewPriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudPhoneNodeRenewPriceResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
