// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayOteResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public AddRspDomainServerHoldStatusForGatewayOteResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <strong>example:</strong>
     * <p>0629502C-6224-5DC9-A8ED-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddRspDomainServerHoldStatusForGatewayOteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayOteResponseBody self = new AddRspDomainServerHoldStatusForGatewayOteResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponseBody setAccessDeniedDetail(AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponseBody setData(AddRspDomainServerHoldStatusForGatewayOteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayOteResponseBodyData getData() {
        return this.data;
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CreateUser</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
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
         * <p>AQFohtp4aIbaeEXXXXQxNjFDLUIzMzgtNTXXXX05NkFCLUI2RkY5XXXXzAzQQ==</p>
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
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail self = new AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class AddRspDomainServerHoldStatusForGatewayOteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static AddRspDomainServerHoldStatusForGatewayOteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddRspDomainServerHoldStatusForGatewayOteResponseBodyData self = new AddRspDomainServerHoldStatusForGatewayOteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddRspDomainServerHoldStatusForGatewayOteResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
