// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopMinutesShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static StopMinutesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMinutesShrinkRequest self = new StopMinutesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopMinutesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public StopMinutesShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
