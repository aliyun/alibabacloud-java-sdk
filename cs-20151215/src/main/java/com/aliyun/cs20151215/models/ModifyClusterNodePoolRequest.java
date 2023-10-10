// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The configurations about auto scaling.</p>
     */
    @NameInMap("auto_scaling")
    public ModifyClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p>The configurations about the cluster.</p>
     */
    @NameInMap("kubernetes_config")
    public ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations about the managed node pool feature.</p>
     */
    @NameInMap("management")
    public ModifyClusterNodePoolRequestManagement management;

    /**
     * <p>The configurations of the node pool.</p>
     */
    @NameInMap("nodepool_info")
    public ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group.</p>
     */
    @NameInMap("scaling_group")
    public ModifyClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The configurations about confidential computing for the cluster.</p>
     */
    @NameInMap("tee_config")
    public ModifyClusterNodePoolRequestTeeConfig teeConfig;

    /**
     * <p>Specifies whether to update node information, such as labels and taints.</p>
     */
    @NameInMap("update_nodes")
    public Boolean updateNodes;

    public static ModifyClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolRequest self = new ModifyClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolRequest setAutoScaling(ModifyClusterNodePoolRequestAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public ModifyClusterNodePoolRequestAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    public ModifyClusterNodePoolRequest setKubernetesConfig(ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public ModifyClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public ModifyClusterNodePoolRequest setManagement(ModifyClusterNodePoolRequestManagement management) {
        this.management = management;
        return this;
    }
    public ModifyClusterNodePoolRequestManagement getManagement() {
        return this.management;
    }

    public ModifyClusterNodePoolRequest setNodepoolInfo(ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public ModifyClusterNodePoolRequestNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public ModifyClusterNodePoolRequest setScalingGroup(ModifyClusterNodePoolRequestScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public ModifyClusterNodePoolRequestScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public ModifyClusterNodePoolRequest setTeeConfig(ModifyClusterNodePoolRequestTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public ModifyClusterNodePoolRequestTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public ModifyClusterNodePoolRequest setUpdateNodes(Boolean updateNodes) {
        this.updateNodes = updateNodes;
        return this;
    }
    public Boolean getUpdateNodes() {
        return this.updateNodes;
    }

    public static class ModifyClusterNodePoolRequestAutoScaling extends TeaModel {
        /**
         * <p>The peak bandwidth of the EIP.</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
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
         * <p>*   `true`: enables auto scaling for the node pool.</p>
         * <p>*   `false`: disables auto scaling for the node pool. If you set this parameter to false, other parameters in the `auto_scaling` section do not take effect.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Specifies whether to associate an EIP with the node pool. Valid values:</p>
         * <br>
         * <p>*   `true`: associates an EIP with the node pool.</p>
         * <p>*   `false`: does not associate an EIP with the node pool.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>The maximum number of Elastic Compute Service (ECS) instances that can be created in the node pool.</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of ECS instances that must be kept in the node pool.</p>
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

        public static ModifyClusterNodePoolRequestAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestAutoScaling self = new ModifyClusterNodePoolRequestAutoScaling();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public ModifyClusterNodePoolRequestAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public ModifyClusterNodePoolRequestAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyClusterNodePoolRequestAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public ModifyClusterNodePoolRequestAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public ModifyClusterNodePoolRequestAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public ModifyClusterNodePoolRequestAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyClusterNodePoolRequestKubernetesConfig extends TeaModel {
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
         * <p>The labels that you want to add to the nodes in the cluster. You must add labels based on the following rules:</p>
         * <br>
         * <p>*   Each label is a case-sensitive key-value pair. You can add up to 20 labels.</p>
         * <p>*   A key must be unique and cannot exceed 64 characters in length. A value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with `aliyun`, `acs:`, `https://`, or `http://`. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

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
         * <p>The configurations of node taints.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>The user-defined data of the node pool. For more information, see [Prepare user data](~~49121~~).</p>
         */
        @NameInMap("user_data")
        public String userData;

        public static ModifyClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestKubernetesConfig self = new ModifyClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ModifyClusterNodePoolRequestManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto update.</p>
         * <br>
         * <p>*   true: enables auto update.</p>
         * <p>*   false: disables auto update.</p>
         * <br>
         * <p>Default value: `true`.</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of nodes that can be in the Unavailable state.</p>
         * <br>
         * <p>Valid values: 1 to 1000.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of additional nodes. Additional nodes are used to host the workloads of nodes that are being updated.</p>
         * <br>
         * <p>> We recommend that you set the number of additional nodes to a value that is no greater than the current number of nodes.</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of additional nodes to the nodes in the node pool. You must set this parameter or `surge`.</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static ModifyClusterNodePoolRequestManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagementUpgradeConfig self = new ModifyClusterNodePoolRequestManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class ModifyClusterNodePoolRequestManagement extends TeaModel {
        /**
         * <p>Specifies whether to enable auto repair. This parameter takes effect only when you specify `enable=true`. Valid values:</p>
         * <br>
         * <p>*   `true`: enables auto repair.</p>
         * <p>*   `false`: disables auto repair.</p>
         * <br>
         * <p>Default value: `true`.</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
         * <br>
         * <p>*   `true`: enables the managed node pool feature.</p>
         * <p>*   `false`: disables the managed node pool feature. Other parameters in this section take effect only when `enable=true` is specified.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The configurations about auto update. The configurations take effect only when you specify `enable=true`.</p>
         */
        @NameInMap("upgrade_config")
        public ModifyClusterNodePoolRequestManagementUpgradeConfig upgradeConfig;

        public static ModifyClusterNodePoolRequestManagement build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagement self = new ModifyClusterNodePoolRequestManagement();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public ModifyClusterNodePoolRequestManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyClusterNodePoolRequestManagement setUpgradeConfig(ModifyClusterNodePoolRequestManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public ModifyClusterNodePoolRequestManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class ModifyClusterNodePoolRequestNodepoolInfo extends TeaModel {
        /**
         * <p>The name of the node pool.</p>
         * <br>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        public static ModifyClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestNodepoolInfo self = new ModifyClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyClusterNodePoolRequestNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private node pool.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of private node pool. This parameter specifies the type of private pool that you want to use to create instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. The system selects a private pool to start instances. Valid values:</p>
         * <br>
         * <p>*   `Open`: open private pool. The system selects an open private pool to start instances. If no matching open private pools are available, the resources in the public pool are used.</p>
         * <p>*   `Target`: specific private pool. The system uses the resources of the specified private pool to start instances. If the specified private pool is unavailable, instances cannot be started.</p>
         * <p>*   `None`: no private pool is used. The resources of private pools are not used to start instances.</p>
         */
        @NameInMap("match_criteria")
        public String matchCriteria;

        public static ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions self = new ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit extends TeaModel {
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

        public static ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit self = new ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroup extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal for the nodes in the node pool. This parameter takes effect only when you set `instance_charge_type` to `PrePaid`. Valid values:</p>
         * <br>
         * <p>*   `true`: enables auto-renewal.</p>
         * <p>*   `false`: disables auto-renewal.</p>
         * <br>
         * <p>Default value: `true`.</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of the auto-renewal. This parameter takes effect and is required only when you set `instance_charge_type` to `PrePaid`.</p>
         * <br>
         * <p>If you specify `PeriodUnit=Month`, the valid values are 1, 2, 3, 6, and 12.</p>
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
         * <p>The configurations of the data disks that are mounted to the nodes in the node pool. You can mount 0 to 10 data disks. You can mount at most 10 data disks to the nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The ID of the custom image. You can call the `DescribeKubernetesVersionMetadata` operation to query the supported images. By default, the latest image is used.</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <br>
         * <p>*   `PrePaid`: subscription.</p>
         * <p>*   `PostPaid`: pay-as-you-go.</p>
         * <br>
         * <p>Default value: `PostPaid`.</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>A list of instance types. You can select multiple instance types. When the system needs to create a node, it starts from the first instance type until the node is created. The instance type that is used to create the node varies based on the actual instance stock.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The metering method of the public IP address. Valid values:</p>
         * <br>
         * <p>*   `PayByBandwidth`: pay-by-bandwidth.</p>
         * <p>*   `PayByTraffic`: pay-by-data-transfer.</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth of the public IP address of the node. Unit: Mbit/s. Valid values: 1 to 100.</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must set this parameter or the `login_password` parameter. You must set `key_pair` if the node pool is a managed node pool.</p>
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
         * <p>*   `PRIORITY`: The scaling group is scaled based on the VSwitchIds.N parameter. If an ECS instance cannot be created in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates the ECS instance in the zone where the vSwitch that has the next highest priority resides.</p>
         * <br>
         * <p>*   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configuration. You can set the `CompensateWithOnDemand` parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note**The `COST_OPTIMIZED` setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
         * <br>
         * <p>*   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call the `RebalanceInstances` operation of Auto Scaling to balance the instance distribution among zones. For more information, see [RebalanceInstances](~~71516~~).</p>
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
         * <p>The subscription duration of worker nodes. This parameter takes effect and is required only when `instance_charge_type` is set to `PrePaid`.</p>
         * <br>
         * <p>If `PeriodUnit=Month` is specified, the valid values are 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes in the node pool. This parameter is required if you set `instance_charge_type` to `PrePaid`.</p>
         * <br>
         * <p>The billing cycle is measured only in months.</p>
         * <br>
         * <p>Default value: `Month`.</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The OS platform. Valid values:</p>
         * <br>
         * <p>*   `AliyunLinux`</p>
         * <p>*   `CentOS`</p>
         * <p>*   `Windows`</p>
         * <p>*   `WindowsCore`</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The configurations of the private node pool.</p>
         */
        @NameInMap("private_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>A list of ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   `release`: the standard mode. ECS instances are created and released based on resource usage.</p>
         * <p>*   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances that are attached with local disks.</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to supplement preemptible instances. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values:</p>
         * <br>
         * <p>*   `true`: enables the supplementation of preemptible instances.</p>
         * <p>*   `false`: disables the supplementation of preemptible instances.</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The bid configurations of preemptible instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy of preemptible instances. Valid values:</p>
         * <br>
         * <p>*   `NoSpot`: non-preemptible instance.</p>
         * <p>*   `SpotWithPriceLimit`: specifies the highest bid for the preemptible instance.</p>
         * <p>*   `SpotAsPriceGo`: automatically submits bids based on the up-to-date market price.</p>
         * <br>
         * <p>For more information, see [Preemptible instances](~~157759~~).</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>The type of system disk. Valid values:</p>
         * <br>
         * <p>*   `cloud_efficiency`: ultra disk.</p>
         * <p>*   `cloud_ssd`: standard SSD.</p>
         * <br>
         * <p>Default value: `cloud_ssd`.</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level (PL) of the system disk that you want to use for the node. This parameter takes effect only for enhanced SSDs. You can specify a higher PL if you increase the size of the system disk. For more information, see [ESSDs](~~122389~~).</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The system disk size of a node. Unit: GiB.</p>
         * <br>
         * <p>Valid values: 20 to 500.</p>
         * <br>
         * <p>The value of this parameter must be at least 20 and greater than or equal to the size of the specified image.</p>
         * <br>
         * <p>The default value is the greater one between 40 and the image size.</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The labels that you want to add to the ECS instances.</p>
         * <br>
         * <p>A key must be unique and cannot exceed 128 characters in length. Neither keys nor values can start with aliyun or acs:. Neither keys nor values can contain https:// or http://.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The IDs of vSwitches. You can specify 1 to 20 vSwitches.</p>
         * <br>
         * <p>> We recommend that you select vSwitches in different zones to ensure high availability.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static ModifyClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroup self = new ModifyClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ModifyClusterNodePoolRequestScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public ModifyClusterNodePoolRequestScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public ModifyClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public ModifyClusterNodePoolRequestScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public ModifyClusterNodePoolRequestScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public ModifyClusterNodePoolRequestScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public ModifyClusterNodePoolRequestScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ModifyClusterNodePoolRequestScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public ModifyClusterNodePoolRequestScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPrivatePoolOptions(ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public ModifyClusterNodePoolRequestScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public ModifyClusterNodePoolRequestScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotPriceLimit(java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ModifyClusterNodePoolRequestScalingGroup setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public ModifyClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class ModifyClusterNodePoolRequestTeeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable confidential computing for the cluster. Valid values:</p>
         * <br>
         * <p>*   `true`: enables confidential computing for the cluster.</p>
         * <p>*   `false`: disables confidential computing for the cluster.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static ModifyClusterNodePoolRequestTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestTeeConfig self = new ModifyClusterNodePoolRequestTeeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
