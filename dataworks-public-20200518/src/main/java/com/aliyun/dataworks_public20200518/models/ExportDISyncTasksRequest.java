// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDISyncTasksRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskParam")
    public String taskParam;

    public static ExportDISyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDISyncTasksRequest self = new ExportDISyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ExportDISyncTasksRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ExportDISyncTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ExportDISyncTasksRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

}
