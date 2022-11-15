// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoLabelClassificationResultRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    public static GetVideoLabelClassificationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoLabelClassificationResultRequest self = new GetVideoLabelClassificationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoLabelClassificationResultRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetVideoLabelClassificationResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoLabelClassificationResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
