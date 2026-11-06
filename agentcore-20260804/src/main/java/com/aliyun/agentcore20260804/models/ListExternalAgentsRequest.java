// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListExternalAgentsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Valid values: 0 to 100. If this parameter is omitted or set to 0, the default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. You can leave this parameter empty for the first call. For subsequent calls, use the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListExternalAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExternalAgentsRequest self = new ListExternalAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListExternalAgentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExternalAgentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
