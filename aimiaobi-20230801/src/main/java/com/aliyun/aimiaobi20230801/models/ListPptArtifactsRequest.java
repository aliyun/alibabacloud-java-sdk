// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPptArtifactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>cEoBWREAXdxaOyjq/cqAbg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>llm-az2xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListPptArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPptArtifactsRequest self = new ListPptArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public ListPptArtifactsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPptArtifactsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPptArtifactsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListPptArtifactsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
