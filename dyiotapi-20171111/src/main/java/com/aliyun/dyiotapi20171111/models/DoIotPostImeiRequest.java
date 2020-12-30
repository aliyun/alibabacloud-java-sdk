// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotPostImeiRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Imei")
    public String imei;

    @NameInMap("Comments")
    public String comments;

    @NameInMap("DeviceType")
    public String deviceType;

    public static DoIotPostImeiRequest build(java.util.Map<String, ?> map) throws Exception {
        DoIotPostImeiRequest self = new DoIotPostImeiRequest();
        return TeaModel.build(map, self);
    }

    public DoIotPostImeiRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DoIotPostImeiRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DoIotPostImeiRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DoIotPostImeiRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public DoIotPostImeiRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public DoIotPostImeiRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

}
