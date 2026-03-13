// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GPUConfig extends TeaModel {
    /**
     * <p>The GPU memory size. Unit: MB. The value is a multiple of 1024 MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    /**
     * <p>The type of GPU cards. Valid values: fc.gpu.tesla.1: Tesla T4 fc.gpu.ampere.1: Ampere A10</p>
     * 
     * <strong>example:</strong>
     * <p>fc.gpu.ampere.1</p>
     */
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
