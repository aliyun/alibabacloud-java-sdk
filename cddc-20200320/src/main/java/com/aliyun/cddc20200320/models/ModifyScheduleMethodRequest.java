// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyScheduleMethodRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceDistribution")
    public String instanceDistribution;

    @NameInMap("ZoneDistribution")
    public String zoneDistribution;

    @NameInMap("CpuUtilityThreshold")
    public String cpuUtilityThreshold;

    @NameInMap("MemoryUtilityThreshold")
    public String memoryUtilityThreshold;

    @NameInMap("LocalDiskUtilityThreshold")
    public String localDiskUtilityThreshold;

    @NameInMap("ZonesOrder")
    public String zonesOrder;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyScheduleMethodRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduleMethodRequest self = new ModifyScheduleMethodRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduleMethodRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScheduleMethodRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScheduleMethodRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScheduleMethodRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public ModifyScheduleMethodRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ModifyScheduleMethodRequest setInstanceDistribution(String instanceDistribution) {
        this.instanceDistribution = instanceDistribution;
        return this;
    }
    public String getInstanceDistribution() {
        return this.instanceDistribution;
    }

    public ModifyScheduleMethodRequest setZoneDistribution(String zoneDistribution) {
        this.zoneDistribution = zoneDistribution;
        return this;
    }
    public String getZoneDistribution() {
        return this.zoneDistribution;
    }

    public ModifyScheduleMethodRequest setCpuUtilityThreshold(String cpuUtilityThreshold) {
        this.cpuUtilityThreshold = cpuUtilityThreshold;
        return this;
    }
    public String getCpuUtilityThreshold() {
        return this.cpuUtilityThreshold;
    }

    public ModifyScheduleMethodRequest setMemoryUtilityThreshold(String memoryUtilityThreshold) {
        this.memoryUtilityThreshold = memoryUtilityThreshold;
        return this;
    }
    public String getMemoryUtilityThreshold() {
        return this.memoryUtilityThreshold;
    }

    public ModifyScheduleMethodRequest setLocalDiskUtilityThreshold(String localDiskUtilityThreshold) {
        this.localDiskUtilityThreshold = localDiskUtilityThreshold;
        return this;
    }
    public String getLocalDiskUtilityThreshold() {
        return this.localDiskUtilityThreshold;
    }

    public ModifyScheduleMethodRequest setZonesOrder(String zonesOrder) {
        this.zonesOrder = zonesOrder;
        return this;
    }
    public String getZonesOrder() {
        return this.zonesOrder;
    }

    public ModifyScheduleMethodRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
