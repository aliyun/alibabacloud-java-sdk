// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The auto scaling configurations.</p>
     */
    @NameInMap("auto_scaling")
    public ModifyClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p>Specifies whether to enable concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("concurrency")
    public Boolean concurrency;

    /**
     * <p>The Lingjun node pool configurations. (This parameter does not take effect.)</p>
     */
    @NameInMap("eflo_node_group")
    public ModifyClusterNodePoolRequestEfloNodeGroup efloNodeGroup;

    /**
     * <p>The cluster configurations.</p>
     */
    @NameInMap("kubernetes_config")
    public ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The managed node pool configuration.</p>
     */
    @NameInMap("management")
    public ModifyClusterNodePoolRequestManagement management;

    /**
     * <p>The node pool configurations.</p>
     */
    @NameInMap("nodepool_info")
    public ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>The scaling group configuration of the node pool.</p>
     */
    @NameInMap("scaling_group")
    public ModifyClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The confidential computing configurations for the cluster.</p>
     */
    @NameInMap("tee_config")
    public ModifyClusterNodePoolRequestTeeConfig teeConfig;

    /**
     * <p>Synchronously updates node labels and taints.</p>
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

    public ModifyClusterNodePoolRequest setEfloNodeGroup(ModifyClusterNodePoolRequestEfloNodeGroup efloNodeGroup) {
        this.efloNodeGroup = efloNodeGroup;
        return this;
    }
    public ModifyClusterNodePoolRequestEfloNodeGroup getEfloNodeGroup() {
        return this.efloNodeGroup;
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
         * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.
         * The peak bandwidth of the EIP.</p>
         * <p>Valid values: 1 to 100. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
         * <li><code>PayByTraffic</code>: pay-by-data-transfer.</li>
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
         * <p>Specifies whether to enable auto scaling. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables auto scaling for the node pool. When the capacity planning of the cluster cannot meet the scheduling requirements of application pods, ACK automatically scales node resources based on the configured minimum and maximum numbers of instances. For clusters of Kubernetes 1.24 and later, node instant elasticity is enabled by default. For clusters earlier than Kubernetes 1.24, node auto scaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: disables auto scaling. ACK adjusts the number of nodes in the node pool based on the configured expected number of nodes and always maintains the number of nodes at the expected value.</p>
         * </li>
         * </ul>
         * <p>If this parameter is set to false, other configuration parameters in <code>auto_scaling</code> do not take effect.</p>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <ul>
         * <li><code>true</code>: associates an EIP.</li>
         * <li><code>false</code>: does not associate an EIP.</li>
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
         * <p>The maximum number of scalable instances in the node pool, excluding existing instances. This parameter takes effect only when <code>enable</code> is set to true.</p>
         * <p>Valid values: [min_instances, 2000]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of scalable instances in the node pool, excluding existing instances. This parameter takes effect only when <code>enable</code> is set to true.</p>
         * <p>Valid values: [0, max_instances]. Default value: 0.</p>
         * <blockquote>
         * <ul>
         * <li>If the minimum number of instances is not 0, the automatic creation of the corresponding number of ECS instances is triggered after the scaling group takes effect.</li>
         * <li>It is recommended that the Settings for the maximum number of instances not be less than the current number of nodes in the node pool. Otherwise, the node pool is scaled in immediately after the elastic scaling feature takes effect.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The auto scaling type, which is classified by the auto scaling instance type. Valid values:</p>
         * <ul>
         * <li><code>cpu</code>: regular instance.</li>
         * <li><code>gpu</code>: GPU-accelerated instance.</li>
         * <li><code>gpushare</code>: shared GPU instance.</li>
         * <li><code>spot</code>: spot instance.</li>
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

    public static class ModifyClusterNodePoolRequestEfloNodeGroup extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic addition for the Lingjun node pool. (This parameter does not take effect.)</p>
         */
        @NameInMap("auto_attach_enabled")
        public String autoAttachEnabled;

        public static ModifyClusterNodePoolRequestEfloNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestEfloNodeGroup self = new ModifyClusterNodePoolRequestEfloNodeGroup();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestEfloNodeGroup setAutoAttachEnabled(String autoAttachEnabled) {
            this.autoAttachEnabled = autoAttachEnabled;
            return this;
        }
        public String getAutoAttachEnabled() {
            return this.autoAttachEnabled;
        }

    }

    public static class ModifyClusterNodePoolRequestKubernetesConfig extends TeaModel {
        /**
         * <p>Specifies whether to install CloudMonitor on ECS nodes. After installation, you can view the monitoring information of the created ECS instances in the CloudMonitor console. Enable this feature. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Installs CloudMonitor on ECS nodes.</li>
         * <li><code>false</code>: Does not install CloudMonitor on ECS nodes.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy for nodes. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: Allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
         * <li><code>none</code>: Enables the default CPU affinity scheme.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The node labels. Adds labels to nodes in a Kubernetes cluster. Rules for defining labels:</p>
         * <ul>
         * <li>Labels consist of case-sensitive key-value pairs. You can configure up to 20 labels.</li>
         * <li>Label keys must be unique and can be up to 64 characters in length. Label values can be empty and can be up to 128 characters in length. Label keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The custom node name parameter. A node name consists of three parts: prefix + node IP address + suffix.</p>
         * <p>The prefix and suffix can each consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or a digit. The node IP address is the complete private IP address of the node.</p>
         * <p>The parameter value contains four parts separated by commas. For example, if the parameter is set to the &quot;customized,aliyun,ip,com&quot; string (where &quot;customized&quot; and &quot;ip&quot; are fixed strings, &quot;aliyun&quot; is the prefix, and &quot;com&quot; is the suffix), the node name is aliyun.192.168.xxx.xxx.com.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,aliyun,ip,com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The pre-custom user data for instances. Before a node is added to the cluster, the specified pre-custom user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The name of the container runtime. ACK supports the following three container runtimes:</p>
         * <ul>
         * <li>containerd: Recommended. Supported by all cluster versions.</li>
         * <li>Sandboxed-Container.runv: Sandboxed containers that provide higher isolation. Supported by clusters of version 1.31 and earlier.</li>
         * <li>docker: Deprecated. Supported by clusters of version 1.22 and earlier.</li>
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
         * <p>The taint configurations for nodes.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Specifies whether the scaled-out nodes are unschedulable. Valid values:</p>
         * <ul>
         * <li>true: The nodes are unschedulable.</li>
         * <li>false: The nodes are schedulable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>The instance user data. After a node is added to the cluster, the specified user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
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
         * <p>Specifies whether manual approval is required for node repair.</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>The ID of the auto-repair policy.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>The maximum number of nodes that can be repaired in parallel. When a large number of abnormal nodes exist in the node pool, this parameter specifies the maximum number or percentage of nodes that can be repaired at the same time. You can specify a number (such as 5, valid values: 1 to 100000) or a percentage (such as 10%, valid values: 1% to 100%). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("max_parallel_repairing_nodes")
        public String maxParallelRepairingNodes;

        /**
         * <p>The circuit breaker threshold for auto-repair. When the number or percentage of faulty nodes exceeds this threshold, the auto-repair process enters the circuit breaker state and stops initiating new auto-repair actions. You can specify a number (such as 10, valid values: 1 to 100000) or a percentage (such as 20%, valid values: 1% to 100%). Default value: 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>20%</p>
         */
        @NameInMap("max_unhealthy_nodes_threshold")
        public String maxUnhealthyNodesThreshold;

        /**
         * <p>Specifies whether to allow node restarts. This parameter takes effect only when <code>auto_repair</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Allows node restarts.</li>
         * <li>false: Does not allow node restarts.
         * Default value: true.</li>
         * </ul>
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

        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy setMaxParallelRepairingNodes(String maxParallelRepairingNodes) {
            this.maxParallelRepairingNodes = maxParallelRepairingNodes;
            return this;
        }
        public String getMaxParallelRepairingNodes() {
            return this.maxParallelRepairingNodes;
        }

        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy setMaxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
            this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
            return this;
        }
        public String getMaxUnhealthyNodesThreshold() {
            return this.maxUnhealthyNodesThreshold;
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
         * <p>Specifies whether to allow automatic kubelet upgrades. This parameter takes effect only when <code>auto_upgrade</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Allows automatic kubelet upgrades.</li>
         * <li>false: Does not allow automatic kubelet upgrades.
         * Default value: true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        /**
         * <p>Specifies whether to allow automatic operating system upgrades. This parameter takes effect only when <code>auto_upgrade</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Allows automatic operating system upgrades.</li>
         * <li>false: Does not allow automatic operating system upgrades.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade_os")
        public Boolean autoUpgradeOs;

        /**
         * <p>Specifies whether to allow automatic runtime upgrades. This parameter takes effect only when <code>auto_upgrade</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Allows automatic runtime upgrades.</li>
         * <li>false: Does not allow automatic runtime upgrades.
         * Default value: true.</li>
         * </ul>
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
         * <p>The packages to be excluded during vulnerability repair. Default value: <code>kernel</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Specifies whether to allow node restarts. This parameter takes effect only when <code>auto_vul_fix</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Allows node restarts.</li>
         * <li>false: Does not allow node restarts.
         * Default value: true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The vulnerability levels that are allowed for automatic repair. Separate multiple levels with commas. Example: <code>asap,later</code>. Valid values:</p>
         * <ul>
         * <li>asap: High.</li>
         * <li>later: Medium.</li>
         * <li>nntf: Low.
         * Default value: asap.</li>
         * </ul>
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
         * <p><strong>[Deprecated]</strong> Use the <code>auto_upgrade</code> parameter at the upper level instead. Specifies whether to enable automatic upgrades. Valid values:</p>
         * <ul>
         * <li>true: Enables automatic upgrades.</li>
         * <li>false: Disables automatic upgrades.
         * Default value: true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        @Deprecated
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of unavailable nodes. Valid values: 1 to 1000. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of extra nodes. This parameter and <code>surge_percentage</code> are mutually exclusive. Nodes become unavailable during upgrades. You can create extra nodes to compensate for the cluster load.</p>
         * <blockquote>
         * <p>The number of extra nodes should not exceed the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of extra nodes. This parameter and <code>surge</code> are mutually exclusive. The number of extra nodes is calculated by multiplying the percentage of extra nodes by the total number of nodes. For example, if the percentage is set to 50% and the total number of nodes is 6, the number of extra nodes is 50% × 6 = 3.</p>
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
        /**
         * <p>Specifies whether to enable ECS fault detection for auto-repair.</p>
         */
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Specifies whether to automatically repair nodes. This parameter takes effect only when <code>enable</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Automatically repairs nodes.</li>
         * <li>false: Does not automatically repair nodes.
         * Default value: true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto-repair policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public ModifyClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Specifies whether to automatically upgrade nodes. This parameter takes effect only when <code>enable</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Enables automatic upgrades.</li>
         * <li>false: Disables automatic upgrades.
         * Default value: true.</li>
         * </ul>
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
         * <p>Specifies whether to automatically repair CVE vulnerabilities. This parameter takes effect only when <code>enable</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li>true: Automatically repairs CVE vulnerabilities.</li>
         * <li>false: Does not automatically repair CVE vulnerabilities.
         * Default value: true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The automatic CVE repair policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public ModifyClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable node rotation. This feature is supported only by intelligent managed node pools and is enabled by default. It is not supported by regular node pools.</p>
         */
        @NameInMap("drift_enabled")
        public Boolean driftEnabled;

        /**
         * <p>Specifies whether to enable the managed node pool. Valid values:</p>
         * <ul>
         * <li>true: Enables the managed node pool.</li>
         * <li>false: Does not enable the managed node pool. Other related configurations take effect only when this parameter is set to true.
         * Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> Use the <code>auto_upgrade</code> parameter at the upper level instead. The automatic upgrade configuration. This parameter takes effect only when <code>enable</code> is set to <code>true</code>.</p>
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

        public ModifyClusterNodePoolRequestManagement setDriftEnabled(Boolean driftEnabled) {
            this.driftEnabled = driftEnabled;
            return this;
        }
        public Boolean getDriftEnabled() {
            return this.driftEnabled;
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
         * <p>Naming rules: The name must be 1 to 63 characters in length and can contain digits, Chinese characters, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>default-nodepool</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource group ID of the node pool. Instances scaled out from the node pool belong to this resource group.</p>
         * <p>A resource can belong to only one resource group. You can map resource groups to concepts such as projects, applications, or organizations based on your business scenarios.</p>
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
         * <p>The ID of the private pool. When <code>match_criteria</code> is set to <code>Target</code>, you must specify the private pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The private pool capacity option for instance startup. After an elasticity assurance or capacity reservation takes effect, private pool capacity is generated for instance startup. Valid values:</p>
         * <ul>
         * <li><code>Open</code>: open mode. The system automatically matches the capacity of open private pools. If no eligible private pool capacity is available, the system uses public pool resources to start the instance.</li>
         * <li><code>Target</code>: targeted mode. The system uses the capacity of the specified private pool to start the instance. If the specified private pool capacity is unavailable, the instance fails to start.</li>
         * <li><code>None</code>: no private pool mode. The system does not use private pool capacity to start the instance.</li>
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
         * <p>The list of private pool IDs, which are the IDs of elasticity assurances or capacity reservations. You can only pass the IDs of private pools in Target mode. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy used to create instances. Resource pools include private pools generated after an elasticity assurance or capacity reservation takes effect, as well as public pools. Valid values:</p>
         * <ul>
         * <li><code>PrivatePoolFirst</code>: private pool first. If you select this policy and specify <code>resource_pool_options.private_pool_ids</code>, the specified private pools are used first. If no private pool is specified or the specified private pools do not have sufficient capacity, the system automatically matches open private pools. If no eligible private pool is available, the system uses the public pool to create instances.</li>
         * <li><code>PrivatePoolOnly</code>: private pool only. If you select this policy, you must specify <code>resource_pool_options.private_pool_ids</code>. If the specified private pools do not have sufficient capacity, the instances fail to start.</li>
         * <li><code>None</code>: no resource pool policy.</li>
         * </ul>
         * <p>Default value: <code>None</code>.</p>
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
         * <p>The instance type of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum price per instance.</p>
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
         * <p>Specifies whether to enable auto-renewal for nodes. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto-renewal.</li>
         * <li><code>false</code>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period. Valid values:</p>
         * <ul>
         * <li>When PeriodUnit is set to Week: 1, 2, and 3.</li>
         * <li>When PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Specifies whether to allow the automatic creation of pay-as-you-go instances to meet the required number of ECS instances when the <code>multi_az_policy</code> parameter is set to <code>COST_OPTIMIZED</code> and sufficient spot instances cannot be created due to price or inventory constraints. Valid values:</p>
         * <ul>
         * <li><code>true</code>: allows the automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</li>
         * <li><code>false</code>: does not allow the automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The data cloud disk configuration of nodes. You can configure 0 to 10 data cloud disks. A maximum of 10 data cloud disks can be added.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The deployment set to which the ECS instances scaled out by the node pool belong. This parameter takes effect only on new nodes. The deployment sets of existing nodes remain unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         * <p>This parameter specifies the total number of nodes that the node pool should maintain. We recommend that you configure at least two nodes to ensure the normal operation of cluster components. You can scale the node pool in or out by adjusting the expected number of nodes.</p>
         * <p>If you do not need to create nodes, set this parameter to 0 and manually increase the number of nodes later.</p>
         * <p>When you scale in the node pool, subscription nodes are not automatically released. Automatic release subscription nodes, <a href="https://www.alibabacloud.com/help/en/ecs/change-the-billing-method-of-an-instance-from-subscription-to-pay-as-you-go-1">change the billing method of the nodes from subscription to pay-as-you-go</a> and then log on to the ECS console automatic release them.</p>
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
         * <p>Specifies whether to enable the high-density cloud disk mode. This mode is supported only when the node pool uses instance types. After this mode is enabled, the total number of system cloud disks and data cloud disks does not exceed the maximum number of high-density cloud disks supported by the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable_high_density_mode")
        public Boolean enableHighDensityMode;

        /**
         * <p>The ID of the custom image. You can call the <code>DescribeKubernetesVersionMetadata</code> operation to query the images supported by the system. By default, the latest system image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system distribution. We recommend that you use this parameter to specify the operating system for nodes. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux</code>: Alinux2 image.</li>
         * <li><code>AliyunLinuxSecurity</code>: Alinux2 UEFI image.</li>
         * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
         * <li><code>AliyunLinux3Arm64</code>: Alinux3 ARM image.</li>
         * <li><code>AliyunLinux3Security</code>: Alinux3 UEFI image.</li>
         * <li><code>CentOS</code>: CentOS image.</li>
         * <li><code>Windows</code>: Windows image.</li>
         * <li><code>WindowsCore</code>: Windows Core image.</li>
         * <li><code>ContainerOS</code>: container-optimized image.</li>
         * <li><code>AliyunLinux3ContainerOptimized</code>: Alinux3 container-optimized image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method of nodes in the node pool. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription</li>
         * <li><code>PostPaid</code>: pay-as-you-go</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * <p>When you delete a node pool, scale in a node pool, or remove nodes, subscription nodes are not automatically released. Automatic release subscription nodes, <a href="https://www.alibabacloud.com/help/en/ecs/change-the-billing-method-of-an-instance-from-subscription-to-pay-as-you-go-1">change the billing method of the nodes from subscription to pay-as-you-go</a> and then log on to the ECS console automatic release them.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance property configurations.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>The list of instance types for nodes. You can select multiple instance types as alternatives. When a node is created, the system attempts to purchase an instance of the first instance type in the list. If the purchase fails, the system tries the next instance type until the node is created. The final instance type purchased may vary based on resource availability.</p>
         * <p>You can specify 1 to 10 instance types.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for public IP addresses. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-bandwidth</li>
         * <li><code>PayByTraffic</code>: pay-by-traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound public bandwidth of nodes. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify this parameter or <code>login_password</code>. If the node pool is a managed node pool, only <code>key_pair</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The SSH logon password. You must specify this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: scales ECS instances based on the vSwitches (VSwitchIds.N) that you specify. If ECS instances cannot be created in the zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: creates ECS instances based on the vCPU unit price in ascending order. If the scaling configuration settings specify multiple instance types and the spot instance billing method, the system preferentially creates spot instances. You can use the <code>CompensateWithOnDemand</code> parameter to specify if a pay-as-you-go instance is automatically created when spot instances cannot be created due to insufficient inventory or other reasons.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when the scaling configuration specifies multiple instance types or spot instances.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: evenly allocates ECS instances across the multiple zones specified in the scaling group. If the zones become unbalanced due to insufficient inventory or other reasons, you can call the <code>RebalanceInstances</code> operation to balance the resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
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
         * <p>The minimum number of pay-as-you-go instances required by the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, the system preferentially creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the excess instances after the scaling group meets the minimum number of pay-as-you-go instances specified by <code>on_demand_base_capacity</code>. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of nodes in the node pool. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li>When <code>period_unit</code> is set to <code>Week</code>, valid values for <code>period</code> are 1, 2, 3, and 4.</li>
         * <li>When <code>period_unit</code> is set to <code>Month</code>, valid values for <code>period</code> are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of nodes in the node pool. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><code>Month</code>: uses the month as the time unit.</li>
         * <li><code>Week</code>: uses the week as the time unit.</li>
         * </ul>
         * <p>Default value: <code>Month</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p><strong>[Deprecated]</strong> Use the <code>image_type</code> parameter instead.</p>
         * <p>The operating system platform. Valid values:</p>
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
         * <p>The private pool configurations.</p>
         */
        @NameInMap("private_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The list of ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and resource pool policy used to create instances. Take note of the following items when you configure this parameter:</p>
         * <ul>
         * <li>This parameter takes effect only when pay-as-you-go instances are created.</li>
         * <li>This parameter cannot be configured at the same time as <code>private_pool_options.match_criteria</code> and <code>private_pool_options.id</code>.</li>
         * </ul>
         */
        @NameInMap("resource_pool_options")
        public ModifyClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <ul>
         * <li><code>release</code>: standard mode. The scaling group scales instances by creating and releasing ECS instances based on the requested resources.</li>
         * <li><code>recycle</code>: swift mode. The scaling group scales instances by creating, stopping, and starting ECS instances to accelerate subsequent scaling operations. When an instance is stopped, you are not charged for compute resources, but you are still charged for storage resources, except for instances with local disks.</li>
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
         * <p>The number of available instance types. The scaling group evenly creates spot instances by using the most cost-effective instance types. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable spot instance replenishment. After this feature is enabled, when the scaling group receives a system message that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed. Valid values:</p>
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
         * <p>The maximum price configuration for spot instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy for spot instances. Valid values:</p>
         * <ul>
         * <li><code>NoSpot</code>: non-spot instance.</li>
         * <li><code>SpotWithPriceLimit</code>: sets the maximum price for spot instances.</li>
         * <li><code>SpotAsPriceGo</code>: uses the system automatic bidding policy, which follows the actual market price.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable performance burst for the system cloud disk. Valid values:</p>
         * <ul>
         * <li>true: enables performance burst. After this feature is enabled, if your workloads experience sudden spikes in data read and write requests, the cloud disk temporarily increases its performance based on the actual workload until the workload stabilizes.</li>
         * <li>false: disables performance burst.</li>
         * </ul>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The multiple system cloud disk types. If the system cloud disk cannot be created by using the disk type with the highest priority, the system automatically tries the next disk type in the priority list.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The system cloud disk type of nodes. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk</li>
         * <li><code>cloud_ssd</code>: standard SSD</li>
         * <li><code>cloud_essd</code>: ESSD</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL disk</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk</li>
         * </ul>
         * <p>Default value: <code>cloud_efficiency</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The encryption algorithm used for the system cloud disk. Valid value: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system cloud disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypts the system cloud disk.</p>
         * </li>
         * <li><p>false: does not encrypt the system cloud disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key used to encrypt the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level of the system cloud disk. This parameter takes effect only for ESSDs. The performance level varies based on the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <ul>
         * <li>PL0: provides medium concurrent I/O performance and stable read/write latency.</li>
         * <li>PL1: provides medium concurrent I/O performance and stable read/write latency.</li>
         * <li>PL2: provides high concurrent I/O performance and stable read/write latency.</li>
         * <li>PL3: provides extremely high concurrent I/O performance and highly stable read/write latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read and write IOPS of the system cloud disk.</p>
         * <p>Valid values: 0 to the minimum of 50,000 and (1,000 × capacity - baseline performance). Baseline performance = the minimum of (1,800 + 50 × capacity) and 50,000.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * <p>Valid values: 20 to 2048.</p>
         * <p>The value of this parameter must be greater than or equal to the maximum of 20 and the image size.</p>
         * <p>Default value: the maximum of 40 and the size of the image specified by the ImageId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The snapshot policy for the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-0jl6xnmme8v7o935****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        /**
         * <p>Adds tags only to ECS instances.</p>
         * <p>Tag keys must be unique and can be up to 128 characters in length. Tag keys and tag values cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, and cannot contain &quot;https://&quot; or &quot;http://&quot;.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The list of vSwitch IDs. You can specify 1 to 8 vSwitch IDs.</p>
         * <blockquote>
         * <p>To ensure high availability, select vSwitches in different zones.</p>
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

        public ModifyClusterNodePoolRequestScalingGroup setEnableHighDensityMode(Boolean enableHighDensityMode) {
            this.enableHighDensityMode = enableHighDensityMode;
            return this;
        }
        public Boolean getEnableHighDensityMode() {
            return this.enableHighDensityMode;
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
         * <p>Specifies whether to enable confidential computing for the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables confidential computing.</li>
         * <li><code>false</code>: Does not enable confidential computing.</li>
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
