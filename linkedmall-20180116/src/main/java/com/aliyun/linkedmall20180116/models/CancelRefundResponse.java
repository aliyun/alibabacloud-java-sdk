// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelRefundResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RefundApplicationData")
    @Validation(required = true)
    public CancelRefundResponseRefundApplicationData refundApplicationData;

    public static CancelRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRefundResponse self = new CancelRefundResponse();
        return TeaModel.build(map, self);
    }

    public CancelRefundResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelRefundResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelRefundResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelRefundResponse setRefundApplicationData(CancelRefundResponseRefundApplicationData refundApplicationData) {
        this.refundApplicationData = refundApplicationData;
        return this;
    }
    public CancelRefundResponseRefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    public static class CancelRefundResponseRefundApplicationData extends TeaModel {
        @NameInMap("SubLmOrderId")
        @Validation(required = true)
        public String subLmOrderId;

        @NameInMap("DisputeStatus")
        @Validation(required = true)
        public Integer disputeStatus;

        @NameInMap("DisputeType")
        @Validation(required = true)
        public Integer disputeType;

        public static CancelRefundResponseRefundApplicationData build(java.util.Map<String, ?> map) throws Exception {
            CancelRefundResponseRefundApplicationData self = new CancelRefundResponseRefundApplicationData();
            return TeaModel.build(map, self);
        }

        public CancelRefundResponseRefundApplicationData setSubLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

        public CancelRefundResponseRefundApplicationData setDisputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        public CancelRefundResponseRefundApplicationData setDisputeType(Integer disputeType) {
            this.disputeType = disputeType;
            return this;
        }
        public Integer getDisputeType() {
            return this.disputeType;
        }

    }

}
