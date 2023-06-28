// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GPUConfig extends TeaModel {
    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    @NameInMap("gpuType")
    public String gpuType;

    public static GPUConfig build(java.util.Map<String, ?> map) throws Exception {
        GPUConfig self = new GPUConfig();
        return TeaModel.build(map, self);
    }

    public GPUConfig setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    public GPUConfig setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

}
