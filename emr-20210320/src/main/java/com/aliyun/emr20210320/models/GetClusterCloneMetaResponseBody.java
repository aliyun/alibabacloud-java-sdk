// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetClusterCloneMetaResponseBody extends TeaModel {
    /**
     * <p>The clone metadata of the cluster.</p>
     */
    @NameInMap("ClusterCloneMeta")
    public ClusterCloneMeta clusterCloneMeta;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterCloneMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCloneMetaResponseBody self = new GetClusterCloneMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterCloneMetaResponseBody setClusterCloneMeta(ClusterCloneMeta clusterCloneMeta) {
        this.clusterCloneMeta = clusterCloneMeta;
        return this;
    }
    public ClusterCloneMeta getClusterCloneMeta() {
        return this.clusterCloneMeta;
    }

    public GetClusterCloneMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Constraints extends TeaModel {
        /**
         * <p>The maximum number of nodes in the node group. Default value: 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The maximum number of pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxOnDemandCapacity")
        public Integer maxOnDemandCapacity;

        /**
         * <p>The minimum number of nodes in the node group. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MinCapacity")
        public Integer minCapacity;

        public static Constraints build(java.util.Map<String, ?> map) throws Exception {
            Constraints self = new Constraints();
            return TeaModel.build(map, self);
        }

        public Constraints setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public Constraints setMaxOnDemandCapacity(Integer maxOnDemandCapacity) {
            this.maxOnDemandCapacity = maxOnDemandCapacity;
            return this;
        }
        public Integer getMaxOnDemandCapacity() {
            return this.maxOnDemandCapacity;
        }

        public Constraints setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

    public static class ScalingRules extends TeaModel {
        /**
         * <p>The type of the scaling activity. This parameter is required. Valid values:</p>
         * <ul>
         * <li><p>SCALE_OUT: scale-out.</p>
         * </li>
         * <li><p>SCALE_IN: scale-in.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>The adjustment value. This parameter is required. It must be a positive integer. It specifies the number of instances to add or remove.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        /**
         * <p>The description of the metric-based scaling rule.</p>
         */
        @NameInMap("MetricsTrigger")
        public MetricsTrigger metricsTrigger;

        /**
         * <p>The name of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scaling-out-memory</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The description of the time-based scaling rule.</p>
         */
        @NameInMap("TimeTrigger")
        public TimeTrigger timeTrigger;

        /**
         * <p>The type of the scaling rule. This parameter is required. Valid values:</p>
         * <ul>
         * <li><p>TIME_TRIGGER: time-based scaling.</p>
         * </li>
         * <li><p>METRICS_TRIGGER: metric-based scaling.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIME_TRIGGER</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ScalingRules build(java.util.Map<String, ?> map) throws Exception {
            ScalingRules self = new ScalingRules();
            return TeaModel.build(map, self);
        }

        public ScalingRules setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public ScalingRules setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public ScalingRules setMetricsTrigger(MetricsTrigger metricsTrigger) {
            this.metricsTrigger = metricsTrigger;
            return this;
        }
        public MetricsTrigger getMetricsTrigger() {
            return this.metricsTrigger;
        }

        public ScalingRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ScalingRules setTimeTrigger(TimeTrigger timeTrigger) {
            this.timeTrigger = timeTrigger;
            return this;
        }
        public TimeTrigger getTimeTrigger() {
            return this.timeTrigger;
        }

        public ScalingRules setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class ScalingPolicies extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The constraints on the maximum and minimum number of nodes in the node group.</p>
         */
        @NameInMap("Constraints")
        public Constraints constraints;

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-etltask</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The scaling policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asp-asduwe23znl***</p>
         */
        @NameInMap("ScalingPolicyId")
        public String scalingPolicyId;

        /**
         * <p>The type of the elastic policy.</p>
         */
        @NameInMap("ScalingPolicyType")
        public String scalingPolicyType;

        /**
         * <p>The list of scaling rules.</p>
         */
        @NameInMap("ScalingRules")
        public java.util.List<ScalingRules> scalingRules;

        public static ScalingPolicies build(java.util.Map<String, ?> map) throws Exception {
            ScalingPolicies self = new ScalingPolicies();
            return TeaModel.build(map, self);
        }

        public ScalingPolicies setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ScalingPolicies setConstraints(Constraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public Constraints getConstraints() {
            return this.constraints;
        }

        public ScalingPolicies setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ScalingPolicies setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ScalingPolicies setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public ScalingPolicies setScalingPolicyType(String scalingPolicyType) {
            this.scalingPolicyType = scalingPolicyType;
            return this;
        }
        public String getScalingPolicyType() {
            return this.scalingPolicyType;
        }

        public ScalingPolicies setScalingRules(java.util.List<ScalingRules> scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }
        public java.util.List<ScalingRules> getScalingRules() {
            return this.scalingRules;
        }

    }

    public static class ClusterCloneMeta extends TeaModel {
        /**
         * <p>The modified application configuration items.</p>
         */
        @NameInMap("ApplicationConfigs")
        public java.util.List<ApplicationConfig> applicationConfigs;

        /**
         * <p>The cluster applications.</p>
         */
        @NameInMap("Applications")
        public java.util.List<Application> applications;

        /**
         * <p>An array of bootstrap scripts. The number of array elements N can be from 1 to 10.</p>
         */
        @NameInMap("BootstrapScripts")
        public java.util.List<Script> bootstrapScripts;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac7f7****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>emrtest</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The state of the cluster. Valid values:</p>
         * <ul>
         * <li><p>STARTING: The cluster is starting.</p>
         * </li>
         * <li><p>START_FAILED: The cluster failed to start.</p>
         * </li>
         * <li><p>BOOTSTRAPPING: The cluster is performing bootstrap actions.</p>
         * </li>
         * <li><p>RUNNING: The cluster is running.</p>
         * </li>
         * <li><p>TERMINATING: The cluster is being terminated.</p>
         * </li>
         * <li><p>TERMINATED: The cluster is terminated.</p>
         * </li>
         * <li><p>TERMINATED_WITH_ERRORS: The cluster is terminated due to an exception.</p>
         * </li>
         * <li><p>TERMINATE_FAILED: The cluster failed to be terminated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><p>DATALAKE: data lake.</p>
         * </li>
         * <li><p>OLAP: data analytics.</p>
         * </li>
         * <li><p>DATAFLOW: real-time data stream.</p>
         * </li>
         * <li><p>DATASERVING: data service.</p>
         * </li>
         * <li><p>CUSTOM: custom cluster.</p>
         * </li>
         * <li><p>HADOOP: Hadoop.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CollationTimeZone")
        public CollationTimeZone collationTimeZone;

        /**
         * <p>Indicates whether deletion protection is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><p>true: Deletion protection is enabled.</p>
         * </li>
         * <li><p>false: Deletion protection is disabled.</p>
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
         * <li><p>NORMAL: standard deployment.</p>
         * </li>
         * <li><p>HA: high-availability deployment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HA</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The EMR server role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEMRDefaultRole</p>
         */
        @NameInMap("EmrDefaultRole")
        public String emrDefaultRole;

        /**
         * <p>Indicates whether the application configurations can be passed in when you clone a HADOOP cluster. Valid values:</p>
         * <ul>
         * <li><p>False: Not supported.</p>
         * </li>
         * <li><p>True: Supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("ExistCloneConfig")
        public Boolean existCloneConfig;

        /**
         * <p>The node attributes.</p>
         */
        @NameInMap("NodeAttributes")
        public NodeAttributes nodeAttributes;

        /**
         * <p>An array of node group configurations. The number of array elements N can be from 1 to 100.</p>
         */
        @NameInMap("NodeGroups")
        public java.util.List<NodeGroup> nodeGroups;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p>PayAsYouGo: pay-as-you-go.</p>
         * </li>
         * <li><p>Subscription: subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The EMR release.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.6.0</p>
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
         * <p>The Auto Scaling policies for each node group in the cluster.</p>
         */
        @NameInMap("ScalingPolicies")
        public java.util.List<ScalingPolicies> scalingPolicies;

        /**
         * <p>The Kerberos security mode of the cluster. Valid values:</p>
         * <ul>
         * <li><p>NORMAL: The Kerberos mode is disabled.</p>
         * </li>
         * <li><p>KERBEROS: The Kerberos mode is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SecurityMode")
        public String securityMode;

        /**
         * <p>The subscription configuration.</p>
         */
        @NameInMap("SubscriptionConfig")
        public SubscriptionConfig subscriptionConfig;

        /**
         * <p>The list of cluster tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tag> tags;

        public static ClusterCloneMeta build(java.util.Map<String, ?> map) throws Exception {
            ClusterCloneMeta self = new ClusterCloneMeta();
            return TeaModel.build(map, self);
        }

        public ClusterCloneMeta setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }
        public java.util.List<ApplicationConfig> getApplicationConfigs() {
            return this.applicationConfigs;
        }

        public ClusterCloneMeta setApplications(java.util.List<Application> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<Application> getApplications() {
            return this.applications;
        }

        public ClusterCloneMeta setBootstrapScripts(java.util.List<Script> bootstrapScripts) {
            this.bootstrapScripts = bootstrapScripts;
            return this;
        }
        public java.util.List<Script> getBootstrapScripts() {
            return this.bootstrapScripts;
        }

        public ClusterCloneMeta setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ClusterCloneMeta setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ClusterCloneMeta setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public ClusterCloneMeta setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ClusterCloneMeta setCollationTimeZone(CollationTimeZone collationTimeZone) {
            this.collationTimeZone = collationTimeZone;
            return this;
        }
        public CollationTimeZone getCollationTimeZone() {
            return this.collationTimeZone;
        }

        public ClusterCloneMeta setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ClusterCloneMeta setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ClusterCloneMeta setEmrDefaultRole(String emrDefaultRole) {
            this.emrDefaultRole = emrDefaultRole;
            return this;
        }
        public String getEmrDefaultRole() {
            return this.emrDefaultRole;
        }

        public ClusterCloneMeta setExistCloneConfig(Boolean existCloneConfig) {
            this.existCloneConfig = existCloneConfig;
            return this;
        }
        public Boolean getExistCloneConfig() {
            return this.existCloneConfig;
        }

        public ClusterCloneMeta setNodeAttributes(NodeAttributes nodeAttributes) {
            this.nodeAttributes = nodeAttributes;
            return this;
        }
        public NodeAttributes getNodeAttributes() {
            return this.nodeAttributes;
        }

        public ClusterCloneMeta setNodeGroups(java.util.List<NodeGroup> nodeGroups) {
            this.nodeGroups = nodeGroups;
            return this;
        }
        public java.util.List<NodeGroup> getNodeGroups() {
            return this.nodeGroups;
        }

        public ClusterCloneMeta setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ClusterCloneMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ClusterCloneMeta setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ClusterCloneMeta setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ClusterCloneMeta setScalingPolicies(java.util.List<ScalingPolicies> scalingPolicies) {
            this.scalingPolicies = scalingPolicies;
            return this;
        }
        public java.util.List<ScalingPolicies> getScalingPolicies() {
            return this.scalingPolicies;
        }

        public ClusterCloneMeta setSecurityMode(String securityMode) {
            this.securityMode = securityMode;
            return this;
        }
        public String getSecurityMode() {
            return this.securityMode;
        }

        public ClusterCloneMeta setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }
        public SubscriptionConfig getSubscriptionConfig() {
            return this.subscriptionConfig;
        }

        public ClusterCloneMeta setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

    }

}
