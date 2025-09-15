// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCancelResponseBody extends TeaModel {
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
    public IntlFlightReShopCancelResponseBodyModule module;

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

    public static IntlFlightReShopCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCancelResponseBody self = new IntlFlightReShopCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCancelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopCancelResponseBody setModule(IntlFlightReShopCancelResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopCancelResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopCancelResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopCancelResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-10 17:45:32</p>
         */
        @NameInMap("cancel_time")
        public String cancelTime;

        public static IntlFlightReShopCancelResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopCancelResponseBodyModule self = new IntlFlightReShopCancelResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopCancelResponseBodyModule setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

    }

}
