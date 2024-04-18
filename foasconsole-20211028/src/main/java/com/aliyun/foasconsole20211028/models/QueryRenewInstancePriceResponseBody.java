// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryRenewInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public QueryRenewInstancePriceResponseBodyPriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRenewInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewInstancePriceResponseBody self = new QueryRenewInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRenewInstancePriceResponseBody setPriceInfo(QueryRenewInstancePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public QueryRenewInstancePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public QueryRenewInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRenewInstancePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo extends TeaModel {
        @NameInMap("CheapRate")
        public String cheapRate;

        @NameInMap("CheapStandAmount")
        public String cheapStandAmount;

        @NameInMap("IsShow")
        public Boolean isShow;

        @NameInMap("MonthPrice")
        public String monthPrice;

        @NameInMap("OriginalStandAmount")
        public String originalStandAmount;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo self = new QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapRate(String cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public String getCheapRate() {
            return this.cheapRate;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo setCheapStandAmount(String cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public String getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo setMonthPrice(String monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public String getMonthPrice() {
            return this.monthPrice;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo setOriginalStandAmount(String originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public String getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        @NameInMap("Selected")
        public Boolean selected;

        public static QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions self = new QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class QueryRenewInstancePriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static QueryRenewInstancePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewInstancePriceResponseBodyPriceInfoRules self = new QueryRenewInstancePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryRenewInstancePriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DepreciateInfo")
        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo;

        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("Message")
        public String message;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoRules> rules;

        @NameInMap("StandDiscountPrice")
        public String standDiscountPrice;

        @NameInMap("StandPrice")
        public String standPrice;

        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryRenewInstancePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewInstancePriceResponseBodyPriceInfo self = new QueryRenewInstancePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setDepreciateInfo(QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryRenewInstancePriceResponseBodyPriceInfoDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setOptionalPromotions(java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setRules(java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setStandDiscountPrice(String standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public String getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryRenewInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
