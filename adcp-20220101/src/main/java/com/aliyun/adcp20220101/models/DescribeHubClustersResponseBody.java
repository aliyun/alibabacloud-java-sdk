// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersResponseBody extends TeaModel {
    /**
     * <p>The information about clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeHubClustersResponseBodyClusters> clusters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D676EFC-8C04-5CCE-A08E-BB97D24B47E8</p>
     */
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
        /**
         * <p>The elastic IP address (EIP) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-xxx</p>
         */
        @NameInMap("ApiServerEipId")
        public String apiServerEipId;

        /**
         * <p>Indicates whether the public endpoint is enabled for the API server. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnabledPublic")
        public Boolean enabledPublic;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance that is associated with the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1qyp4l6bscqxw69****</p>
         */
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

    public static class DescribeHubClustersResponseBodyClustersClusterInfoTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHubClustersResponseBodyClustersClusterInfoTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClustersResponseBodyClustersClusterInfoTags self = new DescribeHubClustersResponseBodyClustersClusterInfoTags();
            return TeaModel.build(map, self);
        }

        public DescribeHubClustersResponseBodyClustersClusterInfoTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfoTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHubClustersResponseBodyClustersClusterInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c2d3e0121ea214b438010502a8019****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The specifications of the cluster.</p>
         * <ul>
         * <li>Only ack.pro.small may be returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-05T10:25:48Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error message that is returned if the cluster failed to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>ackone-heyuan</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-qh2zgjsdv52***</p>
         */
        @NameInMap("ResourceGroupID")
        public String resourceGroupID;

        /**
         * <p>The state of the cluster. Valid values:</p>
         * <ul>
         * <li>initial: The cluster is being initialized.</li>
         * <li>failed: The cluster failed to be created.</li>
         * <li>running: The cluster is running</li>
         * <li>inactive: The cluster is not activated.</li>
         * <li>deleting: The cluster is being deleted.</li>
         * <li>delete_failed: The cluster failed to be deleted.</li>
         * <li>deleted: The cluster is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeHubClustersResponseBodyClustersClusterInfoTags> tags;

        /**
         * <p>The time when the cluster was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-02T13:39:50Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.22.3-aliyun.1</p>
         */
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

        public DescribeHubClustersResponseBodyClustersClusterInfo setResourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }
        public String getResourceGroupID() {
            return this.resourceGroupID;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeHubClustersResponseBodyClustersClusterInfo setTags(java.util.List<DescribeHubClustersResponseBodyClustersClusterInfoTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeHubClustersResponseBodyClustersClusterInfoTags> getTags() {
            return this.tags;
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
        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the deletion condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The state of the cluster that the deletion condition indicates. Valid values:</p>
         * <ul>
         * <li>True: The cluster cannot be deleted.</li>
         * <li>False: The cluster can be deleted.</li>
         * <li>Unknow: Whether the cluster can be deleted is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of deletion condition.</p>
         * 
         * <strong>example:</strong>
         * <p>DeletionProtection</p>
         */
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
        /**
         * <p>The internal endpoint of the API server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://172.16.6.**:6443">https://172.16.6.**:6443</a></p>
         */
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        /**
         * <p>The public endpoint of the API server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://123.57.21.***:6443">https://123.57.21.***:6443</a></p>
         */
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
        /**
         * <p>Indicates whether the audit logging feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLog")
        public Boolean enableLog;

        /**
         * <p>The name of the project in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-log-abc</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The number of days that logs are retained by Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
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
        /**
         * <p>Indicates whether ASM is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        /**
         * <p>The ASM instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c2d3e0121ea214b438010502a8019****</p>
         */
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
        /**
         * <p>The domain name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster.local</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        /**
         * <p>The security group IDs.</p>
         */
        @NameInMap("SecurityGroupIDs")
        public java.util.List<String> securityGroupIDs;

        /**
         * <p>The IDs of vSwitches to which the cluster belongs.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeusrwi7c2mlww4a****</p>
         */
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
        /**
         * <p>The information about the API server.</p>
         */
        @NameInMap("ApiServer")
        public DescribeHubClustersResponseBodyClustersApiServer apiServer;

        /**
         * <p>The details of the cluster.</p>
         */
        @NameInMap("ClusterInfo")
        public DescribeHubClustersResponseBodyClustersClusterInfo clusterInfo;

        /**
         * <p>The deletion conditions of the cluster.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeHubClustersResponseBodyClustersConditions> conditions;

        /**
         * <p>The endpoints of the cluster.</p>
         */
        @NameInMap("Endpoints")
        public DescribeHubClustersResponseBodyClustersEndpoints endpoints;

        /**
         * <p>The logging configurations.</p>
         */
        @NameInMap("LogConfig")
        public DescribeHubClustersResponseBodyClustersLogConfig logConfig;

        /**
         * <p>The configurations of Alibaba Cloud Service Mesh (ASM).</p>
         */
        @NameInMap("MeshConfig")
        public DescribeHubClustersResponseBodyClustersMeshConfig meshConfig;

        /**
         * <p>The network configurations of the cluster.</p>
         */
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
