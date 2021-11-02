// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RefundApplicationDetail")
    public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail refundApplicationDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryRefundApplicationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplicationDetailResponseBody self = new QueryRefundApplicationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplicationDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRefundApplicationDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRefundApplicationDetailResponseBody setRefundApplicationDetail(QueryRefundApplicationDetailResponseBodyRefundApplicationDetail refundApplicationDetail) {
        this.refundApplicationDetail = refundApplicationDetail;
        return this;
    }
    public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail getRefundApplicationDetail() {
        return this.refundApplicationDetail;
    }

    public QueryRefundApplicationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText extends TeaModel {
        @NameInMap("ReasonTextId")
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        public static QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText self = new QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

    }

    public static class QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Integer maxRefundFee;

        @NameInMap("MinRefundFee")
        public Integer minRefundFee;

        public static QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData self = new QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData setMaxRefundFee(Integer maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Integer getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData setMinRefundFee(Integer minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Integer getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class QueryRefundApplicationDetailResponseBodyRefundApplicationDetail extends TeaModel {
        @NameInMap("ApplyDisputeDesc")
        public String applyDisputeDesc;

        @NameInMap("ApplyReasonText")
        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText applyReasonText;

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
        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData maxRefundFeeData;

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

        public static QueryRefundApplicationDetailResponseBodyRefundApplicationDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetailResponseBodyRefundApplicationDetail self = new QueryRefundApplicationDetailResponseBodyRefundApplicationDetail();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setApplyDisputeDesc(String applyDisputeDesc) {
            this.applyDisputeDesc = applyDisputeDesc;
            return this;
        }
        public String getApplyDisputeDesc() {
            return this.applyDisputeDesc;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setApplyReasonText(QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText applyReasonText) {
            this.applyReasonText = applyReasonText;
            return this;
        }
        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailApplyReasonText getApplyReasonText() {
            return this.applyReasonText;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setDisputeCreateTime(String disputeCreateTime) {
            this.disputeCreateTime = disputeCreateTime;
            return this;
        }
        public String getDisputeCreateTime() {
            return this.disputeCreateTime;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setDisputeDesc(String disputeDesc) {
            this.disputeDesc = disputeDesc;
            return this;
        }
        public String getDisputeDesc() {
            return this.disputeDesc;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setDisputeEndTime(String disputeEndTime) {
            this.disputeEndTime = disputeEndTime;
            return this;
        }
        public String getDisputeEndTime() {
            return this.disputeEndTime;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setMaxRefundFeeData(QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetailMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setOrderLogisticsStatus(Integer orderLogisticsStatus) {
            this.orderLogisticsStatus = orderLogisticsStatus;
            return this;
        }
        public Integer getOrderLogisticsStatus() {
            return this.orderLogisticsStatus;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setRealRefundFee(Long realRefundFee) {
            this.realRefundFee = realRefundFee;
            return this;
        }
        public Long getRealRefundFee() {
            return this.realRefundFee;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setRefunderAddress(String refunderAddress) {
            this.refunderAddress = refunderAddress;
            return this;
        }
        public String getRefunderAddress() {
            return this.refunderAddress;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setRefunderName(String refunderName) {
            this.refunderName = refunderName;
            return this;
        }
        public String getRefunderName() {
            return this.refunderName;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setRefunderTel(String refunderTel) {
            this.refunderTel = refunderTel;
            return this;
        }
        public String getRefunderTel() {
            return this.refunderTel;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setRefunderZipCode(String refunderZipCode) {
            this.refunderZipCode = refunderZipCode;
            return this;
        }
        public String getRefunderZipCode() {
            return this.refunderZipCode;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setReturnGoodCount(Integer returnGoodCount) {
            this.returnGoodCount = returnGoodCount;
            return this;
        }
        public Integer getReturnGoodCount() {
            return this.returnGoodCount;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setReturnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
            this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
            return this;
        }
        public Integer getReturnGoodLogisticsStatus() {
            return this.returnGoodLogisticsStatus;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setSellerAgreeMsg(String sellerAgreeMsg) {
            this.sellerAgreeMsg = sellerAgreeMsg;
            return this;
        }
        public String getSellerAgreeMsg() {
            return this.sellerAgreeMsg;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setSellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
            this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
            return this;
        }
        public String getSellerRefuseAgreementMessage() {
            return this.sellerRefuseAgreementMessage;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setSellerRefuseReason(String sellerRefuseReason) {
            this.sellerRefuseReason = sellerRefuseReason;
            return this;
        }
        public String getSellerRefuseReason() {
            return this.sellerRefuseReason;
        }

        public QueryRefundApplicationDetailResponseBodyRefundApplicationDetail setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

}
