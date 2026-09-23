// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCreditSeatResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateCreditSeatResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCreditSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditSeatResponseBody self = new CreateCreditSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCreditSeatResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateCreditSeatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCreditSeatResponseBody setData(CreateCreditSeatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCreditSeatResponseBodyData getData() {
        return this.data;
    }

    public CreateCreditSeatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCreditSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCreditSeatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCreditSeatResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreateCreditSeatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCreditSeatResponseBodyData self = new CreateCreditSeatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCreditSeatResponseBodyData setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public CreateCreditSeatResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
