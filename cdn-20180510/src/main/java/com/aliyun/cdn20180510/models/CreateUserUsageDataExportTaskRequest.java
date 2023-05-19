// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUserUsageDataExportTaskRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Language")
    public String language;

    @NameInMap("StartTime")
    public String startTime;

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
