// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CancelMigrationInstancesRequest extends TeaModel {
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

    public static CancelMigrationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrationInstancesRequest self = new CancelMigrationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CancelMigrationInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public CancelMigrationInstancesRequest setNetworkMigrationType(String networkMigrationType) {
        this.networkMigrationType = networkMigrationType;
        return this;
    }
    public String getNetworkMigrationType() {
        return this.networkMigrationType;
    }

    public CancelMigrationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelMigrationInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CancelMigrationInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CancelMigrationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelMigrationInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelMigrationInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
