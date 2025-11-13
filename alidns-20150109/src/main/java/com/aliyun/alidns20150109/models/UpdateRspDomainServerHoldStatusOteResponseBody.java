// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerHoldStatusOteResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public UpdateRspDomainServerHoldStatusOteResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecoverableError")
    public Boolean recoverableError;

    /**
     * <strong>example:</strong>
     * <p>0629502C-XXXX-XXXX-XXXX-2ED73A2E3931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateRspDomainServerHoldStatusOteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerHoldStatusOteResponseBody self = new UpdateRspDomainServerHoldStatusOteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerHoldStatusOteResponseBody setAccessDeniedDetail(UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateRspDomainServerHoldStatusOteResponseBody setData(UpdateRspDomainServerHoldStatusOteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRspDomainServerHoldStatusOteResponseBodyData getData() {
        return this.data;
    }

    public UpdateRspDomainServerHoldStatusOteResponseBody setRecoverableError(Boolean recoverableError) {
        this.recoverableError = recoverableError;
        return this;
    }
    public Boolean getRecoverableError() {
        return this.recoverableError;
    }

    public UpdateRspDomainServerHoldStatusOteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRspDomainServerHoldStatusOteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail self = new UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class UpdateRspDomainServerHoldStatusOteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ServerHoldStatus")
        public String serverHoldStatus;

        public static UpdateRspDomainServerHoldStatusOteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerHoldStatusOteResponseBodyData self = new UpdateRspDomainServerHoldStatusOteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateRspDomainServerHoldStatusOteResponseBodyData setServerHoldStatus(String serverHoldStatus) {
            this.serverHoldStatus = serverHoldStatus;
            return this;
        }
        public String getServerHoldStatus() {
            return this.serverHoldStatus;
        }

    }

}
