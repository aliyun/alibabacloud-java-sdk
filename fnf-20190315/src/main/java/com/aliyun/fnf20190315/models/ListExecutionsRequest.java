// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Status")
    public String status;

    @NameInMap("StartedTimeBegin")
    public String startedTimeBegin;

    @NameInMap("StartedTimeEnd")
    public String startedTimeEnd;

    @NameInMap("ExecutionNamePrefix")
    public String executionNamePrefix;

    public static ListExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsRequest self = new ListExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutionsRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListExecutionsRequest setStartedTimeBegin(String startedTimeBegin) {
        this.startedTimeBegin = startedTimeBegin;
        return this;
    }
    public String getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    public ListExecutionsRequest setStartedTimeEnd(String startedTimeEnd) {
        this.startedTimeEnd = startedTimeEnd;
        return this;
    }
    public String getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    public ListExecutionsRequest setExecutionNamePrefix(String executionNamePrefix) {
        this.executionNamePrefix = executionNamePrefix;
        return this;
    }
    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

}
