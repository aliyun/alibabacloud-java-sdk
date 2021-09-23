// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOfficeConversionTaskRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    public static GetOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeConversionTaskRequest self = new GetOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetOfficeConversionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetOfficeConversionTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
