// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SubmitAtiAgentRegisterInfoResponseBody extends TeaModel {
    /**
     * <p>The access denied details. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Agent status. Valid values:</p>
     * <ul>
     * <li>Draft: The Agent registration form is being filled in and has not been formally submitted. In the Draft state, only modification and detail viewing operations are supported. Other operations are not supported.</li>
     * <li>Private CA Pending Issuance: The Agent registration has been formally submitted. Alibaba Cloud has completed the ACME DNS-01 pre-check and submitted the registration information and generated DNS records to CNNIC. The system is waiting for CNNIC to approve and issue the Private CA and complete TL sealing.</li>
     * <li>DNS Pending Verification: CNNIC has approved the request, issued the Private CA certificate, and completed TL sealing, but the DNS records of the user have not been verified. The user needs to add the corresponding DNS records in domain name resolution and complete verification.</li>
     * <li>Active: All processes are complete. The Private CA certificate has been issued, TL has been sealed, and DNS records have been verified. The Agent is activated and can be discovered and trusted across the network.</li>
     * <li>Expired: The Agent identity certificate has expired, and the user did not complete certificate renewal within the validity period.</li>
     * <li>Revoked: The Agent certificate has been revoked, DNS records have been cleaned up, and the Agent cannot be discovered or trusted. It cannot be restored to the Active state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Private CA 待签发</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static SubmitAtiAgentRegisterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAtiAgentRegisterInfoResponseBody self = new SubmitAtiAgentRegisterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAtiAgentRegisterInfoResponseBody setAccessDeniedDetail(SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SubmitAtiAgentRegisterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAtiAgentRegisterInfoResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public static class SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>AddRspDomainServerHoldStatusForGateway</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encrypted complete diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The reason for the authentication failure. Valid values:</p>
         * <ul>
         * <li>ExplicitDeny: explicit deny.</li>
         * <li>ImplicitDeny: implicit deny.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail self = new SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public SubmitAtiAgentRegisterInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
