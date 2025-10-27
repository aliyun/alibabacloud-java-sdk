// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateScheduleResponseBody extends TeaModel {
    /**
     * <p>The time when the time-based schedule was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-01T01:01:01.001Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The CRON expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0 * * * * *</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The description of the time-based schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the time-based schedule is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The time when the time-based schedule was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-01T01:01:01.001Z</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The trigger message of the time-based schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the time-based schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>testScheduleId</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>The name of the time-based schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>testScheduleName</p>
     */
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
