// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCredentialsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The credential list.</p>
     */
    @NameInMap("items")
    public java.util.List<ListCredentialsResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page that takes effect in the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page. This parameter is empty if no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of credentials that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponseBody self = new ListCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCredentialsResponseBody setItems(java.util.List<ListCredentialsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCredentialsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCredentialsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCredentialsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCredentialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCredentialsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCredentialsResponseBodyItemsResourceRefs extends TeaModel {
        /**
         * <p>The ID of the applicable MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource name. This parameter is empty if the resource is deleted.</p>
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

        public static ListCredentialsResponseBodyItemsResourceRefs build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyItemsResourceRefs self = new ListCredentialsResponseBodyItemsResourceRefs();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyItemsResourceRefs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListCredentialsResponseBodyItemsResourceRefs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListCredentialsResponseBodyItemsResourceRefs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListCredentialsResponseBodyItems extends TeaModel {
        /**
         * <p>The number of agents bound to the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("boundAgentsCounts")
        public Integer boundAgentsCounts;

        /**
         * <p>The creation time in UTC format compliant with RFC 3339.</p>
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
         * <p>The desensitized credential content. For the apiKey type, a key mask is returned. For the mcpHeader type, only the header name is returned, and the value is not returned.</p>
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
         * <p>The credential description. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>API key used to call model services in the production environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The credential name. The name must be unique within the workspace, can contain only letters, digits, periods, underscores, and hyphens, and must be 3 to 99 characters in length. Runtime reserved names cannot be used.</p>
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
        public java.util.List<ListCredentialsResponseBodyItemsResourceRefs> resourceRefs;

        /**
         * <p>The application scope of the credential. ALL indicates all scopes. SPECIFIED indicates specified MCP services.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("resourceScope")
        public String resourceScope;

        /**
         * <p>The time of the last modification in UTC format compliant with RFC 3339.</p>
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

        public static ListCredentialsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyItems self = new ListCredentialsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyItems setBoundAgentsCounts(Integer boundAgentsCounts) {
            this.boundAgentsCounts = boundAgentsCounts;
            return this;
        }
        public Integer getBoundAgentsCounts() {
            return this.boundAgentsCounts;
        }

        public ListCredentialsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCredentialsResponseBodyItems setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListCredentialsResponseBodyItems setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public ListCredentialsResponseBodyItems setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public ListCredentialsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCredentialsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCredentialsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCredentialsResponseBodyItems setResourceRefs(java.util.List<ListCredentialsResponseBodyItemsResourceRefs> resourceRefs) {
            this.resourceRefs = resourceRefs;
            return this;
        }
        public java.util.List<ListCredentialsResponseBodyItemsResourceRefs> getResourceRefs() {
            return this.resourceRefs;
        }

        public ListCredentialsResponseBodyItems setResourceScope(String resourceScope) {
            this.resourceScope = resourceScope;
            return this;
        }
        public String getResourceScope() {
            return this.resourceScope;
        }

        public ListCredentialsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListCredentialsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
