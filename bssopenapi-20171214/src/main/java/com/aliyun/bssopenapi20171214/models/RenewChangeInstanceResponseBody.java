// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewChangeInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public RenewChangeInstanceResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success=true indicates that the call was successful. success=false indicates that an error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The site where the host runs.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.64.1:8150</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the successfully created order.</p>
         * 
         * <strong>example:</strong>
         * <p>202407022550621</p>
         */
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
