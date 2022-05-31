// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyRefund4DistributionResponseBody extends TeaModel {
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
    public ModifyRefund4DistributionResponseBodyModel model;

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

    public static ModifyRefund4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefund4DistributionResponseBody self = new ModifyRefund4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRefund4DistributionResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public ModifyRefund4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyRefund4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public ModifyRefund4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyRefund4DistributionResponseBody setModel(ModifyRefund4DistributionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifyRefund4DistributionResponseBodyModel getModel() {
        return this.model;
    }

    public ModifyRefund4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ModifyRefund4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ModifyRefund4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRefund4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ModifyRefund4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public ModifyRefund4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyRefund4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData extends TeaModel {
        // 本单最大可退款金额
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        // 本单最小可退款金额
        @NameInMap("MinRefundFee")
        public Long minRefundFee;

        public static InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData self = new InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData setMaxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Long getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData setMinRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Long getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitModifyRefund4DistributionResponseBodyModelRefundReasonList extends TeaModel {
        // 是否要求上传凭证
        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        @NameInMap("ReasonTextId")
        public String reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        // 是否要求留言
        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static InitModifyRefund4DistributionResponseBodyModelRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefund4DistributionResponseBodyModelRefundReasonList self = new InitModifyRefund4DistributionResponseBodyModelRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitModifyRefund4DistributionResponseBodyModelRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitModifyRefund4DistributionResponseBodyModelRefundReasonList setReasonTextId(String reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public String getReasonTextId() {
            return this.reasonTextId;
        }

        public InitModifyRefund4DistributionResponseBodyModelRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitModifyRefund4DistributionResponseBodyModelRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitModifyRefund4DistributionResponseBodyModel extends TeaModel {
        // 支持的订单退货方式
        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        // 是否是整单退
        @NameInMap("MainOrderRefund")
        public Boolean mainOrderRefund;

        @NameInMap("MaxRefundFeeData")
        public InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData maxRefundFeeData;

        @NameInMap("RefundReasonList")
        public java.util.List<InitModifyRefund4DistributionResponseBodyModelRefundReasonList> refundReasonList;

        // 子分销订单号
        @NameInMap("SubDistributionOrderId")
        public String subDistributionOrderId;

        public static InitModifyRefund4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefund4DistributionResponseBodyModel self = new InitModifyRefund4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public InitModifyRefund4DistributionResponseBodyModel setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitModifyRefund4DistributionResponseBodyModel setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitModifyRefund4DistributionResponseBodyModel setMaxRefundFeeData(InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitModifyRefund4DistributionResponseBodyModelMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public InitModifyRefund4DistributionResponseBodyModel setRefundReasonList(java.util.List<InitModifyRefund4DistributionResponseBodyModelRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitModifyRefund4DistributionResponseBodyModelRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

        public InitModifyRefund4DistributionResponseBodyModel setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

    public static class ModifyRefund4DistributionResponseBodyModel extends TeaModel {
        // 逆向的状态
        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        // 退款类型
        @NameInMap("DisputeType")
        public Integer disputeType;

        // 当前发起逆向的子分销订单号
        @NameInMap("SubDistributionOrderId")
        public String subDistributionOrderId;

        public static ModifyRefund4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyRefund4DistributionResponseBodyModel self = new ModifyRefund4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifyRefund4DistributionResponseBodyModel setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public ModifyRefund4DistributionResponseBodyModel setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ModifyRefund4DistributionResponseBodyModel setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

}
