// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingUploadCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetWebHostingUploadCredentialResponseBodyData data;

    public static GetWebHostingUploadCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingUploadCredentialResponseBody self = new GetWebHostingUploadCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebHostingUploadCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebHostingUploadCredentialResponseBody setData(GetWebHostingUploadCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebHostingUploadCredentialResponseBodyData getData() {
        return this.data;
    }

    public static class GetWebHostingUploadCredentialResponseBodyData extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        public static GetWebHostingUploadCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebHostingUploadCredentialResponseBodyData self = new GetWebHostingUploadCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebHostingUploadCredentialResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetWebHostingUploadCredentialResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetWebHostingUploadCredentialResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetWebHostingUploadCredentialResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetWebHostingUploadCredentialResponseBodyData setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetWebHostingUploadCredentialResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetWebHostingUploadCredentialResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

}
