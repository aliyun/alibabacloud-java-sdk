// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    @NameInMap("Cluster")
    public GetClusterResponseBodyCluster cluster;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterImportStatus")
        public Integer clusterImportStatus;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CpuUsed")
        public Integer cpuUsed;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CsClusterId")
        public String csClusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("IaasProvider")
        public String iaasProvider;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("MemUsed")
        public Integer memUsed;

        @NameInMap("NetworkMode")
        public Integer networkMode;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UpdateTime")
        public Long updateTime;

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
