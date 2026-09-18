// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateTransitUploadPolicyResponseBody extends TeaModel {
    /**
     * <p>The object storage key, which is also the <code>key</code> field in the PostObject form.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-bundle/tenant-demo/user-demo/20260904120000_0123456789abcdef0123456789abcdef.zip</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The upload policy object. For the complete list of subfields, see the following table.</p>
     */
    @NameInMap("PolicyInfo")
    public CreateTransitUploadPolicyResponseBodyPolicyInfo policyInfo;

    /**
     * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the upload policy is generated. A successful response always returns <code>true</code>. An error response is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the newly created Transit record, used for subsequent queries and storage operations.</p>
     * 
     * <strong>example:</strong>
     * <p>transit_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("TransitId")
    public String transitId;

    public static CreateTransitUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitUploadPolicyResponseBody self = new CreateTransitUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitUploadPolicyResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateTransitUploadPolicyResponseBody setPolicyInfo(CreateTransitUploadPolicyResponseBodyPolicyInfo policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }
    public CreateTransitUploadPolicyResponseBodyPolicyInfo getPolicyInfo() {
        return this.policyInfo;
    }

    public CreateTransitUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitUploadPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateTransitUploadPolicyResponseBody setTransitId(String transitId) {
        this.transitId = transitId;
        return this;
    }
    public String getTransitId() {
        return this.transitId;
    }

    public static class CreateTransitUploadPolicyResponseBodyPolicyInfo extends TeaModel {
        /**
         * <p>The <code>OSSAccessKeyId</code> field in the PostObject form. Protect this value together with the entire <code>PolicyInfo</code>.</p>
         * 
         * <strong>example:</strong>
         * <REDACTED>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>The object storage key. The value is the same as the top-level <code>FilePath</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-bundle/tenant-demo/user-demo/20260904120000_0123456789abcdef0123456789abcdef.zip</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The target URL to which the client sends the PostObject request.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://upload.example.invalid">https://upload.example.invalid</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The Base64-encoded PostObject upload policy. Protect this value together with the entire <code>PolicyInfo</code>.</p>
         * 
         * <strong>example:</strong>
         * <REDACTED>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The <code>x-oss-security-token</code> field in the PostObject form when STS credentials are used. This field may be empty when STS is not used. This field contains sensitive authorization information.</p>
         * 
         * <strong>example:</strong>
         * <REDACTED>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The signature field in the PostObject form. This field contains sensitive authorization information.</p>
         * 
         * <strong>example:</strong>
         * <REDACTED>
         */
        @NameInMap("Signature")
        public String signature;

        public static CreateTransitUploadPolicyResponseBodyPolicyInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitUploadPolicyResponseBodyPolicyInfo self = new CreateTransitUploadPolicyResponseBodyPolicyInfo();
            return TeaModel.build(map, self);
        }

        public CreateTransitUploadPolicyResponseBodyPolicyInfo setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateTransitUploadPolicyResponseBodyPolicyInfo setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public CreateTransitUploadPolicyResponseBodyPolicyInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateTransitUploadPolicyResponseBodyPolicyInfo setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateTransitUploadPolicyResponseBodyPolicyInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public CreateTransitUploadPolicyResponseBodyPolicyInfo setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
