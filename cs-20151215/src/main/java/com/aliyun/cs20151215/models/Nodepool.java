// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Nodepool extends TeaModel {
    /**
     * <p>The auto scaling configuration of the node pool.</p>
     */
    @NameInMap("auto_scaling")
    public NodepoolAutoScaling autoScaling;

    /**
     * <p>[This field is deprecated. Use desired_size instead.]</p>
     * <p>The number of nodes in the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p>[This field is deprecated.]</p>
     * <p>The edge node pool configuration.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public NodepoolInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This value is valid only for node pools whose <code>type</code> is <code>edge</code>. Valid values:</p>
     * <ul>
     * <li><code>basic</code>: basic.</li>
     * <li><code>private</code>: dedicated. Supported in version 1.22 and later.</li>
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
     * <p>The maximum number of nodes allowed in the edge node pool. This parameter must be greater than or equal to 0. A value of 0 indicates no additional limit (the node pool is limited only by the maximum number of nodes that the cluster can accommodate). For edge node pools, this value is typically greater than 0. For ESS-type node pools and default edge-type node pools, this value is 0.</p>
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
     * <p>The confidential computing node pool configuration.</p>
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
         * <p>[This field is deprecated]</p>
         * <p>The peak bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>[This field is deprecated]</p>
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-fixed-bandwidth.</li>
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
         * <p>Specifies whether to enable auto scaling.</p>
         * <ul>
         * <li><code>true</code>: Enables the auto scaling feature for the node pool.</li>
         * <li><code>false</code>: Disables auto scaling. When set to false, other configuration parameters in <code>auto_scaling</code> do not take effect.</li>
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
         * <p>[This field is deprecated]</p>
         * <p>Specifies whether to associate an EIP. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Associates an EIP.</li>
         * <li><code>false</code>: Does not associate an EIP.</li>
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
         * <p>The auto scaling type, classified by instance type. Valid values:</p>
         * <ul>
         * <li><code>cpu</code>: regular instance type.</li>
         * <li><code>gpu</code>: GPU instance type.</li>
         * <li><code>gpushare</code>: GPU shared type.</li>
         * <li><code>spot</code>: spot instance type.</li>
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
         * <p>边缘增强型节点池绑定的云连接网实例ID(CCNID)。</p>
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
         * <p>【该字段已废弃】</p>
         * <p>边缘增强型节点池绑定的云企业网实例ID(CENID)。</p>
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
         * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After installation, you can view monitoring information of the created ECS instances in the CloudMonitor console. We recommend that you enable this feature. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Installs the CloudMonitor agent on ECS nodes.</li>
         * <li><code>false</code>: Does not install the CloudMonitor agent on ECS nodes.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy for nodes. The following two policies are supported for clusters of version 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: Enables the existing default CPU affinity scheme.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The node labels. Adds labels to Kubernetes cluster nodes.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The node name consists of three parts: prefix + node IP + suffix:</p>
         * <ul>
         * <li>Both the prefix and suffix can consist of one or more parts separated by &quot;.&quot;. Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or digit.</li>
         * <li>The node IP is the complete private IP address of the node.</li>
         * </ul>
         * <p>The parameter contains four parts separated by commas. For example, if you pass in the string &quot;customized,aliyun,ip,com&quot; (where &quot;customized&quot; and &quot;ip&quot; are fixed strings, &quot;aliyun&quot; is the prefix, and &quot;com&quot; is the suffix), the node name is: aliyun.192.168.xxx.xxx.com.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The container runtime. Valid values:</p>
         * <ul>
         * <li><code>containerd</code>: Recommended. Supports all cluster versions.</li>
         * <li><code>Sandboxed-Container.runv</code>: Sandboxed container that provides higher isolation. Supports clusters of version 1.24 or earlier.</li>
         * <li><code>docker</code>: Supports clusters of version 1.22 or earlier.</li>
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
         * <p>The node custom data.</p>
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
         * <p>Specifies whether to allow node restart.</p>
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
         * <p>是否允许自动升级kubelet。</p>
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
         * <p>Specifies whether to allow node restart.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>允许自动修复的漏洞级别，以逗号分隔。</p>
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
         * <li><code>true</code>: Enables auto upgrade.</li>
         * <li><code>false</code>: Disables auto upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of unavailable nodes. Valid values: [1,1000\].</p>
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
         * <p>The extra node percentage. Specify either this parameter or <code>surge</code>.</p>
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
         * <p>Specifies whether to enable auto repair. This parameter takes effect only when <code>enable=true</code>.</p>
         * <ul>
         * <li><code>true</code>: Enables auto repair.</li>
         * <li><code>false</code>: Disables auto repair.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto repair node policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public NodepoolManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>是否自动升级。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>自动升级策略。</p>
         */
        @NameInMap("auto_upgrade_policy")
        public NodepoolManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Specifies whether to automatically fix CVEs.
         * [properties.management.properties.auto_v</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>自动修复CVE策略。</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public NodepoolManagementAutoVulFixPolicy autoVulFixPolicy;

        @NameInMap("drift_enabled")
        public Boolean driftEnabled;

        /**
         * <p>Specifies whether to enable the managed node pool. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables the managed node pool.</li>
         * <li><code>false</code>: Disables the managed node pool. Other related configurations take effect only when <code>enable=true</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The auto upgrade configuration. This parameter takes effect only when <code>enable=true</code>.</p>
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

    public static class NodepoolNodeComponentsConfig extends TeaModel {
        /**
         * <p>节点组件自定义配置。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

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
         * <p>Kubelet参数配置。</p>
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
         * <p>The node pool name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource group ID of the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The node pool type. Valid values:</p>
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
         * <p>The private pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The private pool type. The private pool capacity option for instance launch. After an elasticity assurance or capacity reservation takes effect, a private pool is generated for instances to select during launch. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: Open mode. Automatically matches open-type private pool capacity. If no matching private pool capacity is available, public pool resources are used for launch.</p>
         * </li>
         * <li><p><code>Target</code>: Targeted mode. Uses the specified private pool capacity to launch instances. If the specified private pool capacity is unavailable, the instance fails to launch.</p>
         * </li>
         * <li><p><code>None</code>: None mode. The instance launch does not use private pool capacity.</p>
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
         * <p>The list of private pool IDs, which are elasticity assurance IDs or capacity reservation IDs. Only Target mode private pool IDs can be passed in. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy used when creating instances. Resource pools include private pools generated after elasticity assurance or capacity reservation takes effect, and public pools, for instances to select during launch. Valid values:
         * PrivatePoolFirst: Private pool first. When this policy is selected and resource_pool_options.private_pool_ids is specified, the specified private pools are used first. If no private pool is specified or the specified private pool capacity is insufficient, open-type private pools are automatically matched. If no matching private pool is available, public pool resources are used to create instances.
         * PrivatePoolOnly: Private pool only. When this policy is selected, resource_pool_options.private_pool_ids must be specified. If the specified private pool capacity is insufficient, the instance fails to launch.
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
         * <p>Specifies whether to enable auto-renewal for the node pool. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables auto-renewal.</li>
         * <li><code>false</code>: Disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period of the node pool. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>When <code>PeriodUnit=Month</code>, valid values: {1, 2, 3, 6, 12}.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>When <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>, specifies whether to allow automatic creation of pay-as-you-go instances to meet ECS instance quantity requirements when spot instances cannot be created due to price or inventory reasons. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows automatic creation of pay-as-you-go instances to meet ECS instance quantity requirements.</li>
         * <li><code>false</code>: Does not allow automatic creation of pay-as-you-go instances to meet ECS instance quantity requirements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The data cloud disk configuration for nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The desired number of nodes in the node pool.</p>
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
         * <p>The custom image ID. The system-provided image is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200904.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system image type. Specify either this parameter or the platform parameter. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux</code>: Alinux2 image.</li>
         * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
         * <li><code>AliyunLinux3Arm64</code>: Alinux3 image for ARM.</li>
         * <li><code>AliyunLinuxUEFI</code>: Alinux2 UEFI image.</li>
         * <li><code>CentOS</code>: CentOS image.</li>
         * <li><code>Windows</code>: Windows image.</li>
         * <li><code>WindowsCore</code>: WindowsCore image.</li>
         * <li><code>ContainerOS</code>: container-optimized image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method for nodes in the node pool. Valid values:</p>
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

        /**
         * <p>The ECS instance metadata access configuration.
         * This parameter is currently available only to accounts on the whitelist. Submit a ticket to apply.</p>
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
         * <p>The billing method for public IP addresses. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-fixed-bandwidth.</li>
         * <li><code>PayByTraffic</code>: pay-by-data-transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth for node public IP addresses. Unit: Mbit/s. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The key pair name. Specify either this parameter or <code>login_password</code>.</p>
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
         * <p>Specifies whether to use a non-root user to log on to scaled-out ECS instances.</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The SSH logon password. Specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The multi-zone scaling policy for ECS instances in the scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scales based on the vSwitches (VSwitchIds.N) that you define. When ECS instances cannot be created in the zone of a higher-priority vSwitch, the system automatically uses the next-priority vSwitch to create ECS instances.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Attempts to create instances in order of vCPU unit price from lowest to highest. When the scaling configuration specifies multiple instance types with spot billing method, spot instances are created first. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically attempt to create pay-as-you-go instances when spot instances cannot be created due to insufficient inventory or other reasons.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Evenly allocates ECS instances across the multiple zones specified in the scaling group. If zones become unbalanced due to insufficient inventory or other reasons, you can use the API RebalanceInstances to rebalance resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
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
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: [0,1000]. When the number of pay-as-you-go instances is less than this value, pay-as-you-go instances are created first.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the instances that exceed the minimum number of pay-as-you-go instances (<code>on_demand_base_capacity</code>). Valid values: [0,100].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration for nodes in the node pool. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. When <code>period_unit</code> is set to Month, valid values for <code>period</code>: {1, 2, 3, 6, 12}.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The subscription period unit for nodes in the node pool. This parameter must be specified when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p><code>Month</code>: Currently only month is supported as the unit.</p>
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
         * <p>The private pool configuration.</p>
         */
        @NameInMap("private_pool_options")
        public NodepoolScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The Worker RAM role name.</p>
         * <blockquote>
         * <p>Notice: Only ACK managed clusters of version 1.22 or later support configuring this parameter when creating a node pool.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example-role</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>The list of RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and resource pool policy used when creating instances. Note the following when you set this parameter:
         * This parameter takes effect only when creating pay-as-you-go instances.
         * This parameter cannot be set together with private_pool_options.match_criteria or private_pool_options.id.</p>
         */
        @NameInMap("resource_pool_options")
        public NodepoolScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling group mode. Valid values:</p>
         * <ul>
         * <li><code>release</code>: standard mode. Scales by creating and releasing ECS instances based on resource usage.</li>
         * <li><code>recycle</code>: rapid mode. Scales by creating, stopping, and starting instances to improve the speed of subsequent scaling operations (compute resources are not charged during stop, only storage fees are charged, except for local disk instance types).</li>
         * </ul>
         * <p>Default value: <code>release</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The security group ID of the node pool. Specify either this parameter or <code>security_group_ids</code>. We recommend that you use <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The list of security group IDs. Specify either this parameter or <code>security_group_id</code>. We recommend that you use <code>security_group_ids</code>. When both <code>security_group_id</code> and <code>security_group_ids</code> are specified, <code>security_group_ids</code> takes precedence.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of available instance types. The scaling group creates spot instances across the lowest-cost instance types in a balanced manner. Valid values: [1,10].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable supplementing spot instances. When enabled, the scaling group attempts to create new instances to replace spot instances that are about to be reclaimed upon receiving a system notification. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables supplementing spot instances.</li>
         * <li><code>false</code>: Disables supplementing spot instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The market price range configuration for a single spot instance type.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<NodepoolScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The type of spot instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: non-spot instance.</li>
         * <li>SpotWithPriceLimit: spot instance with a price limit.</li>
         * <li>SpotAsPriceGo: system automatically bids at the current market price.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable burst (performance burst) for the node system cloud disk. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>This parameter is supported only when <code>SystemDiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>Multiple cloud disk types for the system cloud disk. When a higher-priority cloud disk type is unavailable, the system automatically attempts the next-priority cloud disk type to create the system cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The system cloud disk type for nodes. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
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
         * <p>The encryption algorithm for the node system cloud disk. Valid values: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system cloud disk. Valid values: true: encrypted. false: not encrypted.</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The KMS key ID used for the node system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level of the node system cloud disk. This parameter takes effect only for ESSD cloud disks.</p>
         * <ul>
         * <li>PL0: moderate maximum concurrent I/O performance with relatively stable read/write latency.</li>
         * <li>PL1: moderate maximum concurrent I/O performance with relatively stable read/write latency.</li>
         * <li>PL2: high maximum concurrent I/O performance with stable read/write latency.</li>
         * <li>PL3: ultra-high maximum concurrent I/O performance with extremely stable read/write latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for the node system cloud disk. Valid values: 0~min{50,000, 1000\*capacity-baseline performance}. Baseline performance=min{1,800+50\*capacity, 50000}.</p>
         * <p>This parameter is supported only when <code>SystemDiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The node system cloud disk size. Unit: GiB.</p>
         * <p>Valid values: [40,500].</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>Adds tags only to ECS instances.</p>
         * <p>Tag keys cannot be duplicated and can be up to 128 characters in length. Tag keys and tag values cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, or contain &quot;https://&quot; or &quot;http://&quot;.</p>
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
         * <p>Specifies whether this is a confidential computing node pool.</p>
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
