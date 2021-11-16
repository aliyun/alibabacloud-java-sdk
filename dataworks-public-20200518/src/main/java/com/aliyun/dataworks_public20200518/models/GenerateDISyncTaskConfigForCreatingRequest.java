// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskParam")
    public String taskParam;

    @NameInMap("TaskType")
    public String taskType;

    public static GenerateDISyncTaskConfigForCreatingRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForCreatingRequest self = new GenerateDISyncTaskConfigForCreatingRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForCreatingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateDISyncTaskConfigForCreatingRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GenerateDISyncTaskConfigForCreatingRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public GenerateDISyncTaskConfigForCreatingRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
