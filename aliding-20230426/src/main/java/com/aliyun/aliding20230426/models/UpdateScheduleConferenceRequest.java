// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConferenceRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public UpdateScheduleConferenceRequestTenantContext tenantContext;

    @NameInMap("Title")
    public String title;

    public static UpdateScheduleConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConferenceRequest self = new UpdateScheduleConferenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConferenceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateScheduleConferenceRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public UpdateScheduleConferenceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateScheduleConferenceRequest setTenantContext(UpdateScheduleConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateScheduleConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateScheduleConferenceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class UpdateScheduleConferenceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateScheduleConferenceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConferenceRequestTenantContext self = new UpdateScheduleConferenceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConferenceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
