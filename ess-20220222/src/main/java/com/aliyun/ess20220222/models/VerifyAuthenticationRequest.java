// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class VerifyAuthenticationRequest extends TeaModel {
    /**
     * <p>Specifies whether to check only the authorization status. Valid values:</p>
     * <br>
     * <p>*   true: checks only the authorization status. The service-linked role is not created.</p>
     * <p>*   false (default): checks the authorization status and resource usage.</p>
     */
    @NameInMap("OnlyCheck")
    public Boolean onlyCheck;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static VerifyAuthenticationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthenticationRequest self = new VerifyAuthenticationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAuthenticationRequest setOnlyCheck(Boolean onlyCheck) {
        this.onlyCheck = onlyCheck;
        return this;
    }
    public Boolean getOnlyCheck() {
        return this.onlyCheck;
    }

    public VerifyAuthenticationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyAuthenticationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public VerifyAuthenticationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public VerifyAuthenticationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
