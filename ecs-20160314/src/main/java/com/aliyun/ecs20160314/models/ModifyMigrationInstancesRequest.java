// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigrationInstancesRequest extends TeaModel {
    @NameInMap("GlobalMigrationTime")
    public String globalMigrationTime;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("NetworkMigrationType")
    public String networkMigrationType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyMigrationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationInstancesRequest self = new ModifyMigrationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationInstancesRequest setGlobalMigrationTime(String globalMigrationTime) {
        this.globalMigrationTime = globalMigrationTime;
        return this;
    }
    public String getGlobalMigrationTime() {
        return this.globalMigrationTime;
    }

    public ModifyMigrationInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ModifyMigrationInstancesRequest setNetworkMigrationType(String networkMigrationType) {
        this.networkMigrationType = networkMigrationType;
        return this;
    }
    public String getNetworkMigrationType() {
        return this.networkMigrationType;
    }

    public ModifyMigrationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMigrationInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ModifyMigrationInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModifyMigrationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMigrationInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMigrationInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
