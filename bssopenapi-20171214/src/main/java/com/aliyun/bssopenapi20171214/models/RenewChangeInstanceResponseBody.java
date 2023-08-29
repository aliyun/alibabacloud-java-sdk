// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewChangeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RenewChangeInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RenewChangeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewChangeInstanceResponseBody self = new RenewChangeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewChangeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewChangeInstanceResponseBody setData(RenewChangeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenewChangeInstanceResponseBodyData getData() {
        return this.data;
    }

    public RenewChangeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewChangeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewChangeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RenewChangeInstanceResponseBodyData extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("OrderId")
        public String orderId;

        public static RenewChangeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenewChangeInstanceResponseBodyData self = new RenewChangeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenewChangeInstanceResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public RenewChangeInstanceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
