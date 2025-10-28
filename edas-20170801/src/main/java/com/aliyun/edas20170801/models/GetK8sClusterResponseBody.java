// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster data that is returned by page.</p>
     */
    @NameInMap("ClusterPage")
    public GetK8sClusterResponseBodyClusterPage clusterPage;

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
     * <p>C3CE915C-0C83-4AA5-8D66-E8BEED62939E</p>
     */
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
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>81453e4b-4df0-4592-<strong><strong>-b835a2ee</strong></strong></p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The import state of the cluster. Valid values:</p>
         * <ul>
         * <li>0: The cluster is not imported.</li>
         * <li>1: The cluster is imported.</li>
         * <li>2: The cluster fails to be imported.</li>
         * <li>3: The cluster is being imported.</li>
         * <li>4: The cluster is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterImportStatus")
        public Integer clusterImportStatus;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>1: The cluster runs as expected.</li>
         * <li>2: The cluster does not run as expected.</li>
         * <li>3: The cluster is offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterStatus")
        public Integer clusterStatus;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>2: Elastic Compute Service (ECS) cluster</li>
         * <li>5: ACK cluster or Serverless Kubernetes cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
         * <p>The ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2ce62869f4d4466b920312315f05****</p>
         */
        @NameInMap("CsClusterId")
        public String csClusterId;

        /**
         * <p>The state of the ACK cluster. Valid values:</p>
         * <ul>
         * <li>initial: The cluster is being initialized.</li>
         * <li>failed: The cluster fails to be created.</li>
         * <li>running: The cluster is running.</li>
         * <li>updating: The cluster is being updated.</li>
         * <li>scaling: The cluster is being scaled out.</li>
         * <li>removing: Nodes are being removed from the cluster.</li>
         * <li>upgrading: The cluster is being upgraded.</li>
         * <li>deleting: The cluster is being deleted.</li>
         * <li>delete_failed: The cluster fails to be deleted.</li>
         * <li>deleted: The cluster is deleted. The deleted cluster is invisible to users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("CsClusterStatus")
        public String csClusterStatus;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <ul>
         * <li>1: classic network</li>
         * <li>2: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetworkMode")
        public Integer networkMode;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The subtype of the cluster. Valid values:</p>
         * <ul>
         * <li>Ask: Serverless Kubernetes cluster</li>
         * <li>ManagedKubernetes: ACK cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ask</p>
         */
        @NameInMap("SubClusterType")
        public String subClusterType;

        /**
         * <p>The CIDR block of the subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        @NameInMap("SubNetCidr")
        public String subNetCidr;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-<strong>z1mlwpbjx3e9m</strong></p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1uf97<strong><strong>xjxgip</strong></strong></p>
         */
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

        public GetK8sClusterResponseBodyClusterPageClusterListCluster setSubClusterType(String subClusterType) {
            this.subClusterType = subClusterType;
            return this;
        }
        public String getSubClusterType() {
            return this.subClusterType;
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
        /**
         * <p>The list of clusters.</p>
         */
        @NameInMap("ClusterList")
        public GetK8sClusterResponseBodyClusterPageClusterList clusterList;

        /**
         * <p>The number of the returned page. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of pages that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
