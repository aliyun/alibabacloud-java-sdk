// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponseBody extends TeaModel {
    /**
     * <p>The list of the returned node pools.</p>
     */
    @NameInMap("nodepools")
    public java.util.List<DescribeClusterNodePoolsResponseBodyNodepools> nodepools;

    public static DescribeClusterNodePoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolsResponseBody self = new DescribeClusterNodePoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolsResponseBody setNodepools(java.util.List<DescribeClusterNodePoolsResponseBodyNodepools> nodepools) {
        this.nodepools = nodepools;
        return this;
    }
    public java.util.List<DescribeClusterNodePoolsResponseBodyNodepools> getNodepools() {
        return this.nodepools;
    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling extends TeaModel {
        /**
         * <p>The peak bandwidth of the elastic IP address (EIP).</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <br>
         * <p>*   `PayByBandwidth`: pay-by-bandwidth</p>
         * <p>*   `PayByTraffic`: pay-by-data-transfer</p>
         */
        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        /**
         * <p>Indicates whether auto scaling is enabled.</p>
         * <br>
         * <p>*   `true`: Auto scaling is enabled for the node pool.</p>
         * <p>*   `false`: Auto scaling is disabled for the node pool. If you set this parameter to `false`, other parameters in the `auto_scaling` section does not take effect.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Indicates whether an EIP is associated with the node pool. Valid values:</p>
         * <br>
         * <p>*   `true`: An EIP is associated with the node pool.</p>
         * <p>*   `false`: No EIP is associated with the node pool.</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>The maximum number of Elastic Compute Service (ECS) instances supported by the node pool.</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of ECS instances.</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The minimum number of ECS instances that must be kept in the node pool. Valid values:</p>
         * <br>
         * <p>*   `cpu`: regular instance</p>
         * <p>*   `gpu`: GPU-accelerated instance</p>
         * <p>*   `gpushare`: shared GPU-accelerated instance</p>
         * <p>*   `spot`: preemptible instance</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling self = new DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig extends TeaModel {
        @NameInMap("bandwidth")
        public Long bandwidth;

        @NameInMap("ccn_id")
        public String ccnId;

        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        @NameInMap("cen_id")
        public String cenId;

        @NameInMap("improved_period")
        public String improvedPeriod;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig extends TeaModel {
        /**
         * <p>Indicates where the CloudMonitor agent is installed on ECS nodes of the cluster. After the CloudMonitor agent is installed, you can view monitoring information about the ECS instances in the CloudMonitor console. Installation is recommended. Valid values:</p>
         * <br>
         * <p>*   `true` The CloudMonitor agent is installed on ECS nodes.</p>
         * <p>*   `false`: The CloudMonitor agent is not installed on ECS nodes.</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
         * <br>
         * <p>*   `static`: This policy allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.</p>
         * <p>*   `none`: indicates that the default CPU affinity is used.</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The labels of the nodes. You can add labels to the nodes in the cluster. You must add labels based on the following rules:</p>
         * <br>
         * <p>*   Each label is a case-sensitive key-value pair. You can add up to 20 labels.</p>
         * <p>*   A key must be unique and cannot exceed 64 characters in length. A value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with `aliyun`, `acs:`, `https://`, or `http://`. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The name of the container runtime.</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The version of the container runtime.</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The taints that are added to nodes. Taints are added to nodes to prevent pods from being scheduled to inappropriate nodes. However, toleration rules allow pods to be scheduled to nodes with matching taints. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>The user-defined data of the node pool. For more information, see [Generate user-defined data](~~49121~~).</p>
         */
        @NameInMap("user_data")
        public String userData;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Indicates whether auto upgrade is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Auto upgrade is enabled.</p>
         * <p>*   `true`: Auto upgrade is disabled.</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of nodes that can be in the unschedulable state. Valid values: 1 to 1000.</p>
         * <br>
         * <p>Default value: 1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of nodes that are temporarily added to the node pool during an auto upgrade.</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of temporary nodes to the nodes in the node pool. You must set this parameter or `surge`.</p>
         * <br>
         * <p>The number of extra nodes = The percentage of extra nodes × The number of nodes in the node pool. For example, the percentage of extra nodes is set to 50% and the number of nodes in the node pool is six. The number of extra nodes will be three.</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagement extends TeaModel {
        /**
         * <p>Indicates whether auto repair is enabled. Auto repair is enabled only when `enable=true` is specified.</p>
         * <br>
         * <p>*   `true`: Auto repair is enabled.</p>
         * <p>*   `false`: Auto repair is disabled.</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>Indicates whether managed node pools are enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Managed node pools are enabled.</p>
         * <p>*   `false`: Managed node pools are disabled. Other parameters in this section take effect only when `enable=true` is specified.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The configurations of auto upgrade. The configurations take effect only when `enable=true` is specified.</p>
         */
        @NameInMap("upgrade_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig upgradeConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagement build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagement self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagement();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setUpgradeConfig(DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo extends TeaModel {
        /**
         * <p>The time when the node pool was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>Indicates whether the node pool is a default node pool. An ACK cluster usually has only one default node pool. Valid values:</p>
         * <br>
         * <p>*   `true`: The node pool is a default node pool.</p>
         * <p>*   `false`: The node pool is not a default node pool.</p>
         */
        @NameInMap("is_default")
        public Boolean isDefault;

        /**
         * <p>The name of the node pool.</p>
         * <br>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the node pool.</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>The ID of the region where the node pool is deployed.</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the node pool belongs.</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The type of the node pool. Valid values:</p>
         * <br>
         * <p>*   `edge`: edge node pools.</p>
         * <p>*   `ess`: cloud node pools.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the node pool was last updated.</p>
         */
        @NameInMap("updated")
        public String updated;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("match_criteria")
        public String matchCriteria;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The instance type for preemptible instances.</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The price limit of a preemptible instance. Unit: USD/hour.</p>
         */
        @NameInMap("price_limit")
        public String priceLimit;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the nodes in the node pool. This parameter takes effect only when `instance_charge_type` is set to `PrePaid`. Valid values:</p>
         * <br>
         * <p>*   `true`: Auto-renewal is enabled.</p>
         * <p>*   `false`: Auto-renewal is disabled.</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of the auto-renewal. This parameter takes effect and is required only when `instance_charge_type` is set to `PrePaid`.</p>
         * <br>
         * <p>If `PeriodUnit=Month` is specified, the valid values are 1, 2, 3, 6, and 12.</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Indicates whether pay-as-you-go instances are automatically created to meet the required number of ECS instances when the preemptible instances cannot be created due to reasons such as the cost or inventory availability. This parameter takes effect when `multi_az_policy` is set to `COST_OPTIMIZED`. Valid values:</p>
         * <br>
         * <p>*   `true`: Pay-as-you-go instances are automatically created to meet the required number of ECS instances if preemptible instances cannot be created.</p>
         * <p>*   `false`: Pay-as-you-go instances are not created to meet the required number of ECS instances if preemptible instances cannot be created.</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The configurations of the data disks attached to the nodes in the node pool. The configurations include the disk type and disk size.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The ID of the custom image. You can call `DescribeKubernetesVersionMetadata` to query the images supported by ACK.</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <br>
         * <p>*   `PrePaid`: subscription</p>
         * <p>*   `PostPaid`: pay-as-you-go</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance types of the nodes in the node pool.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address of the node.</p>
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
         * <p>You must set `key_pair` if the node pool is a managed node pool.</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The password for SSH logon. You must set this parameter or the `key_pair` parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * <br>
         * <p>For security purposes, the returned password is encrypted.</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The ECS instance scaling policy for a multi-zone scaling group. Valid values:</p>
         * <br>
         * <p>*   `PRIORITY`: the scaling group is scaled based on the VSwitchIds.N parameter. When an ECS instance cannot be created in the zone where the vSwitch with the highest priority resides, the system uses the vSwitch with the next highest priority to create the ECS instance.</p>
         * <br>
         * <p>*   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferentially created when multiple instance types are specified in the scaling configurations. You can set the `CompensateWithOnDemand` parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note** `COST_OPTIMIZED` is valid only when multiple instance types are specified or at least one preemptible instance type is specified.</p>
         * <br>
         * <p>*   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call `RebalanceInstances` of Auto Scaling (ESS) to balance the instance distribution among zones. For more information, see [RebalanceInstances](~~71516~~).</p>
         */
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. When the number of pay-as-you-go instances is lower than this value, pay-as-you-go instances are preferentially created to meet the required number.</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the number specified by `on_demand_base_capacity`. Valid values: 0 to 100.</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of worker nodes. This parameter takes effect and is required only when `instance_charge_type` is set to `PrePaid`.</p>
         * <br>
         * <p>If `PeriodUnit=Month` is specified, the valid values are 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes. This parameter takes effect only when `instance_charge_type` is set to `PrePaid`.</p>
         * <br>
         * <p>Valid value: `Month`</p>
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
         */
        @NameInMap("platform")
        public String platform;

        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.</p>
         */
        @NameInMap("ram_policy")
        public String ramPolicy;

        /**
         * <p>The IDs of the ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The ID of the scaling group.</p>
         */
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   `release`: the standard mode. ECS instances are created and released based on the resource usage.</p>
         * <p>*   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances attached with local disks.</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The ID of the security group to which the node pool is added. If the node pool is added to multiple security groups, the first ID in the value of `security_group_ids` is returned.</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which the node pool is added.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of available instance types. The scaling group creates preemptible instances of multiple instance types at the lowest cost. Valid values: 1 to 10.</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Indicates whether preemptible instances are supplemented when the number of preemptible instances drops below the specified minimum number. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values:</p>
         * <br>
         * <p>*   `true`: Supplement to preemptible instances is enabled.</p>
         * <p>*   `false`: Supplement to preemptible instances is disabled.</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The bid configurations of preemptible instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy of preemptible instances. Valid values:</p>
         * <br>
         * <p>*   NoSpot: non-preemptible instance.</p>
         * <p>*   SpotWithPriceLimit: specifies the highest bid for the preemptible instance.</p>
         * <p>*   SpotAsPriceGo: automatically submits bids based on the up-to-date market price.</p>
         * <br>
         * <p>For more information, see [Preemptible instances](~~157759~~).</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>The type of system disk. Valid values:</p>
         * <br>
         * <p>*   `cloud_efficiency`: ultra disk</p>
         * <p>*   `cloud_ssd`: standard SSD</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The system disk size of a worker node. Unit: GiB.</p>
         * <br>
         * <p>Valid values: 20 to 500</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The labels that are added only to ECS instances.</p>
         * <br>
         * <p>A key must be unique and cannot exceed 128 characters in length. Neither keys nor values can start with aliyun or acs:. Neither keys nor values can contain https:// or http://.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The IDs of vSwitches.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPrivatePoolOptions(DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setRamPolicy(String ramPolicy) {
            this.ramPolicy = ramPolicy;
            return this;
        }
        public String getRamPolicy() {
            return this.ramPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotPriceLimit(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsStatus extends TeaModel {
        /**
         * <p>The number of failed nodes.</p>
         */
        @NameInMap("failed_nodes")
        public Long failedNodes;

        /**
         * <p>The number of healthy nodes.</p>
         */
        @NameInMap("healthy_nodes")
        public Long healthyNodes;

        /**
         * <p>The number of nodes that are being created.</p>
         */
        @NameInMap("initial_nodes")
        public Long initialNodes;

        /**
         * <p>The number of offline nodes.</p>
         */
        @NameInMap("offline_nodes")
        public Long offlineNodes;

        /**
         * <p>The number of nodes that are being removed.</p>
         */
        @NameInMap("removing_nodes")
        public Long removingNodes;

        /**
         * <p>The number of running nodes.</p>
         */
        @NameInMap("serving_nodes")
        public Long servingNodes;

        /**
         * <p>The status of the node pool. Valid values:</p>
         * <br>
         * <p>*   `active`: The node pool is active.</p>
         * <p>*   `scaling`: The node pool is being scaled.</p>
         * <p>*   `removing`: Nodes are being removed from the node pool.</p>
         * <p>*   `deleting`: The node pool is being deleted.</p>
         * <p>*   `updating`: The node pool is being updated.</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The total number of nodes in the node pool.</p>
         */
        @NameInMap("total_nodes")
        public Long totalNodes;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsStatus self = new DescribeClusterNodePoolsResponseBodyNodepoolsStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setFailedNodes(Long failedNodes) {
            this.failedNodes = failedNodes;
            return this;
        }
        public Long getFailedNodes() {
            return this.failedNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setHealthyNodes(Long healthyNodes) {
            this.healthyNodes = healthyNodes;
            return this;
        }
        public Long getHealthyNodes() {
            return this.healthyNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setInitialNodes(Long initialNodes) {
            this.initialNodes = initialNodes;
            return this;
        }
        public Long getInitialNodes() {
            return this.initialNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setOfflineNodes(Long offlineNodes) {
            this.offlineNodes = offlineNodes;
            return this;
        }
        public Long getOfflineNodes() {
            return this.offlineNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setRemovingNodes(Long removingNodes) {
            this.removingNodes = removingNodes;
            return this;
        }
        public Long getRemovingNodes() {
            return this.removingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setServingNodes(Long servingNodes) {
            this.servingNodes = servingNodes;
            return this;
        }
        public Long getServingNodes() {
            return this.servingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setTotalNodes(Long totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Long getTotalNodes() {
            return this.totalNodes;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig extends TeaModel {
        /**
         * <p>Indicates whether confidential computing is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: confidential computing is enabled.</p>
         * <p>*   `false`: confidential computing is disabled.</p>
         */
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepools extends TeaModel {
        /**
         * <p>The configurations of auto scaling.</p>
         */
        @NameInMap("auto_scaling")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling;

        @NameInMap("interconnect_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig interconnectConfig;

        @NameInMap("interconnect_mode")
        public String interconnectMode;

        /**
         * <p>The configurations of the cluster.</p>
         */
        @NameInMap("kubernetes_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig;

        /**
         * <p>The configurations of managed node pools. Managed node pools are available only in professional managed Kubernetes clusters.</p>
         */
        @NameInMap("management")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement management;

        @NameInMap("max_nodes")
        public Long maxNodes;

        /**
         * <p>The information about the node pool.</p>
         */
        @NameInMap("nodepool_info")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo;

        /**
         * <p>The configurations of the scaling group.</p>
         */
        @NameInMap("scaling_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup;

        /**
         * <p>The status details about the node pool.</p>
         */
        @NameInMap("status")
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus status;

        /**
         * <p>The configurations of confidential computing.</p>
         */
        @NameInMap("tee_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig teeConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepools build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepools self = new DescribeClusterNodePoolsResponseBodyNodepools();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setAutoScaling(DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling getAutoScaling() {
            return this.autoScaling;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setInterconnectConfig(DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig getInterconnectConfig() {
            return this.interconnectConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setInterconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }
        public String getInterconnectMode() {
            return this.interconnectMode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setKubernetesConfig(DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setManagement(DescribeClusterNodePoolsResponseBodyNodepoolsManagement management) {
            this.management = management;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement getManagement() {
            return this.management;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setMaxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }
        public Long getMaxNodes() {
            return this.maxNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setNodepoolInfo(DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo getNodepoolInfo() {
            return this.nodepoolInfo;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setScalingGroup(DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setStatus(DescribeClusterNodePoolsResponseBodyNodepoolsStatus status) {
            this.status = status;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus getStatus() {
            return this.status;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setTeeConfig(DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig teeConfig) {
            this.teeConfig = teeConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig getTeeConfig() {
            return this.teeConfig;
        }

    }

}
