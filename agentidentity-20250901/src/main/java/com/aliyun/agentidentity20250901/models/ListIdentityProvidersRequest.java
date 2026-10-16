// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6m6UfcO+UDmLjng/InRW9IU</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListIdentityProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersRequest self = new ListIdentityProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIdentityProvidersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
