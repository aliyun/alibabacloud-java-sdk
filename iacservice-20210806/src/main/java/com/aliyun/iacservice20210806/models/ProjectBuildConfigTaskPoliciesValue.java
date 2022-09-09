// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ProjectBuildConfigTaskPoliciesValue extends TeaModel {
    @NameInMap("taskId")
    public String taskId;

    @NameInMap("priority")
    public Long priority;

    @NameInMap("destroyAfterExecution")
    public Boolean destroyAfterExecution;

    public static ProjectBuildConfigTaskPoliciesValue build(java.util.Map<String, ?> map) throws Exception {
        ProjectBuildConfigTaskPoliciesValue self = new ProjectBuildConfigTaskPoliciesValue();
        return TeaModel.build(map, self);
    }

    public ProjectBuildConfigTaskPoliciesValue setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ProjectBuildConfigTaskPoliciesValue setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public ProjectBuildConfigTaskPoliciesValue setDestroyAfterExecution(Boolean destroyAfterExecution) {
        this.destroyAfterExecution = destroyAfterExecution;
        return this;
    }
    public Boolean getDestroyAfterExecution() {
        return this.destroyAfterExecution;
    }

}
