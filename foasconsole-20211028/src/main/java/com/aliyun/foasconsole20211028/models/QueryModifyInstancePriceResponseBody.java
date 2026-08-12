// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryModifyInstancePriceResponseBody extends TeaModel {
    /**
     * <p>The price information, including the price and discount rules.</p>
     */
    @NameInMap("PriceInfo")
    public QueryModifyInstancePriceResponseBodyPriceInfo priceInfo;

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

    public static QueryModifyInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyInstancePriceResponseBody self = new QueryModifyInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifyInstancePriceResponseBody setPriceInfo(QueryModifyInstancePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public QueryModifyInstancePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public QueryModifyInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifyInstancePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CheapRate")
        public String cheapRate;

        /**
         * <p>The reduced list price total.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
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
         * <p>0.6</p>
         */
        @NameInMap("MonthPrice")
        public String monthPrice;

        /**
         * <p>The original list price total.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("OriginalStandAmount")
        public String originalStandAmount;

        /**
         * <p>The price reduction start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-04T21:10:26+08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo self = new QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapRate(String cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public String getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapStandAmount(String cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public String getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo setMonthPrice(String monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public String getMonthPrice() {
            return this.monthPrice;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo setOriginalStandAmount(String originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public String getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
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

        public static QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions self = new QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class QueryModifyInstancePriceResponseBodyPriceInfoRules extends TeaModel {
        /**
         * <p>The promotion rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Purchase for 1 year or more to enjoy a 15% discount off the list price</p>
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

        public static QueryModifyInstancePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceResponseBodyPriceInfoRules self = new QueryModifyInstancePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryModifyInstancePriceResponseBodyPriceInfo extends TeaModel {
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
        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo;

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
         * <p>Yes</p>
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
         * <p>An unpaid order exists. Pay for or cancel the existing order first</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The coupon group information.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>4368</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The promotion rule group.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoRules> rules;

        /**
         * <p>The discounted price based on the official website discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("StandDiscountPrice")
        public String standDiscountPrice;

        /**
         * <p>The official website discount price or direct sales contract discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
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

        public static QueryModifyInstancePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyInstancePriceResponseBodyPriceInfo self = new QueryModifyInstancePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setDepreciateInfo(QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifyInstancePriceResponseBodyPriceInfoDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setLxRequestId(String lxRequestId) {
            this.lxRequestId = lxRequestId;
            return this;
        }
        public String getLxRequestId() {
            return this.lxRequestId;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setOptionalPromotions(java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setRules(java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setStandDiscountPrice(String standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public String getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
