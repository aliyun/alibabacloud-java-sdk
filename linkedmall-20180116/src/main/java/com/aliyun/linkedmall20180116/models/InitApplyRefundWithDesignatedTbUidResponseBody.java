// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitApplyRefundWithDesignatedTbUidResponseBody extends TeaModel {
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
    public InitApplyRefundWithDesignatedTbUidResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>5BE45C12-C37***81-A8E9C61401AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>201</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
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
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static InitApplyRefundWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefundWithDesignatedTbUidResponseBody self = new InitApplyRefundWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setModel(InitApplyRefundWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public InitApplyRefundWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InitApplyRefundWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class InitApplyRefundWithDesignatedTbUidResponseBodyModelMaxRefundFeeData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRefundFee")
        public Long maxRefundFee;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizClaimType")
        public Integer bizClaimType;

        /**
         * <strong>example:</strong>
         * <p>711***981</p>
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
