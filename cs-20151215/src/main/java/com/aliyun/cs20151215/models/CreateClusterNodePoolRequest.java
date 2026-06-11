// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The intelligent managed node pool configurations.</p>
     */
    @NameInMap("auto_mode")
    public CreateClusterNodePoolRequestAutoMode autoMode;

    /**
     * <p>The auto scaling configurations.</p>
     */
    @NameInMap("auto_scaling")
    public CreateClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p>[This parameter is deprecated] Use desired_size instead.</p>
     * <p>The number of nodes in the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p>The Lingjun node pool configurations.</p>
     */
    @NameInMap("eflo_node_group")
    public CreateClusterNodePoolRequestEfloNodeGroup efloNodeGroup;

    /**
     * <p>Specifies whether to use the host network for the pod network.</p>
     * <ul>
     * <li><p><code>true</code>: host network. Pods directly use the network stack of the host and share the IP address and ports with the host.</p>
     * </li>
     * <li><p><code>false</code>: container network. Pods have an independent network stack and do not occupy host network ports.</p>
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
     * <p>The configurations of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public CreateClusterNodePoolRequestInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter takes effect only for node pools of the \<code>edge\\</code> type. Valid values:</p>
     * <ul>
     * <li><p><code>basic</code>: public network. Nodes in the node pool interact with cloud nodes over the Internet. Applications in the node pool cannot directly access the VPC in the cloud.</p>
     * </li>
     * <li><p><code>private</code>: private network. Nodes in the node pool connect to the cloud over a leased line, VPN, or CEN to achieve higher communication quality and better security.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>Specifies whether nodes in the edge node pool can communicate with each other at Layer 3.</p>
     * <ul>
     * <li><p><code>true</code>: All nodes in the node pool can communicate with each other at Layer 3.</p>
     * </li>
     * <li><p><code>false</code>: All hosts in the node pool cannot communicate with each other at Layer 3.</p>
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
    public CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations of the managed node pool feature.</p>
     */
    @NameInMap("management")
    public CreateClusterNodePoolRequestManagement management;

    /**
     * <p>[This parameter is deprecated]</p>
     * <p>The maximum number of nodes that the edge node pool can contain.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("max_nodes")
    @Deprecated
    public Long maxNodes;

    /**
     * <p>A list of node components.</p>
     */
    @NameInMap("node_components")
    public java.util.List<CreateClusterNodePoolRequestNodeComponents> nodeComponents;

    /**
     * <p>The node configurations.</p>
     */
    @NameInMap("node_config")
    public CreateClusterNodePoolRequestNodeConfig nodeConfig;

    /**
     * <p>The node pool configurations.</p>
     */
    @NameInMap("nodepool_info")
    public CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>The configurations of the scaling group for the node pool.</p>
     */
    @NameInMap("scaling_group")
    public CreateClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The configurations of the confidential computing cluster.</p>
     */
    @NameInMap("tee_config")
    public CreateClusterNodePoolRequestTeeConfig teeConfig;

    public static CreateClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolRequest self = new CreateClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolRequest setAutoMode(CreateClusterNodePoolRequestAutoMode autoMode) {
        this.autoMode = autoMode;
        return this;
    }
    public CreateClusterNodePoolRequestAutoMode getAutoMode() {
        return this.autoMode;
    }

    public CreateClusterNodePoolRequest setAutoScaling(CreateClusterNodePoolRequestAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public CreateClusterNodePoolRequestAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    @Deprecated
    public CreateClusterNodePoolRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public CreateClusterNodePoolRequest setEfloNodeGroup(CreateClusterNodePoolRequestEfloNodeGroup efloNodeGroup) {
        this.efloNodeGroup = efloNodeGroup;
        return this;
    }
    public CreateClusterNodePoolRequestEfloNodeGroup getEfloNodeGroup() {
        return this.efloNodeGroup;
    }

    public CreateClusterNodePoolRequest setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    @Deprecated
    public CreateClusterNodePoolRequest setInterconnectConfig(CreateClusterNodePoolRequestInterconnectConfig interconnectConfig) {
        this.interconnectConfig = interconnectConfig;
        return this;
    }
    public CreateClusterNodePoolRequestInterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    public CreateClusterNodePoolRequest setInterconnectMode(String interconnectMode) {
        this.interconnectMode = interconnectMode;
        return this;
    }
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    public CreateClusterNodePoolRequest setIntranet(Boolean intranet) {
        this.intranet = intranet;
        return this;
    }
    public Boolean getIntranet() {
        return this.intranet;
    }

    public CreateClusterNodePoolRequest setKubernetesConfig(CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public CreateClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public CreateClusterNodePoolRequest setManagement(CreateClusterNodePoolRequestManagement management) {
        this.management = management;
        return this;
    }
    public CreateClusterNodePoolRequestManagement getManagement() {
        return this.management;
    }

    @Deprecated
    public CreateClusterNodePoolRequest setMaxNodes(Long maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public CreateClusterNodePoolRequest setNodeComponents(java.util.List<CreateClusterNodePoolRequestNodeComponents> nodeComponents) {
        this.nodeComponents = nodeComponents;
        return this;
    }
    public java.util.List<CreateClusterNodePoolRequestNodeComponents> getNodeComponents() {
        return this.nodeComponents;
    }

    public CreateClusterNodePoolRequest setNodeConfig(CreateClusterNodePoolRequestNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public CreateClusterNodePoolRequestNodeConfig getNodeConfig() {
        return this.nodeConfig;
    }

    public CreateClusterNodePoolRequest setNodepoolInfo(CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public CreateClusterNodePoolRequestNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public CreateClusterNodePoolRequest setScalingGroup(CreateClusterNodePoolRequestScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public CreateClusterNodePoolRequestScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public CreateClusterNodePoolRequest setTeeConfig(CreateClusterNodePoolRequestTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public CreateClusterNodePoolRequestTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static class CreateClusterNodePoolRequestAutoMode extends TeaModel {
        /**
         * <p>Specifies whether to enable the intelligent managed mode.
         * Valid values:</p>
         * <ul>
         * <li><p>true: Enables the intelligent managed mode. You can enable this mode only when the intelligent managed mode is enabled for the cluster.</p>
         * </li>
         * <li><p>false: Disables the intelligent managed mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static CreateClusterNodePoolRequestAutoMode build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestAutoMode self = new CreateClusterNodePoolRequestAutoMode();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestAutoMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateClusterNodePoolRequestAutoScaling extends TeaModel {
        /**
         * <p>[This parameter is deprecated] Use \<code>internet_charge_type\\</code> and \<code>internet_max_bandwidth_out\\</code> instead.</p>
         * <p>The peak bandwidth of the EIP. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("eip_bandwidth")
        @Deprecated
        public Long eipBandwidth;

        /**
         * <p>[This parameter is deprecated] Use \<code>internet_charge_type\\</code> and \<code>internet_max_bandwidth_out\\</code> instead.</p>
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><p><code>PayByBandwidth</code>: pay-by-bandwidth.</p>
         * </li>
         * <li><p><code>PayByTraffic</code>: pay-by-traffic.</p>
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
         * <p>Specifies whether to enable auto scaling. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables auto scaling for the node pool. If the resources planned for the cluster cannot meet the scheduling requirements of pods, Container Service for Kubernetes (ACK) automatically scales out or scales in nodes based on the configured minimum and maximum numbers of instances. For clusters of Kubernetes 1.24 or later, instant scaling is enabled by default. For clusters of a Kubernetes version earlier than 1.24, node autoscaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto scaling. ACK adjusts the number of nodes in the node pool based on the value of \<code>desired_size\\</code> to maintain a specific number of nodes.</p>
         * </li>
         * </ul>
         * <p>If you set this parameter to false, other parameters in \<code>auto_scaling\\</code> do not take effect.</p>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>[This parameter is deprecated] This parameter is deprecated. Use \<code>internet_charge_type\\</code> and \<code>internet_max_bandwidth_out\\</code> instead.</p>
         * <p>Specifies whether to associate an EIP with the node. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: associates an EIP with the node.</p>
         * </li>
         * <li><p><code>false</code>: does not associate an EIP with the node.</p>
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
         * <p>The maximum number of instances that can be created in the node pool. This does not include existing instances. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>.</p>
         * <p>The value must be in the range of [\<code>min_instances\\</code>, 2000]. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("max_instances")
        public Long maxInstances;

        /**
         * <p>The minimum number of instances that can be created in the node pool. This does not include existing instances. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>.</p>
         * <p>The value must be in the range of [0, \<code>max_instances\\</code>]. Default value: 0.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the minimum number of instances is not 0, the specified number of ECS instances are automatically created after the scaling group is created.</p>
         * </li>
         * <li><p>We recommend that you set the maximum number of instances to a value that is not smaller than the current number of nodes in the node pool. Otherwise, nodes in the node pool are scaled in after auto scaling is enabled.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The type of instances that are automatically scaled. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>cpu</code>: regular instance.</p>
         * </li>
         * <li><p><code>gpu</code>: GPU-accelerated instance.</p>
         * </li>
         * <li><p><code>gpushare</code>: shared GPU-accelerated instance.</p>
         * </li>
         * <li><p><code>spot</code>: spot instance.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>cpu</code>.</p>
         * <blockquote>
         * <p>Notice: You cannot change the value of this parameter after the node pool is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateClusterNodePoolRequestAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestAutoScaling self = new CreateClusterNodePoolRequestAutoScaling();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public CreateClusterNodePoolRequestAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        @Deprecated
        public CreateClusterNodePoolRequestAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public CreateClusterNodePoolRequestAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
        public CreateClusterNodePoolRequestAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public CreateClusterNodePoolRequestAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public CreateClusterNodePoolRequestAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public CreateClusterNodePoolRequestAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateClusterNodePoolRequestEfloNodeGroup extends TeaModel {
        /**
         * <p>The ID of the Lingjun cluster that you want to associate with the Lingjun node pool when you create the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>i1169130516633730****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The ID of the Lingjun group in the Lingjun cluster that you want to associate with the Lingjun node pool when you create the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-ec3c96ff0aa****</p>
         */
        @NameInMap("group_id")
        public String groupId;

        public static CreateClusterNodePoolRequestEfloNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestEfloNodeGroup self = new CreateClusterNodePoolRequestEfloNodeGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestEfloNodeGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateClusterNodePoolRequestEfloNodeGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class CreateClusterNodePoolRequestInterconnectConfig extends TeaModel {
        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The network bandwidth of the enhanced edge node pool. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The ID of the CCN instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The region of the CCN instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The ID of the CEN instance that is associated with the enhanced edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p>[This parameter is deprecated]</p>
         * <p>The subscription duration of the enhanced edge node pool. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("improved_period")
        public String improvedPeriod;

        public static CreateClusterNodePoolRequestInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestInterconnectConfig self = new CreateClusterNodePoolRequestInterconnectConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public CreateClusterNodePoolRequestInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class CreateClusterNodePoolRequestKubernetesConfig extends TeaModel {
        /**
         * <p>Specifies whether to install Cloud Monitor on the ECS nodes. After Cloud Monitor is installed, you can view the monitoring information of the created ECS instances in the Cloud Monitor console. We recommend that you enable this feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Installs Cloud Monitor on the ECS nodes.</p>
         * </li>
         * <li><p><code>false</code>: Does not install Cloud Monitor on the ECS nodes.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy of the node. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
         * <ul>
         * <li><p><code>static</code>: Allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</p>
         * </li>
         * <li><p><code>none</code>: Enables the default CPU affinity scheme.</p>
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
         * <p>The labels that you want to add to the nodes in the Kubernetes cluster.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The custom node name. If you customize the node name, the node name, ECS instance name, and ECS instance hostname are changed.</p>
         * <blockquote>
         * <p>For Windows instances for which custom node names are enabled, the hostname is fixed as the IP address. Hyphens (-) are used to replace periods (.) in the IP address. The hostname does not contain a prefix or a suffix.</p>
         * </blockquote>
         * <p>A node name consists of a prefix, the node IP address, and a suffix.</p>
         * <ul>
         * <li><p>The total length must be 2 to 64 characters. The node name must start and end with a lowercase letter or a digit.</p>
         * </li>
         * <li><p>The prefix and suffix can contain uppercase letters, lowercase letters, digits, hyphens (-), and periods (.). They must start with an uppercase or lowercase letter. They cannot start or end with a hyphen (-) or a period (.). You cannot use consecutive hyphens (-)or periods (.). You cannot use consecutive hyphens (-) or periods (.).</p>
         * </li>
         * <li><p>The prefix is required (due to an ECS limit). The suffix is optional.</p>
         * </li>
         * <li><p>The node IP address is the complete private IP address of the node.</p>
         * </li>
         * </ul>
         * <p>For example, if the node IP address is 192.XX.YY.55, the prefix is aliyun.com, and the suffix is test.</p>
         * <ul>
         * <li><p>If the node is a Linux node, the node name, ECS instance name, and ECS instance hostname are all aliyun.com192.XX.YY.55test.</p>
         * </li>
         * <li><p>If the node is a Windows node, the ECS instance hostname is 192-XX-YY-55, and the node name and ECS instance name are both aliyun.com192.XX.YY.55test.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com192.XX.YY.55test</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The pre-join instance user data. The specified user data script is run before the node joins the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User-Data scripts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The name of the container runtime. ACK supports the following three container runtimes.</p>
         * <ul>
         * <li><p>containerd: We recommend that you use this runtime. It is supported by all cluster versions.</p>
         * </li>
         * <li><p>Sandboxed-Container.runv: a sandboxed container that provides higher isolation. It is supported by clusters of Kubernetes 1.31 or earlier.</p>
         * </li>
         * <li><p>docker: no longer maintained. It is supported by clusters of Kubernetes 1.22 or earlier.</p>
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
         * <p>The version of the container runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.38</p>
         */
        @NameInMap("runtime_version")
        public String runtimeVersion;

        /**
         * <p>The taint configurations.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Specifies whether the scaled-out nodes are unschedulable.</p>
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
         * <p>The instance user data. After the node joins the cluster, the specified user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User-Data scripts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dGhpcyBpcyBhIGV4YW1wbGU=</p>
         */
        @NameInMap("user_data")
        public String userData;

        public static CreateClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestKubernetesConfig self = new CreateClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setUnschedulable(Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateClusterNodePoolRequestManagementAutoRepairPolicy extends TeaModel {
        /**
         * <p>Specifies whether manual approval is required for node repair.</p>
         */
        @NameInMap("approval_required")
        public Boolean approvalRequired;

        /**
         * <p>Specifies whether to allow node restart. This parameter takes effect only if \<code>auto_repair\\</code> is set to \<code>true\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows node restart.</p>
         * </li>
         * <li><p><code>false</code>: Disallows node restart.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        public static CreateClusterNodePoolRequestManagementAutoRepairPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementAutoRepairPolicy self = new CreateClusterNodePoolRequestManagementAutoRepairPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementAutoRepairPolicy setApprovalRequired(Boolean approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }
        public Boolean getApprovalRequired() {
            return this.approvalRequired;
        }

        public CreateClusterNodePoolRequestManagementAutoRepairPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

    }

    public static class CreateClusterNodePoolRequestManagementAutoUpgradePolicy extends TeaModel {
        /**
         * <p>Specifies whether to allow auto kubelet upgrade. This parameter takes effect only if \<code>auto_upgrade\\</code> is set to \<code>true\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows auto kubelet upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disallows auto kubelet upgrade.</p>
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
         * <p>Specifies whether to allow auto OS upgrade. This parameter takes effect only if \<code>auto_upgrade\\</code> is set to \<code>true\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows auto OS upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disallows auto OS upgrade.</p>
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
         * <p>Specifies whether to allow auto runtime upgrade. This parameter takes effect only if \<code>auto_upgrade\\</code> is set to \<code>true\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows auto runtime upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disallows auto runtime upgrade.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade_runtime")
        public Boolean autoUpgradeRuntime;

        public static CreateClusterNodePoolRequestManagementAutoUpgradePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementAutoUpgradePolicy self = new CreateClusterNodePoolRequestManagementAutoUpgradePolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeKubelet(Boolean autoUpgradeKubelet) {
            this.autoUpgradeKubelet = autoUpgradeKubelet;
            return this;
        }
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeOs(Boolean autoUpgradeOs) {
            this.autoUpgradeOs = autoUpgradeOs;
            return this;
        }
        public Boolean getAutoUpgradeOs() {
            return this.autoUpgradeOs;
        }

        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy setAutoUpgradeRuntime(Boolean autoUpgradeRuntime) {
            this.autoUpgradeRuntime = autoUpgradeRuntime;
            return this;
        }
        public Boolean getAutoUpgradeRuntime() {
            return this.autoUpgradeRuntime;
        }

    }

    public static class CreateClusterNodePoolRequestManagementAutoVulFixPolicy extends TeaModel {
        /**
         * <p>The packages that should be excluded from vulnerability fixing.</p>
         * <p>Default value: <code>kernel</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Specifies whether to allow node restart. This parameter takes effect only if \<code>auto_vul_fix\\</code> is set to \<code>true\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows node restart.</p>
         * </li>
         * <li><p><code>false</code>: Disallows node restart.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code></p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The vulnerability levels that are allowed to be automatically fixed. Separate multiple levels with commas. Example: <code>asap,later</code>. Supported vulnerability levels:</p>
         * <ul>
         * <li><p><code>asap</code>: high</p>
         * </li>
         * <li><p><code>later</code>: medium</p>
         * </li>
         * <li><p><code>nntf</code>: low</p>
         * </li>
         * </ul>
         * <p>Default value: <code>asap</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>asap,nntf</p>
         */
        @NameInMap("vul_level")
        public String vulLevel;

        public static CreateClusterNodePoolRequestManagementAutoVulFixPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementAutoVulFixPolicy self = new CreateClusterNodePoolRequestManagementAutoVulFixPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy setExcludePackages(String excludePackages) {
            this.excludePackages = excludePackages;
            return this;
        }
        public String getExcludePackages() {
            return this.excludePackages;
        }

        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy setRestartNode(Boolean restartNode) {
            this.restartNode = restartNode;
            return this;
        }
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class CreateClusterNodePoolRequestManagementUpgradeConfig extends TeaModel {
        /**
         * <p>[This parameter is deprecated] Use the \<code>auto_upgrade\\</code> parameter instead.</p>
         * <p>Specifies whether to enable auto upgrade. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables auto upgrade.</p>
         * </li>
         * <li><p><code>false</code>: disables auto upgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("auto_upgrade")
        @Deprecated
        public Boolean autoUpgrade;

        /**
         * <p>The maximum number of unavailable nodes.
         * The value must be in the range of [1, 1000].</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        /**
         * <p>The number of extra nodes. You can specify only one of \<code>surge\\</code> and \<code>surge_percentage\\</code>.</p>
         * <p>Nodes become unavailable during an upgrade. You can create extra nodes to compensate for the load on the cluster.</p>
         * <blockquote>
         * <p>We recommend that the number of extra nodes does not exceed the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of extra nodes. You can specify only one of \<code>surge\\</code> and \<code>surge_percentage\\</code>.</p>
         * <p>Number of extra nodes = Percentage of extra nodes × Number of nodes. For example, if you set the percentage of extra nodes to 50% and the number of existing nodes is 6, three extra nodes are created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static CreateClusterNodePoolRequestManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagementUpgradeConfig self = new CreateClusterNodePoolRequestManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public CreateClusterNodePoolRequestManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public CreateClusterNodePoolRequestManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class CreateClusterNodePoolRequestManagement extends TeaModel {
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Specifies whether to enable auto node repair. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Enables auto node repair.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto node repair.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto node repair policy.</p>
         */
        @NameInMap("auto_repair_policy")
        public CreateClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Specifies whether to enable auto node upgrade. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Enables auto node upgrade.</p>
         * </li>
         * <li><p><code>false</code>: Disables auto node upgrade.</p>
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
         * <p>The auto node upgrade policy.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Specifies whether to automatically fix CVE vulnerabilities. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>.</p>
         * <ul>
         * <li><p><code>true</code>: Automatically fixes CVE vulnerabilities.</p>
         * </li>
         * <li><p><code>false</code>: Does not automatically fix CVE vulnerabilities.</p>
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
         * <p>The policy for automatically fixing CVE vulnerabilities.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables the managed node pool feature.</p>
         * </li>
         * <li><p><code>false</code>: Disables the managed node pool feature. If you set this parameter to \<code>false\\</code>, the other parameters of \<code>management\\</code> do not take effect.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>[This parameter is deprecated] Use the \<code>auto_upgrade\\</code> parameter instead.</p>
         * <p>The auto upgrade configurations. This parameter takes effect only if \<code>enable\\</code> is set to \<code>true\\</code>.</p>
         */
        @NameInMap("upgrade_config")
        @Deprecated
        public CreateClusterNodePoolRequestManagementUpgradeConfig upgradeConfig;

        public static CreateClusterNodePoolRequestManagement build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestManagement self = new CreateClusterNodePoolRequestManagement();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestManagement setAutoFaultDiagnosis(Boolean autoFaultDiagnosis) {
            this.autoFaultDiagnosis = autoFaultDiagnosis;
            return this;
        }
        public Boolean getAutoFaultDiagnosis() {
            return this.autoFaultDiagnosis;
        }

        public CreateClusterNodePoolRequestManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public CreateClusterNodePoolRequestManagement setAutoRepairPolicy(CreateClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy) {
            this.autoRepairPolicy = autoRepairPolicy;
            return this;
        }
        public CreateClusterNodePoolRequestManagementAutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        public CreateClusterNodePoolRequestManagement setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public CreateClusterNodePoolRequestManagement setAutoUpgradePolicy(CreateClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy) {
            this.autoUpgradePolicy = autoUpgradePolicy;
            return this;
        }
        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        public CreateClusterNodePoolRequestManagement setAutoVulFix(Boolean autoVulFix) {
            this.autoVulFix = autoVulFix;
            return this;
        }
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        public CreateClusterNodePoolRequestManagement setAutoVulFixPolicy(CreateClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy) {
            this.autoVulFixPolicy = autoVulFixPolicy;
            return this;
        }
        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
        }

        public CreateClusterNodePoolRequestManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
        public CreateClusterNodePoolRequestManagement setUpgradeConfig(CreateClusterNodePoolRequestManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public CreateClusterNodePoolRequestManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class CreateClusterNodePoolRequestNodeComponentsConfig extends TeaModel {
        /**
         * <p>The custom configurations of the node component.</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, String> customConfig;

        public static CreateClusterNodePoolRequestNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeComponentsConfig self = new CreateClusterNodePoolRequestNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeComponentsConfig setCustomConfig(java.util.Map<String, String> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class CreateClusterNodePoolRequestNodeComponents extends TeaModel {
        /**
         * <p>The configurations of the node component.</p>
         */
        @NameInMap("config")
        public CreateClusterNodePoolRequestNodeComponentsConfig config;

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

        public static CreateClusterNodePoolRequestNodeComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeComponents self = new CreateClusterNodePoolRequestNodeComponents();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeComponents setConfig(CreateClusterNodePoolRequestNodeComponentsConfig config) {
            this.config = config;
            return this;
        }
        public CreateClusterNodePoolRequestNodeComponentsConfig getConfig() {
            return this.config;
        }

        public CreateClusterNodePoolRequestNodeComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterNodePoolRequestNodeComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterNodePoolRequestNodeConfig extends TeaModel {
        /**
         * <p>The Kubelet parameter settings.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        public static CreateClusterNodePoolRequestNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeConfig self = new CreateClusterNodePoolRequestNodeConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeConfig setKubeletConfiguration(KubeletConfig kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
            return this;
        }
        public KubeletConfig getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

    }

    public static class CreateClusterNodePoolRequestNodepoolInfo extends TeaModel {
        /**
         * <p>The name of the node pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nodepool-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the resource group. Instances that are created in the node pool belong to this resource group.</p>
         * <p>A resource can belong to only one resource group. You can map resource groups to concepts such as projects, applications, or organizations based on your business scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjmb****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The type of the node pool. Valid values:</p>
         * <ul>
         * <li><p><code>ess</code>: a regular node pool. This type of node pool provides managed features and auto scaling.</p>
         * </li>
         * <li><p><code>edge</code>: an edge node pool.</p>
         * </li>
         * <li><p><code>lingjun</code>: a Lingjun node pool.</p>
         * </li>
         * <li><p><code>hybrid</code>: a hybrid cloud node pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodepoolInfo self = new CreateClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterNodePoolRequestNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateClusterNodePoolRequestNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool. You must specify the private pool ID when \<code>match_criteria\\</code> is set to \<code>Target\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of the private pool. This parameter specifies the capacity of the private pool that you want to use to launch instances. An elastic assurance service or a capacity reservation service takes effect after it is generated. You can select a capacity type when you launch an instance. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: Open mode. The system automatically matches the capacity of open private pools. If no matching private pool is found, the instance is launched using public pool resources.</p>
         * </li>
         * <li><p><code>Target</code>: Target mode. The instance is launched using the capacity of the specified private pool. If the capacity of the private pool is unavailable, the instance fails to be launched.</p>
         * </li>
         * <li><p><code>None</code>: The instance is launched without using the capacity of a private pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Target</p>
         */
        @NameInMap("match_criteria")
        public String matchCriteria;

        public static CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions self = new CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupResourcePoolOptions extends TeaModel {
        /**
         * <p>A list of private pool IDs. These are the IDs of elastic assurance services or capacity reservation services. You can only specify the IDs of private pools in Target mode. The number of IDs must be in the range of 1 to 20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool policy for instance creation. Resource pools include private pools (generated by elastic assurance or capacity reservation services) and public pools. Valid values:
         * PrivatePoolFirst: Prioritizes private pools. If you specify \<code>resouce_pool_options.private_pool_ids\\</code>, the specified private pools are used first. If no private pool is specified or the specified pools have insufficient capacity, the system automatically tries to use open private pools. If no suitable private pool is found, the public pool is used.
         * PrivatePoolOnly: Uses only private pools. You must specify \<code>resouce_pool_options.private_pool_ids\\</code>. If the specified private pools have insufficient capacity, the instance fails to launch.
         * None: No resource pool policy is used.
         * Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("strategy")
        public String strategy;

        public static CreateClusterNodePoolRequestScalingGroupResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupResourcePoolOptions self = new CreateClusterNodePoolRequestScalingGroupResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public CreateClusterNodePoolRequestScalingGroupResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupSpotPriceLimit extends TeaModel {
        /**
         * <p>The instance type of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum bid price for a single instance.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Unit: USD/hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0.39</p>
         */
        @NameInMap("price_limit")
        public String priceLimit;

        public static CreateClusterNodePoolRequestScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupSpotPriceLimit self = new CreateClusterNodePoolRequestScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateClusterNodePoolRequestScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupTags extends TeaModel {
        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>node-k-1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>node-v-1</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateClusterNodePoolRequestScalingGroupTags build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupTags self = new CreateClusterNodePoolRequestScalingGroupTags();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterNodePoolRequestScalingGroupTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroup extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal for the nodes in the node pool. This parameter takes effect only if \<code>instance_charge_type\\</code> is set to \<code>PrePaid\\</code>. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enables auto-renewal.</p>
         * </li>
         * <li><p><code>false</code>: disables auto-renewal.</p>
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
         * <p>The auto-renewal period. Valid values:</p>
         * <ul>
         * <li><p>If \<code>PeriodUnit\\</code> is set to \<code>Week\\</code>: 1, 2, and 3.</p>
         * </li>
         * <li><p>If \<code>PeriodUnit\\</code> is set to \<code>Month\\</code>: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
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
         * <p>[Deprecated] Use the \<code>security_hardening_os\\</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the instance quantity requirement when \<code>multi_az_policy\\</code> is set to \<code>COST_OPTIMIZED\\</code> and spot instances cannot be created due to issues such as price or insufficient inventory. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Allows the system to automatically create pay-as-you-go instances to meet the required number of ECS instances.</p>
         * </li>
         * <li><p><code>false</code>: Does not allow the system to automatically create pay-as-you-go instances to meet the required number of ECS instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The data disk configurations of the nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The ID of the deployment set. You can use a deployment set to distribute the ECS instances created in the node pool across different physical servers to ensure high availability and underlying disaster recovery. When you create ECS instances in a deployment set, the instances are launched in the specified region based on the deployment strategy that you set.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>After you select a deployment set, the maximum number of nodes in the node pool is limited. By default, a deployment set supports a maximum of 20 × Number of zones (the number of zones is determined by the vSwitches) nodes. Select a deployment set with sufficient quota to prevent node creation failures.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         * <p>The total number of nodes that the node pool should maintain. We recommend that you configure at least two nodes to ensure that cluster components run as expected. You can adjust the expected number of nodes to scale out or scale in the node pool.</p>
         * <p>If you do not need to create nodes, set this parameter to 0. You can manually adjust the number of nodes later.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("desired_size")
        public Long desiredSize;

        /**
         * <p>The block device initialization configurations.</p>
         */
        @NameInMap("disk_init")
        public java.util.List<DiskInit> diskInit;

        /**
         * <p>The ID of the custom image. By default, the system-provided image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The OS image type. Valid values:</p>
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
         * <li><p><code>ContainerOS</code>: Container-Optimized OS.</p>
         * </li>
         * <li><p><code>AliyunLinux3ContainerOptimized</code>: Alinux3 Container-Optimized OS.</p>
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
         * <p>Default value: <code>PostPaid</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        /**
         * <p>The ECS instance metadata access configurations.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance property configurations.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>A list of instance types for the nodes in the node pool. When the system creates nodes in the node pool, it selects an instance type from the list that meets the requirements.</p>
         * <p>The number of instance types must be in the range of [1, 10].</p>
         * <blockquote>
         * <p>For high availability, we recommend that you select multiple instance types.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method of the public IP address. Valid values:</p>
         * <ul>
         * <li><p>PayByBandwidth: pay-by-bandwidth.</p>
         * </li>
         * <li><p>PayByTraffic: pay-by-traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound public bandwidth of the node. Unit: Mbit/s. The value must be in the range of [1, 100].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair that is used for passwordless logon. You must specify one of \<code>key_pair\\</code> and \<code>login_password\\</code>.</p>
         * <blockquote>
         * <p>If you select Container-Optimized OS for the node pool, you can use only \<code>key_pair\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>np-key-name</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Specifies whether to log on to the created ECS instances as a non-root user.</p>
         * <ul>
         * <li><p>true: Logs on as the ecs-user.</p>
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
         * <p>The SSH logon password. You must specify one of \<code>key_pair\\</code> and \<code>login_password\\</code>. The password must be 8 to 30 characters in length, and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for the ECS instances in the multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: Scales instances based on the vSwitch priority. The system scales instances based on the order of vSwitches that you specify in \<code>VSwitchIds.N\\</code>. If the system fails to create an ECS instance in the zone where the vSwitch with the highest priority resides, it automatically uses the vSwitch with the next highest priority to create the instance.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: Creates instances based on the vCPU unit price in ascending order. When multiple instance types are specified and the preemptible instance policy is configured, the system gives priority to creating the lowest-cost instance type. You can also use the \<code>CompensateWithOnDemand\\</code> parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient inventory.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when multiple instance types are specified or the preemptible instance policy is configured.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: Evenly distributes ECS instances across the specified zones. If the distribution of ECS instances becomes unbalanced due to insufficient inventory, you can call the API <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a> operation to balance the resource distribution.</p>
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
         * <p>The minimum number of pay-as-you-go instances that must be included in the scaling group. The value must be in the range of [0, 1000]. If the number of pay-as-you-go instances is less than this value, the system gives priority to creating pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that are created after the minimum number of pay-as-you-go instances (\<code>on_demand_base_capacity\\</code>) is met. The value must be in the range of [0, 100].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of the nodes in the node pool. This parameter is required and takes effect only if \<code>instance_charge_type\\</code> is set to \<code>PrePaid\\</code>.</p>
         * <ul>
         * <li><p>If \<code>period_unit\\</code> is set to \<code>Week\\</code>, the valid values of \<code>period\\</code> are 1, 2, 3, and 4.</p>
         * </li>
         * <li><p>If \<code>period_unit\\</code> is set to \<code>Month\\</code>, the valid values of \<code>period\\</code> are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The billing cycle of the nodes in the node pool. This parameter is required and takes effect only if \<code>instance_charge_type\\</code> is set to \<code>PrePaid\\</code>.</p>
         * <ul>
         * <li><p><code>Month</code>: The billing cycle is measured in months.</p>
         * </li>
         * <li><p><code>Week</code>: The billing cycle is measured in weeks.</p>
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
         * <p>[This parameter is deprecated] Use the \<code>image_type\\</code> parameter instead.</p>
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
         * <p>null</p>
         */
        @NameInMap("platform")
        @Deprecated
        public String platform;

        /**
         * <p>The private pool configurations.</p>
         */
        @NameInMap("private_pool_options")
        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The name of the worker RAM role.</p>
         * <ul>
         * <li><p>If this parameter is left empty, the default worker RAM role of the cluster is used.</p>
         * </li>
         * <li><p>If this parameter is not empty, the specified RAM role must be a <strong>service role</strong>, and its <strong>trusted service</strong> must be <strong>Elastic Compute Service</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a service role</a>. If the specified RAM role is not the default worker RAM role of the cluster, the name of the role cannot start with \<code>KubernetesMasterRole-\\</code> or \<code>KubernetesWorkerRole-\\</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is supported only by ACK managed clusters of Kubernetes 1.22 or later.</p>
         * 
         * <strong>example:</strong>
         * <p>example-role</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>A list of RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and policy used to create instances. Note:
         * This parameter takes effect only when you create pay-as-you-go instances.
         * This parameter cannot be set at the same time as \<code>private_pool_options.match_criteria\\</code> and \<code>private_pool_options.id\\</code>.</p>
         */
        @NameInMap("resource_pool_options")
        public CreateClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling mode of the scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>release</code>: standard mode. The system creates and releases ECS instances to scale the group.</p>
         * </li>
         * <li><p><code>recycle</code>: accelerated mode. The system creates, stops, and starts ECS instances to scale the group. This improves the scaling speed. When an instance is stopped, its computing resources are not billed, but its storage resources are. This does not apply to instances with local disks.</p>
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
         * <p>The ID of the security group for the node pool. You must specify one of \<code>security_group_ids\\</code> and \<code>security_group_id\\</code>. We recommend that you specify \<code>security_group_ids\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz9a8g2mt6x5llu0****</p>
         */
        @NameInMap("security_group_id")
        @Deprecated
        public String securityGroupId;

        /**
         * <p>A list of security group IDs. You must specify one of \<code>security_group_ids\\</code> and \<code>security_group_id\\</code>. We recommend that you specify \<code>security_group_ids\\</code>. If you specify both \<code>security_group_id\\</code> and \<code>security_group_ids\\</code>, \<code>security_group_ids\\</code> takes precedence.</p>
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
         * <p>Specifies whether to enable MLPS 2.0 security hardening. You can enable MLPS 2.0 security hardening for nodes only when you select Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 for the OS image. Alibaba Cloud provides baseline check standards and scanning programs for Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 Level 3 of MLPS 2.0 to ensure classified protection compliance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>The number of instance types that you can specify. The scaling group creates preemptible instances of multiple instance types that are available at the lowest cost. The value must be in the range of [1, 10].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        /**
         * <p>Specifies whether to enable the instance reclaim mode. After this mode is enabled, when the system receives a message that a spot instance is about to be reclaimed, the scaling group attempts to create a new instance to replace the instance that is about to be reclaimed. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enables the instance reclaim mode.</p>
         * </li>
         * <li><p><code>false</code>: Disables the instance reclaim mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The configurations of the price range for a single spot instance.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The bidding policy for the spot instances. Valid values:</p>
         * <ul>
         * <li><p><code>NoSpot</code>: The instance is not a spot instance.</p>
         * </li>
         * <li><p><code>SpotWithPriceLimit</code>: Sets the maximum bid price for the spot instance.</p>
         * </li>
         * <li><p><code>SpotAsPriceGo</code>: The system automatically bids based on the current market price.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/165053.html">Spot instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk of the node. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
         * </ul>
         * <p>This parameter can be set only when \<code>system_disk_category\\</code> is set to \<code>cloud_auto\\</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The types of system disks. If a disk of a high-priority type is unavailable, the system automatically uses a disk of the next priority type to create the system disk.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The type of the system disk of the node. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: ultra disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: standard SSD.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD.</p>
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
         * <p>The encryption algorithm that is used to encrypt the system disk. Valid value: aes-256.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("system_disk_encrypt_algorithm")
        public String systemDiskEncryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypts the system disk.</p>
         * </li>
         * <li><p>false: does not encrypt the system disk.</p>
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
         * <p>The performance level of the system disk for each node. This parameter applies only to Enhanced SSD (ESSD) disks. The performance level of an ESSD is determined by its size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
         * <ul>
         * <li><p>PL0: A moderate maximum concurrent I/O performance and a relatively stable read/write latency.</p>
         * </li>
         * <li><p>PL1: A moderate maximum concurrent I/O performance and a relatively stable read/write latency.</p>
         * </li>
         * <li><p>PL2: A high maximum concurrent I/O performance and a stable read/write latency.</p>
         * </li>
         * <li><p>PL3: A very high maximum concurrent I/O performance and a very stable read/write latency.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the system disk of the node.</p>
         * <p>Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter can be set only when \<code>system_disk_category\\</code> is set to \<code>cloud_auto\\</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system disk of the node. Unit: GiB.</p>
         * <p>The value must be in the range of [20, 2048].</p>
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
         * <p>The tags that you want to add only to ECS instances.</p>
         * <p>A tag key cannot be repeated. The tag key can be up to 128 characters in length. The tag key and the tag value cannot start with “aliyun” or “acs:”, and cannot contain “https\://” or “http\://”.</p>
         */
        @NameInMap("tags")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupTags> tags;

        /**
         * <p>A list of vSwitch IDs. The number of vSwitch IDs must be in the range of [1, 8].</p>
         * <blockquote>
         * <p>For high availability, we recommend that you select vSwitches in different zones.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static CreateClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroup self = new CreateClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateClusterNodePoolRequestScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        @Deprecated
        public CreateClusterNodePoolRequestScalingGroup setCisEnabled(Boolean cisEnabled) {
            this.cisEnabled = cisEnabled;
            return this;
        }
        public Boolean getCisEnabled() {
            return this.cisEnabled;
        }

        public CreateClusterNodePoolRequestScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public CreateClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public CreateClusterNodePoolRequestScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public CreateClusterNodePoolRequestScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public CreateClusterNodePoolRequestScalingGroup setDiskInit(java.util.List<DiskInit> diskInit) {
            this.diskInit = diskInit;
            return this;
        }
        public java.util.List<DiskInit> getDiskInit() {
            return this.diskInit;
        }

        public CreateClusterNodePoolRequestScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterNodePoolRequestScalingGroup setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstancePatterns(java.util.List<InstancePatterns> instancePatterns) {
            this.instancePatterns = instancePatterns;
            return this;
        }
        public java.util.List<InstancePatterns> getInstancePatterns() {
            return this.instancePatterns;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateClusterNodePoolRequestScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateClusterNodePoolRequestScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public CreateClusterNodePoolRequestScalingGroup setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        public CreateClusterNodePoolRequestScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public CreateClusterNodePoolRequestScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public CreateClusterNodePoolRequestScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public CreateClusterNodePoolRequestScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public CreateClusterNodePoolRequestScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public CreateClusterNodePoolRequestScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        @Deprecated
        public CreateClusterNodePoolRequestScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public CreateClusterNodePoolRequestScalingGroup setPrivatePoolOptions(CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public CreateClusterNodePoolRequestScalingGroup setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public CreateClusterNodePoolRequestScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public CreateClusterNodePoolRequestScalingGroup setResourcePoolOptions(CreateClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions) {
            this.resourcePoolOptions = resourcePoolOptions;
            return this;
        }
        public CreateClusterNodePoolRequestScalingGroupResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
        }

        public CreateClusterNodePoolRequestScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        @Deprecated
        public CreateClusterNodePoolRequestScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateClusterNodePoolRequestScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateClusterNodePoolRequestScalingGroup setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public CreateClusterNodePoolRequestScalingGroup setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotPriceLimit(java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public CreateClusterNodePoolRequestScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
            this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
            return this;
        }
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskKmsKeyId(String systemDiskKmsKeyId) {
            this.systemDiskKmsKeyId = systemDiskKmsKeyId;
            return this;
        }
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
        }

        public CreateClusterNodePoolRequestScalingGroup setTags(java.util.List<CreateClusterNodePoolRequestScalingGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateClusterNodePoolRequestScalingGroupTags> getTags() {
            return this.tags;
        }

        public CreateClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class CreateClusterNodePoolRequestTeeConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the confidential computing cluster.</p>
         * <ul>
         * <li><p>true: Enables confidential computing.</p>
         * </li>
         * <li><p>false: Disables confidential computing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static CreateClusterNodePoolRequestTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestTeeConfig self = new CreateClusterNodePoolRequestTeeConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
