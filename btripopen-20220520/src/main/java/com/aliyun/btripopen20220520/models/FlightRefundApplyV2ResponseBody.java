// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightRefundApplyV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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

    public static FlightRefundApplyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyV2ResponseBody self = new FlightRefundApplyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightRefundApplyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightRefundApplyV2ResponseBody setModule(FlightRefundApplyV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightRefundApplyV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightRefundApplyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightRefundApplyV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightRefundApplyV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightRefundApplyV2ResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1683901850297448200</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1017002195370467200</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>1019195836916039</p>
         */
        @NameInMap("out_sub_order_id")
        public String outSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>1000000000297003</p>
         */
        @NameInMap("sub_order_id")
        public String subOrderId;

        public static FlightRefundApplyV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundApplyV2ResponseBodyModule self = new FlightRefundApplyV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightRefundApplyV2ResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public FlightRefundApplyV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightRefundApplyV2ResponseBodyModule setOutSubOrderId(String outSubOrderId) {
            this.outSubOrderId = outSubOrderId;
            return this;
        }
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        public FlightRefundApplyV2ResponseBodyModule setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

    }

}
