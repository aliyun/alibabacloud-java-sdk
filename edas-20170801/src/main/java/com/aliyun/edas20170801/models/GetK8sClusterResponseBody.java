// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sClusterResponseBody extends TeaModel {
    @NameInMap("ClusterPage")
    public GetK8sClusterResponseBodyClusterPage clusterPage;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetK8sClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetK8sClusterResponseBody self = new GetK8sClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetK8sClusterResponseBody setClusterPage(GetK8sClusterResponseBodyClusterPage clusterPage) {
        this.clusterPage = clusterPage;
        return this;
    }
    public GetK8sClusterResponseBodyClusterPage getClusterPage() {
        return this.clusterPage;
    }

    public GetK8sClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetK8sClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetK8sClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetK8sClusterResponseBodyClusterPageClusterListCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterImportStatus")
        public Integer clusterImportStatus;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterStatus")
        public Integer clusterStatus;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CsClusterId")
        public String csClusterId;

        @NameInMap("CsClusterStatus")
        public String csClusterStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("NetworkMode")
        public Integer networkMode;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SubNetCidr")
        public String subNetCidr;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static GetK8sClusterResponseBodyClusterPageClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            GetK8sClusterResponseBodyClusterPageClusterListCluster self = new GetK8sClusterResponseBodyClusterPageClusterListCluster();
            return TeaModel.build(map, self);
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setClusterImportStatus(Integer clusterImportStatus) {
            this.clusterImportStatus = clusterImportStatus;
            return this;
        }
        public Integer getClusterImportStatus() {
            return this.clusterImportStatus;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setClusterStatus(Integer clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public Integer getClusterStatus() {
            return this.clusterStatus;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setCsClusterStatus(String csClusterStatus) {
            this.csClusterStatus = csClusterStatus;
            return this;
        }
        public String getCsClusterStatus() {
            return this.csClusterStatus;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setNetworkMode(Integer networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setSubNetCidr(String subNetCidr) {
            this.subNetCidr = subNetCidr;
            return this;
        }
        public String getSubNetCidr() {
            return this.subNetCidr;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class GetK8sClusterResponseBodyClusterPageClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<GetK8sClusterResponseBodyClusterPageClusterListCluster> cluster;

        public static GetK8sClusterResponseBodyClusterPageClusterList build(java.util.Map<String, ?> map) throws Exception {
            GetK8sClusterResponseBodyClusterPageClusterList self = new GetK8sClusterResponseBodyClusterPageClusterList();
            return TeaModel.build(map, self);
        }

        public GetK8sClusterResponseBodyClusterPageClusterList setCluster(java.util.List<GetK8sClusterResponseBodyClusterPageClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<GetK8sClusterResponseBodyClusterPageClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

    public static class GetK8sClusterResponseBodyClusterPage extends TeaModel {
        @NameInMap("ClusterList")
        public GetK8sClusterResponseBodyClusterPageClusterList clusterList;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetK8sClusterResponseBodyClusterPage build(java.util.Map<String, ?> map) throws Exception {
            GetK8sClusterResponseBodyClusterPage self = new GetK8sClusterResponseBodyClusterPage();
            return TeaModel.build(map, self);
        }

        public GetK8sClusterResponseBodyClusterPage setClusterList(GetK8sClusterResponseBodyClusterPageClusterList clusterList) {
            this.clusterList = clusterList;
            return this;
        }
        public GetK8sClusterResponseBodyClusterPageClusterList getClusterList() {
            return this.clusterList;
        }

        public GetK8sClusterResponseBodyClusterPage setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetK8sClusterResponseBodyClusterPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetK8sClusterResponseBodyClusterPage setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
