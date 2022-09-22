// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateMigrationPlanRequest extends TeaModel {
    @NameInMap("CustomMigrationTimes")
    public java.util.List<CustomMigrationTimes> customMigrationTimes;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EnableAutoCreateVSwitch")
    public Boolean enableAutoCreateVSwitch;

    @NameInMap("EnsureNetworkConnectivity")
    public Boolean ensureNetworkConnectivity;

    @NameInMap("GlobalMigrationTime")
    public String globalMigrationTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemainPrivateIp")
    public Boolean remainPrivateIp;

    @NameInMap("RemainPublicMacAsPriority")
    public Boolean remainPublicMacAsPriority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TargetSecurityGroupIds")
    public java.util.List<String> targetSecurityGroupIds;

    @NameInMap("TargetVSwitchId")
    public String targetVSwitchId;

    @NameInMap("TargetVpcId")
    public String targetVpcId;

    @NameInMap("TargetZoneId")
    public String targetZoneId;

    @NameInMap("Type")
    public String type;

    public static CreateMigrationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationPlanRequest self = new CreateMigrationPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationPlanRequest setCustomMigrationTimes(java.util.List<CustomMigrationTimes> customMigrationTimes) {
        this.customMigrationTimes = customMigrationTimes;
        return this;
    }
    public java.util.List<CustomMigrationTimes> getCustomMigrationTimes() {
        return this.customMigrationTimes;
    }

    public CreateMigrationPlanRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateMigrationPlanRequest setEnableAutoCreateVSwitch(Boolean enableAutoCreateVSwitch) {
        this.enableAutoCreateVSwitch = enableAutoCreateVSwitch;
        return this;
    }
    public Boolean getEnableAutoCreateVSwitch() {
        return this.enableAutoCreateVSwitch;
    }

    public CreateMigrationPlanRequest setEnsureNetworkConnectivity(Boolean ensureNetworkConnectivity) {
        this.ensureNetworkConnectivity = ensureNetworkConnectivity;
        return this;
    }
    public Boolean getEnsureNetworkConnectivity() {
        return this.ensureNetworkConnectivity;
    }

    public CreateMigrationPlanRequest setGlobalMigrationTime(String globalMigrationTime) {
        this.globalMigrationTime = globalMigrationTime;
        return this;
    }
    public String getGlobalMigrationTime() {
        return this.globalMigrationTime;
    }

    public CreateMigrationPlanRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateMigrationPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMigrationPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMigrationPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMigrationPlanRequest setRemainPrivateIp(Boolean remainPrivateIp) {
        this.remainPrivateIp = remainPrivateIp;
        return this;
    }
    public Boolean getRemainPrivateIp() {
        return this.remainPrivateIp;
    }

    public CreateMigrationPlanRequest setRemainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
        this.remainPublicMacAsPriority = remainPublicMacAsPriority;
        return this;
    }
    public Boolean getRemainPublicMacAsPriority() {
        return this.remainPublicMacAsPriority;
    }

    public CreateMigrationPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMigrationPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMigrationPlanRequest setTargetSecurityGroupIds(java.util.List<String> targetSecurityGroupIds) {
        this.targetSecurityGroupIds = targetSecurityGroupIds;
        return this;
    }
    public java.util.List<String> getTargetSecurityGroupIds() {
        return this.targetSecurityGroupIds;
    }

    public CreateMigrationPlanRequest setTargetVSwitchId(String targetVSwitchId) {
        this.targetVSwitchId = targetVSwitchId;
        return this;
    }
    public String getTargetVSwitchId() {
        return this.targetVSwitchId;
    }

    public CreateMigrationPlanRequest setTargetVpcId(String targetVpcId) {
        this.targetVpcId = targetVpcId;
        return this;
    }
    public String getTargetVpcId() {
        return this.targetVpcId;
    }

    public CreateMigrationPlanRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

    public CreateMigrationPlanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CustomMigrationTimes extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MigrationTime")
        public String migrationTime;

        public static CustomMigrationTimes build(java.util.Map<String, ?> map) throws Exception {
            CustomMigrationTimes self = new CustomMigrationTimes();
            return TeaModel.build(map, self);
        }

        public CustomMigrationTimes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CustomMigrationTimes setMigrationTime(String migrationTime) {
            this.migrationTime = migrationTime;
            return this;
        }
        public String getMigrationTime() {
            return this.migrationTime;
        }

    }

}
