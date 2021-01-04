// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListSchedulesRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Limit")
    public Integer limit;

    public static ListSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesRequest self = new ListSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSchedulesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchedulesRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListSchedulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSchedulesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
