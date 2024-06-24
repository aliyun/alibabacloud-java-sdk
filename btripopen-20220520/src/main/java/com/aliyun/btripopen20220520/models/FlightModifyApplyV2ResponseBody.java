// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyApplyV2ResponseBody extends TeaModel {
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
    public FlightModifyApplyV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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
     * <p>212a8b8216915622178333839e665d</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightModifyApplyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyApplyV2ResponseBody self = new FlightModifyApplyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightModifyApplyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightModifyApplyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightModifyApplyV2ResponseBody setModule(FlightModifyApplyV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightModifyApplyV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightModifyApplyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightModifyApplyV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightModifyApplyV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightModifyApplyV2ResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1017002195370467138</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1017002195370467137</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>1019195786853020</p>
         */
        @NameInMap("out_sub_order_id")
        public String outSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>1019195786853020</p>
         */
        @NameInMap("sub_order_id")
        public String subOrderId;

        public static FlightModifyApplyV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyApplyV2ResponseBodyModule self = new FlightModifyApplyV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightModifyApplyV2ResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public FlightModifyApplyV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightModifyApplyV2ResponseBodyModule setOutSubOrderId(String outSubOrderId) {
            this.outSubOrderId = outSubOrderId;
            return this;
        }
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        public FlightModifyApplyV2ResponseBodyModule setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

    }

}
