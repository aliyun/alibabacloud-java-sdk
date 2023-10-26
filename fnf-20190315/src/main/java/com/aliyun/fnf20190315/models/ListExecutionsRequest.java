// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsRequest extends TeaModel {
    /**
     * <p>The name prefix of the execution.</p>
     */
    @NameInMap("ExecutionNamePrefix")
    public String executionNamePrefix;

    /**
     * <p>The name of the flow. The name is unique within the region and cannot be modified after the flow is created. Configure this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The maximum number of executions to be queried. Valid values: 1 to 100.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the execution to start the query. You can obtain the value from the response data. You do not need to specify this parameter for the first request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query executions. Specify the value in the UTC RFC3339 format.</p>
     */
    @NameInMap("StartedTimeBegin")
    public String startedTimeBegin;

    /**
     * <p>The end of the time range to query executions. Specify the value in the UTC RFC3339 format.</p>
     */
    @NameInMap("StartedTimeEnd")
    public String startedTimeEnd;

    /**
     * <p>The state of the execution that you want to filter. Valid values:</p>
     * <br>
     * <p>*   **Running**</p>
     * <p>*   **Stopped**</p>
     * <p>*   **Succeeded**</p>
     * <p>*   **Failed**</p>
     * <p>*   **TimedOut**</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsRequest self = new ListExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionsRequest setExecutionNamePrefix(String executionNamePrefix) {
        this.executionNamePrefix = executionNamePrefix;
        return this;
    }
    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

    public ListExecutionsRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListExecutionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
