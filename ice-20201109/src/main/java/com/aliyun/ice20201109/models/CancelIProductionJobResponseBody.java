// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelIProductionJobResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CancelIProductionJobResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelIProductionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelIProductionJobResponseBody self = new CancelIProductionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelIProductionJobResponseBody setAccessDeniedDetail(CancelIProductionJobResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CancelIProductionJobResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CancelIProductionJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelIProductionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CancelIProductionJobResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>ice:CancelIProductionJob</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The identity used for authentication in the request. Valid values:</p>
         * <ul>
         * <li>RAM user: RAM user UID</li>
         * <li>RAM role: RoleName:RoleSessionName</li>
         * <li>Federated: ProviderType/ProviderName</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>4522705967</strong></strong></p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The account to which the authenticate principal belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>82303720</strong></strong></p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the identity used for authentication in the request. Valid values:</p>
         * <ul>
         * <li>SubUser: RAM user</li>
         * <li>AssumedRoleUser: RAM role</li>
         * <li>Federated: SSO federated identity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>AAZ/h8jzNEODc5QUUyLUZCOTAtNUQyQy1BMEFBLUUzODQxODUx</strong></strong></strong>==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of denial by the access policy. Valid values:</p>
         * <ul>
         * <li><strong>ImplicitDeny</strong>: The resource owner has not configured a relevant permission policy for the current user. Access to unauthorized operations is denied by default.</li>
         * <li><strong>ExplicitDeny</strong>: The RAM policy configured by the resource owner explicitly denies the current user access to the corresponding resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The type of the policy that caused the access denial. Valid values:</p>
         * <ul>
         * <li><strong>ControlPolicy</strong>: control policy.</li>
         * <li><strong>SessionPolicy</strong>: an additional permission policy attached to a temporary token.</li>
         * <li><strong>AssumeRolePolicy</strong>: the trust policy of a RAM role.</li>
         * <li><strong>AccountLevelIdentityBasedPolicy</strong>: an identity-access policy at the account authorization scope, including custom policies and system policies.</li>
         * <li><strong>ResourceGroupLevelIdentityBasedPolicy</strong>: an identity-access policy at the resource group authorization scope, including custom policies and system policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AssumeRolePolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static CancelIProductionJobResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CancelIProductionJobResponseBodyAccessDeniedDetail self = new CancelIProductionJobResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CancelIProductionJobResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
