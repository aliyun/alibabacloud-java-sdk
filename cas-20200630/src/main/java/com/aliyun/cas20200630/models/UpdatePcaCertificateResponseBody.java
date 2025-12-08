// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdatePcaCertificateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UpdatePcaCertificateResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>09470F19-CEE8-5C63-BF2C-02B5E3F07A17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePcaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePcaCertificateResponseBody self = new UpdatePcaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePcaCertificateResponseBody setAccessDeniedDetail(UpdatePcaCertificateResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpdatePcaCertificateResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdatePcaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePcaCertificateResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>yundun-cert:XXX</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>RoleSessionName</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>AuthPrincipalOwnerId</p>
         * 
         * <strong>example:</strong>
         * <p>186XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <p>AQEAAAAAaEjlETkzRkQ5QjVELTI3NTEtM0I2Ni1BM0E1LThBQUYzMkJBNEJCQg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static UpdatePcaCertificateResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdatePcaCertificateResponseBodyAccessDeniedDetail self = new UpdatePcaCertificateResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpdatePcaCertificateResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
