// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemoveRspDomainServerHoldStatusForGatewayOteResponseBody extends TeaModel {
    /**
     * <p>Detailed information about access denial. This field appears only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>List of returned data items.</p>
     */
    @NameInMap("Data")
    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData data;

    /**
     * <p>Indicates whether you can retry the request after failure. <code>true</code>: retry is allowed. <code>false</code>: retry is not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <p>Unique ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0629502C-6224-5DC9-A8ED-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. <code>true</code>: succeeded. <code>false</code>: failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RemoveRspDomainServerHoldStatusForGatewayOteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveRspDomainServerHoldStatusForGatewayOteResponseBody self = new RemoveRspDomainServerHoldStatusForGatewayOteResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody setAccessDeniedDetail(RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody setData(RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData getData() {
        return this.data;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>RemoveRspDomainServerHoldStatusForGatewayOte</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>Display name of the authenticated entity</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>ID of the owner of the authenticated entity</p>
         * 
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>Type of identity</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>Encrypted diagnostic message</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>Reason for authentication failure. Valid values:</p>
         * <ul>
         * <li><p>ExplicitDeny: explicit denial</p>
         * </li>
         * <li><p>ImplicitDeny: implicit denial</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>Type of policy</p>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail self = new RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData extends TeaModel {
        /**
         * <p>Domain name</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData self = new RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveRspDomainServerHoldStatusForGatewayOteResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
