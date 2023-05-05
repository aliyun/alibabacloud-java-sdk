// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvAppUploadCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIsvAppUploadCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIsvAppUploadCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIsvAppUploadCredentialResponseBody self = new GetIsvAppUploadCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIsvAppUploadCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIsvAppUploadCredentialResponseBody setData(GetIsvAppUploadCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIsvAppUploadCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetIsvAppUploadCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIsvAppUploadCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIsvAppUploadCredentialResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessPath")
        public String accessPath;

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

        public static GetIsvAppUploadCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIsvAppUploadCredentialResponseBodyData self = new GetIsvAppUploadCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIsvAppUploadCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetIsvAppUploadCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetIsvAppUploadCredentialResponseBodyData setAccessPath(String accessPath) {
            this.accessPath = accessPath;
            return this;
        }
        public String getAccessPath() {
            return this.accessPath;
        }

        public GetIsvAppUploadCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetIsvAppUploadCredentialResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetIsvAppUploadCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetIsvAppUploadCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetIsvAppUploadCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
