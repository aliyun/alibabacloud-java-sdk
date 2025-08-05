// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ExecuteAdhocWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    public static ExecuteAdhocWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdhocWorkflowInstanceResponseBody self = new ExecuteAdhocWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAdhocWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAdhocWorkflowInstanceResponseBody setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
