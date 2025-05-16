// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The information about the nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<ListNodesResponseBodyNodes> nodes;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setNodes(java.util.List<ListNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListNodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodesResponseBodyNodesTotalResources extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The amount of memory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesResponseBodyNodesTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesTotalResources self = new ListNodesResponseBodyNodesTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesResponseBodyNodesTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesResponseBodyNodesTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesResponseBodyNodes extends TeaModel {
        /**
         * <p>The time when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T06:22:02.000Z</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-8vbe4av4gededlqg****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The time when the node expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-09T06:22:02.000Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The hostname of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>edas.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Indicates whether hyper-threading is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        /**
         * <p>The instance ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp15707mys2rsy0j****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_20190711.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The VPC IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>Indicates whether deletion protection is enabled for the node. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepAlive")
        public Boolean keepAlive;

        /**
         * <p>The public IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The name of the queue to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>autoque3</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The bidding policy of the node. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instances of the compute node are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instances are created as preemptible instances with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The node is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The node state in the scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("StateInSched")
        public String stateInSched;

        /**
         * <p>The node state. Valid values:</p>
         * <ul>
         * <li>uninit: The node is being installed.</li>
         * <li>initing: The node is being initialized.</li>
         * <li>running: The node is running.</li>
         * <li>releasing: The node is being released.</li>
         * <li>stopped: The node is stopped.</li>
         * <li>exception: The node has run into an exception.</li>
         * <li>untracking: The node is not added to the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The hardware configurations of the node.</p>
         */
        @NameInMap("TotalResources")
        public ListNodesResponseBodyNodesTotalResources totalResources;

        /**
         * <p>The vSwitch ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e47optm9g58zcu****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1gnu8br4ay7beb2w****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodes self = new ListNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodes setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesResponseBodyNodes setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public ListNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesResponseBodyNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListNodesResponseBodyNodes setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesResponseBodyNodes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodesResponseBodyNodes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesResponseBodyNodes setKeepAlive(Boolean keepAlive) {
            this.keepAlive = keepAlive;
            return this;
        }
        public Boolean getKeepAlive() {
            return this.keepAlive;
        }

        public ListNodesResponseBodyNodes setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListNodesResponseBodyNodes setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListNodesResponseBodyNodes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesResponseBodyNodes setStateInSched(String stateInSched) {
            this.stateInSched = stateInSched;
            return this;
        }
        public String getStateInSched() {
            return this.stateInSched;
        }

        public ListNodesResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesResponseBodyNodes setTotalResources(ListNodesResponseBodyNodesTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesResponseBodyNodesTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesResponseBodyNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListNodesResponseBodyNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
