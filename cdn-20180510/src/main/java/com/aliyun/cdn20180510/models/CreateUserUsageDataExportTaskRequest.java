// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUserUsageDataExportTaskRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the exported file.</p>
     * <br>
     * <p>*   **zh-cn**: Chinese. This is the default value.</p>
     * <p>*   **en-us**: English.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The start of the time range to query. The time interval at which the specified data is collected is five minutes.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the task.</p>
     */
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
