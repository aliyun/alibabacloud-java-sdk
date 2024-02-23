// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetClusterCloneMetaResponseBody extends TeaModel {
    @NameInMap("ClusterCloneMeta")
    public ClusterCloneMeta clusterCloneMeta;

    /**
     * <p>请求ID。</p>
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
         * <p>最大值</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>最小值</p>
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
         * <p>伸缩类型。取值范围：</p>
         * <p>- SCALE_OUT：扩容</p>
         * <p>- SCALE_IN：缩容</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>调整值。需要为正数，代表需要扩容或者缩容的实例数量。</p>
         */
        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        /**
         * <p>按照负载伸缩描述。</p>
         */
        @NameInMap("MetricsTrigger")
        public MetricsTrigger metricsTrigger;

        /**
         * <p>弹性伸缩规则名称。</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>按照时间伸缩描述。</p>
         */
        @NameInMap("TimeTrigger")
        public TimeTrigger timeTrigger;

        /**
         * <p>伸缩规则类型。取值范围：</p>
         * <p>- TIME_TRIGGER: 按时间伸缩。</p>
         * <p>- METRICS_TRIGGER: 按负载伸缩。</p>
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

    public static class ScalingPolicyDTOS extends TeaModel {
        /**
         * <p>集群ID。</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>最大最小值约束</p>
         */
        @NameInMap("Constraints")
        public Constraints constraints;

        /**
         * <p>节点组ID。</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>伸缩策略ID。</p>
         */
        @NameInMap("ScalingPolicyId")
        public String scalingPolicyId;

        /**
         * <p>伸缩规则列表</p>
         */
        @NameInMap("ScalingRules")
        public java.util.List<ScalingRules> scalingRules;

        public static ScalingPolicyDTOS build(java.util.Map<String, ?> map) throws Exception {
            ScalingPolicyDTOS self = new ScalingPolicyDTOS();
            return TeaModel.build(map, self);
        }

        public ScalingPolicyDTOS setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ScalingPolicyDTOS setConstraints(Constraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public Constraints getConstraints() {
            return this.constraints;
        }

        public ScalingPolicyDTOS setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ScalingPolicyDTOS setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public ScalingPolicyDTOS setScalingRules(java.util.List<ScalingRules> scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }
        public java.util.List<ScalingRules> getScalingRules() {
            return this.scalingRules;
        }

    }

    public static class ClusterCloneMeta extends TeaModel {
        /**
         * <p>创建集群时的服务配置项。创建集群时需要记录用户传入的配置项参数key，返回集群最新的配置项值。</p>
         */
        @NameInMap("ApplicationConfigs")
        public java.util.List<ApplicationConfig> applicationConfigs;

        /**
         * <p>集群应用。</p>
         */
        @NameInMap("Applications")
        public java.util.List<Application> applications;

        @NameInMap("BootstrapScripts")
        public java.util.List<Script> bootstrapScripts;

        /**
         * <p>集群ID。</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>集群名称。</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>集群状态。</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

        /**
         * <p>集群类型。</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>部署模式。</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>EMR服务角色。</p>
         */
        @NameInMap("EmrDefaultRole")
        public String emrDefaultRole;

        @NameInMap("ExistCloneConfig")
        public Boolean existCloneConfig;

        /**
         * <p>元数据类型。</p>
         */
        @NameInMap("MetaStoreType")
        public String metaStoreType;

        /**
         * <p>网络类型。</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>节点属性。</p>
         */
        @NameInMap("NodeAttributes")
        public NodeAttributes nodeAttributes;

        @NameInMap("NodeGroups")
        public java.util.List<NodeGroup> nodeGroups;

        /**
         * <p>付费类型。</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>地域ID。</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>EMR发行版。</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        /**
         * <p>资源组ID。</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ScalingPolicyDTOS")
        public java.util.List<ScalingPolicyDTOS> scalingPolicyDTOS;

        /**
         * <p>Kerberos安全模式。</p>
         */
        @NameInMap("SecurityMode")
        public String securityMode;

        /**
         * <p>预付费配置。</p>
         */
        @NameInMap("SubscriptionConfig")
        public SubscriptionConfig subscriptionConfig;

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

        public ClusterCloneMeta setMetaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        public ClusterCloneMeta setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
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

        public ClusterCloneMeta setScalingPolicyDTOS(java.util.List<ScalingPolicyDTOS> scalingPolicyDTOS) {
            this.scalingPolicyDTOS = scalingPolicyDTOS;
            return this;
        }
        public java.util.List<ScalingPolicyDTOS> getScalingPolicyDTOS() {
            return this.scalingPolicyDTOS;
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
