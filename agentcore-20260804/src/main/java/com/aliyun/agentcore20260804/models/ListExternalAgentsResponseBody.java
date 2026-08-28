// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListExternalAgentsResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of external agents.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;agentId&quot;:&quot;agent-1&quot;,&quot;workspaceId&quot;:&quot;ws-1&quot;,&quot;name&quot;:&quot;my-external-agent&quot;,&quot;description&quot;:&quot;A code review agent running in the user environment&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;latestSpecVersion&quot;:1,&quot;effectiveSpecVersion&quot;:1,&quot;createMode&quot;:&quot;CUSTOM&quot;,&quot;runtime&quot;:&quot;qwenpaw&quot;,&quot;deployType&quot;:&quot;SELF_HOSTED&quot;,&quot;createdAt&quot;:&quot;2026-01-01T00:00:00Z&quot;,&quot;updatedAt&quot;:&quot;2026-01-01T00:00:00Z&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListExternalAgentsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned per page for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next page. An empty value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
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

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListExternalAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalAgentsResponseBody self = new ListExternalAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListExternalAgentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListExternalAgentsResponseBody setItems(java.util.List<ListExternalAgentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListExternalAgentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListExternalAgentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExternalAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExternalAgentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExternalAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExternalAgentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListExternalAgentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExternalAgentsResponseBodyItems extends TeaModel {
        /**
         * <p>The external agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The external agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>A code review agent running in the user environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The currently effective specification version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("effectiveSpecVersion")
        public Long effectiveSpecVersion;

        /**
         * <p>The latest specification version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The external agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-external-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The runtime type reported by the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>qwenpaw</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The external agent status. Valid values:</p>
         * <ul>
         * <li>Creating: The agent is being created.</li>
         * <li>Running: The agent is running.</li>
         * <li>Failed: The agent has failed.</li>
         * <li>Updating: The agent is being updated.</li>
         * <li>Deleting: The agent is being deleted.</li>
         * <li>Deleted: The agent has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListExternalAgentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListExternalAgentsResponseBodyItems self = new ListExternalAgentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListExternalAgentsResponseBodyItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListExternalAgentsResponseBodyItems setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public ListExternalAgentsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListExternalAgentsResponseBodyItems setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListExternalAgentsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExternalAgentsResponseBodyItems setEffectiveSpecVersion(Long effectiveSpecVersion) {
            this.effectiveSpecVersion = effectiveSpecVersion;
            return this;
        }
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        public ListExternalAgentsResponseBodyItems setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public ListExternalAgentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExternalAgentsResponseBodyItems setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ListExternalAgentsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExternalAgentsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListExternalAgentsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
