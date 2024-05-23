// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class VerifyUserRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static VerifyUserRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserRequest self = new VerifyUserRequest();
        return TeaModel.build(map, self);
    }

    public VerifyUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
