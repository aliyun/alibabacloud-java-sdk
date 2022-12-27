// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceRequest extends TeaModel {
    // The number of vCPUs of the instance type. For information about the valid values, see [Instance families](~~25378~~).
    @NameInMap("Cores")
    public Integer cores;

    // The number of GPUs per GPU-accelerated instance. For information about the valid values, see [GPU-accelerated compute optimized instance types](~~108496~~).
    @NameInMap("GpuAmount")
    public Integer gpuAmount;

    // The GPU type. Valid values:
    // 
    // *   NVIDIA P4
    // *   NVIDIA T4
    // *   NVIDIA P100
    // *   NVIDIA V100
    // *   NVIDIA A100
    // 
    // This parameter is empty by default, which indicates that all GPU types are queried. For more information, see [GPU-accelerated compute optimized instance types](~~108496~~).
    @NameInMap("GpuSpec")
    public String gpuSpec;

    // The level of the instance family. Valid values:
    // 
    // *   EntryLevel
    // *   EnterpriseLevel
    // *   CreditEntryLevel. For more information, see [Burstable instance overview](~~59977~~).
    // 
    // This parameter is empty by default, which indicates that instance families of all levels are queried.
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    // The instance family. For information about the valid values, see [Instance families](~~25378~~).
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    // The list of instance types. You can enter up to 10 instance types.
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    // The memory size of the instance type. Unit: GiB. For information about the valid values, see [Instance families](~~25378~~).
    @NameInMap("Memory")
    public Float memory;

    // The minimum number of vCPUs of the instance type. For information about the valid values, see [Instance families](~~25378~~).
    @NameInMap("MinCores")
    public Integer minCores;

    // The minimum memory size of the instance type. For information about the valid values, see [Instance families](~~25378~~).
    @NameInMap("MinMemory")
    public Float minMemory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the zone.
    // 
    // This parameter is empty by default, which indicates that all zones in the specified region are queried.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeSpotAdviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotAdviceRequest self = new DescribeSpotAdviceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpotAdviceRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeSpotAdviceRequest setGpuAmount(Integer gpuAmount) {
        this.gpuAmount = gpuAmount;
        return this;
    }
    public Integer getGpuAmount() {
        return this.gpuAmount;
    }

    public DescribeSpotAdviceRequest setGpuSpec(String gpuSpec) {
        this.gpuSpec = gpuSpec;
        return this;
    }
    public String getGpuSpec() {
        return this.gpuSpec;
    }

    public DescribeSpotAdviceRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public DescribeSpotAdviceRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeSpotAdviceRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeSpotAdviceRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeSpotAdviceRequest setMinCores(Integer minCores) {
        this.minCores = minCores;
        return this;
    }
    public Integer getMinCores() {
        return this.minCores;
    }

    public DescribeSpotAdviceRequest setMinMemory(Float minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public Float getMinMemory() {
        return this.minMemory;
    }

    public DescribeSpotAdviceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSpotAdviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSpotAdviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSpotAdviceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSpotAdviceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSpotAdviceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
