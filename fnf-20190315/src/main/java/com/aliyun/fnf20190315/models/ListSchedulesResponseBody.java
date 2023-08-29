// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListSchedulesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schedules")
    public java.util.List<ListSchedulesResponseBodySchedules> schedules;

    public static ListSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesResponseBody self = new ListSchedulesResponseBody();
        return TeaModel.build(map, self);
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

    public ListSchedulesResponseBody setSchedules(java.util.List<ListSchedulesResponseBodySchedules> schedules) {
        this.schedules = schedules;
        return this;
    }
    public java.util.List<ListSchedulesResponseBodySchedules> getSchedules() {
        return this.schedules;
    }

    public static class ListSchedulesResponseBodySchedules extends TeaModel {
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

        @NameInMap("ScheduleId")
        public String scheduleId;

        @NameInMap("ScheduleName")
        public String scheduleName;

        public static ListSchedulesResponseBodySchedules build(java.util.Map<String, ?> map) throws Exception {
            ListSchedulesResponseBodySchedules self = new ListSchedulesResponseBodySchedules();
            return TeaModel.build(map, self);
        }

        public ListSchedulesResponseBodySchedules setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListSchedulesResponseBodySchedules setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListSchedulesResponseBodySchedules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSchedulesResponseBodySchedules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSchedulesResponseBodySchedules setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListSchedulesResponseBodySchedules setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public ListSchedulesResponseBodySchedules setScheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public String getScheduleId() {
            return this.scheduleId;
        }

        public ListSchedulesResponseBodySchedules setScheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public String getScheduleName() {
            return this.scheduleName;
        }

    }

}
