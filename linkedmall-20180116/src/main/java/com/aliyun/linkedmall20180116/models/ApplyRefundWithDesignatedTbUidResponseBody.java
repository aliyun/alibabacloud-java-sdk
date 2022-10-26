// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ApplyRefundWithDesignatedTbUidResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ApplyRefundWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundWithDesignatedTbUidResponseBody self = new ApplyRefundWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setModel(ApplyRefundWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ApplyRefundWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyRefundWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ApplyRefundWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("DisputeId")
        public Long disputeId;

        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        @NameInMap("DisputeType")
        public Integer disputeType;

        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        public static ApplyRefundWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundWithDesignatedTbUidResponseBodyModel self = new ApplyRefundWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ApplyRefundWithDesignatedTbUidResponseBodyModel setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public ApplyRefundWithDesignatedTbUidResponseBodyModel setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public ApplyRefundWithDesignatedTbUidResponseBodyModel setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ApplyRefundWithDesignatedTbUidResponseBodyModel setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

    public static class InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        @NameInMap("MinRefundFee")
        public Long minRefundFee;

        public static InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData self = new InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData setMaxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Long getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData setMinRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Long getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList extends TeaModel {
        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        @NameInMap("ReasonTextId")
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList self = new InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitApplyRefundWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        @NameInMap("LmOrderId")
        public String lmOrderId;

        @NameInMap("MainOrderRefund")
        public Boolean mainOrderRefund;

        @NameInMap("MaxRefundFeeData")
        public InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData maxRefundFeeData;

        @NameInMap("RefundReasonList")
        public java.util.List<InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList> refundReasonList;

        public static InitApplyRefundWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundWithDesignatedTbUidResponseBodyModel self = new InitApplyRefundWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModel setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModel setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModel setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModel setMaxRefundFeeData(InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public InitApplyRefundWithDesignatedTbUidResponseBodyModel setRefundReasonList(java.util.List<InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitApplyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

    }

}
