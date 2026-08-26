// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>d29ya3NwYWNlLW9mZnNldDoyMA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The number of workspaces to skip.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("skip")
    public Integer skip;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
