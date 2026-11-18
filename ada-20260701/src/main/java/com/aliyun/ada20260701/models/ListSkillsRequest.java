// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>Filters skills by the creator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-user</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The number of entries per page for cursor-based pagination. Valid values: 1 to 100. Default value: <code>20</code>. If this parameter is explicitly specified, cursor-based pagination takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The next token returned by the server. Do not specify this parameter for the first query. For subsequent queries, use the value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzIjoiZDc3ZGRhYmE3MDMwYWM1NCIsInAiOjJ9.vkKVySx9G26993sTNLZqwGSmgciRsrRm2SgsjOMJoCQ</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The compatible page number parameter for page number-based pagination. Pages start from 1. Default value: <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The compatible number of entries per page for page number-based pagination. Valid values: 1 to 100. Default value: <code>20</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Performs a fuzzy match on the skill name or description.</p>
     * 
     * <strong>example:</strong>
     * <p>review</p>
     */
    @NameInMap("Q")
    public String q;

    /**
     * <p>The query scope for skills. Valid values: <code>SYSTEM</code> and <code>CUSTOM</code>. If this parameter is omitted, both official and custom skills are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Filters skills by visibility. Common values are <code>user</code> and <code>tenant</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static ListSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsRequest self = new ListSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListSkillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSkillsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public ListSkillsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSkillsRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
