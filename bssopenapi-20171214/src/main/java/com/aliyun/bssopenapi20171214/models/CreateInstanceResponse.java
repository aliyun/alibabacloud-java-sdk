// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    public CreateInstanceResponseData data;

    public static CreateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponse self = new CreateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateInstanceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstanceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInstanceResponse setData(CreateInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public CreateInstanceResponseData getData() {
        return this.data;
    }

    public static class CreateInstanceResponseData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        public static CreateInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseData self = new CreateInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
