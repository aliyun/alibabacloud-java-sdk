// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstancePatterns extends TeaModel {
    /**
     * <p>[This parameter is deprecated and replaced by cpu_architectures] The architectures of instance types.</p>
     */
    @NameInMap("architectures")
    @Deprecated
    public java.util.List<String> architectures;

    /**
     * <p>[This parameter is deprecated] Specifies whether to include burstable instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>Exclude</p>
     */
    @NameInMap("burst_performance_option")
    @Deprecated
    public String burstPerformanceOption;

    /**
     * <p>[This parameter is deprecated and replaced by cores] The number of vCores provided by the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("core")
    @Deprecated
    public Long core;

    /**
     * <p>The number of vCPU cores for the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("cores")
    public Long cores;

    /**
     * <p>The CPU architecture of the instance type.</p>
     */
    @NameInMap("cpu_architectures")
    public java.util.List<String> cpuArchitectures;

    /**
     * <p>The instance type that you want to exclude.</p>
     */
    @NameInMap("excluded_instance_types")
    public java.util.List<String> excludedInstanceTypes;

    /**
     * <p>The type of the instance.</p>
     */
    @NameInMap("instance_categories")
    public java.util.List<String> instanceCategories;

    /**
     * <p>The instance family level.</p>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("instance_family_level")
    public String instanceFamilyLevel;

    /**
     * <p>The specified instance family.</p>
     */
    @NameInMap("instance_type_families")
    public java.util.List<String> instanceTypeFamilies;

    /**
     * <p>The maximum vCPU cores allowed for the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("max_cpu_cores")
    public Long maxCpuCores;

    /**
     * <p>The maximum allowed memory size. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("max_memory_size")
    public Float maxMemorySize;

    /**
     * <p>[This parameter is deprecated] The maximum hourly price of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("max_price")
    @Deprecated
    public Float maxPrice;

    /**
     * <p>The maximum allowed number of GPUs per instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("maximum_gpu_amount")
    public Long maximumGpuAmount;

    /**
     * <p>The memory size of the instance type. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("memory")
    public Float memory;

    /**
     * <p>The minimum vCPU cores required for the instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("min_cpu_cores")
    public Long minCpuCores;

    /**
     * <p>The minimum required memory size. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("min_memory_size")
    public Float minMemorySize;

    /**
     * <p>The minimum required number of IPv6 addresses per ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minimum_eni_ipv6_address_quantity")
    public Long minimumEniIpv6AddressQuantity;

    /**
     * <p>The minimum required number of IPv4 addresses per ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("minimum_eni_private_ip_address_quantity")
    public Long minimumEniPrivateIpAddressQuantity;

    /**
     * <p>The minimum required number of elastic network interfaces (ENIs) per instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("minimum_eni_quantity")
    public Long minimumEniQuantity;

    public static InstancePatterns build(java.util.Map<String, ?> map) throws Exception {
        InstancePatterns self = new InstancePatterns();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public InstancePatterns setArchitectures(java.util.List<String> architectures) {
        this.architectures = architectures;
        return this;
    }
    public java.util.List<String> getArchitectures() {
        return this.architectures;
    }

    @Deprecated
    public InstancePatterns setBurstPerformanceOption(String burstPerformanceOption) {
        this.burstPerformanceOption = burstPerformanceOption;
        return this;
    }
    public String getBurstPerformanceOption() {
        return this.burstPerformanceOption;
    }

    @Deprecated
    public InstancePatterns setCore(Long core) {
        this.core = core;
        return this;
    }
    public Long getCore() {
        return this.core;
    }

    public InstancePatterns setCores(Long cores) {
        this.cores = cores;
        return this;
    }
    public Long getCores() {
        return this.cores;
    }

    public InstancePatterns setCpuArchitectures(java.util.List<String> cpuArchitectures) {
        this.cpuArchitectures = cpuArchitectures;
        return this;
    }
    public java.util.List<String> getCpuArchitectures() {
        return this.cpuArchitectures;
    }

    public InstancePatterns setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
        this.excludedInstanceTypes = excludedInstanceTypes;
        return this;
    }
    public java.util.List<String> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes;
    }

    public InstancePatterns setInstanceCategories(java.util.List<String> instanceCategories) {
        this.instanceCategories = instanceCategories;
        return this;
    }
    public java.util.List<String> getInstanceCategories() {
        return this.instanceCategories;
    }

    public InstancePatterns setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public InstancePatterns setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public java.util.List<String> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public InstancePatterns setMaxCpuCores(Long maxCpuCores) {
        this.maxCpuCores = maxCpuCores;
        return this;
    }
    public Long getMaxCpuCores() {
        return this.maxCpuCores;
    }

    public InstancePatterns setMaxMemorySize(Float maxMemorySize) {
        this.maxMemorySize = maxMemorySize;
        return this;
    }
    public Float getMaxMemorySize() {
        return this.maxMemorySize;
    }

    @Deprecated
    public InstancePatterns setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public InstancePatterns setMaximumGpuAmount(Long maximumGpuAmount) {
        this.maximumGpuAmount = maximumGpuAmount;
        return this;
    }
    public Long getMaximumGpuAmount() {
        return this.maximumGpuAmount;
    }

    public InstancePatterns setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public InstancePatterns setMinCpuCores(Long minCpuCores) {
        this.minCpuCores = minCpuCores;
        return this;
    }
    public Long getMinCpuCores() {
        return this.minCpuCores;
    }

    public InstancePatterns setMinMemorySize(Float minMemorySize) {
        this.minMemorySize = minMemorySize;
        return this;
    }
    public Float getMinMemorySize() {
        return this.minMemorySize;
    }

    public InstancePatterns setMinimumEniIpv6AddressQuantity(Long minimumEniIpv6AddressQuantity) {
        this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
        return this;
    }
    public Long getMinimumEniIpv6AddressQuantity() {
        return this.minimumEniIpv6AddressQuantity;
    }

    public InstancePatterns setMinimumEniPrivateIpAddressQuantity(Long minimumEniPrivateIpAddressQuantity) {
        this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
        return this;
    }
    public Long getMinimumEniPrivateIpAddressQuantity() {
        return this.minimumEniPrivateIpAddressQuantity;
    }

    public InstancePatterns setMinimumEniQuantity(Long minimumEniQuantity) {
        this.minimumEniQuantity = minimumEniQuantity;
        return this;
    }
    public Long getMinimumEniQuantity() {
        return this.minimumEniQuantity;
    }

}
