// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on a single page. Valid values: 1 to 100. If you do not specify this parameter, 10 entries are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The cursor for querying the next page. Do not specify this parameter in the first call. In subsequent calls, specify the nextToken value returned from the previous call.</p>
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
