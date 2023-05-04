// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateIllegalUrlExportTaskRequest extends TeaModel {
    /**
     * <p>The name of the export task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The minimum time granularity is 1 day.</p>
     */
    @NameInMap("TimePoint")
    public String timePoint;

    public static CreateIllegalUrlExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIllegalUrlExportTaskRequest self = new CreateIllegalUrlExportTaskRequest();
        return TeaModel.build(map, self);
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
