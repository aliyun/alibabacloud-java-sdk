// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceResponseBody extends TeaModel {
    /**
     * <p>The price information, including the price and discount rules.</p>
     */
    @NameInMap("PriceInfo")
    public QueryCreateInstancePriceResponseBodyPriceInfo priceInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCreateInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateInstancePriceResponseBody self = new QueryCreateInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCreateInstancePriceResponseBody setPriceInfo(QueryCreateInstancePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public QueryCreateInstancePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public QueryCreateInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCreateInstancePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction rate.</p>
         * 
         * <strong>example:</strong>
         * <p>34%</p>
         */
        @NameInMap("CheapRate")
        public String cheapRate;

        /**
         * <p>The total price on the official website after the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("CheapStandAmount")
        public String cheapStandAmount;

        /**
         * <p>Indicates whether to display the price reduction rate.</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The equivalent monthly price.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MonthPrice")
        public String monthPrice;

        /**
         * <p>The original total price on the official website.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("OriginalStandAmount")
        public String originalStandAmount;

        /**
         * <p>The start time of the price reduction, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-21T02:06:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo self = new QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapRate(String cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public String getCheapRate() {
            return this.cheapRate;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapStandAmount(String cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public String getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo setMonthPrice(String monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public String getMonthPrice() {
            return this.monthPrice;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo setOriginalStandAmount(String originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public String getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryCreateInstancePriceResponseBodyPriceInfoModulePrices extends TeaModel {
        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>648.0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The unit price of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>183600.0000</p>
         */
        @NameInMap("FinalUnitFee")
        public String finalUnitFee;

        /**
         * <p>The module code.</p>
         * 
         * <strong>example:</strong>
         * <p>overhead_cu</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <p>Control and Management Services</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The original amount.</p>
         * 
         * <strong>example:</strong>
         * <p>4320.0</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The payment amount.</p>
         * 
         * <strong>example:</strong>
         * <p>3672.0</p>
         */
        @NameInMap("PayAmount")
        public Float payAmount;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>yearPrice</p>
         */
        @NameInMap("PriceType")
        public String priceType;

        /**
         * <p>The pricing unit.</p>
         * 
         * <strong>example:</strong>
         * <p>Yuan/CU</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>The order quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        public static QueryCreateInstancePriceResponseBodyPriceInfoModulePrices build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceResponseBodyPriceInfoModulePrices self = new QueryCreateInstancePriceResponseBodyPriceInfoModulePrices();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setFinalUnitFee(String finalUnitFee) {
            this.finalUnitFee = finalUnitFee;
            return this;
        }
        public String getFinalUnitFee() {
            return this.finalUnitFee;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setPayAmount(Float payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Float getPayAmount() {
            return this.payAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoModulePrices setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
        /**
         * <p>The description of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>¥1,391.5 coupon (valid until 03/23/2022)</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The name of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>¥1,391.5 coupon</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The ID of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>500011220010099</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        /**
         * <p>Specifies whether the coupon is selected. Valid values:</p>
         * <ul>
         * <li>true: Selected.</li>
         * <li>false: Not selected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions self = new QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class QueryCreateInstancePriceResponseBodyPriceInfoRules extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Enjoy a 15% discount on the official website price for a 1-year subscription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>587</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static QueryCreateInstancePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceResponseBodyPriceInfoRules self = new QueryCreateInstancePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryCreateInstancePriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ORDER.INST_HAS_UNPAID_ORDER</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The price reduction information.</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>655.2</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>Indicates whether the key account promotion is applied.</p>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>The Lingxiao request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
         */
        @NameInMap("LxRequestId")
        public String lxRequestId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Unpaid orders exist. Pay for or cancel the existing orders first</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The module prices.</p>
         */
        @NameInMap("ModulePrices")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoModulePrices> modulePrices;

        /**
         * <p>The coupon group information.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        /**
         * <p>The original amount.</p>
         * 
         * <strong>example:</strong>
         * <p>4368</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoRules> rules;

        /**
         * <p>The discounted price based on the official website discount.</p>
         * 
         * <strong>example:</strong>
         * <p>21321</p>
         */
        @NameInMap("StandDiscountPrice")
        public String standDiscountPrice;

        /**
         * <p>The discounted price on the official website or the discounted price in the direct sales contract.</p>
         * 
         * <strong>example:</strong>
         * <p>32432</p>
         */
        @NameInMap("StandPrice")
        public String standPrice;

        /**
         * <p>The final amount, which is the original amount minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>3712.8</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryCreateInstancePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCreateInstancePriceResponseBodyPriceInfo self = new QueryCreateInstancePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setDepreciateInfo(QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setLxRequestId(String lxRequestId) {
            this.lxRequestId = lxRequestId;
            return this;
        }
        public String getLxRequestId() {
            return this.lxRequestId;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setModulePrices(java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoModulePrices> modulePrices) {
            this.modulePrices = modulePrices;
            return this;
        }
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoModulePrices> getModulePrices() {
            return this.modulePrices;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setOptionalPromotions(java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setRules(java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setStandDiscountPrice(String standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public String getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryCreateInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
