// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateScheduleResponseBody extends TeaModel {
    /**
     * <p>The time when the time-based schedule was created.</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The CRON expression.</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The description of the time-based schedule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the time-based schedule is enabled.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The time when the time-based schedule was last modified.</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The trigger message of the time-based schedule.</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the time-based schedule.</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>The name of the time-based schedule.</p>
     */
    @NameInMap("ScheduleName")
    public String scheduleName;

    public static CreateScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleResponseBody self = new CreateScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateScheduleResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateScheduleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduleResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateScheduleResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateScheduleResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public CreateScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleResponseBody setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public CreateScheduleResponseBody setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
