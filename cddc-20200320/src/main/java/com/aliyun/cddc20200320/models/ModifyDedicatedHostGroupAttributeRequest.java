// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostGroupAttributeRequest extends TeaModel {
    @NameInMap("AllocationPolicy")
    public String allocationPolicy;

    @NameInMap("CpuAllocationRatio")
    public Integer cpuAllocationRatio;

    @NameInMap("DedicatedHostGroupDesc")
    public String dedicatedHostGroupDesc;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DiskAllocationRatio")
    public Integer diskAllocationRatio;

    @NameInMap("HostReplacePolicy")
    public String hostReplacePolicy;

    @NameInMap("MemAllocationRatio")
    public Integer memAllocationRatio;

    @NameInMap("OpenPermission")
    public String openPermission;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDedicatedHostGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostGroupAttributeRequest self = new ModifyDedicatedHostGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostGroupAttributeRequest setAllocationPolicy(String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
        return this;
    }
    public String getAllocationPolicy() {
        return this.allocationPolicy;
    }

    public ModifyDedicatedHostGroupAttributeRequest setCpuAllocationRatio(Integer cpuAllocationRatio) {
        this.cpuAllocationRatio = cpuAllocationRatio;
        return this;
    }
    public Integer getCpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }

    public ModifyDedicatedHostGroupAttributeRequest setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
        this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
        return this;
    }
    public String getDedicatedHostGroupDesc() {
        return this.dedicatedHostGroupDesc;
    }

    public ModifyDedicatedHostGroupAttributeRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public ModifyDedicatedHostGroupAttributeRequest setDiskAllocationRatio(Integer diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public Integer getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public ModifyDedicatedHostGroupAttributeRequest setHostReplacePolicy(String hostReplacePolicy) {
        this.hostReplacePolicy = hostReplacePolicy;
        return this;
    }
    public String getHostReplacePolicy() {
        return this.hostReplacePolicy;
    }

    public ModifyDedicatedHostGroupAttributeRequest setMemAllocationRatio(Integer memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public Integer getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public ModifyDedicatedHostGroupAttributeRequest setOpenPermission(String openPermission) {
        this.openPermission = openPermission;
        return this;
    }
    public String getOpenPermission() {
        return this.openPermission;
    }

    public ModifyDedicatedHostGroupAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedHostGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostGroupAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDedicatedHostGroupAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
