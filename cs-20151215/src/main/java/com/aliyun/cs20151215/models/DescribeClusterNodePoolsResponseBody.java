// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponseBody extends TeaModel {
    /**
     * <p>The list of node pools.</p>
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode extends TeaModel {
        /**
         * <p>Specifies whether to enable auto mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode self = new DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling extends TeaModel {
        /**
         * <p>The peak bandwidth of the elastic IP address (EIP). Valid values: 1 to 100. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
         * <li><code>PayByTraffic</code>: pay-by-data-transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        /**
         * <p>Specifies whether to enable auto scaling. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables auto scaling for the node pool. When the capacity planning of the cluster cannot meet the scheduling requirements of application pods, ACK automatically scales node resources based on the configured minimum and maximum number of instances. For clusters of Kubernetes 1.24 and later, node instant elasticity is enabled by default. For clusters earlier than Kubernetes 1.24, node auto scaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node auto scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: disables auto scaling. ACK adjusts the number of nodes in the node pool based on the configured expected number of nodes, and always maintains the number of nodes at the expected number.</p>
         * </li>
         * </ul>
         * <p>If this parameter is set to false, other configuration parameters in auto_scaling do not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Specifies whether to associate an EIP. Valid values:</p>
         * <ul>
         * <li><code>true</code>: associates an EIP.</li>
         * <li><code>false</code>: does not associate an EIP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>The maximum number of scalable instances in the node pool, excluding existing instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of scalable instances in the node pool, excluding existing instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The auto scaling type, which is categorized by the auto scaling instance type. Valid values:</p>
         * <ul>
         * <li><code>cpu</code>: regular instance.</li>
         * <li><code>gpu</code>: GPU-accelerated instance.</li>
         * <li><code>gpushare</code>: shared GPU instance.</li>
         * <li><code>spot</code>: spot instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-attach for the Lingjun node pool. This parameter does not take effect.</p>
         */
        @NameInMap("auto_attach_enabled")
        public Boolean autoAttachEnabled;

        /**
         * <p>The ID of the Lingjun cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>i113790071760688002461</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The ID of the Lingjun group.</p>
         * 
         * <strong>example:</strong>
         * <p>i128147721760688002463</p>
         */
        @NameInMap("group_id")
        public String groupId;

        /**
         * <p>The name of the worker RAM role used by the Lingjun node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-c000a00a00aa000a00a00a00a000a0000-Role</p>
         */
        @NameInMap("worker_ram_role_name")
        public String workerRamRoleName;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup self = new DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup setAutoAttachEnabled(Boolean autoAttachEnabled) {
            this.autoAttachEnabled = autoAttachEnabled;
            return this;
        }
        public Boolean getAutoAttachEnabled() {
            return this.autoAttachEnabled;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup setWorkerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> The network bandwidth of the edge-optimized node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p><strong>[Deprecated]</strong> The instance ID of the Cloud Connect Network (CCN) attached to the edge-optimized node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p><strong>[Deprecated]</strong> The region of the CCN instance associated with the edge-optimized node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p><strong>[Deprecated]</strong> The instance ID of the Cloud Enterprise Network (CEN) attached to the edge-optimized node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p><strong>[Deprecated]</strong> The subscription duration of the edge-optimized node pool. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
         * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After installation, you can view the monitoring information of the created ECS instances in the CloudMonitor console. We recommend that you enable this feature. Valid values:</p>
         * <ul>
         * <li><code>true</code>: installs the CloudMonitor agent on ECS nodes.</li>
         * <li><code>false</code>: does not install the CloudMonitor agent on ECS nodes.</li>
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
         * <li><code>static</code>: allows pods with specific resource characteristics on the node to enhance their CPU affinity and exclusivity.</li>
         * <li><code>none</code>: uses the existing default CPU affinity scheme.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The node labels.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The custom node name.</p>
         * <p>A node name consists of three parts: prefix + node IP address substring + suffix:</p>
         * <ul>
         * <li>The prefix and suffix can each consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or a digit.</li>
         * <li>The IP address substring length refers to the number of digits intercepted from the end of the node IP address. Valid values: 5 to 12.</li>
         * </ul>
         * <p>For example, if the node IP address is 192.168.0.55, the specified prefix is aliyun.com, the IP address substring length is 5, and the suffix is test, the node name is aliyun.com00055test.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com192.XX.YY.55test</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The pre-custom data of the node pool, which is the script that runs before node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvYmluL3NoCmVjaG8gIkhlbGxvIEFD</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The name of the container runtime. ACK supports the following three container runtimes:</p>
         * <ul>
         * <li>containerd: recommended. Supported by all cluster versions.</li>
         * <li>Sandboxed-Container.runv: sandboxed container. Provides higher isolation. Supported by clusters of Kubernetes 1.31 and earlier.</li>
         * <li>docker: no longer maintained. Supported by clusters of Kubernetes 1.22 and earlier.</li>
         * </ul>
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
         * <p>The taint information of the node. Taints and tolerations work together to prevent pods from being scheduled to inappropriate nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">Taints and Tolerations</a>.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Specifies whether the scaled-out nodes are unschedulable. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: unschedulable.</p>
         * </li>
         * <li><p><code>false</code>: schedulable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>The custom data of the node pool, which is the script that runs after node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvYmluL3NoCmVjaG8gIkhlbGxvIEFD****</p>
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy extends TeaModel {
        /**
         * <p>Specifies whether manual approval is required for node repair.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>The ID of the auto-repair policy.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>The maximum number or percentage of nodes that can be repaired simultaneously when a large number of abnormal nodes exist in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_parallel_repairing_nodes")
        public String maxParallelRepairingNodes;

        /**
         * <p>The auto-healing circuit breaker condition. When the number or percentage of faulty nodes exceeds this threshold, auto-healing enters the circuit breaker state and stops initiating new auto-healing repair actions.</p>
         * 
         * <strong>example:</strong>
         * <p>10%</p>
         */
        @NameInMap("max_unhealthy_nodes_threshold")
        public String maxUnhealthyNodesThreshold;

        /**
         * <p>Specifies whether to allow node restarts. This parameter takes effect only when auto_repair is set to true. Valid values:</p>
         * <ul>
         * <li>true: Node restarts are allowed.</li>
         * <li>false: Node restarts are not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy setApprovalRequired(Boolean approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }
        public Boolean getApprovalRequired() {
            return this.approvalRequired;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy setAutoRepairPolicyId(String autoRepairPolicyId) {
            this.autoRepairPolicyId = autoRepairPolicyId;
            return this;
        }
        public String getAutoRepairPolicyId() {
            return this.autoRepairPolicyId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy setMaxParallelRepairingNodes(String maxParallelRepairingNodes) {
            this.maxParallelRepairingNodes = maxParallelRepairingNodes;
            return this;
        }
        public String getMaxParallelRepairingNodes() {
            return this.maxParallelRepairingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy setMaxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
            this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
            return this;
        }
        public String getMaxUnhealthyNodesThreshold() {
            return this.maxUnhealthyNodesThreshold;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow automatic kubelet upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
         * <ul>
         * <li>true: Automatic kubelet upgrades are allowed.</li>
         * <li>false: Automatic kubelet upgrades are not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy setAutoUpgradeKubelet(Boolean autoUpgradeKubelet) {
            this.autoUpgradeKubelet = autoUpgradeKubelet;
            return this;
        }
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy extends TeaModel {
        /**
         * <p>The packages to be excluded during the vulnerability fix process.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Specifies whether to allow node restarts. This parameter takes effect only when auto_vul_fix is set to true. Valid values:</p>
         * <ul>
         * <li>true: Node restarts are allowed.</li>
         * <li>false: Node restarts are not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The vulnerability levels that are allowed for automatic fixes, separated by commas. Valid values:</p>
         * <ul>
         * <li>asap: High.</li>
         * <li>later: Medium.</li>
         * <li>nntf: Low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap,nntf</p>
         */
        @NameInMap("vul_level")
        public String vulLevel;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy setExcludePackages(String excludePackages) {
            this.excludePackages = excludePackages;
            return this;
        }
        public String getExcludePackages() {
            return this.excludePackages;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-upgrade. Valid values:</p>
         * <ul>
         * <li>true: Auto-upgrade is enabled.</li>
         * <li>false: Auto-upgrade is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
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
         * <p>The number of surge nodes. This parameter and surge_percentage are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of surge nodes. This parameter and surge are mutually exclusive. The number of surge nodes is calculated by multiplying the surge node percentage by the total number of nodes. For example, if the surge node percentage is set to 50% and the total number of nodes is 6, the number of surge nodes generated is 50% × 6 = 3.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>Specifies whether to enable ECS fault detection for node self-healing.</p>
         */
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Specifies whether to enable auto repair. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto repair.</li>
         * <li><code>false</code>: disables auto repair.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto repair policy for nodes.</p>
         */
        @NameInMap("auto_repair_policy")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Specifies whether to automatically upgrade nodes. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li>true: Auto-upgrade is enabled.</li>
         * <li>false: Auto-upgrade is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The auto-upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Specifies whether to automatically fix CVEs. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li>true: Automatic CVE fixes are allowed.</li>
         * <li>false: Automatic CVE fixes are not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The auto CVE fix policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable the node rotation capability. This capability is supported only by smart managed node pools and is enabled by default. It is not supported by regular node pools.</p>
         */
        @NameInMap("drift_enabled")
        public Boolean driftEnabled;

        /**
         * <p>Specifies whether to enable the managed node pool. Valid values:</p>
         * <ul>
         * <li>true: The managed node pool is enabled.</li>
         * <li>false: The managed node pool is disabled. Other related configurations take effect only when enable is set to true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The auto-upgrade configuration. This configuration takes effect only when enable is set to true.</p>
         */
        @NameInMap("upgrade_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig upgradeConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagement build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagement self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagement();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoFaultDiagnosis(Boolean autoFaultDiagnosis) {
            this.autoFaultDiagnosis = autoFaultDiagnosis;
            return this;
        }
        public Boolean getAutoFaultDiagnosis() {
            return this.autoFaultDiagnosis;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoRepairPolicy(DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy autoRepairPolicy) {
            this.autoRepairPolicy = autoRepairPolicy;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoUpgradePolicy(DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy autoUpgradePolicy) {
            this.autoUpgradePolicy = autoUpgradePolicy;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoVulFix(Boolean autoVulFix) {
            this.autoVulFix = autoVulFix;
            return this;
        }
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoVulFixPolicy(DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy autoVulFixPolicy) {
            this.autoVulFixPolicy = autoVulFixPolicy;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setDriftEnabled(Boolean driftEnabled) {
            this.driftEnabled = driftEnabled;
            return this;
        }
        public Boolean getDriftEnabled() {
            return this.driftEnabled;
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs extends TeaModel {
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

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig extends TeaModel {
        /**
         * <p>The custom configuration of the node component.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

        /**
         * <p>The environment variables of the node component.</p>
         */
        @NameInMap("envs")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs> envs;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig setEnvs(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfigEnvs> getEnvs() {
            return this.envs;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents extends TeaModel {
        /**
         * <p>The node component configuration.</p>
         */
        @NameInMap("config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig config;

        /**
         * <p>The version number of the custom configuration for the node component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("config_revision")
        public String configRevision;

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

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents setConfig(DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig config) {
            this.config = config;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig getConfig() {
            return this.config;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents setConfigRevision(String configRevision) {
            this.configRevision = configRevision;
            return this;
        }
        public String getConfigRevision() {
            return this.configRevision;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig extends TeaModel {
        /**
         * <p>The Hugepage configuration.</p>
         */
        @NameInMap("hugepage")
        public Hugepage hugepage;

        /**
         * <p>The sysctl kernel parameter settings.</p>
         */
        @NameInMap("sysctl")
        public java.util.Map<String, ?> sysctl;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig setHugepage(Hugepage hugepage) {
            this.hugepage = hugepage;
            return this;
        }
        public Hugepage getHugepage() {
            return this.hugepage;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig setSysctl(java.util.Map<String, ?> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.Map<String, ?> getSysctl() {
            return this.sysctl;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig extends TeaModel {
        /**
         * <p>The Kubelet parameter settings.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        /**
         * <p>The node operating system configuration.</p>
         */
        @NameInMap("node_os_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig nodeOsConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig setKubeletConfiguration(KubeletConfig kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
            return this;
        }
        public KubeletConfig getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig setNodeOsConfig(DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig nodeOsConfig) {
            this.nodeOsConfig = nodeOsConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfigNodeOsConfig getNodeOsConfig() {
            return this.nodeOsConfig;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo extends TeaModel {
        /**
         * <p>The time when the node pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-15T16:33:29.362888807+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>Specifies whether the node pool is the default node pool. Typically, a cluster has only one default node pool. Valid values:</p>
         * <ul>
         * <li>true: The node pool is the default node pool.</li>
         * <li>false: The node pool is not the default node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_default")
        public Boolean isDefault;

        /**
         * <p>The node pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-nodepool</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np615c0e0966124216a0412e10afe0****</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The node pool type. Valid values:</p>
         * <ul>
         * <li><code>ess</code>: standard node pool, which includes managed and auto scaling features.</li>
         * <li><code>edge</code>: edge node pool.</li>
         * <li><code>lingjun</code>: Lingjun node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the node pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-15T16:33:32.823+08:00</p>
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable nested virtualization. Valid values:</p>
         * <ul>
         * <li>disabled: disables nested virtualization.</li>
         * <li>enabled: enables nested virtualization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("nested_virtualization")
        public String nestedVirtualization;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions setNestedVirtualization(String nestedVirtualization) {
            this.nestedVirtualization = nestedVirtualization;
            return this;
        }
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The private pool ID, which is the ID of the elasticity assurance or capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The private pool capacity matching criteria for instance startup. After an elasticity assurance or capacity reservation takes effect, private pool capacity is generated for you to select when you start instances. Valid values:</p>
         * <ul>
         * <li>Open: open mode. The system automatically matches the capacity of an open private pool. If no matching private pool capacity is available, the system uses public pool resources to start the instance. In this mode, you do not need to specify the PrivatePoolOptions.Id parameter.</li>
         * <li>Target: specified mode. The system uses the capacity of the specified private pool to start the instance. If the specified private pool capacity is unavailable, the instance fails to start. In this mode, you must specify the private pool ID by setting the PrivatePoolOptions.Id parameter.</li>
         * <li>None: no private pool mode. The system does not use private pool capacity to start the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions extends TeaModel {
        /**
         * <p>The list of private pool IDs.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy used to create instances. Valid values:</p>
         * <ul>
         * <li>PrivatePoolFirst: Private pools are used first.</li>
         * <li>PrivatePoolOnly: Only private pools are used.</li>
         * <li>None: No resource pool policy is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("strategy")
        public String strategy;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The instance type of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The market price range for a single instance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Unit: CNY/hour.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;Unit: USD/hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0.39</p>
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
         * <p>Specifies whether to enable auto-renewal for nodes. This parameter takes effect only when instance_charge_type is set to PrePaid. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration. Valid values:</p>
         * <ul>
         * <li>If PeriodUnit is set to Week: 1, 2, and 3.</li>
         * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p><strong>[Deprecated]</strong> Use the security_hardening_os parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>Specifies whether to automatically create pay-as-you-spot instances to meet the required number of ECS instances when the multi_az_policy parameter is set to COST_OPTIMIZED and sufficient preemptible instances cannot be created due to price or inventory issues. Valid values:</p>
         * <ul>
         * <li>true: allows the system to automatically create pay-as-you-spot instances.</li>
         * <li>false: does not allow the system to automatically create pay-as-you-spot instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The CPU-related configuration options.</p>
         */
        @NameInMap("cpu_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions cpuOptions;

        /**
         * <p>The configurations of the data cloud disks for nodes, such as the disk category and size.</p>
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
         * <p>The expected number of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The block device initialization configurations.</p>
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
         * <p>The custom image ID. You can call the DescribeKubernetesVersionMetadata operation to query the images supported by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The operating system image type. Valid values:</p>
         * <ul>
         * <li>AliyunLinux: Alinux2 image.</li>
         * <li>AliyunLinuxSecurity: Alinux2 UEFI image.</li>
         * <li>AliyunLinux3: Alinux3 image.</li>
         * <li>AliyunLinux3Arm64: Alinux3 ARM image.</li>
         * <li>AliyunLinux3Security: Alinux3 UEFI image.</li>
         * <li>CentOS: CentOS image.</li>
         * <li>Windows: Windows image.</li>
         * <li>WindowsCore: Windows Core image.</li>
         * <li>ContainerOS: container-optimized image.</li>
         * <li>AliyunLinux3ContainerOptimized: Alinux3 container-optimized image.</li>
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
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
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
         * <p>The list of instance types for nodes. You can select multiple instance types as alternatives. When a node is created, the system attempts to purchase instances starting from the first instance type in the list until the creation succeeds. The final instance type purchased may vary depending on inventory availability.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n4.large</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address for the node. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-data-transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound public bandwidth of the node. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify this parameter or login_password.
         * If the node pool is a managed node pool, only key_pair is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Specifies whether to log on to the created ECS instances as a non-root user. Valid values:</p>
         * <ul>
         * <li>true: logs on as a non-root user (ecs-user).</li>
         * <li>false: logs on as the root user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The SSH logon password. You must specify this parameter or key_pair. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * For security reasons, the password is encrypted in the query result.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><code>PRIORITY</code>: scales ECS instances based on the priorities of the vSwitches that you specify in the VSwitchIds.N parameter. If ECS instances cannot be created in the zone of the highest-priority vSwitch, the system automatically uses the next highest-priority vSwitch to create ECS instances.</li>
         * <li><code>COST_OPTIMIZED</code>: creates ECS instances based on the unit prices of vCPUs in ascending order. When the scaling configuration settings include multiple instance types with the spot instance billing method, the system preferentially creates spot instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically create pay-as-you-go instances when spot instances cannot be created due to inventory shortages or other reasons.<blockquote>
         * <p>The <code>COST_OPTIMIZED</code> value takes effect only when the scaling configuration settings include multiple instance types or use spot instances.</p>
         * </blockquote>
         * </li>
         * <li><code>BALANCE</code>: evenly allocates ECS instances across the zones specified in the scaling group. If the distribution of instances becomes unbalanced across zones due to inventory shortages, you can call the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a> operation to balance the resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</li>
         * </ul>
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
         * <p>The percentage of pay-as-you-go instances among the additional instances that exceed the minimum number of pay-as-you-go instances specified by on_demand_base_capacity. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the node. This parameter takes effect and is required only when instance_charge_type is set to PrePaid. Valid values:</p>
         * <ul>
         * <li>If period_unit is set to Week: 1, 2, 3, and 4.</li>
         * <li>If period_unit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the node. This parameter is required when instance_charge_type is set to PrePaid. Valid values:</p>
         * <ul>
         * <li><code>Month</code>: uses month as the billing unit.</li>
         * <li><code>Week</code>: uses week as the billing unit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p><strong>[Deprecated]</strong> The operating system distribution. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>AliyunLinux</li>
         * <li>Windows</li>
         * <li>WindowsCore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The private pool options.</p>
         */
        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p><strong>[Deprecated]</strong> Use the ram_role_name parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-021dc54f-929b-437a-8ae0-34c24d3e****</p>
         */
        @NameInMap("ram_policy")
        public String ramPolicy;

        /**
         * <p>The name of the RAM role for worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-4a4fa089-80c1-48a5-b3c6-9349311f****</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>If ApsaraDB RDS instances are specified, the ECS instances of the cluster nodes are automatically added to the whitelists of the ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and resource pool policy used to create instances.</p>
         */
        @NameInMap("resource_pool_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-2ze8n5qw4atggut8****</p>
         */
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        /**
         * <p>The scaling group pattern. Valid values:</p>
         * <ul>
         * <li><code>release</code>: Standard pattern. The scaling group scales instances by creating and releasing ECS instances based on the requested resource usage.</li>
         * <li><code>recycle</code>: Swift pattern. The scaling group scales instances by creating, stopping, and starting ECS instances to improve the scaling speed. When an instance is stopped, you are not charged for compute resources, but you are still charged for storage resources. This does not apply to instances with local disks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p><strong>[Deprecated]</strong> The ID of the security group to which the node pool belongs. If the node pool is associated with multiple security groups, this parameter returns the first value in <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze1iuk12m2sb4c4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The list of security group IDs for the node pool.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Specifies whether to enable Alibaba Cloud OS security hardening. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables Alibaba Cloud OS security hardening.</li>
         * <li><code>false</code>: Does not enable Alibaba Cloud OS security hardening.
         * Default value: <code>false</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>Specifies whether to enable MLPS 2.0 security hardening. You can enable MLPS 2.0 security hardening for nodes only when the system image is Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3. Alibaba Cloud provides baseline check standards and scanning programs for classified protection compliance for Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 MLPS 2.0 Level 3 images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>The number of available instance types. The scaling group evenly creates spot instances across multiple instance types with the lowest costs. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable spot instance replenishment. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables spot instance replenishment.</li>
         * <li><code>false</code>: Does not enable spot instance replenishment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The market price range configuration for spot instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The type of spot instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: Pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: Sets the maximum price for spot instances.</li>
         * <li>SpotAsPriceGo: Uses the system automatic bidding, which follows the actual market price.
         * For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable the burst feature for the system disk of the node. Valid values:</p>
         * <ul>
         * <li>true: Enables the burst feature. After this feature is enabled, if a volatile workload faces sudden data read and write pressure, the cloud disk temporarily improves its performance based on the actual workload conditions until the workload returns to a stable state.</li>
         * <li>false: Does not enable the burst feature.
         * This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The categories of the system disk. If the system disk cannot be created by using the disk category with the highest priority, the system automatically attempts to use the disk category with the next highest priority.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: Ultra disk.</li>
         * <li><code>cloud_ssd</code>: Standard SSD.</li>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
         * </ul>
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
         * <li>true: Encrypts the system disk.</li>
         * <li>false: Does not encrypt the system disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The performance level of the system disk. This parameter takes effect only for ESSDs. The performance level is related to the cloud disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>. Valid values:</p>
         * <ul>
         * <li>PL0: Medium concurrent I/O performance and relatively stable read/write latency.</li>
         * <li>PL1: Medium concurrent I/O performance and relatively stable read/write latency.</li>
         * <li>PL2: High concurrent I/O performance and stable read/write latency.</li>
         * <li>PL3: Extremely high concurrent I/O performance and extremely stable read/write latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for the system disk. This parameter is configured when the disk category is <code>cloud_auto</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: 20 to 2048.</p>
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
         * <p>The ECS instance labels.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The list of vSwitch IDs.</p>
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

        @Deprecated
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setCisEnabled(Boolean cisEnabled) {
            this.cisEnabled = cisEnabled;
            return this;
        }
        public Boolean getCisEnabled() {
            return this.cisEnabled;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setCpuOptions(DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupCpuOptions getCpuOptions() {
            return this.cpuOptions;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDiskInit(java.util.List<DiskInit> diskInit) {
            this.diskInit = diskInit;
            return this;
        }
        public java.util.List<DiskInit> getDiskInit() {
            return this.diskInit;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setEnableHighDensityMode(Boolean enableHighDensityMode) {
            this.enableHighDensityMode = enableHighDensityMode;
            return this;
        }
        public Boolean getEnableHighDensityMode() {
            return this.enableHighDensityMode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInstancePatterns(java.util.List<InstancePatterns> instancePatterns) {
            this.instancePatterns = instancePatterns;
            return this;
        }
        public java.util.List<InstancePatterns> getInstancePatterns() {
            return this.instancePatterns;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setResourcePoolOptions(DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions resourcePoolOptions) {
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskKmsKeyId(String systemDiskKmsKeyId) {
            this.systemDiskKmsKeyId = systemDiskKmsKeyId;
            return this;
        }
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
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
         * <p>The number of failed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failed_nodes")
        public Long failedNodes;

        /**
         * <p>The number of healthy instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("healthy_nodes")
        public Long healthyNodes;

        /**
         * <p>The number of nodes that are being created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("initial_nodes")
        public Long initialNodes;

        /**
         * <p>The number of offline nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("offline_nodes")
        public Long offlineNodes;

        /**
         * <p>The number of nodes that are being removed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("removing_nodes")
        public Long removingNodes;

        /**
         * <p>The number of nodes in the serving state.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("serving_nodes")
        public Long servingNodes;

        /**
         * <p>The state of the node pool. Valid values:</p>
         * <ul>
         * <li><code>active</code>: Active.</li>
         * <li><code>scaling</code>: Scaling.</li>
         * <li><code>removing</code>: Removing.</li>
         * <li><code>deleting</code>: Deleting.</li>
         * <li><code>updating</code>: Updating.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The number of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>Specifies whether to enable confidential computing for the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The auto mode configuration.</p>
         */
        @NameInMap("auto_mode")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode autoMode;

        /**
         * <p>The auto scaling configuration.</p>
         */
        @NameInMap("auto_scaling")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling;

        /**
         * <p>The Lingjun node group information.</p>
         */
        @NameInMap("eflo_node_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup efloNodeGroup;

        /**
         * <p><strong>[Deprecated]</strong> The network configuration for the edge node pool. This parameter is valid only for node pools whose type is edge.</p>
         */
        @NameInMap("interconnect_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig interconnectConfig;

        /**
         * <p>The network type of the edge node pool. This parameter takes effect only when type is set to edge. Valid values:</p>
         * <ul>
         * <li><code>basic</code>: Internet. Nodes in cloud node pool interact with cloud nodes over the Internet. Applications in cloud node pool cannot directly access the internal network of the cloud VPC.</li>
         * <li><code>private</code>: private network. Nodes in cloud node pool connect the cloud and on-premises networks through Express Connect circuits, VPNs, or CEN, which provides higher cloud-edge communication quality and more effective security protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("interconnect_mode")
        public String interconnectMode;

        /**
         * <p>The cluster configuration.</p>
         */
        @NameInMap("kubernetes_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig;

        /**
         * <p>The managed node pool configuration. This configuration takes effect only in professional managed clusters.</p>
         */
        @NameInMap("management")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement management;

        /**
         * <p>The maximum number of nodes that the node pool can accommodate. The value must be greater than or equal to 0. A value of 0 indicates no additional limit, meaning the node pool is only limited by the maximum number of nodes that the entire cluster can accommodate. For edge node pools, this value is usually greater than 0. For ESS node pools and default edge node pools, this value is 0.</p>
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
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents> nodeComponents;

        /**
         * <p>The node configuration.</p>
         */
        @NameInMap("node_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig nodeConfig;

        /**
         * <p>The node pool information.</p>
         */
        @NameInMap("nodepool_info")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo;

        /**
         * <p>The scaling group configurations of the node pool.</p>
         */
        @NameInMap("scaling_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup;

        /**
         * <p>The status of the node pool.</p>
         */
        @NameInMap("status")
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus status;

        /**
         * <p>The confidential computing configurations.</p>
         */
        @NameInMap("tee_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig teeConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepools build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepools self = new DescribeClusterNodePoolsResponseBodyNodepools();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setAutoMode(DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode autoMode) {
            this.autoMode = autoMode;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode getAutoMode() {
            return this.autoMode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setAutoScaling(DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling getAutoScaling() {
            return this.autoScaling;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setEfloNodeGroup(DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup efloNodeGroup) {
            this.efloNodeGroup = efloNodeGroup;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup getEfloNodeGroup() {
            return this.efloNodeGroup;
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

        public DescribeClusterNodePoolsResponseBodyNodepools setNodeComponents(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents> nodeComponents) {
            this.nodeComponents = nodeComponents;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents> getNodeComponents() {
            return this.nodeComponents;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setNodeConfig(DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig getNodeConfig() {
            return this.nodeConfig;
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
