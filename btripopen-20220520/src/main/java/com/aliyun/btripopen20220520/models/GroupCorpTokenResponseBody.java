// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupCorpTokenResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public GroupCorpTokenResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static GroupCorpTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GroupCorpTokenResponseBody self = new GroupCorpTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GroupCorpTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GroupCorpTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GroupCorpTokenResponseBody setModule(GroupCorpTokenResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GroupCorpTokenResponseBodyModule getModule() {
        return this.module;
    }

    public GroupCorpTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GroupCorpTokenResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GroupCorpTokenResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GroupCorpTokenResponseBodyModule extends TeaModel {
        @NameInMap("expire")
        public Long expire;

        @NameInMap("start")
        public Long start;

        @NameInMap("token")
        public String token;

        public static GroupCorpTokenResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GroupCorpTokenResponseBodyModule self = new GroupCorpTokenResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GroupCorpTokenResponseBodyModule setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public GroupCorpTokenResponseBodyModule setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GroupCorpTokenResponseBodyModule setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
