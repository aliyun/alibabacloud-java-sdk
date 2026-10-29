// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The auto mode configuration of the node pool.</p>
     */
    @NameInMap("auto_mode")
    public CreateClusterNodePoolRequestAutoMode autoMode;

    /**
     * <p>The elastic scaling configuration.</p>
     */
    @NameInMap("auto_scaling")
    public CreateClusterNodePoolRequestAutoScaling autoScaling;

    /**
     * <p><strong>[Deprecated]</strong> Use desired_size instead.</p>
     * <p>The number of nodes in the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("count")
    @Deprecated
    public Long count;

    /**
     * <p>The Lingjun node pool configuration.</p>
     */
    @NameInMap("eflo_node_group")
    public CreateClusterNodePoolRequestEfloNodeGroup efloNodeGroup;

    /**
     * <p>Specifies whether the pod network mode uses the host network mode. Valid values:</p>
     * <ul>
     * <li><code>true</code>: host network. Pods directly use the network stack of the host and share the IP address and ports with the host.</li>
     * <li><code>false</code>: container network. Pods have independent network stacks and do not occupy host network ports.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("host_network")
    public Boolean hostNetwork;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The configuration of the edge node pool.</p>
     */
    @NameInMap("interconnect_config")
    @Deprecated
    public CreateClusterNodePoolRequestInterconnectConfig interconnectConfig;

    /**
     * <p>The network type of the edge node pool. This parameter takes effect only when <code>type</code> is set to <code>edge</code>. Valid values:</p>
     * <ul>
     * <li><code>basic</code>: Internet. Nodes in cloud node pool interact with cloud nodes over the Internet. Applications in cloud node pool cannot directly access the internal network of the cloud VPC.</li>
     * <li><code>private</code>: private network. Nodes in cloud node pool connect to the cloud network through Express Connect circuits, VPNs, or CEN, which provides higher cloud-edge communication quality and more effective security protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("interconnect_mode")
    public String interconnectMode;

    /**
     * <p>Specifies whether Layer 3 network connectivity is enabled between nodes in the edge node pool. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enabled. Layer 3 network connectivity is enabled between all nodes in the node pool.</li>
     * <li><code>false</code>: disabled. Layer 3 network connectivity is disabled between all hosts in the node pool.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("intranet")
    public Boolean intranet;

    /**
     * <p>The cluster configurations.</p>
     */
    @NameInMap("kubernetes_config")
    public CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>The configurations for the managed node pool feature.</p>
     */
    @NameInMap("management")
    public CreateClusterNodePoolRequestManagement management;

    /**
     * <p><strong>[Deprecated]</strong> The maximum number of nodes that the edge node pool can accommodate.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("max_nodes")
    @Deprecated
    public Long maxNodes;

    /**
     * <p>The list of node components.</p>
     */
    @NameInMap("node_components")
    public java.util.List<CreateClusterNodePoolRequestNodeComponents> nodeComponents;

    /**
     * <p>The node configuration.</p>
     */
    @NameInMap("node_config")
    public CreateClusterNodePoolRequestNodeConfig nodeConfig;

    /**
     * <p>The node pool configuration.</p>
     */
    @NameInMap("nodepool_info")
    public CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>The scaling group configuration of the node pool.</p>
     */
    @NameInMap("scaling_group")
    public CreateClusterNodePoolRequestScalingGroup scalingGroup;

    /**
     * <p>The confidential computing cluster configuration.</p>
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
         * <p>Specifies whether to enable auto mode. Valid values:</p>
         * <ul>
         * <li>true: enables auto mode. This value is valid only when auto mode is enabled for the cluster.</li>
         * <li>false: disables auto mode.</li>
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
         * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <p>The peak bandwidth of the EIP. Unit: Mbit/s.</p>
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
         * <li><p><code>true</code>: enables auto scaling for the node pool. When the capacity planning of the cluster cannot meet the scheduling requirements of application pods, ACK automatically scales node resources based on the configured minimum and maximum numbers of instances. For clusters of version 1.24 and later, node instant elasticity is enabled by default. For clusters earlier than version 1.24, node auto scaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node auto scaling</a>.</p>
         * </li>
         * <li><p><code>false</code>: disables auto scaling. ACK adjusts the number of nodes in the node pool based on the configured expected number of nodes to keep the number of nodes at the expected value.</p>
         * </li>
         * </ul>
         * <p>If this parameter is set to false, other configuration parameters in <code>auto_scaling</code> do not take effect.</p>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.</p>
         * <p>Specifies whether to associate an EIP. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: associates an EIP.</p>
         * </li>
         * <li><p><code>false</code>: does not associate an EIP.</p>
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
         * <li>If the minimum number of instances is not 0, the automatic creation of the corresponding number of ECS instances occurs after the scaling group takes effect.</li>
         * <li>The recommended Settings for the maximum number of instances should not be less than the current number of nodes in the node pool. Otherwise, the elastic scaling feature scales in the nodes in the node pool immediately after it takes effect.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("min_instances")
        public Long minInstances;

        /**
         * <p>The instance type for elastic scaling. This parameter takes effect only when <code>enable</code> is set to true. Valid values:</p>
         * <ul>
         * <li><p><code>cpu</code>: regular instance.</p>
         * </li>
         * <li><p><code>gpu</code>: GPU-accelerated instance.</p>
         * </li>
         * <li><p><code>gpushare</code>: GPU-shared instance.</p>
         * </li>
         * <li><p><code>spot</code>: spot instance.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>cpu</code>.</p>
         * <blockquote>
         * <p>Notice: This parameter cannot be modified after the node pool is created.</p>
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
         * <p>Specifies whether to enable auto-attach for the Lingjun node pool.</p>
         */
        @NameInMap("auto_attach_enabled")
        public Boolean autoAttachEnabled;

        /**
         * <p>The ID of the Lingjun cluster to associate when creating the Lingjun node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>i1169130516633730****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The ID of the Lingjun group in the Lingjun cluster to associate when creating the Lingjun node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-ec3c96ff0aa****</p>
         */
        @NameInMap("group_id")
        public String groupId;

        /**
         * <p>The worker RAM role used by the Lingjun node pool.</p>
         */
        @NameInMap("worker_ram_role_name")
        public String workerRamRoleName;

        public static CreateClusterNodePoolRequestEfloNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestEfloNodeGroup self = new CreateClusterNodePoolRequestEfloNodeGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestEfloNodeGroup setAutoAttachEnabled(Boolean autoAttachEnabled) {
            this.autoAttachEnabled = autoAttachEnabled;
            return this;
        }
        public Boolean getAutoAttachEnabled() {
            return this.autoAttachEnabled;
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

        public CreateClusterNodePoolRequestEfloNodeGroup setWorkerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

    }

    public static class CreateClusterNodePoolRequestInterconnectConfig extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong></p>
         * <p>The network bandwidth of the edge-enhanced node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("bandwidth")
        public Long bandwidth;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * <p>The instance ID of the Cloud Connect Network (CCN) attached to the edge-enhanced node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ccn_id")
        public String ccnId;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * <p>The region of the CCN instance associated with the edge-enhanced node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * <p>The instance ID of the Cloud Enterprise Network (CEN) attached to the edge-enhanced node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("cen_id")
        public String cenId;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * <p>The subscription duration of the edge-enhanced node pool. Unit: months.</p>
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
         * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After the agent is installed, you can view the monitoring information of the created ECS instances in the CloudMonitor console. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The CloudMonitor agent is installed on ECS nodes.</li>
         * <li><code>false</code>: The CloudMonitor agent is not installed on ECS nodes.
         * Default value: <code>false</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        /**
         * <p>The CPU management policy for nodes. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: Allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
         * <li><code>none</code>: Uses the default CPU affinity scheme.
         * Default value: <code>none</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The labels to be added to the nodes in the Kubernetes cluster.</p>
         */
        @NameInMap("labels")
        public java.util.List<Tag> labels;

        /**
         * <p>The custom node name. After you specify a custom node name, the node name, ECS instance name, and ECS instance hostname are changed accordingly.</p>
         * <blockquote>
         * <p>For Windows instances with custom node names enabled, the hostname is fixed to the IP address, with hyphens (-) replacing periods (.) in the IP address, and without prefixes or suffixes. </p>
         * </blockquote>
         * <p>The node name consists of a prefix, the node IP address, and a suffix:</p>
         * <ul>
         * <li>The total length is 2 to 64 characters. The node name must start and end with a lowercase letter or a digit.</li>
         * <li>The prefix and suffix can contain uppercase and lowercase letters, digits, hyphens (-), and periods (.). They must start with a letter and cannot start or end with a hyphen (-) or a period (.). Consecutive hyphens (-) or periods (.) are not allowed.</li>
         * <li>The prefix is required due to ECS limits, and the suffix is optional.</li>
         * <li>The node IP address is the complete private IP address of the node.</li>
         * </ul>
         * <p>For example, if the node IP address is 192.XX.YY.55, the prefix is aliyun.com, and the suffix is test:</p>
         * <ul>
         * <li>If the node is a Linux node, the node name, ECS instance name, and ECS instance hostname are all aliyun.com192.XX.YY.55test.</li>
         * <li>If the node is a Windows node, the ECS instance hostname is 192-XX-YY-55, and both the node name and ECS instance name are aliyun.com192.XX.YY.55test.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com192.XX.YY.55test</p>
         */
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        /**
         * <p>The pre-custom data of the instance. Before the node is added to the cluster, the specified pre-custom data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
         */
        @NameInMap("pre_user_data")
        public String preUserData;

        /**
         * <p>The name of the container runtime. ACK supports the following three container runtimes:</p>
         * <ul>
         * <li><code>containerd</code>: Recommended. Supported by all cluster versions.</li>
         * <li><code>Sandboxed-Container.runv</code>: Secure sandboxed containers that provide higher isolation. Supported by clusters of version 1.31 and earlier.</li>
         * <li><code>docker</code>: Deprecated. Supported by clusters of version 1.22 and earlier.
         * Default value: <code>containerd</code>.</li>
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
         * <p>The taint configuration.</p>
         */
        @NameInMap("taints")
        public java.util.List<Taint> taints;

        /**
         * <p>Specifies whether the scaled-out nodes are unschedulable. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The nodes are unschedulable.</li>
         * <li><code>false</code>: The nodes are schedulable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("unschedulable")
        public Boolean unschedulable;

        /**
         * <p>The instance user data. After the node is added to the cluster, the specified instance user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
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
         * <p>The ID of the auto-repair policy. If you do not specify this parameter or specify an empty string, no auto-healing rule is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxxxxxx</p>
         */
        @NameInMap("auto_repair_policy_id")
        public String autoRepairPolicyId;

        /**
         * <p>The maximum number of nodes or the percentage of nodes that can be repaired simultaneously when a large number of abnormal nodes exist in the node pool. You can specify a number (for example, 5, valid values: 1 to 100000) or a percentage (for example, 10%, valid values: 1% to 100%). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("max_parallel_repairing_nodes")
        public String maxParallelRepairingNodes;

        /**
         * <p>The circuit breaker threshold for auto-healing. When the number or percentage of faulty nodes exceeds this threshold, auto-healing enters the circuit breaker state and stops initiating new auto-healing repair actions. You can specify a number (for example, 10, valid values: 1 to 100000) or a percentage (for example, 20%, valid values: 1% to 100%). Default value: 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>20%</p>
         */
        @NameInMap("max_unhealthy_nodes_threshold")
        public String maxUnhealthyNodesThreshold;

        /**
         * <p>Specifies whether to allow node restarts. This parameter takes effect only when auto_repair is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows node restarts.</li>
         * <li><code>false</code>: Does not allow node restarts.
         * Default value: <code>true</code>.</li>
         * </ul>
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

        public CreateClusterNodePoolRequestManagementAutoRepairPolicy setAutoRepairPolicyId(String autoRepairPolicyId) {
            this.autoRepairPolicyId = autoRepairPolicyId;
            return this;
        }
        public String getAutoRepairPolicyId() {
            return this.autoRepairPolicyId;
        }

        public CreateClusterNodePoolRequestManagementAutoRepairPolicy setMaxParallelRepairingNodes(String maxParallelRepairingNodes) {
            this.maxParallelRepairingNodes = maxParallelRepairingNodes;
            return this;
        }
        public String getMaxParallelRepairingNodes() {
            return this.maxParallelRepairingNodes;
        }

        public CreateClusterNodePoolRequestManagementAutoRepairPolicy setMaxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
            this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
            return this;
        }
        public String getMaxUnhealthyNodesThreshold() {
            return this.maxUnhealthyNodesThreshold;
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
         * <p>Specifies whether to allow automatic kubelet upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows automatic kubelet upgrades.</li>
         * <li><code>false</code>: Does not allow automatic kubelet upgrades.
         * Default value: <code>true</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade_kubelet")
        public Boolean autoUpgradeKubelet;

        /**
         * <p>Specifies whether to allow automatic operating system upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows automatic operating system upgrades.</li>
         * <li><code>false</code>: Does not allow automatic operating system upgrades.
         * Default value: <code>false</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("auto_upgrade_os")
        public Boolean autoUpgradeOs;

        /**
         * <p>Specifies whether to allow automatic runtime upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows automatic runtime upgrades.</li>
         * <li><code>false</code>: Does not allow automatic runtime upgrades.
         * Default value: <code>true</code>.</li>
         * </ul>
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
         * <p>The packages to be excluded during vulnerability repair. Default value: <code>kernel</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel</p>
         */
        @NameInMap("exclude_packages")
        public String excludePackages;

        /**
         * <p>Specifies whether to allow node restarts. This parameter takes effect only when auto_vul_fix is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows node restarts.</li>
         * <li><code>false</code>: Does not allow node restarts.
         * Default value: <code>true</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("restart_node")
        public Boolean restartNode;

        /**
         * <p>The vulnerability levels that are allowed for automatic repair, separated by commas. Example: <code>asap,later</code>. Valid values:</p>
         * <ul>
         * <li><code>asap</code>: High.</li>
         * <li><code>later</code>: Medium.</li>
         * <li><code>nntf</code>: Low.
         * Default value: <code>asap</code>.</li>
         * </ul>
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
         * <p><strong>[Deprecated]</strong> Use the auto_upgrade parameter at the upper level instead. Specifies whether to enable auto-upgrade. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables auto-upgrade.</li>
         * <li><code>false</code>: Disables auto-upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
         * <p>The number of extra nodes. This parameter and surge_percentage are mutually exclusive. Nodes become unavailable during upgrades. You can create extra nodes to compensate for the cluster load.</p>
         * <blockquote>
         * <p>The number of extra nodes should not exceed the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("surge")
        public Long surge;

        /**
         * <p>The percentage of extra nodes. This parameter and surge are mutually exclusive. Number of extra nodes = Percentage of extra nodes × Number of nodes. For example, if the percentage of extra nodes is set to 50% and the current number of nodes is 6, the number of extra nodes generated is 50% × 6 = 3.</p>
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
        /**
         * <p>Specifies whether to enable ECS fault detection for node auto-healing.</p>
         */
        @NameInMap("auto_fault_diagnosis")
        public Boolean autoFaultDiagnosis;

        /**
         * <p>Specifies whether to automatically repair nodes. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Automatically repairs nodes.</li>
         * <li><code>false</code>: Does not automatically repair nodes.
         * Default value: <code>true</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        /**
         * <p>The auto-repair policy for nodes.</p>
         */
        @NameInMap("auto_repair_policy")
        public CreateClusterNodePoolRequestManagementAutoRepairPolicy autoRepairPolicy;

        /**
         * <p>Specifies whether to automatically upgrade nodes. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables auto-upgrade.</li>
         * <li><code>false</code>: Disables auto-upgrade.
         * Default value: <code>true</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        /**
         * <p>The auto-upgrade policy for nodes.</p>
         */
        @NameInMap("auto_upgrade_policy")
        public CreateClusterNodePoolRequestManagementAutoUpgradePolicy autoUpgradePolicy;

        /**
         * <p>Specifies whether to automatically repair CVE vulnerabilities. This parameter takes effect only when enable is set to true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Allows automatic CVE repair.</li>
         * <li><code>false</code>: Does not allow automatic CVE repair.
         * Default value: <code>true</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_vul_fix")
        public Boolean autoVulFix;

        /**
         * <p>The auto-repair policy for CVE vulnerabilities.</p>
         */
        @NameInMap("auto_vul_fix_policy")
        public CreateClusterNodePoolRequestManagementAutoVulFixPolicy autoVulFixPolicy;

        /**
         * <p>Specifies whether to enable the node rotation feature. This feature is supported only by intelligent managed node pools and is enabled by default. It is not supported by regular node pools.</p>
         */
        @NameInMap("drift_enabled")
        public Boolean driftEnabled;

        /**
         * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables the managed node pool feature.</li>
         * <li><code>false</code>: Disables the managed node pool feature. Other related configurations take effect only when this parameter is set to true.
         * Default value: <code>false</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> Use the auto_upgrade parameter at the upper level instead. The auto-upgrade configuration. This parameter takes effect only when enable is set to true.</p>
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

        public CreateClusterNodePoolRequestManagement setDriftEnabled(Boolean driftEnabled) {
            this.driftEnabled = driftEnabled;
            return this;
        }
        public Boolean getDriftEnabled() {
            return this.driftEnabled;
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

    public static class CreateClusterNodePoolRequestNodeComponentsConfigEnvs extends TeaModel {
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

        public static CreateClusterNodePoolRequestNodeComponentsConfigEnvs build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeComponentsConfigEnvs self = new CreateClusterNodePoolRequestNodeComponentsConfigEnvs();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeComponentsConfigEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterNodePoolRequestNodeComponentsConfigEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateClusterNodePoolRequestNodeComponentsConfig extends TeaModel {
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
        public java.util.List<CreateClusterNodePoolRequestNodeComponentsConfigEnvs> envs;

        public static CreateClusterNodePoolRequestNodeComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeComponentsConfig self = new CreateClusterNodePoolRequestNodeComponentsConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeComponentsConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public CreateClusterNodePoolRequestNodeComponentsConfig setEnvs(java.util.List<CreateClusterNodePoolRequestNodeComponentsConfigEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<CreateClusterNodePoolRequestNodeComponentsConfigEnvs> getEnvs() {
            return this.envs;
        }

    }

    public static class CreateClusterNodePoolRequestNodeComponents extends TeaModel {
        /**
         * <p>The configuration of the node component.</p>
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

    public static class CreateClusterNodePoolRequestNodeConfigNodeOsConfig extends TeaModel {
        /**
         * <p>The Transparent HugePages configuration.</p>
         */
        @NameInMap("hugepage")
        public Hugepage hugepage;

        /**
         * <p>The sysctl kernel parameter settings. Only specific kernel parameters are supported, and the cluster version must be 1.28 or later.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fs.file-max&quot;:&quot;1048576&quot;}</p>
         */
        @NameInMap("sysctl")
        public java.util.Map<String, ?> sysctl;

        public static CreateClusterNodePoolRequestNodeConfigNodeOsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodeConfigNodeOsConfig self = new CreateClusterNodePoolRequestNodeConfigNodeOsConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodeConfigNodeOsConfig setHugepage(Hugepage hugepage) {
            this.hugepage = hugepage;
            return this;
        }
        public Hugepage getHugepage() {
            return this.hugepage;
        }

        public CreateClusterNodePoolRequestNodeConfigNodeOsConfig setSysctl(java.util.Map<String, ?> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.Map<String, ?> getSysctl() {
            return this.sysctl;
        }

    }

    public static class CreateClusterNodePoolRequestNodeConfig extends TeaModel {
        /**
         * <p>The Kubelet parameter settings.</p>
         */
        @NameInMap("kubelet_configuration")
        public KubeletConfig kubeletConfiguration;

        /**
         * <p>The operating system configuration of the node.</p>
         */
        @NameInMap("node_os_config")
        public CreateClusterNodePoolRequestNodeConfigNodeOsConfig nodeOsConfig;

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

        public CreateClusterNodePoolRequestNodeConfig setNodeOsConfig(CreateClusterNodePoolRequestNodeConfigNodeOsConfig nodeOsConfig) {
            this.nodeOsConfig = nodeOsConfig;
            return this;
        }
        public CreateClusterNodePoolRequestNodeConfigNodeOsConfig getNodeOsConfig() {
            return this.nodeOsConfig;
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
         * <p>The ID of the resource group to which the node pool belongs. Instances added to the node pool belong to this resource group.</p>
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
         * <li><code>ess</code>: standard node pool, which supports managed features and automatic elastic scaling.</li>
         * <li><code>edge</code>: edge node pool.</li>
         * <li><code>lingjun</code>: Lingjun node pool.</li>
         * <li><code>hybrid</code>: hybrid cloud node pool.</li>
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

    public static class CreateClusterNodePoolRequestScalingGroupCpuOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable nested virtualization. Valid values: disabled: disables nested virtualization. enabled: enables nested virtualization.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("nested_virtualization")
        public String nestedVirtualization;

        public static CreateClusterNodePoolRequestScalingGroupCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupCpuOptions self = new CreateClusterNodePoolRequestScalingGroupCpuOptions();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupCpuOptions setNestedVirtualization(String nestedVirtualization) {
            this.nestedVirtualization = nestedVirtualization;
            return this;
        }
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool. When <code>match_criteria</code> is set to <code>Target</code>, you must specify the private pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The private pool capacity matching mode for instance startup. After an elasticity assurance or capacity reservation takes effect, a private pool is generated for you to select when you start instances. Valid values:</p>
         * <ul>
         * <li><code>Open</code>: open mode. The system automatically matches the capacity of an open private pool. If no eligible private pool capacity is available, the system uses public pool resources to start the instances.</li>
         * <li><code>Target</code>: specified mode. The system uses the capacity of the specified private pool to start instances. If the specified private pool capacity is unavailable, the instances fail to start.</li>
         * <li><code>None</code>: no private pool mode. The system does not use private pool capacity to start instances.</li>
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
         * <p>The list of private pool IDs, which are the IDs of elasticity assurances or capacity reservations. You can specify only the IDs of private pools in Target mode. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("private_pool_ids")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>The resource pool strategy used when creating instances. Resource pools include private pools generated after elasticity assurances or capacity reservations take effect, as well as public pools, which are available for selection during instance startup. Valid values:
         * PrivatePoolFirst: Private pool first. When this strategy is selected and resouce_pool_options.private_pool_ids is specified, the specified private pools are used first. If no private pool is specified or the specified private pools have insufficient capacity, open private pools are automatically matched. If no eligible private pool is available, the public pool is used to create the instance.
         * PrivatePoolOnly: Private pool only. When this strategy is selected, resouce_pool_options.private_pool_ids must be specified. If the specified private pools have insufficient capacity, the instance fails to start.
         * None: No resource pool strategy is used.
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
         * <p>The spot instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("instance_type")
        public String instanceType;

        /**
         * <p>The maximum price per instance.
         * &lt;props=&quot;china&quot;&gt;Unit: CNY/hour.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;Unit: USD/hour.</p>
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
         * <p>The tag key.</p>
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
         * <p>Specifies whether to enable auto-renewal for nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
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
         * <p>The duration of each auto-renewal cycle. Valid values:</p>
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
         * <p><strong>[Deprecated]</strong> Use the <code>security_hardening_os</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("cis_enabled")
        @Deprecated
        public Boolean cisEnabled;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when spot instances cannot be created due to price or inventory issues, provided that <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: automatically creates pay-as-you-go instances to meet the required number of ECS instances.</li>
         * <li><code>false</code>: does not automatically create pay-as-you-go instances.</li>
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
        public CreateClusterNodePoolRequestScalingGroupCpuOptions cpuOptions;

        /**
         * <p>The data cloud disk configuration for nodes in the node pool.</p>
         */
        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        /**
         * <p>The ID of the deployment set. You can use a deployment set to distribute ECS instances created by the node pool across different physical servers to ensure high availability and underlying disaster recovery capabilities. When you create ECS instances in a deployment set, the instances are distributed and started in the specified region based on the predefined deployment policy.</p>
         * <blockquote>
         * <p>Notice: After you select a deployment set, the maximum number of nodes in the node pool is limited. By default, a deployment set supports a maximum of 20 × the number of zones nodes. The number of zones is determined by the vSwitches. Proceed with caution and ensure that the quota in the deployment set is sufficient to prevent node scale-out failures.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The expected number of nodes in the node pool.</p>
         * <p>This is the total number of nodes that the node pool should maintain. We recommend that you configure at least two nodes to ensure the normal operation of cluster components. You can scale out or scale in the node pool by adjusting the expected number of nodes.</p>
         * <p>If you do not need to create nodes, set this parameter to 0 and manually increase the number of nodes later.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The ID of the custom image. By default, the system-provided image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the operating system image. Valid values:</p>
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
         * <p>The instance metadata access configuration for ECS instances.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance property configuration.</p>
         */
        @NameInMap("instance_patterns")
        public java.util.List<InstancePatterns> instancePatterns;

        /**
         * <p>The list of instance types for nodes in the node pool. When the node pool scales out nodes, it selects instance types that meet the requirements from the specified list to create instances.</p>
         * <p>Valid values for the number of instance types: 1 to 10.</p>
         * <blockquote>
         * <p>To ensure high availability, we recommend that you select multiple instance types.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The billing method for public IP addresses. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-data-transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("internet_charge_type")
        public String internetChargeType;

        /**
         * <p>The maximum outbound bandwidth for public IP addresses of nodes. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        /**
         * <p>The name of the key pair used for password-free logon. You must specify either this parameter or <code>login_password</code>.</p>
         * <blockquote>
         * <p>If the node pool uses the ContainerOS operating system, only <code>key_pair</code> is supported.</p>
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
         * <li><p>true: logs on as a non-root user (ecs-user).</p>
         * </li>
         * <li><p>false: logs on as the root user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("login_as_non_root")
        public Boolean loginAsNonRoot;

        /**
         * <p>The SSH logon password. You must specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("login_password")
        public String loginPassword;

        /**
         * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p><code>PRIORITY</code>: scales ECS instances based on the vSwitches (VSwitchIds.N) that you specify. If ECS instances cannot be created in the zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</p>
         * </li>
         * <li><p><code>COST_OPTIMIZED</code>: creates ECS instances based on the vCPU unit price in ascending order. When the scaling configuration specifies multiple instance types with the preemptible billing method, the system preferentially creates spot instances. You can use the <code>CompensateWithOnDemand</code> parameter to specify if it is to automatically create pay-as-you-go instances when spot instances cannot be created due to inventory shortages or other reasons.</p>
         * <blockquote>
         * <p><code>COST_OPTIMIZED</code> takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
         * </blockquote>
         * </li>
         * <li><p><code>BALANCE</code>: evenly allocates ECS instances across the zones specified in the scaling group. If the zones become unbalanced due to inventory shortages or other reasons, you can call the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a> API operation to balance the resources.</p>
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
         * <p>The minimum number of pay-as-you-go instances required by the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, the system preferentially creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the excess instances after the scaling group meets the minimum number of pay-as-you-go instances (<code>on_demand_base_capacity</code>). Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The subscription duration of nodes in the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
         * <p>The billing cycle of nodes in the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><code>Month</code>: month.</li>
         * <li><code>Week</code>: week.</li>
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
         * <p>null</p>
         */
        @NameInMap("platform")
        @Deprecated
        public String platform;

        /**
         * <p>The private pool configuration.</p>
         */
        @NameInMap("private_pool_options")
        public CreateClusterNodePoolRequestScalingGroupPrivatePoolOptions privatePoolOptions;

        /**
         * <p>The name of the worker RAM role.</p>
         * <ul>
         * <li>If this parameter is left empty, the default worker RAM role created for the cluster is used.</li>
         * <li>If this parameter is specified, the RAM role must be a <strong>normal service role</strong> and its <strong>trusted service</strong> must be set to <strong>ECS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a normal service role</a>. If the specified RAM role is not the default worker RAM role created for the cluster, the role name cannot start with <code>KubernetesMasterRole-</code> or <code>KubernetesWorkerRole-</code>.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: This parameter is supported only by ACK managed clusters of version 1.22 and later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example-role</p>
         */
        @NameInMap("ram_role_name")
        public String ramRoleName;

        /**
         * <p>The list of ApsaraDB RDS instances.</p>
         */
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        /**
         * <p>The resource pool and resource pool policy used for instance creation. Take note of the following items when you configure this parameter:
         * This parameter takes effect only when you create pay-as-you-go instances.
         * This parameter cannot be specified together with private_pool_options.match_criteria or private_pool_options.id.</p>
         */
        @NameInMap("resource_pool_options")
        public CreateClusterNodePoolRequestScalingGroupResourcePoolOptions resourcePoolOptions;

        /**
         * <p>The scaling group mode. Valid values:</p>
         * <ul>
         * <li><code>release</code>: Standard mode. Instances are scaled by creating and releasing ECS instances based on the requested resource usage.</li>
         * <li><code>recycle</code>: Extreme mode. Instances are scaled by creating, stopping, and starting instances to improve the speed of subsequent scaling operations. When an instance is stopped, compute resources are not billed, and only storage fees are charged, except for instances with local disks.
         * Default value: <code>release</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>release</p>
         */
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        /**
         * <p>The security group ID of the node pool. Specify either this parameter or security_group_ids. We recommend that you use security_group_ids.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz9a8g2mt6x5llu0****</p>
         */
        @NameInMap("security_group_id")
        @Deprecated
        public String securityGroupId;

        /**
         * <p>The list of security group IDs. Specify either this parameter or security_group_id. We recommend that you use security_group_ids. If both security_group_id and security_group_ids are specified, security_group_ids takes precedence.</p>
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
         * <p>Specifies whether to enable spot instance replenishment. After this feature is enabled, when the scaling group receives a system message that a spot instance will be reclaimed, it attempts to create a new instance to replace the spot instance to be reclaimed. Valid values:</p>
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
         * <p>The market price range configuration for a single spot instance type.</p>
         */
        @NameInMap("spot_price_limit")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        /**
         * <p>The spot instance strategy. Valid values:</p>
         * <ul>
         * <li><code>NoSpot</code>: Non-spot instance.</li>
         * <li><code>SpotWithPriceLimit</code>: Sets a maximum price for spot instances.</li>
         * <li><code>SpotAsPriceGo</code>: The system automatically bids based on the current market price.
         * For more information, see <a href="https://help.aliyun.com/document_detail/165053.html">Spot instances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("spot_strategy")
        public String spotStrategy;

        /**
         * <p>Specifies whether to enable performance burst for the node system disk. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.
         * This parameter is supported only when system_disk_category is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The categories of the system disk. If a higher-priority disk category is unavailable, the system automatically attempts to use the next priority disk category to create the system disk.</p>
         */
        @NameInMap("system_disk_categories")
        public java.util.List<String> systemDiskCategories;

        /**
         * <p>The category of the node system disk. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: Ultra cloud disk.</li>
         * <li><code>cloud_ssd</code>: Standard SSD.</li>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry cloud disk.
         * Default value: <code>cloud_efficiency</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The encryption algorithm used for the system disk. Valid values: aes-256.</p>
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
         * <p>The performance level of the node system disk. This parameter takes effect only for ESSD cloud disks. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>. Valid values:</p>
         * <ul>
         * <li>PL0: Medium concurrent I/O performance and relatively stable read/write latency.</li>
         * <li>PL1: Medium concurrent I/O performance and relatively stable read/write latency.</li>
         * <li>PL2: High concurrent I/O performance and stable read/write latency.</li>
         * <li>PL3: Extremely high concurrent I/O performance and highly stable read/write latency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read/write IOPS for the node system disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50000}.
         * This parameter is supported only when system_disk_category is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the node system disk. Unit: GiB. Valid values: 20 to 2048.</p>
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
         * <p>Adds tags only to ECS instances. Tag keys must be unique and can be up to 128 characters in length. Neither tag keys nor tag values can start with &quot;aliyun&quot; or &quot;acs:&quot;, or contain &quot;https://&quot; or &quot;http://&quot;.</p>
         */
        @NameInMap("tags")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupTags> tags;

        /**
         * <p>The list of vSwitch IDs. Valid values: 1 to 8.</p>
         * <blockquote>
         * <p>To ensure high availability, we recommend that you select vSwitches in different zones.</p>
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

        public CreateClusterNodePoolRequestScalingGroup setCpuOptions(CreateClusterNodePoolRequestScalingGroupCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public CreateClusterNodePoolRequestScalingGroupCpuOptions getCpuOptions() {
            return this.cpuOptions;
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

        public CreateClusterNodePoolRequestScalingGroup setEnableHighDensityMode(Boolean enableHighDensityMode) {
            this.enableHighDensityMode = enableHighDensityMode;
            return this;
        }
        public Boolean getEnableHighDensityMode() {
            return this.enableHighDensityMode;
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
         * <p>Specifies whether to enable the confidential computing cluster. Valid values:</p>
         * <ul>
         * <li>true: Enables confidential computing.</li>
         * <li>false: Does not enable confidential computing.</li>
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
