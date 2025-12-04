// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDataEventSelectorsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>VjE6dLbnNpVmbz06****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListDataEventSelectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataEventSelectorsRequest self = new ListDataEventSelectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataEventSelectorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataEventSelectorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
