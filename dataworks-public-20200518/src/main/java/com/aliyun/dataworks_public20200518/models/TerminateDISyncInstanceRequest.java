// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("FileId")
    @Validation(required = true)
    public Long fileId;

    public static TerminateDISyncInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceRequest self = new TerminateDISyncInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public TerminateDISyncInstanceRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public TerminateDISyncInstanceRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

}
