// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvCertUploadCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIsvCertUploadCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIsvCertUploadCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIsvCertUploadCredentialResponseBody self = new GetIsvCertUploadCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIsvCertUploadCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIsvCertUploadCredentialResponseBody setData(GetIsvCertUploadCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIsvCertUploadCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetIsvCertUploadCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIsvCertUploadCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIsvCertUploadCredentialResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("OssPoint")
        public String ossPoint;

        @NameInMap("StsToken")
        public String stsToken;

        public static GetIsvCertUploadCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIsvCertUploadCredentialResponseBodyData self = new GetIsvCertUploadCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIsvCertUploadCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetIsvCertUploadCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetIsvCertUploadCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetIsvCertUploadCredentialResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetIsvCertUploadCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetIsvCertUploadCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetIsvCertUploadCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
