// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<DescribeHubClustersResponseBodyClusters> clusters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHubClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClustersResponseBody self = new DescribeHubClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHubClustersResponseBody setClusters(java.util.List<DescribeHubClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeHubClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeHubClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHubClustersResponseBodyClustersApiServer extends TeaModel {
        @NameInMap("ApiServerEipId")
        public String apiServerEipId;

        @NameInMap("EnabledPublic")
        public Boolean enabledPublic;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static DescribeHubClustersResponseBodyClustersApiServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersApiServer self = new DescribeHubClustersResponseBodyClustersApiServer();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersApiServer setApiServerEipId(String apiServerEipId) {
            this.apiServerEipId = apiServerEipId;
            return this;
        }
        public String getApiServerEipId() {
            return this.apiServerEipId;
        }

        public DescribeHubClustersResponseBodyClustersApiServer setEnabledPublic(Boolean enabledPublic) {
            this.enabledPublic = enabledPublic;
            return this;
        }
        public Boolean getEnabledPublic() {
            return this.enabledPublic;
        }

        public DescribeHubClustersResponseBodyClustersApiServer setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersClusterInfo extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterSpec")
        public String clusterSpec;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Name")
        public String name;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Version")
        public String version;

        public static DescribeHubClustersResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersClusterInfo self = new DescribeHubClustersResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersConditions extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeHubClustersResponseBodyClustersConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersConditions self = new DescribeHubClustersResponseBodyClustersConditions();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeHubClustersResponseBodyClustersConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeHubClustersResponseBodyClustersConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHubClustersResponseBodyClustersConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersEndpoints extends TeaModel {
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        public String publicApiServerEndpoint;

        public static DescribeHubClustersResponseBodyClustersEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersEndpoints self = new DescribeHubClustersResponseBodyClustersEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersEndpoints setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
            this.intranetApiServerEndpoint = intranetApiServerEndpoint;
            return this;
        }
        public String getIntranetApiServerEndpoint() {
            return this.intranetApiServerEndpoint;
        }

        public DescribeHubClustersResponseBodyClustersEndpoints setPublicApiServerEndpoint(String publicApiServerEndpoint) {
            this.publicApiServerEndpoint = publicApiServerEndpoint;
            return this;
        }
        public String getPublicApiServerEndpoint() {
            return this.publicApiServerEndpoint;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersLogConfig extends TeaModel {
        @NameInMap("EnableLog")
        public Boolean enableLog;

        @NameInMap("LogProject")
        public String logProject;

        @NameInMap("LogStoreTTL")
        public String logStoreTTL;

        public static DescribeHubClustersResponseBodyClustersLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersLogConfig self = new DescribeHubClustersResponseBodyClustersLogConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersLogConfig setEnableLog(Boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }
        public Boolean getEnableLog() {
            return this.enableLog;
        }

        public DescribeHubClustersResponseBodyClustersLogConfig setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public DescribeHubClustersResponseBodyClustersLogConfig setLogStoreTTL(String logStoreTTL) {
            this.logStoreTTL = logStoreTTL;
            return this;
        }
        public String getLogStoreTTL() {
            return this.logStoreTTL;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersMeshConfig extends TeaModel {
        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        @NameInMap("MeshId")
        public String meshId;

        public static DescribeHubClustersResponseBodyClustersMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersMeshConfig self = new DescribeHubClustersResponseBodyClustersMeshConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersMeshConfig setEnableMesh(Boolean enableMesh) {
            this.enableMesh = enableMesh;
            return this;
        }
        public Boolean getEnableMesh() {
            return this.enableMesh;
        }

        public DescribeHubClustersResponseBodyClustersMeshConfig setMeshId(String meshId) {
            this.meshId = meshId;
            return this;
        }
        public String getMeshId() {
            return this.meshId;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersNetwork extends TeaModel {
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("SecurityGroupIDs")
        public java.util.List<String> securityGroupIDs;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeHubClustersResponseBodyClustersNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersNetwork self = new DescribeHubClustersResponseBodyClustersNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersNetwork setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeHubClustersResponseBodyClustersNetwork setSecurityGroupIDs(java.util.List<String> securityGroupIDs) {
            this.securityGroupIDs = securityGroupIDs;
            return this;
        }
        public java.util.List<String> getSecurityGroupIDs() {
            return this.securityGroupIDs;
        }

        public DescribeHubClustersResponseBodyClustersNetwork setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public DescribeHubClustersResponseBodyClustersNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeHubClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ApiServer")
        public DescribeHubClustersResponseBodyClustersApiServer apiServer;

        @NameInMap("ClusterInfo")
        public DescribeHubClustersResponseBodyClustersClusterInfo clusterInfo;

        @NameInMap("Conditions")
        public java.util.List<DescribeHubClustersResponseBodyClustersConditions> conditions;

        @NameInMap("Endpoints")
        public DescribeHubClustersResponseBodyClustersEndpoints endpoints;

        @NameInMap("LogConfig")
        public DescribeHubClustersResponseBodyClustersLogConfig logConfig;

        @NameInMap("MeshConfig")
        public DescribeHubClustersResponseBodyClustersMeshConfig meshConfig;

        @NameInMap("Network")
        public DescribeHubClustersResponseBodyClustersNetwork network;

        public static DescribeHubClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClusters self = new DescribeHubClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClusters setApiServer(DescribeHubClustersResponseBodyClustersApiServer apiServer) {
            this.apiServer = apiServer;
            return this;
        }
        public DescribeHubClustersResponseBodyClustersApiServer getApiServer() {
            return this.apiServer;
        }

        public DescribeHubClustersResponseBodyClusters setClusterInfo(DescribeHubClustersResponseBodyClustersClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public DescribeHubClustersResponseBodyClustersClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        public DescribeHubClustersResponseBodyClusters setConditions(java.util.List<DescribeHubClustersResponseBodyClustersConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeHubClustersResponseBodyClustersConditions> getConditions() {
            return this.conditions;
        }

        public DescribeHubClustersResponseBodyClusters setEndpoints(DescribeHubClustersResponseBodyClustersEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeHubClustersResponseBodyClustersEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeHubClustersResponseBodyClusters setLogConfig(DescribeHubClustersResponseBodyClustersLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public DescribeHubClustersResponseBodyClustersLogConfig getLogConfig() {
            return this.logConfig;
        }

        public DescribeHubClustersResponseBodyClusters setMeshConfig(DescribeHubClustersResponseBodyClustersMeshConfig meshConfig) {
            this.meshConfig = meshConfig;
            return this;
        }
        public DescribeHubClustersResponseBodyClustersMeshConfig getMeshConfig() {
            return this.meshConfig;
        }

        public DescribeHubClustersResponseBodyClusters setNetwork(DescribeHubClustersResponseBodyClustersNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeHubClustersResponseBodyClustersNetwork getNetwork() {
            return this.network;
        }

    }

}
