// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public ListNodesResponseBodyNodes nodes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

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
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

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
        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Location")
        public String location;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Roles")
        public ListNodesResponseBodyNodesNodeInfoRoles roles;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalResources")
        public ListNodesResponseBodyNodesNodeInfoTotalResources totalResources;

        @NameInMap("UsedResources")
        public ListNodesResponseBodyNodesNodeInfoUsedResources usedResources;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

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
