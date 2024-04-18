// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public QueryCreateInstancePriceResponseBodyPriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

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
        @NameInMap("Description")
        public String description;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DepreciateInfo")
        public QueryCreateInstancePriceResponseBodyPriceInfoDepreciateInfo depreciateInfo;

        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        @NameInMap("Message")
        public String message;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoRules> rules;

        @NameInMap("StandDiscountPrice")
        public String standDiscountPrice;

        @NameInMap("StandPrice")
        public String standPrice;

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
