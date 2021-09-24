// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForUpdatingRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskParam")
    public String taskParam;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TaskId")
    public Long taskId;

    public static GenerateDISyncTaskConfigForUpdatingRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForUpdatingRequest self = new GenerateDISyncTaskConfigForUpdatingRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
