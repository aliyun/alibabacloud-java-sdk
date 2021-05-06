// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class UnbindDBResourcePoolWithUserRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("PoolName")
    public String poolName;

    @NameInMap("PoolUser")
    public String poolUser;

    public static UnbindDBResourcePoolWithUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourcePoolWithUserRequest self = new UnbindDBResourcePoolWithUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourcePoolWithUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindDBResourcePoolWithUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindDBResourcePoolWithUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindDBResourcePoolWithUserRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnbindDBResourcePoolWithUserRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UnbindDBResourcePoolWithUserRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public UnbindDBResourcePoolWithUserRequest setPoolUser(String poolUser) {
        this.poolUser = poolUser;
        return this;
    }
    public String getPoolUser() {
        return this.poolUser;
    }

}
