// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The configuration about auto scaling.</p>
     */
    @NameInMap("auto_scaling")
    public CreateClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p>This parameter is deprecated. Use the desired_size parameter instead.</p>
     * <br>
     * <p>The number of nodes in the node pool.</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>This parameter is deprecated.</p>
     * <br>
     * <p>The configurations of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    public CreateClusterNodePoolRequestInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter takes effect only when you set the `type` parameter of the node pool to `edge`. Valid values:</p>
     * <br>
     * <p>*   `basic`: basic</p>
     * <p>*   `improved`: enhanced</p>
     * <p>*   `private`: dedicated Only Kubernetes 1.22 and later support this parameter.</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>The configurations about the cluster.</p>
     */
    @NameInMap("kubernetes_config")
    public CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations about the managed node pool feature.</p>
     */
    @NameInMap("management")
    public CreateClusterNodePoolRequestManagement management;

    /**
     * <p>The maximum number of nodes that can be created in the edge node pool. You must specify a value that is equal to or larger than 0. A value of 0 indicates that the number of nodes in the node pool is limited only by the quota of nodes in the cluster. In most cases, this parameter is set to a value larger than 0 for edge node pools. This parameter is set to 0 for node pools of the ess type or default edge node pools.</p>
     */
    @NameInMap("max_nodes")
    public Long maxNodes;

    /**
     * <p>The configurations of the node pool.</p>
     */
    @NameInMap("nodepool_info")
    public CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>The configuration of the scaling group that is used by the node pool.</p>
     */
    @NameInMap("scaling_group")
    public CreateClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The configurations about confidential computing for the cluster.</p>
     */
    @NameInMap("tee_config")
    public CreateClusterNodePoolRequestTeeConfig teeConfig;

    public static CreateClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolRequest self = new CreateClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolRequest setAutoScaling(CreateClusterNodePoolRequestAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public CreateClusterNodePoolRequestAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    public CreateClusterNodePoolRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public CreateClusterNodePoolRequest setInterconnectConfig(CreateClusterNodePoolRequestInterconnectConfig interconnectConfig) {
        this.interconnectConfig = interconnectConfig;
        return this;
    }
    public CreateClusterNodePoolRequestInterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    public CreateClusterNodePoolRequest setInterconnectMode(String interconnectMode) {
        this.interconnectMode = interconnectMode;
        return this;
    }
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    public CreateClusterNodePoolRequest setKubernetesConfig(CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public CreateClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public CreateClusterNodePoolRequest setManagement(CreateClusterNodePoolRequestManagement management) {
        this.management = management;
        return this;
    }
    public CreateClusterNodePoolRequestManagement getManagement() {
        return this.management;
    }

    public CreateClusterNodePoolRequest setMaxNodes(Long maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public CreateClusterNodePoolRequest setNodepoolInfo(CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public CreateClusterNodePoolRequestNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public CreateClusterNodePoolRequest setScalingGroup(CreateClusterNodePoolRequestScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public CreateClusterNodePoolRequestScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public CreateClusterNodePoolRequest setTeeConfig(CreateClusterNodePoolRequestTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public CreateClusterNodePoolRequestTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static class CreateClusterNodePoolRequestAutoScaling extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The metering method of the EIP. Valid values:</p>
         * <br>
         * <p>*   `PayByBandwidth`: pay-by-bandwidth.</p>
         * <p>*   `PayByTraffic`: pay-by-data-transfer.</p>
         * <br>
         * <p>Default value: `PayByBandwidth`.</p>
         */
        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        /**
         * <p>Specifies whether to enable auto scaling. Valid values:</p>
         * <br>
         * <p>*   `true`: enables auto scaling.</p>
         * <p>*   `false`: disables auto scaling. If you set this parameter to false, other parameters in the `auto_scaling` section do not take effect.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>Specifies whether to associate an elastic IP address (EIP) with the node pool. Valid values:</p>
         * <br>
         * <p>*   `true`: associates an EIP with the node pool.</p>
         * <p>*   `false`: does not associate an EIP with the node pool.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>The maximum number of Elastic Compute Service (ECS) instances that can be created in a node pool.</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of ECS instances that must be kept in a node pool.</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The instance types that can be used for the auto scaling of the node pool. Valid values:</p>
         * <br>
         * <p>*   `cpu`: regular instance.</p>
         * <p>*   `gpu`: GPU-accelerated instance.</p>
         * <p>*   `gpushare`: shared GPU-accelerated instance.</p>
         * <p>*   `spot`: preemptible instance.</p>
         * <br>
         * <p>Default value: `cpu`.</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateClusterNodePoolRequestAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestAutoScaling self = new CreateClusterNodePoolRequestAutoScaling();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public CreateClusterNodePoolRequestAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public CreateClusterNodePoolRequestAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateClusterNodePoolRequestAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public CreateClusterNodePoolRequestAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public CreateClusterNodePoolRequestAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public CreateClusterNodePoolRequestAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateClusterNodePoolRequestInterconnectConfig extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The bandwidth of the enhanced edge node pool. Unit: Mbit/s.</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The ID of the Cloud Connect Network (CCN) instance that is associated with the enhanced edge node pool.</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The region to which the CCN instance that is associated with the enhanced edge node pool belongs.</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the enhanced edge node pool.</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>This parameter is deprecated.</p>
         * <br>
         * <p>The subscription duration of the enhanced edge node pool. The duration is measured in months.</p>
         */
        @NameInMap("improved_period")
        public String improvedPeriod;

        public static CreateClusterNodePoolRequestInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestInterconnectConfig self = new CreateClusterNodePoolRequestInterconnectConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class CreateClusterNodePoolRequestKubernetesConfig extends TeaModel {
        /**
         * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After the CloudMonitor agent is installed on ECS nodes, you can view monitoring information about the instances in the CloudMonitor console. We recommend that you install the CloudMonitor agent. Valid values:</p>
         * <br>
         * <p>*   `true`: installs the CloudMonitor agent on ECS nodes.</p>
         * <p>*   `false`: does not install the CloudMonitor agent on ECS nodes.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
         * <br>
         * <p>*   `static`: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</p>
         * <p>*   `none`: specifies that the default CPU affinity is used.</p>
         * <br>
         * <p>Default value: `none`.</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The labels that you want to add to the nodes in the cluster.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>A custom node name consists of a prefix, a node IP address, and a suffix.</p>
         * <br>
         * <p>*   The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.</p>
         * <p>*   The node IP address in a custom node name is the private IP address of the node.</p>
         * <br>
         * <p>Set the value in the customized,aliyun,ip,com format. The value consists of four parts that are separated by commas (,). customized and ip are fixed content. aliyun is the prefix and com is the suffix. Example: aliyun.192.168.xxx.xxx.com.</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The container runtime.</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The version of the container runtime.</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The configurations of the taints.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>The user data on the node.</p>
         */
        @NameInMap("user_data")
        public String userData;

        public static CreateClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestKubernetesConfig self = new CreateClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateClusterNodePoolRequestManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto upgrade. Valid values:</p>
         * <br>
         * <p>*   `true`: enables auto update.</p>
         * <p>*   `false`: disables auto update.</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of nodes that can be in the Unschedulable state. Valid values: 1 to 1000.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of additional nodes.</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of additional nodes to the nodes in the node pool. You must set this parameter or `surge`.</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static CreateClusterNodePoolRequestManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementUpgradeConfig self = new CreateClusterNodePoolRequestManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class CreateClusterNodePoolRequestManagement extends TeaModel {
        /**
         * <p>Specifies whether to enable auto repair. This parameter takes effect only when you specify `enable=true`.</p>
         * <br>
         * <p>*   `true`: enables auto repair.</p>
         * <p>*   `false`: disables auto repair.</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
         * <br>
         * <p>*   `true`: enables the managed node pool feature.</p>
         * <p>*   `false`: disables the managed node pool feature. Other parameters in this section take effect only when you specify enable=true.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The configurations about auto update. The configurations take effect only when you specify `enable=true`.</p>
         */
        @NameInMap("upgrade_config")
        public CreateClusterNodePoolRequestManagementUpgradeConfig upgradeConfig;

        public static CreateClusterNodePoolRequestManagement build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagement self = new CreateClusterNodePoolRequestManagement();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public CreateClusterNodePoolRequestManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateClusterNodePoolRequestManagement setUpgradeConfig(CreateClusterNodePoolRequestManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public CreateClusterNodePoolRequestManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class CreateClusterNodePoolRequestNodepoolInfo extends TeaModel {
        /**
         * <p>The name of the node pool.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the resource group to which the node pool belongs.</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The type of node pool. Valid values:</p>
         * <br>
         * <p>*   `ess`: node pool</p>
         * <p>*   `edge`: edge node pool</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodepoolInfo self = new CreateClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterNodePoolRequestNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateClusterNodePoolRequestNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private node pool.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of private node pool. This parameter specifies the type of private pool that you want to use to create instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. The system selects a private pool to start instances. Valid values:</p>
         * <br>
         * <p>*   `Open`: specifies an open private pool. The system selects an open private pool to start instances. If no matching open private pools are available, the resources in the public pool are used.</p>
         * <p>*   `Target`: specifies a private node pool. The system uses the resources of the specified private pool to start instances. If the specified private pool is unavailable, instances cannot be started.</p>
         * <p>*   `None`: does not use private pools. The resources of private pools are not used to start instances.</p>
         */
        @NameInMap("match_criteria")
        public String matchCriteria;

        public static CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions self = new CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The instance type of the preemptible instances.</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum bid price of a preemptible instance.</p>
         * <br>
         * <p>Unit: USD/hour.</p>
         */
        @NameInMap("price_limit")
        public String priceLimit;

        public static CreateClusterNodePoolRequestScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupSpotPriceLimit self = new CreateClusterNodePoolRequestScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateClusterNodePoolRequestScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupTags extends TeaModel {
        /**
         * <p>The key of the label.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the label.</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateClusterNodePoolRequestScalingGroupTags build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupTags self = new CreateClusterNodePoolRequestScalingGroupTags();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterNodePoolRequestScalingGroupTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroup extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal for nodes in the node pool. This parameter takes effect only when you set `instance_charge_type` to `PrePaid`. Valid values:</p>
         * <br>
         * <p>*   `true`: enables auto-renewal.</p>
         * <p>*   `false`: disables auto-renewal.</p>
         * <br>
         * <p>Default value: `true`.</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of the auto-renewal. This property takes effect and is required only when you set instance_charge_type to PrePaid and auto_renew to true. If `PeriodUnit=Month` is configured, the valid values are 1, 2, 3, 6, and 12.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as the cost or insufficient inventory. This parameter takes effect when you set `multi_az_policy` to `COST_OPTIMIZED`. Valid values:</p>
         * <br>
         * <p>*   `true`: automatically creates pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created.</p>
         * <p>*   `false`: does not create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created.</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The configurations of the data disks that are mounted to the nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The ID of the deployment set.</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The ID of a custom image. By default, the image provided by ACK is used.</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of OS image. You must set this parameter or `platform`. Valid values:</p>
         * <br>
         * <p>*   `AliyunLinux`: Alinux2</p>
         * <p>*   `AliyunLinux3`: Alinux3</p>
         * <p>*   `AliyunLinux3Arm64`: Alinux3 ARM</p>
         * <p>*   `AliyunLinuxUEFI`: Alinux2 UEFI</p>
         * <p>*   `CentOS`: CentOS</p>
         * <p>*   `Windows`: Windows</p>
         * <p>*   `WindowsCore`: Windows Core</p>
         * <p>*   `ContainerOS`: ContainerOS</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <br>
         * <p>*   `PrePaid`: the subscription billing method.</p>
         * <p>*   `PostPaid`: the pay-as-you-go billing method.</p>
         * <br>
         * <p>Default value: `PostPaid`.</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance type of the nodes in the node pool.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The metering method of the public IP address. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByTraffic: pay-by-data-transfer</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth of the public IP address of the node. Unit: Mbit/s. Valid values: 1 to 100.</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must set this parameter or the `login_password` parameter.</p>
         * <br>
         * <p>>  If you create a managed node pool, only `key_pair` is supported.</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The password for SSH logon. You must set this parameter or the `key_pair` parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The ECS instance scaling policy for a multi-zone scaling group. Valid values:</p>
         * <br>
         * <p>*   `PRIORITY`: the scaling group is scaled based on the VSwitchIds.N parameter. If an ECS instance cannot be created in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates the ECS instance in the zone where the vSwitch that has the next highest priority resides.</p>
         * <br>
         * <p>*   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configuration. You can set the `CompensateWithOnDemand` parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note**The `COST_OPTIMIZED` setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
         * <br>
         * <p>*   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call [RebalanceInstances](~~71516~~) of Auto Scaling to balance the instance distribution among zones.</p>
         * <br>
         * <p>Default value: `PRIORITY`.</p>
         */
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the number specified by `on_demand_base_capacity`. Valid values: 0 to 100.</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the nodes in the node pool. This parameter takes effect and is required only when you set `instance_charge_type` to `PrePaid`. If you set `period_unit` to Month, the valid values of `period` are 1, 2, 3, 6, and 12.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes in the node pool. This parameter is required if you set instance_charge_type to `PrePaid`. A value of Month indicates that the billing cycle is measured in months.</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The release version of the operating system. Valid values:</p>
         * <br>
         * <p>*   `CentOS`</p>
         * <p>*   `AliyunLinux`</p>
         * <p>*   `Windows`</p>
         * <p>*   `WindowsCore`</p>
         * <br>
         * <p>Default value: `AliyunLinux`.</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The configurations of the private node pool.</p>
         */
        @NameInMap("private_pool_options")
        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>A list of ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   `release`: the standard mode. ECS instances are created and released based on resource usage.</p>
         * <p>*   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances attached with local disks.</p>
         * <br>
         * <p>Default value: `release`.</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>Specifies the ID of the security group to which you want to add the node pool. You must set this parameter or `security_group_ids`. We recommend that you set `security_group_ids`.</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The IDs of security groups to which you want to add the node pool. You must set this parameter or `security_group_id`. We recommend that you set `security_group_ids`. If you set both `security_group_id` and `security_group_ids`, `security_group_ids` is used.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to supplement preemptible instances. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values: Valid values:</p>
         * <br>
         * <p>*   `true`: enables the supplementation of preemptible instances.</p>
         * <p>*   `false`: disables the supplementation of preemptible instances.</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The instance type for preemptible instances and the price limit of the instance type.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy for the instance. Valid values:</p>
         * <br>
         * <p>*   `NoSpot`: non-preemptible instance.</p>
         * <p>*   `SpotWithPriceLimit`: specifies the highest bid for the preemptible instance.</p>
         * <p>*   `SpotAsPriceGo`: automatically submits bids based on the up-to-date market price.</p>
         * <br>
         * <p>For more information, see [Preemptible instances](~~165053~~).</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>节点系统盘是否开启Burst（性能突发）。 取值：</p>
         * <p>- true：是。</p>
         * <p>- false：否。</p>
         * <br>
         * <p>当`SystemDiskCategory`取值为`cloud_auto`时才支持设置该参数。更多信息，请参见[ESSD AutoPL云盘](~~368372~~)。</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The type of system disk. Valid values:</p>
         * <br>
         * <p>*   `cloud_efficiency`: ultra disk.</p>
         * <p>*   `cloud_ssd`: standard SSD.</p>
         * <p>*   `cloud_essd`: enhanced SSD.</p>
         * <br>
         * <p>Default value: `cloud_efficiency`.</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level (PL) of the system disk that you want to use for the node. This parameter takes effect only for ESSDs.</p>
         * <br>
         * <p>*   PL0: moderate maximum concurrent I/O performance and low I/O latency</p>
         * <p>*   PL1: moderate maximum concurrent I/O performance and low I/O latency</p>
         * <p>*   PL2: high maximum concurrent I/O performance and low I/O latency</p>
         * <p>*   PL3: ultra-high maximum concurrent I/O performance and ultra-low I/O latency</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>节点系统盘预配置的读写IOPS。可能值：0~min{50,000, 1000\*容量-基准性能}。 基准性能=min{1,800+50\*容量, 50000}。</p>
         * <br>
         * <p>当`SystemDiskCategory`取值为`cloud_auto`时才支持设置该参数。更多信息，请参见[ESSD AutoPL云盘](~~368372~~)。</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system disk size of a node. Unit: GiB.</p>
         * <br>
         * <p>Valid values: 40 to 500.</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The labels that you want to add to the ECS instances.</p>
         * <br>
         * <p>Each key must be unique and cannot exceed 128 characters in length. Neither keys nor values can start with aliyun or acs:. Neither keys nor values can contain https:// or http://.</p>
         */
        @NameInMap("tags")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupTags> tags;

        /**
         * <p>The IDs of vSwitches. You can specify 1 to 20 vSwitches.</p>
         * <br>
         * <p>>  To ensure high availability, we recommend that you select VSwitches in different zones.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static CreateClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroup self = new CreateClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateClusterNodePoolRequestScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public CreateClusterNodePoolRequestScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public CreateClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public CreateClusterNodePoolRequestScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public CreateClusterNodePoolRequestScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public CreateClusterNodePoolRequestScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterNodePoolRequestScalingGroup setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateClusterNodePoolRequestScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateClusterNodePoolRequestScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public CreateClusterNodePoolRequestScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public CreateClusterNodePoolRequestScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public CreateClusterNodePoolRequestScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public CreateClusterNodePoolRequestScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public CreateClusterNodePoolRequestScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public CreateClusterNodePoolRequestScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateClusterNodePoolRequestScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateClusterNodePoolRequestScalingGroup setPrivatePoolOptions(CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public CreateClusterNodePoolRequestScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public CreateClusterNodePoolRequestScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public CreateClusterNodePoolRequestScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateClusterNodePoolRequestScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotPriceLimit(java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateClusterNodePoolRequestScalingGroup setTags(java.util.List<CreateClusterNodePoolRequestScalingGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateClusterNodePoolRequestScalingGroupTags> getTags() {
            return this.tags;
        }

        public CreateClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class CreateClusterNodePoolRequestTeeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable confidential computing for the cluster.</p>
         */
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static CreateClusterNodePoolRequestTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestTeeConfig self = new CreateClusterNodePoolRequestTeeConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
