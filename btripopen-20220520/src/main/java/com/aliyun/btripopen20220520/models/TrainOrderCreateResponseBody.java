// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCreateResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainOrderCreateResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCreateResponseBody self = new TrainOrderCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderCreateResponseBody setModule(TrainOrderCreateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderCreateResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderCreateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderCreateResponseBodyModule extends TeaModel {
        @NameInMap("order_id")
        public String orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("pay_status")
        public String payStatus;

        @NameInMap("service_fee")
        public Long serviceFee;

        public static TrainOrderCreateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateResponseBodyModule self = new TrainOrderCreateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainOrderCreateResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public TrainOrderCreateResponseBodyModule setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public TrainOrderCreateResponseBodyModule setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

    }

}
