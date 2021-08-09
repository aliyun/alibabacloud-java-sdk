// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("FileId")
    @Validation(required = true)
    public Long fileId;

    public static DeleteDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskRequest self = new DeleteDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DeleteDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

}
