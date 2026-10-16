// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to query the next page of data. You do not need to specify this parameter for the first call. If a NextToken is returned in the response of the previous call, specify it in the current call to obtain the next page.</p>
     * 
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
