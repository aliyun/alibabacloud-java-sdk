// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class AddMigratableInstancesRequest extends TeaModel {
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

    public static AddMigratableInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMigratableInstancesRequest self = new AddMigratableInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AddMigratableInstancesRequest setBusinessMigrationType(Integer businessMigrationType) {
        this.businessMigrationType = businessMigrationType;
        return this;
    }
    public Integer getBusinessMigrationType() {
        return this.businessMigrationType;
    }

    public AddMigratableInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public AddMigratableInstancesRequest setNetworkMigrationType(Integer networkMigrationType) {
        this.networkMigrationType = networkMigrationType;
        return this;
    }
    public Integer getNetworkMigrationType() {
        return this.networkMigrationType;
    }

    public AddMigratableInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMigratableInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddMigratableInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddMigratableInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddMigratableInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
