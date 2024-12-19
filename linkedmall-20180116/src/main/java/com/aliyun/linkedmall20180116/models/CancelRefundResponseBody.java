// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelRefundResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RefundApplicationData")
    public CancelRefundResponseBodyRefundApplicationData refundApplicationData;

    /**
     * <strong>example:</strong>
     * <p>5E2D59BA-4EB0-45C4-A0D7-D98C1A4B320B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelRefundResponseBody self = new CancelRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelRefundResponseBody setRefundApplicationData(CancelRefundResponseBodyRefundApplicationData refundApplicationData) {
        this.refundApplicationData = refundApplicationData;
        return this;
    }
    public CancelRefundResponseBodyRefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    public CancelRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CancelRefundResponseBodyRefundApplicationData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DisputeType")
        public Integer disputeType;

        /**
         * <strong>example:</strong>
         * <p>37******31</p>
         */
        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        public static CancelRefundResponseBodyRefundApplicationData build(java.util.Map<String, ?> map) throws Exception {
            CancelRefundResponseBodyRefundApplicationData self = new CancelRefundResponseBodyRefundApplicationData();
            return TeaModel.build(map, self);
        }

        public CancelRefundResponseBodyRefundApplicationData setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public CancelRefundResponseBodyRefundApplicationData setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public CancelRefundResponseBodyRefundApplicationData setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

}
