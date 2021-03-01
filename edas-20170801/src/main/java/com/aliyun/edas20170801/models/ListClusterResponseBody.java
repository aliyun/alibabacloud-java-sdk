// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public ListClusterResponseBodyClusterList clusterList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

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

    public ListClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListClusterResponseBodyClusterListCluster extends TeaModel {
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("MemUsed")
        public Integer memUsed;

        @NameInMap("IaasProvider")
        public String iaasProvider;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CpuUsed")
        public Integer cpuUsed;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CsClusterId")
        public String csClusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkMode")
        public Integer networkMode;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListClusterResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            ListClusterResponseBodyClusterListCluster self = new ListClusterResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public ListClusterResponseBodyClusterListCluster setOversoldFactor(Integer oversoldFactor) {
            this.oversoldFactor = oversoldFactor;
            return this;
        }
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        public ListClusterResponseBodyClusterListCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClusterResponseBodyClusterListCluster setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListClusterResponseBodyClusterListCluster setMemUsed(Integer memUsed) {
            this.memUsed = memUsed;
            return this;
        }
        public Integer getMemUsed() {
            return this.memUsed;
        }

        public ListClusterResponseBodyClusterListCluster setIaasProvider(String iaasProvider) {
            this.iaasProvider = iaasProvider;
            return this;
        }
        public String getIaasProvider() {
            return this.iaasProvider;
        }

        public ListClusterResponseBodyClusterListCluster setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClusterResponseBodyClusterListCluster setCpuUsed(Integer cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }
        public Integer getCpuUsed() {
            return this.cpuUsed;
        }

        public ListClusterResponseBodyClusterListCluster setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListClusterResponseBodyClusterListCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClusterResponseBodyClusterListCluster setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
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

        public ListClusterResponseBodyClusterListCluster setNetworkMode(Integer networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        public ListClusterResponseBodyClusterListCluster setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public ListClusterResponseBodyClusterListCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListClusterResponseBodyClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClusterResponseBodyClusterListCluster setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public ListClusterResponseBodyClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
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
