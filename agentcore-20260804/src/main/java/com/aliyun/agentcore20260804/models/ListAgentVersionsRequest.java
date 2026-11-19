// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentVersionsRequest extends TeaModel {
    /**
     * <p>The maximum number of records per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned in the previous ListAgentVersions response when you query the next page. Do not specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>YWdlbnQtdmVyc2lvbnM6MjA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAgentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentVersionsRequest self = new ListAgentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
