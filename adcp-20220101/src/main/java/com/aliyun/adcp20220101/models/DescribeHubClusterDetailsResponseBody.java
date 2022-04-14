// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterDetailsResponseBody extends TeaModel {
    @NameInMap("Cluster")
    public DescribeHubClusterDetailsResponseBodyCluster cluster;

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
        @NameInMap("EnabledPublic")
        public Boolean enabledPublic;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static DescribeHubClusterDetailsResponseBodyClusterApiServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterApiServer self = new DescribeHubClusterDetailsResponseBodyClusterApiServer();
            return TeaModel.build(map, self);
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

    public static class DescribeHubClusterDetailsResponseBodyClusterEndpoints extends TeaModel {
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

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

    public static class DescribeHubClusterDetailsResponseBodyClusterNetwork extends TeaModel {
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        @NameInMap("IPStack")
        public String IPStack;

        @NameInMap("SecurityGroupIDs")
        public java.util.List<String> securityGroupIDs;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

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
        @NameInMap("ApiServer")
        public DescribeHubClusterDetailsResponseBodyClusterApiServer apiServer;

        @NameInMap("ClusterInfo")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo clusterInfo;

        @NameInMap("Endpoints")
        public DescribeHubClusterDetailsResponseBodyClusterEndpoints endpoints;

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

        public DescribeHubClusterDetailsResponseBodyCluster setEndpoints(DescribeHubClusterDetailsResponseBodyClusterEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterEndpoints getEndpoints() {
            return this.endpoints;
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
