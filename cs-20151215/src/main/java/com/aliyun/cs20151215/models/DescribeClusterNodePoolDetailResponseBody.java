// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolDetailResponseBody extends TeaModel {
    /**
     * <p>The smart hosting configurations.</p>
     */
    @NameInMap("auto_mode")
    public DescribeClusterNodePoolDetailResponseBodyAutoMode autoMode;

    /**
     * <p>The configurations of the node pool that is configured for automatic scaling.</p>
     */
    @NameInMap("auto_scaling")
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling;

    @NameInMap("eflo_node_group")
    public DescribeClusterNodePoolDetailResponseBodyEfloNodeGroup efloNodeGroup;

    /**
     * <p>Indicates whether the pod network uses the host network mode.</p>
     * <ul>
     * <li><p><code>true</code>: host network. Pods directly use the host\&quot;s network stack and share IP addresses and ports with the host.</p>
     * </li>
     * <li><p><code>false</code>: container network. Pods have an independent network stack and do not use host network ports.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("host_network")
    public Boolean hostNetwork;

    /**
     * <p>[This parameter is deprecated]</p>
     * <p>The network configurations of the edge node pool. This parameter is valid only for edge node pools.</p>
     */
    @NameInMap("interconnect_config")
    public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter is valid only for <code>edge</code> node pools. Valid values:</p>
     * <ul>
     * <li><p><code>basic</code>: public network. The nodes in the node pool interact with cloud nodes over the Internet. Applications in the node pool cannot directly access the VPC in the cloud.</p>
     * </li>
     * <li><p><code>private</code>: dedicated network. The nodes in the node pool connect to the cloud network through leased lines, VPNs, or CEN. This provides higher communication quality between the cloud and the edge and offers more effective security.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>Indicates whether nodes in the edge node pool have Layer 3 network connectivity.</p>
     * <ul>
     * <li><p><code>true</code>: connected. All nodes in this node pool have Layer 3 network connectivity.</p>
     * </li>
     * <li><p><code>false</code>: not connected. All hosts in this node pool do not have Layer 3 network connectivity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("intranet")
    public Boolean intranet;

    /**
     * <p>The cluster-related configurations.</p>
     */
    @NameInMap("kubernetes_config")
    public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations of the managed node pool.</p>
     */
    @NameInMap("management")
    public DescribeClusterNodePoolDetailResponseBodyManagement management;

    /**
     * <p>[This parameter is deprecated]</p>
     * <p>The maximum number of nodes that the edge node pool can contain.</p>
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
    public java.util.List<DescribeClusterNodePoolDetailResponseBodyNodeComponents> nodeComponents;

    /**
     * <p>The node configurations.</p>
     */
    @NameInMap("node_config")
    public DescribeClusterNodePoolDetailResponseBodyNodeConfig nodeConfig;

    /**
     * <p>The node pool configurations.</p>
     */
    @NameInMap("nodepool_info")
    public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group for the node pool.</p>
     */
    @NameInMap("scaling_group")
    public DescribeClusterNodePoolDetailResponseBodyScalingGroup scalingGroup;

    /**
     * <p>The status of the node pool.</p>
     */
    @NameInMap("status")
    public DescribeClusterNodePoolDetailResponseBodyStatus status;

    /**
     * <p>The configurations of the confidential computing cluster.</p>
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
         * <p>Indicates whether to enable the feature.</p>
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
         * <p>The peak EIP bandwidth.</p>
         * <p>Valid values: 1 to 100. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
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
        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        /**
         * <p>Indicates whether to enable automatic scaling. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables automatic scaling for the node pool. If the resources of the cluster cannot meet the scheduling requirements of pods, ACK automatically scales out or in nodes based on the configured minimum and maximum numbers of instances. For clusters of Kubernetes 1.24 or later, node elastic scaling is enabled by default. For clusters of a Kubernetes version earlier than 1.24, node autoscaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: disables automatic scaling. ACK adjusts the number of nodes in the node pool to the expected number of nodes. The number of nodes is always the same as the expected number of nodes.</p>
         * </li>
         * </ul>
         * <p>If this parameter is set to false, other parameters in auto_scaling do not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Indicates whether to associate an EIP with the node pool. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Associates an EIP with the node pool.</p>
         * </li>
         * <li><p><code>false</code>: Does not associate an EIP with the node pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        /**
         * <p>The maximum number of instances that can be created in the node pool. This value does not include the existing instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of instances that can be created in the node pool. This value does not include the existing instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The type of automatic scaling that is configured for the node pool. This parameter is specified based on the instance type for automatic scaling. Valid values:</p>
         * <ul>
         * <li><p><code>cpu</code>: regular instances.</p>
         * </li>
         * <li><p><code>gpu</code>: GPU-accelerated instances.</p>
         * </li>
         * <li><p><code>gpushare</code>: shared GPU-accelerated instances.</p>
         * </li>
         * <li><p><code>spot</code>: spot instances.</p>
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
         * <p>[This parameter is deprecated]</p>
         * <p>The network bandwidth of the enhanced edge node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The ID of the CCN instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-qm5i0i0q9yi*******</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The region where the CCN instance that is associated with the enhanced edge node pool resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The ID of the CEN instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ey9k9nfhz0f*******</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The subscription duration of the enhanced edge node pool. Unit: months.</p>
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
         * <p>Indicates whether to install Cloud Monitor on the ECS nodes. After you install Cloud Monitor, you can view the monitoring information of the created ECS instances in the Cloud Monitor console. We recommend that you enable this feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Installs Cloud Monitor on the ECS nodes.</p>
         * </li>
         * <li><p><code>false</code>: Does not install Cloud Monitor on the ECS nodes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy for the nodes. The following policies are supported for clusters of Kubernetes 1.12.6 and later:</p>
         * <ul>
         * <li><p><code>static</code>: Allows pods with specific resource characteristics on a node to have enhanced CPU affinity and exclusivity.</p>
         * </li>
         * <li><p><code>none</code>: Enables the default CPU affinity scheme.</p>
         * </li>
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
         * <p>A node name consists of a prefix, the IP address of the node, and a suffix:</p>
         * <ul>
         * <li><p>The prefix and suffix can consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or a digit.</p>
         * </li>
         * <li><p>The IP address segment length indicates the number of digits to be truncated from the end of the node IP address. Valid values: 5 to 12.</p>
         * </li>
         * </ul>
         * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP address segment length is 5, and the suffix is test, the node name is aliyun.com00055test.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com192.XX.YY.55test</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The pre-custom data of the node pool. The script is run before the node is initialized. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The name of the container runtime. ACK supports the following container runtimes.</p>
         * <ul>
         * <li><p>containerd: recommended. It is supported by all cluster versions.</p>
         * </li>
         * <li><p>Sandboxed-Container.runv: a sandboxed container that provides higher isolation. It is supported by clusters of Kubernetes 1.31 and earlier.</p>
         * </li>
         * <li><p>docker: no longer maintained. It is supported by clusters of Kubernetes 1.22 and earlier.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The version of the container runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.38</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The node taints. Taints work with tolerations to prevent pods from being scheduled to unsuitable nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Indicates whether the scaled-out nodes are unschedulable.</p>
         * <ul>
         * <li><p>true: The nodes are unschedulable.</p>
         * </li>
         * <li><p>false: The nodes are schedulable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>The custom data of the node pool. The script is run after the node is initialized. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
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
         * <p>The ID of the auto repair policy</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>Indicates whether to allow node restart. This parameter takes effect only if auto_repair is set to true.</p>
         * <ul>
         * <li><p><code>true</code>: Nodes can be restarted.</p>
         * </li>
         * <li><p><code>false</code>: Nodes cannot be restarted.</p>
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
         * <p>Indicates whether to allow automatic kubelet upgrades. This parameter takes effect only if auto_upgrade is set to true. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Automatic kubelet upgrades are allowed.</p>
         * </li>
         * <li><p><code>false</code>: Automatic kubelet upgrades are not allowed.</p>
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
         * <p>The packages that should be excluded during CVE fixing.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Indicates whether to allow node restart. This parameter takes effect only if auto_vul_fix is set to true. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Nodes can be restarted.</p>
         * </li>
         * <li><p><code>false</code>: Nodes cannot be restarted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The levels of CVEs that are allowed to be automatically fixed. The levels are separated by commas.</p>
         * <ul>
         * <li><p><code>asap</code>: high</p>
         * </li>
         * <li><p><code>later</code>: medium</p>
         * </li>
         * <li><p><code>nntf</code>: low</p>
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
         * <p>Indicates whether to enable automatic upgrades. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Automatic upgrades are enabled.</p>
         * </li>
         * <li><p><code>false</code>: Automatic upgrades are disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of unavailable nodes. Valid values: 1 to 1000.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of extra nodes. You can specify only one of surge and surge_percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of extra nodes. You can specify only one of surge and surge_percentage.</p>
         * <p>The number of extra nodes = Percentage of extra nodes × Number of nodes. For example, if you set the percentage of extra nodes to 50% and the number of existing nodes is 6, the number of extra nodes is 3 (50% × 6).</p>
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
         * <p>Indicates whether to enable auto repair. This parameter takes effect only if enable is set to true.</p>
         * <ul>
         * <li><p><code>true</code>: Auto repair is enabled.</p>
         * </li>
         * <li><p><code>false</code>: Auto repair is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The policy for automatic node repair.</p>
         */
        @NameInMap("auto_repair_policy")
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Indicates whether to enable automatic node upgrades. This parameter takes effect only if enable is set to true.</p>
         * <ul>
         * <li><p><code>true</code>: Automatic upgrades are enabled.</p>
         * </li>
         * <li><p><code>false</code>: Automatic upgrades are disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The policy for automatic upgrades.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Indicates whether to automatically fix CVEs. This parameter takes effect only if enable is set to true.</p>
         * <ul>
         * <li><p><code>true</code>: CVEs are automatically fixed.</p>
         * </li>
         * <li><p><code>false</code>: CVEs are not automatically fixed.</p>
         * </li>
         * </ul>
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
        public DescribeClusterNodePoolDetailResponseBodyManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Indicates whether to enable the managed node pool feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables the managed node pool feature.</p>
         * </li>
         * <li><p><code>false</code>: Disables the managed node pool feature. Other parameters in this section take effect only if this parameter is set to true.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The automatic upgrade configurations. This parameter takes effect only if enable is set to true.</p>
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
         * <p>The custom configurations of the node component.</p>
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
         * <p>The configurations of the node component.</p>
         */
        @NameInMap("config")
        public DescribeClusterNodePoolDetailResponseBodyNodeComponentsConfig config;

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
         * <p>The Hugepage configurations.</p>
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
         * <p>The Kubelet parameter settings.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        /**
         * <p>The node OS configurations.</p>
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
         * <p>Indicates whether the node pool is the default node pool. A cluster usually has only one default node pool. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: the default node pool.</p>
         * </li>
         * <li><p><code>false</code>: not the default node pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_default")
        public Boolean isDefault;

        /**
         * <p>The name of the node pool.</p>
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
         * <p>The type of the node pool.</p>
         * <ul>
         * <li><p><code>ess</code>: a regular node pool. It includes the features of managed node pools and automatic scaling.</p>
         * </li>
         * <li><p><code>edge</code>: an edge node pool.</p>
         * </li>
         * <li><p><code>lingjun</code>: a Lingjun node pool.</p>
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
         * <p>The type of the private node pool. This parameter specifies the capacity option for the private pool that is used to start instances. After an elastic assurance service or a capacity reservation service takes effect, a private pool is generated. You can select the private pool to start instances. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: The system automatically matches the capacity of an open private pool. If no matching private pool is found, the system uses public resources.</p>
         * </li>
         * <li><p><code>Target</code>: The system uses the capacity of a specified private pool to start the instance. If the capacity of the specified private pool is unavailable, the instance fails to start.</p>
         * </li>
         * <li><p><code>None</code>: The system does not use the capacity of a private pool.</p>
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
         * <p>The resource pool policy used when creating instances. Valid values: PrivatePoolFirst: The private pool is used first. PrivatePoolOnly: Only the private pool is used. None: No resource pool policy is used.</p>
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
         * <p>The price of a single instance.</p>
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
         * <p>Indicates whether to enable auto-renewal for the nodes. This parameter takes effect only if instance_charge_type is set to PrePaid. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Auto-renewal is enabled.</p>
         * </li>
         * <li><p><code>false</code>: Auto-renewal is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The duration of each auto-renewal. Valid values:</p>
         * <ul>
         * <li><p>If PeriodUnit is set to Week: 1, 2, and 3.</p>
         * </li>
         * <li><p>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>[This parameter is deprecated] Use the security_hardening_os parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>If multi_az_policy is set to COST_OPTIMIZED, this parameter specifies whether to allow the system to automatically create on-demand instances to meet the required number of ECS instances when it is not possible to create a sufficient number of spot instances due to price or stock issues. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows the system to automatically create on-demand instances to meet the required number of ECS instances.</p>
         * </li>
         * <li><p><code>false</code>: Does not allow the system to automatically create on-demand instances to meet the required number of ECS instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The combination of the configurations, such as the type and size, of the data disks of the nodes.</p>
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
         * <p>The configurations for block device initialization.</p>
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
         * <p>The billing method of the nodes in the node pool. Valid values:</p>
         * <ul>
         * <li><p><code>PrePaid</code>: subscription.</p>
         * </li>
         * <li><p><code>PostPaid</code>: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The configurations for accessing the metadata of ECS instances.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance attribute configurations.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>The list of node instance types.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for the public IP address of the nodes.</p>
         * <ul>
         * <li><p>PayByBandwidth: pay-by-bandwidth.</p>
         * </li>
         * <li><p>PayByTraffic: pay-by-traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound public bandwidth of the nodes. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair. You must specify either this parameter or login_password. When the node pool is a managed node pool, only key_pair is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-nodepool</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Indicates whether to log on to the created ECS instances as a non-root user.</p>
         * <ul>
         * <li><p>true: Logs on as a non-root user (ecs-user).</p>
         * </li>
         * <li><p>false: Logs on as the root user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The SSH logon password. You must specify either this parameter or key_pair. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * <p>For security reasons, the password is encrypted in the query result.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for the ECS instances in the multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scales instances based on the vSwitches that you define (VSwitchIds.N). If the ECS instances cannot be created in the zone of the vSwitch with a higher priority, the system automatically uses the vSwitch with the next priority to create the instances.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Attempts to create instances at the lowest vCPU unit price. If multiple instance types are specified for the scaling configuration and the preemption policy is configured, the system preferentially creates the corresponding spot instances. You can also use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically try to create on-demand instances when spot instances cannot be created due to reasons such as stock shortages.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when multiple instance types are specified or spot instances are used for the scaling configuration.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Evenly distributes ECS instances across the specified zones of the scaling group. If the distribution of ECS instances becomes unbalanced between zones due to stock shortages, you can call the API RebalanceInstances operation to balance the resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a> .</p>
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
         * <p>The minimum number of on-demand instances that the scaling group must contain. Valid values: 0 to 1000. If the number of on-demand instances is less than this value, on-demand instances are preferentially created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of on-demand instances among the instances that exceed the minimum number of on-demand instances (on_demand_base_capacity). Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the nodes. This parameter is required and takes effect only if instance_charge_type is set to PrePaid.</p>
         * <ul>
         * <li><p>If period_unit is set to Week, the valid values of period are 1, 2, 3, and 4.</p>
         * </li>
         * <li><p>If period_unit is set to Month, the valid values of period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes. This parameter is required if instance_charge_type is set to PrePaid.</p>
         * <ul>
         * <li><p><code>Month</code>: The billing cycle is measured in months.</p>
         * </li>
         * <li><p><code>Week</code>: The billing cycle is measured in weeks.</p>
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
         * <p>The private node pool configurations.</p>
         */
        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>[This parameter is deprecated] Use ram_role_name instead.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-021dc54f-929b-437a-8ae0-34c24d3e****</p>
         */
        @NameInMap("ram_policy")
        public String ramPolicy;

        /**
         * <p>The name of the worker RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-4a4fa089-80c1-48a5-b3c6-9349311f****</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>If you specify a list of RDS instances, the ECS nodes of the cluster are automatically added to the RDS instance whitelist.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and resource pool policy used when creating instances.</p>
         */
        @NameInMap("resource_pool_options")
        public DescribeClusterNodePoolDetailResponseBodyScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-2zeieod8giqmov7z****</p>
         */
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        /**
         * <p>The scaling group mode. Valid values:</p>
         * <ul>
         * <li><p><code>release</code>: standard mode. Instances are created and released based on the resource usage.</p>
         * </li>
         * <li><p><code>recycle</code>: fast mode. Instances are created, stopped, and started to accelerate scaling. Compute resources are not billed when instances are stopped, but storage resources are. This does not apply to instances with local disks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The security group ID of the node pool. If the node pool is associated with multiple security groups, this is the first value in security_group_ids.</p>
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
         * <p>Indicates whether to enable classified protection compliance. You can enable classified protection compliance for nodes only when you select Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 as the OS image. Alibaba Cloud provides baseline check standards and scanning programs for MLPS 2.0 Level 3-compliant Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 images.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>The number of available instance types. The scaling group creates spot instances of multiple types that have the lowest costs in a balanced manner. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Indicates whether to enable the feature of supplementing spot instances. If this feature is enabled, the scaling group attempts to create a new instance to replace a spot instance that is reclaimed. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables the feature of supplementing spot instances.</p>
         * </li>
         * <li><p><code>false</code>: Disables the feature of supplementing spot instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The configurations of the price range for spot instances.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The preemption policy for the spot instances. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: The instances are not spot instances.</p>
         * </li>
         * <li><p>SpotWithPriceLimit: Sets the maximum price for a spot instance.</p>
         * </li>
         * <li><p>SpotAsPriceGo: The system automatically places bids based on the market price.</p>
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
         * <p>Indicates whether to enable performance burst for the system disk of the nodes. Valid values:</p>
         * <ul>
         * <li><p>true: Enables performance burst. If you enable this feature, the cloud disk can temporarily improve its performance to handle sudden data read and write pressure when the business is unstable.</p>
         * </li>
         * <li><p>false: Disables performance burst.</p>
         * </li>
         * </ul>
         * <p>This parameter can be set only when system_disk_category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The types of system disks. When a disk of a high-priority type is not available, the system automatically tries the next-priority disk type to create the system disk.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The type of the system disk of the nodes. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: ultra disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: Enhanced SSD (ESSD).</p>
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
         * <p>The encryption algorithm that is used for the system disk. Valid value: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Indicates whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Encrypts the system disk.</p>
         * </li>
         * <li><p><code>false</code>: Does not encrypt the system disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("system_disk_encrypted")
        public Boolean systemDiskEncrypted;

        /**
         * <p>The ID of the KMS key that is used to encrypt the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("system_disk_kms_key_id")
        public String systemDiskKmsKeyId;

        /**
         * <p>The performance level of the system disk of the nodes. This parameter is valid only for ESSDs. The disk performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <ul>
         * <li><p>PL0: The I/O performance is moderate and the read/write latency is stable.</p>
         * </li>
         * <li><p>PL1: The I/O performance is moderate and the read/write latency is stable.</p>
         * </li>
         * <li><p>PL2: The I/O performance is high and the read/write latency is stable.</p>
         * </li>
         * <li><p>PL3: The I/O performance is very high and the read/write latency is very stable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The pre-configured read and write IOPS of the system disk of the nodes.</p>
         * <p>Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter can be set only when system_disk_category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk of the nodes. Unit: GiB.</p>
         * <p>Valid values: 20 to 2048.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The system disk snapshot policy</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp11g8z59rawcud9****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        /**
         * <p>The ECS instance tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The list of vSwitch IDs.</p>
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
         * <p>The time of the last status transition.</p>
         * 
         * <strong>example:</strong>
         * <p>20**-**-30T10:39:00+08:00</p>
         */
        @NameInMap("last_transition_time")
        public String lastTransitionTime;

        /**
         * <p>The detailed information.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoUpgradeDisabled</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The reason.</p>
         * 
         * <strong>example:</strong>
         * <p>UpgradeDisabled</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type.</p>
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
         * <p>The current status of the node pool. This parameter indicates the status of the node pool from different dimensions.</p>
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
         * <p>The number of nodes that are in service.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("serving_nodes")
        public Long servingNodes;

        /**
         * <p>The state of the node pool. Valid values:</p>
         * <ul>
         * <li><p><code>active</code>: The node pool is active.</p>
         * </li>
         * <li><p><code>scaling</code>: The node pool is being scaled.</p>
         * </li>
         * <li><p><code>removing</code>: Nodes are being removed.</p>
         * </li>
         * <li><p><code>deleting</code>: The node pool is being deleted.</p>
         * </li>
         * <li><p><code>updating</code>: The node pool is being updated.</p>
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
         * <p>Indicates whether to enable the confidential computing cluster. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables the confidential computing cluster.</p>
         * </li>
         * <li><p><code>false</code>: Disables the confidential computing cluster.</p>
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
