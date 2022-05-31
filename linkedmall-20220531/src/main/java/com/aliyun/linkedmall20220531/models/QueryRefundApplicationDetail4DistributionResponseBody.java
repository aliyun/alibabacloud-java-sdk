// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryRefundApplicationDetail4DistributionResponseBody extends TeaModel {
    // 渠道公共数据
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    // 返回的执行结果码， 正确为字符串 0000
    @NameInMap("Code")
    public String code;

    // 每次请求操作对应的操作日志号，由系统自动生成，返回给租户，可用于排查问题，双方日志中统一透出此标识
    @NameInMap("LogsId")
    public String logsId;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求结果数据
    @NameInMap("Model")
    public QueryRefundApplicationDetail4DistributionResponseBodyModel model;

    // 当前页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // POP请求流水号，建议租户日志中也输出此流水号，双方排查问题方便
    @NameInMap("RequestId")
    public String requestId;

    // 错误子代码。一般用于显示业务类的错误代码，一般建议关注此类错误
    @NameInMap("SubCode")
    public String subCode;

    // 业务处理相关的错误信息，一般建议关注此类错误
    @NameInMap("SubMessage")
    public String subMessage;

    // 本次执行的结果成功与否
    @NameInMap("Success")
    public Boolean success;

    // 总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryRefundApplicationDetail4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplicationDetail4DistributionResponseBody self = new QueryRefundApplicationDetail4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setModel(QueryRefundApplicationDetail4DistributionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryRefundApplicationDetail4DistributionResponseBodyModel getModel() {
        return this.model;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRefundApplicationDetail4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText extends TeaModel {
        @NameInMap("ReasonTextId")
        public String reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        public static QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText self = new QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText setReasonTextId(String reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public String getReasonTextId() {
            return this.reasonTextId;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

    }

    public static class QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        @NameInMap("MinRefundFee")
        public Long minRefundFee;

        public static QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData self = new QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData setMaxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Long getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData setMinRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Long getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class QueryRefundApplicationDetail4DistributionResponseBodyModel extends TeaModel {
        @NameInMap("ApplyDisputeDesc")
        public String applyDisputeDesc;

        @NameInMap("ApplyReasonText")
        public QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText applyReasonText;

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

        @NameInMap("DistributionOrderId")
        public String distributionOrderId;

        @NameInMap("MaxRefundFeeData")
        public QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData maxRefundFeeData;

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
        public Long returnGoodCount;

        @NameInMap("ReturnGoodLogisticsStatus")
        public Integer returnGoodLogisticsStatus;

        @NameInMap("SellerAgreeMsg")
        public String sellerAgreeMsg;

        @NameInMap("SellerRefuseAgreementMessage")
        public String sellerRefuseAgreementMessage;

        @NameInMap("SellerRefuseReason")
        public String sellerRefuseReason;

        @NameInMap("SubDistributionOrderId")
        public String subDistributionOrderId;

        public static QueryRefundApplicationDetail4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryRefundApplicationDetail4DistributionResponseBodyModel self = new QueryRefundApplicationDetail4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setApplyDisputeDesc(String applyDisputeDesc) {
            this.applyDisputeDesc = applyDisputeDesc;
            return this;
        }
        public String getApplyDisputeDesc() {
            return this.applyDisputeDesc;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setApplyReasonText(QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText applyReasonText) {
            this.applyReasonText = applyReasonText;
            return this;
        }
        public QueryRefundApplicationDetail4DistributionResponseBodyModelApplyReasonText getApplyReasonText() {
            return this.applyReasonText;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDisputeCreateTime(String disputeCreateTime) {
            this.disputeCreateTime = disputeCreateTime;
            return this;
        }
        public String getDisputeCreateTime() {
            return this.disputeCreateTime;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDisputeDesc(String disputeDesc) {
            this.disputeDesc = disputeDesc;
            return this;
        }
        public String getDisputeDesc() {
            return this.disputeDesc;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDisputeEndTime(String disputeEndTime) {
            this.disputeEndTime = disputeEndTime;
            return this;
        }
        public String getDisputeEndTime() {
            return this.disputeEndTime;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setDistributionOrderId(String distributionOrderId) {
            this.distributionOrderId = distributionOrderId;
            return this;
        }
        public String getDistributionOrderId() {
            return this.distributionOrderId;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setMaxRefundFeeData(QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public QueryRefundApplicationDetail4DistributionResponseBodyModelMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setOrderLogisticsStatus(Integer orderLogisticsStatus) {
            this.orderLogisticsStatus = orderLogisticsStatus;
            return this;
        }
        public Integer getOrderLogisticsStatus() {
            return this.orderLogisticsStatus;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setRealRefundFee(Long realRefundFee) {
            this.realRefundFee = realRefundFee;
            return this;
        }
        public Long getRealRefundFee() {
            return this.realRefundFee;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setRefunderAddress(String refunderAddress) {
            this.refunderAddress = refunderAddress;
            return this;
        }
        public String getRefunderAddress() {
            return this.refunderAddress;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setRefunderName(String refunderName) {
            this.refunderName = refunderName;
            return this;
        }
        public String getRefunderName() {
            return this.refunderName;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setRefunderTel(String refunderTel) {
            this.refunderTel = refunderTel;
            return this;
        }
        public String getRefunderTel() {
            return this.refunderTel;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setRefunderZipCode(String refunderZipCode) {
            this.refunderZipCode = refunderZipCode;
            return this;
        }
        public String getRefunderZipCode() {
            return this.refunderZipCode;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setReturnGoodCount(Long returnGoodCount) {
            this.returnGoodCount = returnGoodCount;
            return this;
        }
        public Long getReturnGoodCount() {
            return this.returnGoodCount;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setReturnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
            this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
            return this;
        }
        public Integer getReturnGoodLogisticsStatus() {
            return this.returnGoodLogisticsStatus;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setSellerAgreeMsg(String sellerAgreeMsg) {
            this.sellerAgreeMsg = sellerAgreeMsg;
            return this;
        }
        public String getSellerAgreeMsg() {
            return this.sellerAgreeMsg;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setSellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
            this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
            return this;
        }
        public String getSellerRefuseAgreementMessage() {
            return this.sellerRefuseAgreementMessage;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setSellerRefuseReason(String sellerRefuseReason) {
            this.sellerRefuseReason = sellerRefuseReason;
            return this;
        }
        public String getSellerRefuseReason() {
            return this.sellerRefuseReason;
        }

        public QueryRefundApplicationDetail4DistributionResponseBodyModel setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

}
