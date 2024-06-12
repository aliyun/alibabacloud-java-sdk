// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripCCInfoQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public java.util.List<TripCCInfoQueryResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TripCCInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TripCCInfoQueryResponseBody self = new TripCCInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TripCCInfoQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TripCCInfoQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TripCCInfoQueryResponseBody setModule(java.util.List<TripCCInfoQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<TripCCInfoQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public TripCCInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TripCCInfoQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TripCCInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TripCCInfoQueryResponseBodyModule extends TeaModel {
        @NameInMap("notifier")
        public String notifier;

        @NameInMap("notify_start_time")
        public Long notifyStartTime;

        public static TripCCInfoQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TripCCInfoQueryResponseBodyModule self = new TripCCInfoQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TripCCInfoQueryResponseBodyModule setNotifier(String notifier) {
            this.notifier = notifier;
            return this;
        }
        public String getNotifier() {
            return this.notifier;
        }

        public TripCCInfoQueryResponseBodyModule setNotifyStartTime(Long notifyStartTime) {
            this.notifyStartTime = notifyStartTime;
            return this;
        }
        public Long getNotifyStartTime() {
            return this.notifyStartTime;
        }

    }

}
