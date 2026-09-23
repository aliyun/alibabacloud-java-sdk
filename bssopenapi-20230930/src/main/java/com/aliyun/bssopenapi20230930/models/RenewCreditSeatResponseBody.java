// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class RenewCreditSeatResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RenewCreditSeatResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RenewCreditSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewCreditSeatResponseBody self = new RenewCreditSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewCreditSeatResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RenewCreditSeatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewCreditSeatResponseBody setData(RenewCreditSeatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenewCreditSeatResponseBodyData getData() {
        return this.data;
    }

    public RenewCreditSeatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewCreditSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewCreditSeatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RenewCreditSeatResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        public static RenewCreditSeatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenewCreditSeatResponseBodyData self = new RenewCreditSeatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenewCreditSeatResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
