// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundApplyResponseBody extends TeaModel {
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
    public IntlFlightRefundApplyResponseBodyModule module;

    /**
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
     * <strong>example:</strong>
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightRefundApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundApplyResponseBody self = new IntlFlightRefundApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightRefundApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightRefundApplyResponseBody setModule(IntlFlightRefundApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightRefundApplyResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightRefundApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightRefundApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightRefundApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightRefundApplyResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025011317110900006</p>
         */
        @NameInMap("out_refund_apply_id")
        public String outRefundApplyId;

        /**
         * <strong>example:</strong>
         * <p>1000000005186043</p>
         */
        @NameInMap("refund_apply_id")
        public String refundApplyId;

        public static IntlFlightRefundApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundApplyResponseBodyModule self = new IntlFlightRefundApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundApplyResponseBodyModule setOutRefundApplyId(String outRefundApplyId) {
            this.outRefundApplyId = outRefundApplyId;
            return this;
        }
        public String getOutRefundApplyId() {
            return this.outRefundApplyId;
        }

        public IntlFlightRefundApplyResponseBodyModule setRefundApplyId(String refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

    }

}
