// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class GetStorageSignatureResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Message")
    public String message;

    @NameInMap("OssSignature")
    public GetStorageSignatureResponseBodyOssSignature ossSignature;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ThumbUrl")
    public String thumbUrl;

    public static GetStorageSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSignatureResponseBody self = new GetStorageSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageSignatureResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetStorageSignatureResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetStorageSignatureResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GetStorageSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStorageSignatureResponseBody setOssSignature(GetStorageSignatureResponseBodyOssSignature ossSignature) {
        this.ossSignature = ossSignature;
        return this;
    }
    public GetStorageSignatureResponseBodyOssSignature getOssSignature() {
        return this.ossSignature;
    }

    public GetStorageSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStorageSignatureResponseBody setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }
    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public static class GetStorageSignatureResponseBodyOssSignature extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetStorageSignatureResponseBodyOssSignature build(java.util.Map<String, ?> map) throws Exception {
            GetStorageSignatureResponseBodyOssSignature self = new GetStorageSignatureResponseBodyOssSignature();
            return TeaModel.build(map, self);
        }

        public GetStorageSignatureResponseBodyOssSignature setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetStorageSignatureResponseBodyOssSignature setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetStorageSignatureResponseBodyOssSignature setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetStorageSignatureResponseBodyOssSignature setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetStorageSignatureResponseBodyOssSignature setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetStorageSignatureResponseBodyOssSignature setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
