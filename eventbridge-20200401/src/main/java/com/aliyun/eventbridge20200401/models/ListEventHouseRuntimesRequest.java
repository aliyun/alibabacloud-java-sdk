// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventHouseRuntimesRequest extends TeaModel {
    /**
     * <p>The maximum number of runtimes to return per page. If this parameter is not specified or set to 0, the default value 20 is used. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Not required for the first query. For subsequent queries, use the NextToken returned in the previous response. An empty value indicates that no more pages are available.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListEventHouseRuntimesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventHouseRuntimesRequest self = new ListEventHouseRuntimesRequest();
        return TeaModel.build(map, self);
    }

    public ListEventHouseRuntimesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventHouseRuntimesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
