// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesByQueueResponseBody extends TeaModel {
    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public ListNodesByQueueResponseBodyNodes nodes;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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
     * <p>B405FF19-2D5F-4489-A84C-BC15CC1B24BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodesByQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByQueueResponseBody self = new ListNodesByQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesByQueueResponseBody setNodes(ListNodesByQueueResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public ListNodesByQueueResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public ListNodesByQueueResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesByQueueResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesByQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesByQueueResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodesByQueueResponseBodyNodesNodeInfoTotalResources extends TeaModel {
        /**
         * <p>The number of CPU cores. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The total number of GPU cards. Unit: cards.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesByQueueResponseBodyNodesNodeInfoTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodesNodeInfoTotalResources self = new ListNodesByQueueResponseBodyNodesNodeInfoTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodesNodeInfoTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfoTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfoTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesByQueueResponseBodyNodesNodeInfoUsedResources extends TeaModel {
        /**
         * <p>The number of CPU cores. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The total number of GPU cards. Unit: cards.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesByQueueResponseBodyNodesNodeInfoUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodesNodeInfoUsedResources self = new ListNodesByQueueResponseBodyNodesNodeInfoUsedResources();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodesNodeInfoUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfoUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfoUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesByQueueResponseBodyNodesNodeInfo extends TeaModel {
        /**
         * <p>The time when the node was added to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-18T13:24:29.000Z</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The mode in which the node is created. Valid values:</p>
         * <ul>
         * <li>manual: The node is manually added.</li>
         * <li>autoscale: The node is automatically added.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("CreateMode")
        public String createMode;

        /**
         * <p>Indicates whether the node was created by using E-HPC.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        /**
         * <p>Indicates whether the subscription node has expired. If the node is a pay-as-you-go node, false is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The time when the subscription instance expires. If the node is a pay-as-you-go node, a null value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-18T13:24:29.000Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>compute0</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>Indicates whether Hyper-Threading (HT) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13p7vlcb1uihfv****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_02_64_20G_alibase_20170818****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The private IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.168.**.**</code></p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The location where the node is deployed. Valid values:</p>
         * <ul>
         * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
         * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The reason why the node is locked. Valid values:</p>
         * <ul>
         * <li>financial: The instance is locked due to overdue payments.</li>
         * <li>security: The node is locked for security reasons.</li>
         * <li>recycling: The preemptible instance is locked and pending release.</li>
         * <li>dedicatedhostfinancial: The ECS instance is locked due to overdue payments of the dedicated host.</li>
         * </ul>
         * <p>By default, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The public IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.34.**.**</code></p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The preemption policy of the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The status of the node displayed on the scheduler. The status varies with the scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("StateInSched")
        public String stateInSched;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>uninit: The node is not initialized.</li>
         * <li>init: The node is being initialized.</li>
         * <li>ready: The node is ready.</li>
         * <li>running: The cluster is running.</li>
         * <li>exception: An exception occurred on the node.</li>
         * <li>untracking: The node is not added to the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>untracking</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of all resources in the cluster.</p>
         */
        @NameInMap("TotalResources")
        public ListNodesByQueueResponseBodyNodesNodeInfoTotalResources totalResources;

        /**
         * <p>The usage of the compute nodes in the cluster. For other types of nodes, an empty value is returned.</p>
         */
        @NameInMap("UsedResources")
        public ListNodesByQueueResponseBodyNodesNodeInfoUsedResources usedResources;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e47optm9g58zcu****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The version of the E-HPC client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.64</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The VPC ID of the node.</p>
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

        public static ListNodesByQueueResponseBodyNodesNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodesNodeInfo self = new ListNodesByQueueResponseBodyNodesNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setCreatedByEhpc(Boolean createdByEhpc) {
            this.createdByEhpc = createdByEhpc;
            return this;
        }
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setStateInSched(String stateInSched) {
            this.stateInSched = stateInSched;
            return this;
        }
        public String getStateInSched() {
            return this.stateInSched;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setTotalResources(ListNodesByQueueResponseBodyNodesNodeInfoTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesByQueueResponseBodyNodesNodeInfoTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setUsedResources(ListNodesByQueueResponseBodyNodesNodeInfoUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListNodesByQueueResponseBodyNodesNodeInfoUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodesByQueueResponseBodyNodesNodeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListNodesByQueueResponseBodyNodes extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<ListNodesByQueueResponseBodyNodesNodeInfo> nodeInfo;

        public static ListNodesByQueueResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodes self = new ListNodesByQueueResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodes setNodeInfo(java.util.List<ListNodesByQueueResponseBodyNodesNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<ListNodesByQueueResponseBodyNodesNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}
