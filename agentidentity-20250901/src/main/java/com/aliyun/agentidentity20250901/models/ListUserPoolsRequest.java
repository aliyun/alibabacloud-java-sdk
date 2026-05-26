// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdFVzZXJQb29sczo6MTA=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListUserPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolsRequest self = new ListUserPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
