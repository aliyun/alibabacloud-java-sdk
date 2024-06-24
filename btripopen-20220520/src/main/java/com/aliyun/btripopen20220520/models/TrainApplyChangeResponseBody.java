// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyChangeResponseBody extends TeaModel {
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
    public TrainApplyChangeResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
     * <p>2103ad0216854277618591626db2b6</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainApplyChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyChangeResponseBody self = new TrainApplyChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainApplyChangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainApplyChangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainApplyChangeResponseBody setModule(TrainApplyChangeResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainApplyChangeResponseBodyModule getModule() {
        return this.module;
    }

    public TrainApplyChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainApplyChangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainApplyChangeResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainApplyChangeResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("change_order_id")
        public String changeOrderId;

        /**
         * <strong>example:</strong>
         * <p>116019444</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1017124195788186048</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_status")
        public String payStatus;

        public static TrainApplyChangeResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyChangeResponseBodyModule self = new TrainApplyChangeResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainApplyChangeResponseBodyModule setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public TrainApplyChangeResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainApplyChangeResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public TrainApplyChangeResponseBodyModule setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

    }

}
