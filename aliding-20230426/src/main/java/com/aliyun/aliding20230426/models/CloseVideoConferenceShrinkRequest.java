// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CloseVideoConferenceShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static CloseVideoConferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseVideoConferenceShrinkRequest self = new CloseVideoConferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloseVideoConferenceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CloseVideoConferenceShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
