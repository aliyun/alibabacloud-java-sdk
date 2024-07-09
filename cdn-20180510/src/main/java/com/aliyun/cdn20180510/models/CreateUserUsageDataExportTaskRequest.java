// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUserUsageDataExportTaskRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language in which you want to export the file. Default value: zh-cn. Valid values:</p>
     * <ul>
     * <li><strong>zh-cn</strong>: Chinese</li>
     * <li><strong>en-us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The start of the time range to query. The data is collected every 5 minutes.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Refresh</p>
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
