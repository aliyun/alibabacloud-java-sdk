// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentResponseBody extends TeaModel {
    /**
     * <p>Access denied detail</p>
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
    public GetExperimentResponseBodyData data;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>E67E2E4C-2B47-5C55-AA17-1D771E070AEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>total</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResponseBody self = new GetExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetExperimentResponseBody setData(GetExperimentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExperimentResponseBodyData getData() {
        return this.data;
    }

    public GetExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetExperimentResponseBodyDataEnvParamsResourceNodes extends TeaModel {
        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>p-jt-waf-app1</p>
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

        public static GetExperimentResponseBodyDataEnvParamsResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataEnvParamsResourceNodes self = new GetExperimentResponseBodyDataEnvParamsResourceNodes();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setRequestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setRequestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setRequestMemory(Integer requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setTotalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setTotalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
            return this;
        }
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        public GetExperimentResponseBodyDataEnvParamsResourceNodes setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

    }

    public static class GetExperimentResponseBodyDataEnvParams extends TeaModel {
        /**
         * <p>CPU allocation number</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>cudaVersion</p>
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
         * <p>GPU allocation number</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Memory Per Worker</p>
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
        public java.util.List<GetExperimentResponseBodyDataEnvParamsResourceNodes> resourceNodes;

        /**
         * <p>Share Memory</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <p>Worker number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static GetExperimentResponseBodyDataEnvParams build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataEnvParams self = new GetExperimentResponseBodyDataEnvParams();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public GetExperimentResponseBodyDataEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public GetExperimentResponseBodyDataEnvParams setExtendParam(java.util.Map<String, String> extendParam) {
            this.extendParam = extendParam;
            return this;
        }
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        public GetExperimentResponseBodyDataEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public GetExperimentResponseBodyDataEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public GetExperimentResponseBodyDataEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public GetExperimentResponseBodyDataEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public GetExperimentResponseBodyDataEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public GetExperimentResponseBodyDataEnvParams setResourceNodes(java.util.List<GetExperimentResponseBodyDataEnvParamsResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataEnvParamsResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public GetExperimentResponseBodyDataEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public GetExperimentResponseBodyDataEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class GetExperimentResponseBodyDataResourceMachineType extends TeaModel {
        /**
         * <p>Number of network bonds</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BondNum")
        public Integer bondNum;

        /**
         * <p>CPU information</p>
         * 
         * <strong>example:</strong>
         * <p>2x Intel Icelake 8369B 32C CPU</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>Disk information</p>
         * 
         * <strong>example:</strong>
         * <p>2x 480GB SATA SSD \n 4x 3.84TB NVMe SSD</p>
         */
        @NameInMap("DiskInfo")
        public String diskInfo;

        /**
         * <p>GPU information</p>
         * 
         * <strong>example:</strong>
         * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
         */
        @NameInMap("GpuInfo")
        public String gpuInfo;

        /**
         * <p>Memory information</p>
         * 
         * <strong>example:</strong>
         * <p>32x 64GB DDR4 3200 Memory</p>
         */
        @NameInMap("MemoryInfo")
        public String memoryInfo;

        /**
         * <p>Specification name</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1n</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Network information</p>
         * 
         * <strong>example:</strong>
         * <p>1x 100Gbps DP NIC for VPC \n 4x 100Gbps DP RoCE NIC</p>
         */
        @NameInMap("NetworkInfo")
        public String networkInfo;

        /**
         * <p>Network mode</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetworkMode")
        public String networkMode;

        /**
         * <p>Number of nodes</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetExperimentResponseBodyDataResourceMachineType build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResourceMachineType self = new GetExperimentResponseBodyDataResourceMachineType();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResourceMachineType setBondNum(Integer bondNum) {
            this.bondNum = bondNum;
            return this;
        }
        public Integer getBondNum() {
            return this.bondNum;
        }

        public GetExperimentResponseBodyDataResourceMachineType setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public GetExperimentResponseBodyDataResourceMachineType setDiskInfo(String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public String getDiskInfo() {
            return this.diskInfo;
        }

        public GetExperimentResponseBodyDataResourceMachineType setGpuInfo(String gpuInfo) {
            this.gpuInfo = gpuInfo;
            return this;
        }
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        public GetExperimentResponseBodyDataResourceMachineType setMemoryInfo(String memoryInfo) {
            this.memoryInfo = memoryInfo;
            return this;
        }
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        public GetExperimentResponseBodyDataResourceMachineType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExperimentResponseBodyDataResourceMachineType setNetworkInfo(String networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public String getNetworkInfo() {
            return this.networkInfo;
        }

        public GetExperimentResponseBodyDataResourceMachineType setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public GetExperimentResponseBodyDataResourceMachineType setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public GetExperimentResponseBodyDataResourceMachineType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetExperimentResponseBodyDataResourceResourceNodes extends TeaModel {
        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>InputCheck</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        public static GetExperimentResponseBodyDataResourceResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResourceResourceNodes self = new GetExperimentResponseBodyDataResourceResourceNodes();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResourceResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetExperimentResponseBodyDataResourceUserAccessParam extends TeaModel {
        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>User key</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>Endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>123434542498</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetExperimentResponseBodyDataResourceUserAccessParam build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResourceUserAccessParam self = new GetExperimentResponseBodyDataResourceUserAccessParam();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResourceUserAccessParam setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetExperimentResponseBodyDataResourceUserAccessParam setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetExperimentResponseBodyDataResourceUserAccessParam setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetExperimentResponseBodyDataResourceUserAccessParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetExperimentResponseBodyDataResource extends TeaModel {
        /**
         * <p>Used CPU</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuCoreLimit")
        public Integer cpuCoreLimit;

        /**
         * <p>Used GPU</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuLimit")
        public Integer gpuLimit;

        /**
         * <p>Instance type</p>
         */
        @NameInMap("MachineType")
        public GetExperimentResponseBodyDataResourceMachineType machineType;

        /**
         * <p>Used memory</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("MaxCpuCore")
        public Integer maxCpuCore;

        /**
         * <p>Used memory</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxGpu")
        public Integer maxGpu;

        /**
         * <p>Used memory</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxMemory")
        public Long maxMemory;

        /**
         * <p>Used memory</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemoryLimit")
        public Long memoryLimit;

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>Cluster name</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.r8y.4xlarge</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>Resource node list</p>
         */
        @NameInMap("ResourceNodes")
        public java.util.List<GetExperimentResponseBodyDataResourceResourceNodes> resourceNodes;

        /**
         * <p>User authorization parameters</p>
         */
        @NameInMap("UserAccessParam")
        public GetExperimentResponseBodyDataResourceUserAccessParam userAccessParam;

        public static GetExperimentResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResource self = new GetExperimentResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResource setCpuCoreLimit(Integer cpuCoreLimit) {
            this.cpuCoreLimit = cpuCoreLimit;
            return this;
        }
        public Integer getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

        public GetExperimentResponseBodyDataResource setGpuLimit(Integer gpuLimit) {
            this.gpuLimit = gpuLimit;
            return this;
        }
        public Integer getGpuLimit() {
            return this.gpuLimit;
        }

        public GetExperimentResponseBodyDataResource setMachineType(GetExperimentResponseBodyDataResourceMachineType machineType) {
            this.machineType = machineType;
            return this;
        }
        public GetExperimentResponseBodyDataResourceMachineType getMachineType() {
            return this.machineType;
        }

        public GetExperimentResponseBodyDataResource setMaxCpuCore(Integer maxCpuCore) {
            this.maxCpuCore = maxCpuCore;
            return this;
        }
        public Integer getMaxCpuCore() {
            return this.maxCpuCore;
        }

        public GetExperimentResponseBodyDataResource setMaxGpu(Integer maxGpu) {
            this.maxGpu = maxGpu;
            return this;
        }
        public Integer getMaxGpu() {
            return this.maxGpu;
        }

        public GetExperimentResponseBodyDataResource setMaxMemory(Long maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        public GetExperimentResponseBodyDataResource setMemoryLimit(Long memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public Long getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetExperimentResponseBodyDataResource setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GetExperimentResponseBodyDataResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetExperimentResponseBodyDataResource setResourceNodes(java.util.List<GetExperimentResponseBodyDataResourceResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataResourceResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public GetExperimentResponseBodyDataResource setUserAccessParam(GetExperimentResponseBodyDataResourceUserAccessParam userAccessParam) {
            this.userAccessParam = userAccessParam;
            return this;
        }
        public GetExperimentResponseBodyDataResourceUserAccessParam getUserAccessParam() {
            return this.userAccessParam;
        }

    }

    public static class GetExperimentResponseBodyDataResultsErrorWorker extends TeaModel {
        /**
         * <p>error flag</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ErrorFlag")
        public Boolean errorFlag;

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>Connection reset</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>97</p>
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
         * <p>Service address</p>
         * 
         * <strong>example:</strong>
         * <p>60.188.98.209</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>hzs-forge-sdxl-online-7ff4d86444-pc95h</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>Samples Per Second</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("SamplesPerSecond")
        public Double samplesPerSecond;

        /**
         * <p>TFLOPS</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Tflops")
        public Double tflops;

        /**
         * <p>Whether there is a warning</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WarningFlag")
        public Boolean warningFlag;

        /**
         * <p>Warning message</p>
         * 
         * <strong>example:</strong>
         * <p>warning message</p>
         */
        @NameInMap("WarningMsg")
        public String warningMsg;

        public static GetExperimentResponseBodyDataResultsErrorWorker build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResultsErrorWorker self = new GetExperimentResponseBodyDataResultsErrorWorker();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setErrorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setGpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }
        public String getGpuName() {
            return this.gpuName;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setGpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setTflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }
        public Double getTflops() {
            return this.tflops;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setWarningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        public GetExperimentResponseBodyDataResultsErrorWorker setWarningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }
        public String getWarningMsg() {
            return this.warningMsg;
        }

    }

    public static class GetExperimentResponseBodyDataResultsTaskIndividualResultList extends TeaModel {
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
         * <p>error message</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>实验ID。</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
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
         * <p>节点主机名称。</p>
         * 
         * <strong>example:</strong>
         * <p>p-jt-waf-app1</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Pod名称。</p>
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
         * <p>28</p>
         */
        @NameInMap("SamplesPerSecond")
        public Double samplesPerSecond;

        /**
         * <p>TFLOPS value</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Tflops")
        public Double tflops;

        /**
         * <p>Whether there is a warning</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WarningFlag")
        public Boolean warningFlag;

        /**
         * <p>Warning message</p>
         * 
         * <strong>example:</strong>
         * <p>warning message</p>
         */
        @NameInMap("WarningMsg")
        public String warningMsg;

        public static GetExperimentResponseBodyDataResultsTaskIndividualResultList build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResultsTaskIndividualResultList self = new GetExperimentResponseBodyDataResultsTaskIndividualResultList();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setErrorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setGpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }
        public String getGpuName() {
            return this.gpuName;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setGpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setTflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }
        public Double getTflops() {
            return this.tflops;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setWarningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        public GetExperimentResponseBodyDataResultsTaskIndividualResultList setWarningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }
        public String getWarningMsg() {
            return this.warningMsg;
        }

    }

    public static class GetExperimentResponseBodyDataResultsWarningBoundList extends TeaModel {
        /**
         * <p>Iteration</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Iteration")
        public Integer iteration;

        /**
         * <p>LOWER</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Lower")
        public Double lower;

        /**
         * <p>UPPER</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("Upper")
        public Double upper;

        public static GetExperimentResponseBodyDataResultsWarningBoundList build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResultsWarningBoundList self = new GetExperimentResponseBodyDataResultsWarningBoundList();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResultsWarningBoundList setIteration(Integer iteration) {
            this.iteration = iteration;
            return this;
        }
        public Integer getIteration() {
            return this.iteration;
        }

        public GetExperimentResponseBodyDataResultsWarningBoundList setLower(Double lower) {
            this.lower = lower;
            return this;
        }
        public Double getLower() {
            return this.lower;
        }

        public GetExperimentResponseBodyDataResultsWarningBoundList setUpper(Double upper) {
            this.upper = upper;
            return this;
        }
        public Double getUpper() {
            return this.upper;
        }

    }

    public static class GetExperimentResponseBodyDataResultsWarningWorker extends TeaModel {
        /**
         * <p>Whether there is an error</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ErrorFlag")
        public Boolean errorFlag;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
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
         * <p>Service address</p>
         * 
         * <strong>example:</strong>
         * <p>whza008403</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Pod name.</p>
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
         * <p>15</p>
         */
        @NameInMap("SamplesPerSecond")
        public Double samplesPerSecond;

        /**
         * <p>TFLOPS value</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Tflops")
        public Double tflops;

        /**
         * <p>Whether there is an alarm</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WarningFlag")
        public Boolean warningFlag;

        /**
         * <p>Alarm message</p>
         * 
         * <strong>example:</strong>
         * <p>warging message</p>
         */
        @NameInMap("WarningMsg")
        public String warningMsg;

        public static GetExperimentResponseBodyDataResultsWarningWorker build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResultsWarningWorker self = new GetExperimentResponseBodyDataResultsWarningWorker();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setErrorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setGpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }
        public String getGpuName() {
            return this.gpuName;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setGpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setTflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }
        public Double getTflops() {
            return this.tflops;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setWarningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        public GetExperimentResponseBodyDataResultsWarningWorker setWarningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }
        public String getWarningMsg() {
            return this.warningMsg;
        }

    }

    public static class GetExperimentResponseBodyDataResults extends TeaModel {
        /**
         * <p>Duration</p>
         * 
         * <strong>example:</strong>
         * <p>764</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>Error node</p>
         */
        @NameInMap("ErrorWorker")
        public java.util.List<GetExperimentResponseBodyDataResultsErrorWorker> errorWorker;

        /**
         * <p>Parameter name</p>
         * 
         * <strong>example:</strong>
         * <p>1748274952976261121</p>
         */
        @NameInMap("ExperimentId")
        public Long experimentId;

        /**
         * <p>MFU</p>
         * 
         * <strong>example:</strong>
         * <p>54.2</p>
         */
        @NameInMap("Mfu")
        public Double mfu;

        /**
         * <p>Samples Per Second</p>
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
         * <p>1000</p>
         */
        @NameInMap("SecondsPerIteration")
        public Double secondsPerIteration;

        /**
         * <p>Task individual result list</p>
         */
        @NameInMap("TaskIndividualResultList")
        public java.util.List<GetExperimentResponseBodyDataResultsTaskIndividualResultList> taskIndividualResultList;

        /**
         * <p>Invalid task results</p>
         */
        @NameInMap("TaskIndividualResultMap")
        public java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> taskIndividualResultMap;

        /**
         * <p>Warning bound list</p>
         */
        @NameInMap("WarningBoundList")
        public java.util.List<GetExperimentResponseBodyDataResultsWarningBoundList> warningBoundList;

        /**
         * <p>Warning worker</p>
         */
        @NameInMap("WarningWorker")
        public java.util.List<GetExperimentResponseBodyDataResultsWarningWorker> warningWorker;

        public static GetExperimentResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataResults self = new GetExperimentResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataResults setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetExperimentResponseBodyDataResults setErrorWorker(java.util.List<GetExperimentResponseBodyDataResultsErrorWorker> errorWorker) {
            this.errorWorker = errorWorker;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataResultsErrorWorker> getErrorWorker() {
            return this.errorWorker;
        }

        public GetExperimentResponseBodyDataResults setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public GetExperimentResponseBodyDataResults setMfu(Double mfu) {
            this.mfu = mfu;
            return this;
        }
        public Double getMfu() {
            return this.mfu;
        }

        public GetExperimentResponseBodyDataResults setSamplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        public GetExperimentResponseBodyDataResults setSecondsPerIteration(Double secondsPerIteration) {
            this.secondsPerIteration = secondsPerIteration;
            return this;
        }
        public Double getSecondsPerIteration() {
            return this.secondsPerIteration;
        }

        public GetExperimentResponseBodyDataResults setTaskIndividualResultList(java.util.List<GetExperimentResponseBodyDataResultsTaskIndividualResultList> taskIndividualResultList) {
            this.taskIndividualResultList = taskIndividualResultList;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataResultsTaskIndividualResultList> getTaskIndividualResultList() {
            return this.taskIndividualResultList;
        }

        public GetExperimentResponseBodyDataResults setTaskIndividualResultMap(java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> taskIndividualResultMap) {
            this.taskIndividualResultMap = taskIndividualResultMap;
            return this;
        }
        public java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> getTaskIndividualResultMap() {
            return this.taskIndividualResultMap;
        }

        public GetExperimentResponseBodyDataResults setWarningBoundList(java.util.List<GetExperimentResponseBodyDataResultsWarningBoundList> warningBoundList) {
            this.warningBoundList = warningBoundList;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataResultsWarningBoundList> getWarningBoundList() {
            return this.warningBoundList;
        }

        public GetExperimentResponseBodyDataResults setWarningWorker(java.util.List<GetExperimentResponseBodyDataResultsWarningWorker> warningWorker) {
            this.warningWorker = warningWorker;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataResultsWarningWorker> getWarningWorker() {
            return this.warningWorker;
        }

    }

    public static class GetExperimentResponseBodyDataTask extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:08</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>End time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 18:34:08</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Experiment parameters</p>
         */
        @NameInMap("Params")
        public java.util.Map<String, String> params;

        /**
         * <p>Scene</p>
         * 
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Start time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:08</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>167420</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:08</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetExperimentResponseBodyDataTask build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataTask self = new GetExperimentResponseBodyDataTask();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataTask setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetExperimentResponseBodyDataTask setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetExperimentResponseBodyDataTask setParams(java.util.Map<String, String> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        public GetExperimentResponseBodyDataTask setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetExperimentResponseBodyDataTask setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetExperimentResponseBodyDataTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetExperimentResponseBodyDataTask setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetExperimentResponseBodyDataTask setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetExperimentResponseBodyDataWorkloadParamSettings extends TeaModel {
        /**
         * <p>Default parameter value</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Parameter description</p>
         * 
         * <strong>example:</strong>
         * <p>number</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <p>Parameter name</p>
         * 
         * <strong>example:</strong>
         * <p>ITERATION</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>Parameter regular expression</p>
         * 
         * <strong>example:</strong>
         * <p>[0-9]+</p>
         */
        @NameInMap("ParamRegex")
        public String paramRegex;

        /**
         * <p>Parameter type</p>
         * 
         * <strong>example:</strong>
         * <p>number</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>Parameter value</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        public static GetExperimentResponseBodyDataWorkloadParamSettings build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataWorkloadParamSettings self = new GetExperimentResponseBodyDataWorkloadParamSettings();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataWorkloadParamSettings setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetExperimentResponseBodyDataWorkloadParamSettings setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public GetExperimentResponseBodyDataWorkloadParamSettings setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetExperimentResponseBodyDataWorkloadParamSettings setParamRegex(String paramRegex) {
            this.paramRegex = paramRegex;
            return this;
        }
        public String getParamRegex() {
            return this.paramRegex;
        }

        public GetExperimentResponseBodyDataWorkloadParamSettings setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public GetExperimentResponseBodyDataWorkloadParamSettings setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class GetExperimentResponseBodyDataWorkloadStaticConfig extends TeaModel {
        /**
         * <p>Framework</p>
         * 
         * <strong>example:</strong>
         * <p>pyTorch</p>
         */
        @NameInMap("FrameWork")
        public String frameWork;

        /**
         * <p>Operating system</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>Number of parameters</p>
         * 
         * <strong>example:</strong>
         * <p>7B</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>Software stack</p>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        @NameInMap("SoftwareStack")
        public String softwareStack;

        public static GetExperimentResponseBodyDataWorkloadStaticConfig build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataWorkloadStaticConfig self = new GetExperimentResponseBodyDataWorkloadStaticConfig();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataWorkloadStaticConfig setFrameWork(String frameWork) {
            this.frameWork = frameWork;
            return this;
        }
        public String getFrameWork() {
            return this.frameWork;
        }

        public GetExperimentResponseBodyDataWorkloadStaticConfig setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetExperimentResponseBodyDataWorkloadStaticConfig setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetExperimentResponseBodyDataWorkloadStaticConfig setSoftwareStack(String softwareStack) {
            this.softwareStack = softwareStack;
            return this;
        }
        public String getSoftwareStack() {
            return this.softwareStack;
        }

    }

    public static class GetExperimentResponseBodyDataWorkload extends TeaModel {
        /**
         * <p>Default CPU allocation</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("DefaultCpuPerWorker")
        public Integer defaultCpuPerWorker;

        /**
         * <p>Default GPU allocation</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DefaultGpuPerWorker")
        public Integer defaultGpuPerWorker;

        /**
         * <p>Default memory (GB) allocation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("DefaultMemoryPerWorker")
        public Integer defaultMemoryPerWorker;

        /**
         * <p>Default shared memory (GB) allocation</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("DefaultShareMemory")
        public Integer defaultShareMemory;

        /**
         * <p>Workload cluster, AI, GPU</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        @NameInMap("Family")
        public String family;

        /**
         * <p>JobKind</p>
         * 
         * <strong>example:</strong>
         * <p>PyTorchJob</p>
         */
        @NameInMap("JobKind")
        public String jobKind;

        /**
         * <p>Parameter settings</p>
         */
        @NameInMap("ParamSettings")
        public java.util.List<GetExperimentResponseBodyDataWorkloadParamSettings> paramSettings;

        /**
         * <p>Workload usage scenario</p>
         * 
         * <strong>example:</strong>
         * <p>NLP-LLM</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Scope</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>Static configuration</p>
         */
        @NameInMap("StaticConfig")
        public GetExperimentResponseBodyDataWorkloadStaticConfig staticConfig;

        /**
         * <p>Version ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        /**
         * <p>Workload description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadDescription")
        public String workloadDescription;

        /**
         * <p>Workload ID</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <p>Workload name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        /**
         * <p>Workload name</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        @NameInMap("WorkloadType")
        public String workloadType;

        public static GetExperimentResponseBodyDataWorkload build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyDataWorkload self = new GetExperimentResponseBodyDataWorkload();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyDataWorkload setDefaultCpuPerWorker(Integer defaultCpuPerWorker) {
            this.defaultCpuPerWorker = defaultCpuPerWorker;
            return this;
        }
        public Integer getDefaultCpuPerWorker() {
            return this.defaultCpuPerWorker;
        }

        public GetExperimentResponseBodyDataWorkload setDefaultGpuPerWorker(Integer defaultGpuPerWorker) {
            this.defaultGpuPerWorker = defaultGpuPerWorker;
            return this;
        }
        public Integer getDefaultGpuPerWorker() {
            return this.defaultGpuPerWorker;
        }

        public GetExperimentResponseBodyDataWorkload setDefaultMemoryPerWorker(Integer defaultMemoryPerWorker) {
            this.defaultMemoryPerWorker = defaultMemoryPerWorker;
            return this;
        }
        public Integer getDefaultMemoryPerWorker() {
            return this.defaultMemoryPerWorker;
        }

        public GetExperimentResponseBodyDataWorkload setDefaultShareMemory(Integer defaultShareMemory) {
            this.defaultShareMemory = defaultShareMemory;
            return this;
        }
        public Integer getDefaultShareMemory() {
            return this.defaultShareMemory;
        }

        public GetExperimentResponseBodyDataWorkload setFamily(String family) {
            this.family = family;
            return this;
        }
        public String getFamily() {
            return this.family;
        }

        public GetExperimentResponseBodyDataWorkload setJobKind(String jobKind) {
            this.jobKind = jobKind;
            return this;
        }
        public String getJobKind() {
            return this.jobKind;
        }

        public GetExperimentResponseBodyDataWorkload setParamSettings(java.util.List<GetExperimentResponseBodyDataWorkloadParamSettings> paramSettings) {
            this.paramSettings = paramSettings;
            return this;
        }
        public java.util.List<GetExperimentResponseBodyDataWorkloadParamSettings> getParamSettings() {
            return this.paramSettings;
        }

        public GetExperimentResponseBodyDataWorkload setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetExperimentResponseBodyDataWorkload setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetExperimentResponseBodyDataWorkload setStaticConfig(GetExperimentResponseBodyDataWorkloadStaticConfig staticConfig) {
            this.staticConfig = staticConfig;
            return this;
        }
        public GetExperimentResponseBodyDataWorkloadStaticConfig getStaticConfig() {
            return this.staticConfig;
        }

        public GetExperimentResponseBodyDataWorkload setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public GetExperimentResponseBodyDataWorkload setWorkloadDescription(String workloadDescription) {
            this.workloadDescription = workloadDescription;
            return this;
        }
        public String getWorkloadDescription() {
            return this.workloadDescription;
        }

        public GetExperimentResponseBodyDataWorkload setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public GetExperimentResponseBodyDataWorkload setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

        public GetExperimentResponseBodyDataWorkload setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

    }

    public static class GetExperimentResponseBodyData extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-29 02:16:35</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Task end time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-29 02:26:35</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Running environment parameters</p>
         */
        @NameInMap("EnvParams")
        public GetExperimentResponseBodyDataEnvParams envParams;

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>1726882991828688898</p>
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
         * <p>Parsed workload parameters</p>
         */
        @NameInMap("GetParams")
        public java.util.Map<String, String> getParams;

        /**
         * <p>cluster info</p>
         */
        @NameInMap("Resource")
        public GetExperimentResponseBodyDataResource resource;

        /**
         * <p>Resource name</p>
         * 
         * <strong>example:</strong>
         * <p>cifnews-guoyuan</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>Task results</p>
         */
        @NameInMap("Results")
        public GetExperimentResponseBodyDataResults results;

        /**
         * <p>Running workload parameters</p>
         */
        @NameInMap("SetParams")
        public java.util.Map<String, String> setParams;

        /**
         * <p>Task start time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-29 02:16:35</p>
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
         * <p>Experiment task</p>
         */
        @NameInMap("Task")
        public GetExperimentResponseBodyDataTask task;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-29 02:16:35</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>Workload information</p>
         */
        @NameInMap("Workload")
        public GetExperimentResponseBodyDataWorkload workload;

        /**
         * <p>Workload name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static GetExperimentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentResponseBodyData self = new GetExperimentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExperimentResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetExperimentResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetExperimentResponseBodyData setEnvParams(GetExperimentResponseBodyDataEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public GetExperimentResponseBodyDataEnvParams getEnvParams() {
            return this.envParams;
        }

        public GetExperimentResponseBodyData setExperimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public Long getExperimentId() {
            return this.experimentId;
        }

        public GetExperimentResponseBodyData setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public GetExperimentResponseBodyData setExperimentType(String experimentType) {
            this.experimentType = experimentType;
            return this;
        }
        public String getExperimentType() {
            return this.experimentType;
        }

        public GetExperimentResponseBodyData setGetParams(java.util.Map<String, String> getParams) {
            this.getParams = getParams;
            return this;
        }
        public java.util.Map<String, String> getGetParams() {
            return this.getParams;
        }

        public GetExperimentResponseBodyData setResource(GetExperimentResponseBodyDataResource resource) {
            this.resource = resource;
            return this;
        }
        public GetExperimentResponseBodyDataResource getResource() {
            return this.resource;
        }

        public GetExperimentResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetExperimentResponseBodyData setResults(GetExperimentResponseBodyDataResults results) {
            this.results = results;
            return this;
        }
        public GetExperimentResponseBodyDataResults getResults() {
            return this.results;
        }

        public GetExperimentResponseBodyData setSetParams(java.util.Map<String, String> setParams) {
            this.setParams = setParams;
            return this;
        }
        public java.util.Map<String, String> getSetParams() {
            return this.setParams;
        }

        public GetExperimentResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetExperimentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetExperimentResponseBodyData setTask(GetExperimentResponseBodyDataTask task) {
            this.task = task;
            return this;
        }
        public GetExperimentResponseBodyDataTask getTask() {
            return this.task;
        }

        public GetExperimentResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetExperimentResponseBodyData setWorkload(GetExperimentResponseBodyDataWorkload workload) {
            this.workload = workload;
            return this;
        }
        public GetExperimentResponseBodyDataWorkload getWorkload() {
            return this.workload;
        }

        public GetExperimentResponseBodyData setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

}
