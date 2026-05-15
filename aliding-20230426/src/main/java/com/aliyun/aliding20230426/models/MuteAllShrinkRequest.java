// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteAllShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceMute")
    public Boolean forceMute;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mute</p>
     */
    @NameInMap("muteAction")
    public String muteAction;

    public static MuteAllShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteAllShrinkRequest self = new MuteAllShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MuteAllShrinkRequest setForceMute(Boolean forceMute) {
        this.forceMute = forceMute;
        return this;
    }
    public Boolean getForceMute() {
        return this.forceMute;
    }

    public MuteAllShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public MuteAllShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteAllShrinkRequest setMuteAction(String muteAction) {
        this.muteAction = muteAction;
        return this;
    }
    public String getMuteAction() {
        return this.muteAction;
    }

}
