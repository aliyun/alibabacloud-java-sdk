// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponseBody extends TeaModel {
    /**
     * <p>List of node pool instances.</p>
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
         * <p>Indicates whether intelligent management is enabled.</p>
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
         * <p>Peak bandwidth of the EIP.</p>
         * <p>Valid values: [1,100]. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>EIP billing method. Valid values:</p>
         * <ul>
         * <li><p><code>PayByBandwidth</code>: Pay-by-bandwidth.</p>
         * </li>
         * <li><p><code>PayByTraffic</code>: Pay-by-traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        /**
         * <p>Indicates whether automatic scaling is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables automatic scaling for the node pool. When the cluster capacity cannot meet application pod scheduling requirements, ACK automatically scales node resources based on the configured minimum and maximum instance counts. Clusters of version 1.24 or later enable instant elasticity by default. Clusters earlier than version 1.24 enable node autoscaling by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: Disables automatic scaling. ACK adjusts the number of nodes in the node pool to match the desired node count and maintains this count.</p>
         * </li>
         * </ul>
         * <p>If this parameter is set to false, other parameters in <code>auto_scaling</code> do not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Indicates whether an EIP is bound. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Binds an EIP.</p>
         * </li>
         * <li><p><code>false</code>: Does not bind an EIP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>Maximum number of scalable instances in the node pool, excluding existing instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>Minimum number of scalable instances in the node pool, excluding existing instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>Type of automatic scaling, categorized by instance type. Valid values:</p>
         * <ul>
         * <li><p><code>cpu</code>: Standard instance.</p>
         * </li>
         * <li><p><code>gpu</code>: GPU instance.</p>
         * </li>
         * <li><p><code>gpushare</code>: Shared GPU instance.</p>
         * </li>
         * <li><p><code>spot</code>: Spot instance.</p>
         * </li>
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
         * <p>Lingjun cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i113790071760688002461</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>Lingjun group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i128147721760688002463</p>
         */
        @NameInMap("group_id")
        public String groupId;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup self = new DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig extends TeaModel {
        /**
         * <p>[This field is deprecated.]</p>
         * <p>Network bandwidth for enhanced edge node pools. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>CCN instance ID bound to enhanced edge node pools.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>Region of the CCN instance bound to enhanced edge node pools.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>CEN instance ID bound to enhanced edge node pools.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>Subscription duration for enhanced edge node pools. Unit: months.</p>
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
         * <p>Indicates whether Cloud Monitor is installed on ECS nodes. After installation, you can view monitoring information for created ECS instances in the Cloud Monitor console. We recommend enabling this feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Installs Cloud Monitor on ECS nodes.</p>
         * </li>
         * <li><p><code>false</code>: Does not install Cloud Monitor on ECS nodes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>Node CPU management policy. Clusters of version 1.12.6 or later support the following policies:</p>
         * <ul>
         * <li><p><code>static</code>: Enhances CPU affinity and exclusivity for pods with specific resource characteristics on the node.</p>
         * </li>
         * <li><p><code>none</code>: Uses the default CPU affinity scheme.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>Node labels.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>Custom node name.</p>
         * <p>A node name consists of three parts: prefix + IP address substring + suffix:</p>
         * <ul>
         * <li><p>Both prefix and suffix can consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or digit.</p>
         * </li>
         * <li><p>The IP address substring length specifies the number of trailing digits to extract from the node IP address. Valid values: 5 to 12.</p>
         * </li>
         * </ul>
         * <p>Example: If the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP address substring length is 5, and the suffix is test, the node name is aliyun.com00055test.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com192.XX.YY.55test</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>Pre-custom data for the node pool. This is a script that runs before node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance custom data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvYmluL3NoCmVjaG8gIkhlbGxvIEFD</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>Container runtime name. ACK supports the following container runtimes:</p>
         * <ul>
         * <li><p>containerd: Recommended. Supported by all cluster versions.</p>
         * </li>
         * <li><p>Sandboxed-Container.runv: Sandboxed container that provides higher isolation. Supported by clusters of version 1.31 or earlier.</p>
         * </li>
         * <li><p>docker: No longer maintained. Supported by clusters of version 1.22 or earlier.</p>
         * </li>
         * </ul>
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
         * <p>Node taint information. Taints and tolerations work together to prevent pods from being scheduled onto unsuitable nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Indicates whether newly scaled nodes are unschedulable.</p>
         * <ul>
         * <li><p>true: Unschedulable.</p>
         * </li>
         * <li><p>false: Schedulable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>Custom data for the node pool. This is a script that runs after node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance custom data</a>.</p>
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
         * <p>Indicates whether manual approval is required for node repair.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>ID of the automatic repair policy.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>Indicates whether node restart is allowed. This parameter takes effect only when <code>auto_repair=true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Allows node restart.</p>
         * </li>
         * <li><p><code>false</code>: Disallows node restart.</p>
         * </li>
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
         * <p>Indicates whether kubelet auto-upgrade is allowed. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows kubelet auto-upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disallows kubelet auto-upgrade.</p>
         * </li>
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
         * <p>Packages excluded from vulnerability fixes.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Indicates whether node restart is allowed. This parameter takes effect only when <code>auto_vul_fix=true</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows node restart.</p>
         * </li>
         * <li><p><code>false</code>: Disallows node restart.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>Vulnerability levels that can be automatically fixed, separated by commas.</p>
         * <ul>
         * <li><p><code>asap</code>: High</p>
         * </li>
         * <li><p><code>later</code>: Medium</p>
         * </li>
         * <li><p><code>nntf</code>: Low</p>
         * </li>
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
         * <p>Indicates whether auto-upgrade is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables auto-upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto-upgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>Maximum number of unavailable nodes. Valid values: [1,1000].</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>Number of extra nodes. Specify either this parameter or <code>surge_percentage</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>Percentage of extra nodes. Specify either this parameter or <code>surge</code>.</p>
         * <p>Number of extra nodes = surge percentage × number of nodes. For example, if you set the surge percentage to 50% and the current number of nodes is 6, the number of extra nodes is 50% × 6 = 3.</p>
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
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Automatic repair. This parameter takes effect only when <code>enable=true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Enables automatic repair.</p>
         * </li>
         * <li><p><code>false</code>: Disables automatic repair.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>Automatic node repair policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Indicates whether node auto-upgrade is enabled. This parameter takes effect only when <code>enable=true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Enables auto-upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto-upgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>Auto-upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Indicates whether CVEs are automatically fixed. This parameter takes effect only when <code>enable=true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Enables automatic CVE fixing.</p>
         * </li>
         * <li><p><code>false</code>: Disables automatic CVE fixing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>CVE automatic fix policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Indicates whether the managed node pool feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables the managed node pool.</p>
         * </li>
         * <li><p><code>false</code>: Disables the managed node pool. Other related configurations take effect only when <code>enable=true</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Auto-upgrade configuration. This parameter takes effect only when <code>enable=true</code>.</p>
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig extends TeaModel {
        /**
         * <p>Custom configuration for node components.</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, String> customConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig setCustomConfig(java.util.Map<String, String> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents extends TeaModel {
        /**
         * <p>Node component configuration.</p>
         */
        @NameInMap("config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponentsConfig config;

        /**
         * <p>Node component name.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Node component version.</p>
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
         * <p>Hugepage configuration.</p>
         */
        @NameInMap("hugepage")
        public Hugepage hugepage;

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

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig extends TeaModel {
        /**
         * <p>Kubelet parameter configuration.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        /**
         * <p>Node operating system configuration.</p>
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
         * <p>Time when the node pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-15T16:33:29.362888807+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>Indicates whether the node pool is the default node pool. A cluster usually has only one default node pool. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Default node pool.</p>
         * </li>
         * <li><p><code>false</code>: Non-default node pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_default")
        public Boolean isDefault;

        /**
         * <p>Node pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-nodepool</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np615c0e0966124216a0412e10afe0****</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>Node pool type. Valid values:</p>
         * <ul>
         * <li><p><code>ess</code>: Standard node pool (supports managed features and automatic elastic scaling).</p>
         * </li>
         * <li><p><code>edge</code>: Edge node pool.</p>
         * </li>
         * <li><p><code>lingjun</code>: Lingjun node pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Time when the node pool was last updated.</p>
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>Private pool ID. This is the ID of an elasticity assurance service or capacity reservation service.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Private pool type. Specifies how instance startup uses private pool capacity. After an elasticity assurance service or capacity reservation service takes effect, it generates private pool capacity for instance startup. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: Open mode. Automatically matches open-type private pool capacity. If no matching private pool capacity is available, public pool resources are used.</p>
         * </li>
         * <li><p><code>Target</code>: Target mode. Uses the specified private pool capacity to start instances. If the private pool capacity is unavailable, instance startup fails.</p>
         * </li>
         * <li><p><code>None</code>: None mode. Instance startup does not use private pool capacity.</p>
         * </li>
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
         * <p>List of private pool IDs.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Resource pool strategy used when creating instances. Valid values:
         * PrivatePoolFirst: Private pool first.
         * PrivatePoolOnly: Private pool only.
         * None: Do not use resource pool strategy.</p>
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
         * <p>Spot instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>Market price range per instance.</p>
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
         * <p>Indicates whether auto-renewal is enabled for nodes. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables auto-renewal.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto-renewal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>Duration of each auto-renewal cycle. Valid values:</p>
         * <ul>
         * <li><p>When PeriodUnit=Week: 1, 2, 3.</p>
         * </li>
         * <li><p>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>Use the security_hardening_os parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>When <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>, indicates whether to automatically attempt creating pay-as-you-go instances if sufficient spot instances cannot be created due to price or inventory issues. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows automatic attempts to create pay-as-you-go instances to meet the required ECS instance count.</p>
         * </li>
         * <li><p><code>false</code>: Disallows automatic attempts to create pay-as-you-go instances to meet the required ECS instance count.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>Combination of data disk types, sizes, and other configurations for nodes.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>Deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>Desired number of nodes in the node pool.</p>
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
         * <p>Custom image ID. You can query supported images using <code>DescribeKubernetesVersionMetadata</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>Operating system image type.</p>
         * <ul>
         * <li><p><code>AliyunLinux</code>: Alinux2 image.</p>
         * </li>
         * <li><p><code>AliyunLinuxSecurity</code>: Alinux2 UEFI image.</p>
         * </li>
         * <li><p><code>AliyunLinux3</code>: Alinux3 image.</p>
         * </li>
         * <li><p><code>AliyunLinux3Arm64</code>: Alinux3 ARM image.</p>
         * </li>
         * <li><p><code>AliyunLinux3Security</code>: Alinux3 UEFI image.</p>
         * </li>
         * <li><p><code>CentOS</code>: CentOS image.</p>
         * </li>
         * <li><p><code>Windows</code>: Windows image.</p>
         * </li>
         * <li><p><code>WindowsCore</code>: WindowsCore image.</p>
         * </li>
         * <li><p><code>ContainerOS</code>: Container-optimized image.</p>
         * </li>
         * <li><p><code>AliyunLinux3ContainerOptimized</code>: Alinux3 container-optimized image.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>Billing method for nodes in the node pool. Valid values:</p>
         * <ul>
         * <li><p><code>PrePaid</code>: Subscription.</p>
         * </li>
         * <li><p><code>PostPaid</code>: Pay-as-you-go.</p>
         * </li>
         * </ul>
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
         * <p>List of node instance types. You can select multiple instance types as alternatives. When creating a node, the system attempts to purchase instances starting from the first type until successful. The actual purchased instance type may vary due to inventory availability.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n4.large</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>Billing method for public network bandwidth of nodes.</p>
         * <ul>
         * <li><p>PayByBandwidth: Pay-by-bandwidth.</p>
         * </li>
         * <li><p>PayByTraffic: Pay-by-traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>Maximum outbound public bandwidth for nodes. Unit: Mbps. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>Key pair name. Specify either this parameter or <code>login_password</code>.</p>
         * <p>For managed node pools, only <code>key_pair</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Indicates whether to log on to the ECS instance as a non-root user.</p>
         * <ul>
         * <li><p>true: Log on as the non-root user (ecs-user).</p>
         * </li>
         * <li><p>false: Log on as the root user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>SSH logon password. Specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters long and contain at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
         * <p>For security reasons, the returned password is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>ECS instance scaling policy for multi-zone scaling groups. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scales based on the virtual switches (VSwitchIds.N) you define. If ECS instances cannot be created in the zone of a higher-priority virtual switch, the system automatically uses the next priority virtual switch.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Attempts to create instances from lowest to highest vCPU price. When multiple instance types or spot billing are configured, spot instances are prioritized. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically attempt pay-as-you-go instance creation if spot instances cannot be created due to inventory or other reasons.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when multiple instance types are configured or spot instances are selected.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Distributes ECS instances evenly across the specified zones. If zones become unbalanced due to inventory shortages, you can use the <code>RebalanceInstances</code> API to rebalance resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COST_OPTIMIZED</p>
         */
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        /**
         * <p>Minimum number of pay-as-you-go instances required in the scaling group. Valid values: [0,1000]. If the number of pay-as-you-go instances is less than this value, pay-as-you-go instances are prioritized for creation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>Percentage of pay-as-you-go instances among instances exceeding the minimum pay-as-you-go instance count (<code>on_demand_base_capacity</code>). Valid values: [0,100].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>Subscription duration for nodes. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><p>When <code>period_unit=Week</code>, valid values for <code>period</code> are {1, 2, 3, 4}.</p>
         * </li>
         * <li><p>When <code>period_unit=Month</code>, valid values for <code>period</code> are {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60}.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>Billing cycle for nodes. Specify this parameter when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><p><code>Month</code>: Billed monthly.</p>
         * </li>
         * <li><p><code>Week</code>: Billed weekly.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>Operating system distribution. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>Private pool options.</p>
         */
        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>This field is deprecated. Use ram_role_name instead.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-021dc54f-929b-437a-8ae0-34c24d3e****</p>
         */
        @NameInMap("ram_policy")
        public String ramPolicy;

        /**
         * <p>Worker RAM role name.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-4a4fa089-80c1-48a5-b3c6-9349311f****</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>If RDS instances are specified, ECS nodes in the cluster are automatically added to the RDS access whitelist.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>Resource pool and strategy used when creating instances.</p>
         */
        @NameInMap("resource_pool_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>Scaling group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-2ze8n5qw4atggut8****</p>
         */
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        /**
         * <p>Scaling group mode. Valid values:</p>
         * <ul>
         * <li><p><code>release</code>: Standard mode. Scales by creating or releasing ECS instances based on resource usage.</p>
         * </li>
         * <li><p><code>recycle</code>: Fast mode. Scales by creating, stopping, or starting instances to speed up subsequent scaling operations. (Stopped instances incur no compute charges, only storage fees, except for local-disk instance types.)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>Security group ID for the node pool. When multiple security groups are bound to the node pool, this value is the first value in <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze1iuk12m2sb4c4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>List of security group IDs for the node pool.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Alibaba Cloud OS security hardening. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables Alibaba Cloud OS security hardening.</p>
         * </li>
         * <li><p><code>false</code>: Disables Alibaba Cloud OS security hardening.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>Indicates whether classified protection compliance hardening is enabled. You can enable this feature for nodes only when Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 is selected as the OS image. Alibaba Cloud provides baseline check standards and scanning programs for MLPS 2.0 Level-3 compliance for Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Number of available instance types. The scaling group creates spot instances evenly across the lowest-cost instance types. Valid values: [1,10].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Indicates whether to replenish spot instances. When enabled, if the system receives a notification that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the instance to be reclaimed. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables replenishment.</p>
         * </li>
         * <li><p><code>false</code>: Disables replenishment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>Market price range configuration for spot instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>Spot instance type. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: Regular instance.</p>
         * </li>
         * <li><p>SpotWithPriceLimit: Sets a maximum price for spot instances.</p>
         * </li>
         * <li><p>SpotAsPriceGo: Uses the current market price.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Indicates whether burst performance is enabled for the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled. When facing sudden read/write pressure from fluctuating workloads, the disk temporarily boosts performance based on actual workload conditions until the workload stabilizes.</p>
         * </li>
         * <li><p>false: Disabled.</p>
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
         * <p>Multiple system disk types. If the system cannot use a higher-priority disk type, it automatically tries the next priority disk type to create the system disk.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>System disk type for nodes. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: Ultra disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: Enterprise SSD.</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL disk.</p>
         * </li>
         * <li><p><code>cloud_essd_entry</code>: ESSD Entry disk.</p>
         * </li>
         * </ul>
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
         * <p>Indicates whether the system disk is encrypted. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypted.</p>
         * </li>
         * <li><p>false: Not encrypted.</p>
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
         * <p>Disk performance level for the system disk. This parameter applies only to ESSD disks. Disk performance levels depend on disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD disks</a>.</p>
         * <ul>
         * <li><p>PL0: Moderate I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL1: Moderate I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL2: High I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL3: Extremely high I/O performance with highly stable read/write latency.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Provisioned read/write IOPS for the system disk. Configure this parameter when the disk type is cloud_auto.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>System disk size for nodes. Unit: GiB.</p>
         * <p>Valid values: [20,2048].</p>
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
         * <p>ECS instance tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>List of virtual switch IDs.</p>
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
         * <p>Number of failed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failed_nodes")
        public Long failedNodes;

        /**
         * <p>Number of healthy instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("healthy_nodes")
        public Long healthyNodes;

        /**
         * <p>Number of nodes being created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("initial_nodes")
        public Long initialNodes;

        /**
         * <p>Number of offline nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("offline_nodes")
        public Long offlineNodes;

        /**
         * <p>Number of nodes being removed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("removing_nodes")
        public Long removingNodes;

        /**
         * <p>Number of active nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("serving_nodes")
        public Long servingNodes;

        /**
         * <p>Node pool state. Valid values:</p>
         * <ul>
         * <li><p><code>active</code>: Activated.</p>
         * </li>
         * <li><p><code>scaling</code>: Scaling.</p>
         * </li>
         * <li><p><code>removing</code>: Removing nodes.</p>
         * </li>
         * <li><p><code>deleting</code>: Deleting.</p>
         * </li>
         * <li><p><code>updating</code>: Updating.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>Total number of nodes in the node pool.</p>
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
         * <p>Indicates whether confidential computing is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enabled.</p>
         * </li>
         * <li><p><code>false</code>: Disabled.</p>
         * </li>
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
         * <p>Intelligent management configuration.</p>
         */
        @NameInMap("auto_mode")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoMode autoMode;

        /**
         * <p>Automatic scaling configuration.</p>
         */
        @NameInMap("auto_scaling")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling;

        /**
         * <p>Lingjun node group information.</p>
         */
        @NameInMap("eflo_node_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsEfloNodeGroup efloNodeGroup;

        /**
         * <p>[This field is deprecated.]</p>
         * <p>Network configuration for edge node pools. This parameter applies only to edge-type node pools.</p>
         */
        @NameInMap("interconnect_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig interconnectConfig;

        /**
         * <p>Network type for edge node pools. This parameter applies only to node pools where <code>type</code> is <code>edge</code>. Valid values:</p>
         * <ul>
         * <li><p><code>basic</code>: Public network. Nodes in the node pool interact with cloud nodes over the public network and cannot directly access the VPC intranet.</p>
         * </li>
         * <li><p><code>private</code>: Private network. Nodes in the node pool connect to the cloud through leased lines, VPN, or CEN, providing higher cloud-edge communication quality and better security.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("interconnect_mode")
        public String interconnectMode;

        /**
         * <p>Cluster-related configuration.</p>
         */
        @NameInMap("kubernetes_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig;

        /**
         * <p>Managed node pool configuration. This parameter takes effect only for professional managed clusters.</p>
         */
        @NameInMap("management")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement management;

        /**
         * <p>Maximum number of nodes allowed in an edge node pool. This parameter is greater than or equal to 0. A value of 0 means no additional limit (only limited by the overall cluster capacity). This parameter is usually greater than 0 for edge node pools, and 0 for ess-type node pools and default edge-type node pools.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_nodes")
        public Long maxNodes;

        /**
         * <p>List of node components.</p>
         */
        @NameInMap("node_components")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsNodeComponents> nodeComponents;

        /**
         * <p>Node configuration.</p>
         */
        @NameInMap("node_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodeConfig nodeConfig;

        /**
         * <p>Node pool information.</p>
         */
        @NameInMap("nodepool_info")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo;

        /**
         * <p>Scaling group configuration for the node pool.</p>
         */
        @NameInMap("scaling_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup;

        /**
         * <p>Node pool status.</p>
         */
        @NameInMap("status")
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus status;

        /**
         * <p>Confidential computing configuration.</p>
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
