// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceForRenewResponseBody extends TeaModel {
    @NameInMap("Price")
    public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice price;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyRules> rules;

    public static DescribeMobileAgentPackagePriceForRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackagePriceForRenewResponseBody self = new DescribeMobileAgentPackagePriceForRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackagePriceForRenewResponseBody setPrice(DescribeMobileAgentPackagePriceForRenewResponseBodyPrice price) {
        this.price = price;
        return this;
    }
    public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice getPrice() {
        return this.price;
    }

    public DescribeMobileAgentPackagePriceForRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMobileAgentPackagePriceForRenewResponseBody setRules(java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>629.7</p>
         */
        @NameInMap("DiscountPrice")
        public String discountPrice;

        /**
         * <strong>example:</strong>
         * <p>高级版</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>1680</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <strong>example:</strong>
         * <p>94.85</p>
         */
        @NameInMap("TradePrice")
        public String tradePrice;

        public static DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice self = new DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice setTradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public String getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>cmag-shdbcudbaib****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModulePrice")
        public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice> modulePrice;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <strong>example:</strong>
         * <p>CloudPhoneMobileAgent</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail self = new DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail setModulePrice(java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice> modulePrice) {
            this.modulePrice = modulePrice;
            return this;
        }
        public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetailModulePrice> getModulePrice() {
            return this.modulePrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions extends TeaModel {
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
        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions self = new DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeMobileAgentPackagePriceForRenewResponseBodyPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("PriceDetail")
        public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail> priceDetail;

        @NameInMap("Promotions")
        public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions> promotions;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeMobileAgentPackagePriceForRenewResponseBodyPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceForRenewResponseBodyPrice self = new DescribeMobileAgentPackagePriceForRenewResponseBodyPrice();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice setPriceDetail(java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail> priceDetail) {
            this.priceDetail = priceDetail;
            return this;
        }
        public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePriceDetail> getPriceDetail() {
            return this.priceDetail;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice setPromotions(java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions> promotions) {
            this.promotions = promotions;
            return this;
        }
        public java.util.List<DescribeMobileAgentPackagePriceForRenewResponseBodyPricePromotions> getPromotions() {
            return this.promotions;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeMobileAgentPackagePriceForRenewResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>日常优惠</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>20230629****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeMobileAgentPackagePriceForRenewResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackagePriceForRenewResponseBodyRules self = new DescribeMobileAgentPackagePriceForRenewResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMobileAgentPackagePriceForRenewResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
