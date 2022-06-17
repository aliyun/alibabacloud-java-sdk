// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetOSSInfoForCardTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOSSInfoForCardTemplateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOSSInfoForCardTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSInfoForCardTemplateResponseBody self = new GetOSSInfoForCardTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSInfoForCardTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOSSInfoForCardTemplateResponseBody setData(GetOSSInfoForCardTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOSSInfoForCardTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetOSSInfoForCardTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOSSInfoForCardTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOSSInfoForCardTemplateResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("StartPath")
        public String startPath;

        public static GetOSSInfoForCardTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOSSInfoForCardTemplateResponseBodyData self = new GetOSSInfoForCardTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOSSInfoForCardTemplateResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOSSInfoForCardTemplateResponseBodyData setStartPath(String startPath) {
            this.startPath = startPath;
            return this;
        }
        public String getStartPath() {
            return this.startPath;
        }

    }

}
