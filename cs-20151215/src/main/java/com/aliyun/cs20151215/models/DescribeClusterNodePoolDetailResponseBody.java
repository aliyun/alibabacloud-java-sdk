// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolDetailResponseBody extends TeaModel {
    /**
     * <p>The auto scaling configuration of the node pool.</p>
     */
    @NameInMap("auto_scaling")
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling;

    /**
     * <p>Indicates whether the pods in the edge node pool can use the host network.</p>
     * <p><code>true</code>: sets to host network.</p>
     * <p><code>false</code>: sets to container network.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("host_network")
    public Boolean hostNetwork;

    /**
     * <p>The network configuration of the edge node pool. This parameter takes effect only for edge node pools.</p>
     */
    @NameInMap("interconnect_config")
    public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter takes effect only if you set the type parameter of the node pool to edge. Valid values:</p>
     * <p><code>basic</code>: Internet.</p>
     * <p><code>private</code>: private network.</p>
     * 
     * <strong>example:</strong>
     * <p>improved</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>Specifies whether all nodes in the edge node pool can communicate with each other at Layer 3.</p>
     * <p><code>true</code>: The nodes in the edge node pool can communicate with each other at Layer 3.</p>
     * <p><code>false</code>: The nodes in the edge node pool cannot communicate with each other at Layer 3.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("intranet")
    public Boolean intranet;

    /**
     * <p>The configurations of the cluster in which the node pool is deployed.</p>
     */
    @NameInMap("kubernetes_config")
    public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig kubernetesConfig;

    /**
     * <p>The configuration of the managed node pool feature.</p>
     */
    @NameInMap("management")
    public DescribeClusterNodePoolDetailResponseBodyManagement management;

    /**
     * <p>This parameter is deprecated.</p>
     * <p>The maximum number of nodes allowed in an edge node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_nodes")
    public Long maxNodes;

    /**
     * <p>The node configurations.</p>
     */
    @NameInMap("node_config")
    public DescribeClusterNodePoolDetailResponseBodyNodeConfig nodeConfig;

    /**
     * <p>The configuration of the node pool.</p>
     */
    @NameInMap("nodepool_info")
    public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group used by the node pool.</p>
     */
    @NameInMap("scaling_group")
    public DescribeClusterNodePoolDetailResponseBodyScalingGroup scalingGroup;

    /**
     * <p>The status details about the node pool.</p>
     */
    @NameInMap("status")
    public DescribeClusterNodePoolDetailResponseBodyStatus status;

    /**
     * <p>The configuration of confidential computing.</p>
     */
    @NameInMap("tee_config")
    public DescribeClusterNodePoolDetailResponseBodyTeeConfig teeConfig;

    public static DescribeClusterNodePoolDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolDetailResponseBody self = new DescribeClusterNodePoolDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolDetailResponseBody setAutoScaling(DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    public DescribeClusterNodePoolDetailResponseBody setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public DescribeClusterNodePoolDetailResponseBody setInterconnectConfig(DescribeClusterNodePoolDetailResponseBodyInterconnectConfig interconnectConfig) {
        this.interconnectConfig = interconnectConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    public DescribeClusterNodePoolDetailResponseBody setInterconnectMode(String interconnectMode) {
        this.interconnectMode = interconnectMode;
        return this;
    }
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    public DescribeClusterNodePoolDetailResponseBody setIntranet(Boolean intranet) {
        this.intranet = intranet;
        return this;
    }
    public Boolean getIntranet() {
        return this.intranet;
    }

    public DescribeClusterNodePoolDetailResponseBody setKubernetesConfig(DescribeClusterNodePoolDetailResponseBodyKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public DescribeClusterNodePoolDetailResponseBody setManagement(DescribeClusterNodePoolDetailResponseBodyManagement management) {
        this.management = management;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyManagement getManagement() {
        return this.management;
    }

    public DescribeClusterNodePoolDetailResponseBody setMaxNodes(Long maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public DescribeClusterNodePoolDetailResponseBody setNodeConfig(DescribeClusterNodePoolDetailResponseBodyNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyNodeConfig getNodeConfig() {
        return this.nodeConfig;
    }

    public DescribeClusterNodePoolDetailResponseBody setNodepoolInfo(DescribeClusterNodePoolDetailResponseBodyNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public DescribeClusterNodePoolDetailResponseBody setScalingGroup(DescribeClusterNodePoolDetailResponseBodyScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public DescribeClusterNodePoolDetailResponseBody setStatus(DescribeClusterNodePoolDetailResponseBodyStatus status) {
        this.status = status;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyStatus getStatus() {
        return this.status;
    }

    public DescribeClusterNodePoolDetailResponseBody setTeeConfig(DescribeClusterNodePoolDetailResponseBodyTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static class DescribeClusterNodePoolDetailResponseBodyAutoScaling extends TeaModel {
        /**
         * <p>The maximum bandwidth of the elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>The metering method of the EIP. Valid values:</p>
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
         * <p>Indicates whether auto scaling is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: auto scaling is enabled.</li>
         * <li><code>false</code>: auto scaling is disabled. If this parameter is set to false, other parameters in the <code>auto_scaling</code> section do not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Indicates whether an EIP is associated with the node pool. Valid values:</p>
         * <ul>
         * <li><code>true</code>: An EIP is associated with the node pool.</li>
         * <li><code>false</code>: No EIP is associated with the node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>The maximum number of Elastic Compute Service (ECS) instances that can be created in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of ECS instances that must be kept in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeClusterNodePoolDetailResponseBodyAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyAutoScaling self = new DescribeClusterNodePoolDetailResponseBodyAutoScaling();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyInterconnectConfig extends TeaModel {
        /**
         * <p>The bandwidth of the enhanced edge node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>The ID of the Cloud Connect Network (CCN) instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>The region to which the CCN instance that is associated with the enhanced edge node pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>The subscription duration of the enhanced edge node pool. The duration is measured in months.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("improved_period")
        public String improvedPeriod;

        public static DescribeClusterNodePoolDetailResponseBodyInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyInterconnectConfig self = new DescribeClusterNodePoolDetailResponseBodyInterconnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyKubernetesConfig extends TeaModel {
        /**
         * <p>Indicates whether the CloudMonitor agent is installed on ECS nodes in the cluster. After the CloudMonitor agent is installed, you can view monitoring information about the ECS instances in the CloudMonitor console. Installation is recommended. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The CloudMonitor agent is installed on ECS nodes.</li>
         * <li><code>false</code>: The CloudMonitor agent is not installed on ECS nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy of the nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
         * <ul>
         * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: indicates that the default CPU affinity is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The labels that you want to add to the nodes in the cluster. You must add labels based on the following rules:</p>
         * <ul>
         * <li>A label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
         * <li>The key must be unique and cannot exceed 64 characters in length. The value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>A custom node name consists of a prefix, an IP substring, and a suffix.</p>
         * <ul>
         * <li>The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.</li>
         * <li>The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.</li>
         * </ul>
         * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.</p>
         * 
         * <strong>example:</strong>
         * <p>customized,test.,5,.com</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The user-defined script that is executed before nodes are initialized. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user-defined data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The name of the container runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>docker</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The version of the container runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>19.03.5</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The taints that you want to add to nodes. Taints can be used together with tolerations to prevent pods from being scheduled to specific nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Whether the expanded node is schedulable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>The custom script to be executed after nodes in the node pool are initialized. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user-defined data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvYmluL3NoCmVjaG8gIkhlbGxvIEFDSyEi</p>
         */
        @NameInMap("user_data")
        public String userData;

        public static DescribeClusterNodePoolDetailResponseBodyKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyKubernetesConfig self = new DescribeClusterNodePoolDetailResponseBodyKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy extends TeaModel {
        /**
         * <p>Whether to allow restarting nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        public static DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy self = new DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy extends TeaModel {
        /**
         * <p>Whether to allow automatic upgrading of kubelet.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        public static DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy self = new DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy setAutoUpgradeKubelet(Boolean autoUpgradeKubelet) {
            this.autoUpgradeKubelet = autoUpgradeKubelet;
            return this;
        }
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy extends TeaModel {
        /**
         * <p>Whether to allow restarting nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The vulnerability levels allowed for auto-fixing, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>asap,nntf</p>
         */
        @NameInMap("vul_level")
        public String vulLevel;

        public static DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy self = new DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig extends TeaModel {
        /**
         * <p>Indicates whether auto update is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Auto update is enabled.</li>
         * <li><code>false</code>: Auto update is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of nodes that can be in the Unavailable state. Valid values: 1 to 1000.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of additional nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of additional nodes to the nodes in the node pool. You must set this parameter or <code>surge</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig self = new DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagement extends TeaModel {
        /**
         * <p>Indicates whether auto repair is enabled. This parameter takes effect only when <code>enable=true</code> is specified. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Auto repair is enabled.</li>
         * <li><code>false</code>: Auto repair is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>Automatic repair node policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Whether to automatically upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>Automatic upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Whether to automatically fix CVEs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>Automatically repair CVE policies.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Indicates whether the managed node pool feature is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The managed node pool feature is enabled.</li>
         * <li><code>false</code>: The managed node pool feature is disabled. Other parameters in this section take effect only when <code>enable=true</code> is specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The configuration of auto update. The configuration takes effect only when <code>enable=true</code> is specified.</p>
         */
        @NameInMap("upgrade_config")
        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig upgradeConfig;

        public static DescribeClusterNodePoolDetailResponseBodyManagement build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagement self = new DescribeClusterNodePoolDetailResponseBodyManagement();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoRepairPolicy(DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy autoRepairPolicy) {
            this.autoRepairPolicy = autoRepairPolicy;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoUpgradePolicy(DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy autoUpgradePolicy) {
            this.autoUpgradePolicy = autoUpgradePolicy;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoVulFix(Boolean autoVulFix) {
            this.autoVulFix = autoVulFix;
            return this;
        }
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoVulFixPolicy(DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy autoVulFixPolicy) {
            this.autoVulFixPolicy = autoVulFixPolicy;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setUpgradeConfig(DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodeConfig extends TeaModel {
        /**
         * <p>The configurations of the kubelet.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        public static DescribeClusterNodePoolDetailResponseBodyNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyNodeConfig self = new DescribeClusterNodePoolDetailResponseBodyNodeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyNodeConfig setKubeletConfiguration(KubeletConfig kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
            return this;
        }
        public KubeletConfig getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodepoolInfo extends TeaModel {
        /**
         * <p>The time when the node pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-27T19:14:09.156823496+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>Indicates whether the node pool is a default node pool. A Container Service for Kubernetes (ACK) cluster usually has only one default node pool. Valid values: <code>true</code>: The node pool is a default node pool. <code>false</code>: The node pool is not a default node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_default")
        public Boolean isDefault;

        /**
         * <p>The name of the node pool.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjmb****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The type of node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the node pool was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-27T20:37:46+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        public static DescribeClusterNodePoolDetailResponseBodyNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyNodepoolInfo self = new DescribeClusterNodePoolDetailResponseBodyNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of private node pool. This parameter specifies the type of private node pool that you want to use to create instances. A private node pool is generated when an elasticity assurance or a capacity reservation service takes effect. The system selects a private node pool to launch instances. Valid values:</p>
         * <ul>
         * <li><code>Open</code>: open private pool. The system selects an open private node pool to launch instances. If no matching open private node pool is available, the resources in the public node pool are used.</li>
         * <li><code>Target</code>: specific private pool. The system uses the resources of the specified private node pool to launch instances. If the specified private node pool is unavailable, instances cannot be launched.</li>
         * <li><code>None</code>: no private node pool is used. The resources of private node pools are not used to launch the instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("match_criteria")
        public String matchCriteria;

        public static DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions self = new DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The instance type of the preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The price cap of a preemptible instance of the type.</p>
         * <p>Unit: USD/hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0.39</p>
         */
        @NameInMap("price_limit")
        public String priceLimit;

        public static DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit self = new DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroup extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Auto-renewal is enabled.</li>
         * <li><code>false</code>: Auto-renewal is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of the auto-renewal. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>If you specify <code>PeriodUnit=Month</code>, the valid values are 1, 2, 3, 6, and 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>【The field is deprecated】Please use the parameter security_hardening_os instead.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>Indicates whether pay-as-you-go instances are automatically created to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as cost or insufficient inventory. This parameter takes effect when <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Pay-as-you-go instances are automatically created to meet the required number of ECS instances if preemptible instances cannot be created.</li>
         * <li><code>false</code>: Pay-as-you-go instances are not automatically created to meet the required number of ECS instances if preemptible instances cannot be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The configurations of the data disks that are attached to the nodes in the node pool. The configurations include the disk category and disk size.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The ID of the deployment set to which the ECS instances in the node pool belong.</p>
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
         * <p>The ID of the custom image. You can call the <code>DescribeKubernetesVersionMetadata</code> operation to query the images supported by ACK.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>Operating system image type.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: the subscription billing method.</li>
         * <li><code>PostPaid</code>: the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The instance properties.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>A list of instance types. You can select multiple instance types. When the system needs to create a node, it starts from the first instance type until the node is created. The instance type that is used to create the node varies based on the actual instance stock.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth of the public IP address of the node. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must set this parameter or the <code>login_password</code> parameter. You must set <code>key_pair</code> if the node pool is a managed node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Whether the popped ECS instance uses a non-root user for login.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The password for SSH logon. You must set this parameter or the <code>key_pair</code> parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * <p>For security purposes, the returned password is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The ECS instance scaling policy for a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: the scaling group is scaled based on the VSwitchIds.N parameter. If an ECS instance cannot be created in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates the ECS instance in the zone where the vSwitch that has the next highest priority resides.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configuration. You can set the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
         * <p>**</p>
         * <p><strong>Note</strong>The <code>COST_OPTIMIZED</code> setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
         * </li>
         * <li><p><code>BALANCE</code>: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call the RebalanceInstances operation of Auto Scaling to balance the instance distribution among zones. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
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
         * <p>The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.</p>
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
         * <p>The subscription duration of worker nodes. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>If <code>PeriodUnit=Month</code> is specified, the valid values are 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes. This parameter is required if <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The release version of the operating system. Valid values:</p>
         * <ul>
         * <li><code>CentOS</code></li>
         * <li><code>AliyunLinux</code></li>
         * <li><code>Windows</code></li>
         * <li><code>WindowsCore</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The configuration of the private node pool.</p>
         */
        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.</p>
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
         * <p>After you specify the list of RDS instances, the ECS instances in the cluster are automatically added to the whitelist of the RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-2zeieod8giqmov7z****</p>
         */
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <ul>
         * <li><code>release</code>: the standard mode. ECS instances are created and released based on resource usage.</li>
         * <li><code>recycle</code>: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances that are attached with local disks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The ID of the security group to which the node pool is added. If the node pool is added to multiple security groups, the first ID in the value of <code>security_group_ids</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze60ockeekspl3d****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which the node pool is added.</p>
         */
        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Alibaba Cloud OS security hardening. Values:</p>
         * <ul>
         * <li><code>true</code>: Enable Alibaba Cloud OS security hardening. </li>
         * <li><code>false</code>: Do not enable Alibaba Cloud OS security hardening.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>Indicates whether to enable security reinforcement compliant with the hardening standards. This option is available only when the system image is set to Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3. Alibaba Cloud provides baseline check standards and scanning programs compliant with Grade 3, Version 2.0 of the hardening standards for both Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Indicates whether preemptible instances are supplemented when the number of preemptible instances drops below the specified minimum number. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values: Valid values:</p>
         * <ul>
         * <li><code>true</code>: Supplementation of preemptible instances is enabled.</li>
         * <li><code>false</code>: Supplementation of preemptible instances is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The bid configurations of preemptible instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The type of preemptible instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: a non-preemptible instance.</li>
         * <li>SpotWithPriceLimit: a preemptible instance that is configured with the highest bid price.</li>
         * <li>SpotAsPriceGo: a preemptible instance for which the system automatically bids based on the current market price.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Preemptible instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Whether to enable Burst (performance burst) for the node system disk, configured when the disk type is cloud_auto.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The categories of the system disk for nodes. The system attempts to create system disks of a disk category with a lower priority if the disk category with a higher priority is unavailable. Valid values: Valid values:</p>
         * <ul>
         * <li><code>cloud</code>: basic disk.</li>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value: <code>cloud_efficiency</code>.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The system disk type. Valid values:</p>
         * <ul>
         * <li><code>cloud</code>: basic disk</li>
         * <li><code>cloud_efficiency</code>: ultra disk</li>
         * <li><code>cloud_ssd</code>: standard SSD</li>
         * <li><code>cloud_essd</code>: Enterprise SSD (ESSD)</li>
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
         * <p>The encryption algorithm that is used to encrypt the system disk. Set the value to aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values: Valid values:</p>
         * <ul>
         * <li><code>true</code>: encrypts the system disk.</li>
         * <li><code>false</code>: does not encrypt the system disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>System disk\&quot;s KMS key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level (PL) of the system disk that you want to use for the node. This parameter takes effect only for enhanced SSDs (ESSDs).</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Pre-configured read and write IOPS for the system disk of the node, configured when the disk type is cloud_auto.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system disk size of a node. Unit: GiB.</p>
         * <p>Valid values: 20 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The labels that you want to add only to ECS instances.</p>
         * <p>The label key must be unique and cannot exceed 128 characters in length. The label key and value cannot start with aliyun or acs: or contain https:// or http://.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The IDs of vSwitches. You can specify 1 to 20 vSwitches.</p>
         * <blockquote>
         * <p>We recommend that you select vSwitches in different zones to ensure high availability.</p>
         * </blockquote>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static DescribeClusterNodePoolDetailResponseBodyScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyScalingGroup self = new DescribeClusterNodePoolDetailResponseBodyScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        @Deprecated
        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setCisEnabled(Boolean cisEnabled) {
            this.cisEnabled = cisEnabled;
            return this;
        }
        public Boolean getCisEnabled() {
            return this.cisEnabled;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInstancePatterns(java.util.List<InstancePatterns> instancePatterns) {
            this.instancePatterns = instancePatterns;
            return this;
        }
        public java.util.List<InstancePatterns> getInstancePatterns() {
            return this.instancePatterns;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPrivatePoolOptions(DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setRamPolicy(String ramPolicy) {
            this.ramPolicy = ramPolicy;
            return this;
        }
        public String getRamPolicy() {
            return this.ramPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotPriceLimit(java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskKmsKeyId(String systemDiskKmsKeyId) {
            this.systemDiskKmsKeyId = systemDiskKmsKeyId;
            return this;
        }
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyStatus extends TeaModel {
        /**
         * <p>The number of failed nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failed_nodes")
        public Long failedNodes;

        /**
         * <p>The number of healthy nodes.</p>
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
         * <p>The number of running nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("serving_nodes")
        public Long servingNodes;

        /**
         * <p>The status of the node pool. Valid values:</p>
         * <ul>
         * <li><code>active</code>: The node pool is active.</li>
         * <li><code>scaling</code>: The node pool is being scaled.</li>
         * <li><code>removing</code>: Nodes are being removed from the node pool.</li>
         * <li><code>deleting</code>: The node pool is being deleted.</li>
         * <li><code>updating</code>: The node pool is being updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The total number of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("total_nodes")
        public Long totalNodes;

        public static DescribeClusterNodePoolDetailResponseBodyStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyStatus self = new DescribeClusterNodePoolDetailResponseBodyStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setFailedNodes(Long failedNodes) {
            this.failedNodes = failedNodes;
            return this;
        }
        public Long getFailedNodes() {
            return this.failedNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setHealthyNodes(Long healthyNodes) {
            this.healthyNodes = healthyNodes;
            return this;
        }
        public Long getHealthyNodes() {
            return this.healthyNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setInitialNodes(Long initialNodes) {
            this.initialNodes = initialNodes;
            return this;
        }
        public Long getInitialNodes() {
            return this.initialNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setOfflineNodes(Long offlineNodes) {
            this.offlineNodes = offlineNodes;
            return this;
        }
        public Long getOfflineNodes() {
            return this.offlineNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setRemovingNodes(Long removingNodes) {
            this.removingNodes = removingNodes;
            return this;
        }
        public Long getRemovingNodes() {
            return this.removingNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setServingNodes(Long servingNodes) {
            this.servingNodes = servingNodes;
            return this;
        }
        public Long getServingNodes() {
            return this.servingNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setTotalNodes(Long totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Long getTotalNodes() {
            return this.totalNodes;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyTeeConfig extends TeaModel {
        /**
         * <p>Indicates whether confidential computing is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Confidential computing is enabled.</li>
         * <li><code>false</code>: Confidential computing is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static DescribeClusterNodePoolDetailResponseBodyTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyTeeConfig self = new DescribeClusterNodePoolDetailResponseBodyTeeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
