// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public AccessTokenResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AccessTokenResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>成功标识</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
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
         * <strong>example:</strong>
         * <p>70000</p>
         */
        @NameInMap("expire")
        public Long expire;

        /**
         * <strong>example:</strong>
         * <p>37j76df</p>
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
         * <strong>example:</strong>
         * <p>70000</p>
         */
        @NameInMap("expire")
        public Long expire;

        /**
         * <strong>example:</strong>
         * <p>1652410740914</p>
         */
        @NameInMap("start")
        public Long start;

        /**
         * <strong>example:</strong>
         * <p>37j76df</p>
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
