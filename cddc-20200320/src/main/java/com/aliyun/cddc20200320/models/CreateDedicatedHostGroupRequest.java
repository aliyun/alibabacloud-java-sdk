// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostGroupRequest extends TeaModel {
    @NameInMap("AllocationPolicy")
    public String allocationPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CpuAllocationRatio")
    public Integer cpuAllocationRatio;

    @NameInMap("DedicatedHostGroupDesc")
    public String dedicatedHostGroupDesc;

    @NameInMap("DiskAllocationRatio")
    public Integer diskAllocationRatio;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("HostReplacePolicy")
    public String hostReplacePolicy;

    @NameInMap("MemAllocationRatio")
    public Integer memAllocationRatio;

    @NameInMap("OpenPermission")
    public Integer openPermission;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VPCId")
    public String VPCId;

    public static CreateDedicatedHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostGroupRequest self = new CreateDedicatedHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostGroupRequest setAllocationPolicy(String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
        return this;
    }
    public String getAllocationPolicy() {
        return this.allocationPolicy;
    }

    public CreateDedicatedHostGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDedicatedHostGroupRequest setCpuAllocationRatio(Integer cpuAllocationRatio) {
        this.cpuAllocationRatio = cpuAllocationRatio;
        return this;
    }
    public Integer getCpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }

    public CreateDedicatedHostGroupRequest setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
        this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
        return this;
    }
    public String getDedicatedHostGroupDesc() {
        return this.dedicatedHostGroupDesc;
    }

    public CreateDedicatedHostGroupRequest setDiskAllocationRatio(Integer diskAllocationRatio) {
        this.diskAllocationRatio = diskAllocationRatio;
        return this;
    }
    public Integer getDiskAllocationRatio() {
        return this.diskAllocationRatio;
    }

    public CreateDedicatedHostGroupRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDedicatedHostGroupRequest setHostReplacePolicy(String hostReplacePolicy) {
        this.hostReplacePolicy = hostReplacePolicy;
        return this;
    }
    public String getHostReplacePolicy() {
        return this.hostReplacePolicy;
    }

    public CreateDedicatedHostGroupRequest setMemAllocationRatio(Integer memAllocationRatio) {
        this.memAllocationRatio = memAllocationRatio;
        return this;
    }
    public Integer getMemAllocationRatio() {
        return this.memAllocationRatio;
    }

    public CreateDedicatedHostGroupRequest setOpenPermission(Integer openPermission) {
        this.openPermission = openPermission;
        return this;
    }
    public Integer getOpenPermission() {
        return this.openPermission;
    }

    public CreateDedicatedHostGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDedicatedHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedHostGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDedicatedHostGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDedicatedHostGroupRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

}
