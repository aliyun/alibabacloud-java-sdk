// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeScheduleResponseBody extends TeaModel {
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
