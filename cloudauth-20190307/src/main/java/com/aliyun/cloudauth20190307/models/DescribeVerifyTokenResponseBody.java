// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponseBody extends TeaModel {
    @NameInMap("OssUploadToken")
    public DescribeVerifyTokenResponseBodyOssUploadToken ossUploadToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyPageUrl")
    public String verifyPageUrl;

    @NameInMap("VerifyToken")
    public String verifyToken;

    public static DescribeVerifyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenResponseBody self = new DescribeVerifyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenResponseBody setOssUploadToken(DescribeVerifyTokenResponseBodyOssUploadToken ossUploadToken) {
        this.ossUploadToken = ossUploadToken;
        return this;
    }
    public DescribeVerifyTokenResponseBodyOssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    public DescribeVerifyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyTokenResponseBody setVerifyPageUrl(String verifyPageUrl) {
        this.verifyPageUrl = verifyPageUrl;
        return this;
    }
    public String getVerifyPageUrl() {
        return this.verifyPageUrl;
    }

    public DescribeVerifyTokenResponseBody setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static class DescribeVerifyTokenResponseBodyOssUploadToken extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("Expired")
        public Long expired;

        @NameInMap("Key")
        public String key;

        @NameInMap("Path")
        public String path;

        @NameInMap("Secret")
        public String secret;

        @NameInMap("Token")
        public String token;

        public static DescribeVerifyTokenResponseBodyOssUploadToken build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyTokenResponseBodyOssUploadToken self = new DescribeVerifyTokenResponseBodyOssUploadToken();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public DescribeVerifyTokenResponseBodyOssUploadToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
