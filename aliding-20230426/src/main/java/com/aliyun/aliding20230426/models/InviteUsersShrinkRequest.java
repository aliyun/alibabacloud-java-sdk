// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InviteUsersShrinkRequest extends TeaModel {
    @NameInMap("InviteeList")
    public String inviteeListShrink;

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

    @NameInMap("phoneInviteeList")
    public String phoneInviteeListShrink;

    public static InviteUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteUsersShrinkRequest self = new InviteUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InviteUsersShrinkRequest setInviteeListShrink(String inviteeListShrink) {
        this.inviteeListShrink = inviteeListShrink;
        return this;
    }
    public String getInviteeListShrink() {
        return this.inviteeListShrink;
    }

    public InviteUsersShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public InviteUsersShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public InviteUsersShrinkRequest setPhoneInviteeListShrink(String phoneInviteeListShrink) {
        this.phoneInviteeListShrink = phoneInviteeListShrink;
        return this;
    }
    public String getPhoneInviteeListShrink() {
        return this.phoneInviteeListShrink;
    }

}
