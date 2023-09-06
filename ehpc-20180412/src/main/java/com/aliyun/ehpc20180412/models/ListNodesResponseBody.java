// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public ListNodesResponseBodyNodes nodes;

    /**
     * <p>The page number returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setNodes(ListNodesResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public ListNodesResponseBodyNodes getNodes() {
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

    public static class ListNodesResponseBodyNodesNodeInfoRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<String> role;

        public static ListNodesResponseBodyNodesNodeInfoRoles build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesNodeInfoRoles self = new ListNodesResponseBodyNodesNodeInfoRoles();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesNodeInfoRoles setRole(java.util.List<String> role) {
            this.role = role;
            return this;
        }
        public java.util.List<String> getRole() {
            return this.role;
        }

    }

    public static class ListNodesResponseBodyNodesNodeInfoTotalResources extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory capacity. Unit: GB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesResponseBodyNodesNodeInfoTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesNodeInfoTotalResources self = new ListNodesResponseBodyNodesNodeInfoTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesNodeInfoTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesResponseBodyNodesNodeInfoTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesResponseBodyNodesNodeInfoTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesResponseBodyNodesNodeInfoUsedResources extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory capacity. Unit: GB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesResponseBodyNodesNodeInfoUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesNodeInfoUsedResources self = new ListNodesResponseBodyNodesNodeInfoUsedResources();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesNodeInfoUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesResponseBodyNodesNodeInfoUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesResponseBodyNodesNodeInfoUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesResponseBodyNodesNodeInfo extends TeaModel {
        /**
         * <p>The time when the node is added to the cluster.</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The mode in which the compute nodes are added. Valid values:</p>
         * <br>
         * <p>*   manual: The node is manually added.</p>
         * <p>*   autoscale: The node is automatically added.</p>
         */
        @NameInMap("CreateMode")
        public String createMode;

        /**
         * <p>Indicates whether the node is created by using E-HPC.</p>
         * <br>
         * <p>*   true: The node is created by using E-HPC.</p>
         * <p>*   false: The node is not created by using E-HPC.</p>
         */
        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        /**
         * <p>Indicates whether the subscription node expired. For a pay-as-you-go node, false is returned.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The time when the subscription node expires. For a pay-as-you-go node, a null value is returned.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The name of the task node.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>Indicates whether hyper-threading is enabled.</p>
         */
        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        /**
         * <p>The node ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the custom image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The type of the image. Valid values:</p>
         * <br>
         * <p>*   system: public image</p>
         * <p>*   self: custom image</p>
         * <p>*   others: shared image</p>
         * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The instance types of the node.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The location where the node is deployed. Valid values:</p>
         * <br>
         * <p>*   OnPremise: The node is deployed on your data center.</p>
         * <p>*   PublicCloud: The node is deployed on the public cloud.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The reason why the node is locked. Valid values:</p>
         * <br>
         * <p>*   financial: The instance is locked due to overdue payments.</p>
         * <p>*   security: The node is locked for security reasons.</p>
         * <p>*   recycling: The preemptible instance is locked and pending release.</p>
         * <p>*   dedicatedhostfinancial: The ECS instance is locked due to overdue payments of the dedicated host.</p>
         * <br>
         * <p>By default, an empty string is returned.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   Scheduler: primary scheduling node</p>
         * <p>*   SchedulerBackup: secondary scheduling node</p>
         * <p>*   Account: primary domain server node</p>
         * <p>*   AccountBackup: secondary domain server node</p>
         * <p>*   Login: logon node</p>
         * <p>*   Compute: compute node</p>
         * <br>
         * <p>Scheduling nodes and domain server nodes are management nodes.</p>
         */
        @NameInMap("Roles")
        public ListNodesResponseBodyNodesNodeInfoRoles roles;

        /**
         * <p>The bidding method of the compute nodes.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The status of the node displayed on the scheduler. The status varies with the scheduler.</p>
         */
        @NameInMap("StateInSched")
        public String stateInSched;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   uninit: The node is being installed.</p>
         * <p>*   exception: An exception occurred on the node.</p>
         * <p>*   running: The node is running.</p>
         * <p>*   initing: The node is being initialized.</p>
         * <p>*   releasing: The node is being released.</p>
         * <p>*   untracking: The node is not added to the cluster.</p>
         * <p>*   stopped: The node is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The statistics of the resources used by the node.</p>
         */
        @NameInMap("TotalResources")
        public ListNodesResponseBodyNodesNodeInfoTotalResources totalResources;

        /**
         * <p>The usage of the compute nodes in the cluster. For other types of nodes, an empty value is returned.</p>
         */
        @NameInMap("UsedResources")
        public ListNodesResponseBodyNodesNodeInfoUsedResources usedResources;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The version of the client that is used for the cluster.</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The VPC ID of the node.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListNodesResponseBodyNodesNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesNodeInfo self = new ListNodesResponseBodyNodesNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesNodeInfo setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesResponseBodyNodesNodeInfo setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public ListNodesResponseBodyNodesNodeInfo setCreatedByEhpc(Boolean createdByEhpc) {
            this.createdByEhpc = createdByEhpc;
            return this;
        }
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        public ListNodesResponseBodyNodesNodeInfo setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListNodesResponseBodyNodesNodeInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesResponseBodyNodesNodeInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesResponseBodyNodesNodeInfo setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesResponseBodyNodesNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyNodesNodeInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesResponseBodyNodesNodeInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListNodesResponseBodyNodesNodeInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodesResponseBodyNodesNodeInfo setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesResponseBodyNodesNodeInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListNodesResponseBodyNodesNodeInfo setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListNodesResponseBodyNodesNodeInfo setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListNodesResponseBodyNodesNodeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNodesResponseBodyNodesNodeInfo setRoles(ListNodesResponseBodyNodesNodeInfoRoles roles) {
            this.roles = roles;
            return this;
        }
        public ListNodesResponseBodyNodesNodeInfoRoles getRoles() {
            return this.roles;
        }

        public ListNodesResponseBodyNodesNodeInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesResponseBodyNodesNodeInfo setStateInSched(String stateInSched) {
            this.stateInSched = stateInSched;
            return this;
        }
        public String getStateInSched() {
            return this.stateInSched;
        }

        public ListNodesResponseBodyNodesNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesResponseBodyNodesNodeInfo setTotalResources(ListNodesResponseBodyNodesNodeInfoTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesResponseBodyNodesNodeInfoTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesResponseBodyNodesNodeInfo setUsedResources(ListNodesResponseBodyNodesNodeInfoUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListNodesResponseBodyNodesNodeInfoUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListNodesResponseBodyNodesNodeInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListNodesResponseBodyNodesNodeInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListNodesResponseBodyNodesNodeInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodesResponseBodyNodesNodeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListNodesResponseBodyNodes extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<ListNodesResponseBodyNodesNodeInfo> nodeInfo;

        public static ListNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodes self = new ListNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodes setNodeInfo(java.util.List<ListNodesResponseBodyNodesNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<ListNodesResponseBodyNodesNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}
