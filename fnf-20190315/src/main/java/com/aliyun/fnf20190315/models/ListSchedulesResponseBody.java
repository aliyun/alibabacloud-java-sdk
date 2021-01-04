// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListSchedulesResponseBody extends TeaModel {
    @NameInMap("Schedules")
    public java.util.List<ListSchedulesResponseBodySchedules> schedules;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesResponseBody self = new ListSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchedulesResponseBody setSchedules(java.util.List<ListSchedulesResponseBodySchedules> schedules) {
        this.schedules = schedules;
        return this;
    }
    public java.util.List<ListSchedulesResponseBodySchedules> getSchedules() {
        return this.schedules;
    }

    public ListSchedulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSchedulesResponseBodySchedules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ScheduleId")
        public String scheduleId;

        @NameInMap("Payload")
        public String payload;

        @NameInMap("ScheduleName")
        public String scheduleName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("Enable")
        public Boolean enable;

        public static ListSchedulesResponseBodySchedules build(java.util.Map<String, ?> map) throws Exception {
            ListSchedulesResponseBodySchedules self = new ListSchedulesResponseBodySchedules();
            return TeaModel.build(map, self);
        }

        public ListSchedulesResponseBodySchedules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSchedulesResponseBodySchedules setScheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public String getScheduleId() {
            return this.scheduleId;
        }

        public ListSchedulesResponseBodySchedules setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public ListSchedulesResponseBodySchedules setScheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public String getScheduleName() {
            return this.scheduleName;
        }

        public ListSchedulesResponseBodySchedules setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListSchedulesResponseBodySchedules setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListSchedulesResponseBodySchedules setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListSchedulesResponseBodySchedules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
