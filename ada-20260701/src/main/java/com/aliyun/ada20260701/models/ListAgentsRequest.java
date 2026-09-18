// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListAgentsRequest extends TeaModel {
    /**
     * <p>Filters agents by the exact creator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-user</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The number of entries per page for cursor-based pagination. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The next page token returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlIjoyfQ.example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number for page number-based pagination. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page for page number-based pagination. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The search keyword. Matches the name, display name, or description.</p>
     * 
     * <strong>example:</strong>
     * <p>code review</p>
     */
    @NameInMap("Q")
    public String q;

    /**
     * <p>Filters agents by runtime label.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("RequiredRuntime")
    public String requiredRuntime;

    /**
     * <p>The query scope. Valid values: <code>SYSTEM</code> and <code>CUSTOM</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Filters agents by visibility scope. Valid values: <code>user</code> and <code>tenant</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static ListAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsRequest self = new ListAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentsRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListAgentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAgentsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public ListAgentsRequest setRequiredRuntime(String requiredRuntime) {
        this.requiredRuntime = requiredRuntime;
        return this;
    }
    public String getRequiredRuntime() {
        return this.requiredRuntime;
    }

    public ListAgentsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListAgentsRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
