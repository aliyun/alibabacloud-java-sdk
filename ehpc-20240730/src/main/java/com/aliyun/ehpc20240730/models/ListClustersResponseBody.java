// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<ListClustersResponseBodyClusters> clusters;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setClusters(java.util.List<ListClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<ListClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public ListClustersResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
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

    public static class ListClustersResponseBodyClustersAdditionalPackages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gromacs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2024.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListClustersResponseBodyClustersAdditionalPackages build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersAdditionalPackages self = new ListClustersResponseBodyClustersAdditionalPackages();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersAdditionalPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyClustersAdditionalPackages setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListClustersResponseBodyClustersAddonsResourcesSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-bp1bg85d2q6laic8****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <strong>example:</strong>
         * <p>eip-bp1vi9124tbx1g3kr****</p>
         */
        @NameInMap("EipInstanceId")
        public String eipInstanceId;

        public static ListClustersResponseBodyClustersAddonsResourcesSpec build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersAddonsResourcesSpec self = new ListClustersResponseBodyClustersAddonsResourcesSpec();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersAddonsResourcesSpec setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListClustersResponseBodyClustersAddonsResourcesSpec setEipInstanceId(String eipInstanceId) {
            this.eipInstanceId = eipInstanceId;
            return this;
        }
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

    }

    public static class ListClustersResponseBodyClustersAddonsServicesSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ServiceAccessType")
        public String serviceAccessType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://47.96.xx.xx:12008">https://47.96.xx.xx:12008</a></p>
         */
        @NameInMap("ServiceAccessUrl")
        public String serviceAccessUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Web Portal</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static ListClustersResponseBodyClustersAddonsServicesSpec build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersAddonsServicesSpec self = new ListClustersResponseBodyClustersAddonsServicesSpec();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersAddonsServicesSpec setServiceAccessType(String serviceAccessType) {
            this.serviceAccessType = serviceAccessType;
            return this;
        }
        public String getServiceAccessType() {
            return this.serviceAccessType;
        }

        public ListClustersResponseBodyClustersAddonsServicesSpec setServiceAccessUrl(String serviceAccessUrl) {
            this.serviceAccessUrl = serviceAccessUrl;
            return this;
        }
        public String getServiceAccessUrl() {
            return this.serviceAccessUrl;
        }

        public ListClustersResponseBodyClustersAddonsServicesSpec setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListClustersResponseBodyClustersAddons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Login-1.0-W2g****</p>
         */
        @NameInMap("AddonId")
        public String addonId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ResourcesSpec")
        public ListClustersResponseBodyClustersAddonsResourcesSpec resourcesSpec;

        @NameInMap("ServicesSpec")
        public java.util.List<ListClustersResponseBodyClustersAddonsServicesSpec> servicesSpec;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListClustersResponseBodyClustersAddons build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersAddons self = new ListClustersResponseBodyClustersAddons();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersAddons setAddonId(String addonId) {
            this.addonId = addonId;
            return this;
        }
        public String getAddonId() {
            return this.addonId;
        }

        public ListClustersResponseBodyClustersAddons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersResponseBodyClustersAddons setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListClustersResponseBodyClustersAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyClustersAddons setResourcesSpec(ListClustersResponseBodyClustersAddonsResourcesSpec resourcesSpec) {
            this.resourcesSpec = resourcesSpec;
            return this;
        }
        public ListClustersResponseBodyClustersAddonsResourcesSpec getResourcesSpec() {
            return this.resourcesSpec;
        }

        public ListClustersResponseBodyClustersAddons setServicesSpec(java.util.List<ListClustersResponseBodyClustersAddonsServicesSpec> servicesSpec) {
            this.servicesSpec = servicesSpec;
            return this;
        }
        public java.util.List<ListClustersResponseBodyClustersAddonsServicesSpec> getServicesSpec() {
            return this.servicesSpec;
        }

        public ListClustersResponseBodyClustersAddons setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersResponseBodyClustersAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListClustersResponseBodyClustersClusterCustomConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("Script")
        public String script;

        public static ListClustersResponseBodyClustersClusterCustomConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterCustomConfiguration self = new ListClustersResponseBodyClustersClusterCustomConfiguration();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterCustomConfiguration setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public ListClustersResponseBodyClustersClusterCustomConfiguration setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class ListClustersResponseBodyClustersManagerDNS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2.31</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListClustersResponseBodyClustersManagerDNS build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersManagerDNS self = new ListClustersResponseBodyClustersManagerDNS();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersManagerDNS setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClustersResponseBodyClustersManagerDNS setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListClustersResponseBodyClustersManagerDirectoryService extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NIS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2.31</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListClustersResponseBodyClustersManagerDirectoryService build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersManagerDirectoryService self = new ListClustersResponseBodyClustersManagerDirectoryService();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersManagerDirectoryService setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClustersResponseBodyClustersManagerDirectoryService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListClustersResponseBodyClustersManagerScheduler extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SLURM</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>22.05.8</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListClustersResponseBodyClustersManagerScheduler build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersManagerScheduler self = new ListClustersResponseBodyClustersManagerScheduler();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersManagerScheduler setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClustersResponseBodyClustersManagerScheduler setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListClustersResponseBodyClustersManager extends TeaModel {
        @NameInMap("DNS")
        public ListClustersResponseBodyClustersManagerDNS DNS;

        @NameInMap("DirectoryService")
        public ListClustersResponseBodyClustersManagerDirectoryService directoryService;

        @NameInMap("Scheduler")
        public ListClustersResponseBodyClustersManagerScheduler scheduler;

        public static ListClustersResponseBodyClustersManager build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersManager self = new ListClustersResponseBodyClustersManager();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersManager setDNS(ListClustersResponseBodyClustersManagerDNS DNS) {
            this.DNS = DNS;
            return this;
        }
        public ListClustersResponseBodyClustersManagerDNS getDNS() {
            return this.DNS;
        }

        public ListClustersResponseBodyClustersManager setDirectoryService(ListClustersResponseBodyClustersManagerDirectoryService directoryService) {
            this.directoryService = directoryService;
            return this;
        }
        public ListClustersResponseBodyClustersManagerDirectoryService getDirectoryService() {
            return this.directoryService;
        }

        public ListClustersResponseBodyClustersManager setScheduler(ListClustersResponseBodyClustersManagerScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public ListClustersResponseBodyClustersManagerScheduler getScheduler() {
            return this.scheduler;
        }

    }

    public static class ListClustersResponseBodyClustersNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbnormalCounts")
        public Integer abnormalCounts;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CreatingCounts")
        public Integer creatingCounts;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningCounts")
        public Integer runningCounts;

        public static ListClustersResponseBodyClustersNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersNodes self = new ListClustersResponseBodyClustersNodes();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersNodes setAbnormalCounts(Integer abnormalCounts) {
            this.abnormalCounts = abnormalCounts;
            return this;
        }
        public Integer getAbnormalCounts() {
            return this.abnormalCounts;
        }

        public ListClustersResponseBodyClustersNodes setCreatingCounts(Integer creatingCounts) {
            this.creatingCounts = creatingCounts;
            return this;
        }
        public Integer getCreatingCounts() {
            return this.creatingCounts;
        }

        public ListClustersResponseBodyClustersNodes setRunningCounts(Integer runningCounts) {
            this.runningCounts = runningCounts;
            return this;
        }
        public Integer getRunningCounts() {
            return this.runningCounts;
        }

    }

    public static class ListClustersResponseBodyClustersUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NormalCounts")
        public Integer normalCounts;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SudoCounts")
        public Integer sudoCounts;

        public static ListClustersResponseBodyClustersUsers build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersUsers self = new ListClustersResponseBodyClustersUsers();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersUsers setNormalCounts(Integer normalCounts) {
            this.normalCounts = normalCounts;
            return this;
        }
        public Integer getNormalCounts() {
            return this.normalCounts;
        }

        public ListClustersResponseBodyClustersUsers setSudoCounts(Integer sudoCounts) {
            this.sudoCounts = sudoCounts;
            return this;
        }
        public Integer getSudoCounts() {
            return this.sudoCounts;
        }

    }

    public static class ListClustersResponseBodyClusters extends TeaModel {
        @NameInMap("AdditionalPackages")
        public java.util.List<ListClustersResponseBodyClustersAdditionalPackages> additionalPackages;

        @NameInMap("Addons")
        public java.util.List<ListClustersResponseBodyClustersAddons> addons;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("ClusterCategory")
        public String clusterCategory;

        /**
         * <strong>example:</strong>
         * <p>2024-08-06T12:43:01.000Z</p>
         */
        @NameInMap("ClusterCreateTime")
        public String clusterCreateTime;

        @NameInMap("ClusterCredentials")
        public java.util.List<String> clusterCredentials;

        @NameInMap("ClusterCustomConfiguration")
        public ListClustersResponseBodyClustersClusterCustomConfiguration clusterCustomConfiguration;

        /**
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        @NameInMap("ClusterDescription")
        public String clusterDescription;

        /**
         * <strong>example:</strong>
         * <p>ehpc-hz-VMKe******</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>Integrated</p>
         */
        @NameInMap("ClusterMode")
        public String clusterMode;

        /**
         * <strong>example:</strong>
         * <p>2024-08-06T12:43:01.000Z</p>
         */
        @NameInMap("ClusterModifyTime")
        public String clusterModifyTime;

        /**
         * <strong>example:</strong>
         * <p>slurm22.05.8-cluster-20240227</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ClusterUsedCoreTime")
        public Float clusterUsedCoreTime;

        /**
         * <strong>example:</strong>
         * <p>vsw-f8za5p0mwzgdu3wgx****</p>
         */
        @NameInMap("ClusterVSwitchId")
        public String clusterVSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-m5efjevmclc0xdmys****</p>
         */
        @NameInMap("ClusterVpcId")
        public String clusterVpcId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        @NameInMap("Manager")
        public ListClustersResponseBodyClustersManager manager;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxCoreCount")
        public Long maxCoreCount;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MaxCount")
        public Long maxCount;

        @NameInMap("Nodes")
        public ListClustersResponseBodyClustersNodes nodes;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>sg-bp13n61xsydodfyg****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Users")
        public ListClustersResponseBodyClustersUsers users;

        public static ListClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClusters self = new ListClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClusters setAdditionalPackages(java.util.List<ListClustersResponseBodyClustersAdditionalPackages> additionalPackages) {
            this.additionalPackages = additionalPackages;
            return this;
        }
        public java.util.List<ListClustersResponseBodyClustersAdditionalPackages> getAdditionalPackages() {
            return this.additionalPackages;
        }

        public ListClustersResponseBodyClusters setAddons(java.util.List<ListClustersResponseBodyClustersAddons> addons) {
            this.addons = addons;
            return this;
        }
        public java.util.List<ListClustersResponseBodyClustersAddons> getAddons() {
            return this.addons;
        }

        public ListClustersResponseBodyClusters setClusterCategory(String clusterCategory) {
            this.clusterCategory = clusterCategory;
            return this;
        }
        public String getClusterCategory() {
            return this.clusterCategory;
        }

        public ListClustersResponseBodyClusters setClusterCreateTime(String clusterCreateTime) {
            this.clusterCreateTime = clusterCreateTime;
            return this;
        }
        public String getClusterCreateTime() {
            return this.clusterCreateTime;
        }

        public ListClustersResponseBodyClusters setClusterCredentials(java.util.List<String> clusterCredentials) {
            this.clusterCredentials = clusterCredentials;
            return this;
        }
        public java.util.List<String> getClusterCredentials() {
            return this.clusterCredentials;
        }

        public ListClustersResponseBodyClusters setClusterCustomConfiguration(ListClustersResponseBodyClustersClusterCustomConfiguration clusterCustomConfiguration) {
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }
        public ListClustersResponseBodyClustersClusterCustomConfiguration getClusterCustomConfiguration() {
            return this.clusterCustomConfiguration;
        }

        public ListClustersResponseBodyClusters setClusterDescription(String clusterDescription) {
            this.clusterDescription = clusterDescription;
            return this;
        }
        public String getClusterDescription() {
            return this.clusterDescription;
        }

        public ListClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClustersResponseBodyClusters setClusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public String getClusterMode() {
            return this.clusterMode;
        }

        public ListClustersResponseBodyClusters setClusterModifyTime(String clusterModifyTime) {
            this.clusterModifyTime = clusterModifyTime;
            return this;
        }
        public String getClusterModifyTime() {
            return this.clusterModifyTime;
        }

        public ListClustersResponseBodyClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClustersResponseBodyClusters setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public ListClustersResponseBodyClusters setClusterUsedCoreTime(Float clusterUsedCoreTime) {
            this.clusterUsedCoreTime = clusterUsedCoreTime;
            return this;
        }
        public Float getClusterUsedCoreTime() {
            return this.clusterUsedCoreTime;
        }

        public ListClustersResponseBodyClusters setClusterVSwitchId(String clusterVSwitchId) {
            this.clusterVSwitchId = clusterVSwitchId;
            return this;
        }
        public String getClusterVSwitchId() {
            return this.clusterVSwitchId;
        }

        public ListClustersResponseBodyClusters setClusterVpcId(String clusterVpcId) {
            this.clusterVpcId = clusterVpcId;
            return this;
        }
        public String getClusterVpcId() {
            return this.clusterVpcId;
        }

        public ListClustersResponseBodyClusters setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ListClustersResponseBodyClusters setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListClustersResponseBodyClusters setManager(ListClustersResponseBodyClustersManager manager) {
            this.manager = manager;
            return this;
        }
        public ListClustersResponseBodyClustersManager getManager() {
            return this.manager;
        }

        public ListClustersResponseBodyClusters setMaxCoreCount(Long maxCoreCount) {
            this.maxCoreCount = maxCoreCount;
            return this;
        }
        public Long getMaxCoreCount() {
            return this.maxCoreCount;
        }

        public ListClustersResponseBodyClusters setMaxCount(Long maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Long getMaxCount() {
            return this.maxCount;
        }

        public ListClustersResponseBodyClusters setNodes(ListClustersResponseBodyClustersNodes nodes) {
            this.nodes = nodes;
            return this;
        }
        public ListClustersResponseBodyClustersNodes getNodes() {
            return this.nodes;
        }

        public ListClustersResponseBodyClusters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListClustersResponseBodyClusters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListClustersResponseBodyClusters setUsers(ListClustersResponseBodyClustersUsers users) {
            this.users = users;
            return this;
        }
        public ListClustersResponseBodyClustersUsers getUsers() {
            return this.users;
        }

    }

}
