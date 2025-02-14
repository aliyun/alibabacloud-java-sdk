// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPolicyAttachmentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetPolicyAttachmentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2C3B9A12-3868-5EB9-fBEA-F99E03DD1***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPolicyAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyAttachmentResponseBody self = new GetPolicyAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPolicyAttachmentResponseBody setData(GetPolicyAttachmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPolicyAttachmentResponseBodyData getData() {
        return this.data;
    }

    public GetPolicyAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPolicyAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyAttachmentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>op-csbkd9llhtgqhqua***</p>
         */
        @NameInMap("attachResourceId")
        public String attachResourceId;

        /**
         * <strong>example:</strong>
         * <p>Operation</p>
         */
        @NameInMap("attachResourceType")
        public String attachResourceType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;unitNum&quot;:1,&quot;timeUnit&quot;:&quot;s&quot;,&quot;enable&quot;:true}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qa***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <strong>example:</strong>
         * <p>gw-cq2vundlhtg***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>pr-cqoojualhtgquuj***</p>
         */
        @NameInMap("policyAttachmentId")
        public String policyAttachmentId;

        /**
         * <strong>example:</strong>
         * <p>p-cq7l5s5bblhtgi6qas***</p>
         */
        @NameInMap("policyId")
        public String policyId;

        public static GetPolicyAttachmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyAttachmentResponseBodyData self = new GetPolicyAttachmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPolicyAttachmentResponseBodyData setAttachResourceId(String attachResourceId) {
            this.attachResourceId = attachResourceId;
            return this;
        }
        public String getAttachResourceId() {
            return this.attachResourceId;
        }

        public GetPolicyAttachmentResponseBodyData setAttachResourceType(String attachResourceType) {
            this.attachResourceType = attachResourceType;
            return this;
        }
        public String getAttachResourceType() {
            return this.attachResourceType;
        }

        public GetPolicyAttachmentResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetPolicyAttachmentResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetPolicyAttachmentResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetPolicyAttachmentResponseBodyData setPolicyAttachmentId(String policyAttachmentId) {
            this.policyAttachmentId = policyAttachmentId;
            return this;
        }
        public String getPolicyAttachmentId() {
            return this.policyAttachmentId;
        }

        public GetPolicyAttachmentResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

    }

}
