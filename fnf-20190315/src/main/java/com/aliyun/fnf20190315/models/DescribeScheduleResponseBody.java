// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeScheduleResponseBody extends TeaModel {
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
     * <p>Indicates whether the time-based schedule is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
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

    public static DescribeScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleResponseBody self = new DescribeScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeScheduleResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public DescribeScheduleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeScheduleResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DescribeScheduleResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeScheduleResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public DescribeScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleResponseBody setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public DescribeScheduleResponseBody setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
