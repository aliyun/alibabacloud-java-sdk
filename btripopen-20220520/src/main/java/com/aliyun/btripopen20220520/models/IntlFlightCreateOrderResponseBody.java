// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderResponseBody extends TeaModel {
    @NameInMap("http_status_code")
    public Integer httpStatusCode;

    @NameInMap("module")
    public IntlFlightCreateOrderResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderResponseBody self = new IntlFlightCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public IntlFlightCreateOrderResponseBody setModule(IntlFlightCreateOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightCreateOrderResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightCreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightCreateOrderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightCreateOrderResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public IntlFlightCreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightCreateOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightCreateOrderResponseBodyModule extends TeaModel {
        @NameInMap("async_create_order_key")
        public String asyncCreateOrderKey;

        @NameInMap("latest_pay_time")
        public String latestPayTime;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("pay_status")
        public Integer payStatus;

        @NameInMap("status")
        public Integer status;

        @NameInMap("total_price")
        public Long totalPrice;

        public static IntlFlightCreateOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderResponseBodyModule self = new IntlFlightCreateOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderResponseBodyModule setAsyncCreateOrderKey(String asyncCreateOrderKey) {
            this.asyncCreateOrderKey = asyncCreateOrderKey;
            return this;
        }
        public String getAsyncCreateOrderKey() {
            return this.asyncCreateOrderKey;
        }

        public IntlFlightCreateOrderResponseBodyModule setLatestPayTime(String latestPayTime) {
            this.latestPayTime = latestPayTime;
            return this;
        }
        public String getLatestPayTime() {
            return this.latestPayTime;
        }

        public IntlFlightCreateOrderResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public IntlFlightCreateOrderResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public IntlFlightCreateOrderResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public IntlFlightCreateOrderResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IntlFlightCreateOrderResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

    }

}
