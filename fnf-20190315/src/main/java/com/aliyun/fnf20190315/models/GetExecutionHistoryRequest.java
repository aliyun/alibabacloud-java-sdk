// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class GetExecutionHistoryRequest extends TeaModel {
    @NameInMap("ExecutionName")
    public String executionName;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static GetExecutionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionHistoryRequest self = new GetExecutionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetExecutionHistoryRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public GetExecutionHistoryRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public GetExecutionHistoryRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GetExecutionHistoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetExecutionHistoryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
