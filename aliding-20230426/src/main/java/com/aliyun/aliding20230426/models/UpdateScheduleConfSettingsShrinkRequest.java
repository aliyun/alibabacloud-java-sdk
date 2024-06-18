// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConfSettingsShrinkRequest extends TeaModel {
    @NameInMap("ScheduleConfSettingModel")
    public String scheduleConfSettingModelShrink;

    /**
     * <strong>example:</strong>
     * <p>f6fb627e-a7e8-403e-b1f8-26e85450f4a9</p>
     */
    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static UpdateScheduleConfSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConfSettingsShrinkRequest self = new UpdateScheduleConfSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConfSettingsShrinkRequest setScheduleConfSettingModelShrink(String scheduleConfSettingModelShrink) {
        this.scheduleConfSettingModelShrink = scheduleConfSettingModelShrink;
        return this;
    }
    public String getScheduleConfSettingModelShrink() {
        return this.scheduleConfSettingModelShrink;
    }

    public UpdateScheduleConfSettingsShrinkRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public UpdateScheduleConfSettingsShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
