// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The application configurations. You can specify a maximum of 1,000 items.</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>The applications. You can specify a maximum of 100 items.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Applications")
    public java.util.List<Application> applications;

    /**
     * <p>The bootstrap actions. You can specify a maximum of 10 items.</p>
     */
    @NameInMap("BootstrapScripts")
    public java.util.List<Script> bootstrapScripts;

    /**
     * <p>The idempotent client token. If you call the same ClientToken multiple times, the returned results are the same. Only one cluster can be created with the same ClientToken.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the cluster. The name must be 1 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The type of the cluster. Valid values:</p>
     * <br>
     * <p>*   DATALAKE: data lake</p>
     * <p>*   OLAP: online analytical processing (OLAP)</p>
     * <p>*   DATAFLOW: Dataflow</p>
     * <p>*   DATASERVING: DataServing</p>
     * <p>*   CUSTOM: a custom hybrid cluster.</p>
     * <p>*   HADOOP: the old data lake. We recommend that you use the new data lake.</p>
     * <br>
     * <p>If you create an EMR cluster for the first time after 17:00 (UTC +8) on December 19, 2022, you cannot select the HADOOP, DATA_SCIENCE, PRESTO, or ZOOKEEPER cluster type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The deployment mode of master nodes in the cluster. Valid values:</p>
     * <br>
     * <p>*   NORMAL: regular mode. This is the default value. A cluster that contains only one master node is created.</p>
     * <p>*   HA: high availability (HA) mode. A cluster that contains three master nodes is created.</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The attributes of all ECS instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>The node groups. You can specify a maximum of 100 items.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<NodeGroupConfig> nodeGroups;

    /**
     * <p>The billing cycle of the instance. Valid values:</p>
     * <br>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     * <p>*   Subscription: subscription</p>
     * <br>
     * <p>Default value: PayAsYouGo.</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The version of EMR. You can view the EMR release version on the EMR cluster purchase page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>The ID of the resource group to which to assign the ENI.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security mode of the cluster. Valid values:</p>
     * <br>
     * <p>*   NORMAL: disables Kerberos authentication for the cluster. This is the default value.</p>
     * <p>*   KERBEROS: enables Kerberos authentication for the cluster.</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    /**
     * <p>The subscription configurations. This parameter is required only if you set the PaymentType parameter to Subscription.</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>The tags. You can specify a maximum of 20 items.</p>
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

    public CreateClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
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
