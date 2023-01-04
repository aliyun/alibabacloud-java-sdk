// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterDetailsResponseBody extends TeaModel {
    // The details about the master instance.
    @NameInMap("Cluster")
    public DescribeHubClusterDetailsResponseBodyCluster cluster;

    // The ID of the request.
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
        // The ID of the elastic IP address (EIP).
        @NameInMap("ApiServerEipId")
        public String apiServerEipId;

        // Indicates whether a public endpoint is used to expose the API server. Valid values: - true: a public endpoint is used to expose the API server. - false: no public endpoint is used to expose the API server.
        @NameInMap("EnabledPublic")
        public Boolean enabledPublic;

        // The ID of the Server Load Balancer (SLB) instance.
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
        // The ID of the master instance.
        @NameInMap("ClusterId")
        public String clusterId;

        // The specification of the master instance. Valid values: - ack.pro.small: ACK Pro
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        // The time when the master instance was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The error message that is returned when the system fails to create the master instance.
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // The name of the master instance.
        @NameInMap("Name")
        public String name;

        // The configurations of the master instance.
        @NameInMap("Profile")
        public String profile;

        // The ID of the region in which the master instance resides.
        @NameInMap("RegionId")
        public String regionId;

        // The status of the master instance. Valid values: - initial: The master instance is being initialized. - failed: The master instance failed to be created. - running: The master instance is running. - inactive: The master instance is inactive. - deleting: The master instance is being deleted. - delete_failed: The master instance failed to be deleted. - deleted: The master instance is deleted.
        @NameInMap("State")
        public String state;

        // The time when the master instance was updated.
        @NameInMap("UpdateTime")
        public String updateTime;

        // The Kubernetes version of the master instance.
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
        // 删除条件错误信息
        @NameInMap("Message")
        public String message;

        // 删除条件原因
        @NameInMap("Reason")
        public String reason;

        // 删除条件状态，取值
        // - True 不能删除
        // - False 允许删除
        // - Unknow 未知
        @NameInMap("Status")
        public String status;

        // 删除条件类型
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
        // The internal endpoint of the API server of the master instance.
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        // The public endpoint of the API server of the master instance.
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
        // Indicates whether audit logs are enabled. Valid values: - true: audit logs are enabled. - false: audit logs are disabled.
        @NameInMap("EnableLog")
        public Boolean enableLog;

        // The name of the Log Service project.
        @NameInMap("LogProject")
        public String logProject;

        // The retention period of the logs.
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
        // Indicates whether ASM is enabled. Valid values: - true: ASM is enabled. - false: ASM is disabled.
        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        // The ID of the ASM instance.
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
        // The domain name of the master instance.
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        // The IP version that is supported by the master instance. Valid values: - ipv4: IPv4. - ipv6: IPv6. - dual: IPv4 and IPv6.
        @NameInMap("IPStack")
        public String IPStack;

        // The ID of the associated security group.
        @NameInMap("SecurityGroupIDs")
        public java.util.List<String> securityGroupIDs;

        // A list of the vSwitches that are used by the master instance.
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        // The ID of the virtual private cloud (VPC) in which the master instance resides.
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

    public static class DescribeHubClusterDetailsResponseBodyCluster extends TeaModel {
        // Information about the API server of the master instance.
        @NameInMap("ApiServer")
        public DescribeHubClusterDetailsResponseBodyClusterApiServer apiServer;

        // The details about the master instance.
        @NameInMap("ClusterInfo")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo clusterInfo;

        // 集群删除条件信息列表
        @NameInMap("Conditions")
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterConditions> conditions;

        // The endpoint of the master instance.
        @NameInMap("Endpoints")
        public DescribeHubClusterDetailsResponseBodyClusterEndpoints endpoints;

        // The logging configuration.
        @NameInMap("LogConfig")
        public DescribeHubClusterDetailsResponseBodyClusterLogConfig logConfig;

        // The Service Mesh (ASM) configurations.
        @NameInMap("MeshConfig")
        public DescribeHubClusterDetailsResponseBodyClusterMeshConfig meshConfig;

        // The network configurations of the master instance.
        @NameInMap("Network")
        public DescribeHubClusterDetailsResponseBodyClusterNetwork network;

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

    }

}
