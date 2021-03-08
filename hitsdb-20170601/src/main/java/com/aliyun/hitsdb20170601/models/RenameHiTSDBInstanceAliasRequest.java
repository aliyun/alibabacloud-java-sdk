// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class RenameHiTSDBInstanceAliasRequest extends TeaModel {
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

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    public static RenameHiTSDBInstanceAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameHiTSDBInstanceAliasRequest self = new RenameHiTSDBInstanceAliasRequest();
        return TeaModel.build(map, self);
    }

    public RenameHiTSDBInstanceAliasRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RenameHiTSDBInstanceAliasRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenameHiTSDBInstanceAliasRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenameHiTSDBInstanceAliasRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RenameHiTSDBInstanceAliasRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RenameHiTSDBInstanceAliasRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RenameHiTSDBInstanceAliasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenameHiTSDBInstanceAliasRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

}
