// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowsRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Limit")
    public Integer limit;

    public static ListFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsRequest self = new ListFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
