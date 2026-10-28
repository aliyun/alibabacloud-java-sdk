// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ResendEmailRequest extends TeaModel {
    /**
     * <p>The invitation ID, obtained from the InviteSbuAccount operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>176</p>
     */
    @NameInMap("InviteId")
    public Long inviteId;

    public static ResendEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailRequest self = new ResendEmailRequest();
        return TeaModel.build(map, self);
    }

    public ResendEmailRequest setInviteId(Long inviteId) {
        this.inviteId = inviteId;
        return this;
    }
    public Long getInviteId() {
        return this.inviteId;
    }

}
