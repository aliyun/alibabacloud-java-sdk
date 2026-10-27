// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageOssRamAuthorizeUrlResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData data;

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

    public static GetAgentCodePackageOssRamAuthorizeUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageOssRamAuthorizeUrlResponseBody self = new GetAgentCodePackageOssRamAuthorizeUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody setData(GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentCodePackageOssRamAuthorizeUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData extends TeaModel {
        /**
         * <p>The RAM authorization URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-a1b2c3d4e5f6%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22agentcore-oss-mount-policy-my-agent-bucket%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22OSSObjectRestoreCustom%22%2C%22templateValue%22%3A%7B%22ossBucket%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%22%2C%22ossBucketObject%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%2F%2A%22%7D%7D%5D%7D%5D%7D">https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-a1b2c3d4e5f6%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22agentcore-oss-mount-policy-my-agent-bucket%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22OSSObjectRestoreCustom%22%2C%22templateValue%22%3A%7B%22ossBucket%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%22%2C%22ossBucketObject%22%3A%22acs%3Aoss%3A%2A%3A1234567890123456%3Amy-agent-bucket%2F%2A%22%7D%7D%5D%7D%5D%7D</a></p>
         */
        @NameInMap("authorizeUrl")
        public String authorizeUrl;

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

        public static GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData self = new GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
            return this;
        }
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

        public GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetAgentCodePackageOssRamAuthorizeUrlResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
