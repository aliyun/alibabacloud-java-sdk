// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryModifyInstancePriceResponseBody extends TeaModel {
    // 价格信息，包括价格和优惠规则。
    @NameInMap("PriceInfo")
    public QueryModifyInstancePriceResponseBodyPriceInfo priceInfo;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
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

    public static class QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions extends TeaModel {
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
        // 活动规则描述。
        @NameInMap("Description")
        public String description;

        // 活动ID。
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
        public java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoOptionalPromotions> optionalPromotions;

        // 原价
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        // 活动规则。
        @NameInMap("Rules")
        public java.util.List<QueryModifyInstancePriceResponseBodyPriceInfoRules> rules;

        // 最终价，为原价减去折扣。
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

        public QueryModifyInstancePriceResponseBodyPriceInfo setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
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

        public QueryModifyInstancePriceResponseBodyPriceInfo setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
