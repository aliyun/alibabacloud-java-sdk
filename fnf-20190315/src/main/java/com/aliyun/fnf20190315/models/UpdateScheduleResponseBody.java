// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateScheduleResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("Payload")
    public String payload;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("ScheduleName")
    public String scheduleName;

    public static UpdateScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleResponseBody self = new UpdateScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateScheduleResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public UpdateScheduleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateScheduleResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateScheduleResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateScheduleResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public UpdateScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScheduleResponseBody setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public UpdateScheduleResponseBody setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
