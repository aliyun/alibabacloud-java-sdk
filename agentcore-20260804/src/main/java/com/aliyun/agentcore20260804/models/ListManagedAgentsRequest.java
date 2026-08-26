// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListManagedAgentsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListManagedAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManagedAgentsRequest self = new ListManagedAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListManagedAgentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListManagedAgentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
