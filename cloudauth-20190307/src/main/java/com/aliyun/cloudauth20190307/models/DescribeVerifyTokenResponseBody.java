// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponseBody extends TeaModel {
    @NameInMap("VerifyPageUrl")
    public String verifyPageUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyToken")
    public String verifyToken;

    @NameInMap("OssUploadToken")
    public DescribeVerifyTokenResponseBodyOssUploadToken ossUploadToken;

    public static DescribeVerifyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponseBody self = new DescribeVerifyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponseBody setVerifyPageUrl(String verifyPageUrl) {
        this.verifyPageUrl = verifyPageUrl;
        return this;
    }
    public String getVerifyPageUrl() {
        return this.verifyPageUrl;
    }

    public DescribeVerifyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyTokenResponseBody setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public DescribeVerifyTokenResponseBody setOssUploadToken(DescribeVerifyTokenResponseBodyOssUploadToken ossUploadToken) {
        this.ossUploadToken = ossUploadToken;
        return this;
    }
    public DescribeVerifyTokenResponseBodyOssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    public static class DescribeVerifyTokenResponseBodyOssUploadToken extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Token")
        public String token;

        @NameInMap("Secret")
        public String secret;

        @NameInMap("Expired")
        public Long expired;

        @NameInMap("Path")
        public String path;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("Bucket")
        public String bucket;

        public static DescribeVerifyTokenResponseBodyOssUploadToken build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyTokenResponseBodyOssUploadToken self = new DescribeVerifyTokenResponseBodyOssUploadToken();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

}
