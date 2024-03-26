// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class GetExecutionHistoryRequest extends TeaModel {
    /**
     * <p>The name of the execution, which is unique within a flow. The name must meet the following conventions:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the flow. The name must be unique within the region and cannot be modified after the flow is created. The name must meet the following conventions:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The maximum number of steps to be queried. Valid values: 1 to 1000.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the event to start the query. You can obtain the value from the response data.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

}
