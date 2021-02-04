// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageResponse extends TeaModel {
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
    public UpgradeResourcePackageResponseData data;

    public static UpgradeResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageResponse self = new UpgradeResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeResourcePackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeResourcePackageResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpgradeResourcePackageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradeResourcePackageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeResourcePackageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeResourcePackageResponse setData(UpgradeResourcePackageResponseData data) {
        this.data = data;
        return this;
    }
    public UpgradeResourcePackageResponseData getData() {
        return this.data;
    }

    public static class UpgradeResourcePackageResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static UpgradeResourcePackageResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeResourcePackageResponseData self = new UpgradeResourcePackageResponseData();
            return TeaModel.build(map, self);
        }

        public UpgradeResourcePackageResponseData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public UpgradeResourcePackageResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
