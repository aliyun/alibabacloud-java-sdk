// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RefundInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public RefundInstanceResponseBodyData data;

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

    public static class RefundInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The site of the execution host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the refund order that is returned only if the instance is unsubscribed from.</p>
         */
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
