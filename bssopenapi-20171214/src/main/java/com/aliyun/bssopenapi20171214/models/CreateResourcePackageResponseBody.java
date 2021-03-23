// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageResponseBody extends TeaModel {
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
    public CreateResourcePackageResponseBodyData data;

    public static CreateResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageResponseBody self = new CreateResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourcePackageResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateResourcePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateResourcePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateResourcePackageResponseBody setData(CreateResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public static class CreateResourcePackageResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateResourcePackageResponseBodyData self = new CreateResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateResourcePackageResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateResourcePackageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
