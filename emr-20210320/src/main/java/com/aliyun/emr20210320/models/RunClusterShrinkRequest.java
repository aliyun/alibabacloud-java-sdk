// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunClusterShrinkRequest extends TeaModel {
    /**
     * <p>The application configurations. Number of elements in the array: 1 to 1000.</p>
     */
    @NameInMap("ApplicationConfigs")
    public String applicationConfigsShrink;

    /**
     * <p>The services. Number of elements in the array: 1 to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Applications")
    public String applicationsShrink;

    /**
     * <p>The bootstrap actions. Number of elements in the array: 1 to 10.</p>
     */
    @NameInMap("BootstrapScripts")
    public String bootstrapScriptsShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The same ClientToken value for multiple calls to the RunCluster operation results in identical responses. Only one cluster can be created by using the same ClientToken value.</p>
     * 
     * <strong>example:</strong>
     * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster name. The name must be 1 to 128 characters in length. The name must start with a letter but cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emrtest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The type of the cluster. Valid values:</p>
     * <ul>
     * <li>DATALAKE</li>
     * <li>OLAP</li>
     * <li>DATAFLOW</li>
     * <li>DATASERVING</li>
     * <li>CUSTOM</li>
     * <li>HADOOP: We recommend that you set this parameter to DATALAKE rather than HADOOP.</li>
     * </ul>
     * <p>If the first time you create an EMR cluster is after 17:00 (UTC+8) on December 19, 2022, you cannot create a Hadoop, Data Science, Presto, or ZooKeeper cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The deployment mode of master nodes in the cluster. Valid values:</p>
     * <ul>
     * <li>NORMAL: regular mode. This is the default value. A cluster that contains only one master node is created.</li>
     * <li>HA: high availability mode. A cluster that contains at least three master nodes is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HA</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>Emr cluster for ETL</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The attributes of all ECS instances.</p>
     */
    @NameInMap("NodeAttributes")
    public String nodeAttributesShrink;

    /**
     * <p>The node groups. Number of elements in the array: 1 to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroups")
    public String nodeGroupsShrink;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo</li>
     * <li>Subscription</li>
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
     * <p>The EMR version. You can query available EMR versions in the EMR console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR-5.16.0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security mode of the cluster. Valid values:</p>
     * <ul>
     * <li>NORMAL: regular mode. Kerberos authentication is disabled. This is the default value.</li>
     * <li>KERBEROS: Kerberos mode. Kerberos authentication is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    /**
     * <p>The subscription configurations. This parameter takes effect only if you set the PaymentType parameter to Subscription.</p>
     */
    @NameInMap("SubscriptionConfig")
    public String subscriptionConfigShrink;

    /**
     * <p>The tags. Number of elements in the array: 0 to 20.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static RunClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterShrinkRequest self = new RunClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterShrinkRequest setApplicationConfigsShrink(String applicationConfigsShrink) {
        this.applicationConfigsShrink = applicationConfigsShrink;
        return this;
    }
    public String getApplicationConfigsShrink() {
        return this.applicationConfigsShrink;
    }

    public RunClusterShrinkRequest setApplicationsShrink(String applicationsShrink) {
        this.applicationsShrink = applicationsShrink;
        return this;
    }
    public String getApplicationsShrink() {
        return this.applicationsShrink;
    }

    public RunClusterShrinkRequest setBootstrapScriptsShrink(String bootstrapScriptsShrink) {
        this.bootstrapScriptsShrink = bootstrapScriptsShrink;
        return this;
    }
    public String getBootstrapScriptsShrink() {
        return this.bootstrapScriptsShrink;
    }

    public RunClusterShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public RunClusterShrinkRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public RunClusterShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunClusterShrinkRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public RunClusterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunClusterShrinkRequest setNodeAttributesShrink(String nodeAttributesShrink) {
        this.nodeAttributesShrink = nodeAttributesShrink;
        return this;
    }
    public String getNodeAttributesShrink() {
        return this.nodeAttributesShrink;
    }

    public RunClusterShrinkRequest setNodeGroupsShrink(String nodeGroupsShrink) {
        this.nodeGroupsShrink = nodeGroupsShrink;
        return this;
    }
    public String getNodeGroupsShrink() {
        return this.nodeGroupsShrink;
    }

    public RunClusterShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public RunClusterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunClusterShrinkRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public RunClusterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunClusterShrinkRequest setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public RunClusterShrinkRequest setSubscriptionConfigShrink(String subscriptionConfigShrink) {
        this.subscriptionConfigShrink = subscriptionConfigShrink;
        return this;
    }
    public String getSubscriptionConfigShrink() {
        return this.subscriptionConfigShrink;
    }

    public RunClusterShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
