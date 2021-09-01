// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefundApplicationData")
    public ApplyRefundResponseBodyRefundApplicationData refundApplicationData;

    public static ApplyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundResponseBody self = new ApplyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRefundResponseBody setRefundApplicationData(ApplyRefundResponseBodyRefundApplicationData refundApplicationData) {
        this.refundApplicationData = refundApplicationData;
        return this;
    }
    public ApplyRefundResponseBodyRefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    public static class ApplyRefundResponseBodyRefundApplicationData extends TeaModel {
        @NameInMap("DisputeType")
        public Integer disputeType;

        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        public static ApplyRefundResponseBodyRefundApplicationData build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundResponseBodyRefundApplicationData self = new ApplyRefundResponseBodyRefundApplicationData();
            return TeaModel.build(map, self);
        }

        public ApplyRefundResponseBodyRefundApplicationData setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ApplyRefundResponseBodyRefundApplicationData setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

        public ApplyRefundResponseBodyRefundApplicationData setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

    }

    public static class InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList extends TeaModel {
        @NameInMap("ReasonTextId")
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList self = new InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList extends TeaModel {
        @NameInMap("RefundReasonList")
        public java.util.List<InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList> refundReasonList;

        public static InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList self = new InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList setRefundReasonList(java.util.List<InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

    }

    public static class InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Integer maxRefundFee;

        @NameInMap("MinRefundFee")
        public Integer minRefundFee;

        public static InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData self = new InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData setMaxRefundFee(Integer maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Integer getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData setMinRefundFee(Integer minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Integer getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitApplyRefundResponseBodyInitApplyRefundData extends TeaModel {
        @NameInMap("MainOrderRefund")
        public Boolean mainOrderRefund;

        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        @NameInMap("RefundReasonList")
        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList refundReasonList;

        @NameInMap("MaxRefundFeeData")
        public InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData maxRefundFeeData;

        public static InitApplyRefundResponseBodyInitApplyRefundData build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseBodyInitApplyRefundData self = new InitApplyRefundResponseBodyInitApplyRefundData();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseBodyInitApplyRefundData setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitApplyRefundResponseBodyInitApplyRefundData setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitApplyRefundResponseBodyInitApplyRefundData setRefundReasonList(InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public InitApplyRefundResponseBodyInitApplyRefundDataRefundReasonList getRefundReasonList() {
            return this.refundReasonList;
        }

        public InitApplyRefundResponseBodyInitApplyRefundData setMaxRefundFeeData(InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitApplyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

    }

}
