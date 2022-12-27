// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUserUsageDataExportTaskRequest extends TeaModel {
    // The end of the time range to query. The end time must be later than the start time.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("EndTime")
    public String endTime;

    // The language of the exported file.
    // 
    // *   **zh-cn**: Chinese. This is the default value.
    // *   **en-us**: English.
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The start of the time range to query. The time interval at which the specified data is collected is five minutes.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("StartTime")
    public String startTime;

    // The name of the task.
    @NameInMap("TaskName")
    public String taskName;

    public static CreateUserUsageDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserUsageDataExportTaskRequest self = new CreateUserUsageDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserUsageDataExportTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateUserUsageDataExportTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateUserUsageDataExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateUserUsageDataExportTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateUserUsageDataExportTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
