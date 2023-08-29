// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StopExecutionRequest extends TeaModel {
    @NameInMap("Cause")
    public String cause;

    @NameInMap("Error")
    public String error;

    @NameInMap("ExecutionName")
    public String executionName;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("RequestId")
    public String requestId;

    public static StopExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopExecutionRequest self = new StopExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StopExecutionRequest setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public StopExecutionRequest setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public StopExecutionRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public StopExecutionRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public StopExecutionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
