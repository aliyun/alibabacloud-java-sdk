// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public ListNodesNoPagingResponseBodyNodes nodes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodesNoPagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesNoPagingResponseBody self = new ListNodesNoPagingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesNoPagingResponseBody setNodes(ListNodesNoPagingResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public ListNodesNoPagingResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public ListNodesNoPagingResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListNodesNoPagingResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources self = new ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources self = new ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodesNodeInfo extends TeaModel {
        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("CreatedByEhpc")
        public Boolean createdByEhpc;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Role")
        public String role;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalResources")
        public ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources totalResources;

        @NameInMap("UsedResources")
        public ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources usedResources;

        public static ListNodesNoPagingResponseBodyNodesNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesNodeInfo self = new ListNodesNoPagingResponseBodyNodesNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setCreatedByEhpc(Boolean createdByEhpc) {
            this.createdByEhpc = createdByEhpc;
            return this;
        }
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setTotalResources(ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesNoPagingResponseBodyNodesNodeInfoTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setUsedResources(ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListNodesNoPagingResponseBodyNodesNodeInfoUsedResources getUsedResources() {
            return this.usedResources;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodes extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> nodeInfo;

        public static ListNodesNoPagingResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodes self = new ListNodesNoPagingResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodes setNodeInfo(java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}
