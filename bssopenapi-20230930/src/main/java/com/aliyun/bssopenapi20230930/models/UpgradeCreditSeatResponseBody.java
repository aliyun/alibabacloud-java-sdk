// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpgradeCreditSeatResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpgradeCreditSeatResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpgradeCreditSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCreditSeatResponseBody self = new UpgradeCreditSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeCreditSeatResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpgradeCreditSeatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeCreditSeatResponseBody setData(UpgradeCreditSeatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeCreditSeatResponseBodyData getData() {
        return this.data;
    }

    public UpgradeCreditSeatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeCreditSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeCreditSeatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeCreditSeatResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static UpgradeCreditSeatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeCreditSeatResponseBodyData self = new UpgradeCreditSeatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeCreditSeatResponseBodyData setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public UpgradeCreditSeatResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
