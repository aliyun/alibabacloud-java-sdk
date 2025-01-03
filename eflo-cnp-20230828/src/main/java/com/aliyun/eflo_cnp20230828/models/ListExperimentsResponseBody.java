// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentsResponseBody extends TeaModel {
    /**
     * <p>Access denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public java.util.List<ListExperimentsResponseBodyData> data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsResponseBody self = new ListExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListExperimentsResponseBody setData(java.util.List<ListExperimentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListExperimentsResponseBodyData> getData() {
        return this.data;
    }

    public ListExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentsResponseBodyDataEnvParamsResourceNodes extends TeaModel {
        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>lingj1xxnjt1k4nv-mg18v52pydyuumae-0</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Requested CPU</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("RequestCPU")
        public Integer requestCPU;

        /**
         * <p>Requested GPU</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RequestGPU")
        public Integer requestGPU;

        /**
         * <p>Requested memory</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("RequestMemory")
        public Integer requestMemory;

        /**
         * <p>Total CPU</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("TotalCPU")
        public Integer totalCPU;

        /**
         * <p>Total GPU</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalGPU")
        public Integer totalGPU;

        /**
         * <p>Total memory</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        public static ListExperimentsResponseBodyDataEnvParamsResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyDataEnvParamsResourceNodes self = new ListExperimentsResponseBodyDataEnvParamsResourceNodes();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setRequestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setRequestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setRequestMemory(Integer requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setTotalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setTotalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
            return this;
        }
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        public ListExperimentsResponseBodyDataEnvParamsResourceNodes setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

    }

    public static class ListExperimentsResponseBodyDataEnvParams extends TeaModel {
        /**
         * <p>Number of CPUs allocated</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>CUDA version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("CudaVersion")
        public String cudaVersion;

        /**
         * <p>Additional parameters</p>
         */
        @NameInMap("ExtendParam")
        public java.util.Map<String, String> extendParam;

        /**
         * <p>GPU driver version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>Number of GPUs allocated</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Amount of memory (GB) allocated</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemoryPerWorker")
        public Integer memoryPerWorker;

        /**
         * <p>NCCL version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("NCCLVersion")
        public String NCCLVersion;

        /**
         * <p>PyTorch version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PyTorchVersion")
        public String pyTorchVersion;

        /**
         * <p>Specified nodes</p>
         */
        @NameInMap("ResourceNodes")
        public java.util.List<ListExperimentsResponseBodyDataEnvParamsResourceNodes> resourceNodes;

        /**
         * <p>Amount of shared memory (GB) allocated</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <p>Number of nodes</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static ListExperimentsResponseBodyDataEnvParams build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyDataEnvParams self = new ListExperimentsResponseBodyDataEnvParams();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyDataEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public ListExperimentsResponseBodyDataEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public ListExperimentsResponseBodyDataEnvParams setExtendParam(java.util.Map<String, String> extendParam) {
            this.extendParam = extendParam;
            return this;
        }
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        public ListExperimentsResponseBodyDataEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public ListExperimentsResponseBodyDataEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public ListExperimentsResponseBodyDataEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public ListExperimentsResponseBodyDataEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public ListExperimentsResponseBodyDataEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public ListExperimentsResponseBodyDataEnvParams setResourceNodes(java.util.List<ListExperimentsResponseBodyDataEnvParamsResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<ListExperimentsResponseBodyDataEnvParamsResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public ListExperimentsResponseBodyDataEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public ListExperimentsResponseBodyDataEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class ListExperimentsResponseBodyDataResultsErrorWorker extends TeaModel {
        /**
         * <p>Whether there is an error</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ErrorFlag")
        public Boolean errorFlag;

        /**
         * <p>Error information</p>
         * 
         * <strong>example:</strong>
         * <p>error msg</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>176</p>
         */
        @NameInMap("ExperimentId")
        public Long experimentId;

        /**
         * <p>GPU name</p>
         * 
         * <strong>example:</strong>
         * <p>8x OAM 810 GPU</p>
         */
        @NameInMap("GpuName")
        public String gpuName;

        /**
         * <p>Number of GPUs</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuNum")
        public Integer gpuNum;

        /**
         * <p>Host IP</p>
         * 
         * <strong>example:</strong>
         * <p>etcd_cluster_c0n2</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Pod name</p>
         * 
         * <strong>example:</strong>
         * <p>fluxserv-6fc89b45cf-w8wq6</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>Throughput</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("SamplesPerSecond")
        public Double samplesPerSecond;

        /**
         * <p>TFLOPS value</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Tflops")
        public Double tflops;

        /**
         * <p>Whether there is an alarm</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WarningFlag")
        public Boolean warningFlag;

        /**
         * <p>Alarm information</p>
         * 
         * <strong>example:</strong>
         * <p>warning msg</p>
         */
        @NameInMap("WarningMsg")
        public String warningMsg;

        public static ListExperimentsResponseBodyDataResultsErrorWorker build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyDataResultsErrorWorker self = new ListExperimentsResponseBodyDataResultsErrorWorker();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setErrorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setGpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }
        public String getGpuName() {
            return this.gpuName;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setGpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setTflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }
        public Double getTflops() {
            return this.tflops;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setWarningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        public ListExperimentsResponseBodyDataResultsErrorWorker setWarningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }
        public String getWarningMsg() {
            return this.warningMsg;
        }

    }

    public static class ListExperimentsResponseBodyDataResultsWarningWorker extends TeaModel {
        /**
         * <p>Whether there is an error</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ErrorFlag")
        public Boolean errorFlag;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>error msg</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>113</p>
         */
        @NameInMap("ExperimentId")
        public Long experimentId;

        /**
         * <p>GPU name</p>
         * 
         * <strong>example:</strong>
         * <p>8x OAM 810 GPU</p>
         */
        @NameInMap("GpuName")
        public String gpuName;

        /**
         * <p>Number of GPUs</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("GpuNum")
        public Integer gpuNum;

        /**
         * <p>Host IP</p>
         * 
         * <strong>example:</strong>
         * <p>101.66.165.102</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Pod name</p>
         * 
         * <strong>example:</strong>
         * <p>hzs-forge-sdxl-online-7ff4d86444-pc95h</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>Throughput</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        @NameInMap("SamplesPerSecond")
        public Double samplesPerSecond;

        /**
         * <p>TFLOPS value</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("Tflops")
        public Double tflops;

        /**
         * <p>Whether there is an alarm</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WarningFlag")
        public Boolean warningFlag;

        /**
         * <p>Alarm message</p>
         * 
         * <strong>example:</strong>
         * <p>warning msg</p>
         */
        @NameInMap("WarningMsg")
        public String warningMsg;

        public static ListExperimentsResponseBodyDataResultsWarningWorker build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyDataResultsWarningWorker self = new ListExperimentsResponseBodyDataResultsWarningWorker();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setErrorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setGpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }
        public String getGpuName() {
            return this.gpuName;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setGpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setTflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }
        public Double getTflops() {
            return this.tflops;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setWarningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        public ListExperimentsResponseBodyDataResultsWarningWorker setWarningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }
        public String getWarningMsg() {
            return this.warningMsg;
        }

    }

    public static class ListExperimentsResponseBodyDataResults extends TeaModel {
        /**
         * <p>Duration</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>Error nodes</p>
         */
        @NameInMap("ErrorWorker")
        public java.util.List<ListExperimentsResponseBodyDataResultsErrorWorker> errorWorker;

        /**
         * <p>Parameter name</p>
         * 
         * <strong>example:</strong>
         * <p>440</p>
         */
        @NameInMap("ExperimentId")
        public Long experimentId;

        /**
         * <p>MFU</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("Mfu")
        public Double mfu;

        /**
         * <p>Samples per second</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SamplesPerSecond")
        public Double samplesPerSecond;

        /**
         * <p>Seconds per iteration</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("SecondsPerIteration")
        public Double secondsPerIteration;

        /**
         * <p>Warning worker</p>
         */
        @NameInMap("WarningWorker")
        public java.util.List<ListExperimentsResponseBodyDataResultsWarningWorker> warningWorker;

        public static ListExperimentsResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyDataResults self = new ListExperimentsResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyDataResults setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public ListExperimentsResponseBodyDataResults setErrorWorker(java.util.List<ListExperimentsResponseBodyDataResultsErrorWorker> errorWorker) {
            this.errorWorker = errorWorker;
            return this;
        }
        public java.util.List<ListExperimentsResponseBodyDataResultsErrorWorker> getErrorWorker() {
            return this.errorWorker;
        }

        public ListExperimentsResponseBodyDataResults setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyDataResults setMfu(Double mfu) {
            this.mfu = mfu;
            return this;
        }
        public Double getMfu() {
            return this.mfu;
        }

        public ListExperimentsResponseBodyDataResults setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public ListExperimentsResponseBodyDataResults setSecondsPerIteration(Double secondsPerIteration) {
            this.secondsPerIteration = secondsPerIteration;
            return this;
        }
        public Double getSecondsPerIteration() {
            return this.secondsPerIteration;
        }

        public ListExperimentsResponseBodyDataResults setWarningWorker(java.util.List<ListExperimentsResponseBodyDataResultsWarningWorker> warningWorker) {
            this.warningWorker = warningWorker;
            return this;
        }
        public java.util.List<ListExperimentsResponseBodyDataResultsWarningWorker> getWarningWorker() {
            return this.warningWorker;
        }

    }

    public static class ListExperimentsResponseBodyData extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22 10:18:10</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Task end time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22 10:28:10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Environment parameters in operation</p>
         */
        @NameInMap("EnvParams")
        public ListExperimentsResponseBodyDataEnvParams envParams;

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>1684537476910997506</p>
         */
        @NameInMap("ExperimentId")
        public Long experimentId;

        /**
         * <p>Experiment name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExperimentName")
        public String experimentName;

        /**
         * <p>Experiment type</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        @NameInMap("ExperimentType")
        public String experimentType;

        /**
         * <p>Parsed load parameters</p>
         */
        @NameInMap("GetParams")
        public java.util.Map<String, String> getParams;

        /**
         * <p>Resource name</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.r8y.4xlarge</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>Task results</p>
         */
        @NameInMap("Results")
        public ListExperimentsResponseBodyDataResults results;

        /**
         * <p>Load parameters in operation</p>
         */
        @NameInMap("SetParams")
        public java.util.Map<String, String> setParams;

        /**
         * <p>Task start time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22 10:18:10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-22 10:18:10</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>Workload name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static ListExperimentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyData self = new ListExperimentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListExperimentsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListExperimentsResponseBodyData setEnvParams(ListExperimentsResponseBodyDataEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public ListExperimentsResponseBodyDataEnvParams getEnvParams() {
            return this.envParams;
        }

        public ListExperimentsResponseBodyData setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyData setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public ListExperimentsResponseBodyData setExperimentType(String experimentType) {
            this.experimentType = experimentType;
            return this;
        }
        public String getExperimentType() {
            return this.experimentType;
        }

        public ListExperimentsResponseBodyData setGetParams(java.util.Map<String, String> getParams) {
            this.getParams = getParams;
            return this;
        }
        public java.util.Map<String, String> getGetParams() {
            return this.getParams;
        }

        public ListExperimentsResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListExperimentsResponseBodyData setResults(ListExperimentsResponseBodyDataResults results) {
            this.results = results;
            return this;
        }
        public ListExperimentsResponseBodyDataResults getResults() {
            return this.results;
        }

        public ListExperimentsResponseBodyData setSetParams(java.util.Map<String, String> setParams) {
            this.setParams = setParams;
            return this;
        }
        public java.util.Map<String, String> getSetParams() {
            return this.setParams;
        }

        public ListExperimentsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListExperimentsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExperimentsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListExperimentsResponseBodyData setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

}
