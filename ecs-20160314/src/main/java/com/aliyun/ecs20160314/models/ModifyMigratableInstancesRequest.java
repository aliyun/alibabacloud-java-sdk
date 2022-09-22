// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigratableInstancesRequest extends TeaModel {
    @NameInMap("BusinessMigrationType")
    public Integer businessMigrationType;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("NetworkMigrationType")
    public Integer networkMigrationType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyMigratableInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigratableInstancesRequest self = new ModifyMigratableInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMigratableInstancesRequest setBusinessMigrationType(Integer businessMigrationType) {
        this.businessMigrationType = businessMigrationType;
        return this;
    }
    public Integer getBusinessMigrationType() {
        return this.businessMigrationType;
    }

    public ModifyMigratableInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ModifyMigratableInstancesRequest setNetworkMigrationType(Integer networkMigrationType) {
        this.networkMigrationType = networkMigrationType;
        return this;
    }
    public Integer getNetworkMigrationType() {
        return this.networkMigrationType;
    }

    public ModifyMigratableInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMigratableInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMigratableInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMigratableInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMigratableInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
