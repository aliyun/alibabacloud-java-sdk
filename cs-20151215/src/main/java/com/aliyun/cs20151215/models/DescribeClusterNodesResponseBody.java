// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesResponseBody extends TeaModel {
    /**
     * <p>The details of the nodes in the cluster.</p>
     */
    @NameInMap("nodes")
    public java.util.List<DescribeClusterNodesResponseBodyNodes> nodes;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page")
    public DescribeClusterNodesResponseBodyPage page;

    public static DescribeClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesResponseBody self = new DescribeClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesResponseBody setNodes(java.util.List<DescribeClusterNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeClusterNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeClusterNodesResponseBody setPage(DescribeClusterNodesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeClusterNodesResponseBodyPage getPage() {
        return this.page;
    }

    public static class DescribeClusterNodesResponseBodyNodes extends TeaModel {
        /**
         * <p>The time when the node was created.</p>
         */
        @NameInMap("creation_time")
        public String creationTime;

        /**
         * <p>The error message generated when the node was created.</p>
         */
        @NameInMap("error_message")
        public String errorMessage;

        /**
         * <p>The expiration date of the node.</p>
         */
        @NameInMap("expired_time")
        public String expiredTime;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("host_name")
        public String hostName;

        /**
         * <p>The ID of the system image that is used by the node.</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The billing method of the node. Valid values:</p>
         * <br>
         * <p>*   `PrePaid`: the subscription billing method. If the value is PrePaid, make sure that you have a sufficient balance or credit in your account. Otherwise, an `InvalidPayMethod` error is returned.</p>
         * <p>*   `PostPaid`: the pay-as-you-go billing method.</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>The name of the instance on which the node is deployed.</p>
         */
        @NameInMap("instance_name")
        public String instanceName;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   Master: master node</p>
         * <p>*   Worker: worker node</p>
         */
        @NameInMap("instance_role")
        public String instanceRole;

        /**
         * <p>The status of the node.</p>
         */
        @NameInMap("instance_status")
        public String instanceStatus;

        /**
         * <p>The type of the node.</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The ECS instance family of the node.</p>
         */
        @NameInMap("instance_type_family")
        public String instanceTypeFamily;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("ip_address")
        public java.util.List<String> ipAddress;

        /**
         * <p>Indicates whether the instance on which the node is deployed is provided by Alibaba Cloud. Valid values:</p>
         * <br>
         * <p>*   `true`: The instance is provided by Alibaba Cloud.</p>
         * <p>*   `false`: The instance is not provided by Alibaba Cloud.</p>
         */
        @NameInMap("is_aliyun_node")
        public Boolean isAliyunNode;

        /**
         * <p>The name of the node. This name is the identifier of the node in the cluster.</p>
         */
        @NameInMap("node_name")
        public String nodeName;

        /**
         * <p>Indicates whether the node is ready. Valid values:</p>
         * <br>
         * <p>*   `Ready`: The node is ready.</p>
         * <p>*   `NotReady`: The node is not ready.</p>
         * <p>*   `Unknown`: The status of the node is unknown.</p>
         * <p>*   `Offline`: The node is offline.</p>
         */
        @NameInMap("node_status")
        public String nodeStatus;

        /**
         * <p>The node pool ID.</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>Indicates how the node is initialized. A node can be manually created or created by using Resource Orchestration Service (ROS).</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The type of preemptible instance. Valid values:</p>
         * <br>
         * <p>*   NoSpot: a non-preemptible instance.</p>
         * <p>*   SpotWithPriceLimit: a preemptible instance that is configured with the highest bid price.</p>
         * <p>*   SpotAsPriceGo: a preemptible instance for which the system automatically bids based on the current market price.</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   `pending`: The node is being created.</p>
         * <p>*   `running`: The node is running.</p>
         * <p>*   `starting`: The node is being started.</p>
         * <p>*   `stopping`: The node is being stopped.</p>
         * <p>*   `stopped`: The node is stopped.</p>
         */
        @NameInMap("state")
        public String state;

        public static DescribeClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodesResponseBodyNodes self = new DescribeClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodesResponseBodyNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeClusterNodesResponseBodyNodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeClusterNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeClusterNodesResponseBodyNodes setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeClusterNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterNodesResponseBodyNodes setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeClusterNodesResponseBodyNodes setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public DescribeClusterNodesResponseBodyNodes setIsAliyunNode(Boolean isAliyunNode) {
            this.isAliyunNode = isAliyunNode;
            return this;
        }
        public Boolean getIsAliyunNode() {
            return this.isAliyunNode;
        }

        public DescribeClusterNodesResponseBodyNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeClusterNodesResponseBodyNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeClusterNodesResponseBodyNodes setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterNodesResponseBodyNodes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeClusterNodesResponseBodyNodes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeClusterNodesResponseBodyNodes setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeClusterNodesResponseBodyPage extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        public static DescribeClusterNodesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodesResponseBodyPage self = new DescribeClusterNodesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClusterNodesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeClusterNodesResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
