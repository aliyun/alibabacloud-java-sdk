// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public AccessTokenResponseBodyData data;

    // 错误信息
    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

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

    public AccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccessTokenResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AccessTokenResponseBodyData extends TeaModel {
        // 过期时间，单位ms
        @NameInMap("expire")
        public Long expire;

        // 令牌
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

}
