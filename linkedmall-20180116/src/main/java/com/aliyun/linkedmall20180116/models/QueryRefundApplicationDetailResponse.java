// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetailResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RefundApplicationDetail")
    @Validation(required = true)
    public QueryRefundApplicationDetailResponseRefundApplicationDetail refundApplicationDetail;

    public static QueryRefundApplicationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplicationDetailResponse self = new QueryRefundApplicationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplicationDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRefundApplicationDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRefundApplicationDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRefundApplicationDetailResponse setRefundApplicationDetail(QueryRefundApplicationDetailResponseRefundApplicationDetail refundApplicationDetail) {
        this.refundApplicationDetail = refundApplicationDetail;
        return this;
    }
    public QueryRefundApplicationDetailResponseRefundApplicationDetail getRefundApplicationDetail() {
        return this.refundApplicationDetail;
    }

    public static class QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        @Validation(required = true)
        public Integer maxRefundFee;

        @NameInMap("MinRefundFee")
        @Validation(required = true)
        public Integer minRefundFee;

        public static QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData self = new QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData setMaxRefundFee(Integer maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Integer getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData setMinRefundFee(Integer minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Integer getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText extends TeaModel {
        @NameInMap("ReasonTextId")
        @Validation(required = true)
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        @Validation(required = true)
        public String reasonTips;

        public static QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText self = new QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

    }

    public static class QueryRefundApplicationDetailResponseRefundApplicationDetail extends TeaModel {
        @NameInMap("BizClaimType")
        @Validation(required = true)
        public Integer bizClaimType;

        @NameInMap("OrderLogisticsStatus")
        @Validation(required = true)
        public Integer orderLogisticsStatus;

        @NameInMap("DisputeStatus")
        @Validation(required = true)
        public Integer disputeStatus;

        @NameInMap("ReturnGoodLogisticsStatus")
        @Validation(required = true)
        public Integer returnGoodLogisticsStatus;

        @NameInMap("LmOrderId")
        @Validation(required = true)
        public String lmOrderId;

        @NameInMap("SubLmOrderId")
        @Validation(required = true)
        public String subLmOrderId;

        @NameInMap("DisputeType")
        @Validation(required = true)
        public Integer disputeType;

        @NameInMap("RefundFee")
        @Validation(required = true)
        public Long refundFee;

        @NameInMap("RealRefundFee")
        @Validation(required = true)
        public Long realRefundFee;

        @NameInMap("ReturnGoodCount")
        @Validation(required = true)
        public Integer returnGoodCount;

        @NameInMap("DisputeDesc")
        @Validation(required = true)
        public String disputeDesc;

        @NameInMap("SellerAgreeMsg")
        @Validation(required = true)
        public String sellerAgreeMsg;

        @NameInMap("SellerRefuseAgreementMessage")
        @Validation(required = true)
        public String sellerRefuseAgreementMessage;

        @NameInMap("ApplyDisputeDesc")
        @Validation(required = true)
        public String applyDisputeDesc;

        @NameInMap("DisputeCreateTime")
        @Validation(required = true)
        public String disputeCreateTime;

        @NameInMap("DisputeEndTime")
        @Validation(required = true)
        public String disputeEndTime;

        @NameInMap("DisputeId")
        @Validation(required = true)
        public Long disputeId;

        @NameInMap("RefunderAddress")
        @Validation(required = true)
        public String refunderAddress;

        @NameInMap("RefunderName")
        @Validation(required = true)
        public String refunderName;

        @NameInMap("RefunderTel")
        @Validation(required = true)
        public String refunderTel;

        @NameInMap("RefunderZipCode")
        @Validation(required = true)
        public String refunderZipCode;

        @NameInMap("SellerRefuseReason")
        @Validation(required = true)
        public String sellerRefuseReason;

        @NameInMap("MaxRefundFeeData")
        @Validation(required = true)
        public QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData maxRefundFeeData;

        @NameInMap("ApplyReasonText")
        @Validation(required = true)
        public QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText applyReasonText;

        public static QueryRefundApplicationDetailResponseRefundApplicationDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetailResponseRefundApplicationDetail self = new QueryRefundApplicationDetailResponseRefundApplicationDetail();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setOrderLogisticsStatus(Integer orderLogisticsStatus) {
            this.orderLogisticsStatus = orderLogisticsStatus;
            return this;
        }
        public Integer getOrderLogisticsStatus() {
            return this.orderLogisticsStatus;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setReturnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
            this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
            return this;
        }
        public Integer getReturnGoodLogisticsStatus() {
            return this.returnGoodLogisticsStatus;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setRealRefundFee(Long realRefundFee) {
            this.realRefundFee = realRefundFee;
            return this;
        }
        public Long getRealRefundFee() {
            return this.realRefundFee;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setReturnGoodCount(Integer returnGoodCount) {
            this.returnGoodCount = returnGoodCount;
            return this;
        }
        public Integer getReturnGoodCount() {
            return this.returnGoodCount;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setDisputeDesc(String disputeDesc) {
            this.disputeDesc = disputeDesc;
            return this;
        }
        public String getDisputeDesc() {
            return this.disputeDesc;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setSellerAgreeMsg(String sellerAgreeMsg) {
            this.sellerAgreeMsg = sellerAgreeMsg;
            return this;
        }
        public String getSellerAgreeMsg() {
            return this.sellerAgreeMsg;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setSellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
            this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
            return this;
        }
        public String getSellerRefuseAgreementMessage() {
            return this.sellerRefuseAgreementMessage;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setApplyDisputeDesc(String applyDisputeDesc) {
            this.applyDisputeDesc = applyDisputeDesc;
            return this;
        }
        public String getApplyDisputeDesc() {
            return this.applyDisputeDesc;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setDisputeCreateTime(String disputeCreateTime) {
            this.disputeCreateTime = disputeCreateTime;
            return this;
        }
        public String getDisputeCreateTime() {
            return this.disputeCreateTime;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setDisputeEndTime(String disputeEndTime) {
            this.disputeEndTime = disputeEndTime;
            return this;
        }
        public String getDisputeEndTime() {
            return this.disputeEndTime;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setRefunderAddress(String refunderAddress) {
            this.refunderAddress = refunderAddress;
            return this;
        }
        public String getRefunderAddress() {
            return this.refunderAddress;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setRefunderName(String refunderName) {
            this.refunderName = refunderName;
            return this;
        }
        public String getRefunderName() {
            return this.refunderName;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setRefunderTel(String refunderTel) {
            this.refunderTel = refunderTel;
            return this;
        }
        public String getRefunderTel() {
            return this.refunderTel;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setRefunderZipCode(String refunderZipCode) {
            this.refunderZipCode = refunderZipCode;
            return this;
        }
        public String getRefunderZipCode() {
            return this.refunderZipCode;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setSellerRefuseReason(String sellerRefuseReason) {
            this.sellerRefuseReason = sellerRefuseReason;
            return this;
        }
        public String getSellerRefuseReason() {
            return this.sellerRefuseReason;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setMaxRefundFeeData(QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public QueryRefundApplicationDetailResponseRefundApplicationDetailMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public QueryRefundApplicationDetailResponseRefundApplicationDetail setApplyReasonText(QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText applyReasonText) {
            this.applyReasonText = applyReasonText;
            return this;
        }
        public QueryRefundApplicationDetailResponseRefundApplicationDetailApplyReasonText getApplyReasonText() {
            return this.applyReasonText;
        }

    }

}
