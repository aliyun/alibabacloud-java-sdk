// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The information about the cluster.</p>
     */
    @NameInMap("Cluster")
    public GetClusterResponseBodyCluster cluster;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The detailed information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The import status of the cluster. Valid values:</p>
         * <br>
         * <p>*   1: The cluster is imported.</p>
         * <p>*   2: The cluster fails to be imported.</p>
         * <p>*   3: The cluster is being imported.</p>
         * <p>*   4: The cluster is deleted.</p>
         * <p>*   0: The cluster is not imported.</p>
         */
        @NameInMap("ClusterImportStatus")
        public Integer clusterImportStatus;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   0: regular Docker cluster</p>
         * <p>*   1: Swarm cluster</p>
         * <p>*   2: Elastic Compute Service (ECS) cluster</p>
         * <p>*   3: self-managed Kubernetes cluster in EDAS</p>
         * <p>*   4: cluster in which Pandora automatically registers applications</p>
         * <p>*   5: ACK cluster</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The total number of CPU cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of used CPU cores.</p>
         */
        @NameInMap("CpuUsed")
        public Integer cpuUsed;

        /**
         * <p>The time when the cluster was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
         */
        @NameInMap("CsClusterId")
        public String csClusterId;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The provider of Infrastructure as a Service (IaaS) resources used in the cluster.</p>
         */
        @NameInMap("IaasProvider")
        public String iaasProvider;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The size of used memory. Unit: MB.</p>
         */
        @NameInMap("MemUsed")
        public Integer memUsed;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <br>
         * <p>*   1: classic network</p>
         * <p>*   2: virtual private cloud (VPC)</p>
         */
        @NameInMap("NetworkMode")
        public Integer networkMode;

        /**
         * <p>The number of ECS instances.</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The overcommit ratio supported by a Docker cluster. Valid values:</p>
         * <br>
         * <p>*   1: 1:1, which means that resources are not overcommitted.</p>
         * <p>*   2: 1:2, which means that resources are overcommitted by 1:2.</p>
         * <p>*   4: 1:4, which means that resources are overcommitted by 1:4.</p>
         * <p>*   8: 1:8, which means that resources are overcommitted by 1:8.</p>
         */
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        /**
         * <p>The ID of the region where the cluster resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The subtype of the Kubernetes cluster. Valid values: ManagedKubernetes, Ask, and ExternalKubernetes. ManagedKubernetes refers to the ACK cluster. Ask refers to the Serverless Kubernetes (ASK) cluster. ExternalKubernetes refers to the external cluster.</p>
         */
        @NameInMap("SubClusterType")
        public String subClusterType;

        /**
         * <p>The time when the cluster was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
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
