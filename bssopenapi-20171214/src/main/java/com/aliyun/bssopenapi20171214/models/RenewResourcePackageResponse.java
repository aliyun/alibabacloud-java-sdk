// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageResponse extends TeaModel {
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
    public RenewResourcePackageResponseData data;

    public static RenewResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageResponse self = new RenewResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public RenewResourcePackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewResourcePackageResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RenewResourcePackageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenewResourcePackageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewResourcePackageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewResourcePackageResponse setData(RenewResourcePackageResponseData data) {
        this.data = data;
        return this;
    }
    public RenewResourcePackageResponseData getData() {
        return this.data;
    }

    public static class RenewResourcePackageResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static RenewResourcePackageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RenewResourcePackageResponseData self = new RenewResourcePackageResponseData();
            return TeaModel.build(map, self);
        }

        public RenewResourcePackageResponseData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public RenewResourcePackageResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
