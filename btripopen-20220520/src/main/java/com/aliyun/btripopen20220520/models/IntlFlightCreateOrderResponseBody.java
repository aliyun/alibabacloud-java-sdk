// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IntlFlightCreateOrderResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderResponseBody self = new IntlFlightCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightCreateOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("pay_latest_time")
        public String payLatestTime;

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

        public IntlFlightCreateOrderResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IntlFlightCreateOrderResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public IntlFlightCreateOrderResponseBodyModule setPayLatestTime(String payLatestTime) {
            this.payLatestTime = payLatestTime;
            return this;
        }
        public String getPayLatestTime() {
            return this.payLatestTime;
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
