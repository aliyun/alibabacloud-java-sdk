// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderCancelResponseBody extends TeaModel {
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
    public IntlFlightOrderCancelResponseBodyModule module;

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

    public static IntlFlightOrderCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderCancelResponseBody self = new IntlFlightOrderCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderCancelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightOrderCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightOrderCancelResponseBody setModule(IntlFlightOrderCancelResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightOrderCancelResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightOrderCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightOrderCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightOrderCancelResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightOrderCancelResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-10 17:45:32</p>
         */
        @NameInMap("cancel_time")
        public String cancelTime;

        public static IntlFlightOrderCancelResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderCancelResponseBodyModule self = new IntlFlightOrderCancelResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderCancelResponseBodyModule setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

    }

}
