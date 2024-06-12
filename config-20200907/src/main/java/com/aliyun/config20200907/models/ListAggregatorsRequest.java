// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return in a request. Valid values: 1 to 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAggregatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregatorsRequest self = new ListAggregatorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregatorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggregatorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
