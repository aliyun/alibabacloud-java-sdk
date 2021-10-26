// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetRtcTokenRequest extends TeaModel {
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

    @NameInMap("UserId")
    public String userId;

    public static GetRtcTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRtcTokenRequest self = new GetRtcTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetRtcTokenRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetRtcTokenRequest setIsCustomAccount(Boolean isCustomAccount) {
        this.isCustomAccount = isCustomAccount;
        return this;
    }
    public Boolean getIsCustomAccount() {
        return this.isCustomAccount;
    }

    public GetRtcTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetRtcTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetRtcTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetRtcTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
