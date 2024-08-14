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
     * 
     * <strong>example:</strong>
     * <p>52C1B7DF-96C1-5214-97B6-1B0859FEAFE5</p>
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
         * 
         * <strong>example:</strong>
         * <p>eip-abc****</p>
         */
        @NameInMap("ApiServerEipId")
        public String apiServerEipId;

        /**
         * <p>Indicates whether the API server is accessible over the Internet. Valid values:</p>
         * <ul>
         * <li>true: The API server is accessible over the Internet.</li>
         * <li>false: The API server is inaccessible over the Internet.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnabledPublic")
        public Boolean enabledPublic;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp3ioqbfeq37h13rwe***</p>
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

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps extends TeaModel {
        /**
         * <p>The Internet access control list (ACL). This parameter takes effect only if PublicAccessEnabled is set to true.</p>
         */
        @NameInMap("AccessControlList")
        public java.util.List<String> accessControlList;

        /**
         * <p>Indicates whether GitOps is enabled. Valid values:</p>
         * <ul>
         * <li>true: GitOps is enabled.</li>
         * <li>false: GitOps is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether GitOps High Availability is enabled. Valid values:</p>
         * <ul>
         * <li>true:  GitOps High Availability is enabled.</li>
         * <li>false:  GitOps High Availability is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HAEnabled")
        public Boolean HAEnabled;

        /**
         * <p>Specifies whether to enable public domain name resolution in the Argo CD or Argo Workflow console. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicAccessEnabled")
        public Boolean publicAccessEnabled;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps setAccessControlList(java.util.List<String> accessControlList) {
            this.accessControlList = accessControlList;
            return this;
        }
        public java.util.List<String> getAccessControlList() {
            return this.accessControlList;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps setHAEnabled(Boolean HAEnabled) {
            this.HAEnabled = HAEnabled;
            return this;
        }
        public Boolean getHAEnabled() {
            return this.HAEnabled;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow extends TeaModel {
        /**
         * <p>The Internet access control list (ACL). This parameter takes effect only if PublicAccessEnabled is set to true.</p>
         */
        @NameInMap("AccessControlList")
        public java.util.List<String> accessControlList;

        /**
         * <p>Specifies whether to enable the argo workflow. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to enable public domain name resolution in the Argo CD or Argo Workflow console. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>Specifies whether to enable the argo workflow. UI Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServerEnabled")
        public String serverEnabled;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow setAccessControlList(java.util.List<String> accessControlList) {
            this.accessControlList = accessControlList;
            return this;
        }
        public java.util.List<String> getAccessControlList() {
            return this.accessControlList;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow setServerEnabled(String serverEnabled) {
            this.serverEnabled = serverEnabled;
            return this;
        }
        public String getServerEnabled() {
            return this.serverEnabled;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow extends TeaModel {
        /**
         * <p>The Argo workflow metadata.</p>
         */
        @NameInMap("ArgoWorkflow")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow argoWorkflow;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow setArgoWorkflow(DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow argoWorkflow) {
            this.argoWorkflow = argoWorkflow;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlowArgoWorkflow getArgoWorkflow() {
            return this.argoWorkflow;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne extends TeaModel {
        /**
         * <p>The GitOps metadata.</p>
         */
        @NameInMap("GitOps")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps gitOps;

        /**
         * <p>The workflow metadata.</p>
         */
        @NameInMap("WorkFlow")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow workFlow;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne setGitOps(DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps gitOps) {
            this.gitOps = gitOps;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneGitOps getGitOps() {
            return this.gitOps;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne setWorkFlow(DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow workFlow) {
            this.workFlow = workFlow;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOneWorkFlow getWorkFlow() {
            return this.workFlow;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData extends TeaModel {
        /**
         * <p>The cluster metadata.</p>
         */
        @NameInMap("ACKOne")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne ACKOne;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData setACKOne(DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne ACKOne) {
            this.ACKOne = ACKOne;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaDataACKOne getACKOne() {
            return this.ACKOne;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags self = new DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHubClusterDetailsResponseBodyClusterClusterInfo extends TeaModel {
        /**
         * <p>The ID of the master instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cb09fda0dc2f94a8397c76638c7ecf***</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The specification of the master instance. Valid value:</p>
         * <ul>
         * <li>ack.pro.small: ACK Pro cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The time when the master instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-23T06:22:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error message returned when the master instance failed to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The cluster metadata.</p>
         */
        @NameInMap("MetaData")
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData metaData;

        /**
         * <p>The name of the master instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ackone-heyuan</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of the master instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The ID of the region in which the master instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of Resource Group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-1w4vdvo6p51***</p>
         */
        @NameInMap("ResourceGroupID")
        public String resourceGroupID;

        /**
         * <p>The status of the master instance. Valid values:</p>
         * <ul>
         * <li>initial: The master instance is being initialized.</li>
         * <li>failed: The master instance failed to be created.</li>
         * <li>running: The master instance is running</li>
         * <li>inactive: The master instance is pending.</li>
         * <li>deleting: The master instance is being deleted.</li>
         * <li>delete_failed: The master instance failed to be deleted.</li>
         * <li>deleted: The master instance is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        @NameInMap("Tags")
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags> tags;

        /**
         * <p>The time when the master instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T02:51:35.542Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version of the master instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.22.3-aliyun.1</p>
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

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setMetaData(DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public DescribeHubClusterDetailsResponseBodyClusterClusterInfoMetaData getMetaData() {
            return this.metaData;
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

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setResourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }
        public String getResourceGroupID() {
            return this.resourceGroupID;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeHubClusterDetailsResponseBodyClusterClusterInfo setTags(java.util.List<DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterClusterInfoTags> getTags() {
            return this.tags;
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
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
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
         * <p>The status of the master instance that the deletion condition indicates. Valid values:</p>
         * <ul>
         * <li>True: The master instance cannot be deleted.</li>
         * <li>False: The master instance can be deleted.</li>
         * <li>Unknow: Whether the master instance can be deleted is unknown.</li>
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
         * 
         * <strong>example:</strong>
         * <p><a href="https://172.16.6.**:6443">https://172.16.6.**:6443</a></p>
         */
        @NameInMap("IntranetApiServerEndpoint")
        public String intranetApiServerEndpoint;

        /**
         * <p>The endpoint that is used to access the API server over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://123.57.21.***:6443">https://123.57.21.***:6443</a></p>
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
         * <ul>
         * <li>true: Audit logging is enabled.</li>
         * <li>false: Audit logging is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableLog")
        public Boolean enableLog;

        /**
         * <p>The name of the project of Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-abc</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The number of days that logs are retained by Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <ul>
         * <li>true: ASM is enabled.</li>
         * <li>false: ASM is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        /**
         * <p>service mesh (ASM) instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>cb09fda0dc2f94a8397c76638c7ecf***</p>
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
         * 
         * <strong>example:</strong>
         * <p>cluster.local</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        /**
         * <p>The IP version that is supported by the master instance. Valid values:</p>
         * <ul>
         * <li>ipv4: IPv4.</li>
         * <li>ipv6: IPv6.</li>
         * <li>dual: IPv4 and IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
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
         * 
         * <strong>example:</strong>
         * <p>vpc-f8ziib1019r9o0hdv2***</p>
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
        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9sf0hsuizl7bxnj****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent zone list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
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
        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vSwitches.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<DescribeHubClusterDetailsResponseBodyClusterWorkflowConfigWorkflowUnitsVSwitches> vSwitches;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8zukabbkv5aw7zkm****</p>
         */
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
        /**
         * <p>Specifies whether to enable the workflow instance UI. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ArgoServerEnabled")
        public Boolean argoServerEnabled;

        /**
         * <p>The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.</p>
         * 
         * <strong>example:</strong>
         * <p>0.08</p>
         */
        @NameInMap("PriceLimit")
        public String priceLimit;

        /**
         * <p>The scheduling mode of the workflow. This parameter takes effect only if Profile is set to XFlow. Valid values:</p>
         * <ul>
         * <li>cost-optimized: cost-prioritized scheduling mode.</li>
         * <li>stock-optimized: inventory-prioritized scheduling mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cost-optimized</p>
         */
        @NameInMap("WorkflowScheduleMode")
        public String workflowScheduleMode;

        /**
         * <p>The Argo workflow regions  configuration.</p>
         */
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

        /**
         * <p>The Argo workflow configuration.</p>
         */
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
