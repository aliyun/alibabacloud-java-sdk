// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ResourceSpec extends TeaModel {
    /**
     * <p>The number of CUs. Currently, 1 CU is equivalent to 1 vCPU and 4 GB of memory.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>The number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gpu")
    public Integer gpu;

    /**
     * <p>The number of GPU machines.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gpuMachineNum")
    public Integer gpuMachineNum;

    /**
     * <p>The instance type ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.gn7i-c32g1.8xlarge</p>
     */
    @NameInMap("instanceTypeId")
    public String instanceTypeId;

    /**
     * <p>The upper limit of the absolute value for the queue quota. If not specified, the backend falls back to the number of CUs.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("maxCu")
    public Integer maxCu;

    public static ResourceSpec build(java.util.Map<String, ?> map) throws Exception {
        ResourceSpec self = new ResourceSpec();
        return TeaModel.build(map, self);
    }

    public ResourceSpec setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public ResourceSpec setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public ResourceSpec setGpuMachineNum(Integer gpuMachineNum) {
        this.gpuMachineNum = gpuMachineNum;
        return this;
    }
    public Integer getGpuMachineNum() {
        return this.gpuMachineNum;
    }

    public ResourceSpec setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
        return this;
    }
    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public ResourceSpec setMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
        return this;
    }
    public Integer getMaxCu() {
        return this.maxCu;
    }

}
