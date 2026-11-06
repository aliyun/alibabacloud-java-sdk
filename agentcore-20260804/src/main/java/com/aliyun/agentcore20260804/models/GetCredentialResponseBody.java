// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetCredentialResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The credential details.</p>
     */
    @NameInMap("data")
    public GetCredentialResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
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
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialResponseBody self = new GetCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCredentialResponseBody setData(GetCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCredentialResponseBodyDataBoundAgents extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-01</p>
         */
        @NameInMap("agentName")
        public String agentName;

        public static GetCredentialResponseBodyDataBoundAgents build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyDataBoundAgents self = new GetCredentialResponseBodyDataBoundAgents();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyDataBoundAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetCredentialResponseBodyDataBoundAgents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class GetCredentialResponseBodyDataResourceRefs extends TeaModel {
        /**
         * <p>The ID of the applicable MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource name. This field is empty if the resource is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-service</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The resource type. Currently, the value is mcpServer, which indicates an MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcpServer</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetCredentialResponseBodyDataResourceRefs build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyDataResourceRefs self = new GetCredentialResponseBodyDataResourceRefs();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyDataResourceRefs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetCredentialResponseBodyDataResourceRefs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetCredentialResponseBodyDataResourceRefs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The list of agents bound to the credential.</p>
         */
        @NameInMap("boundAgents")
        public java.util.List<GetCredentialResponseBodyDataBoundAgents> boundAgents;

        /**
         * <p>The creation time in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-123456</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The masked result of the credential content. For the apiKey type, the key mask is returned. For the mcpHeader type, only the header name is returned without the value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;****************&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <p>The credential type. Valid values: apiKey (API key) and mcpHeader (MCP request header).</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <p>The credential description. The length cannot exceed 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>API key used to call the model service in the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The credential name. It must be unique within the workspace, contain only letters, digits, periods, underscores, and hyphens, and be 3 to 99 characters in length. Runtime reserved names cannot be used.</p>
         * 
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The list of MCP services to which the credential applies.</p>
         */
        @NameInMap("resourceRefs")
        public java.util.List<GetCredentialResponseBodyDataResourceRefs> resourceRefs;

        /**
         * <p>The application scope of the credential. ALL indicates all scopes, and SPECIFIED indicates specified MCP services.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("resourceScope")
        public String resourceScope;

        /**
         * <p>The time of the last modification in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyData self = new GetCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyData setBoundAgents(java.util.List<GetCredentialResponseBodyDataBoundAgents> boundAgents) {
            this.boundAgents = boundAgents;
            return this;
        }
        public java.util.List<GetCredentialResponseBodyDataBoundAgents> getBoundAgents() {
            return this.boundAgents;
        }

        public GetCredentialResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCredentialResponseBodyData setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public GetCredentialResponseBodyData setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public GetCredentialResponseBodyData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetCredentialResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCredentialResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCredentialResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCredentialResponseBodyData setResourceRefs(java.util.List<GetCredentialResponseBodyDataResourceRefs> resourceRefs) {
            this.resourceRefs = resourceRefs;
            return this;
        }
        public java.util.List<GetCredentialResponseBodyDataResourceRefs> getResourceRefs() {
            return this.resourceRefs;
        }

        public GetCredentialResponseBodyData setResourceScope(String resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public String getResourceScope() {
            return this.resourceScope;
        }

        public GetCredentialResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetCredentialResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
