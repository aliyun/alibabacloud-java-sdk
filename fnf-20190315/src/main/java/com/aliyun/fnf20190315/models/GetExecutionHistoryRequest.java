// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class GetExecutionHistoryRequest extends TeaModel {
    /**
     * <p>The name of the execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The number of workflows that you want to query. Valid values: 1-999. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the event to start the query. You can obtain the value from the response data.</p>
     * 
     * <strong>example:</strong>
     * <p>flow_xxx</p>
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
