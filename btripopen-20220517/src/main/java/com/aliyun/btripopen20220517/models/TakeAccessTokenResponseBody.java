// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220517.models;

import com.aliyun.tea.*;

public class TakeAccessTokenResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public TakeAccessTokenResponseBodyData data;

    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static TakeAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TakeAccessTokenResponseBody self = new TakeAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public TakeAccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TakeAccessTokenResponseBody setData(TakeAccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TakeAccessTokenResponseBodyData getData() {
        return this.data;
    }

    public TakeAccessTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TakeAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TakeAccessTokenResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class TakeAccessTokenResponseBodyData extends TeaModel {
        @NameInMap("access_token")
        public String accessToken;

        @NameInMap("expire")
        public Long expire;

        public static TakeAccessTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TakeAccessTokenResponseBodyData self = new TakeAccessTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TakeAccessTokenResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public TakeAccessTokenResponseBodyData setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

    }

}
