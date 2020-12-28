// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Nodes")
    public java.util.List<ListNodesResponseBodyNodes> nodes;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListNodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesResponseBody setNodes(java.util.List<ListNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public static class ListNodesResponseBodyNodesUsedResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesResponseBodyNodesUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesUsedResources self = new ListNodesResponseBodyNodesUsedResources();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesResponseBodyNodesUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesResponseBodyNodesUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesResponseBodyNodesTotalResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("UsedResources")
        public ListNodesResponseBodyNodesUsedResources usedResources;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Version")
        public String version;

        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("Roles")
        public java.util.List<String> roles;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TotalResources")
        public ListNodesResponseBodyNodesTotalResources totalResources;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public String id;

        public static ListNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodes self = new ListNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesResponseBodyNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodesResponseBodyNodes setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListNodesResponseBodyNodes setUsedResources(ListNodesResponseBodyNodesUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListNodesResponseBodyNodesUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListNodesResponseBodyNodes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesResponseBodyNodes setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListNodesResponseBodyNodes setCreatedByEhpc(Boolean createdByEhpc) {
            this.createdByEhpc = createdByEhpc;
            return this;
        }
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        public ListNodesResponseBodyNodes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesResponseBodyNodes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListNodesResponseBodyNodes setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesResponseBodyNodes setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public ListNodesResponseBodyNodes setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesResponseBodyNodes setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListNodesResponseBodyNodes setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public ListNodesResponseBodyNodes setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListNodesResponseBodyNodes setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesResponseBodyNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public ListNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListNodesResponseBodyNodes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListNodesResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
