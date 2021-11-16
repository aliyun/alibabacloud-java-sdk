// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDISyncTasksRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskParam")
    public String taskParam;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("body")
    public String body;

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

    public ImportDISyncTasksRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public ImportDISyncTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ImportDISyncTasksRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
