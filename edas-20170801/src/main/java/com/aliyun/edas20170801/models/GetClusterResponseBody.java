// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster information.</p>
     */
    @NameInMap("Cluster")
    public GetClusterResponseBodyCluster cluster;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The detailed message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d76db491</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setCluster(GetClusterResponseBodyCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public GetClusterResponseBodyCluster getCluster() {
        return this.cluster;
    }

    public GetClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterResponseBodyCluster extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5439271a-015b-433d-befb-d76d****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster import status. Valid values:</p>
         * <ul>
         * <li>1: Imported.</li>
         * <li>2: Import failed.</li>
         * <li>3: Importing.</li>
         * <li>4: Cluster deleted.</li>
         * <li>0: Not imported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ClusterImportStatus")
        public Integer clusterImportStatus;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterTest</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li>0: Common Docker cluster.</li>
         * <li>1: Swarm cluster.</li>
         * <li>2: ECS cluster.</li>
         * <li>3: EDAS self-managed Kubernetes cluster.</li>
         * <li>4: Pandora auto-registered application cluster.</li>
         * <li>5: Container Service Kubernetes cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The total number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of used CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuUsed")
        public Integer cpuUsed;

        /**
         * <p>The timestamp when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1570708232145</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The Container Service cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c2ce62869f4d4466b920312315f05****</p>
         */
        @NameInMap("CsClusterId")
        public String csClusterId;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IaaS resource provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("IaasProvider")
        public String iaasProvider;

        /**
         * <p>The total memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The amount of used memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MemUsed")
        public Integer memUsed;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>1: Classic network.</li>
         * <li>2: VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetworkMode")
        public Integer networkMode;

        /**
         * <p>The number of ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The CPU overselling ratio for Docker clusters. Valid values:</p>
         * <ul>
         * <li>1: 1:1 ratio. No overselling.</li>
         * <li>2: 1:2 overselling ratio.</li>
         * <li>4: 1:4 overselling ratio.</li>
         * <li>8: 1:8 overselling ratio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The subtype of the Kubernetes cluster. ManagedKubernetes indicates an ACK cluster, Ask indicates an ASK cluster, and ExternalKubernetes indicates an external cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("SubClusterType")
        public String subClusterType;

        /**
         * <p>The timestamp when the cluster was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1570708232145</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxz1mlwpb****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetClusterResponseBodyCluster build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyCluster self = new GetClusterResponseBodyCluster();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterResponseBodyCluster setClusterImportStatus(Integer clusterImportStatus) {
            this.clusterImportStatus = clusterImportStatus;
            return this;
        }
        public Integer getClusterImportStatus() {
            return this.clusterImportStatus;
        }

        public GetClusterResponseBodyCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetClusterResponseBodyCluster setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public GetClusterResponseBodyCluster setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetClusterResponseBodyCluster setCpuUsed(Integer cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public Integer getCpuUsed() {
            return this.cpuUsed;
        }

        public GetClusterResponseBodyCluster setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetClusterResponseBodyCluster setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public GetClusterResponseBodyCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClusterResponseBodyCluster setIaasProvider(String iaasProvider) {
            this.iaasProvider = iaasProvider;
            return this;
        }
        public String getIaasProvider() {
            return this.iaasProvider;
        }

        public GetClusterResponseBodyCluster setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public GetClusterResponseBodyCluster setMemUsed(Integer memUsed) {
            this.memUsed = memUsed;
            return this;
        }
        public Integer getMemUsed() {
            return this.memUsed;
        }

        public GetClusterResponseBodyCluster setNetworkMode(Integer networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        public GetClusterResponseBodyCluster setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public GetClusterResponseBodyCluster setOversoldFactor(Integer oversoldFactor) {
            this.oversoldFactor = oversoldFactor;
            return this;
        }
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        public GetClusterResponseBodyCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetClusterResponseBodyCluster setSubClusterType(String subClusterType) {
            this.subClusterType = subClusterType;
            return this;
        }
        public String getSubClusterType() {
            return this.subClusterType;
        }

        public GetClusterResponseBodyCluster setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetClusterResponseBodyCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
