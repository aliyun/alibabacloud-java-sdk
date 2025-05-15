// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>Cluster Description</p>
     * 
     * <strong>example:</strong>
     * <p>ppu集群</p>
     */
    @NameInMap("ClusterDesc")
    public String clusterDesc;

    /**
     * <p>Cluster ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-sh-fj71c0ycfw</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Cluster Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tre-1-ppu</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Machine Types</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MachineTypes")
    public CreateResourceRequestMachineTypes machineTypes;

    /**
     * <p>User Access Parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserAccessParam")
    public CreateResourceRequestUserAccessParam userAccessParam;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setClusterDesc(String clusterDesc) {
        this.clusterDesc = clusterDesc;
        return this;
    }
    public String getClusterDesc() {
        return this.clusterDesc;
    }

    public CreateResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateResourceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateResourceRequest setMachineTypes(CreateResourceRequestMachineTypes machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public CreateResourceRequestMachineTypes getMachineTypes() {
        return this.machineTypes;
    }

    public CreateResourceRequest setUserAccessParam(CreateResourceRequestUserAccessParam userAccessParam) {
        this.userAccessParam = userAccessParam;
        return this;
    }
    public CreateResourceRequestUserAccessParam getUserAccessParam() {
        return this.userAccessParam;
    }

    public static class CreateResourceRequestMachineTypes extends TeaModel {
        /**
         * <p>Number of Network Bonds</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BondNum")
        public Integer bondNum;

        /**
         * <p>CPU Information</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2x Intel Saphhire Rapid 8469C 48C CPU</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>Disk Information</p>
         * 
         * <strong>example:</strong>
         * <p>2x 480GB SATA SSD \n 4x 3.84TB NVMe SSD</p>
         */
        @NameInMap("DiskInfo")
        public String diskInfo;

        /**
         * <p>GPU Information</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
         */
        @NameInMap("GpuInfo")
        public String gpuInfo;

        /**
         * <p>Memory Information</p>
         * 
         * <strong>example:</strong>
         * <p>32x 64GB DDR4 4800 Memory</p>
         */
        @NameInMap("MemoryInfo")
        public String memoryInfo;

        /**
         * <p>Specification Name</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1n</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Network Information</p>
         * 
         * <strong>example:</strong>
         * <p>1x 200Gbps Dual Port BF3 DPU for VPC\\n4x 200Gbps Dual Port EIC</p>
         */
        @NameInMap("NetworkInfo")
        public String networkInfo;

        /**
         * <p>Network Mode</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetworkMode")
        public String networkMode;

        /**
         * <p>Number of Nodes</p>
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

        public static CreateResourceRequestMachineTypes build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRequestMachineTypes self = new CreateResourceRequestMachineTypes();
            return TeaModel.build(map, self);
        }

        public CreateResourceRequestMachineTypes setBondNum(Integer bondNum) {
            this.bondNum = bondNum;
            return this;
        }
        public Integer getBondNum() {
            return this.bondNum;
        }

        public CreateResourceRequestMachineTypes setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public CreateResourceRequestMachineTypes setDiskInfo(String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public String getDiskInfo() {
            return this.diskInfo;
        }

        public CreateResourceRequestMachineTypes setGpuInfo(String gpuInfo) {
            this.gpuInfo = gpuInfo;
            return this;
        }
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        public CreateResourceRequestMachineTypes setMemoryInfo(String memoryInfo) {
            this.memoryInfo = memoryInfo;
            return this;
        }
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        public CreateResourceRequestMachineTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateResourceRequestMachineTypes setNetworkInfo(String networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public String getNetworkInfo() {
            return this.networkInfo;
        }

        public CreateResourceRequestMachineTypes setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public CreateResourceRequestMachineTypes setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CreateResourceRequestMachineTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateResourceRequestUserAccessParam extends TeaModel {
        /**
         * <p>User ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>User Key</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>Endpoint</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>Workspace ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1245688643</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateResourceRequestUserAccessParam build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRequestUserAccessParam self = new CreateResourceRequestUserAccessParam();
            return TeaModel.build(map, self);
        }

        public CreateResourceRequestUserAccessParam setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateResourceRequestUserAccessParam setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateResourceRequestUserAccessParam setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateResourceRequestUserAccessParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
