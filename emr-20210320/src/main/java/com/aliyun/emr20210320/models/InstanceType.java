// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class InstanceType extends TeaModel {
    /**
     * <p>cpu架构。</p>
     */
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    /**
     * <p>vCPU内核数目。</p>
     */
    @NameInMap("CpuCore")
    public Integer cpuCore;

    /**
     * <p>实例规格分类。取值范围：</p>
     * <p>- General-purpose： 通用型。</p>
     * <p>- Compute-optimized：计算型。</p>
     * <p>- Memory-optimized：内存型。</p>
     * <p>- Big data：大数据型。</p>
     * <p>- Local SSDs ：本地SSD型。</p>
     * <p>- High Clock Speed ：高主频型。</p>
     * <p>- Enhanced ：增强型。</p>
     * <p>- Shared：共享型。</p>
     * <p>- Compute-optimized with GPU ：GPU计算型。</p>
     * <p>- Visual Compute-optimized ：视觉计算型。</p>
     * <p>- Heterogeneous Service ：异构服务型。</p>
     * <p>- Compute-optimized with FPGA ：FPGA计算型。</p>
     * <p>- Compute-optimized with NPU ：NPU计算型。</p>
     * <p>- ECS Bare Metal ：弹性裸金属服务器。</p>
     * <p>- Super Computing Cluster：超级计算集群。</p>
     */
    @NameInMap("InstanceCategory")
    public String instanceCategory;

    /**
     * <p>实例规格。</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>实例规格所属的实例规格族。取值请参见DescribeInstanceTypeFamilies。</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>实例挂载的本地盘的数量。</p>
     */
    @NameInMap("LocalStorageAmount")
    public Integer localStorageAmount;

    /**
     * <p>实例挂载的本地盘的单盘容量。单位：GiB</p>
     */
    @NameInMap("LocalStorageCapacity")
    public Long localStorageCapacity;

    /**
     * <p>是否IO优化类型。</p>
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
