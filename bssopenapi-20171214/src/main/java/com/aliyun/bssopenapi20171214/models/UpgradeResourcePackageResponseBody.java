// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageResponseBody extends TeaModel {
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
    public UpgradeResourcePackageResponseBodyData data;

    public static UpgradeResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageResponseBody self = new UpgradeResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeResourcePackageResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpgradeResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradeResourcePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeResourcePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeResourcePackageResponseBody setData(UpgradeResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public static class UpgradeResourcePackageResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static UpgradeResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeResourcePackageResponseBodyData self = new UpgradeResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeResourcePackageResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public UpgradeResourcePackageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
