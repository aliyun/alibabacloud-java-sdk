// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Nodepool extends TeaModel {
    /**
     * <p>The auto-scaling node pool configuration.</p>
     */
    @NameInMap("auto_scaling")
    public NodepoolAutoScaling autoScaling;

    /**
     * <p><strong>[Deprecated]</strong> Use desired_size instead. The number of nodes in the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p><strong>[Deprecated]</strong> The configuration of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public NodepoolInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter is valid only when type is set to edge. Valid values:</p>
     * <ul>
     * <li>basic: basic.</li>
     * <li>private: dedicated. Supported in Kubernetes 1.22 and later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>The cluster-related configuration.</p>
     */
    @NameInMap("kubernetes_config")
    public NodepoolKubernetesConfig kubernetesConfig;

    /**
     * <p>The managed node pool configuration.</p>
     */
    @NameInMap("management")
    public NodepoolManagement management;

    /**
     * <p>The maximum number of nodes that the edge node pool can accommodate. The value must be greater than or equal to 0. A value of 0 indicates no extra limit, meaning the node pool is only limited by the maximum number of nodes that the entire cluster can accommodate. This value is usually greater than 0 for edge node pools. For ess node pools and default edge node pools, this value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_nodes")
    public Long maxNodes;

    /**
     * <p>The list of node components.</p>
     */
    @NameInMap("node_components")
    public java.util.List<NodepoolNodeComponents> nodeComponents;

    /**
     * <p>The node configuration.</p>
     */
    @NameInMap("node_config")
    public NodepoolNodeConfig nodeConfig;

    /**
     * <p>The node pool configuration.</p>
     */
    @NameInMap("nodepool_info")
    public NodepoolNodepoolInfo nodepoolInfo;

    /**
     * <p>The scaling group configuration of the node pool.</p>
     */
    @NameInMap("scaling_group")
    public NodepoolScalingGroup scalingGroup;

    /**
     * <p>The configuration of the confidential computing node pool.</p>
     */
    @NameInMap("tee_config")
    public NodepoolTeeConfig teeConfig;

    public static Nodepool build(java.util.Map<String, ?> map) throws Exception {
        Nodepool self = new Nodepool();
        return TeaModel.build(map, self);
    }

    public Nodepool setAutoScaling(NodepoolAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public NodepoolAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    @Deprecated
    public Nodepool setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    @Deprecated
    public Nodepool setInterconnectConfig(NodepoolInterconnectConfig interconnectConfig) {
        this.interconnectConfig = interconnectConfig;
        return this;
    }
    public NodepoolInterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    public Nodepool setInterconnectMode(String interconnectMode) {
        this.interconnectMode = interconnectMode;
        return this;
    }
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    public Nodepool setKubernetesConfig(NodepoolKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public NodepoolKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public Nodepool setManagement(NodepoolManagement management) {
        this.management = management;
        return this;
    }
    public NodepoolManagement getManagement() {
        return this.management;
    }

    public Nodepool setMaxNodes(Long maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public Nodepool setNodeComponents(java.util.List<NodepoolNodeComponents> nodeComponents) {
        this.nodeComponents = nodeComponents;
        return this;
    }
    public java.util.List<NodepoolNodeComponents> getNodeComponents() {
        return this.nodeComponents;
    }

    public Nodepool setNodeConfig(NodepoolNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public NodepoolNodeConfig getNodeConfig() {
        return this.nodeConfig;
    }

    public Nodepool setNodepoolInfo(NodepoolNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public NodepoolNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public Nodepool setScalingGroup(NodepoolScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public NodepoolScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public Nodepool setTeeConfig(NodepoolTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public NodepoolTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static class NodepoolAutoScaling extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> The peak bandwidth of the elastic IP address (EIP). Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p><strong>[Deprecated]</strong> The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-data-transfer.
         * Default value: PayByBandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("eip_internet_charge_type")
        @Deprecated
        public String eipInternetChargeType;

        /**
         * <p>Specifies whether to enable auto scaling. Valid values:</p>
         * <ul>
         * <li>true: enables auto scaling for the node pool.</li>
         * <li>false: disables auto scaling. If this parameter is set to false, other configuration parameters in auto_scaling do not take effect.
         * Default value: false.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to associate an EIP. Valid values:</p>
         * <ul>
         * <li>true: associates an EIP.</li>
         * <li>false: does not associate an EIP.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_bond_eip")
        @Deprecated
        public Boolean isBondEip;

        /**
         * <p>The maximum number of instances in the auto-scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of instances in the auto-scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The auto-scaling type, which is classified by the instance type used for auto scaling. Valid values:</p>
         * <ul>
         * <li>cpu: regular instance.</li>
         * <li>gpu: GPU-accelerated instance.</li>
         * <li>gpushare: shared GPU instance.</li>
         * <li>spot: spot instance.
         * Default value: cpu.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("type")
        public String type;

        public static NodepoolAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            NodepoolAutoScaling self = new NodepoolAutoScaling();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public NodepoolAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        @Deprecated
        public NodepoolAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public NodepoolAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
        public NodepoolAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public NodepoolAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public NodepoolAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public NodepoolAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class NodepoolInterconnectConfig extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> The network bandwidth of the edge-optimized node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        @Deprecated
        public Long bandwidth;

        /**
         * <p><strong>[Deprecated]</strong> The instance ID of the Cloud Connect Network (CCN) attached to the edge-optimized node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        @Deprecated
        public String ccnId;

        /**
         * <p><strong>[Deprecated]</strong> The region of the CCN instance associated with the edge-optimized node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        @Deprecated
        public String ccnRegionId;

        /**
         * <p><strong>[Deprecated]</strong> The instance ID of the Cloud Enterprise Network (CEN) attached to the edge-optimized node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        @Deprecated
        public String cenId;

        /**
         * <p><strong>[Deprecated]</strong> The subscription duration of the edge-optimized node pool. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("improved_period")
        @Deprecated
        public String improvedPeriod;

        public static NodepoolInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolInterconnectConfig self = new NodepoolInterconnectConfig();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public NodepoolInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        @Deprecated
        public NodepoolInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        @Deprecated
        public NodepoolInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        @Deprecated
        public NodepoolInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        @Deprecated
        public NodepoolInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class NodepoolKubernetesConfig extends TeaModel {
        /**
         * <p>Specifies whether to install CloudMonitor on ECS nodes. After installation, you can view the monitoring information of the created ECS instances in the CloudMonitor console. Enabling this feature is recommended. Valid values:</p>
         * <ul>
         * <li>true: installs CloudMonitor on ECS nodes.</li>
         * <li>false: does not install CloudMonitor on ECS nodes.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy for nodes. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
         * <ul>
         * <li>static: allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
         * <li>none: uses the default CPU affinity scheme.
         * Default value: none.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The node labels, which are added to the nodes in the Kubernetes cluster.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The node name consists of three parts: prefix + node IP address + suffix.</p>
         * <ul>
         * <li>The prefix and suffix can each consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or a digit.</li>
         * <li>The node IP address is the complete private IP address of the node.
         * The parameter value contains four parts separated by commas. For example, if the parameter is set to the &quot;customized,aliyun,ip,com&quot; string (where &quot;customized&quot; and &quot;ip&quot; are fixed strings, &quot;aliyun&quot; is the prefix, and &quot;com&quot; is the suffix), the node name is aliyun.192.168.xxx.xxx.com.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The container runtime. Valid values:</p>
         * <ul>
         * <li>containerd: recommended. Supported by all cluster versions.</li>
         * <li>Sandboxed-Container.runv: sandboxed container. Provides higher isolation. Supported by clusters of Kubernetes 1.24 and earlier.</li>
         * <li>docker: supported by clusters of Kubernetes 1.22 and earlier.
         * Default value: containerd.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The container runtime version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.20</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The taint configuration.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>The custom data of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>MXM=</p>
         */
        @NameInMap("user_data")
        public String userData;

        public static NodepoolKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolKubernetesConfig self = new NodepoolKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public NodepoolKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public NodepoolKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public NodepoolKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public NodepoolKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public NodepoolKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public NodepoolKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public NodepoolKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public NodepoolKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class NodepoolManagementAutoRepairPolicy extends TeaModel {
        /**
         * <p>The maximum number of parallel repairs. When a large number of abnormal nodes exist in the node pool, this parameter specifies the maximum number or percentage of nodes that can be repaired at the same time. You can specify a number (such as 5, valid values: 1 to 100000) or a percentage (such as 10%, valid values: 1% to 100%). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("max_parallel_repairing_nodes")
        public String maxParallelRepairingNodes;

        /**
         * <p>The circuit breaker threshold for self-healing. When the number or percentage of faulty nodes exceeds this threshold, self-healing enters the circuit breaker state and stops initiating new self-healing actions. You can specify a number (such as 10, valid values: 1 to 100000) or a percentage (such as 20%, valid values: 1% to 100%). Default value: 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>20%</p>
         */
        @NameInMap("max_unhealthy_nodes_threshold")
        public String maxUnhealthyNodesThreshold;

        /**
         * <p>Specifies whether to allow node restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        public static NodepoolManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            NodepoolManagementAutoRepairPolicy self = new NodepoolManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public NodepoolManagementAutoRepairPolicy setMaxParallelRepairingNodes(String maxParallelRepairingNodes) {
            this.maxParallelRepairingNodes = maxParallelRepairingNodes;
            return this;
        }
        public String getMaxParallelRepairingNodes() {
            return this.maxParallelRepairingNodes;
        }

        public NodepoolManagementAutoRepairPolicy setMaxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
            this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
            return this;
        }
        public String getMaxUnhealthyNodesThreshold() {
            return this.maxUnhealthyNodesThreshold;
        }

        public NodepoolManagementAutoRepairPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

    }

    public static class NodepoolManagementAutoUpgradePolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow automatic kubelet upgrades.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        public static NodepoolManagementAutoUpgradePolicy build(java.util.Map<String, ?> map) throws Exception {
            NodepoolManagementAutoUpgradePolicy self = new NodepoolManagementAutoUpgradePolicy();
            return TeaModel.build(map, self);
        }

        public NodepoolManagementAutoUpgradePolicy setAutoUpgradeKubelet(Boolean autoUpgradeKubelet) {
            this.autoUpgradeKubelet = autoUpgradeKubelet;
            return this;
        }
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

    }

    public static class NodepoolManagementAutoVulFixPolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow node restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The vulnerability levels that are allowed for automatic repair, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>asap,nntf</p>
         */
        @NameInMap("vul_level")
        public String vulLevel;

        public static NodepoolManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            NodepoolManagementAutoVulFixPolicy self = new NodepoolManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public NodepoolManagementAutoVulFixPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public NodepoolManagementAutoVulFixPolicy setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class NodepoolManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto upgrade. Valid values:</p>
         * <ul>
         * <li>true: Enables auto upgrade.</li>
         * <li>false: Disables auto upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of unavailable nodes. Valid values: 1 to 1000.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of surge nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of surge nodes. This parameter and surge are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static NodepoolManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolManagementUpgradeConfig self = new NodepoolManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public NodepoolManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public NodepoolManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public NodepoolManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public NodepoolManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class NodepoolManagement extends TeaModel {
        /**
         * <p>Specifies whether to enable ECS fault detection for node self-healing.</p>
         */
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Specifies whether to enable auto-repair. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li>true: enables auto-repair.</li>
         * <li>false: disables auto-repair.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto-repair policy for nodes.</p>
         */
        @NameInMap("auto_repair_policy")
        public NodepoolManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Specifies whether to enable auto upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The auto upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public NodepoolManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Specifies whether to automatically repair Common Vulnerabilities and Exposures (CVE).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The policy for automatic CVE repair.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public NodepoolManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable the node drift capability. This feature is only supported by smart managed node pools and is enabled by default. Regular node pools do not support this feature.</p>
         */
        @NameInMap("drift_enabled")
        public Boolean driftEnabled;

        /**
         * <p>Specifies whether to enable the managed node pool. Valid values:</p>
         * <ul>
         * <li>true: Enables the managed node pool.</li>
         * <li>false: Does not enable the managed node pool. Other related configurations take effect only when enable is set to true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The auto upgrade configuration. This configuration takes effect only when enable is set to true.</p>
         */
        @NameInMap("upgrade_config")
        @Deprecated
        public NodepoolManagementUpgradeConfig upgradeConfig;

        public static NodepoolManagement build(java.util.Map<String, ?> map) throws Exception {
            NodepoolManagement self = new NodepoolManagement();
            return TeaModel.build(map, self);
        }

        public NodepoolManagement setAutoFaultDiagnosis(Boolean autoFaultDiagnosis) {
            this.autoFaultDiagnosis = autoFaultDiagnosis;
            return this;
        }
        public Boolean getAutoFaultDiagnosis() {
            return this.autoFaultDiagnosis;
        }

        public NodepoolManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public NodepoolManagement setAutoRepairPolicy(NodepoolManagementAutoRepairPolicy autoRepairPolicy) {
            this.autoRepairPolicy = autoRepairPolicy;
            return this;
        }
        public NodepoolManagementAutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        public NodepoolManagement setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public NodepoolManagement setAutoUpgradePolicy(NodepoolManagementAutoUpgradePolicy autoUpgradePolicy) {
            this.autoUpgradePolicy = autoUpgradePolicy;
            return this;
        }
        public NodepoolManagementAutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        public NodepoolManagement setAutoVulFix(Boolean autoVulFix) {
            this.autoVulFix = autoVulFix;
            return this;
        }
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        public NodepoolManagement setAutoVulFixPolicy(NodepoolManagementAutoVulFixPolicy autoVulFixPolicy) {
            this.autoVulFixPolicy = autoVulFixPolicy;
            return this;
        }
        public NodepoolManagementAutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
        }

        public NodepoolManagement setDriftEnabled(Boolean driftEnabled) {
            this.driftEnabled = driftEnabled;
            return this;
        }
        public Boolean getDriftEnabled() {
            return this.driftEnabled;
        }

        public NodepoolManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
        public NodepoolManagement setUpgradeConfig(NodepoolManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public NodepoolManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class NodepoolNodeComponentsConfigEnvs extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("value")
        public String value;

        public static NodepoolNodeComponentsConfigEnvs build(java.util.Map<String, ?> map) throws Exception {
            NodepoolNodeComponentsConfigEnvs self = new NodepoolNodeComponentsConfigEnvs();
            return TeaModel.build(map, self);
        }

        public NodepoolNodeComponentsConfigEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NodepoolNodeComponentsConfigEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NodepoolNodeComponentsConfig extends TeaModel {
        /**
         * <p>The custom node component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

        /**
         * <p>The environment variables for the node component.</p>
         */
        @NameInMap("envs")
        public java.util.List<NodepoolNodeComponentsConfigEnvs> envs;

        public static NodepoolNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolNodeComponentsConfig self = new NodepoolNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public NodepoolNodeComponentsConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public NodepoolNodeComponentsConfig setEnvs(java.util.List<NodepoolNodeComponentsConfigEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<NodepoolNodeComponentsConfigEnvs> getEnvs() {
            return this.envs;
        }

    }

    public static class NodepoolNodeComponents extends TeaModel {
        /**
         * <p>The node component configuration.</p>
         */
        @NameInMap("config")
        public NodepoolNodeComponentsConfig config;

        /**
         * <p>The name of the node component.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the node component.</p>
         * 
         * <strong>example:</strong>
         * <p>1.33.3-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        public static NodepoolNodeComponents build(java.util.Map<String, ?> map) throws Exception {
            NodepoolNodeComponents self = new NodepoolNodeComponents();
            return TeaModel.build(map, self);
        }

        public NodepoolNodeComponents setConfig(NodepoolNodeComponentsConfig config) {
            this.config = config;
            return this;
        }
        public NodepoolNodeComponentsConfig getConfig() {
            return this.config;
        }

        public NodepoolNodeComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NodepoolNodeComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class NodepoolNodeConfig extends TeaModel {
        /**
         * <p>The Kubelet parameter settings.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        public static NodepoolNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolNodeConfig self = new NodepoolNodeConfig();
            return TeaModel.build(map, self);
        }

        public NodepoolNodeConfig setKubeletConfiguration(KubeletConfig kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
            return this;
        }
        public KubeletConfig getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

    }

    public static class NodepoolNodepoolInfo extends TeaModel {
        /**
         * <p>The name of the node pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the resource group to which the node pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The type of the node pool. Valid values:</p>
         * <ul>
         * <li>ess: Node pool.</li>
         * <li>edge: Edge node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("type")
        public String type;

        public static NodepoolNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            NodepoolNodepoolInfo self = new NodepoolNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public NodepoolNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NodepoolNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public NodepoolNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class NodepoolScalingGroupCpuOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable nested virtualization. Valid values:</p>
         * <ul>
         * <li>disabled: Disables nested virtualization.</li>
         * <li>enabled: Enables nested virtualization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("nested_virtualization")
        public String nestedVirtualization;

        public static NodepoolScalingGroupCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            NodepoolScalingGroupCpuOptions self = new NodepoolScalingGroupCpuOptions();
            return TeaModel.build(map, self);
        }

        public NodepoolScalingGroupCpuOptions setNestedVirtualization(String nestedVirtualization) {
            this.nestedVirtualization = nestedVirtualization;
            return this;
        }
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

    }

    public static class NodepoolScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of the private pool, which specifies the capacity options of the private pool for instance startup. After an elasticity assurance or capacity reservation takes effect, a private pool is generated for you to select when you start instances. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: open mode. The system automatically matches an open private pool. If no matching open private pool is found, the system uses resources from the public pool.</p>
         * </li>
         * <li><p><code>Target</code>: targeted mode. The system uses the specified private pool to start instances. If the specified private pool is unavailable, the instances fail to start.</p>
         * </li>
         * <li><p><code>None</code>: no private pool. The system does not use private pools to start instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("match_criteria")
        public String matchCriteria;

        public static NodepoolScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            NodepoolScalingGroupPrivatePoolOptions self = new NodepoolScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public NodepoolScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public NodepoolScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class NodepoolScalingGroupResourcePoolOptions extends TeaModel {
        /**
         * <p>The list of private pool IDs, which are the IDs of elasticity assurances or capacity reservations. You can only specify the IDs of private pools in Target mode. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy used to create instances. Resource pools include private pools generated after elasticity assurances or capacity reservations take effect, as well as the public pool. You can select a resource pool when you start instances. Valid values:
         * PrivatePoolFirst: private pools take precedence. If you select this policy and specify resource_pool_options.private_pool_ids, the specified private pools are preferentially used. If no private pool is specified or the specified private pools have insufficient capacity, the system automatically matches an open private pool. If no matching private pool is found, the system uses the public pool to create instances.
         * PrivatePoolOnly: only private pools are used. If you select this policy, you must specify resource_pool_options.private_pool_ids. If the specified private pools have insufficient capacity, the instances fail to start.
         * None: no resource pool policy is used.
         * Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("strategy")
        public String strategy;

        public static NodepoolScalingGroupResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            NodepoolScalingGroupResourcePoolOptions self = new NodepoolScalingGroupResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public NodepoolScalingGroupResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public NodepoolScalingGroupResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class NodepoolScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The instance type of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum price for a single instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.39</p>
         */
        @NameInMap("price_limit")
        public String priceLimit;

        public static NodepoolScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            NodepoolScalingGroupSpotPriceLimit self = new NodepoolScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public NodepoolScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public NodepoolScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class NodepoolScalingGroupTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static NodepoolScalingGroupTags build(java.util.Map<String, ?> map) throws Exception {
            NodepoolScalingGroupTags self = new NodepoolScalingGroupTags();
            return TeaModel.build(map, self);
        }

        public NodepoolScalingGroupTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public NodepoolScalingGroupTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NodepoolScalingGroup extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal for the node pool. This parameter takes effect only when instance_charge_type is set to PrePaid. Valid values:</p>
         * <ul>
         * <li>true: Enables auto-renewal.</li>
         * <li>false: Disables auto-renewal.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal epoch for the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when multi_az_policy is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory constraints. Valid values:</p>
         * <ul>
         * <li>true: Allows automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</li>
         * <li>false: Does not allow automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The CPU configuration options.</p>
         */
        @NameInMap("cpu_options")
        public NodepoolScalingGroupCpuOptions cpuOptions;

        /**
         * <p>The data cloud disk configuration for the nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The block device initialization configuration.</p>
         */
        @NameInMap("disk_init")
        public java.util.List<DiskInit> diskInit;

        /**
         * <p>The ID of the custom image. By default, the system-provided image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200904.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the operating system image. This parameter and platform are mutually exclusive. Valid values:</p>
         * <ul>
         * <li>AliyunLinux: Alinux2 image.</li>
         * <li>AliyunLinux3: Alinux3 image.</li>
         * <li>AliyunLinux3Arm64: Alinux3 ARM image.</li>
         * <li>AliyunLinuxUEFI: Alinux2 UEFI image.</li>
         * <li>CentOS: CentOS image.</li>
         * <li>Windows: Windows image.</li>
         * <li>WindowsCore: Windows Core image.</li>
         * <li>ContainerOS: Container-optimized image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <ul>
         * <li>PrePaid: Subscription.</li>
         * <li>PostPaid: Pay-as-you-go.</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The metadata access configuration for the ECS instance. This parameter is currently available only to whitelisted users. To use this parameter, submit a ticket.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance properties.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>The instance types.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for public IP addresses. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
         * <li><code>PayByTraffic</code>: pay-by-traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth for a public IP address of a node. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify this parameter or <code>login_password</code>.</p>
         * <blockquote>
         * <p>If you create a managed node pool, only <code>key_pair</code> is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>np-key</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Specifies whether to log on to the created ECS instances as a non-root user.</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The SSH logon password. You must specify this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: scales ECS instances based on the priorities of vSwitches that you specify in VSwitchIds.N. If an ECS instance cannot be created in the zone of the highest-priority vSwitch, the system automatically uses the next highest-priority vSwitch to create the ECS instance.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: creates ECS instances based on the unit prices of vCPUs in ascending order. If the scaling configuration settings specify multiple instance types and the billing method for spot instances, the system preferentially creates the corresponding spot instances. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether the system automatically creates pay-as-you-go instances when spot instances cannot be created due to insufficient resources.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when the scaling configuration settings specify multiple instance types or spot instances are selected.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: evenly distributes ECS instances across the zones specified in the scaling group. If the instances are unevenly distributed across zones due to insufficient resources, you can call the RebalanceInstances operation to balance the resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PRIORITY</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>COST_OPTIMIZED</p>
         */
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, the system preferentially creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the minimum number of pay-as-you-go instances specified by <code>on_demand_base_capacity</code>. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of nodes in the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. When <code>period_unit</code> is set to Month, valid values of <code>period</code> are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The subscription period of nodes in the node pool. You must specify this parameter when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p><code>Month</code>: only months are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The operating system distribution. Valid values:</p>
         * <ul>
         * <li><code>CentOS</code></li>
         * <li><code>AliyunLinux</code></li>
         * <li><code>Windows</code></li>
         * <li><code>WindowsCore</code></li>
         * </ul>
         * <p>Default value: <code>AliyunLinux</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        @Deprecated
        public String platform;

        /**
         * <p>The private pool options.</p>
         */
        @NameInMap("private_pool_options")
        public NodepoolScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The name of the RAM role for worker nodes.</p>
         * <blockquote>
         * <p>Notice: Only ACK managed clusters of version 1.22 and later support configuring this parameter when you create a node pool.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example-role</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>The list of ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and resource pool policy used to create instances. Take note of the following items when you configure this parameter:
         * This parameter takes effect only when you create pay-as-you-go instances.
         * This parameter cannot be configured together with private_pool_options.match_criteria or private_pool_options.id.</p>
         */
        @NameInMap("resource_pool_options")
        public NodepoolScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling group mode. Valid values:</p>
         * <ul>
         * <li><code>release</code>: standard pattern. The scaling group scales instances by creating and releasing ECS instances based on the usage of the requested resources.</li>
         * <li><code>recycle</code>: swift pattern. The scaling group scales instances by creating, stopping, and starting ECS instances to accelerate subsequent scaling operations. When an instance is stopped, you are not charged for compute resources, but you are still charged for storage resources, except for instances with local disks.</li>
         * </ul>
         * <p>Default value: <code>release</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The ID of the security group to which the node pool belongs. You must specify this parameter or <code>security_group_ids</code>. We recommend that you specify <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The list of security group IDs. You must specify this parameter or <code>security_group_id</code>. We recommend that you specify <code>security_group_ids</code>. If you specify both <code>security_group_id</code> and <code>security_group_ids</code>, <code>security_group_ids</code> takes precedence.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of active instance types. The scaling group evenly creates spot instances based on the most cost-effective instance types. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable spot instance replenishment. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables spot instance replenishment.</li>
         * <li><code>false</code>: disables spot instance replenishment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The maximum price configuration for a single spot instance of a specific instance type in the current marketplace.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<NodepoolScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The type of spot instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: non-spot instance.</li>
         * <li>SpotWithPriceLimit: spot instance with a maximum price.</li>
         * <li>SpotAsPriceGo: spot instance whose price is automatically set by the system based on the current market price.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable bursting for the system disk of the node. Valid values:</p>
         * <ul>
         * <li>true: yes.</li>
         * <li>false: no.</li>
         * </ul>
         * <p>This parameter is supported only when <code>SystemDiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The categories of the system disk. If the system disk cannot be created by using the disk category with the highest priority, the system automatically tries the next disk category. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value: <code>cloud_efficiency</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The encryption algorithm used for the system disk. Valid value: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the system disk.</li>
         * <li>false: does not encrypt the system disk.</li>
         * </ul>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the KMS key used for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level of the system disk. This parameter takes effect only for ESSDs. Valid values:</p>
         * <ul>
         * <li>PL0: delivers medium maximum concurrent I/O performance and relatively stable read/write latency.</li>
         * <li>PL1: delivers medium maximum concurrent I/O performance and relatively stable read/write latency.</li>
         * <li>PL2: delivers high maximum concurrent I/O performance and stable read/write latency.</li>
         * <li>PL3: delivers ultra-high maximum concurrent I/O performance and extremely stable read/write latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read and write IOPS for the system cloud disk of the node. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}. Baseline performance = min{1,800 + 50 × Capacity, 50,000}. This parameter is supported only when <code>SystemDiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system cloud disk for the node. Unit: GiB. Valid values: 40 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The tags to add to ECS instances only. Tag keys must be unique and can be up to 128 characters in length. Neither tag keys nor tag values can start with &quot;aliyun&quot; or &quot;acs:&quot;, or contain &quot;https://&quot; or &quot;http://&quot;.</p>
         */
        @NameInMap("tags")
        public java.util.List<NodepoolScalingGroupTags> tags;

        /**
         * <p>The vSwitch IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static NodepoolScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            NodepoolScalingGroup self = new NodepoolScalingGroup();
            return TeaModel.build(map, self);
        }

        public NodepoolScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public NodepoolScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public NodepoolScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public NodepoolScalingGroup setCpuOptions(NodepoolScalingGroupCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public NodepoolScalingGroupCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public NodepoolScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public NodepoolScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public NodepoolScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public NodepoolScalingGroup setDiskInit(java.util.List<DiskInit> diskInit) {
            this.diskInit = diskInit;
            return this;
        }
        public java.util.List<DiskInit> getDiskInit() {
            return this.diskInit;
        }

        public NodepoolScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public NodepoolScalingGroup setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public NodepoolScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public NodepoolScalingGroup setInstanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
        }

        public NodepoolScalingGroup setInstancePatterns(java.util.List<InstancePatterns> instancePatterns) {
            this.instancePatterns = instancePatterns;
            return this;
        }
        public java.util.List<InstancePatterns> getInstancePatterns() {
            return this.instancePatterns;
        }

        public NodepoolScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public NodepoolScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public NodepoolScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public NodepoolScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public NodepoolScalingGroup setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public NodepoolScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public NodepoolScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public NodepoolScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public NodepoolScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public NodepoolScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public NodepoolScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        @Deprecated
        public NodepoolScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public NodepoolScalingGroup setPrivatePoolOptions(NodepoolScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public NodepoolScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public NodepoolScalingGroup setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public NodepoolScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public NodepoolScalingGroup setResourcePoolOptions(NodepoolScalingGroupResourcePoolOptions resourcePoolOptions) {
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }
        public NodepoolScalingGroupResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
        }

        public NodepoolScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public NodepoolScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public NodepoolScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public NodepoolScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public NodepoolScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public NodepoolScalingGroup setSpotPriceLimit(java.util.List<NodepoolScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<NodepoolScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public NodepoolScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public NodepoolScalingGroup setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public NodepoolScalingGroup setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public NodepoolScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public NodepoolScalingGroup setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public NodepoolScalingGroup setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public NodepoolScalingGroup setSystemDiskKmsKeyId(String systemDiskKmsKeyId) {
            this.systemDiskKmsKeyId = systemDiskKmsKeyId;
            return this;
        }
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
        }

        public NodepoolScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public NodepoolScalingGroup setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public NodepoolScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public NodepoolScalingGroup setTags(java.util.List<NodepoolScalingGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<NodepoolScalingGroupTags> getTags() {
            return this.tags;
        }

        public NodepoolScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class NodepoolTeeConfig extends TeaModel {
        /**
         * <p>Specifies whether the node pool is a confidential computing node pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static NodepoolTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolTeeConfig self = new NodepoolTeeConfig();
            return TeaModel.build(map, self);
        }

        public NodepoolTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
