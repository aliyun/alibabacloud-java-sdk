// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteMembersShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;012345&quot;]</p>
     */
    @NameInMap("UserIds")
    public String userIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
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

    public static MuteMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteMembersShrinkRequest self = new MuteMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MuteMembersShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public MuteMembersShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

    public MuteMembersShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteMembersShrinkRequest setMuteAction(String muteAction) {
        this.muteAction = muteAction;
        return this;
    }
    public String getMuteAction() {
        return this.muteAction;
    }

}
