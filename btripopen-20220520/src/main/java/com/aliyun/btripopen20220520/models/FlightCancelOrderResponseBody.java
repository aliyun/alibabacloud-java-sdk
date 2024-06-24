// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCancelOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightCancelOrderResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightCancelOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightCancelOrderResponseBody self = new FlightCancelOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightCancelOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightCancelOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightCancelOrderResponseBody setModule(FlightCancelOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightCancelOrderResponseBodyModule getModule() {
        return this.module;
    }

    public FlightCancelOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightCancelOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightCancelOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightCancelOrderResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("cancel_time")
        public String cancelTime;

        @NameInMap("fail_code")
        public String failCode;

        @NameInMap("fail_reason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("order_status")
        public String orderStatus;

        public static FlightCancelOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightCancelOrderResponseBodyModule self = new FlightCancelOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightCancelOrderResponseBodyModule setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

        public FlightCancelOrderResponseBodyModule setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public FlightCancelOrderResponseBodyModule setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public FlightCancelOrderResponseBodyModule setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

    }

}
