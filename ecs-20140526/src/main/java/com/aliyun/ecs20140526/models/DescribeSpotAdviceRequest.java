// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceRequest extends TeaModel {
    /**
     * <p>The number of vCPUs of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The number of GPUs of the GPU-accelerated instance. For more information, see <a href="https://help.aliyun.com/document_detail/108496.html">Overview of GPU-accelerated instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GpuAmount")
    public Integer gpuAmount;

    /**
     * <p>The GPU type. Valid values:</p>
     * <ul>
     * <li>NVIDIA P4</li>
     * <li>NVIDIA T4</li>
     * <li>NVIDIA P100 </li>
     * <li>NVIDIA V100</li>
     * </ul>
     * <p>Default value: null, which indicates that all types are queried. For more information, see <a href="https://help.aliyun.com/document_detail/108496.html">Overview of GPU-accelerated instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>NVIDIA T4</p>
     */
    @NameInMap("GpuSpec")
    public String gpuSpec;

    /**
     * <p>The level of the instance family. Valid values:</p>
     * <ul>
     * <li>EntryLevel: entry level.</li>
     * <li>EnterpriseLevel: enterprise level.</li>
     * <li>CreditEntryLevel: credit-based entry level. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
     * </ul>
     * <p>Default value: null, which indicates that all levels are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>EntryLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The list of instance types. You can specify up to 10 instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.large</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The memory size of the instance type. Unit: GiB. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The minimum number of vCPUs of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinCores")
    public Integer minCores;

    /**
     * <p>The minimum memory size of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("MinMemory")
    public Float minMemory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID.</p>
     * <p>Default value: null, which indicates that all zones in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
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
