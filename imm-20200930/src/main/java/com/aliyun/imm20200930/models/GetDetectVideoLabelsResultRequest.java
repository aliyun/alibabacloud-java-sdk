// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDetectVideoLabelsResultRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // TaskId
    @NameInMap("TaskId")
    public String taskId;

    // TaskType
    @NameInMap("TaskType")
    public String taskType;

    public static GetDetectVideoLabelsResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectVideoLabelsResultRequest self = new GetDetectVideoLabelsResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectVideoLabelsResultRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetDetectVideoLabelsResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDetectVideoLabelsResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
