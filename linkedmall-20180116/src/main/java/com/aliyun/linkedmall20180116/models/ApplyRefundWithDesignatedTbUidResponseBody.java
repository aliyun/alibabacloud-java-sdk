// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundWithDesignatedTbUidResponseBody extends TeaModel {
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
    public ApplyRefundWithDesignatedTbUidResponseBodyModel model;

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
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>6DC726F1-65***14-5C30B4B6508C</p>
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
     * <p>5</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>155***050</p>
         */
        @NameInMap("DisputeId")
        public Long disputeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisputeType")
        public Integer disputeType;

        /**
         * <strong>example:</strong>
         * <p>689***932</p>
         */
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

}
