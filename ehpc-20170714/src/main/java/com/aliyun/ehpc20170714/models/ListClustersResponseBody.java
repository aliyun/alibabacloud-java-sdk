// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public ListClustersResponseBodyClusters clusters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setClusters(ListClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public ListClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleComputes extends TeaModel {
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        @NameInMap("NormalCount")
        public Integer normalCount;

        @NameInMap("Total")
        public Integer total;

        public static ListClustersResponseBodyClustersClusterInfoSimpleComputes build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleComputes self = new ListClustersResponseBodyClustersClusterInfoSimpleComputes();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setExceptionCount(Integer exceptionCount) {
            this.exceptionCount = exceptionCount;
            return this;
        }
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleManagers extends TeaModel {
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        @NameInMap("NormalCount")
        public Integer normalCount;

        @NameInMap("Total")
        public Integer total;

        public static ListClustersResponseBodyClustersClusterInfoSimpleManagers build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleManagers self = new ListClustersResponseBodyClustersClusterInfoSimpleManagers();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setExceptionCount(Integer exceptionCount) {
            this.exceptionCount = exceptionCount;
            return this;
        }
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleTotalResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListClustersResponseBodyClustersClusterInfoSimpleTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleTotalResources self = new ListClustersResponseBodyClustersClusterInfoSimpleTotalResources();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleUsedResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListClustersResponseBodyClustersClusterInfoSimpleUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleUsedResources self = new ListClustersResponseBodyClustersClusterInfoSimpleUsedResources();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimple extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Computes")
        public ListClustersResponseBodyClustersClusterInfoSimpleComputes computes;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LoginNodes")
        public String loginNodes;

        @NameInMap("Managers")
        public ListClustersResponseBodyClustersClusterInfoSimpleManagers managers;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalResources")
        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources totalResources;

        @NameInMap("UsedResources")
        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources usedResources;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClustersResponseBodyClustersClusterInfoSimple build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimple self = new ListClustersResponseBodyClustersClusterInfoSimple();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setComputes(ListClustersResponseBodyClustersClusterInfoSimpleComputes computes) {
            this.computes = computes;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoSimpleComputes getComputes() {
            return this.computes;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setLoginNodes(String loginNodes) {
            this.loginNodes = loginNodes;
            return this;
        }
        public String getLoginNodes() {
            return this.loginNodes;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setManagers(ListClustersResponseBodyClustersClusterInfoSimpleManagers managers) {
            this.managers = managers;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoSimpleManagers getManagers() {
            return this.managers;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setTotalResources(ListClustersResponseBodyClustersClusterInfoSimpleTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setUsedResources(ListClustersResponseBodyClustersClusterInfoSimpleUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterInfoSimple")
        public java.util.List<ListClustersResponseBodyClustersClusterInfoSimple> clusterInfoSimple;

        public static ListClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClusters self = new ListClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClusters setClusterInfoSimple(java.util.List<ListClustersResponseBodyClustersClusterInfoSimple> clusterInfoSimple) {
            this.clusterInfoSimple = clusterInfoSimple;
            return this;
        }
        public java.util.List<ListClustersResponseBodyClustersClusterInfoSimple> getClusterInfoSimple() {
            return this.clusterInfoSimple;
        }

    }

}
