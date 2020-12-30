// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssUploadTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OssUploadToken")
    public DescribeOssUploadTokenResponseBodyOssUploadToken ossUploadToken;

    public static DescribeOssUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssUploadTokenResponseBody self = new DescribeOssUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssUploadTokenResponseBody setOssUploadToken(DescribeOssUploadTokenResponseBodyOssUploadToken ossUploadToken) {
        this.ossUploadToken = ossUploadToken;
        return this;
    }
    public DescribeOssUploadTokenResponseBodyOssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    public static class DescribeOssUploadTokenResponseBodyOssUploadToken extends TeaModel {
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

        public static DescribeOssUploadTokenResponseBodyOssUploadToken build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssUploadTokenResponseBodyOssUploadToken self = new DescribeOssUploadTokenResponseBodyOssUploadToken();
            return TeaModel.build(map, self);
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

}
