// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripBusinessInstanceQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public TripBusinessInstanceQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TripBusinessInstanceQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TripBusinessInstanceQueryResponseBody self = new TripBusinessInstanceQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TripBusinessInstanceQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TripBusinessInstanceQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TripBusinessInstanceQueryResponseBody setModule(TripBusinessInstanceQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TripBusinessInstanceQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TripBusinessInstanceQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TripBusinessInstanceQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TripBusinessInstanceQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TripBusinessInstanceQueryResponseBodyModule extends TeaModel {
        @NameInMap("creator")
        public String creator;

        @NameInMap("gmt_create")
        public Long gmtCreate;

        @NameInMap("gmt_modified")
        public Long gmtModified;

        @NameInMap("status")
        public String status;

        public static TripBusinessInstanceQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TripBusinessInstanceQueryResponseBodyModule self = new TripBusinessInstanceQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TripBusinessInstanceQueryResponseBodyModule setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public TripBusinessInstanceQueryResponseBodyModule setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public TripBusinessInstanceQueryResponseBodyModule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public TripBusinessInstanceQueryResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
