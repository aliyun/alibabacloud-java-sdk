// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryCreateInstancePriceResponseBody extends TeaModel {
    // 价格信息，包括价格和优惠规则。
    @NameInMap("PriceInfo")
    public QueryCreateInstancePriceResponseBodyPriceInfo priceInfo;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
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

    public static class QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
        // 优惠券描述
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        // 优惠券名称
        @NameInMap("PromotionName")
        public String promotionName;

        // 优惠券编号
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
        // 活动规则描述。
        @NameInMap("Description")
        public String description;

        // 活动ID。
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
        // 错误码
        @NameInMap("Code")
        public String code;

        // 货币单位。
        @NameInMap("Currency")
        public String currency;

        // 折扣
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        // 错误信息
        @NameInMap("Message")
        public String message;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        // 原价
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        // 活动规则。
        @NameInMap("Rules")
        public java.util.List<QueryCreateInstancePriceResponseBodyPriceInfoRules> rules;

        // 最终价，为原价减去折扣。
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

        public QueryCreateInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
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

        public QueryCreateInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
