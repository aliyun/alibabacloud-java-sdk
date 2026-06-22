// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The application configurations. The number of array elements N must be in the range of 1 to 1000.</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>The list of applications. The number of array elements N must be in the range of 1 to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Applications")
    public java.util.List<Application> applications;

    /**
     * <p>The array of bootstrap scripts. The number of array elements N must be in the range of 1 to 10.</p>
     */
    @NameInMap("BootstrapScripts")
    public java.util.List<Script> bootstrapScripts;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The results of multiple calls that use the same client token are the same. A maximum of one cluster can be created with the same client token.</p>
     * 
     * <strong>example:</strong>
     * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster name. The name must be 1 to 128 characters in length. It must start with a letter or a Chinese character. It cannot start with http\:// or https\://. It can contain letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emrtest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><p>DATALAKE: new data lake.</p>
     * </li>
     * <li><p>OLAP: data analytics.</p>
     * </li>
     * <li><p>DATAFLOW: real-time data stream.</p>
     * </li>
     * <li><p>DATASERVING: data serving.</p>
     * </li>
     * <li><p>CUSTOM: custom cluster.</p>
     * </li>
     * <li><p>HADOOP: earlier-version data lake. We recommend that you use the new data lake.</p>
     * </li>
     * </ul>
     * <p>If you create an EMR cluster for the first time after 17:00 (UTC+8) on December 19, 2022, you cannot select HADOOP, DATA_SCIENCE, PRESTO, or ZOOKEEPER as the cluster type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Specifies whether to enable deletion protection for the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: enables deletion protection.</p>
     * </li>
     * <li><p>false: disables deletion protection.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The deployment mode of applications in the cluster. Valid values:</p>
     * <ul>
     * <li><p>NORMAL (default): non-high availability (HA) deployment. The cluster has one master node.</p>
     * </li>
     * <li><p>HA: HA deployment. An HA deployment requires at least three master nodes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HA</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Emr cluster for ETL</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The node attributes. This parameter specifies the basic attributes of all Elastic Compute Service (ECS) nodes in the cluster.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>The array of node group configurations. The number of array elements N must be in the range of 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<NodeGroupConfig> nodeGroups;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p>PayAsYouGo: pay-as-you-go.</p>
     * </li>
     * <li><p>Subscription: subscription.</p>
     * </li>
     * </ul>
     * <p>Default value: PayAsYouGo.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The EMR release version. You can find the EMR release versions on the EMR cluster purchase page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR-5.16.0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Kerberos security mode of the cluster. Valid values:</p>
     * <ul>
     * <li><p>NORMAL (default): normal mode. Kerberos is disabled.</p>
     * </li>
     * <li><p>KERBEROS: Kerberos mode. Kerberos is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    /**
     * <p>The subscription configurations. This parameter is required if you set PaymentType to Subscription.</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>The tags. The number of array elements N must be in the range of 0 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public CreateClusterRequest setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public CreateClusterRequest setBootstrapScripts(java.util.List<Script> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }
    public java.util.List<Script> getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    public CreateClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterRequest setNodeAttributes(NodeAttributes nodeAttributes) {
        this.nodeAttributes = nodeAttributes;
        return this;
    }
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    public CreateClusterRequest setNodeGroups(java.util.List<NodeGroupConfig> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<NodeGroupConfig> getNodeGroups() {
        return this.nodeGroups;
    }

    public CreateClusterRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public CreateClusterRequest setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public CreateClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
