// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterRequest extends TeaModel {
    @NameInMap("SchedulerOptions")
    public SchedulerOptions schedulerOptions;

    @NameInMap("DedicatedHostClusterName")
    public String dedicatedHostClusterName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    public static CreateDedicatedHostClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostClusterRequest self = new CreateDedicatedHostClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostClusterRequest setSchedulerOptions(SchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public SchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public CreateDedicatedHostClusterRequest setDedicatedHostClusterName(String dedicatedHostClusterName) {
        this.dedicatedHostClusterName = dedicatedHostClusterName;
        return this;
    }
    public String getDedicatedHostClusterName() {
        return this.dedicatedHostClusterName;
    }

    public CreateDedicatedHostClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDedicatedHostClusterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDedicatedHostClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDedicatedHostClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDedicatedHostClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedHostClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDedicatedHostClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDedicatedHostClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDedicatedHostClusterRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateDedicatedHostClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class SchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static SchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            SchedulerOptions self = new SchedulerOptions();
            return TeaModel.build(map, self);
        }

        public SchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

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
