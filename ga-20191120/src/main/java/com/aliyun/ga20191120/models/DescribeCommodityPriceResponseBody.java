// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityPriceResponseBody extends TeaModel {
    /**
     * <p>The currency unit.</p>
     * <ul>
     * <li>China site: <strong>CNY</strong>.</li>
     * <li>International site: <strong>USD</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>The discount.</p>
     * 
     * <strong>example:</strong>
     * <p>419.8</p>
     */
    @NameInMap("DiscountPrice")
    public Double discountPrice;

    /**
     * <p>The details of the commodity module.</p>
     */
    @NameInMap("OrderDetails")
    public java.util.List<DescribeCommodityPriceResponseBodyOrderDetails> orderDetails;

    /**
     * <p>The original price.</p>
     * 
     * <strong>example:</strong>
     * <p>2099</p>
     */
    @NameInMap("OriginalPrice")
    public Double originalPrice;

    /**
     * <p>The details of the coupon.</p>
     * <blockquote>
     * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
     * </blockquote>
     */
    @NameInMap("Promotions")
    public java.util.List<DescribeCommodityPriceResponseBodyPromotions> promotions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the discount rules.</p>
     */
    @NameInMap("RuleDetails")
    public java.util.List<DescribeCommodityPriceResponseBodyRuleDetails> ruleDetails;

    /**
     * <p>The transaction price, which is equal to the original price minus the discount.</p>
     * 
     * <strong>example:</strong>
     * <p>1679.2</p>
     */
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
        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>40000.0</p>
         */
        @NameInMap("DiscountPrice")
        public Double discountPrice;

        /**
         * <p>The code of the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>spec</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The name of the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>Specification</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>200000.0</p>
         */
        @NameInMap("OriginalPrice")
        public Double originalPrice;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>160000.0</p>
         */
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
        /**
         * <p>The discounted price.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        /**
         * <p>The code of the discount option.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>youhui_quan</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The sub-type of the discount.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deduct</p>
         */
        @NameInMap("PromType")
        public String promType;

        /**
         * <p>The ID of the discount item.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50003298014****</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The name of the discount item.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>coupon</p>
         */
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
        /**
         * <p>The code of the commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>ga_gapluspre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The name of the commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>Global Accelerator_Instance Type (Subscription)</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>419.8</p>
         */
        @NameInMap("DiscountPrice")
        public Double discountPrice;

        /**
         * <p>The information about the commodity module.</p>
         */
        @NameInMap("ModuleDetails")
        public java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsModuleDetails> moduleDetails;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>2099</p>
         */
        @NameInMap("OriginalPrice")
        public Double originalPrice;

        /**
         * <p>The details of the discount.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         */
        @NameInMap("PromDetails")
        public java.util.List<DescribeCommodityPriceResponseBodyOrderDetailsPromDetails> promDetails;

        /**
         * <p>The number of instances that are purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <p>The IDs of discount rules.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<Long> ruleIds;

        /**
         * <p>The transaction price, which is equal to the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1679.2</p>
         */
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
        /**
         * <p>The discounted amount.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanPromFee")
        public Double canPromFee;

        /**
         * <p>The code of the commodity to which the coupon can be applied.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>youhui_quan</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The name of the coupon.</p>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The code of the coupon.</p>
         * <blockquote>
         * <ul>
         * <li><code>youhuiquan_promotion_option_id_for_blank</code> indicates coupons that cannot be applied to the commodity.</li>
         * <li>This parameter does not take effect for accounts registered on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50003298014****</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        /**
         * <p>Indicates whether the coupon was selected.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter does not take effect for accounts registered on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>The ID of the discount rule.</p>
         * 
         * <strong>example:</strong>
         * <p>102104100786****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the discount rule.</p>
         * 
         * <strong>example:</strong>
         * <p>GA New Customers Small II Specification Monthly Subscription - 20% Discount</p>
         */
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
