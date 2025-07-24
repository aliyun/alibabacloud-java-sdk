// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CostInstanceType extends TeaModel {
    /**
     * <p>CPU核数。</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>数据盘列表。</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<DataDisk> dataDisks;

    /**
     * <p>实例类型列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ecs.g6.4xlarge&quot;]</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>内存大小。</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>系统盘信息。</p>
     */
    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    public static CostInstanceType build(java.util.Map<String, ?> map) throws Exception {
        CostInstanceType self = new CostInstanceType();
        return TeaModel.build(map, self);
    }

    public CostInstanceType setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CostInstanceType setDataDisks(java.util.List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public CostInstanceType setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CostInstanceType setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CostInstanceType setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

}
