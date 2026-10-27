// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentCodeRuntimesRequest extends TeaModel {
    /**
     * <p>The maximum number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>d3MtYTFiMmMzZDRlNWY2CmNvZGUtcnVudGltZS1leGFtcGxlCjE</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAgentCodeRuntimesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentCodeRuntimesRequest self = new ListAgentCodeRuntimesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentCodeRuntimesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentCodeRuntimesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
