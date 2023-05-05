// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvCopyrightUploadCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIsvCopyrightUploadCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIsvCopyrightUploadCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIsvCopyrightUploadCredentialResponseBody self = new GetIsvCopyrightUploadCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIsvCopyrightUploadCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIsvCopyrightUploadCredentialResponseBody setData(GetIsvCopyrightUploadCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIsvCopyrightUploadCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetIsvCopyrightUploadCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIsvCopyrightUploadCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIsvCopyrightUploadCredentialResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("OssPoint")
        public String ossPoint;

        @NameInMap("StsToken")
        public String stsToken;

        public static GetIsvCopyrightUploadCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIsvCopyrightUploadCredentialResponseBodyData self = new GetIsvCopyrightUploadCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIsvCopyrightUploadCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetIsvCopyrightUploadCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetIsvCopyrightUploadCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetIsvCopyrightUploadCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetIsvCopyrightUploadCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetIsvCopyrightUploadCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
