// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Nodepool extends TeaModel {
    /**
     * <p>The auto scaling configurations for the node pool.</p>
     */
    @NameInMap("auto_scaling")
    public NodepoolAutoScaling autoScaling;

    /**
     * <p>[This parameter is deprecated. Use desired_size instead.]</p>
     * <p>The number of nodes in the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p>[This parameter is deprecated.]</p>
     * <p>The configurations of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public NodepoolInterconnectConfig interconnectConfig;

    /**
     * <p>The network mode of the edge node pool. This parameter is valid only for edge node pools. Valid values:</p>
     * <ul>
     * <li><p><code>basic</code>: basic mode.</p>
     * </li>
     * <li><p><code>private</code>: dedicated mode. This mode is supported in clusters of Kubernetes 1.22 and later.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>The Kubernetes configurations for the nodes.</p>
     */
    @NameInMap("kubernetes_config")
    public NodepoolKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations of the managed node pool.</p>
     */
    @NameInMap("management")
    public NodepoolManagement management;

    /**
     * <p>边缘节点池允许容纳的最大节点数量，该参数大于等于 0。0 表示无额外限制（仅受限于集群整体可以容纳的节点数，节点池本身无额外限制）。边缘节点池该参数值往往大于 0；ess 类型节点池和默认的 edge 类型节点池该参数值为 0。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_nodes")
    public Long maxNodes;

    /**
     * <p>节点组件列表。</p>
     */
    @NameInMap("node_components")
    public java.util.List<NodepoolNodeComponents> nodeComponents;

    /**
     * <p>节点配置。</p>
     */
    @NameInMap("node_config")
    public NodepoolNodeConfig nodeConfig;

    /**
     * <p>The configurations of the node pool.</p>
     */
    @NameInMap("nodepool_info")
    public NodepoolNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group.</p>
     */
    @NameInMap("scaling_group")
    public NodepoolScalingGroup scalingGroup;

    /**
     * <p>The configurations of the confidential computing node pool.</p>
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
         * <p>[This parameter is deprecated.]</p>
         * <p>The peak bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>[This parameter is deprecated.]</p>
         * <p>The billing method for the EIP. Valid values:</p>
         * <ul>
         * <li><p><code>PayByBandwidth</code>: Pay-by-bandwidth.</p>
         * </li>
         * <li><p><code>PayByTraffic</code>: Pay-by-traffic.</p>
         * </li>
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
         * <p>Whether to enable auto scaling.</p>
         * <ul>
         * <li><p><code>true</code>: enables auto scaling for the node pool.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto scaling. If you set this parameter to <code>false</code>, other parameters in the <code>auto_scaling</code> object do not take effect.</p>
         * </li>
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
         * <p>[This parameter is deprecated.]</p>
         * <p>Whether to associate an EIP with each node in the pool. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: associates an EIP.</p>
         * </li>
         * <li><p><code>false</code>: does not associate an EIP.</p>
         * </li>
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
         * <p>The maximum number of instances in the auto scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of instances in the auto scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The type of instances to which auto scaling applies. This determines the scaling behavior. Valid values:</p>
         * <ul>
         * <li><p><code>cpu</code>: Regular instances.</p>
         * </li>
         * <li><p><code>gpu</code>: GPU-accelerated instances.</p>
         * </li>
         * <li><p><code>gpushare</code>: Shared GPU-accelerated instances.</p>
         * </li>
         * <li><p><code>spot</code>: Spot instances.</p>
         * </li>
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
         * <p>【该字段已废弃】</p>
         * <p>边缘增强型节点池的网络带宽，单位：Mbps。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        @Deprecated
        public Long bandwidth;

        /**
         * <p>【该字段已废弃】</p>
         * <p>边缘增强型节点池绑定的云连接网实例 ID(CCNID)。</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        @Deprecated
        public String ccnId;

        /**
         * <p>【该字段已废弃】</p>
         * <p>边缘增强型节点池绑定的云连接网实例所属的地域。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        @Deprecated
        public String ccnRegionId;

        /**
         * <p>[This parameter is deprecated.]</p>
         * <p>The ID of the Cloud Enterprise Network (C</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        @Deprecated
        public String cenId;

        /**
         * <p>【该字段已废弃】</p>
         * <p>边缘增强型节点池的购买时长，单位：月。</p>
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
         * <p>Whether to install CloudMonitor on the nodes. After installation, you can view monitoring information about the instances in the CloudMonitor console. We recommend that you enable this feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: installs CloudMonitor on nodes.</p>
         * </li>
         * <li><p><code>false</code>: does not install CloudMonitor on nodes.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy of the nodes. This parameter is available only for clusters of Kubernetes 1.12.6 and later. The following policies are supported:</p>
         * <ul>
         * <li><p><code>static</code>: allows pods with specific resource characteristics to be granted with enhanced CPU affinity and exclusivity on the node.</p>
         * </li>
         * <li><p><code>none</code>: indicates that the default CPU affinity is used.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The labels to add to the nodes in the node pool.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The naming convention of the node. A node name consists of a prefix, an IP address, and a suffix.</p>
         * <ul>
         * <li><p>The prefix and suffix can consist of one or more parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A node name must start and end with a lowercase letter or a digit.</p>
         * </li>
         * <li><p>The node IP address is the complete private IP address of the node.</p>
         * </li>
         * </ul>
         * <p>This parameter consists of four comma-separated parts. For example, if you set the parameter to <code>customized,aliyun,ip,com</code>, where <code>customized</code> and <code>ip</code> are fixed strings, <code>aliyun</code> is the prefix, and <code>com</code> is the suffix, the node name is in the format of <code>aliyun.192.168.xxx.xxx.com</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The container runtime. Valid values:</p>
         * <ul>
         * <li><p><code>containerd</code>: Recommended. This runtime is supported in all cluster versions.</p>
         * </li>
         * <li><p><code>Sandboxed-Container.runv</code>: a sandboxed container that provides higher isolation. This runtime is supported in clusters of Kubernetes 1.24 and earlier.</p>
         * </li>
         * <li><p><code>docker</code>: This runtime is supported in clusters of Kubernetes 1.22 and earlier.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>containerd</code></p>
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
         * <p>The taints.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>The user data of the node.</p>
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
         * <p>Specifies whether to allow the node to be restarted.</p>
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
         * <p>Specifies whether to allow the kubelet to be automatically upgraded.</p>
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
         * <p>Specifies whether to allow the node to be restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The CVE vulnerability levels to automatically fix. You can specify multiple levels separated by commas.</p>
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
         * <li><p><code>true</code></p>
         * </li>
         * <li><p><code>false</code></p>
         * </li>
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
         * <p>The number of extra nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of extra nodes. You must specify this parameter or <code>surge</code>.</p>
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
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Specifies whether to enable auto repair. This parameter takes effect only if <code>enable</code> is set to <code>true</code>.</p>
         * <ul>
         * <li><p><code>true</code></p>
         * </li>
         * <li><p><code>false</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto repair policy for nodes.</p>
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
         * <p>Specifies whether to automatically fix CVEs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The policy for automatically fixing CVEs.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public NodepoolManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code></p>
         * </li>
         * <li><p><code>false</code>: If you set this parameter to false, the other parameters in the <code>management</code> object are ignored.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The auto upgrade configurations. This parameter takes effect only when <code>enable</code> is set to <code>true</code>.</p>
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
        /**
         * <p>节点组件自定义配置。</p>
         */
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
        /**
         * <p>节点组件配置。</p>
         */
        @NameInMap("config")
        public NodepoolNodeComponentsConfig config;

        /**
         * <p>节点组件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>节点组件版本</p>
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
         * <p>Kubelet 参数配置。</p>
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
         * <li><p><code>ess</code>: a regular node pool.</p>
         * </li>
         * <li><p><code>edge</code>: an edge node pool.</p>
         * </li>
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
         * <p>The type of the private pool that is used to start instances. An elasticity assurance or a capacity reservation service generates a private pool after the service takes effect. You can select a private pool to start instances. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: open mode. The system automatically matches an open private pool. If no matching private pool is found, the resources in the public pool are used.</p>
         * </li>
         * <li><p><code>Target</code>: targeted mode. The instance is started from the specified private pool. If the private pool is unavailable, the instance fails to be started.</p>
         * </li>
         * <li><p><code>None</code>: no mode. The instance is not started from a private pool.</p>
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
         * <p>The list of private pool IDs. The IDs are the IDs of elasticity assurances or capacity reservations. This parameter accepts only IDs of private pools in targeted mode. You can specify up to 20 IDs.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy that is used to create instances. Resource pools include private pools generated by an elasticity assurance or a capacity reservation service and public pools. You can select a resource pool to start an instance. Valid values:
         * PrivatePoolFirst: The system prioritizes the use of private pools. If you specify <code>resource_pool_options.private_pool_ids</code>, the specified private pools are used first. If no private pool is specified or the capacity of the specified private pool is insufficient, the system automatically matches an open private pool. If no matching private pool is found, the resources in the public pool are used.
         * PrivatePoolOnly: The instance can be created only from a private pool. You must specify <code>resource_pool_options.private_pool_ids</code>. If the capacity of the specified private pool is insufficient, the instance fails to be created.
         * None: No resource pool policy is used.
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
         * <p>The spot instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum price of a single instance.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
         * <p>Whether to enable auto-renewal for the nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables auto-renewal.</p>
         * </li>
         * <li><p><code>false</code>: disables auto-renewal.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period for the nodes. This parameter is required and takes effect only if <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>If <code>PeriodUnit</code> is set to <code>Month</code>, the valid values are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code> and preemptible instances cannot be created due to price or inventory constraints. Valid values:</p>
         * <ul>
         * <li><p><code>true</code></p>
         * </li>
         * <li><p><code>false</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The configurations of the data disks that are attached to the nodes in the node pool.</p>
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
         * <p>The configurations of block devices.</p>
         */
        @NameInMap("disk_init")
        public java.util.List<DiskInit> diskInit;

        /**
         * <p>The ID of the custom image. If you do not set this parameter, the default system image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200904.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the OS image. You must specify this parameter or <code>platform</code>. Valid values:</p>
         * <ul>
         * <li><p><code>AliyunLinux</code>: Alinux 2 image.</p>
         * </li>
         * <li><p><code>AliyunLinux3</code>: Alinux 3 image.</p>
         * </li>
         * <li><p><code>AliyunLinux3Arm64</code>: Alinux 3 image for ARM.</p>
         * </li>
         * <li><p><code>AliyunLinuxUEFI</code>: Alinux 2 UEFI image.</p>
         * </li>
         * <li><p><code>CentOS</code>: CentOS image.</p>
         * </li>
         * <li><p><code>Windows</code>: Windows image.</p>
         * </li>
         * <li><p><code>WindowsCore</code>: Windows Core image.</p>
         * </li>
         * <li><p><code>ContainerOS</code>: Container-optimized image.</p>
         * </li>
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
         * <li><p><code>PrePaid</code>: subscription.</p>
         * </li>
         * <li><p><code>PostPaid</code>: pay-as-you-go.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The configurations of metadata access for the ECS instances.
         * This feature is available only to allowlisted users. To use this feature, submit a ticket.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance types.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address. Valid values:</p>
         * <ul>
         * <li><p><code>PayByBandwidth</code>: pay-by-bandwidth.</p>
         * </li>
         * <li><p><code>PayByTraffic</code>: pay-by-traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound public bandwidth of a node. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify this parameter or <code>login_password</code>.</p>
         * <blockquote>
         * <p>If you create a managed node pool, you can specify only <code>key_pair</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>np-key</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Specifies whether to use a non-root user to log on to the ECS instances that are created.</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The password for SSH access. You must specify this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for the ECS instances in a scaling group that spans multiple zones. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: The system scales instances based on the priority of the vSwitches specified in <code>vswitch_ids</code>. The system preferentially scales instances in the zone where the vSwitch with the highest priority resides. If the scaling fails, the system scales instances in the zone where the vSwitch with the next highest priority resides.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: The system scales instances based on the vCPU price from lowest to highest. The system preferentially scales instances that have the lowest vCPU price. If the scaling configuration includes multiple instance types and some of them are preemptible instance types, the system preferentially scales the preemptible instances. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to reasons such as stock-outs.</p>
         * <blockquote>
         * <p>The <code>COST_OPTIMIZED</code> policy takes effect only when multiple instance types are specified or preemptible instances are selected in the scaling configuration.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: The system evenly distributes ECS instances across the specified zones. If the distribution of instances becomes unbalanced due to stock-outs, you can call the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a> operation to rebalance the resources.</p>
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
         * <p>The minimum number of pay-as-you-go instances that must be provisioned in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, the system preferentially creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the instances that exceed the minimum number specified by <code>on_demand_base_capacity</code>. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the nodes in the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. If <code>period_unit</code> is set to <code>Month</code>, the valid values for <code>period</code> are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the subscription nodes in the node pool. This parameter is required when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p><code>Month</code>: The billing cycle is measured in months.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The OS distribution. Valid values:</p>
         * <ul>
         * <li><p><code>CentOS</code></p>
         * </li>
         * <li><p><code>AliyunLinux</code></p>
         * </li>
         * <li><p><code>Windows</code></p>
         * </li>
         * <li><p><code>WindowsCore</code></p>
         * </li>
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
         * <p>The name of the worker RAM role.</p>
         * <blockquote>
         * <p>Notice: This parameter can be configured only when you create a node pool in an ACK managed cluster of Kubernetes 1.22 or later.</p>
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

        /**
         * <p>The resource pool and resource pool policy that are used to create instances. Note the following when you set this parameter:
         * This parameter takes effect only when you create pay-as-you-go instances.
         * You cannot specify this parameter together with <code>private_pool_options.match_criteria</code> or <code>private_pool_options.id</code>.</p>
         */
        @NameInMap("resource_pool_options")
        public NodepoolScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>release</code>: the standard mode. In this mode, resources are scaled by creating and releasing ECS instances based on the resource usage.</p>
         * </li>
         * <li><p><code>recycle</code>: the rapid mode. In this mode, resources are scaled by creating, stopping, and starting ECS instances. This speeds up the scaling of resources. When an instance is stopped, you are not charged for its computing resources but are charged for its storage resources. This does not apply to instances that have local disks.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>release</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The ID of the security group to which you want to add the nodes. You must specify this parameter or <code>security_group_ids</code>. We recommend that you specify <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>A list of security group IDs. You must specify this parameter or <code>security_group_id</code>. We recommend that you specify <code>security_group_ids</code>. If you specify both <code>security_group_id</code> and <code>security_group_ids</code>, <code>security_group_ids</code> takes precedence.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of instance types. The scaling group creates preemptible instances of multiple instance types that have the lowest cost in a balanced manner. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable replenishment for preemptible instances. If this feature is enabled, the scaling group attempts to create a new instance to replace a preemptible instance that is about to be reclaimed. Valid values:</p>
         * <ul>
         * <li><p><code>true</code></p>
         * </li>
         * <li><p><code>false</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The price limits for specific spot instance types.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<NodepoolScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy for the pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: normal pay-as-you-go instances.</p>
         * </li>
         * <li><p>SpotWithPriceLimit: spot instances with a user-defined maximum hourly price.</p>
         * </li>
         * <li><p>SpotAsPriceGo: spot instances for which the system automatically bids based on the current market price.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Preemptible instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: enables the performance burst feature.</p>
         * </li>
         * <li><p>false: disables the performance burst feature.</p>
         * </li>
         * </ul>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>A prioritized list of system disk types. The system attempts to create a system disk of a disk type with a higher priority. If the disk type is unavailable, the system uses the next disk type to create the system disk. Valid values:</p>
         * <ul>
         * <li><p>cloud: basic disk.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * </ul>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The type of the system disk. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: ultra disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: enhanced SSD (ESSD).</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL disk.</p>
         * </li>
         * <li><p><code>cloud_essd_entry</code>: ESSD Entry disk.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>cloud_efficiency</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The encryption algorithm that is used for the system disk. Set the value to aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values: true and false.</p>
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
         * <p>The performance level of the ESSD that is used as the system disk. This parameter takes effect only for ESSDs.</p>
         * <ul>
         * <li><p>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the system disk. The valid values are 0 to min{50000, 1000 × Capacity - Base IOPS}. The default Base IOPS is min{1800 + 50 × Capacity, 50000}.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <p>The tags to add to the ECS instances in the node pool.</p>
         * <p>A tag key must be unique and can be up to 128 characters in length. A tag key and a tag value cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>https://</code> or <code>http://</code>.</p>
         */
        @NameInMap("tags")
        public java.util.List<NodepoolScalingGroupTags> tags;

        /**
         * <p>The IDs of the vSwitches to which the nodes can be added.</p>
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
         * <p>Specifies whether to create a confidential computing node pool.</p>
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
