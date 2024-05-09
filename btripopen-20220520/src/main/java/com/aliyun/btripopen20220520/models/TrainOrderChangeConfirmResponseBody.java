// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderChangeConfirmResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainOrderChangeConfirmResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderChangeConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderChangeConfirmResponseBody self = new TrainOrderChangeConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderChangeConfirmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderChangeConfirmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderChangeConfirmResponseBody setModule(TrainOrderChangeConfirmResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderChangeConfirmResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderChangeConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderChangeConfirmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderChangeConfirmResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderChangeConfirmResponseBodyModule extends TeaModel {
        @NameInMap("change_order_id")
        public String changeOrderId;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("status")
        public Boolean status;

        public static TrainOrderChangeConfirmResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderChangeConfirmResponseBodyModule self = new TrainOrderChangeConfirmResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderChangeConfirmResponseBodyModule setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public TrainOrderChangeConfirmResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainOrderChangeConfirmResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public TrainOrderChangeConfirmResponseBodyModule setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
