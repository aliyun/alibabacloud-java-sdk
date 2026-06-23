// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesResponseBody extends TeaModel {
    /**
     * <p>The list of node details.</p>
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
         * 
         * <strong>example:</strong>
         * <p>2025-04-16T07:28:00Z</p>
         */
        @NameInMap("creation_time")
        public String creationTime;

        /**
         * <p>The error message generated when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>error***</p>
         */
        @NameInMap("error_message")
        public String errorMessage;

        /**
         * <p>The time when the node expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31T15:59:00Z</p>
         */
        @NameInMap("expired_time")
        public String expiredTime;

        /**
         * <p>The hostname of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>iZ2vcckdmxp7u0urj2k****</p>
         */
        @NameInMap("host_name")
        public String hostName;

        /**
         * <p>The ID of the system image used by the node.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The billing method of the node. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription.</li>
         * <li><code>PostPaid</code>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2vcckdmxp7u0urj2****</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>The name of the node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-k8s-for-cs-c5cdf7e3938bc4f8eb0e44b21a80f****</p>
         */
        @NameInMap("instance_name")
        public String instanceName;

        /**
         * <p>The role type of the node. Valid values:</p>
         * <ul>
         * <li>Master: a master node of the cluster.</li>
         * <li>Worker: a worker node of the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("instance_role")
        public String instanceRole;

        /**
         * <p>The ECS status of the node. Valid values:</p>
         * <ul>
         * <li><code>Pending</code>: being created.</li>
         * <li><code>Running</code>: running.</li>
         * <li><code>Starting</code>: being started.</li>
         * <li><code>Stopping</code>: being stopped.</li>
         * <li><code>Stopped</code>: stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("instance_status")
        public String instanceStatus;

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The name of the ECS instance family to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5</p>
         */
        @NameInMap("instance_type_family")
        public String instanceTypeFamily;

        /**
         * <p>The IP addresses of the node.</p>
         */
        @NameInMap("ip_address")
        public java.util.List<String> ipAddress;

        /**
         * <p>Indicates whether the node is an Alibaba Cloud instance. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The node is an Alibaba Cloud instance.</p>
         * </li>
         * <li><p><code>false</code>: The node is not an Alibaba Cloud instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_aliyun_node")
        public Boolean isAliyunNode;

        /**
         * <p>The node name, which is the identifier of the node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu.192.168xx.xx</p>
         */
        @NameInMap("node_name")
        public String nodeName;

        /**
         * <p>Indicates whether the node is ready. Valid values:</p>
         * <ul>
         * <li><p><code>Ready</code>: The node is ready.</p>
         * </li>
         * <li><p><code>NotReady</code>: The node is not ready.</p>
         * </li>
         * <li><p><code>Unknown</code>: The node status is unknown.</p>
         * </li>
         * <li><p><code>Offline</code>: The node is offline.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("node_status")
        public String nodeStatus;

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np0794239424a84eb7a95327369d56****</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>The method used to initialize the node, such as manual creation or Resource Orchestration Service (ROS) creation.</p>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The spot instance type. Valid values:</p>
         * <ul>
         * <li>NoSpot: a non-spot instance.</li>
         * <li>SpotWithPriceLimit: a spot instance with a price limit.</li>
         * <li>SpotAsPriceGo: a spot instance priced at the market price at the time of purchase.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>The running status of the node. Valid values:</p>
         * <ul>
         * <li><p><code>pending</code>: being created.</p>
         * </li>
         * <li><p><code>running</code>: running.</p>
         * </li>
         * <li><p><code>starting</code>: being started.</p>
         * </li>
         * <li><p><code>stopping</code>: being stopped.</p>
         * </li>
         * <li><p><code>stopped</code>: stopped.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The maximum number of records that can be displayed on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
