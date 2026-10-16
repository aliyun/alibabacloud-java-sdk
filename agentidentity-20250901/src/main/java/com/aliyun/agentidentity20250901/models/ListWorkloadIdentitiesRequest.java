// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListWorkloadIdentitiesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Used to request the next page of results.</p>
     * <ul>
     * <li>Leave this parameter empty for the first request.</li>
     * <li>Pass the NextToken value returned in the previous response for subsequent requests.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lksg167PctRcRw0nyoPjdX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListWorkloadIdentitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkloadIdentitiesRequest self = new ListWorkloadIdentitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkloadIdentitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkloadIdentitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
