// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentLogRequest extends TeaModel {
    // ENUM:["CreateCluster","DeleteCluster","Pack","Deploy"]
    @NameInMap("workflowType")
    public String workflowType;

    // 任务 step 的名称
    @NameInMap("stepName")
    public String stepName;

    // 任务 task 的名称
    @NameInMap("taskName")
    public String taskName;

    public static GetEnvironmentLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLogRequest self = new GetEnvironmentLogRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLogRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

    public GetEnvironmentLogRequest setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public GetEnvironmentLogRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
