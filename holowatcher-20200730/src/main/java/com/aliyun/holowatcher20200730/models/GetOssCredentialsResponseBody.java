// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetOssCredentialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 对象实例。
    @NameInMap("Result")
    public GetOssCredentialsResponseBodyResult result;

    public static GetOssCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCredentialsResponseBody self = new GetOssCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssCredentialsResponseBody setResult(GetOssCredentialsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOssCredentialsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOssCredentialsResponseBodyResult extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetOssCredentialsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOssCredentialsResponseBodyResult self = new GetOssCredentialsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOssCredentialsResponseBodyResult setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssCredentialsResponseBodyResult setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetOssCredentialsResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetOssCredentialsResponseBodyResult setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetOssCredentialsResponseBodyResult setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetOssCredentialsResponseBodyResult setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
