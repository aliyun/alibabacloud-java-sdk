// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolRequest extends TeaModel {
    /**
     * <p>Auto scaling configuration.</p>
     */
    @NameInMap("auto_scaling")
    public ModifyClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p>Whether to run concurrently.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("concurrency")
    public Boolean concurrency;

    /**
     * <p>Cluster-related configuration.</p>
     */
    @NameInMap("kubernetes_config")
    public ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>Managed node pool configuration.</p>
     */
    @NameInMap("management")
    public ModifyClusterNodePoolRequestManagement management;

    /**
     * <p>Node pool configuration.</p>
     */
    @NameInMap("nodepool_info")
    public ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>Node pool scaling group configuration.</p>
     */
    @NameInMap("scaling_group")
    public ModifyClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>Confidential computing cluster configuration.</p>
     */
    @NameInMap("tee_config")
    public ModifyClusterNodePoolRequestTeeConfig teeConfig;

    /**
     * <p>Synchronously update node labels and taints.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public ModifyClusterNodePoolRequest setConcurrency(Boolean concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Boolean getConcurrency() {
        return this.concurrency;
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
         * <p>[This field is deprecated] Please use internet_charge_type and internet_max_bandwidth_out instead.
         * EIP peak bandwidth.</p>
         * <p>Valid values: [1,100]. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>[This field is deprecated] Please use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <p>EIP billing type. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: Pay by fixed bandwidth.</li>
         * <li><code>PayByTraffic</code>: Pay by traffic usage.</li>
         * </ul>
         * <p>Default value: <code>PayByBandwidth</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("eip_internet_charge_type")
        @Deprecated
        public String eipInternetChargeType;

        /**
         * <p>Whether to enable auto scaling. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable node pool auto scaling. When the cluster\&quot;s capacity planning cannot meet application Pod scheduling requirements, ACK automatically scales node resources based on the configured minimum and maximum instance counts. Clusters with version 1.24 and above enable instant node elasticity by default;
         * clusters with versions below 1.24 enable node auto scaling by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node Scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: Disable auto scaling. ACK adjusts the number of nodes in the node pool according to the configured desired node count, always maintaining the node count at the desired number.</p>
         * </li>
         * </ul>
         * <p>When the value is false, other configuration parameters in <code>auto_scaling</code> will not take effect.</p>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>[This field is deprecated] This field is deprecated. Please use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <ul>
         * <li><code>true</code>: Bindpublic EIP.</li>
         * <li><code>false</code>: Do not bind EIP.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("is_bond_eip")
        @Deprecated
        public Boolean isBondEip;

        /**
         * <p>The maximum number of scalable instances in the node pool, excluding your existing instances. Only takes effect when <code>enable=true</code>.</p>
         * <p>Valid values: [min_instances, 2000]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of scalable instances in the node pool, excluding your existing instances. Only takes effect when <code>enable=true</code>.</p>
         * <p>Valid values: [0, max_instances]. Default value: 0.</p>
         * <blockquote>
         * <ul>
         * <li>When the minimum number of instances is not 0, the corresponding number of ECS instances will be automatically created after the scaling group takes effect.</li>
         * <li>It is recommended that the configured maximum number of instances is not less than the current number of nodes in the node pool. Otherwise, the elastic scaling function will directly cause the node pool to scale in after taking effect.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>Auto scaling type, classified by auto scaling instance type. Valid values:</p>
         * <ul>
         * <li><code>cpu</code>: Regular instance type.</li>
         * <li><code>gpu</code>: GPU instance type.</li>
         * <li><code>gpushare</code>: GPU sharing type.</li>
         * <li><code>spot</code>: Preemptible instance type.</li>
         * </ul>
         * <p>Default value: <code>cpu</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("type")
        @Deprecated
        public String type;

        public static ModifyClusterNodePoolRequestAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestAutoScaling self = new ModifyClusterNodePoolRequestAutoScaling();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ModifyClusterNodePoolRequestAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        @Deprecated
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

        @Deprecated
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

        @Deprecated
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
         * <p>Whether to install CloudMonitor on ECS nodes. After installation, you can view monitoring information of the created ECS instances in the CloudMonitor console. Recommended to enable. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Install CloudMonitor on ECS nodes.</li>
         * <li><code>false</code>: Do not install CloudMonitor on ECS nodes.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>Node CPU management policy. Supported when the cluster version is 1.12.6 or above:</p>
         * <ul>
         * <li><code>static</code>: Allows enhancing CPU affinity and exclusivity for Pods with certain resource characteristics on the node.</li>
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
         * <p>Node labels. Add labels to Kubernetes cluster nodes. Label definition rules:</p>
         * <ul>
         * <li>Labels are case-sensitive key-value pairs. You can set up to 20 labels.</li>
         * <li>Label keys cannot be duplicated and can be up to 64 characters. Label values can be empty and up to 128 characters. Label keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>Custom node name parameter. The node name consists of three parts: prefix + node IP + suffix.</p>
         * <p>Both the prefix and suffix can consist of one or more parts separated by &quot;.&quot;. Each part can use lowercase letters, digits, and &quot;-&quot;. The node name must start and end with a lowercase letter or digit. The node IP is the complete private IP address of the node.</p>
         * <p>The parameter includes four parts separated by commas. For example, passing &quot;customized,aliyun,ip,com&quot; (where &quot;customized&quot; and &quot;ip&quot; are fixed strings, aliyun is the prefix, and com is the suffix), the node name will be: aliyun.192.168.xxx.xxx.com.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>Instance pre-custom data. Before the node joins the cluster, the specified instance pre-custom data script will be run. See <a href="https://help.aliyun.com/document_detail/49121.html">User-Data scripts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>Container runtime name. ACK supports the following three container runtimes:</p>
         * <ul>
         * <li>containerd: Recommended. Supports all cluster versions.</li>
         * <li>Sandboxed-Container.runv: Sandboxed container, providing higher isolation. Supports clusters with version 1.31 and below.</li>
         * <li>docker: Maintenance discontinued. Supports clusters with version 1.22 and below.</li>
         * </ul>
         * <p>Default value: containerd.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Container runtime version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.38</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>Node taint configuration.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Whether the node is unschedulable after scaling out.</p>
         * <ul>
         * <li><p>true: Unschedulable.</p>
         * </li>
         * <li><p>false: Schedulable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>Instance custom data. After the node joins the cluster, the specified instance custom data script will be run. See <a href="https://help.aliyun.com/document_detail/49121.html">User-Data scripts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
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

        public ModifyClusterNodePoolRequestKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
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

        public ModifyClusterNodePoolRequestKubernetesConfig setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ModifyClusterNodePoolRequestManagementAutoRepairPolicy extends TeaModel {
        /**
         * <p>Whether node repair requires manual approval.</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>Auto repair policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>Whether to allow restarting nodes. Only takes effect when <code>auto_repair=true</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allow restarting nodes.</li>
         * <li><code>false</code>: Do not allow restarting nodes.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        public static ModifyClusterNodePoolRequestManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagementAutoRepairPolicy self = new ModifyClusterNodePoolRequestManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy setApprovalRequired(Boolean approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }
        public Boolean getApprovalRequired() {
            return this.approvalRequired;
        }

        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy setAutoRepairPolicyId(String autoRepairPolicyId) {
            this.autoRepairPolicyId = autoRepairPolicyId;
            return this;
        }
        public String getAutoRepairPolicyId() {
            return this.autoRepairPolicyId;
        }

        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

    }

    public static class ModifyClusterNodePoolRequestManagementAutoUpgradePolicy extends TeaModel {
        /**
         * <p>Whether to allow auto upgrading kubelet. Only takes effect when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allow auto upgrading kubelet.</li>
         * <li><code>false</code>: Do not allow auto upgrading kubelet.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        /**
         * <p>Whether to allow auto upgrading the operating system. Only takes effect when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allow auto upgrading the operating system.</li>
         * <li><code>false</code>: Do not allow auto upgrading the operating system.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade_os")
        public Boolean autoUpgradeOs;

        /**
         * <p>Whether to allow auto upgrading the runtime. Only takes effect when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allow auto upgrading the runtime.</li>
         * <li><code>false</code>: Do not allow auto upgrading the runtime.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade_runtime")
        public Boolean autoUpgradeRuntime;

        public static ModifyClusterNodePoolRequestManagementAutoUpgradePolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagementAutoUpgradePolicy self = new ModifyClusterNodePoolRequestManagementAutoUpgradePolicy();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeKubelet(Boolean autoUpgradeKubelet) {
            this.autoUpgradeKubelet = autoUpgradeKubelet;
            return this;
        }
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

        public ModifyClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeOs(Boolean autoUpgradeOs) {
            this.autoUpgradeOs = autoUpgradeOs;
            return this;
        }
        public Boolean getAutoUpgradeOs() {
            return this.autoUpgradeOs;
        }

        public ModifyClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeRuntime(Boolean autoUpgradeRuntime) {
            this.autoUpgradeRuntime = autoUpgradeRuntime;
            return this;
        }
        public Boolean getAutoUpgradeRuntime() {
            return this.autoUpgradeRuntime;
        }

    }

    public static class ModifyClusterNodePoolRequestManagementAutoVulFixPolicy extends TeaModel {
        /**
         * <p>Specifies the packages to be excluded during vulnerability fix.</p>
         * <p>Default value: <code>kernel</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Whether to allow restarting nodes. Only takes effect when <code>auto_vul_fix=true</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allow restarting nodes.</li>
         * <li><code>false</code>: Do not allow restarting nodes.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>Vulnerability levels allowed for automatic fixing, separated by commas. For example: <code>asap,later</code>. Supported vulnerability levels:</p>
         * <ul>
         * <li><code>asap</code>: High</li>
         * <li><code>later</code>: Medium</li>
         * <li><code>nntf</code>: Low</li>
         * </ul>
         * <p>Default value: <code>asap</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>asap,nntf</p>
         */
        @NameInMap("vul_level")
        public String vulLevel;

        public static ModifyClusterNodePoolRequestManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagementAutoVulFixPolicy self = new ModifyClusterNodePoolRequestManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy setExcludePackages(String excludePackages) {
            this.excludePackages = excludePackages;
            return this;
        }
        public String getExcludePackages() {
            return this.excludePackages;
        }

        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class ModifyClusterNodePoolRequestManagementUpgradeConfig extends TeaModel {
        /**
         * <p>[This field is deprecated] Please use the <code>auto_upgrade</code> parameter at the parent level instead.</p>
         * <p>Whether to enable auto upgrade:</p>
         * <ul>
         * <li>true: Enable.</li>
         * <li>false: Disable.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        @Deprecated
        public Boolean autoUpgrade;

        /**
         * <p>Maximum number of unavailable nodes.</p>
         * <p>Valid values: [1,1000\]</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>Number of extra nodes. Mutually exclusive with <code>surge_percentage</code>.</p>
         * <p>During upgrade, nodes will be unavailable. You can create extra nodes to compensate for the cluster workload.</p>
         * <blockquote>
         * <p>It is recommended that the number of extra nodes does not exceed the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>Percentage of extra nodes. Mutually exclusive with <code>surge</code>.</p>
         * <p>Number of extra nodes = percentage of extra nodes × number of nodes. For example, if the percentage of extra nodes is set to 50% and there are 6 existing nodes, the number of extra nodes = 50% × 6, which produces 3 extra nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static ModifyClusterNodePoolRequestManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagementUpgradeConfig self = new ModifyClusterNodePoolRequestManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        @Deprecated
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
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Whether to automatically repair nodes. Only takes effect when <code>enable=true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Auto repair.</p>
         * </li>
         * <li><p><code>false</code>: Do not auto repair.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>Auto repair node policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Whether to automatically upgrade nodes. Only takes effect when <code>enable=true</code>.</p>
         * <ul>
         * <li><code>true</code>: Enable auto upgrade.</li>
         * <li><code>false</code>: Disable auto upgrade.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>Auto upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public ModifyClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Whether to automatically fix CVE vulnerabilities. Only takes effect when <code>enable=true</code>.</p>
         * <ul>
         * <li><code>true</code>: Allow automatic CVE fixing.</li>
         * <li><code>false</code>: Do not allow automatic CVE fixing.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>Auto CVE fix policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Whether to enable managed node pool. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enable managed node pool.</li>
         * <li><code>false</code>: Disable managed node pool. Other related configurations only take effect when <code>enable=true</code>.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>[This field is deprecated] Please use the <code>auto_upgrade</code> parameter at the parent level instead.</p>
         * <p>Auto upgrade configuration. Only takes effect when <code>enable=true</code>.</p>
         */
        @NameInMap("upgrade_config")
        @Deprecated
        public ModifyClusterNodePoolRequestManagementUpgradeConfig upgradeConfig;

        public static ModifyClusterNodePoolRequestManagement build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagement self = new ModifyClusterNodePoolRequestManagement();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagement setAutoFaultDiagnosis(Boolean autoFaultDiagnosis) {
            this.autoFaultDiagnosis = autoFaultDiagnosis;
            return this;
        }
        public Boolean getAutoFaultDiagnosis() {
            return this.autoFaultDiagnosis;
        }

        public ModifyClusterNodePoolRequestManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public ModifyClusterNodePoolRequestManagement setAutoRepairPolicy(ModifyClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy) {
            this.autoRepairPolicy = autoRepairPolicy;
            return this;
        }
        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        public ModifyClusterNodePoolRequestManagement setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public ModifyClusterNodePoolRequestManagement setAutoUpgradePolicy(ModifyClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy) {
            this.autoUpgradePolicy = autoUpgradePolicy;
            return this;
        }
        public ModifyClusterNodePoolRequestManagementAutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        public ModifyClusterNodePoolRequestManagement setAutoVulFix(Boolean autoVulFix) {
            this.autoVulFix = autoVulFix;
            return this;
        }
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        public ModifyClusterNodePoolRequestManagement setAutoVulFixPolicy(ModifyClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy) {
            this.autoVulFixPolicy = autoVulFixPolicy;
            return this;
        }
        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
        }

        public ModifyClusterNodePoolRequestManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
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
         * <p>Node pool name.</p>
         * <p>Naming rules: The name can contain digits, Chinese characters, English letters, or hyphens (-), must be 1 to 63 characters in length, and cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>default-nodepool</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource group ID of the node pool. Instances created by the node pool will belong to this resource group.</p>
         * <p>A resource can only belong to one resource group. Depending on different business scenarios, you can map a resource group to concepts such as projects, applications, or organizations.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
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
         * <p>Private node pool ID. When <code>match_criteria</code> is <code>Target</code>, you need to further specify the private pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Private node pool type. Private pool capacity option for instance launch. After an Elasticity Assurance or Capacity Reservation takes effect, a private pool capacity is generated for instance launch selection. Valid values:</p>
         * <ul>
         * <li><code>Open</code>: Open mode. Automatically matches open-type private pool capacity. If no matching private pool capacity is available, public pool resources are used for launch.</li>
         * <li><code>Target</code>: Targeted mode. Uses specified private pool capacity to launch instances. If the private pool capacity is unavailable, instance launch fails.</li>
         * <li><code>None</code>: Do not use mode. Instance launch will not use private pool capacity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
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

    public static class ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions extends TeaModel {
        /**
         * <p>List of private pool IDs, i.e., Elasticity Assurance IDs or Capacity Reservation IDs. Only Target mode private pool IDs can be passed. Valid values for N: 1~20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Resource pool policy used when creating instances. Resource pools include private pools generated after Elasticity Assurance or Capacity Reservation takes effect, as well as public pools, for instance launch selection. Valid values:
         * PrivatePoolFirst: Private pool first. When specified private_pool_ids are set, the specified private pools are used preferentially. If no private pool is specified or the specified private pool capacity is insufficient, open-type private pools are automatically matched. If no matching private pool is available, public pool resources are used to create instances.
         * PrivatePoolOnly: Private pool only. private_pool_ids must be specified. If the specified private pool capacity is insufficient, instance launch fails.
         * None: Do not use resource pool policy.
         * Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("strategy")
        public String strategy;

        public static ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions self = new ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>Preemptible instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>Maximum price per instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Unit: CNY/hour.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;Unit: USD/hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0.39</p>
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
         * <p>Whether to enable auto renewal for nodes. Only takes effect when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enable auto renewal.</li>
         * <li><code>false</code>: Disable auto renewal.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>Duration of each auto renewal. Valid values:</p>
         * <ul>
         * <li>When PeriodUnit=Week: 1, 2, 3.</li>
         * <li>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>When <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>, whether to allow automatically creating pay-as-you-go instances to meet ECS instance count requirements when sufficient preemptible instances cannot be created due to price, inventory, or other reasons. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allow automatically creating pay-as-you-go instances to meet ECS instance count requirements.</li>
         * <li><code>false</code>: Do not allow automatically creating pay-as-you-go instances to meet ECS instance count requirements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>Node data disk configuration. Valid values: [0,10\]. You can add up to 10 data disks.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The deployment set that the ECS instances created by the node pool belong to. Only takes effect for incremental nodes; the deployment set of existing nodes will not be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>Desired number of nodes in the node pool.</p>
         * <p>The total number of nodes that the node pool should maintain. It is recommended to configure at least 2 nodes to ensure cluster components run normally. You can scale the node pool in or out by adjusting the desired node count.</p>
         * <p>If you do not need to create nodes, you can set this to 0 and manually adjust it later to add nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>Block device initialization configuration.</p>
         */
        @NameInMap("disk_init")
        public java.util.List<DiskInit> diskInit;

        /**
         * <p>Custom image ID. You can query system-supported images through <code>DescribeKubernetesVersionMetadata</code>. The latest system image is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>Operating system distribution type. It is recommended to use this field to specify the node operating system. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux</code>: Alinux2 image.</li>
         * <li><code>AliyunLinuxSecurity</code>: Alinux2 image UEFI version.</li>
         * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
         * <li><code>AliyunLinux3Arm64</code>: Alinux3 image ARM version.</li>
         * <li><code>AliyunLinux3Security</code>: Alinux3 image UEFI version.</li>
         * <li><code>CentOS</code>: CentOS image.</li>
         * <li><code>Windows</code>: Windows image.</li>
         * <li><code>WindowsCore</code>: WindowsCore image.</li>
         * <li><code>ContainerOS</code>: Container-optimized image.</li>
         * <li><code>AliyunLinux3ContainerOptimized</code>: Alinux3 image container-optimized version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>Billing type for node pool nodes. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: Subscription.</li>
         * <li><code>PostPaid</code>: Pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>Instance attribute configuration.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>List of node instance types. You can select multiple instance types as alternatives. When creating each node, the system attempts to purchase starting from the first type until successful. The final purchased instance type may vary depending on inventory.</p>
         * <p>Supported number of instance types: [1,10].</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>Public IP billing type. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: Pay by fixed bandwidth.</li>
         * <li><code>PayByTraffic</code>: Pay by traffic usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>Maximum outbound bandwidth for node public IP, in Mbps (Mega bit per second). Valid values: [1,100\].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>Key pair name. Mutually exclusive with <code>login_password</code>. When the node pool is a managed node pool, only <code>key_pair</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>SSH login password. Mutually exclusive with <code>key_pair</code>. Password must be 8 to 30 characters and contain at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>Multi-AZ scaling group ECS instance scaling policy. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scale based on the vSwitches (VSwitchIds.N) you defined. When ECS instances cannot be created in the availability zone of the higher-priority vSwitch, the next priority vSwitch is automatically used to create ECS instances.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Create instances by trying from the lowest vCPU unit price. When the scaling configuration has set preemptible billing with multiple instance types, preemptible instances are created preferentially. You can further use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically try creating pay-as-you-go instances when preemptible instances cannot be created due to inventory or other reasons.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> only takes effect when the scaling configuration has set multiple instance types or selected preemptible instances.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Evenly distribute ECS instances across multiple availability zones specified by the scaling group. If the zones become unbalanced due to insufficient inventory or other reasons, you can use the API <code>RebalanceInstances</code> to rebalance resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PRIORITY</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>BALANCE</p>
         */
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        /**
         * <p>Minimum number of pay-as-you-go instances required by the scaling group. Valid values: [0,1000\]. Pay-as-you-go instances are created preferentially when the number of pay-as-you-go instances is less than this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>After the scaling group meets the minimum pay-as-you-go instance requirement (<code>on_demand_base_capacity</code>), the proportion of pay-as-you-go instances among the excess instances. Valid values: [0,100\].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>Subscription duration for node pool nodes. Only takes effect when <code>instance_charge_type</code> is set to <code>PrePaid</code>, and is required.</p>
         * <ul>
         * <li>When <code>period_unit=Week</code>, valid values for <code>period</code>: {1, 2, 3, 4}.</li>
         * <li>When <code>period_unit=Month</code>, valid values for <code>period</code>: {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>Billing cycle for node pool nodes. Only takes effect when <code>instance_charge_type</code> is set to <code>PrePaid</code>, and is required.</p>
         * <ul>
         * <li><code>Month</code>: Billed by month.</li>
         * <li><code>Week</code>: Billed by week.</li>
         * </ul>
         * <p>Default value: <code>Month</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>[This field is deprecated] Please use the <code>image_type</code> parameter instead.</p>
         * <p>Operating system platform. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux</code></li>
         * <li><code>CentOS</code></li>
         * <li><code>Windows</code></li>
         * <li><code>WindowsCore</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        @Deprecated
        public String platform;

        /**
         * <p>Private node pool configuration.</p>
         */
        @NameInMap("private_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>RDS instance list.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>Resource pool and resource pool policy used when creating instances. Note the following when setting this parameter:
         * This parameter only takes effect when creating pay-as-you-go instances.
         * This parameter cannot be set together with private_pool_options.match_criteria or private_pool_options.id.</p>
         */
        @NameInMap("resource_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>Scaling group mode. Valid values:</p>
         * <ul>
         * <li><code>release</code>: Standard mode. Scale by creating and releasing ECS instances based on resource usage.</li>
         * <li><code>recycle</code>: Swift mode. Scale by creating, stopping, and starting instances to improve subsequent scaling speed (compute resources are not charged during shutdown, only storage fees apply, except for local disk instance types).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>List of security group IDs.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Number of available instance types. The scaling group creates preemptible instances evenly across the lowest-cost instance types. Valid values: [1,10\].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Whether to enable supplementing preemptible instances. When enabled, the scaling group attempts to create new instances to replace preemptible instances that are about to be reclaimed upon receiving a system notification. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enable supplementing preemptible instances.</li>
         * <li><code>false</code>: Disable supplementing preemptible instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>Preemptible instance market price range configuration.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>Preemptible instance type. Valid values:</p>
         * <ul>
         * <li><code>NoSpot</code>: Non-preemptible instance.</li>
         * <li><code>SpotWithPriceLimit</code>: Set a maximum price for the preemptible instance.</li>
         * <li><code>SpotAsPriceGo</code>: System automatically bids, following the current market price.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Preemptible instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Whether to enable burst (performance burst) for the node system disk. Valid values:</p>
         * <ul>
         * <li>true: Enable. When enabled, cloud disks can temporarily boost performance based on actual business conditions when facing sudden data read/write pressure from volatile workloads, until the business returns to a steady state.</li>
         * <li>false: Disable.</li>
         * </ul>
         * <p>Only supported when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>Multiple disk types for the system disk. When the higher-priority disk type is unavailable, the system automatically tries the next priority disk type to create the system disk.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>Node system disk type. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: Ultra disk.</li>
         * <li><code>cloud_ssd</code>: SSD disk.</li>
         * <li><code>cloud_essd</code>: ESSD disk.</li>
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
         * <p>Encryption algorithm used for the system disk. Valid values: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypt.</p>
         * </li>
         * <li><p>false: Do not encrypt.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>KMS key ID used for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>Node system disk performance level. Only takes effect for ESSD disks. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD disks</a>.</p>
         * <ul>
         * <li>PL0: Medium concurrent extreme I/O performance, relatively stable read/write latency.</li>
         * <li>PL1: Medium concurrent extreme I/O performance, relatively stable read/write latency.</li>
         * <li>PL2: High concurrent extreme I/O performance, stable read/write latency.</li>
         * <li>PL3: Extremely high concurrent extreme I/O performance, extremely stable read/write latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Provisioned read/write IOPS for the node system disk.</p>
         * <p>Valid values: 0~min{50,000, 1000\*capacity-baseline performance}. Baseline performance=min{1,800+50\*capacity, 50000}.</p>
         * <p>Only supported when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>Node system disk size, in GiB.</p>
         * <p>Valid values: [20,2048\].</p>
         * <p>The value of this parameter must be greater than or equal to max{20, ImageSize}.</p>
         * <p>Default value: max{40, image size corresponding to the ImageId parameter}.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>System disk snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-0jl6xnmme8v7o935****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        /**
         * <p>Tags added only to ECS instances.</p>
         * <p>Tag keys cannot be duplicated and can be up to 128 characters. Tag keys and tag values cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, or contain &quot;https://&quot; or &quot;http://&quot;.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>List of vSwitch IDs. Valid values: [1,8\].</p>
         * <blockquote>
         * <p>To ensure high availability, it is recommended to select vSwitches in different availability zones.</p>
         * </blockquote>
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

        public ModifyClusterNodePoolRequestScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public ModifyClusterNodePoolRequestScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public ModifyClusterNodePoolRequestScalingGroup setDiskInit(java.util.List<DiskInit> diskInit) {
            this.diskInit = diskInit;
            return this;
        }
        public java.util.List<DiskInit> getDiskInit() {
            return this.diskInit;
        }

        public ModifyClusterNodePoolRequestScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ModifyClusterNodePoolRequestScalingGroup setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInstancePatterns(java.util.List<InstancePatterns> instancePatterns) {
            this.instancePatterns = instancePatterns;
            return this;
        }
        public java.util.List<InstancePatterns> getInstancePatterns() {
            return this.instancePatterns;
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

        @Deprecated
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

        public ModifyClusterNodePoolRequestScalingGroup setResourcePoolOptions(ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions) {
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }
        public ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
        }

        public ModifyClusterNodePoolRequestScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
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

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskKmsKeyId(String systemDiskKmsKeyId) {
            this.systemDiskKmsKeyId = systemDiskKmsKeyId;
            return this;
        }
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
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
         * <p>Whether to enable confidential computing cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enable.</li>
         * <li><code>false</code>: Disable.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
