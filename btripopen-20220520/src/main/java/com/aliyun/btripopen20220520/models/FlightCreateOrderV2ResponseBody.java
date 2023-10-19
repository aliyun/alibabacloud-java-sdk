// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightCreateOrderV2ResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightCreateOrderV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderV2ResponseBody self = new FlightCreateOrderV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightCreateOrderV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightCreateOrderV2ResponseBody setModule(FlightCreateOrderV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightCreateOrderV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightCreateOrderV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightCreateOrderV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightCreateOrderV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightCreateOrderV2ResponseBodyModule extends TeaModel {
        @NameInMap("async_create_order_key")
        public String asyncCreateOrderKey;

        @NameInMap("latest_pay_time")
        public String latestPayTime;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("total_price")
        public Long totalPrice;

        public static FlightCreateOrderV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightCreateOrderV2ResponseBodyModule self = new FlightCreateOrderV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightCreateOrderV2ResponseBodyModule setAsyncCreateOrderKey(String asyncCreateOrderKey) {
            this.asyncCreateOrderKey = asyncCreateOrderKey;
            return this;
        }
        public String getAsyncCreateOrderKey() {
            return this.asyncCreateOrderKey;
        }

        public FlightCreateOrderV2ResponseBodyModule setLatestPayTime(String latestPayTime) {
            this.latestPayTime = latestPayTime;
            return this;
        }
        public String getLatestPayTime() {
            return this.latestPayTime;
        }

        public FlightCreateOrderV2ResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightCreateOrderV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightCreateOrderV2ResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightCreateOrderV2ResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

    }

}
