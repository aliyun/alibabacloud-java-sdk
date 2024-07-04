// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scaling configurations.</p>
     */
    @NameInMap("ScalingConfigurations")
    public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations;

    /**
     * <p>The total number of scaling configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigurationsResponseBody self = new DescribeScalingConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingConfigurationsResponseBody setScalingConfigurations(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurations> scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
        return this;
    }
    public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurations> getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    public DescribeScalingConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities extends TeaModel {
        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6a.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp14zolna43z266bq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy that is applied to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Indicates whether the Performance Burst feature is enabled for the data disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only when you set <code>DataDisk.Category</code> to <code>cloud_auto</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The categories of the data disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk. DeleteWithInstance of a basic disk created along with the ECS instance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk. DeleteWithInstance of a basic disk created along with the ECS instance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Indicates whether the data disk is released when the instance to which the data disk is attached is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount target of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether the data disk is encrypted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is applied to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The PL of the data disk that is an ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS of the data disk.</p>
         * <blockquote>
         * <p> IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GB. Valid values:</p>
         * <ul>
         * <li>5 to 2000 if you set Category to cloud.</li>
         * <li>20 to 32768 if you set Category to cloud_efficiency.</li>
         * <li>20 to 32768 if you set Category to cloud_ssd.</li>
         * <li>20 to 32768 if you set Category to cloud_essd.</li>
         * <li>5 to 800 if you set Category to ephemeral_ssd.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot based on which the data disk is created.</p>
         * 
         * <strong>example:</strong>
         * <p>s-23f2i****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos extends TeaModel {
        /**
         * <p>The architecture types of the instance types. Valid values:</p>
         * <ul>
         * <li>X86: x86</li>
         * <li>Heterogeneous: heterogeneous computing, such as GPU-accelerated or FPGA-accelerated</li>
         * <li>BareMetal: ECS Bare Metal Instance</li>
         * <li>Arm: Arm</li>
         * <li>SuperComputeCluster: Super Computing Cluster</li>
         * </ul>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Indicates whether burstable instance types are included. Valid values:</p>
         * <ul>
         * <li>Exclude: Burstable instance types are not included.</li>
         * <li>Include: Burstable instance types are included.</li>
         * <li>Required: Only burstable instance types are included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPUs of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types that are excluded. You can use wildcard characters, such as an asterisk (\*), to exclude an instance type or an instance family. Examples:</p>
         * <ul>
         * <li>ecs.c6.large: The ecs.c6.large instance type is excluded.</li>
         * <li>ecs.c6.\*: The c6 instance family is excluded.</li>
         * </ul>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family.</p>
         * <ul>
         * <li>EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources, and are suitable for scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum hourly price for the pay-as-you-go or preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        @NameInMap("MaximumGpuAmount")
        public Integer maximumGpuAmount;

        @NameInMap("MaximumMemorySize")
        public Float maximumMemorySize;

        /**
         * <p>The memory size of the instance type. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        @NameInMap("MinimumInitialCredit")
        public Integer minimumInitialCredit;

        @NameInMap("MinimumMemorySize")
        public Float minimumMemorySize;

        @NameInMap("PhysicalProcessorModels")
        public java.util.List<String> physicalProcessorModels;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setCpuArchitectures(java.util.List<String> cpuArchitectures) {
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setGpuSpecs(java.util.List<String> gpuSpecs) {
            this.gpuSpecs = gpuSpecs;
            return this;
        }
        public java.util.List<String> getGpuSpecs() {
            return this.gpuSpecs;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setInstanceCategories(java.util.List<String> instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }
        public java.util.List<String> getInstanceCategories() {
            return this.instanceCategories;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public java.util.List<String> getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
            this.maximumCpuCoreCount = maximumCpuCoreCount;
            return this;
        }
        public Integer getMaximumCpuCoreCount() {
            return this.maximumCpuCoreCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMaximumGpuAmount(Integer maximumGpuAmount) {
            this.maximumGpuAmount = maximumGpuAmount;
            return this;
        }
        public Integer getMaximumGpuAmount() {
            return this.maximumGpuAmount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMaximumMemorySize(Float maximumMemorySize) {
            this.maximumMemorySize = maximumMemorySize;
            return this;
        }
        public Float getMaximumMemorySize() {
            return this.maximumMemorySize;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumBaselineCredit(Integer minimumBaselineCredit) {
            this.minimumBaselineCredit = minimumBaselineCredit;
            return this;
        }
        public Integer getMinimumBaselineCredit() {
            return this.minimumBaselineCredit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
            this.minimumCpuCoreCount = minimumCpuCoreCount;
            return this;
        }
        public Integer getMinimumCpuCoreCount() {
            return this.minimumCpuCoreCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }
        public Integer getMinimumEniIpv6AddressQuantity() {
            return this.minimumEniIpv6AddressQuantity;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getMinimumEniPrivateIpAddressQuantity() {
            return this.minimumEniPrivateIpAddressQuantity;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumEniQuantity(Integer minimumEniQuantity) {
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }
        public Integer getMinimumEniQuantity() {
            return this.minimumEniQuantity;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumGpuAmount(Integer minimumGpuAmount) {
            this.minimumGpuAmount = minimumGpuAmount;
            return this;
        }
        public Integer getMinimumGpuAmount() {
            return this.minimumGpuAmount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumInitialCredit(Integer minimumInitialCredit) {
            this.minimumInitialCredit = minimumInitialCredit;
            return this;
        }
        public Integer getMinimumInitialCredit() {
            return this.minimumInitialCredit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setMinimumMemorySize(Float minimumMemorySize) {
            this.minimumMemorySize = minimumMemorySize;
            return this;
        }
        public Float getMinimumMemorySize() {
            return this.minimumMemorySize;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos setPhysicalProcessorModels(java.util.List<String> physicalProcessorModels) {
            this.physicalProcessorModels = physicalProcessorModels;
            return this;
        }
        public java.util.List<String> getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces extends TeaModel {
        /**
         * <p>The ENI type. Valid values:</p>
         * <ul>
         * <li>Primary: the primary ENI</li>
         * <li>Secondary: the secondary ENI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The number of randomly generated IPv6 addresses that are allocated to the primary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication mode of the ENI. Valid values:</p>
         * <ul>
         * <li>Standard: The TCP communication mode is used.</li>
         * <li>HighPerformance: The Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The IDs of the security groups to which the ENIs belong.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testManagedPrivateSpaceId</p>
         */
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The price limit of the preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0.125</p>
         */
        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags extends TeaModel {
        /**
         * <p>The tag key of the ECS instance. You can specify up to 20 tags for each ECS instance.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with <code>acs:</code> or <code>aliyun</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>binary</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the ECS instance. You can specify up to 20 tags for each ECS instance.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>alterTable</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurations extends TeaModel {
        /**
         * <p>Indicates whether the ECS instance on a dedicated host is associated with the dedicated host. Valid values:</p>
         * <ul>
         * <li>default: The instance is not associated with the dedicated host. If you restart an instance that was stopped in Economical Mode and the original dedicated host of the instance has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</li>
         * <li>host: The instance is associated with the dedicated host. If you restart an instance that was stopped in Economical Mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot be restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Affinity")
        public String affinity;

        /**
         * <p>The number of vCPUs.</p>
         * <p>You can specify CPU and Memory to define the range of instance types. For example, if you set CPU to 2 and Memory to 16, the instance types that have 2 vCPUs and 16 GiB are returned. If you specify CPU and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones and preferentially creates instances by using the lowest-priced instance type.</p>
         * <blockquote>
         * <p> You can specify CPU and Memory to define instance types only when you set Scaling Policy to Cost Optimization and no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time at which the scaling configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The performance mode of the burstable instances. Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
         * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The priority of the custom ECS instance type + vSwitch combination.</p>
         * <blockquote>
         * <p> This parameter takes effect only when Scaling Policy of the scaling group is set to Priority Policy.</p>
         * </blockquote>
         * <p>If Auto Scaling cannot create ECS instances by using the custom ECS instance type + vSwitch combination of the highest priority, Auto Scaling creates ECS instances by using the custom ECS instance type + vSwitch combination of the next highest priority.</p>
         * <blockquote>
         * <p> If you specify the priorities of only a portion of custom ECS instance type + vSwitch combinations, Auto Scaling preferentially creates ECS instances by using the custom combinations that have specified priorities. If the custom combinations that have specified priorities do not provide sufficient resources, Auto Scaling creates ECS instances by using the custom combinations that do not have specified priorities based on the specified orders of vSwitches and instance types.</p>
         * </blockquote>
         * <ul>
         * <li>Example: the specified order of vSwitches for your scaling group is vsw1 and vsw2 and the specified order of instance types in your scaling configuration is type1 and type 2. In addition, you use CustomPriorities to specify [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;]. In this example, the vsw2+type2 combination has the highest priority and the vsw2+type1 combination has the lowest priority. The vsw1+type2 combination has a higher priority than the vsw1+type1 combination.</li>
         * </ul>
         */
        @NameInMap("CustomPriorities")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities> customPriorities;

        /**
         * <p>The data disks.</p>
         */
        @NameInMap("DataDisks")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> dataDisks;

        /**
         * <p>The ID of the dedicated host cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-zm04u8r3lohsq****</p>
         */
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        /**
         * <p>The ID of the dedicated host on which the ECS instance is created. Preemptible instances are not supported by dedicated hosts. Therefore, if you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.</p>
         * <p>You can call the DescribeDedicatedHosts operation to query the IDs of dedicated hosts.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>Indicates whether Release Protection is enabled for the ECS instances. You can specify this parameter to determine whether the ECS instances can be deleted by using the ECS console or calling the DeleteInstance operation. Valid values:</p>
         * <ul>
         * <li>true: Release Protection is enabled for the ECS instances. You cannot delete the ECS instances by using the ECS console or calling the DeleteInstance operation.</li>
         * <li>false: Release Protection is disabled for the ECS instances. You can delete the ECS instances by using the ECS console or calling the DeleteInstance operation.</li>
         * </ul>
         * <blockquote>
         * <p> You can enable Release Protection for only pay-as-you-go instances to prevent unexpected instance deletion during scale-in events. The Release Protection feature does not affect normal scaling activities. In other words, an instance that meets the criteria of scale-in policies may be removed from a scaling group during a scale-in event even if you enabled Release Protection for the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The ID of the deployment set to which the Elastic Compute Service (ECS) instances belong.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4p****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The hostname series of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>LocalHost</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the High Performance Computing (HPC) cluster to which the ECS instances belong.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-clus****</p>
         */
        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        /**
         * <p>The name of the image family. You can specify this parameter to obtain the latest available images in the current image family for instance creation. If you specify ImageId, you cannot specify <code>ImageFamily</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The ID of the image file that provides the image resource for Auto Scaling to create ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Indicates whether the ecs-user username can be used to log on to an ECS instance created from the scaling configuration. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ImageOptionsLoginAsNonRoot")
        public Boolean imageOptionsLoginAsNonRoot;

        /**
         * <p>The image source. Valid values:</p>
         * <ul>
         * <li>system: a public image provided by Alibaba Cloud</li>
         * <li>self: a custom image that you created</li>
         * <li>others: a shared image from another Alibaba Cloud account or a community image published by another Alibaba Cloud account</li>
         * <li>marketplace: an Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The description of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The generation of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-3</p>
         */
        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        /**
         * <p>The naming series of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>instance****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The information about the intelligent configuration settings, which determines the available instance types.</p>
         */
        @NameInMap("InstancePatternInfos")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> instancePatternInfos;

        /**
         * <p>The instance types of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ECS instance types.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth. You are charged for the bandwidth that you specified by using InternetMaxBandwidthOut.</li>
         * <li>PayByTraffic: pay-by-traffic. You are charged for the actual traffic that you used. InternetMaxBandwidthOut specifies only the maximum available bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound bandwidth. Unit: Mbit/s. Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>0 to 1024 if you set InternetChargeType to PayByBandwidth. If you leave this parameter empty, this parameter is automatically set to 0.</li>
         * <li>0 to 1024 if you set InternetChargeType to PayByTraffic. If you leave this parameter empty, an error is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Indicates whether the ECS instances are I/O optimized. Valid values:</p>
         * <ul>
         * <li>none: The ECS instances are not I/O optimized.</li>
         * <li>optimized: The ECS instances are I/O optimized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The number of randomly generated IPv6 addresses that are allocated to the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The name of the key pair that is used to log on to an ECS instance created from the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>keypair****</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The status of the scaling configuration in the scaling group. Valid values:</p>
         * <ul>
         * <li>Active: The scaling configuration is active in the scaling group. Auto Scaling uses the scaling configuration that is in the Active state to create ECS instances during scale-out events.</li>
         * <li>Inactive: The scaling configuration is inactive in the scaling group. Scaling configurations that are in the Inactive state are still contained in the scaling group, but Auto Scaling does not use the inactive scaling configurations to create ECS instances during scale-out events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of an ECS instance as a backend server. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The memory size. Unit: GiB.</p>
         * <p>You can specify CPU and Memory to define the range of instance types. For example, if you set CPU to 2 and Memory to 16, the instance types that have 2 vCPUs and 16 GiB are returned. If you specify CPU and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones and preferentially creates instances by using the lowest-priced instance type.</p>
         * <blockquote>
         * <p> You can specify CPU and Memory to define instance types only when you set Scaling Policy to Cost Optimization and no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The ENIs.</p>
         */
        @NameInMap("NetworkInterfaces")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces> networkInterfaces;

        /**
         * <p>Indicates whether the password preconfigured in the image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        @NameInMap("PasswordSetted")
        public Boolean passwordSetted;

        @NameInMap("PrivatePoolOptions.Id")
        public String privatePoolOptions_id;

        @NameInMap("PrivatePoolOptions.MatchCriteria")
        public String privatePoolOptions_matchCriteria;

        /**
         * <p>The name of the Resource Access Management (RAM) role assumed by the ECS instances. This name is provided and maintained by RAM. You can call the ListRoles operation to query the available RAM roles.</p>
         * 
         * <strong>example:</strong>
         * <p>ramrole****</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the resource group to which the ECS instances belong.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzn2ou7xo****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp1ezrfgoyn5kijl****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The name of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>scalingconfigura****</p>
         */
        @NameInMap("ScalingConfigurationName")
        public String scalingConfigurationName;

        /**
         * <p>The ID of the scaling group to which the scaling configuration belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp17pelvl720x3v7****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         */
        @NameInMap("SchedulerOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions schedulerOptions;

        /**
         * <p>Indicates whether Security Hardening is enabled. Valid values:</p>
         * <ul>
         * <li>Active: Security Hardening is enabled. This value is applicable to only public images.</li>
         * <li>Deactive: Security Hardening is disabled. This value is applicable to all images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of the security group to which the ECS instances belong. ECS instances that belong to the same security group can communicate with each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp18kz60mefs****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which the ECS instances belong. ECS instances that belong to the same security group can communicate with each other.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The protection period of the preemptible instances. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption event of the preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The preemptible instances.</p>
         */
        @NameInMap("SpotPriceLimits")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> spotPriceLimits;

        /**
         * <p>The preemption policy that is applied to pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instances are created as regular pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instances are created as preemptible instances that have a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instances are preemptible instances for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The ID of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-bp67acfmxazb4p****</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The maximum number of partitions in the storage set. The value is an integer that is greater than or equal to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The ID of the automatic snapshot policy that is applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        public String systemDiskAutoSnapshotPolicyId;

        /**
         * <p>Indicates whether the Performance Burst feature is enabled for the system disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only when you set SystemDisk.Category to cloud_auto.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemDiskBurstingEnabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The categories of the system disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: ESSD</li>
         * </ul>
         */
        @NameInMap("SystemDiskCategories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>ephemeral_ssd: local SSD</li>
         * <li>cloud_essd: enterprise SSD (ESSD)</li>
         * <li>cloud_auto: ESSD AutoPL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The description of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>The encryption algorithm that is applied to the system disk. Valid values:</p>
         * <ul>
         * <li>AES-256</li>
         * <li>SM4-128</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES-256</p>
         */
        @NameInMap("SystemDiskEncryptAlgorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Indicates whether the system disk is encrypted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemDiskEncrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the KMS key that is applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("SystemDiskKMSKeyId")
        public String systemDiskKMSKeyId;

        /**
         * <p>The name of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd_Test</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The performance level (PL) of the system disk that is an ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned IOPS of the system disk.</p>
         * <blockquote>
         * <p> IOPS measures the number of read and write operations that an EBS device can process per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskProvisionedIops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> tags;

        /**
         * <p>Indicates whether the ECS instance is created on a dedicated host. Valid values:</p>
         * <ul>
         * <li>default: The ECS instance is created on a non-dedicated host.</li>
         * <li>host: The ECS instance is created on a dedicated host. If you do not specify DedicatedHostId, the system selects a dedicated host for the ECS instance.</li>
         * </ul>
         * <p>Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Tenancy")
        public String tenancy;

        /**
         * <p>The user data of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>echo hello ecs!</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The weights of the instance types. The value of this parameter indicates the capacity of an instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the instance type are required to meet the expected capacity requirement.</p>
         */
        @NameInMap("WeightedCapacities")
        public java.util.List<Integer> weightedCapacities;

        /**
         * <p>The ID of the zone in which the ECS instances are created. You can call the DescribeZones operation to query the zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurations self = new DescribeScalingConfigurationsResponseBodyScalingConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCustomPriorities(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities> customPriorities) {
            this.customPriorities = customPriorities;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities> getCustomPriorities() {
            return this.customPriorities;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDataDisks(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageOptionsLoginAsNonRoot(Boolean imageOptionsLoginAsNonRoot) {
            this.imageOptionsLoginAsNonRoot = imageOptionsLoginAsNonRoot;
            return this;
        }
        public Boolean getImageOptionsLoginAsNonRoot() {
            return this.imageOptionsLoginAsNonRoot;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstancePatternInfos(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> instancePatternInfos) {
            this.instancePatternInfos = instancePatternInfos;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> getInstancePatternInfos() {
            return this.instancePatternInfos;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setNetworkInterfaces(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setPasswordSetted(Boolean passwordSetted) {
            this.passwordSetted = passwordSetted;
            return this;
        }
        public Boolean getPasswordSetted() {
            return this.passwordSetted;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setPrivatePoolOptions_id(String privatePoolOptions_id) {
            this.privatePoolOptions_id = privatePoolOptions_id;
            return this;
        }
        public String getPrivatePoolOptions_id() {
            return this.privatePoolOptions_id;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setPrivatePoolOptions_matchCriteria(String privatePoolOptions_matchCriteria) {
            this.privatePoolOptions_matchCriteria = privatePoolOptions_matchCriteria;
            return this;
        }
        public String getPrivatePoolOptions_matchCriteria() {
            return this.privatePoolOptions_matchCriteria;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingConfigurationName(String scalingConfigurationName) {
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSchedulerOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotPriceLimits(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> spotPriceLimits) {
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
            this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskAutoSnapshotPolicyId() {
            return this.systemDiskAutoSnapshotPolicyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskKMSKeyId(String systemDiskKMSKeyId) {
            this.systemDiskKMSKeyId = systemDiskKMSKeyId;
            return this;
        }
        public String getSystemDiskKMSKeyId() {
            return this.systemDiskKMSKeyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setTags(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> getTags() {
            return this.tags;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setWeightedCapacities(java.util.List<Integer> weightedCapacities) {
            this.weightedCapacities = weightedCapacities;
            return this;
        }
        public java.util.List<Integer> getWeightedCapacities() {
            return this.weightedCapacities;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
