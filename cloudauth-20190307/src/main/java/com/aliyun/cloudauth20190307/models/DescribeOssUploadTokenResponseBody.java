// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssUploadTokenResponseBody extends TeaModel {
    @NameInMap("OssUploadToken")
    public DescribeOssUploadTokenResponseBodyOssUploadToken ossUploadToken;

    /**
     * <strong>example:</strong>
     * <p>2FA2C773-47DB-4156-B1EE-5B047321A939</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOssUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssUploadTokenResponseBody self = new DescribeOssUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssUploadTokenResponseBody setOssUploadToken(DescribeOssUploadTokenResponseBodyOssUploadToken ossUploadToken) {
        this.ossUploadToken = ossUploadToken;
        return this;
    }
    public DescribeOssUploadTokenResponseBodyOssUploadToken getOssUploadToken() {
        return this.ossUploadToken;
    }

    public DescribeOssUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOssUploadTokenResponseBodyOssUploadToken extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloudauth-zhangjiakou-external</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-zhangjiakou.aliyuncs.com">https://oss-cn-zhangjiakou.aliyuncs.com</a></p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <strong>example:</strong>
         * <p>1582636610000</p>
         */
        @NameInMap("Expired")
        public Long expired;

        /**
         * <strong>example:</strong>
         * <p>STS.NU8rUBj****</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>prod/RdNLC@Ox2n-1s7NMt</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>FwmnyoqT8dHj7nJLuM67T****</p>
         */
        @NameInMap("Secret")
        public String secret;

        /**
         * <strong>example:</strong>
         * <p>uWia500nTS5knZaDzq4/KqpvhcLnO****</p>
         */
        @NameInMap("Token")
        public String token;

        public static DescribeOssUploadTokenResponseBodyOssUploadToken build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssUploadTokenResponseBodyOssUploadToken self = new DescribeOssUploadTokenResponseBodyOssUploadToken();
            return TeaModel.build(map, self);
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public DescribeOssUploadTokenResponseBodyOssUploadToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
