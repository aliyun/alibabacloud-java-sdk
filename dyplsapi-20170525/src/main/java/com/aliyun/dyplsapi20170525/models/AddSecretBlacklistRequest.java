// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("BlackNo")
    public String blackNo;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("BlackType")
    public String blackType;

    @NameInMap("WayControl")
    public String wayControl;

    public static AddSecretBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSecretBlacklistRequest self = new AddSecretBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public AddSecretBlacklistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddSecretBlacklistRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddSecretBlacklistRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddSecretBlacklistRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public AddSecretBlacklistRequest setBlackNo(String blackNo) {
        this.blackNo = blackNo;
        return this;
    }
    public String getBlackNo() {
        return this.blackNo;
    }

    public AddSecretBlacklistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddSecretBlacklistRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

    public AddSecretBlacklistRequest setWayControl(String wayControl) {
        this.wayControl = wayControl;
        return this;
    }
    public String getWayControl() {
        return this.wayControl;
    }

}
