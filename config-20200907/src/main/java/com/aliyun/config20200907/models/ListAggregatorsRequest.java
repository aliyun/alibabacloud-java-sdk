// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request. If the response of the current request is truncated, this token is used to initiate another request and obtain the remaining entries.</p>
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
