// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Clusters")
    public java.util.List<ListClustersResponseBodyClusters> clusters;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListClustersResponseBody setClusters(java.util.List<ListClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<ListClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public static class ListClustersResponseBodyClustersUsedResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListClustersResponseBodyClustersUsedResources build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersUsedResources self = new ListClustersResponseBodyClustersUsedResources();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersUsedResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClustersResponseBodyClustersUsedResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListClustersResponseBodyClustersUsedResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListClustersResponseBodyClustersManagers extends TeaModel {
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        @NameInMap("NormalCount")
        public Integer normalCount;

        @NameInMap("OperatingCount")
        public Integer operatingCount;

        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        @NameInMap("Total")
        public Integer total;

        public static ListClustersResponseBodyClustersManagers build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersManagers self = new ListClustersResponseBodyClustersManagers();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersManagers setExceptionCount(Integer exceptionCount) {
            this.exceptionCount = exceptionCount;
            return this;
        }
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        public ListClustersResponseBodyClustersManagers setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public ListClustersResponseBodyClustersManagers setOperatingCount(Integer operatingCount) {
            this.operatingCount = operatingCount;
            return this;
        }
        public Integer getOperatingCount() {
            return this.operatingCount;
        }

        public ListClustersResponseBodyClustersManagers setStoppedCount(Integer stoppedCount) {
            this.stoppedCount = stoppedCount;
            return this;
        }
        public Integer getStoppedCount() {
            return this.stoppedCount;
        }

        public ListClustersResponseBodyClustersManagers setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListClustersResponseBodyClustersTotalResources extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Integer memory;

        public static ListClustersResponseBodyClustersTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersTotalResources self = new ListClustersResponseBodyClustersTotalResources();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClustersResponseBodyClustersTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListClustersResponseBodyClustersTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListClustersResponseBodyClustersComputes extends TeaModel {
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        @NameInMap("NormalCount")
        public Integer normalCount;

        @NameInMap("OperatingCount")
        public Integer operatingCount;

        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        @NameInMap("Total")
        public Integer total;

        public static ListClustersResponseBodyClustersComputes build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersComputes self = new ListClustersResponseBodyClustersComputes();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersComputes setExceptionCount(Integer exceptionCount) {
            this.exceptionCount = exceptionCount;
            return this;
        }
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        public ListClustersResponseBodyClustersComputes setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public ListClustersResponseBodyClustersComputes setOperatingCount(Integer operatingCount) {
            this.operatingCount = operatingCount;
            return this;
        }
        public Integer getOperatingCount() {
            return this.operatingCount;
        }

        public ListClustersResponseBodyClustersComputes setStoppedCount(Integer stoppedCount) {
            this.stoppedCount = stoppedCount;
            return this;
        }
        public Integer getStoppedCount() {
            return this.stoppedCount;
        }

        public ListClustersResponseBodyClustersComputes setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListClustersResponseBodyClusters extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UsedResources")
        public ListClustersResponseBodyClustersUsedResources usedResources;

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

        @NameInMap("NodeSuffix")
        public String nodeSuffix;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("NodePrefix")
        public String nodePrefix;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Managers")
        public ListClustersResponseBodyClustersManagers managers;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("TotalResources")
        public ListClustersResponseBodyClustersTotalResources totalResources;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Computes")
        public ListClustersResponseBodyClustersComputes computes;

        @NameInMap("LoginNodes")
        public String loginNodes;

        @NameInMap("Id")
        public String id;

        @NameInMap("Location")
        public String location;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static ListClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClusters self = new ListClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClustersResponseBodyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersResponseBodyClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyClusters setUsedResources(ListClustersResponseBodyClustersUsedResources usedResources) {
            this.usedResources = usedResources;
            return this;
        }
        public ListClustersResponseBodyClustersUsedResources getUsedResources() {
            return this.usedResources;
        }

        public ListClustersResponseBodyClusters setComputeSpotStrategy(String computeSpotStrategy) {
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }
        public String getComputeSpotStrategy() {
            return this.computeSpotStrategy;
        }

        public ListClustersResponseBodyClusters setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClustersResponseBodyClusters setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClustersResponseBodyClusters setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListClustersResponseBodyClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersResponseBodyClusters setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListClustersResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyClusters setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListClustersResponseBodyClusters setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }
        public Float getComputeSpotPriceLimit() {
            return this.computeSpotPriceLimit;
        }

        public ListClustersResponseBodyClusters setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListClustersResponseBodyClusters setNodeSuffix(String nodeSuffix) {
            this.nodeSuffix = nodeSuffix;
            return this;
        }
        public String getNodeSuffix() {
            return this.nodeSuffix;
        }

        public ListClustersResponseBodyClusters setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListClustersResponseBodyClusters setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public ListClustersResponseBodyClusters setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListClustersResponseBodyClusters setNodePrefix(String nodePrefix) {
            this.nodePrefix = nodePrefix;
            return this;
        }
        public String getNodePrefix() {
            return this.nodePrefix;
        }

        public ListClustersResponseBodyClusters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClustersResponseBodyClusters setManagers(ListClustersResponseBodyClustersManagers managers) {
            this.managers = managers;
            return this;
        }
        public ListClustersResponseBodyClustersManagers getManagers() {
            return this.managers;
        }

        public ListClustersResponseBodyClusters setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListClustersResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClustersResponseBodyClusters setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClustersResponseBodyClusters setTotalResources(ListClustersResponseBodyClustersTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListClustersResponseBodyClustersTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListClustersResponseBodyClusters setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListClustersResponseBodyClusters setComputes(ListClustersResponseBodyClustersComputes computes) {
            this.computes = computes;
            return this;
        }
        public ListClustersResponseBodyClustersComputes getComputes() {
            return this.computes;
        }

        public ListClustersResponseBodyClusters setLoginNodes(String loginNodes) {
            this.loginNodes = loginNodes;
            return this;
        }
        public String getLoginNodes() {
            return this.loginNodes;
        }

        public ListClustersResponseBodyClusters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersResponseBodyClusters setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListClustersResponseBodyClusters setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

}
