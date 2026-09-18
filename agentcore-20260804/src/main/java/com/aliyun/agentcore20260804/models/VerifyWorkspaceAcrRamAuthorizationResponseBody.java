// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceAcrRamAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public VerifyWorkspaceAcrRamAuthorizationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789012</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static VerifyWorkspaceAcrRamAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceAcrRamAuthorizationResponseBody self = new VerifyWorkspaceAcrRamAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceAcrRamAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponseBody setData(VerifyWorkspaceAcrRamAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyWorkspaceAcrRamAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyWorkspaceAcrRamAuthorizationResponseBodyData extends TeaModel {
        /**
         * <p>The ACR Enterprise instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-1234567890abcdef</p>
         */
        @NameInMap("acrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The policy attachment status for the target repository.</p>
         * 
         * <strong>example:</strong>
         * <p>UNAUTHORIZED</p>
         */
        @NameInMap("authorizationStatus")
        public String authorizationStatus;

        /**
         * <p>The prerequisite status for access. This is not the Secret Ready status.</p>
         * 
         * <strong>example:</strong>
         * <p>ELIGIBLE</p>
         */
        @NameInMap("eligibilityStatus")
        public String eligibilityStatus;

        /**
         * <p>The stable reason code for unauthorized or unmet conditions. This field is omitted when no reason exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AcrRamUnauthorized</p>
         */
        @NameInMap("reasonCode")
        public String reasonCode;

        /**
         * <p>The human-readable reason. This field is omitted when no reason exists.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorize the Workspace role for this ACR instance.</p>
         */
        @NameInMap("reasonMessage")
        public String reasonMessage;

        /**
         * <p>The shared role name selected by the backend. This value is not editable on the frontend.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunAgentCoreWorkspace-ws-1234567890abcdef12345</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <p>The source of the shared role. This does not indicate that authorization is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKSPACE_SHARED</p>
         */
        @NameInMap("roleSource")
        public String roleSource;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef12345</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static VerifyWorkspaceAcrRamAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyWorkspaceAcrRamAuthorizationResponseBodyData self = new VerifyWorkspaceAcrRamAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setEligibilityStatus(String eligibilityStatus) {
            this.eligibilityStatus = eligibilityStatus;
            return this;
        }
        public String getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setRoleSource(String roleSource) {
            this.roleSource = roleSource;
            return this;
        }
        public String getRoleSource() {
            return this.roleSource;
        }

        public VerifyWorkspaceAcrRamAuthorizationResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
