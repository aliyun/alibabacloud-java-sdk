// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitModifyRefundWithDesignatedTbUidResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public InitModifyRefundWithDesignatedTbUidResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>6EF1D7F7-64***EF5-5F004D3D4247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static InitModifyRefundWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitModifyRefundWithDesignatedTbUidResponseBody self = new InitModifyRefundWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setModel(InitModifyRefundWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public InitModifyRefundWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InitModifyRefundWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinRefundFee")
        public Long minRefundFee;

        public static InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData self = new InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData setMaxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Long getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData setMinRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Long getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProofRequired")
        public Boolean proofRequired;

        /**
         * <strong>example:</strong>
         * <p>12323</p>
         */
        @NameInMap("ReasonTextId")
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        public String reasonTips;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RefundDescRequired")
        public Boolean refundDescRequired;

        public static InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList self = new InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitModifyRefundWithDesignatedTbUidResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        /**
         * <strong>example:</strong>
         * <p>742***206</p>
         */
        @NameInMap("LmOrderId")
        public String lmOrderId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MainOrderRefund")
        public Boolean mainOrderRefund;

        @NameInMap("MaxRefundFeeData")
        public InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData maxRefundFeeData;

        @NameInMap("RefundReasonList")
        public java.util.List<InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList> refundReasonList;

        public static InitModifyRefundWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            InitModifyRefundWithDesignatedTbUidResponseBodyModel self = new InitModifyRefundWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModel setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModel setLmOrderId(String lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModel setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModel setMaxRefundFeeData(InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitModifyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        public InitModifyRefundWithDesignatedTbUidResponseBodyModel setRefundReasonList(java.util.List<InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitModifyRefundWithDesignatedTbUidResponseBodyModelRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

    }

}
