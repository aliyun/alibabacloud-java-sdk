// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCheckRefundResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketCheckRefundResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DistributorOrderIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>分销商订单号不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketCheckRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketCheckRefundResponseBody self = new TicketCheckRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketCheckRefundResponseBody setData(TicketCheckRefundResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketCheckRefundResponseBodyData getData() {
        return this.data;
    }

    public TicketCheckRefundResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketCheckRefundResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketCheckRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketCheckRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketCheckRefundResponseBodyDataRefundAmount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        public static TicketCheckRefundResponseBodyDataRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            TicketCheckRefundResponseBodyDataRefundAmount self = new TicketCheckRefundResponseBodyDataRefundAmount();
            return TeaModel.build(map, self);
        }

        public TicketCheckRefundResponseBodyDataRefundAmount setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public TicketCheckRefundResponseBodyDataRefundAmount setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

    }

    public static class TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom build(java.util.Map<String, ?> map) throws Exception {
            TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom self = new TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom();
            return TeaModel.build(map, self);
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo build(java.util.Map<String, ?> map) throws Exception {
            TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo self = new TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo();
            return TeaModel.build(map, self);
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules extends TeaModel {
        @NameInMap("Fee")
        public Double fee;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FeeBase")
        public Integer feeBase;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FeeType")
        public Integer feeType;

        @NameInMap("From")
        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom from;

        @NameInMap("To")
        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo to;

        public static TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules build(java.util.Map<String, ?> map) throws Exception {
            TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules self = new TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules();
            return TeaModel.build(map, self);
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules setFee(Double fee) {
            this.fee = fee;
            return this;
        }
        public Double getFee() {
            return this.fee;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules setFeeBase(Integer feeBase) {
            this.feeBase = feeBase;
            return this;
        }
        public Integer getFeeBase() {
            return this.feeBase;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules setFeeType(Integer feeType) {
            this.feeType = feeType;
            return this;
        }
        public Integer getFeeType() {
            return this.feeType;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules setFrom(TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom from) {
            this.from = from;
            return this;
        }
        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesFrom getFrom() {
            return this.from;
        }

        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules setTo(TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo to) {
            this.to = to;
            return this;
        }
        public TicketCheckRefundResponseBodyDataRefundRuleRefundStageRulesTo getTo() {
            return this.to;
        }

    }

    public static class TicketCheckRefundResponseBodyDataRefundRule extends TeaModel {
        @NameInMap("RefundStageRules")
        public java.util.List<TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules> refundStageRules;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RefundType")
        public Integer refundType;

        public static TicketCheckRefundResponseBodyDataRefundRule build(java.util.Map<String, ?> map) throws Exception {
            TicketCheckRefundResponseBodyDataRefundRule self = new TicketCheckRefundResponseBodyDataRefundRule();
            return TeaModel.build(map, self);
        }

        public TicketCheckRefundResponseBodyDataRefundRule setRefundStageRules(java.util.List<TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules> refundStageRules) {
            this.refundStageRules = refundStageRules;
            return this;
        }
        public java.util.List<TicketCheckRefundResponseBodyDataRefundRuleRefundStageRules> getRefundStageRules() {
            return this.refundStageRules;
        }

        public TicketCheckRefundResponseBodyDataRefundRule setRefundType(Integer refundType) {
            this.refundType = refundType;
            return this;
        }
        public Integer getRefundType() {
            return this.refundType;
        }

    }

    public static class TicketCheckRefundResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanRefund")
        public Boolean canRefund;

        @NameInMap("RefundAmount")
        public TicketCheckRefundResponseBodyDataRefundAmount refundAmount;

        @NameInMap("RefundRule")
        public TicketCheckRefundResponseBodyDataRefundRule refundRule;

        public static TicketCheckRefundResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketCheckRefundResponseBodyData self = new TicketCheckRefundResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketCheckRefundResponseBodyData setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public TicketCheckRefundResponseBodyData setRefundAmount(TicketCheckRefundResponseBodyDataRefundAmount refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public TicketCheckRefundResponseBodyDataRefundAmount getRefundAmount() {
            return this.refundAmount;
        }

        public TicketCheckRefundResponseBodyData setRefundRule(TicketCheckRefundResponseBodyDataRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public TicketCheckRefundResponseBodyDataRefundRule getRefundRule() {
            return this.refundRule;
        }

    }

}
