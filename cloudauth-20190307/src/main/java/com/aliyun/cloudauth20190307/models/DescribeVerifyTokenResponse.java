// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VerifyPageUrl")
    @Validation(required = true)
    public String verifyPageUrl;

    @NameInMap("VerifyToken")
    @Validation(required = true)
    public String verifyToken;

    @NameInMap("OssUploadToken")
    @Validation(required = true)
    public DescribeVerifyTokenResponseOssUploadToken ossUploadToken;

    public static DescribeVerifyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponse self = new DescribeVerifyTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyTokenResponse setVerifyPageUrl(String verifyPageUrl) {
        this.verifyPageUrl = verifyPageUrl;
        return this;
    }
    public String getVerifyPageUrl() {
        return this.verifyPageUrl;
    }

    public DescribeVerifyTokenResponse setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public DescribeVerifyTokenResponse setOssUploadToken(DescribeVerifyTokenResponseOssUploadToken ossUploadToken) {
        this.ossUploadToken = ossUploadToken;
        return this;
    }
    public DescribeVerifyTokenResponseOssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    public static class DescribeVerifyTokenResponseOssUploadToken extends TeaModel {
        @NameInMap("Bucket")
        @Validation(required = true)
        public String bucket;

        @NameInMap("EndPoint")
        @Validation(required = true)
        public String endPoint;

        @NameInMap("Expired")
        @Validation(required = true)
        public Long expired;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Secret")
        @Validation(required = true)
        public String secret;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        public static DescribeVerifyTokenResponseOssUploadToken build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyTokenResponseOssUploadToken self = new DescribeVerifyTokenResponseOssUploadToken();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyTokenResponseOssUploadToken setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeVerifyTokenResponseOssUploadToken setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeVerifyTokenResponseOssUploadToken setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeVerifyTokenResponseOssUploadToken setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVerifyTokenResponseOssUploadToken setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVerifyTokenResponseOssUploadToken setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public DescribeVerifyTokenResponseOssUploadToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
