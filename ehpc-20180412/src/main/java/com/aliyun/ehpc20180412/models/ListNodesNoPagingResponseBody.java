// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Nodes")
    public java.util.List<ListNodesNoPagingResponseBodyNodes> nodes;

    public static ListNodesNoPagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesNoPagingResponseBody self = new ListNodesNoPagingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesNoPagingResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNodesNoPagingResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesNoPagingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesNoPagingResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesNoPagingResponseBody setNodes(java.util.List<ListNodesNoPagingResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodesNoPagingResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public static class ListNodesNoPagingResponseBodyNodesUsedResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesNoPagingResponseBodyNodesUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesUsedResources self = new ListNodesNoPagingResponseBodyNodesUsedResources();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesNoPagingResponseBodyNodesUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesNoPagingResponseBodyNodesUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodesTotalResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesNoPagingResponseBodyNodesTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesTotalResources self = new ListNodesNoPagingResponseBodyNodesTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesNoPagingResponseBodyNodesTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesNoPagingResponseBodyNodesTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodes extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("Roles")
        public java.util.List<String> roles;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("UsedResources")
        public ListNodesNoPagingResponseBodyNodesUsedResources usedResources;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TotalResources")
        public ListNodesNoPagingResponseBodyNodesTotalResources totalResources;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Id")
        public String id;

        public static ListNodesNoPagingResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodes self = new ListNodesNoPagingResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesNoPagingResponseBodyNodes setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesNoPagingResponseBodyNodes setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListNodesNoPagingResponseBodyNodes setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public ListNodesNoPagingResponseBodyNodes setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListNodesNoPagingResponseBodyNodes setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListNodesNoPagingResponseBodyNodes setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesNoPagingResponseBodyNodes setUsedResources(ListNodesNoPagingResponseBodyNodesUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListNodesNoPagingResponseBodyNodesUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListNodesNoPagingResponseBodyNodes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesNoPagingResponseBodyNodes setCreatedByEhpc(Boolean createdByEhpc) {
            this.createdByEhpc = createdByEhpc;
            return this;
        }
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        public ListNodesNoPagingResponseBodyNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNodesNoPagingResponseBodyNodes setTotalResources(ListNodesNoPagingResponseBodyNodesTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesNoPagingResponseBodyNodesTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesNoPagingResponseBodyNodes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListNodesNoPagingResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesNoPagingResponseBodyNodes setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesNoPagingResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesNoPagingResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
