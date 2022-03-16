// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryRenewInstancePriceResponseBody extends TeaModel {
    // 价格信息，包括价格和优惠规则。
    @NameInMap("PriceInfo")
    public QueryRenewInstancePriceResponseBodyPriceInfo priceInfo;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
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

    public static class QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
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
        // 活动规则描述。
        @NameInMap("Description")
        public String description;

        // 活动ID。
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
        public java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        // 原价
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        // 活动规则。
        @NameInMap("Rules")
        public java.util.List<QueryRenewInstancePriceResponseBodyPriceInfoRules> rules;

        // 最终价，为原价减去折扣。
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

        public QueryRenewInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
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

        public QueryRenewInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
