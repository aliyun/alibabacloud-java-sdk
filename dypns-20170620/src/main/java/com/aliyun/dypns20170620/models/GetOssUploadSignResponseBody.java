// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetOssUploadSignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOssUploadSignResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOssUploadSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadSignResponseBody self = new GetOssUploadSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssUploadSignResponseBody setData(GetOssUploadSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssUploadSignResponseBodyData getData() {
        return this.data;
    }

    public GetOssUploadSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssUploadSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssUploadSignResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetOssUploadSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadSignResponseBodyData self = new GetOssUploadSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssUploadSignResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssUploadSignResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetOssUploadSignResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssUploadSignResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadSignResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
