// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDISyncTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskContent")
    public String taskContent;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskParam")
    public String taskParam;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncTaskRequest self = new CreateDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDISyncTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDISyncTaskRequest setTaskContent(String taskContent) {
        this.taskContent = taskContent;
        return this;
    }
    public String getTaskContent() {
        return this.taskContent;
    }

    public CreateDISyncTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateDISyncTaskRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public CreateDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
