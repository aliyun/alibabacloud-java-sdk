// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConferenceShrinkRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("Title")
    public String title;

    public static UpdateScheduleConferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConferenceShrinkRequest self = new UpdateScheduleConferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConferenceShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateScheduleConferenceShrinkRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public UpdateScheduleConferenceShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateScheduleConferenceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateScheduleConferenceShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
