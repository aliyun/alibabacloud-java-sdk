// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class CapacityResource extends TeaModel {
    @NameInMap("CPU")
    public String CPU;

    @NameInMap("GPU")
    public String GPU;

    @NameInMap("Memory")
    public String memory;

    public static CapacityResource build(java.util.Map<String, ?> map) throws Exception {
        CapacityResource self = new CapacityResource();
        return TeaModel.build(map, self);
    }

    public CapacityResource setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public CapacityResource setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public CapacityResource setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
