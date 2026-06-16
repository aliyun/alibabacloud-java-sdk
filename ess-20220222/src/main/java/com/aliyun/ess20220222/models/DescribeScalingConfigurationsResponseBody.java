// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The collection of scaling configuration information.</p>
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

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions extends TeaModel {
        /**
         * <p>Nested virtualization, whether to enable hardware-based nested virtualization. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("NestedVirtualization")
        public String nestedVirtualization;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions setNestedVirtualization(String nestedVirtualization) {
            this.nestedVirtualization = nestedVirtualization;
            return this;
        }
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities extends TeaModel {
        /**
         * <p>The instance type of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6a.4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the virtual switch.</p>
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
         * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Whether Burst (performance burst) is enabled for the data disk. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter appears only when <code>DataDisk.Category</code> is <code>cloud_auto</code>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>Multiple disk categories for the data disk. The first disk category has the highest priority, followed by others in descending order. If Auto Scaling cannot use a higher-priority disk category, it automatically tries the next priority category to create the data disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk. Basic disks created with an instance have DeleteWithInstance set to true.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The disk category of the data disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk. Basic disks created with an instance have DeleteWithInstance set to true.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>ephemeral_ssd: local SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud_auto: ESSD AutoPL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Whether to release the data disk when releasing the instance. Valid values:</p>
         * <ul>
         * <li><p>true: Release the disk along with the instance.</p>
         * </li>
         * <li><p>false: Keep the disk when releasing the instance.</p>
         * </li>
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
         * <p>Whether the data disk is encrypted. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypted.</p>
         * </li>
         * <li><p>false: Not encrypted.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The KMS key ID corresponding to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metric for the data disk.</p>
         * <blockquote>
         * <p>IOPS (Input/Output Operations Per Second) measures the number of I/O operations per second, indicating block storage read/write capability. Unit: operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>cloud: 5–2000.</p>
         * </li>
         * <li><p>cloud_efficiency: 20–32768.</p>
         * </li>
         * <li><p>cloud_ssd: 20–32768.</p>
         * </li>
         * <li><p>cloud_essd: 20–32768.</p>
         * </li>
         * <li><p>ephemeral_ssd: 5–800.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot ID used to create the data disk.</p>
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
         * <p>The architecture type of the instance type. Valid values:</p>
         * <ul>
         * <li><p>X86: X86 compute.</p>
         * </li>
         * <li><p>Heterogeneous: Heterogeneous compute, such as GPU or FPGA.</p>
         * </li>
         * <li><p>BareMetal: ECS Bare Metal Instance.</p>
         * </li>
         * <li><p>Arm: Arm compute.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Whether the instance type supports performance burst. Valid values:</p>
         * <ul>
         * <li><p>Exclude: Exclude burstable instance types.</p>
         * </li>
         * <li><p>Include: Include burstable instance types.</p>
         * </li>
         * <li><p>Required: Include only burstable instance types.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPU cores for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU architecture of the instance type. Valid values:</p>
         * <blockquote>
         * <p>N indicates multiple CPU architectures can be specified. N ranges from 1 to 2.</p>
         * </blockquote>
         * <ul>
         * <li><p>X86.</p>
         * </li>
         * <li><p>ARM.</p>
         * </li>
         * </ul>
         */
        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types to exclude. Use wildcard characters (\*) to exclude a single instance type or an entire instance family. Examples:</p>
         * <ul>
         * <li><p>ecs.c6.large: Excludes the ecs.c6.large instance type.</p>
         * </li>
         * <li><p>ecs.c6.\*: Excludes all instance types in the c6 family.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>GPU types.</p>
         */
        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        /**
         * <p>Instance categories. Valid values:</p>
         * <blockquote>
         * <p>N indicates multiple instance categories can be specified. N ranges from 1 to 10.</p>
         * </blockquote>
         * <ul>
         * <li><p>General-purpose: General-purpose.</p>
         * </li>
         * <li><p>Compute-optimized: Compute-optimized.</p>
         * </li>
         * <li><p>Memory-optimized: Memory-optimized.</p>
         * </li>
         * <li><p>Big data: Big data.</p>
         * </li>
         * <li><p>Local SSDs: Local SSD.</p>
         * </li>
         * <li><p>High Clock Speed: High frequency.</p>
         * </li>
         * <li><p>Enhanced: Enhanced.</p>
         * </li>
         * <li><p>Shared: Shared-resource.</p>
         * </li>
         * <li><p>Compute-optimized with GPU: GPU.</p>
         * </li>
         * <li><p>Visual Compute-optimized: Visual compute.</p>
         * </li>
         * <li><p>Heterogeneous Service: Heterogeneous computing.</p>
         * </li>
         * <li><p>Compute-optimized with FPGA: FPGA.</p>
         * </li>
         * <li><p>Compute-optimized with NPU: NPU.</p>
         * </li>
         * <li><p>ECS Bare Metal: ECS Bare Metal Instance.</p>
         * </li>
         * <li><p>High Performance Compute: High-performance computing (HPC).</p>
         * </li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The instance family level.</p>
         * <ul>
         * <li><p>EntryLevel: Entry-level, i.e., shared-resource instances. Lower cost but cannot guarantee stable compute performance. Suitable for workloads with low average CPU usage. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared-resource instances</a>.</p>
         * </li>
         * <li><p>EnterpriseLevel: Enterprise-level. Stable performance with dedicated resources. Suitable for workloads requiring high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </li>
         * <li><p>CreditEntryLevel: Credit entry-level, i.e., burstable instances. Uses CPU credits to ensure compute performance. Suitable for workloads with low average CPU usage and occasional bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families to query. N indicates multiple instance families can be specified. N ranges from 1 to 10.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        /**
         * <p>The maximum hourly price acceptable for pay-as-you-go or spot instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The maximum number of vCPU cores for the instance type.</p>
         * <blockquote>
         * <p>MaximumCpuCoreCount cannot exceed four times MinimumCpuCoreCount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        /**
         * <p>The maximum number of GPUs. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumGpuAmount")
        public Integer maximumGpuAmount;

        /**
         * <p>The maximum memory size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumMemorySize")
        public Float maximumMemorySize;

        /**
         * <p>The memory size for the instance type. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The minimum baseline vCPU compute performance (sum of all vCPUs) for burstable instances t5 and t6.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        /**
         * <p>The minimum number of vCPU cores for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        /**
         * <p>The minimum number of IPv6 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum number of IPv4 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum number of elastic network interfaces (ENIs) that the instance type supports attaching.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        /**
         * <p>The minimum number of GPUs. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        /**
         * <p>The minimum initial vCPU credit for burstable instances t5 and t6.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumInitialCredit")
        public Integer minimumInitialCredit;

        /**
         * <p>The minimum memory size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MinimumMemorySize")
        public Float minimumMemorySize;

        /**
         * <p>The processor models of the instance. N indicates multiple processor models can be specified. N ranges from 1 to 10.</p>
         */
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

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions extends TeaModel {
        /**
         * <p>When supplementing switches in other zones, specify the CIDR blocks for eligible switches.</p>
         */
        @NameInMap("AllowCidrBlocks")
        public java.util.List<String> allowCidrBlocks;

        /**
         * <p>Indicates whether ESS can add vSwitches from other zones.</p>
         * <blockquote>
         * <p>The instance type remains unchanged. Only alternative zones are considered. If all selected zones in the scaling group cannot scale out due to inventory shortages or similar issues, ESS automatically adds a vSwitch from a new zone to the scaling group based on this setting.
         * For example, if the scaling group is configured with zones cn-hangzhou-h and cn-hangzhou-g, and neither zone can scale out, ESS might create a vSwitch in zone cn-hangzhou-k based on real-time inventory availability and add it to the scaling group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCrossAz")
        public Boolean allowCrossAz;

        /**
         * <p>Whether to allow supplementing instance types from different generations.</p>
         * <ul>
         * <li>For example, if the current type is ecs.c7.large, enabling this allows alternatives like ecs.c6.large and ecs.c8.large.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowDifferentGeneration")
        public Boolean allowDifferentGeneration;

        /**
         * <p>Whether to enable alternative mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The price cap for alternative instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions setAllowCidrBlocks(java.util.List<String> allowCidrBlocks) {
            this.allowCidrBlocks = allowCidrBlocks;
            return this;
        }
        public java.util.List<String> getAllowCidrBlocks() {
            return this.allowCidrBlocks;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions setAllowCrossAz(Boolean allowCrossAz) {
            this.allowCrossAz = allowCrossAz;
            return this;
        }
        public Boolean getAllowCrossAz() {
            return this.allowCrossAz;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions setAllowDifferentGeneration(Boolean allowDifferentGeneration) {
            this.allowDifferentGeneration = allowDifferentGeneration;
            return this;
        }
        public Boolean getAllowDifferentGeneration() {
            return this.allowDifferentGeneration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces extends TeaModel {
        /**
         * <p>The elastic network interface type. Valid values:</p>
         * <ul>
         * <li><p>Primary: Primary network interface.</p>
         * </li>
         * <li><p>Secondary: Secondary elastic network interface.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The number of randomly generated IPv6 addresses assigned to the primary network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication mode of the elastic network interface. Valid values:</p>
         * <ul>
         * <li><p>Standard: Uses TCP communication mode.</p>
         * </li>
         * <li><p>HighPerformance: Enables ERI (Elastic RDMA Interface) and uses RDMA communication mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of secondary private IPv4 addresses assigned to the network interface. Valid values: 1–49.</p>
         * <ul>
         * <li><p>The value cannot exceed the IP address limit for the instance type. For more information, see <a href="https://help.aliyun.com/zh/ecs/user-guide/overview-of-instance-families">Instance families</a>.</p>
         * </li>
         * <li><p>NetworkInterface.N.SecondaryPrivateIpAddressCount assigns secondary private IPv4 addresses (excluding the primary private IP) to the network interface. The system randomly assigns addresses from the available CIDR block of the virtual switch (NetworkInterface.N.VSwitchId).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The IDs of one or more security groups to which the elastic network interface belongs.</p>
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags extends TeaModel {
        /**
         * <p>The tag key of the private pool.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the private pool.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions extends TeaModel {
        /**
         * <p>The private pool ID. This is either the elastic provisioning service ID or the capacity reservation service ID.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Filters available Target private pools by tag.</p>
         */
        @NameInMap("PrivatePoolTags")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags> privatePoolTags;

        /**
         * <p>Resource pools include private pools generated after elastic provisioning or capacity reservation services take effect, along with public pools, for instance startup selection. Valid values:</p>
         * <ul>
         * <li><p>PrivatePoolFirst: Private pool first. With this strategy, if ResourcePoolOptions.PrivatePoolIds is specified or PrivatePoolTags conditions are met, the corresponding private pool is prioritized. If no private pool is specified or the specified private pool lacks capacity, open-type private pools are automatically matched. If no matching private pool exists, public pool resources are used.</p>
         * </li>
         * <li><p>PrivatePoolOnly: Private pool only. With this strategy, ResourcePoolOptions.PrivatePoolIds must be specified. If the specified private pool lacks capacity, the instance fails to start.</p>
         * </li>
         * <li><p>PublicPoolFirst: Public pool first. Public pool resources are prioritized for instance creation. If public pool resources are insufficient, private pool resources supplement them. Open-type private pools are automatically matched first. If no matching private pool exists, specified ResourcePoolOptions.PrivatePoolIds or Target-type private pools meeting PrivatePoolTags conditions are used.</p>
         * </li>
         * <li><p>None: Do not use resource pool strategy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions setPrivatePoolTags(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags> privatePoolTags) {
            this.privatePoolTags = privatePoolTags;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags> getPrivatePoolTags() {
            return this.privatePoolTags;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not yet available for general use.</p>
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

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions extends TeaModel {
        /**
         * <p>The confidential computing mode. Valid values:</p>
         * <ul>
         * <li><p>Enclave: The ECS instance uses Enclave to build a confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Use Enclave to build a confidential computing environment</a>.</p>
         * </li>
         * <li><p>TDX: Builds a TDX confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TDX</p>
         */
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits extends TeaModel {
        /**
         * <p>The instance type of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The bid price for the spot instance.</p>
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
         * <p>The tag key of the instance. N ranges from 1 to 20.</p>
         * <p>If you specify this value, it cannot be an empty string. It can contain up to 128 characters, must not start with <code>aliyun</code> or <code>acs:</code>, and must not contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>binary</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. N ranges from 1 to 20.</p>
         * <p>If you specify this value, it can be an empty string. It can contain up to 128 characters, must not start with <code>acs:</code>, and must not contain <code>http://</code> or <code>https://</code>.</p>
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
         * <p>Whether the Dedicated Host instance is associated with a dedicated host. Valid values:</p>
         * <ul>
         * <li><p>default: The instance is not associated with a dedicated host. If economical mode is enabled, when the instance restarts after being stopped and the original dedicated host lacks sufficient resources, the instance is placed on another dedicated host in the automatic deployment resource pool.</p>
         * </li>
         * <li><p>host: The instance is associated with a dedicated host. If economical mode is enabled, when the instance restarts after being stopped, it remains on the original dedicated host. If the original dedicated host lacks sufficient resources, the instance fails to restart.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Affinity")
        public String affinity;

        /**
         * <p>The number of vCPUs.</p>
         * <p>Specifying both CPU and Memory defines a range of instance types. For example, CPU=2 and Memory=16 defines all instance types with 2 vCPUs and 16 GiB memory. Auto Scaling determines available instance types based on I/O optimization, zone, and other factors, then creates the lowest-priced instance according to price sorting.</p>
         * <blockquote>
         * <p>This range-based configuration takes effect only in cost optimization mode when no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>CPU options.</p>
         */
        @NameInMap("CpuOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions cpuOptions;

        /**
         * <p>The creation time of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The operating mode for burstable instances. Valid values:</p>
         * <ul>
         * <li><p>Standard: Standard mode. For performance details, see the Performance-constrained mode section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a></p>
         * </li>
         * <li><p>Unlimited: Unlimited mode. For performance details, see the Unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The custom priority for ECS instance type plus vSwitch combinations.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when the scaling group\&quot;s scaling policy is set to priority-based.</p>
         * </blockquote>
         * <p>If Auto Scaling cannot create an instance using a higher-priority instance type plus vSwitch combination, it automatically tries the next priority combination.</p>
         * <blockquote>
         * <p>If you specify custom priorities for only some instance type plus vSwitch combinations, unspecified combinations have lower priority. Among unspecified combinations, priority follows the scaling group\&quot;s vSwitch order and the scaling configuration\&quot;s instance type order.</p>
         * <ul>
         * <li>Example: Scaling group vSwitch order is vsw1, vsw2. Scaling configuration instance type order is type1, type2. Custom priority order is [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;]. Final priority order is: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("CustomPriorities")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities> customPriorities;

        /**
         * <p>The collection of data disk information.</p>
         */
        @NameInMap("DataDisks")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsDataDisks> dataDisks;

        /**
         * <p>The dedicated host cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-zm04u8r3lohsq****</p>
         */
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        /**
         * <p>Whether to create the ECS instance on a Dedicated Host. Since Dedicated Hosts do not support spot instances, specifying DedicatedHostId automatically ignores SpotStrategy and SpotPriceLimit settings in the request.</p>
         * <p>You can call the DescribeDedicatedHosts API to query the list of Dedicated Host IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The instance release protection attribute, specifying whether the instance can be directly released through the ECS console or API (DeleteInstance). Valid values:</p>
         * <ul>
         * <li><p>true: Enable instance release protection. The instance cannot be directly released through the ECS console or API (DeleteInstance).</p>
         * </li>
         * <li><p>false: Disable instance release protection. The instance can be directly released through the ECS console or API (DeleteInstance).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This attribute applies only to pay-as-you-go instances to prevent accidental deletion of instances scaled out by Auto Scaling. It does not affect normal scale-in activities. Instances with release protection enabled can still be released during scale-in activities.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The ID of the deployment set to which the ECS instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4p****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The hostname of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>LocalHost</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the HPC cluster to which the ECS instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-clus****</p>
         */
        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        /**
         * <p>Whether to enable the instance metadata access channel. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("HttpEndpoint")
        public String httpEndpoint;

        /**
         * <p>Whether to enforce hardened mode (IMDSv2) when accessing instance metadata. Valid values:</p>
         * <ul>
         * <li><p>optional: Do not enforce.</p>
         * </li>
         * <li><p>required: Enforce. When set, standard mode cannot access instance metadata.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("HttpTokens")
        public String httpTokens;

        /**
         * <p>The image family name. Setting this parameter retrieves the latest available image within the specified image family for instance creation. If ImageId is already set, do not set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The image file ID used as the image resource for automatic instance creation.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image file name.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Whether the ECS instance uses the ecs-user account to log on. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
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
         * <li><p>system: Public images provided by Alibaba Cloud.</p>
         * </li>
         * <li><p>self: Custom images you created.</p>
         * </li>
         * <li><p>others: Shared or community images provided by other Alibaba Cloud users.</p>
         * </li>
         * <li><p>marketplace: Images provided by Alibaba Cloud Marketplace.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The description of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The series of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-3</p>
         */
        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        /**
         * <p>The name of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The collection of intelligent configuration information used to filter eligible instance type ranges.</p>
         */
        @NameInMap("InstancePatternInfos")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstancePatternInfos> instancePatternInfos;

        /**
         * <p>The instance type of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>When alternative mode is enabled, if issues like inventory shortages occur, similar instance types of the same size are supplemented based on the currently selected instance type, or switches in alternative zones are created and added to the scaling group.</p>
         */
        @NameInMap("InstanceTypeCandidateOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions instanceTypeCandidateOptions;

        /**
         * <p>The collection of ECS instance types.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The network billing type. Valid values:</p>
         * <ul>
         * <li><p>PayByBandwidth: Pay-by-bandwidth. InternetMaxBandwidthOut is the fixed bandwidth value.</p>
         * </li>
         * <li><p>PayByTraffic: Pay-by-data-transfer. InternetMaxBandwidthOut is only a bandwidth cap. Billing is based on actual network traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Whether the instance is I/O optimized. Valid values:</p>
         * <ul>
         * <li><p>none: Not I/O optimized.</p>
         * </li>
         * <li><p>optimized: I/O optimized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The number of randomly generated IPv6 addresses assigned to the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The name of the key pair used to log on to the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>keypair****</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The status of the scaling configuration within the scaling group. Valid values:</p>
         * <ul>
         * <li><p>Active: The scaling configuration is active. The scaling group uses active scaling configurations to automatically create ECS instances.</p>
         * </li>
         * <li><p>Inactive: The scaling configuration is inactive. Inactive scaling configurations exist in the scaling group but are not used to automatically create ECS instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of the ECS instance as a backend server. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>Memory size. Unit: GiB.</p>
         * <p>Specifying both CPU and Memory defines a range of instance types. For example, CPU=2 and Memory=16 defines all instance types with 2 vCPUs and 16 GiB memory. Auto Scaling determines available instance types based on I/O optimization, zone, and other factors, then creates the lowest-priced instance according to price sorting.</p>
         * <blockquote>
         * <p>This range-based configuration takes effect only in cost optimization mode when no instance type is specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The list of elastic network interfaces.</p>
         */
        @NameInMap("NetworkInterfaces")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces> networkInterfaces;

        /**
         * <p>Whether to use the password preset in the image.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>Whether to set an instance password. Valid values:</p>
         * <ul>
         * <li><p>true: Set instance password.</p>
         * </li>
         * <li><p>false: Do not set instance password.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordSetted")
        public Boolean passwordSetted;

        /**
         * <p>The private pool ID. This is either the elastic provisioning service ID or the capacity reservation service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("PrivatePoolOptions.Id")
        public String privatePoolOptions_id;

        /**
         * <p>The private pool capacity option for instance startup. After elastic provisioning or capacity reservation services take effect, they generate private pool capacity for instance startup selection. Valid values:</p>
         * <ul>
         * <li><p>Open: Open mode. Automatically matches open-type private pool capacity. If no matching private pool capacity exists, uses public pool resources to start the instance.</p>
         * </li>
         * <li><p>Target: Target mode. Starts the instance using the specified private pool capacity. If that capacity is unavailable, the instance fails to start.</p>
         * </li>
         * <li><p>None: Do not use mode. Instance startup does not use private pool capacity.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("PrivatePoolOptions.MatchCriteria")
        public String privatePoolOptions_matchCriteria;

        /**
         * <p>The RAM role name of the ECS instance. RAM role names are provided and maintained by RAM. You can call ListRoles to query available RAM roles.</p>
         * 
         * <strong>example:</strong>
         * <p>ramrole****</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the resource group to which the ECS instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzn2ou7xo****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource pool strategy used when creating instances.</p>
         * <ul>
         * <li>This parameter takes effect only when creating pay-as-you-go instances.</li>
         * </ul>
         */
        @NameInMap("ResourcePoolOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions resourcePoolOptions;

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
         * <p>This parameter is in invitational preview and is not yet available for general use.</p>
         * </blockquote>
         */
        @NameInMap("SchedulerOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions schedulerOptions;

        /**
         * <p>Whether to enable security hardening. Valid values:</p>
         * <ul>
         * <li><p>Active: Enable security hardening. Applies only to public images.</p>
         * </li>
         * <li><p>Deactive: Disable security hardening. Applies to all image types.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of the security group to which the ECS instance belongs. ECS instances in the same security group can access each other.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp18kz60mefs****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of multiple security groups to which the ECS instance belongs. ECS instances in the same security group can access each other.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Security options.</p>
         */
        @NameInMap("SecurityOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions securityOptions;

        /**
         * <p>The reserved duration for the spot instance. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption mode for spot instances.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The collection of spot instance information.</p>
         */
        @NameInMap("SpotPriceLimits")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> spotPriceLimits;

        /**
         * <p>The preemption policy for pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: standard pay-as-you-go instance.</p>
         * </li>
         * <li><p>SpotWithPriceLimit: spot instance with a maximum price limit.</p>
         * </li>
         * <li><p>SpotAsPriceGo: system automatically bids based on current market price.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The storage set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-bp67acfmxazb4p****</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The maximum number of partitions in the storage set. Value must be an integer greater than or equal to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        public String systemDiskAutoSnapshotPolicyId;

        /**
         * <p>Whether Burst (performance burst) is enabled for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when SystemDisk.Category is cloud_auto.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemDiskBurstingEnabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>Multiple disk categories for the system disk. The first disk category has the highest priority, followed by others in descending order. If Auto Scaling cannot use a higher-priority disk category, it automatically tries the next priority category to create the system disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * </ul>
         */
        @NameInMap("SystemDiskCategories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The disk category of the system disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>ephemeral_ssd: local SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud_auto: ESSD AutoPL.</p>
         * </li>
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
         * <p>The encryption algorithm used for the system disk. Valid values:</p>
         * <ul>
         * <li><p>AES-256.</p>
         * </li>
         * <li><p>SM4-128.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES-256</p>
         */
        @NameInMap("SystemDiskEncryptAlgorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Whether the system disk is encrypted. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypted.</p>
         * </li>
         * <li><p>false: Not encrypted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemDiskEncrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The KMS key ID used for the system disk.</p>
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
         * <p>The performance level of the ESSD system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metric for the system disk.</p>
         * <blockquote>
         * <p>IOPS (Input/Output Operations Per Second) measures the number of I/O operations per second, indicating block storage read/write capability. Unit: operations.</p>
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
         * <p>The collection of tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsTags> tags;

        /**
         * <p>Whether to create the instance on a Dedicated Host. Valid values:</p>
         * <ul>
         * <li><p>default: Create a non-Dedicated Host instance.</p>
         * </li>
         * <li><p>host: Create a Dedicated Host instance. If you do not specify DedicatedHostId, Alibaba Cloud automatically selects a Dedicated Host to place the instance.</p>
         * </li>
         * </ul>
         * <p>Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Tenancy")
        public String tenancy;

        /**
         * <p>The custom data for the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>echo hello ecs!</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The weights corresponding to specified instance types, representing the capacity size of a single instance in the scaling group. Higher weights require fewer instances of that type to meet the desired capacity.</p>
         */
        @NameInMap("WeightedCapacities")
        public java.util.List<Integer> weightedCapacities;

        /**
         * <p>The zone ID of the instance. You can call DescribeZones to get the zone list.</p>
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setCpuOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions getCpuOptions() {
            return this.cpuOptions;
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setHttpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public String getHttpTokens() {
            return this.httpTokens;
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setInstanceTypeCandidateOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions instanceTypeCandidateOptions) {
            this.instanceTypeCandidateOptions = instanceTypeCandidateOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions getInstanceTypeCandidateOptions() {
            return this.instanceTypeCandidateOptions;
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setResourcePoolOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions resourcePoolOptions) {
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecurityOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions securityOptions) {
            this.securityOptions = securityOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions getSecurityOptions() {
            return this.securityOptions;
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
