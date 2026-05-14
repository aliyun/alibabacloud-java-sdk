// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateModelServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gpu")
    public Long gpu;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("memory")
    public Long memory;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model-qwen</p>
     */
    @NameInMap("modelServiceName")
    public String modelServiceName;

    /**
     * <strong>example:</strong>
     * <p>Qwen/Qwen2.5-VL-32B-Instruct</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("serviceCount")
    public Long serviceCount;

    public static UpdateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceRequest self = new UpdateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public UpdateModelServiceRequest setGpu(Long gpu) {
        this.gpu = gpu;
        return this;
    }
    public Long getGpu() {
        return this.gpu;
    }

    public UpdateModelServiceRequest setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public UpdateModelServiceRequest setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public UpdateModelServiceRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public UpdateModelServiceRequest setServiceCount(Long serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Long getServiceCount() {
        return this.serviceCount;
    }

}
