// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskType")
    public String taskType;

    public static DeployDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskRequest self = new DeployDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DeployDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeployDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
