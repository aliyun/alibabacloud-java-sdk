// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
