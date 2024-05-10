// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateVideoConferenceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfTitle")
    public String confTitle;

    @NameInMap("InviteCaller")
    public Boolean inviteCaller;

    @NameInMap("InviteUserIds")
    public java.util.List<String> inviteUserIds;

    public static CreateVideoConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoConferenceRequest self = new CreateVideoConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoConferenceRequest setConfTitle(String confTitle) {
        this.confTitle = confTitle;
        return this;
    }
    public String getConfTitle() {
        return this.confTitle;
    }

    public CreateVideoConferenceRequest setInviteCaller(Boolean inviteCaller) {
        this.inviteCaller = inviteCaller;
        return this;
    }
    public Boolean getInviteCaller() {
        return this.inviteCaller;
    }

    public CreateVideoConferenceRequest setInviteUserIds(java.util.List<String> inviteUserIds) {
        this.inviteUserIds = inviteUserIds;
        return this;
    }
    public java.util.List<String> getInviteUserIds() {
        return this.inviteUserIds;
    }

}
