// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpToolsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return per request. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListMcpToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcpToolsRequest self = new ListMcpToolsRequest();
        return TeaModel.build(map, self);
    }

    public ListMcpToolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpToolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
