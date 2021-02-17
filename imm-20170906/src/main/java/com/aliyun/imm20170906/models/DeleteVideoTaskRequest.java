// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteVideoTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskId")
    public String taskId;

    public static DeleteVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoTaskRequest self = new DeleteVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteVideoTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DeleteVideoTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
