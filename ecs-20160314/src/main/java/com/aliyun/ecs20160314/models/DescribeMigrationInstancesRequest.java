// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationInstancesRequest extends TeaModel {
    @NameInMap("BusinessMigrationType")
    public String businessMigrationType;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("MigrationPlanId")
    public String migrationPlanId;

    @NameInMap("MigrationStatus")
    public String migrationStatus;

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

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeMigrationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationInstancesRequest self = new DescribeMigrationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationInstancesRequest setBusinessMigrationType(String businessMigrationType) {
        this.businessMigrationType = businessMigrationType;
        return this;
    }
    public String getBusinessMigrationType() {
        return this.businessMigrationType;
    }

    public DescribeMigrationInstancesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeMigrationInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DescribeMigrationInstancesRequest setMigrationPlanId(String migrationPlanId) {
        this.migrationPlanId = migrationPlanId;
        return this;
    }
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    public DescribeMigrationInstancesRequest setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    public DescribeMigrationInstancesRequest setNetworkMigrationType(String networkMigrationType) {
        this.networkMigrationType = networkMigrationType;
        return this;
    }
    public String getNetworkMigrationType() {
        return this.networkMigrationType;
    }

    public DescribeMigrationInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMigrationInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMigrationInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMigrationInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMigrationInstancesRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public DescribeMigrationInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
