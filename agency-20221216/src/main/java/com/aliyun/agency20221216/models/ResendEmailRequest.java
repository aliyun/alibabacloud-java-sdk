// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ResendEmailRequest extends TeaModel {
    /**
     * <p>Invitation ID, from interface InviteSubAccount </br></p>
     * <p>Note: This field type is Long, which may result in precision loss in serialization/deserialization process. Please ensure the value does not exceed 9007199254740991.</p>
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
