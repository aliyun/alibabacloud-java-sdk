// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficeConversionTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("TaskId")
    public String taskId;

    public static GetOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeConversionTaskRequest self = new GetOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetOfficeConversionTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetOfficeConversionTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
