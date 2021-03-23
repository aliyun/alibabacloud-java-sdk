// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public RenewResourcePackageResponseBodyData data;

    public static RenewResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageResponseBody self = new RenewResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewResourcePackageResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RenewResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenewResourcePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewResourcePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewResourcePackageResponseBody setData(RenewResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenewResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public static class RenewResourcePackageResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static RenewResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenewResourcePackageResponseBodyData self = new RenewResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenewResourcePackageResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public RenewResourcePackageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
