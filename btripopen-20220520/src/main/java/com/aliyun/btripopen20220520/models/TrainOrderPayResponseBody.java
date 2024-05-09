// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderPayResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainOrderPayResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderPayResponseBody self = new TrainOrderPayResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderPayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderPayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderPayResponseBody setModule(TrainOrderPayResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderPayResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderPayResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderPayResponseBodyModule extends TeaModel {
        @NameInMap("order_id")
        public String orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("status")
        public Boolean status;

        public static TrainOrderPayResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderPayResponseBodyModule self = new TrainOrderPayResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderPayResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainOrderPayResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public TrainOrderPayResponseBodyModule setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
