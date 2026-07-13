// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>2074753647748672512</p>
     */
    @NameInMap("AgentRegisterInfoId")
    public String agentRegisterInfoId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>PrecheckFailedOnTooManyVmSnapshot</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ACME DNS-01 域名验证通过</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>PASSED</p>
     */
    @NameInMap("PrecheckStatus")
    public String precheckStatus;

    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1782572400000</p>
     */
    @NameInMap("VerifyTimestamp")
    public Long verifyTimestamp;

    public static VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody self = new VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setAccessDeniedDetail(VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setAgentRegisterInfoId(String agentRegisterInfoId) {
        this.agentRegisterInfoId = agentRegisterInfoId;
        return this;
    }
    public String getAgentRegisterInfoId() {
        return this.agentRegisterInfoId;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setPrecheckStatus(String precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public String getPrecheckStatus() {
        return this.precheckStatus;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody setVerifyTimestamp(Long verifyTimestamp) {
        this.verifyTimestamp = verifyTimestamp;
        return this;
    }
    public Long getVerifyTimestamp() {
        return this.verifyTimestamp;
    }

    public static class VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RemoveRspDomainServerHoldStatusForGateway</p>
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

        public static VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail self = new VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
