// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderCancelResponseBody extends TeaModel {
    @NameInMap("module")
    public IntlFlightOrderCancelResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A3F8DCAB-8301-5770-BD9F-71B0BF9E1A6E</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("trace_id")
    public String traceId;

    public static IntlFlightOrderCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderCancelResponseBody self = new IntlFlightOrderCancelResponseBody();
        return TeaModel.build(map, self);
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

    public IntlFlightOrderCancelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightOrderCancelResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
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
