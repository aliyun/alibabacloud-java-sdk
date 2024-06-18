// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CancelScheduleConferenceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a489xxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static CancelScheduleConferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelScheduleConferenceShrinkRequest self = new CancelScheduleConferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelScheduleConferenceShrinkRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public CancelScheduleConferenceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
