// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppStsCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppStsCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppStsCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppStsCredentialResponseBody self = new GetAppStsCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppStsCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppStsCredentialResponseBody setData(GetAppStsCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppStsCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetAppStsCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppStsCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppStsCredentialResponseBodyData extends TeaModel {
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

        public static GetAppStsCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppStsCredentialResponseBodyData self = new GetAppStsCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppStsCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAppStsCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetAppStsCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetAppStsCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetAppStsCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetAppStsCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
