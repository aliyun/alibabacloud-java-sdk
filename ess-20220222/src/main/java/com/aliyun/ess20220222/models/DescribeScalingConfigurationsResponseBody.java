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

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable hardware-based nested virtualization. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
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
         * <p>The ID of the vSwitch.</p>
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
         * <p>The ID of the automatic snapshot policy applied to the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp19nq9enxqkomib****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.<blockquote>
         * <p>This parameter is displayed only when the DataDisk.Category parameter is set to cloud_auto.
         * &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The disk types of the data cloud disks. The first disk type has the highest priority, and the priorities of other disk types decrease in sequence. If a disk type with a higher priority is unavailable, Auto Scaling automatically attempts to create the data cloud disk by using the disk type with the next highest priority. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk. The DeleteWithInstance property of a basic cloud disk created along with an instance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The category of the data cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk. The DeleteWithInstance attribute of a basic cloud disk created along with an instance is set to true.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data cloud disk when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: releases the data cloud disk when the instance is released.</li>
         * <li>false: retains the data cloud disk when the instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the data cloud disk.</li>
         * <li>false: does not encrypt the data cloud disk.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key used to encrypt the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the data cloud disk when it is an ESSD (standard SSD).</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics of the data cloud disk.</p>
         * <blockquote>
         * <p>IOPS measures the number of I/O operations per second and indicates the read and write capabilities of the block storage. Unit: operations per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the data cloud disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud: 5 to 2000.</li>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: 20 to 32768.</li>
         * <li>ephemeral_ssd: 5 to 800.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create the data cloud disk.</p>
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
         * <li>X86: x86 computing.</li>
         * <li>Heterogeneous: heterogeneous computing, such as GPU or FPGA.</li>
         * <li>BareMental: ECS Bare Metal server.</li>
         * <li>Arm: Arm computing.</li>
         * </ul>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether the instance type is a burstable instance type. Valid values:</p>
         * <ul>
         * <li>Exclude: excludes burstable instance types.</li>
         * <li>Include: includes burstable instance types.</li>
         * <li>Required: includes only burstable instance types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPU cores of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU architecture of the instance type. Valid values:</p>
         * <blockquote>
         * <p>N indicates that you can specify multiple CPU architectures. Valid values of N: 1 to 2.</p>
         * </blockquote>
         * <ul>
         * <li>X86.</li>
         * <li>ARM.</li>
         * </ul>
         */
        @NameInMap("CpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The instance types to be excluded. You can use a wildcard (*) to exclude a single instance type or an entire instance family. Examples:</p>
         * <ul>
         * <li>ecs.c6.large: excludes the ecs.c6.large instance type.</li>
         * <li>ecs.c6.*: excludes all instance types in the c6 instance family.</li>
         * </ul>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The GPU type.</p>
         */
        @NameInMap("GpuSpecs")
        public java.util.List<String> gpuSpecs;

        /**
         * <p>The instance categorization. Valid values:</p>
         * <blockquote>
         * <p>N indicates that you can specify multiple instance categories in the Settings. Valid values of N: 1 to 10.</p>
         * </blockquote>
         * <ul>
         * <li>General-purpose: general-purpose.</li>
         * <li>Compute-optimized: compute-optimized.</li>
         * <li>Memory-optimized: memory-optimized.</li>
         * <li>Big data: big data.</li>
         * <li>Local SSDs: local SSD.</li>
         * <li>High Clock Speed: high frequency.</li>
         * <li>Enhanced: enhanced.</li>
         * <li>Shared: shared.</li>
         * <li>Compute-optimized with GPU: GPU computing.</li>
         * <li>Visual Compute-optimized: visual compute-optimized.</li>
         * <li>Heterogeneous Service: heterogeneous service.</li>
         * <li>Compute-optimized with FPGA: FPGA-accelerated compute-optimized.</li>
         * <li>Compute-optimized with NPU: NPU-accelerated compute-optimized.</li>
         * <li>ECS Bare Metal: ECS Bare Metal server.</li>
         * <li>High Performance Compute: high-performance computing (HPC).</li>
         * </ul>
         */
        @NameInMap("InstanceCategories")
        public java.util.List<String> instanceCategories;

        /**
         * <p>The level of the instance family. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry-level instance families, which are shared instance families. These instance families are more cost-effective but do not guarantee consistent computing performance. They are suitable for workloads with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise-level instance families. These instance families provide stable performance and dedicated resources, and are suitable for workloads that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry-level instance families, which are burstable instances. These instance families use CPU credits to maintain computing performance and are suitable for workloads with low CPU utilization but occasional CPU bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance families to be queried. N indicates that you can specify multiple instance families. Valid values of N: 1 to 10.</p>
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
         * <p>The maximum number of vCPU cores of the instance type.</p>
         * <blockquote>
         * <p>The value of MaximumCpuCoreCount cannot exceed four times the value of MinimumCpuCoreCount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaximumCpuCoreCount")
        public Integer maximumCpuCoreCount;

        /**
         * <p>The maximum number of GPUs for the instance. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaximumGpuAmount")
        public Integer maximumGpuAmount;

        /**
         * <p>The maximum memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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

        /**
         * <p>The minimum baseline vCPU computing performance (the sum of all vCPUs) for t5 and t6 burstable instances.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumBaselineCredit")
        public Integer minimumBaselineCredit;

        /**
         * <p>The minimum number of vCPU cores of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumCpuCoreCount")
        public Integer minimumCpuCoreCount;

        /**
         * <p>The minimum value for the maximum number of IPv6 addresses supported by a single elastic network interfaces (ENIs) on the instance. Each ENI is a network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinimumEniIpv6AddressQuantity")
        public Integer minimumEniIpv6AddressQuantity;

        /**
         * <p>The minimum value for the maximum number of IPv4 addresses supported by a single elastic network interfaces (ENIs) on the instance. Each ENI is a network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniPrivateIpAddressQuantity")
        public Integer minimumEniPrivateIpAddressQuantity;

        /**
         * <p>The minimum value for the maximum number of elastic network interfaces (ENIs) that can be attached to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumEniQuantity")
        public Integer minimumEniQuantity;

        /**
         * <p>The minimum number of GPUs for the instance. Valid values: positive integers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinimumGpuAmount")
        public Integer minimumGpuAmount;

        /**
         * <p>The minimum initial vCPU credit value for t5 and t6 burstable instances.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinimumInitialCredit")
        public Integer minimumInitialCredit;

        /**
         * <p>The minimum memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MinimumMemorySize")
        public Float minimumMemorySize;

        /**
         * <p>The processor model of the instance. N indicates that you can specify multiple processor models. Valid values of N: 1 to 10.</p>
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
         * <p>The CIDR blocks of the vSwitches that can be selected when adding vSwitches from other zones is allowed.</p>
         */
        @NameInMap("AllowCidrBlocks")
        public java.util.List<String> allowCidrBlocks;

        /**
         * <p>Specifies whether to allow adding vSwitches from other zones.</p>
         * <blockquote>
         * <p>The instance types remain unchanged, and only new zones are selected as alternatives. When the scaling group fails to scale out in all selected zones due to inventory shortages or other issues, this configuration automatically adds vSwitches from new zones to the scaling group.
         * For example, if the scaling group is configured with the cn-hangzhou-h and cn-hangzhou-g zones and fails to scale out in both zones, Auto Scaling may create a vSwitch in the cn-hangzhou-k zone and add it to the scaling group based on real-time inventory.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCrossAz")
        public Boolean allowCrossAz;

        /**
         * <p>Specifies whether to allow supplementing instance types from other generations.</p>
         * <ul>
         * <li>For example, if the current instance type is ecs.c7.large, enabling this option allows fallback to instance types such as ecs.c6.large and ecs.c8.large.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowDifferentGeneration")
        public Boolean allowDifferentGeneration;

        /**
         * <p>Specifies whether to enable the fallback mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum price for fallback instance types.</p>
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
         * <p>The type of the elastic network interfaces (ENIs). Valid values:</p>
         * <ul>
         * <li><p>Primary: primary network interface controller (NIC).</p>
         * </li>
         * <li><p>Secondary: secondary elastic network interfaces (ENIs).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The number of randomly generated IPv6 addresses specified for the primary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        /**
         * <p>The communication pattern of the elastic network interfaces (ENIs), which act as a network interface controller (NIC). Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication pattern.</li>
         * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication pattern.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of secondary private IPv4 addresses specified for the ENI. Valid values: 1 to 49.</p>
         * <ul>
         * <li>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/overview-of-instance-families">Instance families</a>.</li>
         * <li>NetworkInterface.N.SecondaryPrivateIpAddressCount is used to specify the number of secondary private IPv4 addresses (excluding the primary private IP address of the ENI) to be assigned to the ENI. The system randomly assigns the addresses from the available CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) to which the ENI belongs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The IDs of one or more security groups to which the elastic network interfaces (ENIs) belong. Each ENI is a network interface controller (NIC).</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the vSwitch to which the elastic network interfaces (ENIs) belong. Each ENI is a network interface controller (NIC).</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
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
         * <p>The ID of the private pool, which is the ID of the elasticity assurance or capacity reservation.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Filters available Target private pools by tag.</p>
         */
        @NameInMap("PrivatePoolTags")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsResourcePoolOptionsPrivatePoolTags> privatePoolTags;

        /**
         * <p>Resource pools include private pools generated after the elasticity assurance or capacity reservation service takes effect, as well as public pools, which are available for selection when an instance starts. Valid values:</p>
         * <ul>
         * <li>PrivatePoolFirst: private pool first. When this policy is selected, if ResourcePoolOptions.PrivatePoolIds is specified or the PrivatePoolTags condition is met, the corresponding private pool is used first. If no private pool is specified or the specified private pool has insufficient capacity, the system automatically matches an open private pool. If no eligible private pool is available, the public pool is used to create the instance.</li>
         * <li>PrivatePoolOnly: private pool only. When this policy is selected, ResourcePoolOptions.PrivatePoolIds must be specified. If the specified private pool has insufficient capacity, the instance fails to start.</li>
         * <li>PublicPoolFirst: public pool first. The public pool is used first to create the instance. When public pool resources are insufficient, private pool resources are used as a supplement. The system preferentially matches an open private pool. If no eligible private pool is available, the system uses the Target private pool specified by ResourcePoolOptions.PrivatePoolIds or the one that meets the PrivatePoolTags condition.</li>
         * <li>None: no resource pool policy is used.</li>
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
         * <p>This parameter is in invitational preview and is not available for public use.</p>
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
         * <li>Enclave: The ECS instance uses Enclave to build a confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</li>
         * <li>TDX: builds a TDX confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</li>
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
         * <p>The key of tag N of the instance. Valid values of N: 1 to 20.
         * If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>binary</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the instance. Valid values of N: 1 to 20.
         * If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs:, and cannot contain http:// or https://.</p>
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
         * <p>Specifies whether the instance on a dedicated host is associated with the dedicated host. Valid values:</p>
         * <ul>
         * <li>default: The instance is not associated with the dedicated host. If the economical mode is enabled and the original dedicated host has insufficient resources when the instance is restarted, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</li>
         * <li>host: The instance is associated with the dedicated host. If the economical mode is enabled and the original dedicated host has insufficient resources when the instance is restarted, the instance fails to be restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Affinity")
        public String affinity;

        /**
         * <p>The number of vCPUs.
         * You can specify both the Cpu and Memory parameters to define the instance type range. For example, if you set Cpu to 2 and Memory to 16, all instance types that have 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zones, and creates instances of the type that has the lowest price.</p>
         * <blockquote>
         * <p>This configuration takes effect only when the scaling mode is set to cost optimization and no instance types are specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The CPU options.</p>
         */
        @NameInMap("CpuOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsCpuOptions cpuOptions;

        /**
         * <p>The time when the scaling configuration was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: standard mode. For more information, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * <li>Unlimited: unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The custom priority of ECS instance type and vSwitch combination.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when the scaling policy of the scaling group is set to priority-based policy.</notice>
         * If an instance cannot be created by using ECS instance type and vSwitch combination that has the highest priority, Auto Scaling automatically uses the combination that has the next highest priority to create ECS instance.
         * If you specify custom priorities for only some instance type and vSwitch combinations, the unspecified combinations have lower priorities than the specified ones. The priorities of the unspecified combinations are determined based on the vSwitch sequence in the scaling group and ECS instance type sequence in the scaling configuration.</p>
         * <ul>
         * <li>For example, if the vSwitch sequence in the scaling group is vsw1 and vsw2, ECS instance type sequence in the scaling configuration is type1 and type2, and the custom priority sequence is [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;], the final priority sequence is: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("CustomPriorities")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsCustomPriorities> customPriorities;

        /**
         * <p>The data cloud disks.</p>
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
         * <p>The ID of the dedicated host on which to create the ECS instance. Dedicated hosts do not support spot instances. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit parameters are ignored.
         * You can call the DescribeDedicatedHosts operation to query the list of dedicated host IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp67acfmxazb4p****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The release protection property of the instance, which specifies whether the instance can be directly released by using the ECS console or the DeleteInstance API operation. Valid values:</p>
         * <ul>
         * <li>true: Release protection is enabled. The instance cannot be directly released by using the ECS console or the DeleteInstance API operation.</li>
         * <li>false: Release protection is shutdown. The instance can be directly released by using the ECS console or the DeleteInstance API operation.<blockquote>
         * <p>This property applies only to pay-as-you-go instances. It prevents instances created by Auto Scaling during scale-out from being accidentally deleted, but does not affect normal scale-in activities. Instances with release protection enabled can still be released during scale-in activities.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The ID of the High Performance Computing (HPC) cluster to which the ECS instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-clus****</p>
         */
        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        /**
         * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
         * <ul>
         * <li>enabled: enabled.</li>
         * <li>disabled: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("HttpEndpoint")
        public String httpEndpoint;

        /**
         * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) when accessing instance metadata. Valid values:</p>
         * <ul>
         * <li>optional: not forcibly used.</li>
         * <li>required: forcibly used. If this value is set, instance metadata cannot be accessed in normal mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("HttpTokens")
        public String httpTokens;

        /**
         * <p>The name of the image family. You can set this parameter to obtain the latest available image in the image family to create instances. If the ImageId parameter is specified, you cannot specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The ID of the image file, which is the image resource used for the automatic creation of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Specifies whether to log on to the ECS instance as the ecs-user user. Valid values:</p>
         * <ul>
         * <li>true: yes.</li>
         * <li>false: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ImageOptionsLoginAsNonRoot")
        public Boolean imageOptionsLoginAsNonRoot;

        /**
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li>system: public images provided by Alibaba Cloud.</li>
         * <li>self: custom images created by you.</li>
         * <li>others: shared images or community images provided by other Alibaba Cloud users.</li>
         * <li>marketplace: images provided by Alibaba Cloud Marketplace.</li>
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
         * <p>The generation of the ECS instance.</p>
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
         * <p>The collection of intelligent configuration information used to filter instance types that meet your requirements.</p>
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
         * <p>After the fallback mode is configured, if issues such as insufficient inventory occur, the system supplements the selected instance types with similar instance types of the same size, or creates vSwitches in fallback zones and adds them to the scaling group.</p>
         */
        @NameInMap("InstanceTypeCandidateOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsInstanceTypeCandidateOptions instanceTypeCandidateOptions;

        /**
         * <p>The collection of instance types for ECS instances.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The network billing method. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth. In this case, the InternetMaxBandwidthOut parameter specifies the fixed bandwidth value.</li>
         * <li>PayByTraffic: pay-by-traffic. In this case, the InternetMaxBandwidthOut parameter specifies the bandwidth cap, and you are billed based on the actual network traffic.</li>
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
         * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
         * <ul>
         * <li>none: non-I/O optimization.</li>
         * <li>optimized: I/O optimization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The number of IPv6 addresses that are randomly generated for the elastic network interface controller (NIC).</p>
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
         * <p>The lifecycle status of the scaling configuration in the scaling group. Valid values:</p>
         * <ul>
         * <li>Active: The scaling configuration is active. The scaling group uses active scaling configurations for the automatic creation of ECS instances.</li>
         * <li>Inacitve: The scaling configuration is inactive. Inactive scaling configurations exist in the scaling group, but the scaling group does not use them for the automatic creation of ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of the ECS instance when it is used as an SLB backend server. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The memory size. Unit: GiB.
         * You can specify both the Cpu and Memory parameters to define the instance type range. For example, if you set Cpu to 2 and Memory to 16, all instance types that have 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zones, and creates instances of the type that has the lowest price.</p>
         * <blockquote>
         * <p>This configuration takes effect only when the scaling mode is set to cost optimization and no instance types are specified in the scaling configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The list of elastic network interfaces (ENIs). Each ENI is a network interface controller (NIC).</p>
         */
        @NameInMap("NetworkInterfaces")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsNetworkInterfaces> networkInterfaces;

        /**
         * <p>Specifies whether to use the password preset in the image.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>Specifies whether an instance password is set. Valid values:</p>
         * <ul>
         * <li>true: An instance password is set.</li>
         * <li>false: No instance password is set.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordSetted")
        public Boolean passwordSetted;

        /**
         * <p>The ID of the private pool. The ID is the same as the ID of the elasticity assurance or capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("PrivatePoolOptions.Id")
        public String privatePoolOptions_id;

        /**
         * <p>The private pool type for starting the instance. After an elasticity assurance or capacity reservation takes effect, a private pool is generated. You can select a private pool type when you start an instance. Valid values:</p>
         * <ul>
         * <li>Open: open mode. The system automatically matches a private pool of the Open type. If no matching private pool is available, the system uses resources from the public pool to start the instance.</li>
         * <li>Target: targeted mode. The system uses the specified private pool to start the instance. If the specified private pool is unavailable, the instance fails to be started.</li>
         * <li>None: no private pool. The system does not use private pools to start the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("PrivatePoolOptions.MatchCriteria")
        public String privatePoolOptions_matchCriteria;

        /**
         * <p>The name of the Resource Access Management (RAM) role for the ECS instance. RAM roles are provided and maintained by RAM. You can call the ListRoles operation to query available RAM roles.</p>
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
         * <p>The resource pool policy used when creating instances.</p>
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
         * <p>This parameter is in invitational preview and is not available for public use.</p>
         * </blockquote>
         */
        @NameInMap("SchedulerOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSchedulerOptions schedulerOptions;

        /**
         * <p>Specifies whether a vSwitch available for secondary elastic network interfaces (ENIs) must be selected from the list when the VSwitchIds parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>Strict</p>
         */
        @NameInMap("SecondaryEniVSwitchConstraint")
        public String secondaryEniVSwitchConstraint;

        /**
         * <p>Specifies whether to enable security hardening. Valid values:</p>
         * <ul>
         * <li>Active: enables security hardening. This value is applicable only to public images.</li>
         * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
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
         * <p>The IDs of the security groups to which the ECS instances belong. ECS instances in the same security group can access each other.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The security options.</p>
         */
        @NameInMap("SecurityOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsSecurityOptions securityOptions;

        /**
         * <p>The protection period of the spot instance. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption pattern of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        /**
         * <p>The spot instances.</p>
         */
        @NameInMap("SpotPriceLimits")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsSpotPriceLimits> spotPriceLimits;

        /**
         * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: regular pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: spot instances that have a maximum hourly price.</li>
         * <li>SpotAsPriceGo: spot instances for which the system automatically bids based on the current market price.</li>
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
         * <p>The maximum number of partitions in the storage set. The value must be an integer greater than or equal to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The ID of the automatic snapshot policy applied to the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp12m37ccmxvbmi5****</p>
         */
        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        public String systemDiskAutoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the burst feature for the system cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.<blockquote>
         * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemDiskBurstingEnabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The disk types for the system cloud disk. The first disk type has the highest priority, and the priorities of the other disk types decrease in sequence. If the disk type with a higher priority is unavailable, Auto Scaling automatically attempts to create the system cloud disk by using the disk type with the next highest priority. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD cloud disk.</li>
         * <li>cloud_essd: ESSD cloud disk.</li>
         * </ul>
         */
        @NameInMap("SystemDiskCategories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The category of the system cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>ephemeral_ssd: local SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The description of the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>Test system disk.</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>The encryption algorithm used for the system cloud disk. Valid values:</p>
         * <ul>
         * <li>AES-256.</li>
         * <li>SM4-128.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES-256</p>
         */
        @NameInMap("SystemDiskEncryptAlgorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether the system cloud disk is encrypted. Valid values:</p>
         * <ul>
         * <li>true: The system cloud disk is encrypted.</li>
         * <li>false: The system cloud disk is not encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SystemDiskEncrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the KMS key used for the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("SystemDiskKMSKeyId")
        public String systemDiskKMSKeyId;

        /**
         * <p>The name of the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd_Test</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The performance level of the system cloud disk when it is an ESSD (standard SSD).</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics for the system cloud disk.</p>
         * <blockquote>
         * <p>IOPS refers to the number of I/O operations that can be processed per second, which indicates the read and write processing capability of the block storage. Unit: operations per second.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskProvisionedIops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
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
         * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
         * <ul>
         * <li>default: creates the instance on a non-dedicated host.</li>
         * <li>host: creates the instance on a dedicated host. If you do not specify the DedicatedHostId parameter, Alibaba Cloud automatically selects a dedicated host for the instance.
         * Default value: default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Tenancy")
        public String tenancy;

        /**
         * <p>The user data of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>echo hello ecs!</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The weight of the specified instance type, which indicates the capacity that a single instance of the specified instance type provides in the scaling group. A greater weight indicates that fewer instances of the instance type are required to meet the expected capacity.</p>
         */
        @NameInMap("WeightedCapacities")
        public java.util.List<Integer> weightedCapacities;

        /**
         * <p>The zone ID of the instance. You can call the DescribeZones operation to query the zone list.</p>
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

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setSecondaryEniVSwitchConstraint(String secondaryEniVSwitchConstraint) {
            this.secondaryEniVSwitchConstraint = secondaryEniVSwitchConstraint;
            return this;
        }
        public String getSecondaryEniVSwitchConstraint() {
            return this.secondaryEniVSwitchConstraint;
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
