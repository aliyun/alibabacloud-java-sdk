// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCancelResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainOrderCancelResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCancelResponseBody self = new TrainOrderCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderCancelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderCancelResponseBody setModule(TrainOrderCancelResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderCancelResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderCancelResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderCancelResponseBodyModule extends TeaModel {
        @NameInMap("change_order_id")
        public String changeOrderId;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("out_change_order_id")
        public String outChangeOrderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("status")
        public Boolean status;

        public static TrainOrderCancelResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCancelResponseBodyModule self = new TrainOrderCancelResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderCancelResponseBodyModule setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public TrainOrderCancelResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainOrderCancelResponseBodyModule setOutChangeOrderId(String outChangeOrderId) {
            this.outChangeOrderId = outChangeOrderId;
            return this;
        }
        public String getOutChangeOrderId() {
            return this.outChangeOrderId;
        }

        public TrainOrderCancelResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public TrainOrderCancelResponseBodyModule setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
