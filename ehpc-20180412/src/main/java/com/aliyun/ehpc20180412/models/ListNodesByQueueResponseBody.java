// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesByQueueResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Nodes")
    public java.util.List<ListNodesByQueueResponseBodyNodes> nodes;

    public static ListNodesByQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByQueueResponseBody self = new ListNodesByQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesByQueueResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListNodesByQueueResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesByQueueResponseBody setNodes(java.util.List<ListNodesByQueueResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodesByQueueResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public static class ListNodesByQueueResponseBodyNodesUsedResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesByQueueResponseBodyNodesUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodesUsedResources self = new ListNodesByQueueResponseBodyNodesUsedResources();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodesUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesByQueueResponseBodyNodesUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesByQueueResponseBodyNodesUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesByQueueResponseBodyNodesTotalResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesByQueueResponseBodyNodesTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodesTotalResources self = new ListNodesByQueueResponseBodyNodesTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodesTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesByQueueResponseBodyNodesTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesByQueueResponseBodyNodesTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesByQueueResponseBodyNodes extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("UsedResources")
        public ListNodesByQueueResponseBodyNodesUsedResources usedResources;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("TotalResources")
        public ListNodesByQueueResponseBodyNodesTotalResources totalResources;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public String id;

        @NameInMap("CreateMode")
        public String createMode;

        public static ListNodesByQueueResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByQueueResponseBodyNodes self = new ListNodesByQueueResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesByQueueResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesByQueueResponseBodyNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodesByQueueResponseBodyNodes setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesByQueueResponseBodyNodes setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListNodesByQueueResponseBodyNodes setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListNodesByQueueResponseBodyNodes setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesByQueueResponseBodyNodes setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListNodesByQueueResponseBodyNodes setUsedResources(ListNodesByQueueResponseBodyNodesUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListNodesByQueueResponseBodyNodesUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListNodesByQueueResponseBodyNodes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesByQueueResponseBodyNodes setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListNodesByQueueResponseBodyNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNodesByQueueResponseBodyNodes setCreatedByEhpc(Boolean createdByEhpc) {
            this.createdByEhpc = createdByEhpc;
            return this;
        }
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        public ListNodesByQueueResponseBodyNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListNodesByQueueResponseBodyNodes setTotalResources(ListNodesByQueueResponseBodyNodesTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesByQueueResponseBodyNodesTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesByQueueResponseBodyNodes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesByQueueResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesByQueueResponseBodyNodes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListNodesByQueueResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListNodesByQueueResponseBodyNodes setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesByQueueResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesByQueueResponseBodyNodes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListNodesByQueueResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesByQueueResponseBodyNodes setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

    }

}
