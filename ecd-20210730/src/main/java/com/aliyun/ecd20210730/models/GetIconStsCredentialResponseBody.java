// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetIconStsCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIconStsCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIconStsCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIconStsCredentialResponseBody self = new GetIconStsCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIconStsCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIconStsCredentialResponseBody setData(GetIconStsCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIconStsCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetIconStsCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIconStsCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIconStsCredentialResponseBodyData extends TeaModel {
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

        public static GetIconStsCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIconStsCredentialResponseBodyData self = new GetIconStsCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIconStsCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetIconStsCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetIconStsCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetIconStsCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetIconStsCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetIconStsCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
