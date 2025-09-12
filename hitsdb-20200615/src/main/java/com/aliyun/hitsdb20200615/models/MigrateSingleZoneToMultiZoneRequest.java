// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class MigrateSingleZoneToMultiZoneRequest extends TeaModel {
    @NameInMap("ArbitraryVSwitchId")
    public String arbitraryVSwitchId;

    @NameInMap("ArbitraryZoneId")
    public String arbitraryZoneId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    public static MigrateSingleZoneToMultiZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateSingleZoneToMultiZoneRequest self = new MigrateSingleZoneToMultiZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateSingleZoneToMultiZoneRequest setArbitraryVSwitchId(String arbitraryVSwitchId) {
        this.arbitraryVSwitchId = arbitraryVSwitchId;
        return this;
    }
    public String getArbitraryVSwitchId() {
        return this.arbitraryVSwitchId;
    }

    public MigrateSingleZoneToMultiZoneRequest setArbitraryZoneId(String arbitraryZoneId) {
        this.arbitraryZoneId = arbitraryZoneId;
        return this;
    }
    public String getArbitraryZoneId() {
        return this.arbitraryZoneId;
    }

    public MigrateSingleZoneToMultiZoneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public MigrateSingleZoneToMultiZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MigrateSingleZoneToMultiZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MigrateSingleZoneToMultiZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateSingleZoneToMultiZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateSingleZoneToMultiZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateSingleZoneToMultiZoneRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public MigrateSingleZoneToMultiZoneRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public MigrateSingleZoneToMultiZoneRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

}
