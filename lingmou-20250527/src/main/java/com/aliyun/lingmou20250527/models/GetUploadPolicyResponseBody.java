// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetUploadPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetUploadPolicyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90C68329-A75C-5449-A928-4D0BAD7AA0FA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadPolicyResponseBody self = new GetUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUploadPolicyResponseBody setData(GetUploadPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUploadPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetUploadPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUploadPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUploadPolicyResponseBodyDataOssPolicy extends TeaModel {
        /**
         * <p>accessId。</p>
         * 
         * <strong>example:</strong>
         * <p>LTBI5123ADDJdsadCidYA8kw3</p>
         */
        @NameInMap("accessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>material/INPUT_CHAT_BACKGROUND_PIC/Mt.CPQHBSWQS5QU2/</p>
         */
        @NameInMap("dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>1761551667</p>
         */
        @NameInMap("expire")
        public String expire;

        /**
         * <strong>example:</strong>
         * <p>daily-avatar-property.oss-cn-beijing.aliyuncs.com</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMi0yNVQwMzowMDoyNC4xNDNaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTM2ODcwOTEyMF0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCJ0ZW1wXC8xNzQwNDQ4ODI0MTQxLnppcCJdXX0=</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>I2KcV3CFloyRr94WhefmVEuNiv0=</p>
         */
        @NameInMap("signature")
        public String signature;

        public static GetUploadPolicyResponseBodyDataOssPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetUploadPolicyResponseBodyDataOssPolicy self = new GetUploadPolicyResponseBodyDataOssPolicy();
            return TeaModel.build(map, self);
        }

        public GetUploadPolicyResponseBodyDataOssPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetUploadPolicyResponseBodyDataOssPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetUploadPolicyResponseBodyDataOssPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetUploadPolicyResponseBodyDataOssPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetUploadPolicyResponseBodyDataOssPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetUploadPolicyResponseBodyDataOssPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class GetUploadPolicyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>material/INPUT_CHAT_BACKGROUND_PIC/Mt.CPQHBSWQS5QU2</p>
         */
        @NameInMap("ossKey")
        public String ossKey;

        @NameInMap("ossPolicy")
        public GetUploadPolicyResponseBodyDataOssPolicy ossPolicy;

        public static GetUploadPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUploadPolicyResponseBodyData self = new GetUploadPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUploadPolicyResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public GetUploadPolicyResponseBodyData setOssPolicy(GetUploadPolicyResponseBodyDataOssPolicy ossPolicy) {
            this.ossPolicy = ossPolicy;
            return this;
        }
        public GetUploadPolicyResponseBodyDataOssPolicy getOssPolicy() {
            return this.ossPolicy;
        }

    }

}
