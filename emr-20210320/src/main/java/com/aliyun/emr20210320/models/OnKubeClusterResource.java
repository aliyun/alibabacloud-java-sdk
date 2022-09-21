// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class OnKubeClusterResource extends TeaModel {
    @NameInMap("Cpu")
    public String cpu;

    @NameInMap("Memory")
    public String memory;

    public static OnKubeClusterResource build(java.util.Map<String, ?> map) throws Exception {
        OnKubeClusterResource self = new OnKubeClusterResource();
        return TeaModel.build(map, self);
    }

    public OnKubeClusterResource setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public OnKubeClusterResource setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
