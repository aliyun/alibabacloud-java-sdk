// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartMinutesShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>012345</p>
     */
    @NameInMap("ownerUserId")
    public String ownerUserId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recordAudio")
    public Boolean recordAudio;

    public static StartMinutesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMinutesShrinkRequest self = new StartMinutesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartMinutesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public StartMinutesShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public StartMinutesShrinkRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public StartMinutesShrinkRequest setRecordAudio(Boolean recordAudio) {
        this.recordAudio = recordAudio;
        return this;
    }
    public Boolean getRecordAudio() {
        return this.recordAudio;
    }

}
