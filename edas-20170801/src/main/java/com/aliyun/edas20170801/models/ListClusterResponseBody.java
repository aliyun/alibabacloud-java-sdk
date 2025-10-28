// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterResponseBody extends TeaModel {
    /**
     * <p>The clusters.</p>
     */
    @NameInMap("ClusterList")
    public ListClusterResponseBodyClusterList clusterList;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1053-08e4-47a5-b2ab-5c0323de****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterResponseBody self = new ListClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterResponseBody setClusterList(ListClusterResponseBodyClusterList clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public ListClusterResponseBodyClusterList getClusterList() {
        return this.clusterList;
    }

    public ListClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterResponseBodyClusterListCluster extends TeaModel {
        /**
         * <p>The ID of the cluster in EDAS.</p>
         * 
         * <strong>example:</strong>
         * <p>b98b5919-c111-4dad-9f74-7233********</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>0: regular Docker cluster</li>
         * <li>1: Swarm cluster</li>
         * <li>2: Elastic Compute Service (ECS) cluster</li>
         * <li>3: self-managed Kubernetes cluster in Enterprise Distributed Application Service (EDAS)</li>
         * <li>4: cluster in which Pandora automatically registers applications</li>
         * <li>5: ACK cluster</li>
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
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of used CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuUsed")
        public Integer cpuUsed;

        /**
         * <p>The timestamp when the cluster was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1502888064561</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the cluster in Container Service for Kubernetes (ACK).</p>
         * 
         * <strong>example:</strong>
         * <p>c2ce************b9203a9</p>
         */
        @NameInMap("CsClusterId")
        public String csClusterId;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The provider of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("IaasProvider")
        public String iaasProvider;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>3072</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The size of used memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MemUsed")
        public Integer memUsed;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <ul>
         * <li>1: classic network</li>
         * <li>2: virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetworkMode")
        public Integer networkMode;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The CPU overcommit ratio that is supported by a Docker cluster. Valid values:</p>
         * <ul>
         * <li>1: 1:1, which means that CPU resources are not overcommitted.</li>
         * <li>2: 1:2, which means that CPU resources are overcommitted by 1:2.</li>
         * <li>4: 1:4, which means that CPU resources are overcommitted by 1:4.</li>
         * <li>8: 1:8, which means that CPU resources are overcommitted by 1:8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>461</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The timestamp when the cluster was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1533820823203</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-23727****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListClusterResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            ListClusterResponseBodyClusterListCluster self = new ListClusterResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public ListClusterResponseBodyClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterResponseBodyClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClusterResponseBodyClusterListCluster setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public ListClusterResponseBodyClusterListCluster setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClusterResponseBodyClusterListCluster setCpuUsed(Integer cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public Integer getCpuUsed() {
            return this.cpuUsed;
        }

        public ListClusterResponseBodyClusterListCluster setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClusterResponseBodyClusterListCluster setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public ListClusterResponseBodyClusterListCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClusterResponseBodyClusterListCluster setIaasProvider(String iaasProvider) {
            this.iaasProvider = iaasProvider;
            return this;
        }
        public String getIaasProvider() {
            return this.iaasProvider;
        }

        public ListClusterResponseBodyClusterListCluster setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListClusterResponseBodyClusterListCluster setMemUsed(Integer memUsed) {
            this.memUsed = memUsed;
            return this;
        }
        public Integer getMemUsed() {
            return this.memUsed;
        }

        public ListClusterResponseBodyClusterListCluster setNetworkMode(Integer networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        public ListClusterResponseBodyClusterListCluster setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public ListClusterResponseBodyClusterListCluster setOversoldFactor(Integer oversoldFactor) {
            this.oversoldFactor = oversoldFactor;
            return this;
        }
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        public ListClusterResponseBodyClusterListCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClusterResponseBodyClusterListCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListClusterResponseBodyClusterListCluster setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListClusterResponseBodyClusterListCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListClusterResponseBodyClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<ListClusterResponseBodyClusterListCluster> cluster;

        public static ListClusterResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterResponseBodyClusterList self = new ListClusterResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public ListClusterResponseBodyClusterList setCluster(java.util.List<ListClusterResponseBodyClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<ListClusterResponseBodyClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

}
