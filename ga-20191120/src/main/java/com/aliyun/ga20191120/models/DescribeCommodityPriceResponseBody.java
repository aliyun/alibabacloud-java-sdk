// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityPriceResponseBody extends TeaModel {
    @NameInMap("Currency")
    public String currency;

    @NameInMap("DiscountPrice")
    public Double discountPrice;

    @NameInMap("OrderDetails")
    public java.util.List<DescribeCommodityPriceResponseBodyOrderDetails> orderDetails;

    @NameInMap("OriginalPrice")
    public Double originalPrice;

    @NameInMap("Promotions")
    public java.util.List<DescribeCommodityPriceResponseBodyPromotions> promotions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleDetails")
    public java.util.List<DescribeCommodityPriceResponseBodyRuleDetails> ruleDetails;

    @NameInMap("TradePrice")
    public Double tradePrice;

    public static DescribeCommodityPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityPriceResponseBody self = new DescribeCommodityPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribeCommodityPriceResponseBody setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Double getDiscountPrice() {
        return this.discountPrice;
    }

    public DescribeCommodityPriceResponseBody setOrderDetails(java.util.List<DescribeCommodityPriceResponseBodyOrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public java.util.List<DescribeCommodityPriceResponseBodyOrderDetails> getOrderDetails() {
        return this.orderDetails;
    }

    public DescribeCommodityPriceResponseBody setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    public DescribeCommodityPriceResponseBody setPromotions(java.util.List<DescribeCommodityPriceResponseBodyPromotions> promotions) {
        this.promotions = promotions;
        return this;
    }
    public java.util.List<DescribeCommodityPriceResponseBodyPromotions> getPromotions() {
        return this.promotions;
    }

    public DescribeCommodityPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommodityPriceResponseBody setRuleDetails(java.util.List<DescribeCommodityPriceResponseBodyRuleDetails> ruleDetails) {
        this.ruleDetails = ruleDetails;
        return this;
    }
    public java.util.List<DescribeCommodityPriceResponseBodyRuleDetails> getRuleDetails() {
        return this.ruleDetails;
    }

    public DescribeCommodityPriceResponseBody setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Double getTradePrice() {
        return this.tradePrice;
    }

    public static class DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails extends TeaModel {
        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails self = new DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCommodityPriceResponseBodyOrderDetailsPromDetails extends TeaModel {
        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromType")
        public String promType;

        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        public static DescribeCommodityPriceResponseBodyOrderDetailsPromDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceResponseBodyOrderDetailsPromDetails self = new DescribeCommodityPriceResponseBodyOrderDetailsPromDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsPromDetails setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsPromDetails setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsPromDetails setPromType(String promType) {
            this.promType = promType;
            return this;
        }
        public String getPromType() {
            return this.promType;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsPromDetails setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeCommodityPriceResponseBodyOrderDetailsPromDetails setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class DescribeCommodityPriceResponseBodyOrderDetails extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("ModuleDetails")
        public java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails> moduleDetails;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("PromDetails")
        public java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsPromDetails> promDetails;

        @NameInMap("Quantity")
        public Long quantity;

        @NameInMap("RuleIds")
        public java.util.List<Long> ruleIds;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static DescribeCommodityPriceResponseBodyOrderDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceResponseBodyOrderDetails self = new DescribeCommodityPriceResponseBodyOrderDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setModuleDetails(java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails> moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }
        public java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails> getModuleDetails() {
            return this.moduleDetails;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setPromDetails(java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsPromDetails> promDetails) {
            this.promDetails = promDetails;
            return this;
        }
        public java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsPromDetails> getPromDetails() {
            return this.promDetails;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setRuleIds(java.util.List<Long> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<Long> getRuleIds() {
            return this.ruleIds;
        }

        public DescribeCommodityPriceResponseBodyOrderDetails setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeCommodityPriceResponseBodyPromotions extends TeaModel {
        @NameInMap("CanPromFee")
        public Double canPromFee;

        @NameInMap("OptionCode")
        public String optionCode;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeCommodityPriceResponseBodyPromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceResponseBodyPromotions self = new DescribeCommodityPriceResponseBodyPromotions();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceResponseBodyPromotions setCanPromFee(Double canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public Double getCanPromFee() {
            return this.canPromFee;
        }

        public DescribeCommodityPriceResponseBodyPromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribeCommodityPriceResponseBodyPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribeCommodityPriceResponseBodyPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public DescribeCommodityPriceResponseBodyPromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class DescribeCommodityPriceResponseBodyRuleDetails extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeCommodityPriceResponseBodyRuleDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityPriceResponseBodyRuleDetails self = new DescribeCommodityPriceResponseBodyRuleDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityPriceResponseBodyRuleDetails setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeCommodityPriceResponseBodyRuleDetails setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
