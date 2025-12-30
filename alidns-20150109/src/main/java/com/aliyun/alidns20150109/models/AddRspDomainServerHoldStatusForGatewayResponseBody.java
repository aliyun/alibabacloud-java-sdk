// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public AddRspDomainServerHoldStatusForGatewayResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <strong>example:</strong>
     * <p>0629502C-XXXX-5DC9-XXXX-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddRspDomainServerHoldStatusForGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayResponseBody self = new AddRspDomainServerHoldStatusForGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setAccessDeniedDetail(AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setData(AddRspDomainServerHoldStatusForGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayResponseBodyData getData() {
        return this.data;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRspDomainServerHoldStatusForGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>1046973331XXXX</p>
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
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
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

        public static AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail self = new AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class AddRspDomainServerHoldStatusForGatewayResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static AddRspDomainServerHoldStatusForGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddRspDomainServerHoldStatusForGatewayResponseBodyData self = new AddRspDomainServerHoldStatusForGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddRspDomainServerHoldStatusForGatewayResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
