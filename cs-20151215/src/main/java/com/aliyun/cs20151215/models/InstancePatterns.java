// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstancePatterns extends TeaModel {
    @NameInMap("architectures")
    @Deprecated
    public java.util.List<String> architectures;

    /**
     * <strong>example:</strong>
     * <p>Exclude</p>
     */
    @NameInMap("burst_performance_option")
    @Deprecated
    public String burstPerformanceOption;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("core")
    @Deprecated
    public Long core;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("cores")
    public Long cores;

    @NameInMap("cpu_architectures")
    public java.util.List<String> cpuArchitectures;

    @NameInMap("excluded_instance_types")
    public java.util.List<String> excludedInstanceTypes;

    @NameInMap("instance_categories")
    public java.util.List<String> instanceCategories;

    /**
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("instance_family_level")
    public String instanceFamilyLevel;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("max_cpu_cores")
    public Long maxCpuCores;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("max_memory_size")
    public Float maxMemorySize;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("max_price")
    @Deprecated
    public Float maxPrice;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("memory")
    public Float memory;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("min_cpu_cores")
    public Long minCpuCores;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("min_memory_size")
    public Float minMemorySize;

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

}
