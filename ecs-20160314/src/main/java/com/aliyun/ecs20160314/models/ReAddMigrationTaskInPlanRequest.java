// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ReAddMigrationTaskInPlanRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MigrationPlanId")
    public String migrationPlanId;

    @NameInMap("MigrationTime")
    public String migrationTime;

    @NameInMap("NetworkMigrationType")
    public String networkMigrationType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ReAddMigrationTaskInPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ReAddMigrationTaskInPlanRequest self = new ReAddMigrationTaskInPlanRequest();
        return TeaModel.build(map, self);
    }

    public ReAddMigrationTaskInPlanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReAddMigrationTaskInPlanRequest setMigrationPlanId(String migrationPlanId) {
        this.migrationPlanId = migrationPlanId;
        return this;
    }
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    public ReAddMigrationTaskInPlanRequest setMigrationTime(String migrationTime) {
        this.migrationTime = migrationTime;
        return this;
    }
    public String getMigrationTime() {
        return this.migrationTime;
    }

    public ReAddMigrationTaskInPlanRequest setNetworkMigrationType(String networkMigrationType) {
        this.networkMigrationType = networkMigrationType;
        return this;
    }
    public String getNetworkMigrationType() {
        return this.networkMigrationType;
    }

    public ReAddMigrationTaskInPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReAddMigrationTaskInPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReAddMigrationTaskInPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReAddMigrationTaskInPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
