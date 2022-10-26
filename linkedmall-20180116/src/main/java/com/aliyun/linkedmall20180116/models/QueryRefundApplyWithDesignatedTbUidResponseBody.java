// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRefundApplyWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryRefundApplyWithDesignatedTbUidResponseBodyModel model;

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

    public static QueryRefundApplyWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplyWithDesignatedTbUidResponseBody self = new QueryRefundApplyWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setModel(QueryRefundApplyWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryRefundApplyWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRefundApplyWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText extends TeaModel {
        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        @NameInMap("ReasonTextId")
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText self = new QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        @NameInMap("MinRefundFee")
        public Long minRefundFee;

        public static QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData self = new QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData setMaxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Long getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData setMinRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Long getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class QueryRefundApplyWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("ApplyDisputeDesc")
        public String applyDisputeDesc;

        @NameInMap("ApplyReasonText")
        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText applyReasonText;

        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        @NameInMap("DisputeCreateTime")
        public String disputeCreateTime;

        @NameInMap("DisputeDesc")
        public String disputeDesc;

        @NameInMap("DisputeEndTime")
        public String disputeEndTime;

        @NameInMap("DisputeId")
        public Long disputeId;

        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        @NameInMap("DisputeType")
        public Integer disputeType;

        @NameInMap("LmOrderId")
        public String lmOrderId;

        @NameInMap("MaxRefundFeeData")
        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData maxRefundFeeData;

        @NameInMap("OrderLogisticsStatus")
        public Integer orderLogisticsStatus;

        @NameInMap("RealRefundFee")
        public Long realRefundFee;

        @NameInMap("RefundFee")
        public Long refundFee;

        @NameInMap("RefunderAddress")
        public String refunderAddress;

        @NameInMap("RefunderName")
        public String refunderName;

        @NameInMap("RefunderTel")
        public String refunderTel;

        @NameInMap("RefunderZipCode")
        public String refunderZipCode;

        @NameInMap("ReturnGoodCount")
        public Integer returnGoodCount;

        @NameInMap("ReturnGoodLogisticsStatus")
        public Integer returnGoodLogisticsStatus;

        @NameInMap("SellerAgreeMsg")
        public String sellerAgreeMsg;

        @NameInMap("SellerRefuseAgreementMessage")
        public String sellerRefuseAgreementMessage;

        @NameInMap("SellerRefuseReason")
        public String sellerRefuseReason;

        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        public static QueryRefundApplyWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplyWithDesignatedTbUidResponseBodyModel self = new QueryRefundApplyWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setApplyDisputeDesc(String applyDisputeDesc) {
            this.applyDisputeDesc = applyDisputeDesc;
            return this;
        }
        public String getApplyDisputeDesc() {
            return this.applyDisputeDesc;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setApplyReasonText(QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText applyReasonText) {
            this.applyReasonText = applyReasonText;
            return this;
        }
        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelApplyReasonText getApplyReasonText() {
            return this.applyReasonText;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setDisputeCreateTime(String disputeCreateTime) {
            this.disputeCreateTime = disputeCreateTime;
            return this;
        }
        public String getDisputeCreateTime() {
            return this.disputeCreateTime;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setDisputeDesc(String disputeDesc) {
            this.disputeDesc = disputeDesc;
            return this;
        }
        public String getDisputeDesc() {
            return this.disputeDesc;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setDisputeEndTime(String disputeEndTime) {
            this.disputeEndTime = disputeEndTime;
            return this;
        }
        public String getDisputeEndTime() {
            return this.disputeEndTime;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setMaxRefundFeeData(QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public QueryRefundApplyWithDesignatedTbUidResponseBodyModelMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setOrderLogisticsStatus(Integer orderLogisticsStatus) {
            this.orderLogisticsStatus = orderLogisticsStatus;
            return this;
        }
        public Integer getOrderLogisticsStatus() {
            return this.orderLogisticsStatus;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setRealRefundFee(Long realRefundFee) {
            this.realRefundFee = realRefundFee;
            return this;
        }
        public Long getRealRefundFee() {
            return this.realRefundFee;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setRefunderAddress(String refunderAddress) {
            this.refunderAddress = refunderAddress;
            return this;
        }
        public String getRefunderAddress() {
            return this.refunderAddress;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setRefunderName(String refunderName) {
            this.refunderName = refunderName;
            return this;
        }
        public String getRefunderName() {
            return this.refunderName;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setRefunderTel(String refunderTel) {
            this.refunderTel = refunderTel;
            return this;
        }
        public String getRefunderTel() {
            return this.refunderTel;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setRefunderZipCode(String refunderZipCode) {
            this.refunderZipCode = refunderZipCode;
            return this;
        }
        public String getRefunderZipCode() {
            return this.refunderZipCode;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setReturnGoodCount(Integer returnGoodCount) {
            this.returnGoodCount = returnGoodCount;
            return this;
        }
        public Integer getReturnGoodCount() {
            return this.returnGoodCount;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setReturnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
            this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
            return this;
        }
        public Integer getReturnGoodLogisticsStatus() {
            return this.returnGoodLogisticsStatus;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setSellerAgreeMsg(String sellerAgreeMsg) {
            this.sellerAgreeMsg = sellerAgreeMsg;
            return this;
        }
        public String getSellerAgreeMsg() {
            return this.sellerAgreeMsg;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setSellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
            this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
            return this;
        }
        public String getSellerRefuseAgreementMessage() {
            return this.sellerRefuseAgreementMessage;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setSellerRefuseReason(String sellerRefuseReason) {
            this.sellerRefuseReason = sellerRefuseReason;
            return this;
        }
        public String getSellerRefuseReason() {
            return this.sellerRefuseReason;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBodyModel setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

}
