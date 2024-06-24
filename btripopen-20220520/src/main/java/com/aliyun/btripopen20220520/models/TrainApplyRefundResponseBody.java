// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyRefundResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainApplyRefundResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainApplyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyRefundResponseBody self = new TrainApplyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainApplyRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainApplyRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainApplyRefundResponseBody setModule(TrainApplyRefundResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainApplyRefundResponseBodyModule getModule() {
        return this.module;
    }

    public TrainApplyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainApplyRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainApplyRefundResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainApplyRefundResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>116019444</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1017002195370467200</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        public static TrainApplyRefundResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyRefundResponseBodyModule self = new TrainApplyRefundResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainApplyRefundResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainApplyRefundResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

    }

}
