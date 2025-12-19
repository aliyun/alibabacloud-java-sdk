// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListWorkloadIdentitiesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
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
