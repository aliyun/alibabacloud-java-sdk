// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceResponseBody extends TeaModel {
    /**
     * <p>The price information, including the price and promotion rules.</p>
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
     * <p>Indicates whether the request was successful.</p>
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
         */
        @NameInMap("CheapRate")
        public String cheapRate;

        /**
         * <p>The standard total price after the price reduction.</p>
         */
        @NameInMap("CheapStandAmount")
        public String cheapStandAmount;

        /**
         * <p>Indicates whether to display the price reduction percentage.</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The monthly equivalent price.</p>
         */
        @NameInMap("MonthPrice")
        public String monthPrice;

        /**
         * <p>The original standard total price.</p>
         */
        @NameInMap("OriginalStandAmount")
        public String originalStandAmount;

        /**
         * <p>The start time of the price reduction.</p>
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

    public static class QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
        /**
         * <p>The coupon description.</p>
         * 
         * <strong>example:</strong>
         * <p>¥1,391.5 coupon (valid until 03/23/2022)</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The coupon name.</p>
         * 
         * <strong>example:</strong>
         * <p>¥1,391.5 coupon</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500011220010099</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        /**
         * <p>Indicates whether the coupon is selected. Valid values:</p>
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
         * <p>The promotion rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Get a 15% discount for a 1-year subscription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The promotion ID.</p>
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
         * <p>Indicates whether the enterprise customer discount is applied.</p>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>The Lingxiao request ID of the call.</p>
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
         * <p>An unpaid order exists. Pay for or cancel the existing order first</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The coupon group information.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        /**
         * <p>The original price.</p>
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
         * <p>The promotional price based on the official website discount.</p>
         */
        @NameInMap("StandDiscountPrice")
        public String standDiscountPrice;

        /**
         * <p>The official website discounted price or direct sales contract discounted price.</p>
         */
        @NameInMap("StandPrice")
        public String standPrice;

        /**
         * <p>The final price, which is the original price minus the discount.</p>
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
