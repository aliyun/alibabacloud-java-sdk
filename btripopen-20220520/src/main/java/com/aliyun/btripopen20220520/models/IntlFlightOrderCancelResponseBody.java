// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderCancelResponseBody extends TeaModel {
    @NameInMap("module")
    public IntlFlightOrderCancelResponseBodyModule module;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

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
