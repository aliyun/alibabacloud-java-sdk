// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoModerationResultRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    public static GetVideoModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoModerationResultRequest self = new GetVideoModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoModerationResultRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetVideoModerationResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoModerationResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
