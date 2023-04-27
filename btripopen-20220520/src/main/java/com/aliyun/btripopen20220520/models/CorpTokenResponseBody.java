// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpTokenResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CorpTokenResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CorpTokenResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>是否成功</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CorpTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CorpTokenResponseBody self = new CorpTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CorpTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CorpTokenResponseBody setData(CorpTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CorpTokenResponseBodyData getData() {
        return this.data;
    }

    public CorpTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CorpTokenResponseBody setModule(CorpTokenResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CorpTokenResponseBodyModule getModule() {
        return this.module;
    }

    public CorpTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CorpTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CorpTokenResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CorpTokenResponseBodyData extends TeaModel {
        @NameInMap("expire")
        public Long expire;

        @NameInMap("token")
        public String token;

        public static CorpTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CorpTokenResponseBodyData self = new CorpTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CorpTokenResponseBodyData setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public CorpTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class CorpTokenResponseBodyModule extends TeaModel {
        @NameInMap("expire")
        public Long expire;

        @NameInMap("start")
        public Long start;

        @NameInMap("token")
        public String token;

        public static CorpTokenResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CorpTokenResponseBodyModule self = new CorpTokenResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CorpTokenResponseBodyModule setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public CorpTokenResponseBodyModule setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public CorpTokenResponseBodyModule setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
