// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RefundInstanceResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public RefundInstanceResponseBodyData data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static RefundInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceResponseBody self = new RefundInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefundInstanceResponseBody setData(RefundInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefundInstanceResponseBodyData getData() {
        return this.data;
    }

    public RefundInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefundInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InquiryPriceRefundInstanceResponseBodyData extends TeaModel {
        // currency
        @NameInMap("Currency")
        public String currency;

        // hostId
        @NameInMap("HostId")
        public String hostId;

        // instanceId
        @NameInMap("InstanceId")
        public String instanceId;

        // refundAmount
        @NameInMap("RefundAmount")
        public Double refundAmount;

        public static InquiryPriceRefundInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InquiryPriceRefundInstanceResponseBodyData self = new InquiryPriceRefundInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InquiryPriceRefundInstanceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public InquiryPriceRefundInstanceResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public InquiryPriceRefundInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InquiryPriceRefundInstanceResponseBodyData setRefundAmount(Double refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Double getRefundAmount() {
            return this.refundAmount;
        }

    }

    public static class RefundInstanceResponseBodyData extends TeaModel {
        // hostId
        @NameInMap("HostId")
        public String hostId;

        // orderId
        @NameInMap("OrderId")
        public Long orderId;

        public static RefundInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefundInstanceResponseBodyData self = new RefundInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefundInstanceResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public RefundInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
