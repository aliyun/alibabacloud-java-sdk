// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class TempAccessTokenIntlResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public TempAccessTokenIntlResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TempAccessTokenIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TempAccessTokenIntlResponseBody self = new TempAccessTokenIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public TempAccessTokenIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TempAccessTokenIntlResponseBody setData(TempAccessTokenIntlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TempAccessTokenIntlResponseBodyData getData() {
        return this.data;
    }

    public TempAccessTokenIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TempAccessTokenIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TempAccessTokenIntlResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKeyId of the temporary credential for file upload.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The temporary authorization secret.</p>
         * 
         * <strong>example:</strong>
         * <p>3hxuRpEJ3Jv2Rtzyg4HooFCYqps762XcNtzhn19wQymk</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>liyi</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The file name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("FileNamePrefix")
        public String fileNamePrefix;

        /**
         * <p>OssEndPoint。</p>
         * 
         * <strong>example:</strong>
         * <p>ossEndPoint</p>
         */
        @NameInMap("OssEndPoint")
        public String ossEndPoint;

        /**
         * <p>The security token of the temporary credential for file upload.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        public static TempAccessTokenIntlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TempAccessTokenIntlResponseBodyData self = new TempAccessTokenIntlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TempAccessTokenIntlResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public TempAccessTokenIntlResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public TempAccessTokenIntlResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public TempAccessTokenIntlResponseBodyData setFileNamePrefix(String fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public String getFileNamePrefix() {
            return this.fileNamePrefix;
        }

        public TempAccessTokenIntlResponseBodyData setOssEndPoint(String ossEndPoint) {
            this.ossEndPoint = ossEndPoint;
            return this;
        }
        public String getOssEndPoint() {
            return this.ossEndPoint;
        }

        public TempAccessTokenIntlResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
