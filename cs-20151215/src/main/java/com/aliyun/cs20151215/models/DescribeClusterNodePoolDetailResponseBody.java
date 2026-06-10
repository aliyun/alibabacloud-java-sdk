// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolDetailResponseBody extends TeaModel {
    /**
     * <p>Smart managed configuration.</p>
     */
    @NameInMap("auto_mode")
    public DescribeClusterNodePoolDetailResponseBodyAutoMode autoMode;

    /**
     * <p>Automatic scaling configuration for the node pool.</p>
     */
    @NameInMap("auto_scaling")
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling;

    @NameInMap("eflo_node_group")
    public DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup efloNodeGroup;

    /**
     * <p>Indicates whether pods use the host network mode.</p>
     * <ul>
     * <li><p><code>true</code>: Host network. Pods share the host\&quot;s network stack, IP address, and ports.</p>
     * </li>
     * <li><p><code>false</code>: Container network. Pods have independent network stacks and do not occupy host network ports.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("host_network")
    public Boolean hostNetwork;

    /**
     * <p>[Deprecated]</p>
     * <p>Network configuration for edge node pools. This parameter applies only to edge-type node pools.</p>
     */
    @NameInMap("interconnect_config")
    public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig interconnectConfig;

    /**
     * <p>The network type for edge node pools. This parameter applies only to node pools where <code>type</code> is <code>edge</code>. Valid values:</p>
     * <ul>
     * <li><p><code>basic</code>: Public network. Nodes in the node pool interact with cloud nodes over the public network and cannot directly access the VPC intranet.</p>
     * </li>
     * <li><p><code>private</code>: Private network. Nodes in the node pool connect to the cloud through leased lines, VPNs, or CEN, providing higher-quality cloud-edge communication and better security.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>Indicates whether Layer 3 networking is enabled between nodes in the edge node pool.</p>
     * <ul>
     * <li><p><code>true</code>: Enabled. All nodes in the node pool can communicate over Layer 3.</p>
     * </li>
     * <li><p><code>false</code>: Disabled. Layer 3 communication is disabled between nodes in the node pool.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("intranet")
    public Boolean intranet;

    /**
     * <p>Cluster-related configuration.</p>
     */
    @NameInMap("kubernetes_config")
    public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig kubernetesConfig;

    /**
     * <p>Managed node pool configuration.</p>
     */
    @NameInMap("management")
    public DescribeClusterNodePoolDetailResponseBodyManagement management;

    /**
     * <p>[Deprecated]</p>
     * <p>The maximum number of nodes allowed in the edge node pool.</p>
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
    public java.util.List<DescribeClusterNodePoolDetailResponseBodyNodeComponents> nodeComponents;

    /**
     * <p>Node configuration.</p>
     */
    @NameInMap("node_config")
    public DescribeClusterNodePoolDetailResponseBodyNodeConfig nodeConfig;

    /**
     * <p>Node pool configuration.</p>
     */
    @NameInMap("nodepool_info")
    public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo nodepoolInfo;

    /**
     * <p>Scaling group configuration for the node pool.</p>
     */
    @NameInMap("scaling_group")
    public DescribeClusterNodePoolDetailResponseBodyScalingGroup scalingGroup;

    /**
     * <p>The status of the node pool.</p>
     */
    @NameInMap("status")
    public DescribeClusterNodePoolDetailResponseBodyStatus status;

    /**
     * <p>Confidential computing cluster configuration.</p>
     */
    @NameInMap("tee_config")
    public DescribeClusterNodePoolDetailResponseBodyTeeConfig teeConfig;

    public static DescribeClusterNodePoolDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolDetailResponseBody self = new DescribeClusterNodePoolDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolDetailResponseBody setAutoMode(DescribeClusterNodePoolDetailResponseBodyAutoMode autoMode) {
        this.autoMode = autoMode;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyAutoMode getAutoMode() {
        return this.autoMode;
    }

    public DescribeClusterNodePoolDetailResponseBody setAutoScaling(DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    public DescribeClusterNodePoolDetailResponseBody setEfloNodeGroup(DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup efloNodeGroup) {
        this.efloNodeGroup = efloNodeGroup;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup getEfloNodeGroup() {
        return this.efloNodeGroup;
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

    public DescribeClusterNodePoolDetailResponseBody setNodeComponents(java.util.List<DescribeClusterNodePoolDetailResponseBodyNodeComponents> nodeComponents) {
        this.nodeComponents = nodeComponents;
        return this;
    }
    public java.util.List<DescribeClusterNodePoolDetailResponseBodyNodeComponents> getNodeComponents() {
        return this.nodeComponents;
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

    public static class DescribeClusterNodePoolDetailResponseBodyAutoMode extends TeaModel {
        /**
         * <p>Indicates whether smart managed mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static DescribeClusterNodePoolDetailResponseBodyAutoMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyAutoMode self = new DescribeClusterNodePoolDetailResponseBodyAutoMode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyAutoScaling extends TeaModel {
        /**
         * <p>The peak bandwidth of the EIP.</p>
         * <p>Valid values: [1,100]. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>The EIP billing method. Valid values:</p>
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
         * <li><p><code>true</code>: Enables automatic scaling for the node pool. When the cluster capacity cannot meet pod scheduling demands, ACK automatically scales node resources based on the configured minimum and maximum instance counts. Clusters running Kubernetes 1.24 or later enable instant elasticity by default. Clusters earlier than 1.24 enable node autoscaling by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: Disables automatic scaling. ACK maintains the node count at the desired number specified in the configuration.</p>
         * </li>
         * </ul>
         * <p>If set to false, other parameters under <code>auto_scaling</code> have no effect.</p>
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
         * <p>1</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The automatic scaling type, categorized by instance type. Valid values:</p>
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

    public static class DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i113790071760688002461</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>i128147721760688002463</p>
         */
        @NameInMap("group_id")
        public String groupId;

        public static DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup self = new DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyInterconnectConfig extends TeaModel {
        /**
         * <p>[Deprecated]</p>
         * <p>The network bandwidth for the enhanced edge node pool. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>[Deprecated]</p>
         * <p>The CCN instance ID bound to the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>[Deprecated]</p>
         * <p>The region of the CCN instance bound to the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>[Deprecated]</p>
         * <p>The CEN instance ID bound to the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>[Deprecated]</p>
         * <p>The subscription duration for the enhanced edge node pool. Unit: months.</p>
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
         * <p>Indicates whether Cloud Monitor is installed on ECS nodes. After installation, you can view monitoring data for created ECS instances in the Cloud Monitor console. We recommend enabling this feature. Valid values:</p>
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
         * <p>The node CPU management policy. Clusters running Kubernetes 1.12.6 or later support the following policies:</p>
         * <ul>
         * <li><p><code>static</code>: Enhances CPU affinity and exclusivity for pods with specific resource characteristics.</p>
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
         * <p>Custom node naming.</p>
         * <p>A node name consists of three parts: prefix + IP address substring + suffix:</p>
         * <ul>
         * <li><p>Both prefix and suffix can consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or digit.</p>
         * </li>
         * <li><p>The IP address substring length is the number of trailing digits taken from the node\&quot;s IP address. Valid values: 5–12.</p>
         * </li>
         * </ul>
         * <p>Example: If the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name is aliyun.com00055test.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com192.XX.YY.55test</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>Pre-custom data for the node pool, which runs before node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The container runtime. ACK supports the following runtimes:</p>
         * <ul>
         * <li><p>containerd: Recommended. Supported in all cluster versions.</p>
         * </li>
         * <li><p>Sandboxed-Container.runv: Sandboxed container runtime with enhanced isolation. Supported in clusters up to version 1.31.</p>
         * </li>
         * <li><p>docker: Deprecated. Supported in clusters up to version 1.22.</p>
         * </li>
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
         * <p>Custom data for the node pool, which runs after node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
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
         * <p>Indicates whether manual approval is required for node repair.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>The automatic repair policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxxx</p>
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

        public static DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy self = new DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy setApprovalRequired(Boolean approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }
        public Boolean getApprovalRequired() {
            return this.approvalRequired;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy setAutoRepairPolicyId(String autoRepairPolicyId) {
            this.autoRepairPolicyId = autoRepairPolicyId;
            return this;
        }
        public String getAutoRepairPolicyId() {
            return this.autoRepairPolicyId;
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
         * <p>The packages excluded during vulnerability fixes.</p>
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
         * <p>The vulnerability levels that can be automatically fixed, separated by commas.</p>
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

        public static DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy self = new DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy setExcludePackages(String excludePackages) {
            this.excludePackages = excludePackages;
            return this;
        }
        public String getExcludePackages() {
            return this.excludePackages;
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
         * <p>The maximum number of unavailable nodes. Valid values: [1,1000].</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of extra nodes. Choose either this parameter or surge_percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of extra nodes. Choose either this parameter or <code>surge</code>.</p>
         * <p>Number of extra nodes = surge percentage × number of nodes. For example, if you set the surge percentage to 50% and there are 6 nodes, the number of extra nodes is 50% × 6 = 3.</p>
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
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy autoRepairPolicy;

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
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy autoUpgradePolicy;

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
         * <p>Automatic CVE fix policy.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy autoVulFixPolicy;

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
        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig upgradeConfig;

        public static DescribeClusterNodePoolDetailResponseBodyManagement build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagement self = new DescribeClusterNodePoolDetailResponseBodyManagement();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoFaultDiagnosis(Boolean autoFaultDiagnosis) {
            this.autoFaultDiagnosis = autoFaultDiagnosis;
            return this;
        }
        public Boolean getAutoFaultDiagnosis() {
            return this.autoFaultDiagnosis;
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

    public static class DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig extends TeaModel {
        /**
         * <p>Custom configuration for the node component.</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, String> customConfig;

        public static DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig self = new DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig setCustomConfig(java.util.Map<String, String> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodeComponents extends TeaModel {
        /**
         * <p>Node component configuration.</p>
         */
        @NameInMap("config")
        public DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig config;

        /**
         * <p>The node component name.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The node component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.33.3-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        public static DescribeClusterNodePoolDetailResponseBodyNodeComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyNodeComponents self = new DescribeClusterNodePoolDetailResponseBodyNodeComponents();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyNodeComponents setConfig(DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig config) {
            this.config = config;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig getConfig() {
            return this.config;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodeComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodeComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig extends TeaModel {
        /**
         * <p>Hugepage configuration.</p>
         */
        @NameInMap("hugepage")
        public Hugepage hugepage;

        public static DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig self = new DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig setHugepage(Hugepage hugepage) {
            this.hugepage = hugepage;
            return this;
        }
        public Hugepage getHugepage() {
            return this.hugepage;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodeConfig extends TeaModel {
        /**
         * <p>Kubelet parameter settings.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        /**
         * <p>Node OS configuration.</p>
         */
        @NameInMap("node_os_config")
        public DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig nodeOsConfig;

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

        public DescribeClusterNodePoolDetailResponseBodyNodeConfig setNodeOsConfig(DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig nodeOsConfig) {
            this.nodeOsConfig = nodeOsConfig;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyNodeConfigNodeOsConfig getNodeOsConfig() {
            return this.nodeOsConfig;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodepoolInfo extends TeaModel {
        /**
         * <p>The time when the node pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-10T14:25:37.285530433+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>Indicates whether this is the default node pool. A cluster usually has only one default node pool. Valid values:</p>
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
         * <p>rg-acfmyvw3wjmb****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The node pool type.</p>
         * <ul>
         * <li><p><code>ess</code>: Standard node pool (supports managed features and automatic scaling).</p>
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
         * <p>The time when the node pool was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-15T15:39:45.41+08:00</p>
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
         * <p>The private node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The private node pool type, which determines how instance capacity is selected from private pools. Elastic provisioning or capacity reservation services generate private pool capacity after they take effect. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: Open mode. Automatically matches open-type private pool capacity. If no matching private pool capacity is available, uses public pool resources.</p>
         * </li>
         * <li><p><code>Target</code>: Target mode. Uses the specified private pool capacity. If the capacity is unavailable, instance creation fails.</p>
         * </li>
         * <li><p><code>None</code>: None mode. Does not use private pool capacity.</p>
         * </li>
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

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions extends TeaModel {
        /**
         * <p>The list of private pool IDs.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool strategy used when creating instances. Valid values:
         * PrivatePoolFirst: Private pool first.
         * PrivatePoolOnly: Private pool only.
         * None: Do not use resource pool strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("strategy")
        public String strategy;

        public static DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions self = new DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The spot instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The market price per instance.</p>
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
         * <p>Indicates whether auto-renewal is enabled for nodes. This parameter is valid only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
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
         * <p>The auto-renewal duration per cycle. Valid values:</p>
         * <ul>
         * <li><p>If PeriodUnit=Week: 1, 2, 3.</p>
         * </li>
         * <li><p>If PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>[Deprecated] Use the security_hardening_os parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>When <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>, indicates whether to automatically try creating pay-as-you-go instances if spot instances cannot be created due to price or inventory issues. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</p>
         * </li>
         * <li><p><code>false</code>: Disallows automatic creation of pay-as-you-go instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>Configuration for node data disks, including type and size.</p>
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
         * <p>Block device initialization configuration.</p>
         */
        @NameInMap("disk_init")
        public java.util.List<DiskInit> diskInit;

        /**
         * <p>The custom image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The OS image type.</p>
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
         * <p>The billing method for nodes in the node pool. Valid values:</p>
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
         * <p>ECS instance metadata access configuration.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>Instance attribute configuration.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>The list of node instance types.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for public network bandwidth of node public IP addresses.</p>
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
         * <p>The maximum outbound bandwidth for node public IP addresses. Unit: Mbps. Valid values: 1–100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The key pair name. Choose either this parameter or <code>login_password</code>. For managed node pools, only <code>key_pair</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Indicates whether ECS instances use a non-root user for logon.</p>
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
         * <p>The SSH logon password. Choose either this parameter or <code>key_pair</code>. The password must be 8–30 characters long and include at least three of the following: uppercase letters, lowercase letters, digits, and special characters.</p>
         * <p>For security reasons, the returned password is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for multi-zone scaling groups. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scales based on the order of virtual switches (VSwitchIds.N) you define. If ECS instances cannot be created in the zone of a higher-priority virtual switch, the system uses the next-priority virtual switch.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Tries to create instances starting with the lowest vCPU unit price. If multiple instance types or spot billing are configured, it prioritizes spot instances. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically try pay-as-you-go instances if spot instances cannot be created due to inventory or other issues.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when multiple instance types or spot instances are configured.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Distributes ECS instances evenly across all specified zones. If inventory shortages cause imbalance, you can call the RebalanceInstances API to rebalance resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
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
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: [0,1000]. If the number of pay-as-you-go instances falls below this value, the system prioritizes creating pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among instances exceeding the minimum pay-as-you-go count (<code>on_demand_base_capacity</code>). Valid values: [0,100].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration for nodes. This parameter is required and valid only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><p>If <code>period_unit=Week</code>, valid values for <code>period</code> are {1, 2, 3, 4}.</p>
         * </li>
         * <li><p>If <code>period_unit=Month</code>, valid values for <code>period</code> are {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60}.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle for nodes. Specify this parameter when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>Private node pool configuration.</p>
         */
        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>[Deprecated] Use ram_role_name instead.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-021dc54f-929b-437a-8ae0-34c24d3e****</p>
         */
        @NameInMap("ram_policy")
        public String ramPolicy;

        /**
         * <p>The Worker RAM role name.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-4a4fa089-80c1-48a5-b3c6-9349311f****</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>If RDS instances are specified, the ECS nodes of the cluster are automatically added to the RDS whitelist.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and strategy used when creating instances.</p>
         */
        @NameInMap("resource_pool_options")
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-2zeieod8giqmov7z****</p>
         */
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        /**
         * <p>The scaling group mode. Valid values:</p>
         * <ul>
         * <li><p><code>release</code>: Standard mode. Scales by creating or releasing ECS instances based on resource usage.</p>
         * </li>
         * <li><p><code>recycle</code>: Fast mode. Scales by creating, stopping, or starting instances to speed up future scaling (stopped instances incur no compute charges, only storage fees, except for local-disk instances).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The security group ID for the node pool. If multiple security groups are bound, this value is the first ID in <code>security_group_ids</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze60ockeekspl3d****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The list of security group IDs for the node pool.</p>
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
         * <p>Indicates whether MLPS 2.0 security hardening is enabled. You can enable this feature only when using Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 images. Alibaba Cloud provides baseline check standards and scanning tools for MLPS 2.0 Level 3 compliance for these images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>The number of available instance types. The scaling group creates spot instances evenly across the lowest-cost instance types. Valid values: [1,10].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Indicates whether to replenish spot instances. When enabled, if the system notifies that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace it. Valid values:</p>
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
         * <p>Spot instance price range configuration.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The spot instance type. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: On-demand instance.</p>
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
         * <li><p>true: Enabled. When facing sudden read/write pressure from variable workloads, the disk temporarily boosts performance until the workload stabilizes.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>Multiple system disk types. If the higher-priority disk type is unavailable, the system tries the next priority disk type to create the system disk.</p>
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
         * <li><p><code>cloud_essd</code>: ESSD.</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL.</p>
         * </li>
         * <li><p><code>cloud_essd_entry</code>: ESSD Entry.</p>
         * </li>
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
         * <p>Indicates whether the system disk is encrypted. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Encrypted.</p>
         * </li>
         * <li><p><code>false</code>: Not encrypted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The KMS key ID used for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The system disk performance level. This parameter applies only to ESSD disks. The performance level depends on the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * <ul>
         * <li><p>PL0: Moderate I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL1: Moderate I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL2: High I/O performance with stable read/write latency.</p>
         * </li>
         * <li><p>PL3: Extremely high I/O performance with very stable read/write latency.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for the system disk.</p>
         * <p>Valid values: 0 to min{50,000, 1000 × capacity − baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system disk size for nodes. Unit: GiB.</p>
         * <p>Valid values: [20,2048].</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The system disk snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp11g8z59rawcud9****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        /**
         * <p>ECS instance tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The list of virtual switch IDs.</p>
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

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDiskInit(java.util.List<DiskInit> diskInit) {
            this.diskInit = diskInit;
            return this;
        }
        public java.util.List<DiskInit> getDiskInit() {
            return this.diskInit;
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

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInstanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
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

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setResourcePoolOptions(DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions resourcePoolOptions) {
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
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

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
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

    public static class DescribeClusterNodePoolDetailResponseBodyStatusConditions extends TeaModel {
        /**
         * <p>The last time the condition changed.</p>
         * 
         * <strong>example:</strong>
         * <p>20**-**-30T10:39:00+08:00</p>
         */
        @NameInMap("last_transition_time")
        public String lastTransitionTime;

        /**
         * <p>Detailed information.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoUpgradeDisabled</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The reason for the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>UpgradeDisabled</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The condition status.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The condition type.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageUpgradeReady</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeClusterNodePoolDetailResponseBodyStatusConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyStatusConditions self = new DescribeClusterNodePoolDetailResponseBodyStatusConditions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyStatusConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatusConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatusConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatusConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatusConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyStatus extends TeaModel {
        /**
         * <p>The current conditions of the node pool, representing its status across different dimensions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyStatusConditions> conditions;

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
         * <p>The number of nodes being created.</p>
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
         * <p>The number of nodes being removed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("removing_nodes")
        public Long removingNodes;

        /**
         * <p>The number of working nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("serving_nodes")
        public Long servingNodes;

        /**
         * <p>The node pool state. Valid values:</p>
         * <ul>
         * <li><p><code>active</code>: Active.</p>
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

        public DescribeClusterNodePoolDetailResponseBodyStatus setConditions(java.util.List<DescribeClusterNodePoolDetailResponseBodyStatusConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyStatusConditions> getConditions() {
            return this.conditions;
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
