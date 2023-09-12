// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    @NameInMap("CPU")
    public Long CPU;

    @NameInMap("ECSInstance")
    public String ECSInstance;

    @NameInMap("GPUModel")
    public String GPUModel;

    @NameInMap("GPUNum")
    public Long GPUNum;

    @NameInMap("Name")
    public String name;

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
