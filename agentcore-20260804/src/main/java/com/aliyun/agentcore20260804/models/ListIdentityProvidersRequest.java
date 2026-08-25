// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersRequest extends TeaModel {
    /**
     * <p>The maximum number of records per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. Do not specify this parameter for the first request. For subsequent requests, specify the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>aWRlbnRpdHktcHJvdmlkZXItb2Zmc2V0OjEw</p>
     */
    @NameInMap("nextToken")
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
