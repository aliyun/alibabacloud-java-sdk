// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RefundApplicationData")
    public ApplyRefundResponseBodyRefundApplicationData refundApplicationData;

    @NameInMap("RequestId")
    public String requestId;

    public static ApplyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundResponseBody self = new ApplyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyRefundResponseBody setRefundApplicationData(ApplyRefundResponseBodyRefundApplicationData refundApplicationData) {
        this.refundApplicationData = refundApplicationData;
        return this;
    }
    public ApplyRefundResponseBodyRefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    public ApplyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplyRefundResponseBodyRefundApplicationData extends TeaModel {
        @NameInMap("DisputeId")
        public Long disputeId;

        @NameInMap("DisputeStatus")
        public Integer disputeStatus;

        @NameInMap("DisputeType")
        public Integer disputeType;

        @NameInMap("SubLmOrderId")
        public String subLmOrderId;

        public static ApplyRefundResponseBodyRefundApplicationData build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundResponseBodyRefundApplicationData self = new ApplyRefundResponseBodyRefundApplicationData();
            return TeaModel.build(map, self);
        }

        public ApplyRefundResponseBodyRefundApplicationData setDisputeId(Long disputeId) {
            this.disputeId = disputeId;
            return this;
        }
        public Long getDisputeId() {
            return this.disputeId;
        }

        public ApplyRefundResponseBodyRefundApplicationData setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public ApplyRefundResponseBodyRefundApplicationData setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

        public ApplyRefundResponseBodyRefundApplicationData setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

    }

}
