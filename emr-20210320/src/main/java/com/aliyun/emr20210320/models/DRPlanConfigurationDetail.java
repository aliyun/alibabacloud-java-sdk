// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DRPlanConfigurationDetail extends TeaModel {
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    @NameInMap("Applications")
    public java.util.List<Application> applications;

    @NameInMap("BootstrapScripts")
    public java.util.List<Script> bootstrapScripts;

    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogCollectStrategy")
    public String logCollectStrategy;

    @NameInMap("ManagedScalingPolicy")
    public ManagedScalingPolicy managedScalingPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetaStoreType")
    public String metaStoreType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    @NameInMap("NodeGroups")
    public java.util.List<NodeGroupConfig> nodeGroups;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScalingPolicies")
    public java.util.List<ScalingPolicy> scalingPolicies;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static DRPlanConfigurationDetail build(java.util.Map<String, ?> map) throws Exception {
        DRPlanConfigurationDetail self = new DRPlanConfigurationDetail();
        return TeaModel.build(map, self);
    }

    public DRPlanConfigurationDetail setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public DRPlanConfigurationDetail setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public DRPlanConfigurationDetail setBootstrapScripts(java.util.List<Script> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }
    public java.util.List<Script> getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    public DRPlanConfigurationDetail setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DRPlanConfigurationDetail setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DRPlanConfigurationDetail setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public DRPlanConfigurationDetail setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public DRPlanConfigurationDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DRPlanConfigurationDetail setLogCollectStrategy(String logCollectStrategy) {
        this.logCollectStrategy = logCollectStrategy;
        return this;
    }
    public String getLogCollectStrategy() {
        return this.logCollectStrategy;
    }

    public DRPlanConfigurationDetail setManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
        return this;
    }
    public ManagedScalingPolicy getManagedScalingPolicy() {
        return this.managedScalingPolicy;
    }

    public DRPlanConfigurationDetail setMetaStoreType(String metaStoreType) {
        this.metaStoreType = metaStoreType;
        return this;
    }
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

    public DRPlanConfigurationDetail setNodeAttributes(NodeAttributes nodeAttributes) {
        this.nodeAttributes = nodeAttributes;
        return this;
    }
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    public DRPlanConfigurationDetail setNodeGroups(java.util.List<NodeGroupConfig> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<NodeGroupConfig> getNodeGroups() {
        return this.nodeGroups;
    }

    public DRPlanConfigurationDetail setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DRPlanConfigurationDetail setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DRPlanConfigurationDetail setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public DRPlanConfigurationDetail setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DRPlanConfigurationDetail setScalingPolicies(java.util.List<ScalingPolicy> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }
    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return this.scalingPolicies;
    }

    public DRPlanConfigurationDetail setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public DRPlanConfigurationDetail setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public DRPlanConfigurationDetail setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public static class ManagedScalingPolicy extends TeaModel {
        @NameInMap("Constraints")
        public ManagedScalingConstraints constraints;

        public static ManagedScalingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ManagedScalingPolicy self = new ManagedScalingPolicy();
            return TeaModel.build(map, self);
        }

        public ManagedScalingPolicy setConstraints(ManagedScalingConstraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public ManagedScalingConstraints getConstraints() {
            return this.constraints;
        }

    }

}
