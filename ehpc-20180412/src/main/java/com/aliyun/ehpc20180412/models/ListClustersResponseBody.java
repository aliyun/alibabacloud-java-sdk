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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        /**
         * <p>The number of normal nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NormalCount")
        public Integer normalCount;

        /**
         * <p>The number of nodes that are being used in the queue. This includes those that are being initialized, installed, or released.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperatingCount")
        public Integer operatingCount;

        /**
         * <p>The number of stopped nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        /**
         * <p>The total number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExceptionCount")
        public Integer exceptionCount;

        /**
         * <p>The number of normal nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NormalCount")
        public Integer normalCount;

        /**
         * <p>The number of nodes that are being used in the queue. This includes those that are being initialized, installed, or released.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperatingCount")
        public Integer operatingCount;

        /**
         * <p>The number of stopped nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StoppedCount")
        public Integer stoppedCount;

        /**
         * <p>The total number of management nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPU cards. Unit: cards.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of GPU cards. Unit: cards.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
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
         * <ul>
         * <li>nis</li>
         * <li>ldap</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The operating system tag of the base image. The tag was used only by the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The version of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.64</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The maximum hourly price for the ECS instance under the compute node. The return value can be accurate to three decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.034</p>
         */
        @NameInMap("ComputeSpotPriceLimit")
        public Float computeSpotPriceLimit;

        /**
         * <p>The bidding method of the compute nodes. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instances of the compute node are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instances of the compute node are preemptible instances. These types of instances have a specified maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instances of the compute node are preemptible instances. The price of these instances is based on the current market price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-30T07:39:20.000Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The mode in which the cluster was deployed. Valid values:</p>
         * <ul>
         * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</li>
         * <li>Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterdescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version of E-HPC.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        /**
         * <p>Indicates whether plug-ins were used in the cluster. Valid values:</p>
         * <ul>
         * <li>true: Plug-ins are used.</li>
         * <li>false: Plug-ins are not used.</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasPlugin")
        public Boolean hasPlugin;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_1607_x64_dtc_zh_40G_alibase****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The billing method of the nodes in the cluster. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance type of the compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether a scaling group was enabled. Valid values:</p>
         * <ul>
         * <li>true: A scaling group is enabled.</li>
         * <li>false: No scaling group is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsComputeEss")
        public Boolean isComputeEss;

        /**
         * <p>The location where the cluster was deployed. Valid values:</p>
         * <ul>
         * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
         * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The list of logon nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Id&quot;: &quot;i-bp13x4is8pvdhws7e****&quot;}</p>
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
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The prefix of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NodePrefix")
        public String nodePrefix;

        /**
         * <p>The suffix of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("NodeSuffix")
        public String nodeSuffix;

        /**
         * <p>The operating system tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.You can call the ListResourceGroups operation to query the IDs of resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <ul>
         * <li>pbs</li>
         * <li>slurm</li>
         * <li>opengridscheduler</li>
         * <li>deadline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pbs</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>uninit: The cluster is not initialized.</li>
         * <li>creating: The cluster is being created.</li>
         * <li>init: The cluster is being initialized.</li>
         * <li>running: The cluster is running.</li>
         * <li>exception: The cluster encounters an exception.</li>
         * <li>releasing: The cluster is being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
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
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1lfcjbfb099rrjn****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-b3f3edefefeep0760yju****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
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
