// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspaceAcrRamAuthorizeUrlResponseBody extends TeaModel {
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
    public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData data;

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

    public static GetWorkspaceAcrRamAuthorizeUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceAcrRamAuthorizeUrlResponseBody self = new GetWorkspaceAcrRamAuthorizeUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponseBody setData(GetWorkspaceAcrRamAuthorizeUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceAcrRamAuthorizeUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkspaceAcrRamAuthorizeUrlResponseBodyData extends TeaModel {
        /**
         * <p>The ACR Enterprise instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-1234567890abcdef</p>
         */
        @NameInMap("acrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The RAM authorization URL used to create or append ACR permissions for the shared role on the target repository.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-1234567890abcdef12345%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreAcrPull-63373f3802583663d49465d8061e410a899d8f2936b8fc0cb9ec905b71f273c6%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22CrPullInstanceImage%22%2C%22templateValue%22%3A%7B%22crInstance%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Ainstance%2Fcri-1234567890abcdef%22%2C%22crRepository%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Arepository%2Fcri-1234567890abcdef%2Fexample%2Fagent-image%22%7D%7D%5D%7D%5D%7D">https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AliyunAgentCoreWorkspace-ws-1234567890abcdef12345%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreAcrPull-63373f3802583663d49465d8061e410a899d8f2936b8fc0cb9ec905b71f273c6%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22CrPullInstanceImage%22%2C%22templateValue%22%3A%7B%22crInstance%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Ainstance%2Fcri-1234567890abcdef%22%2C%22crRepository%22%3A%22acs%3Acr%3Acn-hangzhou%3A1234567890123456%3Arepository%2Fcri-1234567890abcdef%2Fexample%2Fagent-image%22%7D%7D%5D%7D%5D%7D</a></p>
         */
        @NameInMap("authorizeUrl")
        public String authorizeUrl;

        /**
         * <p>The shared role name selected by the backend. This value is not editable on the frontend.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunAgentCoreWorkspace-ws-1234567890abcdef12345</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <p>The source of the shared role. This value does not indicate that authorization is complete.</p>
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

        public static GetWorkspaceAcrRamAuthorizeUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceAcrRamAuthorizeUrlResponseBodyData self = new GetWorkspaceAcrRamAuthorizeUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
            return this;
        }
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

        public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData setRoleSource(String roleSource) {
            this.roleSource = roleSource;
            return this;
        }
        public String getRoleSource() {
            return this.roleSource;
        }

        public GetWorkspaceAcrRamAuthorizeUrlResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
