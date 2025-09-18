// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DRPlanConfiguration extends TeaModel {
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Applications")
    public java.util.List<Application> applications;

    @NameInMap("BootstrapScripts")
    public java.util.List<Script> bootstrapScripts;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("DeployMode")
    public String deployMode;

    @NameInMap("Description")
    public String description;

    @NameInMap("LogCollectStrategy")
    public String logCollectStrategy;

    @NameInMap("ManagedScalingPolicy")
    public ManagedScalingPolicy managedScalingPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>This parameter is required.</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    @NameInMap("Tags")
    public java.util.List<Tags> tags;

    public static DRPlanConfiguration build(java.util.Map<String, ?> map) throws Exception {
        DRPlanConfiguration self = new DRPlanConfiguration();
        return TeaModel.build(map, self);
    }

    public DRPlanConfiguration setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public DRPlanConfiguration setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public DRPlanConfiguration setBootstrapScripts(java.util.List<Script> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }
    public java.util.List<Script> getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    public DRPlanConfiguration setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DRPlanConfiguration setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DRPlanConfiguration setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public DRPlanConfiguration setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public DRPlanConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DRPlanConfiguration setLogCollectStrategy(String logCollectStrategy) {
        this.logCollectStrategy = logCollectStrategy;
        return this;
    }
    public String getLogCollectStrategy() {
        return this.logCollectStrategy;
    }

    public DRPlanConfiguration setManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
        return this;
    }
    public ManagedScalingPolicy getManagedScalingPolicy() {
        return this.managedScalingPolicy;
    }

    public DRPlanConfiguration setNodeAttributes(NodeAttributes nodeAttributes) {
        this.nodeAttributes = nodeAttributes;
        return this;
    }
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    public DRPlanConfiguration setNodeGroups(java.util.List<NodeGroupConfig> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<NodeGroupConfig> getNodeGroups() {
        return this.nodeGroups;
    }

    public DRPlanConfiguration setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DRPlanConfiguration setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DRPlanConfiguration setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public DRPlanConfiguration setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DRPlanConfiguration setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public DRPlanConfiguration setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public DRPlanConfiguration setTags(java.util.List<Tags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tags> getTags() {
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

    public static class Tags extends TeaModel {
        /**
         * <p>标签键。必填参数，不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或https://。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。非必填，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。</p>
         * 
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
