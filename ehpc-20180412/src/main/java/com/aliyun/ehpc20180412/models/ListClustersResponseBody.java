// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Clusters")
    public ListClustersResponseBodyClusters clusters;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
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

    public ListClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClustersResponseBody setClusters(ListClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleManagers extends TeaModel {
        @NameInMap("OperatingCount")
        public Integer operatingCount;

        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("NormalCount")
        public Integer normalCount;

        public static ListClustersResponseBodyClustersClusterInfoSimpleManagers build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleManagers self = new ListClustersResponseBodyClustersClusterInfoSimpleManagers();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setOperatingCount(Integer operatingCount) {
            this.operatingCount = operatingCount;
            return this;
        }
        public Integer getOperatingCount() {
            return this.operatingCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setExceptionCount(Integer exceptionCount) {
            this.exceptionCount = exceptionCount;
            return this;
        }
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setStoppedCount(Integer stoppedCount) {
            this.stoppedCount = stoppedCount;
            return this;
        }
        public Integer getStoppedCount() {
            return this.stoppedCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleComputes extends TeaModel {
        @NameInMap("OperatingCount")
        public Integer operatingCount;

        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("NormalCount")
        public Integer normalCount;

        public static ListClustersResponseBodyClustersClusterInfoSimpleComputes build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleComputes self = new ListClustersResponseBodyClustersClusterInfoSimpleComputes();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setOperatingCount(Integer operatingCount) {
            this.operatingCount = operatingCount;
            return this;
        }
        public Integer getOperatingCount() {
            return this.operatingCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setExceptionCount(Integer exceptionCount) {
            this.exceptionCount = exceptionCount;
            return this;
        }
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setStoppedCount(Integer stoppedCount) {
            this.stoppedCount = stoppedCount;
            return this;
        }
        public Integer getStoppedCount() {
            return this.stoppedCount;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleTotalResources extends TeaModel {
        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListClustersResponseBodyClustersClusterInfoSimpleTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleTotalResources self = new ListClustersResponseBodyClustersClusterInfoSimpleTotalResources();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
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
        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListClustersResponseBodyClustersClusterInfoSimpleUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimpleUsedResources self = new ListClustersResponseBodyClustersClusterInfoSimpleUsedResources();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
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
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IsComputeEss")
        public Boolean isComputeEss;

        @NameInMap("ComputeSpotStrategy")
        public String computeSpotStrategy;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ComputeSpotPriceLimit")
        public Float computeSpotPriceLimit;

        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("NodeSuffix")
        public String nodeSuffix;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("NodePrefix")
        public String nodePrefix;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("LoginNodes")
        public String loginNodes;

        @NameInMap("Id")
        public String id;

        @NameInMap("Location")
        public String location;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("Managers")
        public ListClustersResponseBodyClustersClusterInfoSimpleManagers managers;

        @NameInMap("Computes")
        public ListClustersResponseBodyClustersClusterInfoSimpleComputes computes;

        @NameInMap("TotalResources")
        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources totalResources;

        @NameInMap("UsedResources")
        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources usedResources;

        public static ListClustersResponseBodyClustersClusterInfoSimple build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoSimple self = new ListClustersResponseBodyClustersClusterInfoSimple();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setIsComputeEss(Boolean isComputeEss) {
            this.isComputeEss = isComputeEss;
            return this;
        }
        public Boolean getIsComputeEss() {
            return this.isComputeEss;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setComputeSpotStrategy(String computeSpotStrategy) {
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }
        public String getComputeSpotStrategy() {
            return this.computeSpotStrategy;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }
        public Float getComputeSpotPriceLimit() {
            return this.computeSpotPriceLimit;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setNodeSuffix(String nodeSuffix) {
            this.nodeSuffix = nodeSuffix;
            return this;
        }
        public String getNodeSuffix() {
            return this.nodeSuffix;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setNodePrefix(String nodePrefix) {
            this.nodePrefix = nodePrefix;
            return this;
        }
        public String getNodePrefix() {
            return this.nodePrefix;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setLoginNodes(String loginNodes) {
            this.loginNodes = loginNodes;
            return this;
        }
        public String getLoginNodes() {
            return this.loginNodes;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setManagers(ListClustersResponseBodyClustersClusterInfoSimpleManagers managers) {
            this.managers = managers;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoSimpleManagers getManagers() {
            return this.managers;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setComputes(ListClustersResponseBodyClustersClusterInfoSimpleComputes computes) {
            this.computes = computes;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoSimpleComputes getComputes() {
            return this.computes;
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
