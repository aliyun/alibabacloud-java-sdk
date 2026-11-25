// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeResponseBody extends TeaModel {
    /**
     * <p>The list of resource specifications.</p>
     */
    @NameInMap("NodeInstanceTypeModels")
    public java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> nodeInstanceTypeModels;

    /**
     * <p>The page number of the query results currently displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of query results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodeInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInstanceTypeResponseBody self = new ListNodeInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeInstanceTypeResponseBody setNodeInstanceTypeModels(java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> nodeInstanceTypeModels) {
        this.nodeInstanceTypeModels = nodeInstanceTypeModels;
        return this;
    }
    public java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> getNodeInstanceTypeModels() {
        return this.nodeInstanceTypeModels;
    }

    public ListNodeInstanceTypeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeInstanceTypeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeInstanceTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vLLM</p>
         */
        @NameInMap("DefaultInferenceEngine")
        public String defaultInferenceEngine;

        /**
         * <strong>example:</strong>
         * <p>支持文本生成</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("FirstTokenLatencySeconds")
        public Double firstTokenLatencySeconds;

        /**
         * <strong>example:</strong>
         * <p>m-example-image</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>[&quot;text&quot;]</p>
         */
        @NameInMap("InputModalities")
        public java.util.List<String> inputModalities;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MachineInputTokensPerSecond")
        public Long machineInputTokensPerSecond;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("MachineOutputTokensPerSecond")
        public Long machineOutputTokensPerSecond;

        /**
         * <strong>example:</strong>
         * <p>32768</p>
         */
        @NameInMap("MaxModelLen")
        public Long maxModelLen;

        /**
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MaxModelLenMax")
        public Long maxModelLenMax;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MaxModelLenMin")
        public Long maxModelLenMin;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MaxNumSeqsMax")
        public Integer maxNumSeqsMax;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxNumSeqsMin")
        public Integer maxNumSeqsMin;

        /**
         * <strong>example:</strong>
         * <p>demo-model</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>示例模型</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>[&quot;text&quot;]</p>
         */
        @NameInMap("OutputModalities")
        public java.util.List<String> outputModalities;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Recommended")
        public Boolean recommended;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RecommendedMaxNumSeqs")
        public Integer recommendedMaxNumSeqs;

        public static ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo self = new ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo();
            return TeaModel.build(map, self);
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setDefaultInferenceEngine(String defaultInferenceEngine) {
            this.defaultInferenceEngine = defaultInferenceEngine;
            return this;
        }
        public String getDefaultInferenceEngine() {
            return this.defaultInferenceEngine;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setFirstTokenLatencySeconds(Double firstTokenLatencySeconds) {
            this.firstTokenLatencySeconds = firstTokenLatencySeconds;
            return this;
        }
        public Double getFirstTokenLatencySeconds() {
            return this.firstTokenLatencySeconds;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setInputModalities(java.util.List<String> inputModalities) {
            this.inputModalities = inputModalities;
            return this;
        }
        public java.util.List<String> getInputModalities() {
            return this.inputModalities;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMachineInputTokensPerSecond(Long machineInputTokensPerSecond) {
            this.machineInputTokensPerSecond = machineInputTokensPerSecond;
            return this;
        }
        public Long getMachineInputTokensPerSecond() {
            return this.machineInputTokensPerSecond;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMachineOutputTokensPerSecond(Long machineOutputTokensPerSecond) {
            this.machineOutputTokensPerSecond = machineOutputTokensPerSecond;
            return this;
        }
        public Long getMachineOutputTokensPerSecond() {
            return this.machineOutputTokensPerSecond;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMaxModelLen(Long maxModelLen) {
            this.maxModelLen = maxModelLen;
            return this;
        }
        public Long getMaxModelLen() {
            return this.maxModelLen;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMaxModelLenMax(Long maxModelLenMax) {
            this.maxModelLenMax = maxModelLenMax;
            return this;
        }
        public Long getMaxModelLenMax() {
            return this.maxModelLenMax;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMaxModelLenMin(Long maxModelLenMin) {
            this.maxModelLenMin = maxModelLenMin;
            return this;
        }
        public Long getMaxModelLenMin() {
            return this.maxModelLenMin;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMaxNumSeqsMax(Integer maxNumSeqsMax) {
            this.maxNumSeqsMax = maxNumSeqsMax;
            return this;
        }
        public Integer getMaxNumSeqsMax() {
            return this.maxNumSeqsMax;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setMaxNumSeqsMin(Integer maxNumSeqsMin) {
            this.maxNumSeqsMin = maxNumSeqsMin;
            return this;
        }
        public Integer getMaxNumSeqsMin() {
            return this.maxNumSeqsMin;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setOutputModalities(java.util.List<String> outputModalities) {
            this.outputModalities = outputModalities;
            return this;
        }
        public java.util.List<String> getOutputModalities() {
            return this.outputModalities;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setRecommended(Boolean recommended) {
            this.recommended = recommended;
            return this;
        }
        public Boolean getRecommended() {
            return this.recommended;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo setRecommendedMaxNumSeqs(Integer recommendedMaxNumSeqs) {
            this.recommendedMaxNumSeqs = recommendedMaxNumSeqs;
            return this;
        }
        public Integer getRecommendedMaxNumSeqs() {
            return this.recommendedMaxNumSeqs;
        }

    }

    public static class ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>49152</p>
         */
        @NameInMap("EcsGpuMemory")
        public Integer ecsGpuMemory;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <p>The GPU memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("GpuMemory")
        public Long gpuMemory;

        /**
         * <strong>example:</strong>
         * <p>RTX 5880</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The maximum number of concurrent sessions, which is the number of sessions that can be simultaneously connected to a single resource. If too many sessions are connected at the same time, the application experience may degrade. The valid values vary depending on the resource specification. The valid values for each resource specification are as follows:</p>
         * <ul>
         * <li>appstreaming.general.2c4g: 1</li>
         * <li>appstreaming.general.4c8g: 1 to 2</li>
         * <li>appstreaming.general.8c16g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
         * <li>appstreaming.vgpu.14c93g.12g: 1 to 7</li>
         * <li>appstreaming.vgpu.4c10g.2gt4: 1 to 2</li>
         * <li>appstreaming.vgpu.4c16g.2ga10: 1 to 2</li>
         * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c16g.4gt4: 1 to 4</li>
         * <li>appstreaming.vgpu.8c32g.4ga10: 1 to 4</li>
         * <li>appstreaming.vgpu.12c46g.11g28: 1 to 6</li>
         * <li>appstreaming.vgpu.14c93g.12g: 1 to 7</li>
         * <li>appstreaming.vgpu.16c32g.8g: 1 to 8</li>
         * <li>appstreaming.vgpu.16c62g.8ga10: 1 to 8</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The resource specification type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <p>The resource specification family.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu</p>
         */
        @NameInMap("NodeInstanceTypeFamily")
        public String nodeInstanceTypeFamily;

        /**
         * <p>The resource specification name.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING-General-purpose_4vCPU8GB</p>
         */
        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        /**
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("WuyingServerModelMetaInfo")
        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo wuyingServerModelMetaInfo;

        public static ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels build(java.util.Map<String, ?> map) throws Exception {
            ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels self = new ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels();
            return TeaModel.build(map, self);
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setEcsGpuMemory(Integer ecsGpuMemory) {
            this.ecsGpuMemory = ecsGpuMemory;
            return this;
        }
        public Integer getEcsGpuMemory() {
            return this.ecsGpuMemory;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public String getGpu() {
            return this.gpu;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setGpuMemory(Long gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setNodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
            this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
            return this;
        }
        public String getNodeInstanceTypeFamily() {
            return this.nodeInstanceTypeFamily;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setWuyingServerModelMetaInfo(ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo wuyingServerModelMetaInfo) {
            this.wuyingServerModelMetaInfo = wuyingServerModelMetaInfo;
            return this;
        }
        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModelsWuyingServerModelMetaInfo getWuyingServerModelMetaInfo() {
            return this.wuyingServerModelMetaInfo;
        }

    }

}
