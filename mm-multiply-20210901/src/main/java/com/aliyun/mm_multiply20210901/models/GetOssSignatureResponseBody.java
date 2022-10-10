// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetOssSignatureResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("OssSignature")
    public GetOssSignatureResponseBodyOssSignature ossSignature;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOssSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssSignatureResponseBody self = new GetOssSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssSignatureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssSignatureResponseBody setOssSignature(GetOssSignatureResponseBodyOssSignature ossSignature) {
        this.ossSignature = ossSignature;
        return this;
    }
    public GetOssSignatureResponseBodyOssSignature getOssSignature() {
        return this.ossSignature;
    }

    public GetOssSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOssSignatureResponseBodyOssSignature extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Signature")
        public String signature;

        public static GetOssSignatureResponseBodyOssSignature build(java.util.Map<String, ?> map) throws Exception {
            GetOssSignatureResponseBodyOssSignature self = new GetOssSignatureResponseBodyOssSignature();
            return TeaModel.build(map, self);
        }

        public GetOssSignatureResponseBodyOssSignature setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssSignatureResponseBodyOssSignature setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetOssSignatureResponseBodyOssSignature setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public GetOssSignatureResponseBodyOssSignature setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetOssSignatureResponseBodyOssSignature setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssSignatureResponseBodyOssSignature setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetOssSignatureResponseBodyOssSignature setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
