// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeUploadTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeUploadTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadTokenResponseBody self = new DescribeUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUploadTokenResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeUploadTokenResponseBody setData(DescribeUploadTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUploadTokenResponseBodyData getData() {
        return this.data;
    }

    public DescribeUploadTokenResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUploadTokenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STS.NUEUjvDqMuvH6oQA1TXxxH4wVR</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>oss-cip-shanghai</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>1720577200</p>
         */
        @NameInMap("Expiration")
        public Integer expiration;

        /**
         * <strong>example:</strong>
         * <p>upload/1xxb89/</p>
         */
        @NameInMap("FileNamePrefix")
        public String fileNamePrefix;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-shanghai-internal.aliyuncs.com">https://oss-cn-shanghai-internal.aliyuncs.com</a></p>
         */
        @NameInMap("OssInternalEndPoint")
        public String ossInternalEndPoint;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-shanghai.aliyuncs.com">https://oss-cn-shanghai.aliyuncs.com</a></p>
         */
        @NameInMap("OssInternetEndPoint")
        public String ossInternetEndPoint;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        public static DescribeUploadTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUploadTokenResponseBodyData self = new DescribeUploadTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUploadTokenResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeUploadTokenResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeUploadTokenResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeUploadTokenResponseBodyData setExpiration(Integer expiration) {
            this.expiration = expiration;
            return this;
        }
        public Integer getExpiration() {
            return this.expiration;
        }

        public DescribeUploadTokenResponseBodyData setFileNamePrefix(String fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public String getFileNamePrefix() {
            return this.fileNamePrefix;
        }

        public DescribeUploadTokenResponseBodyData setOssInternalEndPoint(String ossInternalEndPoint) {
            this.ossInternalEndPoint = ossInternalEndPoint;
            return this;
        }
        public String getOssInternalEndPoint() {
            return this.ossInternalEndPoint;
        }

        public DescribeUploadTokenResponseBodyData setOssInternetEndPoint(String ossInternetEndPoint) {
            this.ossInternetEndPoint = ossInternetEndPoint;
            return this;
        }
        public String getOssInternetEndPoint() {
            return this.ossInternetEndPoint;
        }

        public DescribeUploadTokenResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
