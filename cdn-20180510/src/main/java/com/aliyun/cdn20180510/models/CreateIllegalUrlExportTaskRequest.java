// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateIllegalUrlExportTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TimePoint")
    public String timePoint;

    public static CreateIllegalUrlExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIllegalUrlExportTaskRequest self = new CreateIllegalUrlExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateIllegalUrlExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIllegalUrlExportTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateIllegalUrlExportTaskRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
