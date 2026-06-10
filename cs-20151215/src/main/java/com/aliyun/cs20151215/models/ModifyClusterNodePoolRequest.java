// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The auto scaling configuration.</p>
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
     * <p>The cluster-related configuration.</p>
     */
    @NameInMap("kubernetes_config")
    public ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The managed node pool configuration.</p>
     */
    @NameInMap("management")
    public ModifyClusterNodePoolRequestManagement management;

    /**
     * <p>The node pool configuration.</p>
     */
    @NameInMap("nodepool_info")
    public ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>Node pool scaling group configuration.</p>
     */
    @NameInMap("scaling_group")
    public ModifyClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The configuration of the Kubernetes cluster for confidential computing.</p>
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
         * <p>This field is deprecated. Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <p>The valid values are 1 to 100. The unit is Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>[Deprecated] Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <p>The billing method for the EIP. Valid values:</p>
         * <ul>
         * <li><p><code>PayByBandwidth</code>: Pay by bandwidth.</p>
         * </li>
         * <li><p><code>PayByTraffic</code>: Pay by traffic.</p>
         * </li>
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
         * <p>Enable auto scaling. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable auto scaling. When cluster capacity is insufficient for pod scheduling, ACK automatically scales nodes based on the minimum and maximum instance counts you configure. For clusters running Kubernetes 1.24 or later, instant elasticity is enabled by default. For earlier versions, auto scaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: Disable auto scaling. ACK adjusts the number of nodes in the node pool to match the desired node count you specify.</p>
         * </li>
         * </ul>
         * <p>When set to false, other parameters under <code>auto_scaling</code> are ignored.</p>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>[Deprecated] Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <ul>
         * <li><p><code>true</code>: Bind an EIP.</p>
         * </li>
         * <li><p><code>false</code>: Do not bind an EIP.</p>
         * </li>
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
         * <p>The maximum number of scalable instances in the node pool, excluding existing instances. This parameter takes effect only when <code>enable=true</code>.</p>
         * <p>Valid values: [min_instances, 2000]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of scalable instances in the node pool, excluding existing instances. This parameter takes effect only when <code>enable=true</code>.</p>
         * <p>Valid values: [0, max_instances]. Default value: 0.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the minimum instance count is not zero, the system creates the specified number of ECS instances after the scaling group becomes active.</p>
         * </li>
         * <li><p>To avoid unintended scale-in, set the maximum instance count to at least the current number of nodes in the node pool.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The auto scaling type, defined by instance type. Valid values:</p>
         * <ul>
         * <li><p><code>cpu</code>: Standard instance.</p>
         * </li>
         * <li><p><code>gpu</code>: GPU instance.</p>
         * </li>
         * <li><p><code>gpushare</code>: GPU shared instance.</p>
         * </li>
         * <li><p><code>spot</code>: Spot instance.</p>
         * </li>
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
         * <p>Install Cloud Monitor on ECS nodes. After installation, you can view monitoring information for the created ECS instances in the Cloud Monitor console. We recommend enabling this. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Install Cloud Monitor on ECS nodes.</p>
         * </li>
         * <li><p><code>false</code>: Do not install Cloud Monitor on ECS nodes.</p>
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
         * <p>The node CPU management policy. The following two policies are supported for clusters of version 1.12.6 and later:</p>
         * <ul>
         * <li><p><code>static</code>: Allows pods with certain resource characteristics on the node to have enhanced CPU affinity and exclusivity.</p>
         * </li>
         * <li><p><code>none</code>: Enables the existing default CPU affinity scheme.</p>
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
         * <p>Node labels. Add labels to Kubernetes cluster nodes. Label rules:</p>
         * <ul>
         * <li><p>Labels are case-sensitive key-value pairs. You can set up to 20 labels.</p>
         * </li>
         * <li><p>Tag keys must be unique and up to 64 characters long. Tag values can be empty and up to 128 characters long. Neither tag keys nor tag values can start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</p>
         * </li>
         * </ul>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The custom node name parameter. A node name consists of three parts: prefix + node IP + suffix.</p>
         * <p>The prefix and suffix can each consist of one or more parts separated by periods (.). Each part can contain lowercase letters, numbers, and hyphens (-). The node name must start and end with a lowercase letter or a number. The node IP is the complete private IP address of the node.</p>
         * <p>The parameter is passed as four parts separated by commas. For example, if you pass the string &quot;customized,aliyun,ip,com&quot; (where &quot;customized&quot; and &quot;ip&quot; are fixed strings, &quot;aliyun&quot; is the prefix, and &quot;com&quot; is the suffix), the node name will be: aliyun.192.168.xxx.xxx.com.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The instance pre-customization data. Before a node joins the cluster, it runs the specified pre-customization data script. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User-Data script</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The container runtime name. ACK supports the following three container runtimes.</p>
         * <ul>
         * <li><p>containerd: Recommended. Supports all cluster versions.</p>
         * </li>
         * <li><p>Sandboxed-Container.runv: Sandboxed container. Provides higher isolation. Supports clusters of version 1.31 and earlier.</p>
         * </li>
         * <li><p>docker: No longer maintained. Supports clusters of version 1.22 and earlier.</p>
         * </li>
         * </ul>
         * <p>Default value: containerd.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The container runtime version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.38</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The node taint configuration.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Whether scaled-out nodes are unschedulable.</p>
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
         * <p>The instance user data. After a node joins the cluster, it runs the specified user data script. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User-Data script</a>.</p>
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
         * <p>Require manual approval for node repair.</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>The automatic node repair policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>Allow node restart. This parameter takes effect only when <code>auto_repair=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allow node restart.</p>
         * </li>
         * <li><p><code>false</code>: Disallow node restart.</p>
         * </li>
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
         * <p>Enable automatic kubelet upgrades. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic kubelet upgrades.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic kubelet upgrades.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        /**
         * <p>Enable automatic operating system upgrades. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic OS upgrades.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic OS upgrades.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade_os")
        public Boolean autoUpgradeOs;

        /**
         * <p>Enable automatic runtime upgrades. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic runtime upgrades.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic runtime upgrades.</p>
         * </li>
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
         * <p>Packages to exclude during vulnerability fixes.</p>
         * <p>Default value: <code>kernel</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Allow node restart. This parameter takes effect only when <code>auto_vul_fix=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allow node restart.</p>
         * </li>
         * <li><p><code>false</code>: Disallow node restart.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The severity levels of vulnerabilities that can be fixed automatically, separated by commas. Example: <code>asap,later</code>. Supported levels:</p>
         * <ul>
         * <li><p><code>asap</code>: High</p>
         * </li>
         * <li><p><code>later</code>: Medium</p>
         * </li>
         * <li><p><code>nntf</code>: Low</p>
         * </li>
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
         * <p>[Deprecated] Use the top-level <code>auto_upgrade</code> parameter instead.</p>
         * <p>Enable automatic upgrades. Valid values:</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
         * </li>
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
         * <p>The maximum number of unavailable nodes.</p>
         * <p>Valid values: [1, 1000].</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of additional nodes. Choose either surge or <code>surge_percentage</code>.</p>
         * <p>Nodes become unavailable during upgrades. Create extra nodes to maintain cluster load.</p>
         * <blockquote>
         * <p>Do not create more extra nodes than the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of additional nodes. Choose either surge or surge_percentage. The number of additional nodes equals <code>surge_percentage</code> × the number of nodes. For example, if <code>surge_percentage</code> is 50% and there are 6 nodes, then 3 additional nodes are created.</p>
         * <p>The number of additional nodes = The percentage of additional nodes × The number of nodes in the node pool. For example, if the percentage of additional nodes is 50% and the number of nodes in the node pool is 6, the number of additional nodes is 3.</p>
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
         * <p>Enable automatic node repair. This parameter takes effect only when <code>enable=true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic repair.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic repair.</p>
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
         * <p>The automatic node repair policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Enable automatic node upgrades. This parameter takes effect only when <code>enable=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic upgrades.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic upgrades.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The automatic upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public ModifyClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Enable automatic CVE vulnerability fixes. This parameter takes effect only when <code>enable=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic CVE fixes.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic CVE fixes.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The automatic CVE fix policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Enable the managed node pool. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable the managed node pool.</p>
         * </li>
         * <li><p><code>false</code>: Disable the managed node pool. Other related configurations take effect only when <code>enable=true</code>.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>[Deprecated] Use the top-level <code>auto_upgrade</code> parameter instead.</p>
         * <p>The automatic upgrade configuration. This parameter takes effect only when <code>enable=true</code>.</p>
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
         * <p>The node pool name.</p>
         * <p>Name rules: Use only numbers, letters, or hyphens (-). The name must be 1 to 63 characters long and cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>default-nodepool</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource group ID for the node pool. Nodes created from this node pool belong to this resource group.</p>
         * <p>A resource can belong to only one resource group. Map resource groups to projects, applications, or organizations based on your business needs.</p>
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
         * <p>The private node pool ID. This is required when <code>match_criteria</code> is set to <code>Target</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The private node pool type, which determines the capacity option for instance startup. Elastic assurance services or capacity reservation services generate private pool capacity for instance startup. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: Open mode. Automatically matches open-type private pool capacity. If no suitable private pool is found, public pool resources are used.</p>
         * </li>
         * <li><p><code>Target</code>: Specified mode. Starts instances using the specified private pool capacity. If the capacity is unavailable, the instance startup fails.</p>
         * </li>
         * <li><p><code>None</code>: No mode. The instance startup does not use private pool capacity.</p>
         * </li>
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
         * <p>The list of private pool IDs, which are the IDs of elastic assurance or capacity reservation services. You can only pass Target mode private pool IDs. The value of N can range from 1 to 20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy for instance creation. Resource pools include private pools generated by elastic assurance or capacity reservation services, and public pools. Valid values: PrivatePoolFirst: Prioritizes private pools. If resouce_pool_options.private_pool_ids is specified, it uses the specified private pools first. If no private pool is specified or the specified capacity is insufficient, it automatically matches open-type private pools. If no suitable private pool is found, it uses the public pool. PrivatePoolOnly: Uses only private pools. You must specify resouce_pool_options.private_pool_ids. If the specified private pool capacity is insufficient, the instance startup fails. None: Does not use a resource pool policy. Default value: None.</p>
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
         * <p>The spot instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum hourly price for the instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Unit: CNY/hour.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Unit: USD/hour.</p>
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
         * <p>Enable automatic renewal for nodes. This parameter takes effect only when <code>instance_charge_type</code> is <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable automatic renewal.</p>
         * </li>
         * <li><p><code>false</code>: Disable automatic renewal.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of each automatic renewal. Valid values:</p>
         * <ul>
         * <li><p>When PeriodUnit=Week: 1, 2, 3.</p>
         * </li>
         * <li><p>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</p>
         * </li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>When <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>, this parameter specifies whether to automatically create on-demand instances to meet the required number of ECS instances if enough spot instances cannot be created due to price or inventory issues. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allow automatic creation of on-demand instances.</p>
         * </li>
         * <li><p><code>false</code>: Disallow automatic creation of on-demand instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The data disk configuration for nodes. Valid values: [0, 10]. You can attach up to 10 data disks.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The deployment set to which the ECS instances created in the node pool belong. This setting applies only to new nodes. The deployment set of existing nodes is not changed.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The desired number of nodes in the node pool.</p>
         * <p>This is the total number of nodes the node pool should maintain. Configure at least 2 nodes to ensure cluster components run properly. Adjust this number to scale the node pool in or out.</p>
         * <p>If you do not need to create nodes, set this to 0 and adjust it manually later.</p>
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
         * <p>The custom image ID. Query supported images using <code>DescribeKubernetesVersionMetadata</code>. By default, the latest system image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system distribution type. We recommend using this field to specify the node OS. Valid values:</p>
         * <ul>
         * <li><p><code>AliyunLinux</code>: Alibaba Cloud Linux 2 image.</p>
         * </li>
         * <li><p><code>AliyunLinuxSecurity</code>: Alibaba Cloud Linux 2 UEFI image.</p>
         * </li>
         * <li><p><code>AliyunLinux3</code>: Alibaba Cloud Linux 3 image.</p>
         * </li>
         * <li><p><code>AliyunLinux3Arm64</code>: Alibaba Cloud Linux 3 ARM image.</p>
         * </li>
         * <li><p><code>AliyunLinux3Security</code>: Alibaba Cloud Linux 3 UEFI image.</p>
         * </li>
         * <li><p><code>CentOS</code>: CentOS image.</p>
         * </li>
         * <li><p><code>Windows</code>: Windows image.</p>
         * </li>
         * <li><p><code>WindowsCore</code>: Windows Core image.</p>
         * </li>
         * <li><p><code>ContainerOS</code>: Container-optimized image.</p>
         * </li>
         * <li><p><code>AliyunLinux3ContainerOptimized</code>: Alibaba Cloud Linux 3 container-optimized image.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method for nodes in the node pool. Valid values:</p>
         * <ul>
         * <li><p><code>PrePaid</code>: Subscription.</p>
         * </li>
         * <li><p><code>PostPaid</code>: Pay-as-you-go.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance attribute configuration.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>The list of instance types for the nodes. You can specify multiple instance types as fallback options. When creating a node, the system tries each instance type in order until it succeeds. The final instance type may vary depending on inventory.</p>
         * <p>Valid values: [1, 10].</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for public IP addresses. Valid values:</p>
         * <ul>
         * <li><p><code>PayByBandwidth</code>: Pay by bandwidth.</p>
         * </li>
         * <li><p><code>PayByTraffic</code>: Pay by traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth for the public IP address of a node, measured in megabits per second (Mbps). The value must be an integer from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The key pair name. Specify either key_pair or <code>login_password</code>. For managed node pools, only <code>key_pair</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH login password. Specify either login_password or <code>key_pair</code>. Password rules: 8 to 30 characters, including at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scales instances based on the virtual switches (VSwitchIds.N) you define. If an ECS instance cannot be created in the zone of a higher-priority virtual switch, the system automatically uses the next-priority virtual switch.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Tries to create instances starting with the lowest vCPU unit price. If multiple instance types are configured with a spot instance billing method, it prioritizes creating spot instances. Use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create on-demand instances if spot instances cannot be created due to inventory or other reasons.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when multiple instance types or spot instances are configured.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Evenly distributes ECS instances across the specified zones in the scaling group. If the distribution becomes unbalanced due to inventory shortages or other reasons, you can use the API <code>RebalanceInstances</code> to rebalance the resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
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
         * <p>The minimum number of on-demand instances required in the scaling group. Valid values: [0, 1000]. When the number of on-demand instances is below this value, the system prioritizes creating on-demand instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of on-demand instances among the instances that exceed the minimum on-demand instance count (<code>on_demand_base_capacity</code>). Valid values: [0, 100].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration for nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is <code>PrePaid</code>, and is required in that case.</p>
         * <ul>
         * <li><p>When <code>period_unit=Week</code>, valid values: {1, 2, 3, 4}.</p>
         * </li>
         * <li><p>When <code>period_unit=Month</code>, valid values: {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60}.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle for nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is <code>PrePaid</code>, and is required in that case.</p>
         * <ul>
         * <li><p><code>Month</code>: Billed monthly.</p>
         * </li>
         * <li><p><code>Week</code>: Billed weekly.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>Month</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>[Deprecated] Use the <code>image_type</code> parameter instead.</p>
         * <p>The operating system platform. Valid values:</p>
         * <ul>
         * <li><p><code>AliyunLinux</code></p>
         * </li>
         * <li><p><code>CentOS</code></p>
         * </li>
         * <li><p><code>Windows</code></p>
         * </li>
         * <li><p><code>WindowsCore</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        @Deprecated
        public String platform;

        /**
         * <p>The private node pool configuration.</p>
         */
        @NameInMap("private_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The list of RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and policy to use when creating instances. Note: This parameter is effective only when creating pay-as-you-go instances. It cannot be set at the same time as private_pool_options.match_criteria or private_pool_options.id.</p>
         */
        @NameInMap("resource_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling group mode. Valid values:</p>
         * <ul>
         * <li><p><code>release</code>: Standard mode. Scales by creating and releasing ECS instances based on resource usage.</p>
         * </li>
         * <li><p><code>recycle</code>: Fast mode. Scales by creating, stopping, and starting instances to improve scaling speed. You are not charged for compute resources when instances are stopped, only for storage fees (except for local disk models).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The list of security group IDs.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The number of available instance types. The scaling group creates spot instances in a balanced manner across the specified number of lowest-cost instance types. Valid values: [1, 10].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Enable spot instance replenishment. When enabled, the scaling group attempts to create a new instance to replace a spot instance that is about to be reclaimed. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable spot instance replenishment.</p>
         * </li>
         * <li><p><code>false</code>: Disable spot instance replenishment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The price range configuration for spot instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The spot instance type. Valid values:</p>
         * <ul>
         * <li><p><code>NoSpot</code>: On-demand instance.</p>
         * </li>
         * <li><p><code>SpotWithPriceLimit</code>: Set a price limit for spot instances.</p>
         * </li>
         * <li><p><code>SpotAsPriceGo</code>: Let the system automatically bid at the current market price.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Enable bursting for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Enable. During sudden spikes in read/write activity, the disk temporarily boosts performance until workloads return to normal.</p>
         * </li>
         * <li><p>false: Disable.</p>
         * </li>
         * </ul>
         * <p>You can set this parameter only when <code>system_disk_category</code> is <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The list of system disk types. If the highest-priority disk type is unavailable, the system tries the next priority disk type.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The system disk type for nodes. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: Ultra disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: Enhanced SSD (ESSD).</p>
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
         * <p>The encryption algorithm for the system disk. Valid value: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Encrypt the system disk. Valid values:</p>
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
         * <p>The KMS key ID for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level of the system disk. This setting applies only to ESSD disks. Performance level depends on disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enhanced SSD (ESSD)</a>.</p>
         * <ul>
         * <li><p>PL0: Moderate I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL1: Moderate I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL2: High I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL3: Extremely high I/O performance with extremely stable read/write latency.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned IOPS for the system disk.</p>
         * <p>Possible values: 0 to min{50,000, 1000 × capacity − baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <p>You can set this parameter only when <code>system_disk_category</code> is <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk for nodes. Unit: GiB.</p>
         * <p>Valid values: [20, 2048].</p>
         * <p>This value must be greater than or equal to max{20, ImageSize}.</p>
         * <p>Default value: max{40, image size corresponding to ImageId}.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The snapshot policy for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-0jl6xnmme8v7o935****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        /**
         * <p>Add tags to ECS instances only.</p>
         * <p>Tag keys must be unique and up to 128 characters long. Neither tag keys nor tag values can start with &quot;aliyun&quot;, &quot;acs:&quot;, or contain &quot;https\://&quot; or &quot;http\://&quot;.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The list of virtual switch IDs. Valid values: [1, 8].</p>
         * <blockquote>
         * <p>To ensure high availability, select virtual switches from different zones.</p>
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
         * <p>Enable the Kubernetes cluster for confidential computing. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enable.</p>
         * </li>
         * <li><p><code>false</code>: Disable.</p>
         * </li>
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
