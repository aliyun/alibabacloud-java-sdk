// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Nodepool extends TeaModel {
    /**
     * <p>The auto scaling configurations of the node pool.</p>
     */
    @NameInMap("auto_scaling")
    public NodepoolAutoScaling autoScaling;

    /**
     * <p>This parameter is deprecated. Use desired_size instead.</p>
     * <p>The number of nodes in the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p>This parameter is deprecated.</p>
     * <p>The configurations of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public NodepoolInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter takes effect only if you set the <code>type</code> of the node pool to <code>edge</code>. Valid values:</p>
     * <ul>
     * <li><code>basic</code>: basic</li>
     * <li><code>private</code>: dedicated Only Kubernetes 1.22 and later support this value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>The configurations of the cluster.</p>
     */
    @NameInMap("kubernetes_config")
    public NodepoolKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations of the managed node pool feature.</p>
     */
    @NameInMap("management")
    public NodepoolManagement management;

    /**
     * <p>The maximum number of nodes that can be created in the edge node pool. The value of this parameter must be greater than or equal to 0. A value of 0 indicates that the number of nodes in the node pool is limited only by the quota of nodes in the cluster. In most cases, this parameter is set to a value larger than 0 for edge node pools. This parameter is set to 0 for node pools whose type is ess or default edge node pools.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_nodes")
    public Long maxNodes;

    @NameInMap("node_components")
    public java.util.List<NodepoolNodeComponents> nodeComponents;

    /**
     * <p>The node configurations.</p>
     */
    @NameInMap("node_config")
    public NodepoolNodeConfig nodeConfig;

    /**
     * <p>The configuration of a node pool.</p>
     */
    @NameInMap("nodepool_info")
    public NodepoolNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group that is used by the node pool.</p>
     */
    @NameInMap("scaling_group")
    public NodepoolScalingGroup scalingGroup;

    /**
     * <p>The configurations of confidential computing.</p>
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
         * <p>This parameter is deprecated.</p>
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>This parameter is deprecated.</p>
         * <p>The metering method of the EIP. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
         * <li><code>PayByTraffic</code>: pay-by-data-transfer.</li>
         * </ul>
         * <p>Default value: PayByBandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("eip_internet_charge_type")
        @Deprecated
        public String eipInternetChargeType;

        /**
         * <p>Specifies whether to enable auto scaling for the node pool. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto scaling for the node pool.</li>
         * <li><code>false</code>: disables auto scaling for the node pool. If you set this parameter to false, other parameters in the <code>auto_scaling</code> section do not take effect.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>This parameter is deprecated.</p>
         * <p>Specifies whether to associate an elastic IP Address (EIP) with the node pool. Valid values:</p>
         * <ul>
         * <li><code>true</code>: associates an EIP with the node pool.</li>
         * <li><code>false</code>: does not associate an EIP with the node pool.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_bond_eip")
        @Deprecated
        public Boolean isBondEip;

        /**
         * <p>The maximum number of instances that can be created in a scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of instances that must be kept in a scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The instance types that can be used for the auto scaling of the node pool. Valid values:</p>
         * <ul>
         * <li><code>cpu</code>: regular instance.</li>
         * <li><code>gpu</code>: GPU-accelerated instance.</li>
         * <li><code>gpushare</code>: shared GPU-accelerated instance.</li>
         * <li><code>spot</code>: preemptible instance.</li>
         * </ul>
         * <p>Default value: <code>cpu</code>.</p>
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
         * <p>This parameter is deprecated.</p>
         * <p>The bandwidth of the enhanced edge node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        @Deprecated
        public Long bandwidth;

        /**
         * <p>This parameter is deprecated.</p>
         * <p>The ID of the Cloud Connect Network (CCN) instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        @Deprecated
        public String ccnId;

        /**
         * <p>This parameter is deprecated.</p>
         * <p>The region in which the CCN instance that is associated with the enhanced edge node pool resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        @Deprecated
        public String ccnRegionId;

        /**
         * <p>This parameter is deprecated.</p>
         * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        @Deprecated
        public String cenId;

        /**
         * <p>This parameter is deprecated.</p>
         * <p>The subscription duration of the enhanced edge node pool. The duration is measured in months.</p>
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
         * <p>Specifies whether to install the CloudMonitor agent on Elastic Compute Service (ECS) nodes. After the CloudMonitor agent is installed on ECS nodes, you can view the monitoring information about the instances in the CloudMonitor console. We recommend that you install the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li><code>true</code>: installs the CloudMonitor agent on ECS nodes.</li>
         * <li><code>false</code>: does not install the CloudMonitor agent on ECS nodes.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy of nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: specifies that the default CPU affinity is used.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The labels of the nodes in the node pool. You can add labels to the nodes in a Kubernetes cluster.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The custom node name. A custom node name consists of a prefix, a node IP address, and a suffix.</p>
         * <ul>
         * <li>The prefix and the suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.</li>
         * <li>The node IP address is the complete private IP address of the node.</li>
         * </ul>
         * <p>Set the parameter to a value that is in the customized,aliyun,ip,com format. The value consists of four parts that are separated by commas (,). customized and ip are fixed content. aliyun is the prefix and com is the suffix. Example: aliyun.192.168.xxx.xxx.com.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The container runtime. Valid values:</p>
         * <ul>
         * <li><code>containerd</code>: supports all Kubernetes versions. We recommend that you set the parameter to this value.</li>
         * <li><code>Sandboxed-Container.runv</code>: Sandboxed container provides higher isolation and supports Kubernetes 1.24 and earlier.</li>
         * <li><code>docker</code>: supports Kubernetes 1.22 and earlier.</li>
         * </ul>
         * <p>Default value: <code>containerd</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The version of the container runtime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.20</p>
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
         * <p>Indicates whether node restart is allowed.</p>
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
         * <p>Indicates whether the kubelet is automatically updated.</p>
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
         * <p>Indicates whether node restart is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The severity level of CVEs that can be automatically patched. Separate multiple levels with commas (,).</p>
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
         * <p>Specifies whether to enable auto update. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto update.</li>
         * <li><code>false</code>: disables auto update.</li>
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
         * <p>The number of additional nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of additional nodes to the nodes in the node pool. You must specify this parameter or the <code>surge</code> parameter.</p>
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
         * <p>Specifies whether to enable auto repair. This parameter takes effect only when you specify <code>enable=true</code>.</p>
         * <ul>
         * <li><code>true</code>: enables auto repair</li>
         * <li><code>false</code>: disables auto repair.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto node repair policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public NodepoolManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Indicates whether auto update is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The auto update policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public NodepoolManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Indicates whether CVE vulnerabilities are automatically patched.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The automatic CVE patching policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public NodepoolManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Indicates whether the managed node pool feature is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the managed node pool feature.</li>
         * <li><code>false</code>: disables the managed node pool feature. Other parameters in this section take effect only if you set <code>enable</code> to true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The configurations of auto update. This parameter takes effect only if <code>enable</code> is set to true.</p>
         */
        @NameInMap("upgrade_config")
        @Deprecated
        public NodepoolManagementUpgradeConfig upgradeConfig;

        public static NodepoolManagement build(java.util.Map<String, ?> map) throws Exception {
            NodepoolManagement self = new NodepoolManagement();
            return TeaModel.build(map, self);
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

    public static class NodepoolNodeComponentsConfig extends TeaModel {
        @NameInMap("custom_config")
        public java.util.Map<String, String> customConfig;

        public static NodepoolNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            NodepoolNodeComponentsConfig self = new NodepoolNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public NodepoolNodeComponentsConfig setCustomConfig(java.util.Map<String, String> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class NodepoolNodeComponents extends TeaModel {
        @NameInMap("config")
        public NodepoolNodeComponentsConfig config;

        /**
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
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
         * <p>The parameter settings of the kubelet.</p>
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
         * <p>The type of node pool. Valid values:</p>
         * <ul>
         * <li><code>ess</code>: node pool.</li>
         * <li><code>edge</code>: edge node pool.</li>
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

    public static class NodepoolScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of the private node pool. This parameter specifies the type of the private node pool that you want to use to create instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. The system selects a private pool to start instances. Valid values:</p>
         * <ul>
         * <li><code>Open</code>: specifies an open private node pool. The system selects an open private pool to start instances. If no matching open private pools are available, the resources in the public pool are used.</li>
         * <li><code>Target</code>: specifies a private node pool. The system uses the resources of the specified private pool to start instances. If the specified private pool is unavailable, instances cannot be started.</li>
         * <li><code>None</code>: does not use private pools. The resources of private node pools are not used to launch instances.</li>
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
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
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
         * <p>The instance type of preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The price cap of a preemptible instance.</p>
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
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the label.</p>
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
         * <p>Specifies whether to enable auto-renewal for the node pool. This parameter takes effect only if you set <code>instance_charge_type</code> to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto-renewal.</li>
         * <li><code>false</code>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>true</code></p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration of the nodes in the node pool. This parameter is available and required only if you set <code>instance_charge_type</code> to <code>PrePaid</code>.</p>
         * <p>If you set <code>period_unit</code> to Month, the valid values of auto_renew_period are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as cost or insufficient inventory. This parameter takes effect if you set <code>multi_az_policy</code> to <code>COST_OPTIMIZED</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: automatically creates pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created</li>
         * <li><code>false</code>: does not create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The configurations of the data disks that you want to attach to the nodes in the node pool.</p>
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

        @NameInMap("disk_init")
        public java.util.List<DiskInit> diskInit;

        /**
         * <p>The custom image ID. By default, the image provided by ACK is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200904.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the operating system image. You must specify this parameter or the platform parameter. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux</code>: Alibaba Cloud Linux 2.</li>
         * <li><code>AliyunLinux3</code>: Alibaba Cloud Linux 3</li>
         * <li><code>AliyunLinux3Arm64</code>: Alibaba Cloud Linux 3 (ARM).</li>
         * <li><code>AliyunLinuxUEFI</code>: Alibaba Cloud Linux UEFI 2.</li>
         * <li><code>CentOS</code>: CentOS.</li>
         * <li><code>Windows</code>: Windows.</li>
         * <li><code>WindowsCore</code>: Windows Core.</li>
         * <li><code>ContainerOS</code>: ContainerOS.</li>
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
         * <li><code>PrePaid</code>: subscription.</li>
         * <li><code>PostPaid</code>: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance type.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
         * <li><code>PayByTraffic</code>: pay-by-data-transfer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth of the public IP address. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify this parameter or the <code>login_password</code> parameter.</p>
         * <blockquote>
         * <p> If you want to create a managed node pool, you must specify <code>key_pair</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>np-key</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Specifies whether to allow a non-root user to log on to an ECS instance that is added to the node pool.</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The password for SSH logon. You must specify this parameter or the <code>key_pair</code> parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The ECS instance scaling policy for the multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: ECS instances are scaled based on the VSwitchIds.N parameter. If an ECS instance cannot be created in the zone in which the vSwitch that has the highest priority resides, Auto Scaling creates the ECS instance in the zone in which the vSwitch that has the next highest priority resides.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created if preemptible instance types are specified in the scaling configurations. You can set <code>CompensateWithOnDemand</code> to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient inventory.</p>
         * <p>**</p>
         * <p><strong>Note</strong> <code>COST_OPTIMIZED</code> is valid only when multiple instance types are specified or at least one preemptible instance type is specified.</p>
         * </li>
         * <li><p><code>BALANCE</code>: ECS instances are evenly distributed across multiple zones specified by the scaling group. If the distribution of ECS instances across zones is not balanced due to reasons such as insufficient inventory, you can call the RebalanceInstances operation to evenly distribute the ECS instances across zones. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a></p>
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
         * <p>The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is smaller than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the number specified by <code>on_demand_base_capacity</code>. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the nodes in the node pool. This parameter takes effect and is required only if you set <code>instance_charge_type</code> to <code>PrePaid</code>. If you set <code>period_unit</code> to Month, the valid values of <code>period</code> are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes in the node pool. This parameter is required if you set <code>instance_charge_type</code> to <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The distribution of the operating system. Valid values:</p>
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
         * <p>The configurations of the private node pool.</p>
         */
        @NameInMap("private_pool_options")
        public NodepoolScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The name of the worker Resource Access Management (RAM) role. This parameter is available only to users in the whitelist. To use this parameter, submit a ticket.</p>
         * <blockquote>
         * <p> You can configure this parameter when you create a node pool only for an ACK managed cluster that runs Kubernetes 1.22 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example-role</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>A list of ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        @NameInMap("resource_pool_options")
        public NodepoolScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <ul>
         * <li><code>release</code>: the standard mode. ECS instances are created and released based on resource usage.</li>
         * <li><code>recycle</code>: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances that are attached with local disks.</li>
         * </ul>
         * <p>Default value: <code>release</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The ID of the security group to which you want to add the node pool. You must specify this parameter or the <code>security_group_ids</code> parameter. We recommend that you specify <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The IDs of security groups. You must specify this parameter or <code>security_group_id</code>. We recommend that you specify <code>security_group_ids</code>. If you specify both <code>security_group_id</code> and <code>security_group_ids</code>, <code>security_group_ids</code> is used.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Indicates whether preemptible instances can be supplemented. If you set this parameter to true, when the scaling group receives a system message indicating that a preemptible instance is to be reclaimed, the scaling group creates a new instance to replace this instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: supplements preemptible instances.</li>
         * <li><code>false</code>: does not supplement preemptible instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The instance type of preemptible instances and the price cap for the instance type.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<NodepoolScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The type of preemptible instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: non-preemptible.</li>
         * <li>SpotWithPriceLimit: a preemptible instance that is configured with the highest bid price.</li>
         * <li>SpotAsPriceGo: bids based on the up-to-date market price are submitted.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Preemptible Instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true: enables the burst feature.</li>
         * <li>false: disables the burst feature.</li>
         * </ul>
         * <p>This parameter is available only if <code>SystemDiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The system disk types. The system creates system disks of a disk type with a lower priority if the disk type with a higher priority is unavailable. Valid values: cloud (basic disk), cloud_efficiency (ultra disk), cloud_ssd (standard SSD), and cloud_essd: (ESSD).</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The type of the system disk. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD</li>
         * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
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
         * <p>The algorithm that you want to use to encrypt the system disk. Set the value to aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values: true: encrypts the system disk. false: does not encrypt the system disk.</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level (PL) of the system disk. This parameter takes effect only for an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: moderate maximum concurrent I/O performance and low I/O latency.</li>
         * <li>PL1: moderate maximum concurrent I/O performance and low I/O latency.</li>
         * <li>PL2: high maximum concurrent I/O performance and low I/O latency.</li>
         * <li>PL3: ultra-high maximum concurrent I/O performance and ultra-low I/O latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The preset read/write IOPS of the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS} Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter is available only if <code>SystemDiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * <p>Valid values: 40 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The labels that you want to add only to ECS instances.</p>
         * <p>The tag key must be unique and can be up to 128 characters in length. The tag key and value must not start with aliyun or acs: or contain https:// or http://.</p>
         */
        @NameInMap("tags")
        public java.util.List<NodepoolScalingGroupTags> tags;

        /**
         * <p>The IDs of vSwitches.</p>
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
         * <p>Specifies whether to enable confidential computing for the node pool.</p>
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
