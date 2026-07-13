// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemoveRspDomainServerHoldStatusForGatewayResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial. This field appears only when Resource Access Management (RAM) authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public RemoveRspDomainServerHoldStatusForGatewayResponseBodyData data;

    /**
     * <p>Indicates whether you can retry the request if it fails. Valid values: <code>true</code> (retry allowed) and <code>false</code> (retry not allowed).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0629502C-6224-5DC9-A8ED-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values: <code>true</code> (succeeded) and <code>false</code> (failed).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RemoveRspDomainServerHoldStatusForGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveRspDomainServerHoldStatusForGatewayResponseBody self = new RemoveRspDomainServerHoldStatusForGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponseBody setAccessDeniedDetail(RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponseBody setData(RemoveRspDomainServerHoldStatusForGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveRspDomainServerHoldStatusForGatewayResponseBodyData getData() {
        return this.data;
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>RemoveRspDomainServerHoldStatusForGateway</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorized entity.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the owner of the authorized entity.</p>
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
         * <p>The complete diagnostic information after encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The reason why authorization failed. Valid values:</p>
         * <ul>
         * <li><p>ExplicitDeny: Access is explicitly denied.</p>
         * </li>
         * <li><p>ImplicitDeny: Access is implicitly denied.</p>
         * </li>
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

        public static RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail self = new RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class RemoveRspDomainServerHoldStatusForGatewayResponseBodyData extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The domain\&quot;s serverHold status.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ServerHoldStatus")
        public String serverHoldStatus;

        public static RemoveRspDomainServerHoldStatusForGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveRspDomainServerHoldStatusForGatewayResponseBodyData self = new RemoveRspDomainServerHoldStatusForGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public RemoveRspDomainServerHoldStatusForGatewayResponseBodyData setServerHoldStatus(String serverHoldStatus) {
            this.serverHoldStatus = serverHoldStatus;
            return this;
        }
        public String getServerHoldStatus() {
            return this.serverHoldStatus;
        }

    }

}
