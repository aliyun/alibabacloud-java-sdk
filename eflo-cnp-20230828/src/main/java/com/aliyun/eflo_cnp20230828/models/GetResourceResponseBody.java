// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetResourceResponseBody extends TeaModel {
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
    public GetResourceResponseBodyData data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>25859897-35C8-5015-8365-7A3CE52F4854</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count of the query</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceResponseBody self = new GetResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetResourceResponseBody setData(GetResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceResponseBodyData getData() {
        return this.data;
    }

    public GetResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetResourceResponseBodyDataMachineType extends TeaModel {
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
         * <p>2x Intel Saphhire Rapid 8469C 48C CPU</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>Disk information</p>
         * 
         * <strong>example:</strong>
         * <p>2x 480GB SATA SSD\n4x 3.84TB NVMe SSD</p>
         */
        @NameInMap("DiskInfo")
        public String diskInfo;

        /**
         * <p>GPU information</p>
         * 
         * <strong>example:</strong>
         * <p>8x OAM 810 GPU</p>
         */
        @NameInMap("GpuInfo")
        public String gpuInfo;

        /**
         * <p>Memory information</p>
         * 
         * <strong>example:</strong>
         * <p>32x 64GB DDR4 4800 Memory</p>
         */
        @NameInMap("MemoryInfo")
        public String memoryInfo;

        /**
         * <p>Specification name</p>
         * 
         * <strong>example:</strong>
         * <p>efg2.p8en</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Network information</p>
         * 
         * <strong>example:</strong>
         * <p>1x 200Gbps Dual Port BF3 DPU for VPC\n4x 200Gbps Dual Port EIC</p>
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
         * <p>Private</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetResourceResponseBodyDataMachineType build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyDataMachineType self = new GetResourceResponseBodyDataMachineType();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyDataMachineType setBondNum(Integer bondNum) {
            this.bondNum = bondNum;
            return this;
        }
        public Integer getBondNum() {
            return this.bondNum;
        }

        public GetResourceResponseBodyDataMachineType setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public GetResourceResponseBodyDataMachineType setDiskInfo(String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public String getDiskInfo() {
            return this.diskInfo;
        }

        public GetResourceResponseBodyDataMachineType setGpuInfo(String gpuInfo) {
            this.gpuInfo = gpuInfo;
            return this;
        }
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        public GetResourceResponseBodyDataMachineType setMemoryInfo(String memoryInfo) {
            this.memoryInfo = memoryInfo;
            return this;
        }
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        public GetResourceResponseBodyDataMachineType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceResponseBodyDataMachineType setNetworkInfo(String networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public String getNetworkInfo() {
            return this.networkInfo;
        }

        public GetResourceResponseBodyDataMachineType setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public GetResourceResponseBodyDataMachineType setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public GetResourceResponseBodyDataMachineType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetResourceResponseBodyDataResourceNodes extends TeaModel {
        /**
         * <p>Node name</p>
         * 
         * <strong>example:</strong>
         * <p>lingj19q90jp66nq-mg2pa0p2l2bipnsi-17</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        public static GetResourceResponseBodyDataResourceNodes build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyDataResourceNodes self = new GetResourceResponseBodyDataResourceNodes();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyDataResourceNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetResourceResponseBodyDataUserAccessParam extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetResourceResponseBodyDataUserAccessParam build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyDataUserAccessParam self = new GetResourceResponseBodyDataUserAccessParam();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyDataUserAccessParam setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetResourceResponseBodyDataUserAccessParam setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetResourceResponseBodyDataUserAccessParam setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetResourceResponseBodyDataUserAccessParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetResourceResponseBodyData extends TeaModel {
        /**
         * <p>Cluster description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterDesc")
        public String clusterDesc;

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>3123121223</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Cluster name</p>
         * 
         * <strong>example:</strong>
         * <p>main_cluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

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
         * <p>Machine type</p>
         */
        @NameInMap("MachineType")
        public GetResourceResponseBodyDataMachineType machineType;

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
         * <p>List of resource nodes</p>
         */
        @NameInMap("ResourceNodes")
        public java.util.List<GetResourceResponseBodyDataResourceNodes> resourceNodes;

        /**
         * <p>User authorization parameters</p>
         */
        @NameInMap("UserAccessParam")
        public GetResourceResponseBodyDataUserAccessParam userAccessParam;

        public static GetResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyData self = new GetResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyData setClusterDesc(String clusterDesc) {
            this.clusterDesc = clusterDesc;
            return this;
        }
        public String getClusterDesc() {
            return this.clusterDesc;
        }

        public GetResourceResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetResourceResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetResourceResponseBodyData setCpuCoreLimit(Integer cpuCoreLimit) {
            this.cpuCoreLimit = cpuCoreLimit;
            return this;
        }
        public Integer getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

        public GetResourceResponseBodyData setGpuLimit(Integer gpuLimit) {
            this.gpuLimit = gpuLimit;
            return this;
        }
        public Integer getGpuLimit() {
            return this.gpuLimit;
        }

        public GetResourceResponseBodyData setMachineType(GetResourceResponseBodyDataMachineType machineType) {
            this.machineType = machineType;
            return this;
        }
        public GetResourceResponseBodyDataMachineType getMachineType() {
            return this.machineType;
        }

        public GetResourceResponseBodyData setMaxCpuCore(Integer maxCpuCore) {
            this.maxCpuCore = maxCpuCore;
            return this;
        }
        public Integer getMaxCpuCore() {
            return this.maxCpuCore;
        }

        public GetResourceResponseBodyData setMaxGpu(Integer maxGpu) {
            this.maxGpu = maxGpu;
            return this;
        }
        public Integer getMaxGpu() {
            return this.maxGpu;
        }

        public GetResourceResponseBodyData setMaxMemory(Long maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        public GetResourceResponseBodyData setMemoryLimit(Long memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public Long getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetResourceResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GetResourceResponseBodyData setResourceNodes(java.util.List<GetResourceResponseBodyDataResourceNodes> resourceNodes) {
            this.resourceNodes = resourceNodes;
            return this;
        }
        public java.util.List<GetResourceResponseBodyDataResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        public GetResourceResponseBodyData setUserAccessParam(GetResourceResponseBodyDataUserAccessParam userAccessParam) {
            this.userAccessParam = userAccessParam;
            return this;
        }
        public GetResourceResponseBodyDataUserAccessParam getUserAccessParam() {
            return this.userAccessParam;
        }

    }

}
