// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The cursor for querying the next page. During pagination, you must keep workspaceId, agentId, searchText, sessionId, and maxResults unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Performs a case-insensitive fuzzy search by Sandbox ID fragment.</p>
     * 
     * <strong>example:</strong>
     * <p>2f360</p>
     */
    @NameInMap("searchText")
    public String searchText;

    /**
     * <p>If omitted or left blank, queries the latest running unit of the agent. If specified, the service endpoint must belong to the agent and the target type must be AGENT_VERSION. Otherwise, Resource.NotFound is returned. An independently running service endpoint returns only the sandboxes of its own running unit. If the DEFAULT service endpoint has not taken over independent running, it falls back to the latest running unit. If a non-DEFAULT service endpoint is not running independently, ServiceEndpointTargetNotReady is returned. If the running unit has not been created, an empty list is returned and totalCount is 0, without reporting an error.</p>
     * 
     * <strong>example:</strong>
     * <p>se-7f3a92c1</p>
     */
    @NameInMap("serviceEndpointId")
    public String serviceEndpointId;

    /**
     * <p>Performs a case-insensitive fuzzy search by current valid session ID fragment.</p>
     * 
     * <strong>example:</strong>
     * <p>session-a</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static ListSandboxesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesRequest self = new ListSandboxesRequest();
        return TeaModel.build(map, self);
    }

    public ListSandboxesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSandboxesRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public ListSandboxesRequest setServiceEndpointId(String serviceEndpointId) {
        this.serviceEndpointId = serviceEndpointId;
        return this;
    }
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    public ListSandboxesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
