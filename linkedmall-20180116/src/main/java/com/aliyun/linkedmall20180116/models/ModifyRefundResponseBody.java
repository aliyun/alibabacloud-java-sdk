// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyRefundResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RefundApplicationData")
    public ModifyRefundResponseBodyRefundApplicationData refundApplicationData;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefundResponseBody self = new ModifyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyRefundResponseBody setRefundApplicationData(ModifyRefundResponseBodyRefundApplicationData refundApplicationData) {
        this.refundApplicationData = refundApplicationData;
        return this;
    }
    public ModifyRefundResponseBodyRefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    public ModifyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Integer maxRefundFee;

        @NameInMap("MinRefundFee")
        public Integer minRefundFee;

        public static InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData self = new InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData setMaxRefundFee(Integer maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Integer getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData setMinRefundFee(Integer minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Integer getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList extends TeaModel {
        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        @NameInMap("ReasonTextId")
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList self = new InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList extends TeaModel {
        @NameInMap("RefundReasonList")
        public java.util.List<InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList> refundReasonList;

        public static InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList self = new InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList setRefundReasonList(java.util.List<InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonListRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

    }

    public static class InitModifyRefundResponseBodyInitApplyRefundData extends TeaModel {
        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        @NameInMap("MainOrderRefund")
        public Boolean mainOrderRefund;

        @NameInMap("MaxRefundFeeData")
        public InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData maxRefundFeeData;

        @NameInMap("RefundReasonList")
        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList refundReasonList;

        public static InitModifyRefundResponseBodyInitApplyRefundData build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundResponseBodyInitApplyRefundData self = new InitModifyRefundResponseBodyInitApplyRefundData();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundResponseBodyInitApplyRefundData setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitModifyRefundResponseBodyInitApplyRefundData setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitModifyRefundResponseBodyInitApplyRefundData setMaxRefundFeeData(InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitModifyRefundResponseBodyInitApplyRefundDataMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public InitModifyRefundResponseBodyInitApplyRefundData setRefundReasonList(InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public InitModifyRefundResponseBodyInitApplyRefundDataRefundReasonList getRefundReasonList() {
            return this.refundReasonList;
        }

    }

    public static class ModifyRefundResponseBodyRefundApplicationData extends TeaModel {
        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        @NameInMap("DisputeType")
        public Integer disputeType;

        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        public static ModifyRefundResponseBodyRefundApplicationData build(java.util.Map<String, ?> map) throws Exception {
            ModifyRefundResponseBodyRefundApplicationData self = new ModifyRefundResponseBodyRefundApplicationData();
            return TeaModel.build(map, self);
        }

        public ModifyRefundResponseBodyRefundApplicationData setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public ModifyRefundResponseBodyRefundApplicationData setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ModifyRefundResponseBodyRefundApplicationData setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

}
