// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyToken")
    public GetVerifyTokenResponseBodyVerifyToken verifyToken;

    public static GetVerifyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyTokenResponseBody self = new GetVerifyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVerifyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVerifyTokenResponseBody setVerifyToken(GetVerifyTokenResponseBodyVerifyToken verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }
    public GetVerifyTokenResponseBodyVerifyToken getVerifyToken() {
        return this.verifyToken;
    }

    public static class GetVerifyTokenResponseBodyVerifyToken extends TeaModel {
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Token")
        public String token;

        @NameInMap("Url")
        public String url;

        public static GetVerifyTokenResponseBodyVerifyToken build(java.util.Map<String, ?> map) throws Exception {
            GetVerifyTokenResponseBodyVerifyToken self = new GetVerifyTokenResponseBodyVerifyToken();
            return TeaModel.build(map, self);
        }

        public GetVerifyTokenResponseBodyVerifyToken setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetVerifyTokenResponseBodyVerifyToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetVerifyTokenResponseBodyVerifyToken setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
