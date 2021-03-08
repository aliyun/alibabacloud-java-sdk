// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class ModifyHiTSDBInstanceClassRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("InstanceStorage")
    public String instanceStorage;

    public static ModifyHiTSDBInstanceClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHiTSDBInstanceClassRequest self = new ModifyHiTSDBInstanceClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHiTSDBInstanceClassRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyHiTSDBInstanceClassRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHiTSDBInstanceClassRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHiTSDBInstanceClassRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyHiTSDBInstanceClassRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyHiTSDBInstanceClassRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ModifyHiTSDBInstanceClassRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHiTSDBInstanceClassRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public ModifyHiTSDBInstanceClassRequest setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

}
