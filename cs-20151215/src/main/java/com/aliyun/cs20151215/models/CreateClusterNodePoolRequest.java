// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The configurations of auto scaling.</p>
     */
    @NameInMap("auto_scaling")
    public CreateClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p>This parameter is discontinued. Use desired_size.</p>
     * <br>
     * <p>The number of nodes in the node pool.</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p>This parameter is discontinued.</p>
     * <br>
     * <p>The configurations of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public CreateClusterNodePoolRequestInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter takes effect only if you set the `type` parameter of the node pool to `edge`. Valid values:</p>
     * <br>
     * <p>*   `basic`: basic.</p>
     * <p>*   `private`: dedicated. Only Kubernetes 1.22 and later support this value.</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>The cluster configurations.</p>
     */
    @NameInMap("kubernetes_config")
    public CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations of the managed node pool feature.</p>
     */
    @NameInMap("management")
    public CreateClusterNodePoolRequestManagement management;

    /**
     * <p>The maximum number of nodes that can be created in the edge node pool. The value of this parameter must be greater than or equal to 0. A value of 0 indicates that the number of nodes in the node pool is limited only by the quota of nodes in the cluster. In most cases, this parameter is set to a value greater than 0 for edge node pools. This parameter is set to 0 for node pools whose types are ess or default edge node pools.</p>
     */
    @NameInMap("max_nodes")
    @Deprecated
    public Long maxNodes;

    /**
     * <p>The node configurations.</p>
     */
    @NameInMap("node_config")
    public CreateClusterNodePoolRequestNodeConfig nodeConfig;

    /**
     * <p>The configurations of the node pool.</p>
     */
    @NameInMap("nodepool_info")
    public CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group that is used by the node pool.</p>
     */
    @NameInMap("scaling_group")
    public CreateClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The configurations of confidential computing for the cluster.</p>
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

    public CreateClusterNodePoolRequest setNodeConfig(CreateClusterNodePoolRequestNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public CreateClusterNodePoolRequestNodeConfig getNodeConfig() {
        return this.nodeConfig;
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
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Important** This parameter is discontinued. Use internet_charge_type and internet_max_bandwidth_out.</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The billing method of the EIP. Valid values:</p>
         * <br>
         * <p>*   `PayByBandwidth`: pay-by-bandwidth</p>
         * <p>*   `PayByTraffic`: pay-by-data-transfer</p>
         * <br>
         * <p>Default value: `PayByBandwidth`.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Important** This parameter is discontinued. Use internet_charge_type and internet_max_bandwidth_out.</p>
         */
        @NameInMap("eip_internet_charge_type")
        @Deprecated
        public String eipInternetChargeType;

        /**
         * <p>Specifies whether to enable auto scaling for the node pool. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`: If you set this parameter to false, other parameters of `auto_scaling` object do not take effect.</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>Specifies whether to associate an elastic IP address (EIP) with the node pool. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>Default value: `false`.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Important** This parameter is discontinued. Use internet_charge_type and internet_max_bandwidth_out.</p>
         */
        @NameInMap("is_bond_eip")
        @Deprecated
        public Boolean isBondEip;

        /**
         * <p>The maximum number of instances that can be automatically scaled. The number of nodes in the node pool cannot be greater than this value. This parameter takes effect only if `enable` is set to true. Valid values: [min_instances, 2000]. Default value: 0.</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of instances that can be automatically scaled. The number of nodes in the node pool cannot be smaller than this value. This parameter takes effect only if `enable` is set to true. Valid values: [0, max_instances]. Default value: 0.</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The type of instances that are automatically scaled. This parameter takes effect only if `enable` is set to true. Valid values:</p>
         * <br>
         * <p>*   `cpu`: regular instance</p>
         * <p>*   `gpu`: GPU-accelerated instance</p>
         * <p>*   `gpushare`: shared GPU-accelerated instance</p>
         * <p>*   `spot`: preemptible instance</p>
         * <br>
         * <p>Default value: `cpu`.</p>
         * <br>
         * <p>>  You cannot modify this parameter after the node pool is created.</p>
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
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The bandwidth of the enhanced edge node pool. Unit: Mbit/s.</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The ID of the Cloud Connect Network (CCN) instance that is associated with the enhanced edge node pool.</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The region in which the CCN instance that is associated with the enhanced edge node pool resides.</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the enhanced edge node pool.</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>This parameter is discontinued.</p>
         * <br>
         * <p>The subscription duration of the enhanced edge node pool. Unit: months.</p>
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
         * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After the CloudMonitor agent is installed on ECS nodes, you can view the monitoring information about the instances in the CloudMonitor console. We recommend that you install the CloudMonitor agent. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy of the nodes in the node pool. The following policies are supported if the version of the cluster is Kubernetes 1.12.6 or later:</p>
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
         * <p>The custom node name. A custom node name consists of a prefix, a node IP address, and a suffix.</p>
         * <br>
         * <p>*   The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.</p>
         * <p>*   The node IP address is the complete private IP address of the node.</p>
         * <br>
         * <p>Set the parameter to a value that is in the customized,aliyun,ip,com format. The value consists of four parts that are separated by commas (,). customized and ip are fixed content. aliyun is the prefix and com is the suffix. Example: aliyun.192.168.xxx.xxx.com.</p>
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
         * <p>The taint configurations.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Specifies whether the nodes are schedulable after a scale-out operation is performed.</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>The user-defined data on nodes.</p>
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

        public CreateClusterNodePoolRequestKubernetesConfig setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateClusterNodePoolRequestManagementAutoRepairPolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow node restart. This parameter takes effect only if `auto_repair` is set to true. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>If `auto_repair` is set to true, the default value of this parameter is `true`. If `auto_repair` is set to false, the default value of this parameter is `false`.</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        public static CreateClusterNodePoolRequestManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementAutoRepairPolicy self = new CreateClusterNodePoolRequestManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementAutoRepairPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

    }

    public static class CreateClusterNodePoolRequestManagementAutoUpgradePolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow auto update of the kubelet. This parameter takes effect only if `auto_upgrade` is set to true. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>If `auto_upgrade` is set to true, the default value of this parameter is `true`. If `auto_upgrade` is set to false, the default value of this parameter is `false`.</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        /**
         * <p>是否允许自动升级操作系统，仅当`auto_upgrade=true`时生效。取值：</p>
         * <p>- `true`：允许自动升级操作系统。</p>
         * <p>- `false`：不允许自动升级操作系统。</p>
         * <br>
         * <br>
         * <p>默认值为`false`</p>
         */
        @NameInMap("auto_upgrade_os")
        public Boolean autoUpgradeOs;

        /**
         * <p>是否允许自动升级运行时，仅当`auto_upgrade=true`时生效。取值：</p>
         * <p>- `true`：允许自动升级运行时。</p>
         * <p>- `false`：不允许自动升级运行时。</p>
         * <br>
         * <p>默认值为`false`</p>
         */
        @NameInMap("auto_upgrade_runtime")
        public Boolean autoUpgradeRuntime;

        public static CreateClusterNodePoolRequestManagementAutoUpgradePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementAutoUpgradePolicy self = new CreateClusterNodePoolRequestManagementAutoUpgradePolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeKubelet(Boolean autoUpgradeKubelet) {
            this.autoUpgradeKubelet = autoUpgradeKubelet;
            return this;
        }
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeOs(Boolean autoUpgradeOs) {
            this.autoUpgradeOs = autoUpgradeOs;
            return this;
        }
        public Boolean getAutoUpgradeOs() {
            return this.autoUpgradeOs;
        }

        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeRuntime(Boolean autoUpgradeRuntime) {
            this.autoUpgradeRuntime = autoUpgradeRuntime;
            return this;
        }
        public Boolean getAutoUpgradeRuntime() {
            return this.autoUpgradeRuntime;
        }

    }

    public static class CreateClusterNodePoolRequestManagementAutoVulFixPolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow node restart. This parameter takes effect only if `auto_vul_fix` is set to true. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false` If `auto_vul_fix` is set to true, the default value of this parameter is `false`. If `auto_vul_fix` is set to false, the default value of this parameter is `false`.</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The level of CVEs that can be automatically patched. Separate multiple levels with commas (,). Example: `asap,later`. Valid values:</p>
         * <br>
         * <p>*   `asap`: high</p>
         * <p>*   `later`: medium</p>
         * <p>*   `nntf`: low</p>
         * <br>
         * <p>If `auto_vul_fix` is set to true, the default value of this parameter is `asap`.</p>
         */
        @NameInMap("vul_level")
        public String vulLevel;

        public static CreateClusterNodePoolRequestManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementAutoVulFixPolicy self = new CreateClusterNodePoolRequestManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class CreateClusterNodePoolRequestManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto update. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Important** This parameter is discontinued. Use the preceding auto_upgrade parameter.</p>
         */
        @NameInMap("auto_upgrade")
        @Deprecated
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of unavailable nodes. Valid values: 1 to 1000.</p>
         * <br>
         * <p>Default value: 1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of additional nodes.</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of additional nodes to the total nodes in the node pool. You must specify this parameter or the `surge` parameter.</p>
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
         * <p>Specifies whether to enable auto node repair. This parameter takes effect only if `enable` is set to true.</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>If `enable` is set to true, the default value of this parameter is `true`. If `enable` is set to false, the default value of this parameter is `false`.</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto node repair policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public CreateClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Specifies whether to enable auto node update. This parameter takes effect only if `enable` is set to true.</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>If `enable` is set to true, the default value of this parameter is `true`. If `enable` is set to false, the default value of this parameter is `false`.</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The auto node update policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Specifies whether to enable auto CVE patching. This parameter takes effect only if `enable` is set to true.</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>If `enable` is set to true, the default value of this parameter is `true`. If `enable` is set to false, the default value of this parameter is `false`.</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The auto CVE patching policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`: If you set this parameter to false, other parameters of management do not take effect.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The configurations of auto update. This parameter takes effect only if `enable` is set to true.</p>
         */
        @NameInMap("upgrade_config")
        @Deprecated
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

        public CreateClusterNodePoolRequestManagement setAutoRepairPolicy(CreateClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy) {
            this.autoRepairPolicy = autoRepairPolicy;
            return this;
        }
        public CreateClusterNodePoolRequestManagementAutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        public CreateClusterNodePoolRequestManagement setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public CreateClusterNodePoolRequestManagement setAutoUpgradePolicy(CreateClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy) {
            this.autoUpgradePolicy = autoUpgradePolicy;
            return this;
        }
        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        public CreateClusterNodePoolRequestManagement setAutoVulFix(Boolean autoVulFix) {
            this.autoVulFix = autoVulFix;
            return this;
        }
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        public CreateClusterNodePoolRequestManagement setAutoVulFixPolicy(CreateClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy) {
            this.autoVulFixPolicy = autoVulFixPolicy;
            return this;
        }
        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
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

    public static class CreateClusterNodePoolRequestNodeConfig extends TeaModel {
        /**
         * <p>The parameter settings of the kubelet.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        public static CreateClusterNodePoolRequestNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeConfig self = new CreateClusterNodePoolRequestNodeConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeConfig setKubeletConfiguration(KubeletConfig kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
            return this;
        }
        public KubeletConfig getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

    }

    public static class CreateClusterNodePoolRequestNodepoolInfo extends TeaModel {
        /**
         * <p>The name of the node pool.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the resource group. Instances that are added to the node pool belong to this resource group.</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The type of the node pool. Valid values:</p>
         * <br>
         * <p>*   `ess`: regular node pool, which supports the managed node pool feature and auto scaling feature.</p>
         * <p>*   `edge`: edge node pool.</p>
         * <p>*   `lingjun`: Lingjun node pool.</p>
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
         * <p>The type of the private node pool. This parameter specifies the type of private node pool that is used to create instances. A private node pool is generated when an elasticity assurance or a capacity reservation service takes effect. The system selects a private node pool to launch instances. Valid values:</p>
         * <br>
         * <p>*   `Open`: uses open private pool. The system selects an open private pool to start instances. If no matching open private node pool is available, the resources in the public node pool are used.</p>
         * <p>*   `Target`: uses the specified private node pool. The system uses the resources of the specified private pool to start instances. If the specified private pool is unavailable, instances cannot be started.</p>
         * <p>*   `None`: No private pool is used. The resources of private pools are not used to start instances.</p>
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
         * <p>The instance type of preemptible instance.</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The price cap of a preemptible instance of the type.</p>
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
         * <p>The tag key.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>Specifies whether to enable auto-renewal for the nodes in the node pool. This parameter takes effect only if you set `instance_charge_type` to `PrePaid`. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>Default value: `true`.</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of the auto-renewal. This parameter takes effect and is required only if you set instance_charge_type to PrePaid and auto_renew to true. Valid values if `period_unit` is set to Month: 1, 2, 3, 6, and 12.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Specifies whether to enable Center for Internet Security (CIS) reinforcement. CIS reinforcement can be enabled only if Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 is installed on nodes.</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as the cost or insufficient inventory. This parameter takes effect if you set `multi_az_policy` to `COST_OPTIMIZED`. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The configurations of the data disks that are mounted to the nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The deployment set ID.</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The custom image ID. By default, the image provided by the system is used.</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the operating system image. You must specify this parameter or the `platform` parameter. Valid values:</p>
         * <br>
         * <p>*   `AliyunLinux`: Alinux2</p>
         * <p>*   `AliyunLinux3`: Alinux3</p>
         * <p>*   `AliyunLinux3Arm64`: Alinux3 ARM</p>
         * <p>*   `AliyunLinuxUEFI`: Alinux2 UEFI</p>
         * <p>*   `CentOS`</p>
         * <p>*   `Windows`</p>
         * <p>*   `WindowsCore`: Windows Core</p>
         * <p>*   `ContainerOS`</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <br>
         * <p>*   `PrePaid`: subscription</p>
         * <p>*   `PostPaid`: pay-as-you-go</p>
         * <br>
         * <p>Default value: `PostPaid`.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance types of nodes in the node pool. A node that is added to the node pool is assigned one of the specified instance types that is the most appropriate. You can specify 1 to 10 instance types.</p>
         * <br>
         * <p>>  To ensure high availability, we recommend that you specify multiple instance types.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByTraffic: pay-by-data-transfer</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth of the public IP address. Unit: Mbit/s. Valid values: 1 to 100.</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify this parameter or the `login_password` parameter.</p>
         * <br>
         * <p>>  If you want to create a managed node pool, you must specify `key_pair`.</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Specifies whether a non-root user can log on to the ECS instance that is added to the node pool.</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The password for SSH logon. You must specify this parameter or the `key_pair` parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The ECS instance scaling policy for the multi-zone scaling group. Valid values:</p>
         * <br>
         * <p>*   `PRIORITY`: ECS instances are created based on the VSwitchIds.N parameter. If Auto Scaling fails to create an ECS instance in the zone of the vSwitch that has the highest priority, Auto Scaling attempts to create the ECS instance in the zone of the vSwitch that has a lower priority.</p>
         * <br>
         * <p>*   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configurations. You can specify `CompensateWithOnDemand` to specify whether to automatically create pay-as-you-go instances if preemptible instances cannot be created due to insufficient resources.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note** `COST_OPTIMIZED` takes effect only if multiple instance types are specified or at least one preemptible instance type is specified.</p>
         * <br>
         * <p>*   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If the distribution of ECS instances across zones is not balanced due to reasons such as insufficient inventory, you can call the [RebalanceInstances](https://help.aliyun.com/document_detail/71516.html) operation to evenly distribute the ECS instances across zones.</p>
         * <br>
         * <p>Default value: `PRIORITY`.</p>
         */
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is smaller than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the number specified by `on_demand_base_capacity`. Valid values: 0 to 100.</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the nodes in the node pool. This parameter takes effect and is required if you set `instance_charge_type` to `PrePaid`.</p>
         * <br>
         * <p>*   If `period_unit` is set to Week, the valid values of `period` are 1, 2, 3, and 4.</p>
         * <p>*   If `period_unit` is set to Month, the valid values of `period` are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes in the node pool. This parameter takes effect and is required if you set `instance_charge_type` to `PrePaid`. Valid values:</p>
         * <br>
         * <p>*   `Month`: The subscription duration is measured in months.</p>
         * <p>*   `Week`: The subscription duration is measured in weeks.</p>
         * <br>
         * <p>Default value: `Month`.</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The operating system distribution. Valid values:</p>
         * <br>
         * <p>*   `CentOS`</p>
         * <p>*   `AliyunLinux`</p>
         * <p>*   `Windows`</p>
         * <p>*   `WindowsCore`</p>
         * <br>
         * <p>Default value: `AliyunLinux`.</p>
         */
        @NameInMap("platform")
        @Deprecated
        public String platform;

        /**
         * <p>The configurations of the private node pool.</p>
         */
        @NameInMap("private_pool_options")
        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   `release`: the standard mode. ECS instances are created and released based on the resource usage.</p>
         * <p>*   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances that are attached with local disks.</p>
         * <br>
         * <p>Default value: `release`.</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The ID of the security group to which you want to add the node pool. You must specify this parameter or the `security_group_ids` parameter. We recommend that you specify `security_group_ids`.</p>
         */
        @NameInMap("security_group_id")
        @Deprecated
        public String securityGroupId;

        /**
         * <p>The security group IDs. You must specify this parameter or the `security_group_id` parameter. We recommend that you specify `security_group_ids`. If you specify both `security_group_id` and `security_group_ids`, `security_group_ids` is used.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>阿里云OS安全加固。取值：</p>
         * <br>
         * <p>- `true`：开启阿里云OS安全加固。</p>
         * <p>- `false`：不开启阿里云OS安全加固。</p>
         * <br>
         * <p>默认值：`false`。</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>Specifies whether to enable reinforcement based on classified protection. You can enable reinforcement based on classified protection only if Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 is installed on nodes. Alibaba Cloud provides standards for baseline check and a scanner to ensure the compliance of Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 images with the level 3 standards of classified protection.</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable the supplementation of preemptible instances. If the supplementation of preemptible instances is enabled, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The instance type of preemptible instance and the price cap for the instance type.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy of preemptible instances. Valid values:</p>
         * <br>
         * <p>*   `NoSpot`: non-preemptible.</p>
         * <p>*   `SpotWithPriceLimit`: specifies the highest bid.</p>
         * <p>*   `SpotAsPriceGo`: automatically submits bids based on the up-to-date market price.</p>
         * <br>
         * <p>For more information, see [Use preemptible instances](https://help.aliyun.com/document_detail/165053.html).</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>This parameter is available only if `SystemDiskCategory` is set to `cloud_auto`. For more information, see [ESSD AutoPL disks](https://help.aliyun.com/document_detail/368372.html).</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The system disk types. The system attempts to create system disks of a disk type with a lower priority if the disk type with a higher priority is unavailable. Valid values: cloud: disk cloud_efficiency: ultra disk cloud_ssd: standard SSD cloud_essd: ESSD</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The system disk type. Valid values:</p>
         * <br>
         * <p>*   `cloud_efficiency`: ultra disk</p>
         * <p>*   `cloud_ssd`: standard SSD</p>
         * <p>*   `cloud_essd`: Enterprise SSD (ESSD)</p>
         * <br>
         * <p>Default value: `cloud_efficiency`.</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The encryption algorithm that is used to encrypt the system disk. Set the value to aes-256.</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values: true false</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the system disk.</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level (PL) of the system disk. This parameter takes effect only for an ESSD. Valid values:</p>
         * <br>
         * <p>*   PL0: moderate maximum concurrent I/O performance and low I/O latency</p>
         * <p>*   PL1: moderate maximum concurrent I/O performance and low I/O latency</p>
         * <p>*   PL2: high maximum concurrent I/O performance and low I/O latency</p>
         * <p>*   PL3: ultra-high maximum concurrent I/O performance and ultra-low I/O latency</p>
         * <br>
         * <p>>  Disks support all of the preceding PLs. However, when you create a disk, the available PLs vary based on the Elastic Compute Service (ECS) instance type that you selected. For more information, see [Overview of ECS instance families](https://help.aliyun.com/document_detail/25378.html).</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The preset IOPS of the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <br>
         * <p>This parameter is available only if `SystemDiskCategory` is set to `cloud_auto`. For more information, see [ESSD AutoPL disks](https://help.aliyun.com/document_detail/368372.html).</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * <br>
         * <p>Valid values: 20 to 20,248.</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The tag that you want to add only to ECS instances.</p>
         * <br>
         * <p>The tag key must be unique and can be up to 128 characters in length. The tag key and value cannot start with aliyun or acs: or contain https:// or http://.</p>
         */
        @NameInMap("tags")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupTags> tags;

        /**
         * <p>Th vSwitch IDs. You can specify one to eight vSwitch IDs.</p>
         * <br>
         * <p>>  To ensure high availability, we recommend that you select vSwitches in different zones.</p>
         * <br>
         * <p>This parameter is required.</p>
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

        public CreateClusterNodePoolRequestScalingGroup setCisEnabled(Boolean cisEnabled) {
            this.cisEnabled = cisEnabled;
            return this;
        }
        public Boolean getCisEnabled() {
            return this.cisEnabled;
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

        public CreateClusterNodePoolRequestScalingGroup setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
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

        public CreateClusterNodePoolRequestScalingGroup setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public CreateClusterNodePoolRequestScalingGroup setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
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

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskKmsKeyId(String systemDiskKmsKeyId) {
            this.systemDiskKmsKeyId = systemDiskKmsKeyId;
            return this;
        }
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
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
