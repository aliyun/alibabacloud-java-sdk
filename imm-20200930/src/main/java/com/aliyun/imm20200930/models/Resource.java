// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CPU")
    public Long CPU;

    /**
     * <strong>example:</strong>
     * <p>ecs.gn5i-c2g1.large</p>
     */
    @NameInMap("ECSInstance")
    public String ECSInstance;

    /**
     * <strong>example:</strong>
     * <p>string	NVIDIA_P4</p>
     */
    @NameInMap("GPUModel")
    public String GPUModel;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GPUNum")
    public Long GPUNum;

    /**
     * <strong>example:</strong>
     * <p>string	ecs.gn5i-c2g1.large-2vCPU-8GB-1*NVIDIA_P4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RAM")
    public Long RAM;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setCPU(Long CPU) {
        this.CPU = CPU;
        return this;
    }
    public Long getCPU() {
        return this.CPU;
    }

    public Resource setECSInstance(String ECSInstance) {
        this.ECSInstance = ECSInstance;
        return this;
    }
    public String getECSInstance() {
        return this.ECSInstance;
    }

    public Resource setGPUModel(String GPUModel) {
        this.GPUModel = GPUModel;
        return this;
    }
    public String getGPUModel() {
        return this.GPUModel;
    }

    public Resource setGPUNum(Long GPUNum) {
        this.GPUNum = GPUNum;
        return this;
    }
    public Long getGPUNum() {
        return this.GPUNum;
    }

    public Resource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Resource setRAM(Long RAM) {
        this.RAM = RAM;
        return this;
    }
    public Long getRAM() {
        return this.RAM;
    }

}
