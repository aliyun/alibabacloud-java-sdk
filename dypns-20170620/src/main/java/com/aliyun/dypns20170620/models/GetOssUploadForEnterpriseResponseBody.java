// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetOssUploadForEnterpriseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOssUploadForEnterpriseResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOssUploadForEnterpriseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadForEnterpriseResponseBody self = new GetOssUploadForEnterpriseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadForEnterpriseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOssUploadForEnterpriseResponseBody setData(GetOssUploadForEnterpriseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssUploadForEnterpriseResponseBodyData getData() {
        return this.data;
    }

    public GetOssUploadForEnterpriseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssUploadForEnterpriseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssUploadForEnterpriseResponseBodyData extends TeaModel {
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

        public static GetOssUploadForEnterpriseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadForEnterpriseResponseBodyData self = new GetOssUploadForEnterpriseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssUploadForEnterpriseResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOssUploadForEnterpriseResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetOssUploadForEnterpriseResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssUploadForEnterpriseResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadForEnterpriseResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
