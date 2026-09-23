// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AddCreditSeatsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddCreditSeatsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddCreditSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCreditSeatsResponseBody self = new AddCreditSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCreditSeatsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddCreditSeatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddCreditSeatsResponseBody setData(AddCreditSeatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddCreditSeatsResponseBodyData getData() {
        return this.data;
    }

    public AddCreditSeatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddCreditSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCreditSeatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddCreditSeatsResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static AddCreditSeatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddCreditSeatsResponseBodyData self = new AddCreditSeatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddCreditSeatsResponseBodyData setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public AddCreditSeatsResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
