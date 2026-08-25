// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetFileUploadInfoResponseBody extends TeaModel {
    /**
     * <p>Returns None.</p>
     */
    @NameInMap("Data")
    public GetFileUploadInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadInfoResponseBody self = new GetFileUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileUploadInfoResponseBody setData(GetFileUploadInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileUploadInfoResponseBodyData getData() {
        return this.data;
    }

    public GetFileUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileUploadInfoResponseBodyData extends TeaModel {
        /**
         * <p>The temporary AccessKey ID returned by Security Token Service (STS).</p>
         * 
         * <strong>example:</strong>
         * <p>LTA****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>appstream-*</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The folder path.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai/aig_upm/***</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The maximum file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>52428800</p>
         */
        @NameInMap("MaxFileSize")
        public Long maxFileSize;

        /**
         * <p>The OSS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("OssPoint")
        public String ossPoint;

        /**
         * <p>The PostObject policy (Base64-encoded).</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F591F0EA-AA10-52D2-ADA3-68397887B17C</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The PostObject policy signature (HMAC-SHA1).</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The temporary token returned by STS.</p>
         * 
         * <strong>example:</strong>
         * <p>C*****</p>
         */
        @NameInMap("StsToken")
        public String stsToken;

        public static GetFileUploadInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileUploadInfoResponseBodyData self = new GetFileUploadInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileUploadInfoResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetFileUploadInfoResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetFileUploadInfoResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetFileUploadInfoResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetFileUploadInfoResponseBodyData setMaxFileSize(Long maxFileSize) {
            this.maxFileSize = maxFileSize;
            return this;
        }
        public Long getMaxFileSize() {
            return this.maxFileSize;
        }

        public GetFileUploadInfoResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetFileUploadInfoResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetFileUploadInfoResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetFileUploadInfoResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetFileUploadInfoResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
