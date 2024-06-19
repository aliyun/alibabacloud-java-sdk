// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenResponseBody extends TeaModel {
    @NameInMap("OssUploadToken")
    public DescribeVerifyTokenResponseBodyOssUploadToken ossUploadToken;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("VerifyPageUrl")
    public String verifyPageUrl;

    /**
     * <strong>example:</strong>
     * <p>c302c0797679457685410ee51a5ba375</p>
     */
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
