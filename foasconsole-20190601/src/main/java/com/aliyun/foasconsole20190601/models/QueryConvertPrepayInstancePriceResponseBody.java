// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryConvertPrepayInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public QueryConvertPrepayInstancePriceResponseBodyPriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryConvertPrepayInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertPrepayInstancePriceResponseBody self = new QueryConvertPrepayInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConvertPrepayInstancePriceResponseBody setPriceInfo(QueryConvertPrepayInstancePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public QueryConvertPrepayInstancePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public QueryConvertPrepayInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConvertPrepayInstancePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        @NameInMap("Selected")
        public Boolean selected;

        public static QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions self = new QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("RuleId")
        public Long ruleId;

        public static QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules self = new QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules();
            return TeaModel.build(map, self);
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class QueryConvertPrepayInstancePriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("Message")
        public String message;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules> rules;

        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryConvertPrepayInstancePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertPrepayInstancePriceResponseBodyPriceInfo self = new QueryConvertPrepayInstancePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setOptionalPromotions(java.util.List<QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryConvertPrepayInstancePriceResponseBodyPriceInfoOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setRules(java.util.List<QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryConvertPrepayInstancePriceResponseBodyPriceInfoRules> getRules() {
            return this.rules;
        }

        public QueryConvertPrepayInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
