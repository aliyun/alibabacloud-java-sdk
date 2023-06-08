// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUsageDetailDataExportTaskResponseBody extends TeaModel {
    /**
     * <p>The end of the time range for which the data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range for which the data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateUsageDetailDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUsageDetailDataExportTaskResponseBody self = new CreateUsageDetailDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUsageDetailDataExportTaskResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateUsageDetailDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUsageDetailDataExportTaskResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateUsageDetailDataExportTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
