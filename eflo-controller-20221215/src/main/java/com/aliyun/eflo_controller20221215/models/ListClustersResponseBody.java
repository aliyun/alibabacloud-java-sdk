// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<ListClustersResponseBodyClusters> clusters;

    /**
     * <strong>example:</strong>
     * <p>f4f9a292c17072a2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2FE2B22C-CF9D-59DE-BF63-DC9B9B33A9D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setClusters(java.util.List<ListClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<ListClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public ListClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterDescription")
        public String clusterDescription;

        /**
         * <strong>example:</strong>
         * <p>i137590131672134915401</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>cnp_test_cluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>AckEdgPro</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Components")
        public Object components;

        @NameInMap("ComputingIpVersion")
        public String computingIpVersion;

        /**
         * <strong>example:</strong>
         * <p>1672134938</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeGroupCount")
        public Long nodeGroupCount;

        /**
         * <strong>example:</strong>
         * <p>initializing</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2ajbjoloa23q</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>i156365121663149566024</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>1672134968</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClusters self = new ListClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClusters setClusterDescription(String clusterDescription) {
            this.clusterDescription = clusterDescription;
            return this;
        }
        public String getClusterDescription() {
            return this.clusterDescription;
        }

        public ListClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClustersResponseBodyClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClustersResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClustersResponseBodyClusters setComponents(Object components) {
            this.components = components;
            return this;
        }
        public Object getComponents() {
            return this.components;
        }

        public ListClustersResponseBodyClusters setComputingIpVersion(String computingIpVersion) {
            this.computingIpVersion = computingIpVersion;
            return this;
        }
        public String getComputingIpVersion() {
            return this.computingIpVersion;
        }

        public ListClustersResponseBodyClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyClusters setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListClustersResponseBodyClusters setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public ListClustersResponseBodyClusters setNodeGroupCount(Long nodeGroupCount) {
            this.nodeGroupCount = nodeGroupCount;
            return this;
        }
        public Long getNodeGroupCount() {
            return this.nodeGroupCount;
        }

        public ListClustersResponseBodyClusters setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        public ListClustersResponseBodyClusters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListClustersResponseBodyClusters setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListClustersResponseBodyClusters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
