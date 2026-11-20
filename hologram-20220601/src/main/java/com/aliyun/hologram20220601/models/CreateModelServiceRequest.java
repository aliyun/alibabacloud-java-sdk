// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateModelServiceRequest extends TeaModel {
    /**
     * <p>The API key for Alibaba Cloud Model Studio. Log on to the Model Studio console or use the API to obtain the key. This parameter is required only for Alibaba Cloud Model Studio models.</p>
     * 
     * <strong>example:</strong>
     * <p>api-key-xxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>The CPU specifications. This parameter is required only for Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The GPU specifications. This parameter is required only for Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gpu")
    public Long gpu;

    /**
     * <p>The GPU memory specifications. This parameter is required only for Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("gpuMemory")
    public Long gpuMemory;

    /**
     * <p>The memory specifications. This parameter is required only for Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("memory")
    public Long memory;

    /**
     * <p>The model parameters. Refer to the default parameters returned by ListModelCatalog. You can pass the parameters directly or modify them as needed before passing. This parameter is required only for Alibaba Cloud Model Studio models.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;timeout&quot;:600,&quot;max_retries&quot;:10,&quot;max_retry_delay&quot;:8,&quot;initial_retry_delay&quot;:0.5}</p>
     */
    @NameInMap("modelParams")
    public String modelParams;

    /**
     * <p>The custom service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_model</p>
     */
    @NameInMap("modelServiceName")
    public String modelServiceName;

    /**
     * <p>The model name. To query Alibaba Cloud Model Studio models, call ListModelCatalog. To query Hologres AI nodes, call GetAvailableModelsResource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.5-plus</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The underlying model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The number of service replicas. This parameter is required only for Hologres AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("serviceCount")
    public Long serviceCount;

    /**
     * <p>The model type, such as chat/completions or embedding. Refer to the types returned by ListModelCatalog and create the model as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>embedding</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static CreateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceRequest self = new CreateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateModelServiceRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public CreateModelServiceRequest setGpu(Long gpu) {
        this.gpu = gpu;
        return this;
    }
    public Long getGpu() {
        return this.gpu;
    }

    public CreateModelServiceRequest setGpuMemory(Long gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Long getGpuMemory() {
        return this.gpuMemory;
    }

    public CreateModelServiceRequest setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public CreateModelServiceRequest setModelParams(String modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public String getModelParams() {
        return this.modelParams;
    }

    public CreateModelServiceRequest setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    public CreateModelServiceRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelServiceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateModelServiceRequest setServiceCount(Long serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Long getServiceCount() {
        return this.serviceCount;
    }

    public CreateModelServiceRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
