// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterDetailsResponseBody extends TeaModel {
    /**
     * <p>The details of the master instance.</p>
     */
    @NameInMap("Cluster")
    public DescribeHubClusterDetailsResponseBodyCluster cluster;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHubClusterDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterDetailsResponseBody self = new DescribeHubClusterDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterDetailsResponseBody setCluster(DescribeHubClusterDetailsResponseBodyCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public DescribeHubClusterDetailsResponseBodyCluster getCluster() {
        return this.cluster;
    }

    public DescribeHubClusterDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHubClusterDetailsResponseBodyClusterApiServer extends TeaModel {
        /**
         * <p>The ID of the elastic IP address (EIP).</p>
         */
        @NameInMap("ApiServerEipId")
        public String apiServerEipId;

        /**
         * <p>Indicates whether the API server is accessible over the Internet. Valid values:</p>
         * <br>
         * <p>*   true: The API server is accessible over the Internet.</p>
         * <p>*   false: The API server is inaccessible over the Internet.</p>
         */
        @NameInMap("EnabledPublic")
        public Boolean enabledPublic;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static DescribeHubClusterDetailsResponseBodyClusterApiServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterApiServer self = new DescribeHubClusterDetailsResponseBodyClusterApiServer();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterApiServer setApiServerEipId(String apiServerEipId) {
            this.apiServerEipId = apiServerEipId;
            return this;
        }
        public String getApiServerEipId() {
            return this.apiServerEipId;
        }

        public DescribeHubClusterDetailsResponseBodyClusterApiServer setEnabledPublic(Boolean enabledPublic) {
            this.enabledPublic = enabledPublic;
            return this;
        }
        public Boolean getEnabledPublic() {
            return this.enabledPublic;
        }

        public DescribeHubClusterDetailsResponseBodyClusterApiServer setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfo extends TeaModel {
        /**
         * <p>The ID of the master instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The specification of the master instance. Valid value:</p>
         * <br>
         * <p>*   ack.pro.small: ACK Pro cluster</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The time when the master instance was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error message returned when the master instance failed to be created.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the master instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of the master instance.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The ID of the region in which the master instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the master instance. Valid values:</p>
         * <br>
         * <p>*   initial: The master instance is being initialized.</p>
         * <p>*   failed: The master instance failed to be created.</p>
         * <p>*   running: The master instance is running</p>
         * <p>*   inactive: The master instance is pending.</p>
         * <p>*   deleting: The master instance is being deleted.</p>
         * <p>*   delete_failed: The master instance failed to be deleted.</p>
         * <p>*   deleted: The master instance is deleted.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the master instance was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version of the master instance.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfo self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterConditions extends TeaModel {
        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the deletion condition.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the master instance that the deletion condition indicates. Valid values:</p>
         * <br>
         * <p>*   True: The master instance cannot be deleted.</p>
         * <p>*   False: The master instance can be deleted.</p>
         * <p>*   Unknow: Whether the master instance can be deleted is unknown.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of deletion condition.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeHubClusterDetailsResponseBodyClusterConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterConditions self = new DescribeHubClusterDetailsResponseBodyClusterConditions();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeHubClusterDetailsResponseBodyClusterConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeHubClusterDetailsResponseBodyClusterConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHubClusterDetailsResponseBodyClusterConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterEndpoints extends TeaModel {
        /**
         * <p>The endpoint that is used to access the API server over the internal network.</p>
         */
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        /**
         * <p>The endpoint that is used to access the API server over the Internet.</p>
         */
        @NameInMap("PublicApiServerEndpoint")
        public String publicApiServerEndpoint;

        public static DescribeHubClusterDetailsResponseBodyClusterEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterEndpoints self = new DescribeHubClusterDetailsResponseBodyClusterEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeHubClusterDetailsResponseBodyClusterEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterLogConfig extends TeaModel {
        /**
         * <p>Indicates whether the audit logging feature is enabled. Valid values:</p>
         * <br>
         * <p>*   true: Audit logging is enabled.</p>
         * <p>*   false: Audit logging is disabled.</p>
         */
        @NameInMap("EnableLog")
        public Boolean enableLog;

        /**
         * <p>The name of the project of Log Service.</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The number of days that logs are retained by Log Service.</p>
         */
        @NameInMap("LogStoreTTL")
        public String logStoreTTL;

        public static DescribeHubClusterDetailsResponseBodyClusterLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterLogConfig self = new DescribeHubClusterDetailsResponseBodyClusterLogConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterLogConfig setEnableLog(Boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }
        public Boolean getEnableLog() {
            return this.enableLog;
        }

        public DescribeHubClusterDetailsResponseBodyClusterLogConfig setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public DescribeHubClusterDetailsResponseBodyClusterLogConfig setLogStoreTTL(String logStoreTTL) {
            this.logStoreTTL = logStoreTTL;
            return this;
        }
        public String getLogStoreTTL() {
            return this.logStoreTTL;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterMeshConfig extends TeaModel {
        /**
         * <p>Indicates whether ASM is enabled. Valid values:</p>
         * <br>
         * <p>*   true: ASM is enabled.</p>
         * <p>*   false: ASM is disabled.</p>
         */
        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        /**
         * <p>service mesh (ASM) instance ID</p>
         */
        @NameInMap("MeshId")
        public String meshId;

        public static DescribeHubClusterDetailsResponseBodyClusterMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterMeshConfig self = new DescribeHubClusterDetailsResponseBodyClusterMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterMeshConfig setEnableMesh(Boolean enableMesh) {
            this.enableMesh = enableMesh;
            return this;
        }
        public Boolean getEnableMesh() {
            return this.enableMesh;
        }

        public DescribeHubClusterDetailsResponseBodyClusterMeshConfig setMeshId(String meshId) {
            this.meshId = meshId;
            return this;
        }
        public String getMeshId() {
            return this.meshId;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterNetwork extends TeaModel {
        /**
         * <p>The domain name of the master instance.</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        /**
         * <p>The IP version that is supported by the master instance. Valid values:</p>
         * <br>
         * <p>*   ipv4: IPv4.</p>
         * <p>*   ipv6: IPv6.</p>
         * <p>*   dual: IPv4 and IPv6.</p>
         */
        @NameInMap("IPStack")
        public String IPStack;

        /**
         * <p>The IDs of the associated security groups.</p>
         */
        @NameInMap("SecurityGroupIDs")
        public java.util.List<String> securityGroupIDs;

        /**
         * <p>The details of the vSwitches.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the master instance resides.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeHubClusterDetailsResponseBodyClusterNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterNetwork self = new DescribeHubClusterDetailsResponseBodyClusterNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterNetwork setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeHubClusterDetailsResponseBodyClusterNetwork setIPStack(String IPStack) {
            this.IPStack = IPStack;
            return this;
        }
        public String getIPStack() {
            return this.IPStack;
        }

        public DescribeHubClusterDetailsResponseBodyClusterNetwork setSecurityGroupIDs(java.util.List<String> securityGroupIDs) {
            this.securityGroupIDs = securityGroupIDs;
            return this;
        }
        public java.util.List<String> getSecurityGroupIDs() {
            return this.securityGroupIDs;
        }

        public DescribeHubClusterDetailsResponseBodyClusterNetwork setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public DescribeHubClusterDetailsResponseBodyClusterNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches extends TeaModel {
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches self = new DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitches")
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches> vSwitches;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits self = new DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits setVSwitches(java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig extends TeaModel {
        @NameInMap("ArgoServerEnabled")
        public Boolean argoServerEnabled;

        @NameInMap("PriceLimit")
        public String priceLimit;

        @NameInMap("WorkflowScheduleMode")
        public String workflowScheduleMode;

        @NameInMap("WorkflowUnits")
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits> workflowUnits;

        public static DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig self = new DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig setArgoServerEnabled(Boolean argoServerEnabled) {
            this.argoServerEnabled = argoServerEnabled;
            return this;
        }
        public Boolean getArgoServerEnabled() {
            return this.argoServerEnabled;
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig setWorkflowScheduleMode(String workflowScheduleMode) {
            this.workflowScheduleMode = workflowScheduleMode;
            return this;
        }
        public String getWorkflowScheduleMode() {
            return this.workflowScheduleMode;
        }

        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig setWorkflowUnits(java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits> workflowUnits) {
            this.workflowUnits = workflowUnits;
            return this;
        }
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnits> getWorkflowUnits() {
            return this.workflowUnits;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyCluster extends TeaModel {
        /**
         * <p>The details of the API server of the master instance.</p>
         */
        @NameInMap("ApiServer")
        public DescribeHubClusterDetailsResponseBodyClusterApiServer apiServer;

        /**
         * <p>The details of the master instance.</p>
         */
        @NameInMap("ClusterInfo")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo clusterInfo;

        /**
         * <p>The deletion conditions of the master instance.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterConditions> conditions;

        /**
         * <p>The endpoint of the master instance.</p>
         */
        @NameInMap("Endpoints")
        public DescribeHubClusterDetailsResponseBodyClusterEndpoints endpoints;

        /**
         * <p>The logging configuration.</p>
         */
        @NameInMap("LogConfig")
        public DescribeHubClusterDetailsResponseBodyClusterLogConfig logConfig;

        /**
         * <p>The configurations of Alibaba Cloud Service Mesh (ASM).</p>
         */
        @NameInMap("MeshConfig")
        public DescribeHubClusterDetailsResponseBodyClusterMeshConfig meshConfig;

        /**
         * <p>The network configurations of the master instance.</p>
         */
        @NameInMap("Network")
        public DescribeHubClusterDetailsResponseBodyClusterNetwork network;

        @NameInMap("WorkflowConfig")
        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig workflowConfig;

        public static DescribeHubClusterDetailsResponseBodyCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyCluster self = new DescribeHubClusterDetailsResponseBodyCluster();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyCluster setApiServer(DescribeHubClusterDetailsResponseBodyClusterApiServer apiServer) {
            this.apiServer = apiServer;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterApiServer getApiServer() {
            return this.apiServer;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setClusterInfo(DescribeHubClusterDetailsResponseBodyClusterClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setConditions(java.util.List<DescribeHubClusterDetailsResponseBodyClusterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterConditions> getConditions() {
            return this.conditions;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setEndpoints(DescribeHubClusterDetailsResponseBodyClusterEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setLogConfig(DescribeHubClusterDetailsResponseBodyClusterLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterLogConfig getLogConfig() {
            return this.logConfig;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setMeshConfig(DescribeHubClusterDetailsResponseBodyClusterMeshConfig meshConfig) {
            this.meshConfig = meshConfig;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterMeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setNetwork(DescribeHubClusterDetailsResponseBodyClusterNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterNetwork getNetwork() {
            return this.network;
        }

        public DescribeHubClusterDetailsResponseBodyCluster setWorkflowConfig(DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig workflowConfig) {
            this.workflowConfig = workflowConfig;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterWorkflowConfig getWorkflowConfig() {
            return this.workflowConfig;
        }

    }

}
