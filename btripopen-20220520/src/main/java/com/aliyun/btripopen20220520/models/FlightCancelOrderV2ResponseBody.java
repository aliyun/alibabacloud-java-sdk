// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCancelOrderV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightCancelOrderV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightCancelOrderV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightCancelOrderV2ResponseBody self = new FlightCancelOrderV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightCancelOrderV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightCancelOrderV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightCancelOrderV2ResponseBody setModule(FlightCancelOrderV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightCancelOrderV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightCancelOrderV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightCancelOrderV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightCancelOrderV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightCancelOrderV2ResponseBodyModule extends TeaModel {
        @NameInMap("cancel_time")
        public String cancelTime;

        public static FlightCancelOrderV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightCancelOrderV2ResponseBodyModule self = new FlightCancelOrderV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightCancelOrderV2ResponseBodyModule setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

    }

}
