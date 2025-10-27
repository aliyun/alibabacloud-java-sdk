// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowsRequest extends TeaModel {
    /**
     * <p>The number of workflows that you want to query. Valid values: 1 - 999. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token to start the query.</p>
     * 
     * <strong>example:</strong>
     * <p>flow_nextxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsRequest self = new ListFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFlowsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
