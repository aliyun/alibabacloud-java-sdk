// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryConvertInstancePriceResponseBody extends TeaModel {
    /**
     * <p>The price information, including the price and discount rules.</p>
     */
    @NameInMap("PriceInfo")
    public QueryConvertInstancePriceResponseBodyPriceInfo priceInfo;

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
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryConvertInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertInstancePriceResponseBody self = new QueryConvertInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConvertInstancePriceResponseBody setPriceInfo(QueryConvertInstancePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public QueryConvertInstancePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public QueryConvertInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConvertInstancePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>34%</p>
         */
        @NameInMap("CheapRate")
        public String cheapRate;

        /**
         * <p>The standard total price after the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("CheapStandAmount")
        public String cheapStandAmount;

        /**
         * <p>Indicates whether to display the price reduction percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The original standard total price.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("OriginalStandAmount")
        public String originalStandAmount;

        /**
         * <p>The start time of the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-21T02:06:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo self = new QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapRate(String cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public String getCheapRate() {
            return this.cheapRate;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapStandAmount(String cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public String getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo setMonthPrice(String monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public String getMonthPrice() {
            return this.monthPrice;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo setOriginalStandAmount(String originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public String getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
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
         * <p>The coupon number.</p>
         * 
         * <strong>example:</strong>
         * <p>500011220010099</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        /**
         * <p>Indicates whether the coupon is selected. Valid values:</p>
         * <ul>
         * <li><p>true: Selected.</p>
         * </li>
         * <li><p>false: Not selected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions self = new QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class QueryConvertInstancePriceResponseBodyPriceInfoRules extends TeaModel {
        /**
         * <p>The description of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Purchase for 1 year or more and enjoy a 15% discount off the official price</p>
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

        public static QueryConvertInstancePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceResponseBodyPriceInfoRules self = new QueryConvertInstancePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryConvertInstancePriceResponseBodyPriceInfo extends TeaModel {
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
        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>655.2</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>Indicates whether the enterprise discount is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>An unpaid order exists. Pay or cancel the existing order first</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The coupon information.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

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
        public java.util.List<QueryConvertInstancePriceResponseBodyPriceInfoRules> rules;

        /**
         * <p>The discounted price based on the official website discount.</p>
         * 
         * <strong>example:</strong>
         * <p>21321</p>
         */
        @NameInMap("StandDiscountPrice")
        public String standDiscountPrice;

        /**
         * <p>The official website discounted price or direct sales contract discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>32432</p>
         */
        @NameInMap("StandPrice")
        public String standPrice;

        /**
         * <p>The final price, which is the original price minus the discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>3712.8</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryConvertInstancePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertInstancePriceResponseBodyPriceInfo self = new QueryConvertInstancePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setDepreciateInfo(QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryConvertInstancePriceResponseBodyPriceInfoDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setLxRequestId(String lxRequestId) {
            this.lxRequestId = lxRequestId;
            return this;
        }
        public String getLxRequestId() {
            return this.lxRequestId;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setOptionalPromotions(java.util.List<QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryConvertInstancePriceResponseBodyPriceInfoOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setRules(java.util.List<QueryConvertInstancePriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryConvertInstancePriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setStandDiscountPrice(String standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public String getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryConvertInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
