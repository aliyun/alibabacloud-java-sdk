// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateResourcePackageResponseData data;

    public static CreateResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageResponse self = new CreateResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourcePackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourcePackageResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateResourcePackageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateResourcePackageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateResourcePackageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateResourcePackageResponse setData(CreateResourcePackageResponseData data) {
        this.data = data;
        return this;
    }
    public CreateResourcePackageResponseData getData() {
        return this.data;
    }

    public static class CreateResourcePackageResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static CreateResourcePackageResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateResourcePackageResponseData self = new CreateResourcePackageResponseData();
            return TeaModel.build(map, self);
        }

        public CreateResourcePackageResponseData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateResourcePackageResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
