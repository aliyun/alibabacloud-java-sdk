// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public RenewResourcePackageResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RenewResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageResponseBody self = new RenewResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewResourcePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewResourcePackageResponseBody setData(RenewResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenewResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public RenewResourcePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewResourcePackageResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RenewResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RenewResourcePackageResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the resource plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the order.</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static RenewResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenewResourcePackageResponseBodyData self = new RenewResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenewResourcePackageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RenewResourcePackageResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
