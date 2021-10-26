// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class VoipGetTokenRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("IsCustomAccount")
    public Boolean isCustomAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VoipId")
    public String voipId;

    public static VoipGetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VoipGetTokenRequest self = new VoipGetTokenRequest();
        return TeaModel.build(map, self);
    }

    public VoipGetTokenRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public VoipGetTokenRequest setIsCustomAccount(Boolean isCustomAccount) {
        this.isCustomAccount = isCustomAccount;
        return this;
    }
    public Boolean getIsCustomAccount() {
        return this.isCustomAccount;
    }

    public VoipGetTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VoipGetTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public VoipGetTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public VoipGetTokenRequest setVoipId(String voipId) {
        this.voipId = voipId;
        return this;
    }
    public String getVoipId() {
        return this.voipId;
    }

}
