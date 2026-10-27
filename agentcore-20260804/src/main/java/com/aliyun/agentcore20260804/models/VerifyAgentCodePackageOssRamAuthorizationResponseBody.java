// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyAgentCodePackageOssRamAuthorizationResponseBody extends TeaModel {
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
    public VerifyAgentCodePackageOssRamAuthorizationResponseBodyData data;

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
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static VerifyAgentCodePackageOssRamAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAgentCodePackageOssRamAuthorizationResponseBody self = new VerifyAgentCodePackageOssRamAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponseBody setData(VerifyAgentCodePackageOssRamAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyAgentCodePackageOssRamAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyAgentCodePackageOssRamAuthorizationResponseBodyData extends TeaModel {
        /**
         * <p>The policy binding status.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTHORIZED</p>
         */
        @NameInMap("authorizationStatus")
        public String authorizationStatus;

        /**
         * <p>The name of the authorized source OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-bucket</p>
         */
        @NameInMap("ossBucketName")
        public String ossBucketName;

        /**
         * <p>The name of the workspace role selected by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunAgentCoreWorkspace-ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static VerifyAgentCodePackageOssRamAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyAgentCodePackageOssRamAuthorizationResponseBodyData self = new VerifyAgentCodePackageOssRamAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyAgentCodePackageOssRamAuthorizationResponseBodyData setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public VerifyAgentCodePackageOssRamAuthorizationResponseBodyData setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public VerifyAgentCodePackageOssRamAuthorizationResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public VerifyAgentCodePackageOssRamAuthorizationResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
