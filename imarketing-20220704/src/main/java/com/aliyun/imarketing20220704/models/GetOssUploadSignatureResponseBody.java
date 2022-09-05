// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetOssUploadSignatureResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOssUploadSignatureResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOssUploadSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadSignatureResponseBody self = new GetOssUploadSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadSignatureResponseBody setData(GetOssUploadSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssUploadSignatureResponseBodyData getData() {
        return this.data;
    }

    public GetOssUploadSignatureResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetOssUploadSignatureResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetOssUploadSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssUploadSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOssUploadSignatureResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetOssUploadSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadSignatureResponseBodyData self = new GetOssUploadSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssUploadSignatureResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssUploadSignatureResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetOssUploadSignatureResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssUploadSignatureResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public GetOssUploadSignatureResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadSignatureResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
