// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUserUsageDataExportTaskResponseBody extends TeaModel {
    /**
     * <p>The end of the time range where the QPS data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateUserUsageDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserUsageDataExportTaskResponseBody self = new CreateUserUsageDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserUsageDataExportTaskResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateUserUsageDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserUsageDataExportTaskResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateUserUsageDataExportTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
