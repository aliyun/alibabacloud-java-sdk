// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScheduleConferenceRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public CreateScheduleConferenceRequestTenantContext tenantContext;

    @NameInMap("Title")
    public String title;

    public static CreateScheduleConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleConferenceRequest self = new CreateScheduleConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleConferenceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateScheduleConferenceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateScheduleConferenceRequest setTenantContext(CreateScheduleConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateScheduleConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateScheduleConferenceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateScheduleConferenceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateScheduleConferenceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceRequestTenantContext self = new CreateScheduleConferenceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
