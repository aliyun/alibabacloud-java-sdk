// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunClusterRequest extends TeaModel {
    /**
     * <p>The application configurations. The number of array elements N can range from 1 to 1000.</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>The list of applications. The number of array elements N can range from 1 to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Applications")
    public java.util.List<Application> applications;

    /**
     * <p>The array of bootstrap scripts. The number of array elements N can range from 1 to 10.</p>
     */
    @NameInMap("BootstrapScripts")
    public java.util.List<Script> bootstrapScripts;

    /**
     * <p>A client token to ensure the idempotence of the request. Multiple calls with the same client token return the same result and create only one cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster name. The name must be 1 to 128 characters in length. It must start with a letter or a Chinese character. It cannot start with http\:// or https\://. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), or hyphens (-).</p>
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
     * <li><p>DATASERVING: DataService Studio.</p>
     * </li>
     * <li><p>CUSTOM: custom cluster.</p>
     * </li>
     * <li><p>HADOOP: legacy data lake. This value is not recommended. Use the new data lake cluster type instead.</p>
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
     * <li><p>true: Enables deletion protection.</p>
     * </li>
     * <li><p>false: Disables deletion protection.</p>
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
     * <li><p>NORMAL (default): non-high availability deployment. The cluster has one master node.</p>
     * </li>
     * <li><p>HA: high availability (HA) deployment. This deployment mode requires at least three master nodes.</p>
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
     * <p>The node attributes. These are the basic attributes of all ECS nodes in the cluster.</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>The array of node group configurations. The number of array elements N can range from 1 to 100.</p>
     * <p>This parameter is required.</p>
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

    @NameInMap("Promotions")
    public java.util.List<Promotion> promotions;

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
     * <p>The EMR release version. You can find the EMR release version on the EMR cluster purchase page.</p>
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
     * <p>The tags. The number of array elements N can range from 0 to 20.</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static RunClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterRequest self = new RunClusterRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterRequest setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public RunClusterRequest setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public RunClusterRequest setBootstrapScripts(java.util.List<Script> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }
    public java.util.List<Script> getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    public RunClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public RunClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public RunClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public RunClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunClusterRequest setNodeAttributes(NodeAttributes nodeAttributes) {
        this.nodeAttributes = nodeAttributes;
        return this;
    }
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    public RunClusterRequest setNodeGroups(java.util.List<NodeGroupConfig> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<NodeGroupConfig> getNodeGroups() {
        return this.nodeGroups;
    }

    public RunClusterRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public RunClusterRequest setPromotions(java.util.List<Promotion> promotions) {
        this.promotions = promotions;
        return this;
    }
    public java.util.List<Promotion> getPromotions() {
        return this.promotions;
    }

    public RunClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunClusterRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public RunClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunClusterRequest setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public RunClusterRequest setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public RunClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
