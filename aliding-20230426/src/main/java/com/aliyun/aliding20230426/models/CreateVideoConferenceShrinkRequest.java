// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateVideoConferenceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfTitle")
    public String confTitle;

    @NameInMap("InviteCaller")
    public Boolean inviteCaller;

    @NameInMap("InviteUserIds")
    public String inviteUserIdsShrink;

    public static CreateVideoConferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoConferenceShrinkRequest self = new CreateVideoConferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoConferenceShrinkRequest setConfTitle(String confTitle) {
        this.confTitle = confTitle;
        return this;
    }
    public String getConfTitle() {
        return this.confTitle;
    }

    public CreateVideoConferenceShrinkRequest setInviteCaller(Boolean inviteCaller) {
        this.inviteCaller = inviteCaller;
        return this;
    }
    public Boolean getInviteCaller() {
        return this.inviteCaller;
    }

    public CreateVideoConferenceShrinkRequest setInviteUserIdsShrink(String inviteUserIdsShrink) {
        this.inviteUserIdsShrink = inviteUserIdsShrink;
        return this;
    }
    public String getInviteUserIdsShrink() {
        return this.inviteUserIdsShrink;
    }

}
