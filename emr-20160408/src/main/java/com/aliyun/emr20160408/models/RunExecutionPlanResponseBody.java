// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunExecutionPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExecutionPlanInstanceId")
    public String executionPlanInstanceId;

    public static RunExecutionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunExecutionPlanResponseBody self = new RunExecutionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public RunExecutionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunExecutionPlanResponseBody setExecutionPlanInstanceId(String executionPlanInstanceId) {
        this.executionPlanInstanceId = executionPlanInstanceId;
        return this;
    }
    public String getExecutionPlanInstanceId() {
        return this.executionPlanInstanceId;
    }

}
