// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class InquiryPriceRefundInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("Data")
    public InquiryPriceRefundInstanceResponseBodyData data;

    /**
     * <p>The description of the execution result.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InquiryPriceRefundInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InquiryPriceRefundInstanceResponseBody self = new InquiryPriceRefundInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public InquiryPriceRefundInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InquiryPriceRefundInstanceResponseBody setData(InquiryPriceRefundInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InquiryPriceRefundInstanceResponseBodyData getData() {
        return this.data;
    }

    public InquiryPriceRefundInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InquiryPriceRefundInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InquiryPriceRefundInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InquiryPriceRefundInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The currency.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The site of the execution host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The refundable amount.</p>
         */
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

}
