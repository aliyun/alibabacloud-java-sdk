// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public AccessTokenResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AccessTokenResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>成功标识</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static AccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccessTokenResponseBody self = new AccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public AccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AccessTokenResponseBody setData(AccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AccessTokenResponseBodyData getData() {
        return this.data;
    }

    public AccessTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccessTokenResponseBody setModule(AccessTokenResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AccessTokenResponseBodyModule getModule() {
        return this.module;
    }

    public AccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccessTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AccessTokenResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AccessTokenResponseBodyData extends TeaModel {
        @NameInMap("expire")
        public Long expire;

        @NameInMap("token")
        public String token;

        public static AccessTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccessTokenResponseBodyData self = new AccessTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccessTokenResponseBodyData setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public AccessTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class AccessTokenResponseBodyModule extends TeaModel {
        @NameInMap("expire")
        public Long expire;

        @NameInMap("start")
        public Long start;

        @NameInMap("token")
        public String token;

        public static AccessTokenResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AccessTokenResponseBodyModule self = new AccessTokenResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AccessTokenResponseBodyModule setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public AccessTokenResponseBodyModule setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public AccessTokenResponseBodyModule setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
