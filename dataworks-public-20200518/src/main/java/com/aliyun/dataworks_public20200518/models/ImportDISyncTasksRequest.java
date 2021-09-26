// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDISyncTasksRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskContent")
    public String taskContent;

    @NameInMap("TaskParam")
    public String taskParam;

    public static ImportDISyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDISyncTasksRequest self = new ImportDISyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ImportDISyncTasksRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ImportDISyncTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ImportDISyncTasksRequest setTaskContent(String taskContent) {
        this.taskContent = taskContent;
        return this;
    }
    public String getTaskContent() {
        return this.taskContent;
    }

    public ImportDISyncTasksRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

}
