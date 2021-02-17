// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteOfficeConversionTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("TaskId")
    public String taskId;

    public static DeleteOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeConversionTaskRequest self = new DeleteOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeConversionTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteOfficeConversionTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
