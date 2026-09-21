// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody extends TeaModel {
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
    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData data;

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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody self = new GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody setData(GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData extends TeaModel {
        /**
         * <p>The RAM authorization URL. After opening this URL and completing the authorization, call the verification operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AgentCoreWorkspaceRoleExample%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreNasMountExample%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22NasFileSystemClientMount%22%2C%22templateValue%22%3A%7B%22nasFileSystem%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Afilesystem%2F0123456789%22%2C%22nasAccessPoint%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Aaccesspoint%2Fap-0123456789abcdef0%22%7D%7D%5D%7D%5D%7D">https://ram.console.aliyun.com/authorize?request=%7B%22referrer%22%3A%22AgentCore%22%2C%22payloads%22%3A%5B%7B%22missionId%22%3A%22AgentCore.CustomRoleForOSSObjectRestore%22%2C%22roleName%22%3A%22AgentCoreWorkspaceRoleExample%22%2C%22rolePolicies%22%3A%5B%7B%22policyName%22%3A%22AgentCoreNasMountExample%22%2C%22policyType%22%3A%22Custom%22%2C%22templateId%22%3A%22NasFileSystemClientMount%22%2C%22templateValue%22%3A%7B%22nasFileSystem%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Afilesystem%2F0123456789%22%2C%22nasAccessPoint%22%3A%22acs%3Anas%3Acn-hangzhou%3A1234567890123456%3Aaccesspoint%2Fap-0123456789abcdef0%22%7D%7D%5D%7D%5D%7D</a></p>
         */
        @NameInMap("authorizeUrl")
        public String authorizeUrl;

        public static GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData self = new GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceAgenticFsMountRamAuthorizeUrlResponseBodyData setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
            return this;
        }
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

    }

}
