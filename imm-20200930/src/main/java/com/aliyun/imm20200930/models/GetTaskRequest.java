// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestDefinition")
    public Boolean requestDefinition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRequest self = new GetTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTaskRequest setRequestDefinition(Boolean requestDefinition) {
        this.requestDefinition = requestDefinition;
        return this;
    }
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    public GetTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
