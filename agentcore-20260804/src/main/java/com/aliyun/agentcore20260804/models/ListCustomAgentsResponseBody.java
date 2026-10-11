// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCustomAgentsResponseBody extends TeaModel {
    /**
     * <p>The result code of the request. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code of the request. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of custom agent summaries on the current page. To obtain the complete configuration and the execution results of the latest version, call GetCustomAgent.</p>
     */
    @NameInMap("items")
    public java.util.List<ListCustomAgentsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned per page for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The description of the processing result for this request. The value is success if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The opaque token used to query the next page. An empty value indicates that there are no more pages. Pass the token as is in subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6YWdlbnRjb3JlLmFnZW50Lmxpc3QuY3VzdG9tOjIw</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request. You can use the ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. true indicates that the request was processed successfully. A successful creation, update, or deletion does not mean that the background operation is complete.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of custom agents that meet the query conditions in the specified workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListCustomAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentsResponseBody self = new ListCustomAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomAgentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCustomAgentsResponseBody setItems(java.util.List<ListCustomAgentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCustomAgentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCustomAgentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomAgentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAgentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCustomAgentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomAgentsResponseBodyItemsProtocolPaths extends TeaModel {
        /**
         * <p>The description of the purpose of the current API path.</p>
         * 
         * <strong>example:</strong>
         * <p>AG-UI conversation API</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The API path corresponding to the current protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/agui</p>
         */
        @NameInMap("name")
        public String name;

        public static ListCustomAgentsResponseBodyItemsProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsProtocolPaths self = new ListCustomAgentsResponseBodyItemsProtocolPaths();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentsResponseBodyItemsProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCustomAgentsResponseBodyItemsProtocol extends TeaModel {
        /**
         * <p>The request header configuration of the current protocol. The key is the header name and the value is a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths corresponding to the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocolPaths> paths;

        /**
         * <p>The invoke Protocol Type. Valid values: agui: AG-UI protocol. openai-chat-completion: OpenAI Chat Completions compatible protocol. custom: custom protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agui</p>
         */
        @NameInMap("type")
        public String type;

        public static ListCustomAgentsResponseBodyItemsProtocol build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsProtocol self = new ListCustomAgentsResponseBodyItemsProtocol();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public ListCustomAgentsResponseBodyItemsProtocol setPaths(java.util.List<ListCustomAgentsResponseBodyItemsProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocolPaths> getPaths() {
            return this.paths;
        }

        public ListCustomAgentsResponseBodyItemsProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCustomAgentsResponseBodyItems extends TeaModel {
        /**
         * <p>The unique identifier of the custom agent. You can obtain the value from the response of CreateCustomAgent or ListCustomAgents.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-550e8400e29b41d4a716446655440000</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation method of the agent. The value is CUSTOM for custom agents.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The time when the agent was created. The time is displayed in ISO 8601 format. The trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment method of the agent. Custom agents are deployed and managed by the platform. The value is MANAGED.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The description of the agent\&quot;s purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversation services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The latest configuration version number. Updates with the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The name of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of invocation protocol configurations for the agent.</p>
         */
        @NameInMap("protocol")
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocol> protocol;

        /**
         * <p>The compute specifications of the agent. Valid values: INTERACTIVE, STANDARD, and HEAVY.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The overall status of the agent. Valid values: Creating: The agent is being created. Running: The agent is running. Failed: The agent failed to run. Updating: The agent is being updated. Deleting: The agent is being deleted. Deleted: The agent is deleted. To query the execution progress of the latest configuration, call GetCustomAgent.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the agent was last updated. The time is displayed in ISO 8601 format. The trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The ID of the workspace to which the custom agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListCustomAgentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItems self = new ListCustomAgentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListCustomAgentsResponseBodyItems setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public ListCustomAgentsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCustomAgentsResponseBodyItems setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListCustomAgentsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentsResponseBodyItems setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public ListCustomAgentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentsResponseBodyItems setProtocol(java.util.List<ListCustomAgentsResponseBodyItemsProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocol> getProtocol() {
            return this.protocol;
        }

        public ListCustomAgentsResponseBodyItems setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ListCustomAgentsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomAgentsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListCustomAgentsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
