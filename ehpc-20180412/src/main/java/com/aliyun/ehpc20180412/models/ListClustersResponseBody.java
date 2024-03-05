// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    /**
     * <p>The list of clusters.</p>
     */
    @NameInMap("Clusters")
    public ListClustersResponseBodyClusters clusters;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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
        /**
         * <p>The number of abnormal nodes.</p>
         */
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        /**
         * <p>The number of normal nodes.</p>
         */
        @NameInMap("NormalCount")
        public Integer normalCount;

        /**
         * <p>The number of nodes that are being used in the queue. This includes those that are being initialized, installed, or released.</p>
         */
        @NameInMap("OperatingCount")
        public Integer operatingCount;

        /**
         * <p>The number of stopped nodes.</p>
         */
        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        /**
         * <p>The total number of nodes.</p>
         */
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

        public ListClustersResponseBodyClustersClusterInfoSimpleComputes setOperatingCount(Integer operatingCount) {
            this.operatingCount = operatingCount;
            return this;
        }
        public Integer getOperatingCount() {
            return this.operatingCount;
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

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleManagers extends TeaModel {
        /**
         * <p>The number of abnormal nodes.</p>
         */
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        /**
         * <p>The number of normal nodes.</p>
         */
        @NameInMap("NormalCount")
        public Integer normalCount;

        /**
         * <p>The number of nodes that are being used in the queue. This includes those that are being initialized, installed, or released.</p>
         */
        @NameInMap("OperatingCount")
        public Integer operatingCount;

        /**
         * <p>The number of stopped nodes.</p>
         */
        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        /**
         * <p>The total number of management nodes.</p>
         */
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

        public ListClustersResponseBodyClustersClusterInfoSimpleManagers setOperatingCount(Integer operatingCount) {
            this.operatingCount = operatingCount;
            return this;
        }
        public Integer getOperatingCount() {
            return this.operatingCount;
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

    }

    public static class ListClustersResponseBodyClustersClusterInfoSimpleTotalResources extends TeaModel {
        /**
         * <p>The number of CPU cores. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPU cards. Unit: cards.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory size. Unit: MiB.</p>
         */
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
        /**
         * <p>The number of CPU cores. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPU cards. Unit: cards.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory size. Unit: MiB.</p>
         */
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
        /**
         * <p>The server type of the account. Valid values:</p>
         * <br>
         * <p>*   nis</p>
         * <p>*   ldap</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The operating system tag of the base image. The tag was used only by the management node.</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The version of the client.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The maximum hourly price for the ECS instance under the compute node. The return value can be accurate to three decimal places.</p>
         */
        @NameInMap("ComputeSpotPriceLimit")
        public Float computeSpotPriceLimit;

        /**
         * <p>The bidding method of the compute nodes. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The instances of the compute node are pay-as-you-go instances.</p>
         * <p>*   SpotWithPriceLimit: The instances of the compute node are preemptible instances. These types of instances have a specified maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The instances of the compute node are preemptible instances. The price of these instances is based on the current market price.</p>
         */
        @NameInMap("ComputeSpotStrategy")
        public String computeSpotStrategy;

        /**
         * <p>The information about compute nodes.</p>
         */
        @NameInMap("Computes")
        public ListClustersResponseBodyClustersClusterInfoSimpleComputes computes;

        /**
         * <p>The number of compute nodes in the cluster.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The mode in which the cluster was deployed. Valid values:</p>
         * <br>
         * <p>*   Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</p>
         * <p>*   Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</p>
         * <p>*   Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</p>
         * <p>*   Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version of E-HPC.</p>
         */
        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        /**
         * <p>Indicates whether plug-ins were used in the cluster. Valid values:</p>
         * <br>
         * <p>*   true: Plug-ins are used.</p>
         * <p>*   false: Plug-ins are not used.</p>
         * <br>
         * <p>Default value: false</p>
         */
        @NameInMap("HasPlugin")
        public Boolean hasPlugin;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the image.</p>
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
         * <p>The billing method of the nodes in the cluster. Valid values:</p>
         * <br>
         * <p>*   PostPaid: pay-as-you-go</p>
         * <p>*   PrePaid: subscription</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance type of the compute nodes.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether a scaling group was enabled. Valid values:</p>
         * <br>
         * <p>*   true: A scaling group is enabled.</p>
         * <p>*   false: No scaling group is enabled.</p>
         */
        @NameInMap("IsComputeEss")
        public Boolean isComputeEss;

        /**
         * <p>The location where the cluster was deployed. Valid values:</p>
         * <br>
         * <p>*   OnPremise: The cluster is deployed on a hybrid cloud.</p>
         * <p>*   PublicCloud: The cluster is deployed on a public cloud.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The list of logon nodes.</p>
         */
        @NameInMap("LoginNodes")
        public String loginNodes;

        /**
         * <p>The list of management nodes.</p>
         */
        @NameInMap("Managers")
        public ListClustersResponseBodyClustersClusterInfoSimpleManagers managers;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The prefix of the node.</p>
         */
        @NameInMap("NodePrefix")
        public String nodePrefix;

        /**
         * <p>The suffix of the node.</p>
         */
        @NameInMap("NodeSuffix")
        public String nodeSuffix;

        /**
         * <p>The operating system tag of the image.</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.You can call the ListResourceGroups operation to query the IDs of resource groups.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <br>
         * <p>*   pbs</p>
         * <p>*   slurm</p>
         * <p>*   opengridscheduler</p>
         * <p>*   deadline</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   uninit: The cluster is not initialized.</p>
         * <p>*   creating: The cluster is being created.</p>
         * <p>*   init: The cluster is being initialized.</p>
         * <p>*   running: The cluster is running.</p>
         * <p>*   exception: The cluster encounters an exception.</p>
         * <p>*   releasing: The cluster is being released.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The statistics of all resources in the cluster.</p>
         */
        @NameInMap("TotalResources")
        public ListClustersResponseBodyClustersClusterInfoSimpleTotalResources totalResources;

        /**
         * <p>The number of consumed resources in the cluster.</p>
         */
        @NameInMap("UsedResources")
        public ListClustersResponseBodyClustersClusterInfoSimpleUsedResources usedResources;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         */
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

        public ListClustersResponseBodyClustersClusterInfoSimple setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }
        public Float getComputeSpotPriceLimit() {
            return this.computeSpotPriceLimit;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setComputeSpotStrategy(String computeSpotStrategy) {
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }
        public String getComputeSpotStrategy() {
            return this.computeSpotStrategy;
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

        public ListClustersResponseBodyClustersClusterInfoSimple setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setHasPlugin(Boolean hasPlugin) {
            this.hasPlugin = hasPlugin;
            return this;
        }
        public Boolean getHasPlugin() {
            return this.hasPlugin;
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

        public ListClustersResponseBodyClustersClusterInfoSimple setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setIsComputeEss(Boolean isComputeEss) {
            this.isComputeEss = isComputeEss;
            return this;
        }
        public Boolean getIsComputeEss() {
            return this.isComputeEss;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
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

        public ListClustersResponseBodyClustersClusterInfoSimple setNodePrefix(String nodePrefix) {
            this.nodePrefix = nodePrefix;
            return this;
        }
        public String getNodePrefix() {
            return this.nodePrefix;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setNodeSuffix(String nodeSuffix) {
            this.nodeSuffix = nodeSuffix;
            return this;
        }
        public String getNodeSuffix() {
            return this.nodeSuffix;
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

        public ListClustersResponseBodyClustersClusterInfoSimple setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public ListClustersResponseBodyClustersClusterInfoSimple setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClustersResponseBodyClustersClusterInfoSimple setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
