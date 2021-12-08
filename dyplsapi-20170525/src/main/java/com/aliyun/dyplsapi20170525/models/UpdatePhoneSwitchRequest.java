// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdatePhoneSwitchRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    @NameInMap("SubsId")
    public Long subsId;

    @NameInMap("SwitchStatus")
    public Integer switchStatus;

    public static UpdatePhoneSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneSwitchRequest self = new UpdatePhoneSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneSwitchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdatePhoneSwitchRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public UpdatePhoneSwitchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdatePhoneSwitchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdatePhoneSwitchRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public UpdatePhoneSwitchRequest setSubsId(Long subsId) {
        this.subsId = subsId;
        return this;
    }
    public Long getSubsId() {
        return this.subsId;
    }

    public UpdatePhoneSwitchRequest setSwitchStatus(Integer switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public Integer getSwitchStatus() {
        return this.switchStatus;
    }

}
