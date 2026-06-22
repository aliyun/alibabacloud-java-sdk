// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class InstanceType extends TeaModel {
    /**
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li><p><code>X86</code>: X86 architecture.</p>
     * </li>
     * <li><p><code>ARM</code>: ARM architecture.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    /**
     * <p>The number of vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CpuCore")
    public Integer cpuCore;

    /**
     * <p>The instance category. Valid values:</p>
     * <ul>
     * <li><p><code>General-purpose</code>: A general-purpose instance type.</p>
     * </li>
     * <li><p><code>Compute-optimized</code>: A compute-optimized instance type.</p>
     * </li>
     * <li><p><code>Memory-optimized</code>: A memory-optimized instance type.</p>
     * </li>
     * <li><p><code>Big data</code>: A big data instance type.</p>
     * </li>
     * <li><p><code>Local SSDs</code>: A local SSD instance type.</p>
     * </li>
     * <li><p><code>High Clock Speed</code>: A high clock speed instance type.</p>
     * </li>
     * <li><p><code>Enhanced</code>: An enhanced instance type.</p>
     * </li>
     * <li><p><code>Shared</code>: A shared instance type.</p>
     * </li>
     * <li><p><code>Compute-optimized with GPU</code>: A compute-optimized instance type with GPUs.</p>
     * </li>
     * <li><p><code>Visual Compute-optimized</code>: A visual compute-optimized instance type.</p>
     * </li>
     * <li><p><code>Heterogeneous Service</code>: A heterogeneous service instance type.</p>
     * </li>
     * <li><p><code>Compute-optimized with FPGA</code>: A compute-optimized instance type with FPGAs.</p>
     * </li>
     * <li><p><code>Compute-optimized with NPU</code>: A compute-optimized instance type with NPUs.</p>
     * </li>
     * <li><p><code>ECS Bare Metal</code>: An ECS Bare Metal instance.</p>
     * </li>
     * <li><p><code>Super Computing Cluster</code>: A supercomputing cluster instance type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Compute-optimized</p>
     */
    @NameInMap("InstanceCategory")
    public String instanceCategory;

    /**
     * <p>The ECS instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance type families</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance type family. For valid values, see the ECS documentation for <a href="https://help.aliyun.com/document_detail/25621.html">DescribeInstanceTypeFamilies</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The number of local disks attached to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("LocalStorageAmount")
    public Integer localStorageAmount;

    /**
     * <p>The capacity of each local disk attached to the instance, in GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("LocalStorageCapacity")
    public Long localStorageCapacity;

    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>Specifies whether the instance type is I/O optimized. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The instance type is I/O optimized.</p>
     * </li>
     * <li><p><code>false</code>: The instance type is not I/O optimized.</p>
     * </li>
     * </ul>
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

    public InstanceType setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public InstanceType setOptimized(Boolean optimized) {
        this.optimized = optimized;
        return this;
    }
    public Boolean getOptimized() {
        return this.optimized;
    }

}
