// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class InstanceType extends TeaModel {
    /**
     * <p>cpu架构。</p>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    /**
     * <p>vCPU内核数目。</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CpuCore")
    public Integer cpuCore;

    /**
     * <p>实例规格分类。取值范围：</p>
     * <ul>
     * <li>General-purpose： 通用型。</li>
     * <li>Compute-optimized：计算型。</li>
     * <li>Memory-optimized：内存型。</li>
     * <li>Big data：大数据型。</li>
     * <li>Local SSDs ：本地SSD型。</li>
     * <li>High Clock Speed ：高主频型。</li>
     * <li>Enhanced ：增强型。</li>
     * <li>Shared：共享型。</li>
     * <li>Compute-optimized with GPU ：GPU计算型。</li>
     * <li>Visual Compute-optimized ：视觉计算型。</li>
     * <li>Heterogeneous Service ：异构服务型。</li>
     * <li>Compute-optimized with FPGA ：FPGA计算型。</li>
     * <li>Compute-optimized with NPU ：NPU计算型。</li>
     * <li>ECS Bare Metal ：弹性裸金属服务器。</li>
     * <li>Super Computing Cluster：超级计算集群。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Compute-optimized</p>
     */
    @NameInMap("InstanceCategory")
    public String instanceCategory;

    /**
     * <p>实例规格。</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>实例规格所属的实例规格族。取值请参见DescribeInstanceTypeFamilies。</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>实例挂载的本地盘的数量。</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("LocalStorageAmount")
    public Integer localStorageAmount;

    /**
     * <p>实例挂载的本地盘的单盘容量。单位：GiB</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("LocalStorageCapacity")
    public Long localStorageCapacity;

    /**
     * <p>是否IO优化类型。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Optimized")
    public Boolean optimized;

    public static InstanceType build(java.util.Map<String, ?> map) throws Exception {
        InstanceType self = new InstanceType();
        return TeaModel.build(map, self);
    }

    public InstanceType setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    public InstanceType setCpuCore(Integer cpuCore) {
        this.cpuCore = cpuCore;
        return this;
    }
    public Integer getCpuCore() {
        return this.cpuCore;
    }

    public InstanceType setInstanceCategory(String instanceCategory) {
        this.instanceCategory = instanceCategory;
        return this;
    }
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    public InstanceType setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public InstanceType setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public InstanceType setLocalStorageAmount(Integer localStorageAmount) {
        this.localStorageAmount = localStorageAmount;
        return this;
    }
    public Integer getLocalStorageAmount() {
        return this.localStorageAmount;
    }

    public InstanceType setLocalStorageCapacity(Long localStorageCapacity) {
        this.localStorageCapacity = localStorageCapacity;
        return this;
    }
    public Long getLocalStorageCapacity() {
        return this.localStorageCapacity;
    }

    public InstanceType setOptimized(Boolean optimized) {
        this.optimized = optimized;
        return this;
    }
    public Boolean getOptimized() {
        return this.optimized;
    }

}
