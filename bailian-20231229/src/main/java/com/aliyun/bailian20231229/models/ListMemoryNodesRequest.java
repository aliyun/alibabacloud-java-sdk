// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoryNodesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned from a previous request. If specified, the query results are paginated based on the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>dc270401186b433f975d7e1faaa34e0e</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListMemoryNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryNodesRequest self = new ListMemoryNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryNodesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
