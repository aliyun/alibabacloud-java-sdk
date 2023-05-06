// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetDownloadStsCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDownloadStsCredentialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDownloadStsCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadStsCredentialResponseBody self = new GetDownloadStsCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDownloadStsCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDownloadStsCredentialResponseBody setData(GetDownloadStsCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDownloadStsCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetDownloadStsCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDownloadStsCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDownloadStsCredentialResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("OssPoint")
        public String ossPoint;

        @NameInMap("StsToken")
        public String stsToken;

        public static GetDownloadStsCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadStsCredentialResponseBodyData self = new GetDownloadStsCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDownloadStsCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetDownloadStsCredentialResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetDownloadStsCredentialResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetDownloadStsCredentialResponseBodyData setOssPoint(String ossPoint) {
            this.ossPoint = ossPoint;
            return this;
        }
        public String getOssPoint() {
            return this.ossPoint;
        }

        public GetDownloadStsCredentialResponseBodyData setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

    }

}
