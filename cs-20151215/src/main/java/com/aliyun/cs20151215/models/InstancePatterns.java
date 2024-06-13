// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstancePatterns extends TeaModel {
    @NameInMap("architectures")
    public java.util.List<String> architectures;

    @NameInMap("burst_performance_option")
    public String burstPerformanceOption;

    @NameInMap("core")
    public Long core;

    @NameInMap("excluded_instance_types")
    public java.util.List<String> excludedInstanceTypes;

    @NameInMap("instance_family_level")
    public String instanceFamilyLevel;

    @NameInMap("max_price")
    public Float maxPrice;

    @NameInMap("memory")
    public Float memory;

    public static InstancePatterns build(java.util.Map<String, ?> map) throws Exception {
        InstancePatterns self = new InstancePatterns();
        return TeaModel.build(map, self);
    }

    public InstancePatterns setArchitectures(java.util.List<String> architectures) {
        this.architectures = architectures;
        return this;
    }
    public java.util.List<String> getArchitectures() {
        return this.architectures;
    }

    public InstancePatterns setBurstPerformanceOption(String burstPerformanceOption) {
        this.burstPerformanceOption = burstPerformanceOption;
        return this;
    }
    public String getBurstPerformanceOption() {
        return this.burstPerformanceOption;
    }

    public InstancePatterns setCore(Long core) {
        this.core = core;
        return this;
    }
    public Long getCore() {
        return this.core;
    }

    public InstancePatterns setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
        this.excludedInstanceTypes = excludedInstanceTypes;
        return this;
    }
    public java.util.List<String> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes;
    }

    public InstancePatterns setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

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

}
