// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssUploadTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OssUploadToken")
    @Validation(required = true)
    public DescribeOssUploadTokenResponseOssUploadToken ossUploadToken;

    public static DescribeOssUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssUploadTokenResponse self = new DescribeOssUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssUploadTokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssUploadTokenResponse setOssUploadToken(DescribeOssUploadTokenResponseOssUploadToken ossUploadToken) {
        this.ossUploadToken = ossUploadToken;
        return this;
    }
    public DescribeOssUploadTokenResponseOssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    public static class DescribeOssUploadTokenResponseOssUploadToken extends TeaModel {
        @NameInMap("Bucket")
        @Validation(required = true)
        public String bucket;

        @NameInMap("EndPoint")
        @Validation(required = true)
        public String endPoint;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Expired")
        @Validation(required = true)
        public Long expired;

        @NameInMap("Secret")
        @Validation(required = true)
        public String secret;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        public static DescribeOssUploadTokenResponseOssUploadToken build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssUploadTokenResponseOssUploadToken self = new DescribeOssUploadTokenResponseOssUploadToken();
            return TeaModel.build(map, self);
        }

        public DescribeOssUploadTokenResponseOssUploadToken setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssUploadTokenResponseOssUploadToken setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeOssUploadTokenResponseOssUploadToken setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeOssUploadTokenResponseOssUploadToken setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeOssUploadTokenResponseOssUploadToken setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public DescribeOssUploadTokenResponseOssUploadToken setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOssUploadTokenResponseOssUploadToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
