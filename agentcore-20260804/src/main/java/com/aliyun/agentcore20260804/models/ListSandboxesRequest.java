// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxesRequest extends TeaModel {
    /**
     * <p>The maximum number of records per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for querying the next page. When paginating, keep workspaceId, agentId, searchText, sessionId, and maxResults unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Performs a case-insensitive fuzzy search by sandbox ID fragment.</p>
     * 
     * <strong>example:</strong>
     * <p>2f360</p>
     */
    @NameInMap("searchText")
    public String searchText;

    /**
     * <p>Performs a case-insensitive fuzzy search by active session ID fragment.</p>
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

    public ListSandboxesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
