// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data. <strong>Deprecated. Use the</strong> <code>module</code> <strong>field instead</strong>.</p>
     */
    @NameInMap("data")
    public AccessTokenResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("module")
    public AccessTokenResponseBodyModule module;

    /**
     * <p>The unique identifier of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-<strong><strong>-</strong></strong>-****-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The global trace identifier of the request, typically used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce********056433edbb2</p>
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
        /**
         * <p><strong>Deprecated. Use the</strong> <code>module</code> <strong>field instead</strong>.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("expire")
        public Long expire;

        /**
         * <p><strong>Deprecated. Use the</strong> <code>module</code> <strong>field instead</strong>.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
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
        /**
         * <p>The validity duration of the token. The initial value is 2 hours (7200000 ms). To prevent token expiration, set the refresh interval to: <strong>5 minutes ≤ interval ≤ 2 hours</strong>. If you refresh within this interval, the token obtained from the previous request remains valid.</p>
         * 
         * <strong>example:</strong>
         * <p>7200000</p>
         */
        @NameInMap("expire")
        public Long expire;

        /**
         * <p>The time when the token takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1652410740914</p>
         */
        @NameInMap("start")
        public Long start;

        /**
         * <p>The application access token.</p>
         * 
         * <strong>example:</strong>
         * <p>37***df</p>
         */
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
