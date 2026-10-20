// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    /**
     * <p>The intelligent management mode configuration.</p>
     */
    @NameInMap("auto_mode")
    public DescribeClusterDetailResponseBodyAutoMode autoMode;

    /**
     * <p>The local domain name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The specification of the cluster when <code>cluster_type</code> is set to <code>ManagedKubernetes</code> and <code>profile</code> is configured. Valid values:</p>
     * <ul>
     * <li><code>ack.standard</code>: Basic Edition (selected by default if the value is empty).</li>
     * <li><code>ack.pro.small</code>: Pro Edition.</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL.</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL.</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (requires contacting customer service to apply for whitelist access).</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are the three tiers provided by the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. By pre-allocating and fixing control plane resources, these tiers ensure that API concurrency and pod scheduling capabilities are always maintained at a consistently high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For the cluster management fees of the Pro Edition and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><p><code>Kubernetes</code>: ACK dedicated cluster.</p>
     * </li>
     * <li><p><code>ManagedKubernetes</code>: ACK ACK clusters, including ACK ACK clusters (ACK Pro Edition and ACK Basic Edition), ACK Serverless clusters (Pro Edition and Basic Edition), ACK Edge clusters (Pro Edition and Basic Edition), and ACK Lingjun clusters (Pro Edition).</p>
     * </li>
     * <li><p><code>ExternalKubernetes</code>: Registered cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The Pod CIDR block for the Flannel network configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.xx.xx/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The control plane configuration for dedicated clusters.</p>
     */
    @NameInMap("control_plane_config")
    public DescribeClusterDetailResponseBodyControlPlaneConfig controlPlaneConfig;

    /**
     * <p>The connection configuration of the cluster.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-07T09:57:26+08:00</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The current version of the cluster. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Overview of Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("current_version")
    public String currentVersion;

    /**
     * <p>Specifies whether deletion protection is enabled for the cluster. This prevents the cluster from being accidentally deleted through the console or API calls. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Deletion protection is enabled. The cluster cannot be deleted through the console or API calls.</li>
     * <li><code>false</code>: Deletion protection is disabled. The cluster can be deleted through the console or API calls.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>The Docker version in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>19.03.5</p>
     */
    @NameInMap("docker_version")
    @Deprecated
    public String dockerVersion;

    /**
     * <p>The instance ID of the Ingress load balancer for the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zehc05z3b8dwiifh****</p>
     */
    @NameInMap("external_loadbalancer_id")
    @Deprecated
    public String externalLoadbalancerId;

    /**
     * <p>The custom Subject Alternative Names (SANs) for the API server certificate.</p>
     */
    @NameInMap("extra_sans")
    public java.util.List<String> extraSans;

    /**
     * <p>The initial version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("init_version")
    public String initVersion;

    /**
     * <p>The IP stack of the cluster. Valid values:</p>
     * <ul>
     * <li>ipv4: The cluster supports only the IPv4 stack.</li>
     * <li>dual: The cluster supports both IPv4 and IPv6 stacks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>The maintenance window configuration of the cluster. This configuration takes effect only for managed clusters, namely ACK Pro clusters.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>The access endpoints of the cluster, including the internal network and public network access endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;intranet_api_server_endpoint\&quot;:\&quot;<a href="https://192.168.xx.xx:6443%5C%5C%22***%7D">https://192.168.xx.xx:6443\\&quot;***}</a></p>
     */
    @NameInMap("master_url")
    public String masterUrl;

    /**
     * <p>The metadata of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;Addons\&quot;:***</p>
     */
    @NameInMap("meta_data")
    public String metaData;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network type of the cluster, such as VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("network_mode")
    @Deprecated
    public String networkMode;

    /**
     * <p>The version to which the cluster can be upgraded.</p>
     * 
     * <strong>example:</strong>
     * <p>1.xx.x-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>Applicable only to the Flannel network plugin. </p>
     * <p>The size of the subnet mask allocated to nodes, which controls the number of IP addresses that can be allocated to each node.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>The automatic O&amp;M policy of the cluster.</p>
     */
    @NameInMap("operation_policy")
    public DescribeClusterDetailResponseBodyOperationPolicy operationPolicy;

    /**
     * <p>The collection of Resource Orchestration Service (ROS) parameters for the cluster.</p>
     */
    @NameInMap("parameters")
    @Deprecated
    public java.util.Map<String, String> parameters;

    /**
     * <p>Specifies whether PrivateZone is enabled for the cluster. Valid values:  </p>
     * <ul>
     * <li><code>true</code>: Enabled.</li>
     * <li><code>false</code>: Disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("private_zone")
    @Deprecated
    public Boolean privateZone;

    /**
     * <p>The cluster subtype.</p>
     * <ul>
     * <li><p><code>Default</code>: ACK managed clusters, including ACK Cluster Pro Edition and ACK Cluster Basic Edition.</p>
     * </li>
     * <li><p><code>Edge</code>: ACK Edge clusters, including ACK Edge Cluster Pro Edition and ACK Edge Cluster Basic Edition.</p>
     * </li>
     * <li><p><code>Serverless</code>: ACK Serverless clusters, including ACK Serverless Cluster Pro Edition and ACK Serverless Cluster Basic Edition.</p>
     * </li>
     * <li><p><code>Lingjun</code>: ACK Lingjun clusters, available only in the Pro Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The kube-proxy mode. Valid values:</p>
     * <ul>
     * <li><code>iptables</code>: The mature and stable kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured by using iptables rules. However, the performance is average and heavily affected by the scale. This mode is suitable for clusters with a small number of Services.</li>
     * <li><code>ipvs</code>: The high-performance kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured by using the Linux IPVS module. This mode is suitable for clusters with a large number of Services and scenarios that require high-performance load balancing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>The ID of the region where the cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the cluster belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyvw3wjm****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>The RAM Roles for Service Accounts (RRSA) configuration.</p>
     */
    @NameInMap("rrsa_config")
    public DescribeClusterDetailResponseBodyRrsaConfig rrsaConfig;

    /**
     * <p>The ID of the security group to which the cluster belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-25yq****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>The CIDR block of the Service network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.xx.xx/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>The number of nodes in the cluster, including master nodes and worker nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li><code>initial</code>: The cluster is being created.</li>
     * <li><code>failed</code>: Cluster creation failed.</li>
     * <li><code>running</code>: The cluster is running.</li>
     * <li><code>updating</code>: The cluster is being updated.</li>
     * <li><code>upgrading</code>: The cluster is being upgraded.</li>
     * <li><code>removing</code>: Nodes are being removed.</li>
     * <li><code>draining</code>: Nodes are being drained.</li>
     * <li><code>scaling</code>: The cluster is being scaled.</li>
     * <li><code>inactive</code>: The cluster is inactive.</li>
     * <li><code>unavailable</code>: The cluster is unavailable.</li>
     * <li><code>deleting</code>: The cluster is being deleted.</li>
     * <li><code>deleted</code>: The cluster has been deleted.</li>
     * <li><code>delete_failed</code>: Cluster deletion failed.</li>
     * <li><code>waiting</code>: The cluster is waiting for access.</li>
     * <li><code>disconnected</code>: The cluster is disconnected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The Pod CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.xx.xx/16</p>
     */
    @NameInMap("subnet_cidr")
    @Deprecated
    public String subnetCidr;

    /**
     * <p>The cluster resource tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>The time when the cluster was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-10T13:28:09+08:00</p>
     */
    @NameInMap("updated")
    public String updated;

    /**
     * <p>The ID of the virtual private cloud (VPC) where the cluster is deployed. This parameter is required when you create a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zecuu62b9zw7a7qn****</p>
     */
    @NameInMap("vpc_id")
    public String vpcId;

    /**
     * <p>The vSwitch ID. <strong>[Deprecated]</strong> To query the vSwitches for the control plane, use vswitch_ids. To query the vSwitches for the data plane, query the vswitch_ids of the node pool.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zete8s4qocqg0mf6****,vsw-2zete8s4qocqg0mf6****</p>
     */
    @NameInMap("vswitch_id")
    @Deprecated
    public String vswitchId;

    /**
     * <p>The vSwitches for the cluster control plane.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>The name of the RAM role for worker nodes. This role authorizes ECS instances to act as worker nodes in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
     */
    @NameInMap("worker_ram_role_name")
    public String workerRamRoleName;

    /**
     * <p>The ID of the zone where the cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-a</p>
     */
    @NameInMap("zone_id")
    @Deprecated
    public String zoneId;

    public static DescribeClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponseBody self = new DescribeClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailResponseBody setAutoMode(DescribeClusterDetailResponseBodyAutoMode autoMode) {
        this.autoMode = autoMode;
        return this;
    }
    public DescribeClusterDetailResponseBodyAutoMode getAutoMode() {
        return this.autoMode;
    }

    public DescribeClusterDetailResponseBody setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
        return this;
    }
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public DescribeClusterDetailResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterDetailResponseBody setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeClusterDetailResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClusterDetailResponseBody setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public DescribeClusterDetailResponseBody setControlPlaneConfig(DescribeClusterDetailResponseBodyControlPlaneConfig controlPlaneConfig) {
        this.controlPlaneConfig = controlPlaneConfig;
        return this;
    }
    public DescribeClusterDetailResponseBodyControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    public DescribeClusterDetailResponseBody setControlPlaneEndpointsConfig(DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig controlPlaneEndpointsConfig) {
        this.controlPlaneEndpointsConfig = controlPlaneEndpointsConfig;
        return this;
    }
    public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig getControlPlaneEndpointsConfig() {
        return this.controlPlaneEndpointsConfig;
    }

    public DescribeClusterDetailResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public DescribeClusterDetailResponseBody setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public DescribeClusterDetailResponseBody setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setExternalLoadbalancerId(String externalLoadbalancerId) {
        this.externalLoadbalancerId = externalLoadbalancerId;
        return this;
    }
    public String getExternalLoadbalancerId() {
        return this.externalLoadbalancerId;
    }

    public DescribeClusterDetailResponseBody setExtraSans(java.util.List<String> extraSans) {
        this.extraSans = extraSans;
        return this;
    }
    public java.util.List<String> getExtraSans() {
        return this.extraSans;
    }

    public DescribeClusterDetailResponseBody setInitVersion(String initVersion) {
        this.initVersion = initVersion;
        return this;
    }
    public String getInitVersion() {
        return this.initVersion;
    }

    public DescribeClusterDetailResponseBody setIpStack(String ipStack) {
        this.ipStack = ipStack;
        return this;
    }
    public String getIpStack() {
        return this.ipStack;
    }

    public DescribeClusterDetailResponseBody setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public DescribeClusterDetailResponseBody setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
        return this;
    }
    public String getMasterUrl() {
        return this.masterUrl;
    }

    public DescribeClusterDetailResponseBody setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

    public DescribeClusterDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public DescribeClusterDetailResponseBody setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public String getNextVersion() {
        return this.nextVersion;
    }

    public DescribeClusterDetailResponseBody setNodeCidrMask(String nodeCidrMask) {
        this.nodeCidrMask = nodeCidrMask;
        return this;
    }
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
    }

    public DescribeClusterDetailResponseBody setOperationPolicy(DescribeClusterDetailResponseBodyOperationPolicy operationPolicy) {
        this.operationPolicy = operationPolicy;
        return this;
    }
    public DescribeClusterDetailResponseBodyOperationPolicy getOperationPolicy() {
        return this.operationPolicy;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
        return this;
    }
    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    public DescribeClusterDetailResponseBody setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeClusterDetailResponseBody setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public DescribeClusterDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterDetailResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClusterDetailResponseBody setRrsaConfig(DescribeClusterDetailResponseBodyRrsaConfig rrsaConfig) {
        this.rrsaConfig = rrsaConfig;
        return this;
    }
    public DescribeClusterDetailResponseBodyRrsaConfig getRrsaConfig() {
        return this.rrsaConfig;
    }

    public DescribeClusterDetailResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeClusterDetailResponseBody setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public DescribeClusterDetailResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DescribeClusterDetailResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }
    public String getSubnetCidr() {
        return this.subnetCidr;
    }

    public DescribeClusterDetailResponseBody setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public DescribeClusterDetailResponseBody setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public DescribeClusterDetailResponseBody setUpdated(String updated) {
        this.updated = updated;
        return this;
    }
    public String getUpdated() {
        return this.updated;
    }

    public DescribeClusterDetailResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeClusterDetailResponseBody setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public DescribeClusterDetailResponseBody setWorkerRamRoleName(String workerRamRoleName) {
        this.workerRamRoleName = workerRamRoleName;
        return this;
    }
    public String getWorkerRamRoleName() {
        return this.workerRamRoleName;
    }

    @Deprecated
    public DescribeClusterDetailResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeClusterDetailResponseBodyAutoMode extends TeaModel {
        /**
         * <p>Indicates whether the intelligent management mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static DescribeClusterDetailResponseBodyAutoMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyAutoMode self = new DescribeClusterDetailResponseBodyAutoMode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyAutoMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class DescribeClusterDetailResponseBodyControlPlaneConfig extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>The billing method for the control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Indicates whether CloudMonitor is installed on the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The CPU management policy for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp10b35imuam5amw****</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the operating system image.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The metadata access configuration for the ECS instances.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance type of the nodes.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The name of the key pair. You must specify either this parameter or <code>login_password</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The service port range for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription period for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The unit of the subscription period for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The name of the container runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Indicates whether Alibaba Cloud OS security hardening is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("security_hardening_os")
        public Boolean securityHardeningOs;

        /**
         * <p>The number of control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>Indicates whether classified protection security hardening is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Indicates whether bursting is enabled for the system cloud disks of the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The type of the system cloud disks for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level of the system cloud disks for the nodes. This parameter takes effect only for ESSDs.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The provisioned read and write IOPS for the system cloud disks of the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The size of the system cloud disks for the nodes. The minimum value is 40.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The ID of the automatic snapshot policy for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        @NameInMap("system_disk_snapshot_policy_id")
        public String systemDiskSnapshotPolicyId;

        public static DescribeClusterDetailResponseBodyControlPlaneConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyControlPlaneConfig self = new DescribeClusterDetailResponseBodyControlPlaneConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setCloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }
        public Boolean getCloudMonitorFlags() {
            return this.cloudMonitorFlags;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setInstanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setNodePortRange(String nodePortRange) {
            this.nodePortRange = nodePortRange;
            return this;
        }
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSecurityHardeningOs(Boolean securityHardeningOs) {
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSocEnabled(Boolean socEnabled) {
            this.socEnabled = socEnabled;
            return this;
        }
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
            this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
            return this;
        }
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
            this.systemDiskProvisionedIops = systemDiskProvisionedIops;
            return this;
        }
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
            this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
        }

    }

    public static class DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig extends TeaModel {
        /**
         * <p>The VPC scope where the internal DNS records of the cluster take effect. By default, this includes the VPC where the cluster is deployed.</p>
         */
        @NameInMap("bind_vpcs")
        public java.util.List<String> bindVpcs;

        /**
         * <p>Indicates whether internal DNS access is enabled for the cluster. Valid values: </p>
         * <ul>
         * <li>true: Internal DNS access is enabled. Node-side components such as kubelet and kube-proxy access the API server by using the internal domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig self = new DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig setBindVpcs(java.util.List<String> bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }
        public java.util.List<String> getBindVpcs() {
            return this.bindVpcs;
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-0ogk9aaxxxxxxx.cn-hangzhou.nlb.aliyuncsslb.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The endpoint type.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("endpoint_type")
        public String endpointType;

        /**
         * <p>The SLB instance associated with the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-0ogk9aaxxxxxxx</p>
         */
        @NameInMap("load_balancer_id")
        public String loadBalancerId;

        public static DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig self = new DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig extends TeaModel {
        /**
         * <p>The internal DNS configuration of the cluster, applicable to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API server. If internal domain name access is not enabled, node-side system components access the API server by using the IP address of the Classic Load Balancer (CLB) instance.</p>
         */
        @NameInMap("internal_dns_config")
        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

        /**
         * <p>The load balancing configuration for cluster access.</p>
         */
        @NameInMap("load_balancers_config")
        public java.util.List<DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig> loadBalancersConfig;

        public static DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig self = new DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig setInternalDnsConfig(DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig) {
            this.internalDnsConfig = internalDnsConfig;
            return this;
        }
        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig getInternalDnsConfig() {
            return this.internalDnsConfig;
        }

        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig setLoadBalancersConfig(java.util.List<DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig> loadBalancersConfig) {
            this.loadBalancersConfig = loadBalancersConfig;
            return this;
        }
        public java.util.List<DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigLoadBalancersConfig> getLoadBalancersConfig() {
            return this.loadBalancersConfig;
        }

    }

    public static class DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>The automatic upgrade channel of the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade channels</a>. Valid values:</p>
         * <ul>
         * <li>patch: The latest patch version.</li>
         * <li>stable: The second latest minor version.</li>
         * <li>rapid: The latest minor version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether automatic cluster upgrade is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade self = new DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeClusterDetailResponseBodyOperationPolicy extends TeaModel {
        /**
         * <p>The automatic upgrade configuration of the cluster.</p>
         */
        @NameInMap("cluster_auto_upgrade")
        public DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade clusterAutoUpgrade;

        public static DescribeClusterDetailResponseBodyOperationPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyOperationPolicy self = new DescribeClusterDetailResponseBodyOperationPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyOperationPolicy setClusterAutoUpgrade(DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade clusterAutoUpgrade) {
            this.clusterAutoUpgrade = clusterAutoUpgrade;
            return this;
        }
        public DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade getClusterAutoUpgrade() {
            return this.clusterAutoUpgrade;
        }

    }

    public static class DescribeClusterDetailResponseBodyRrsaConfig extends TeaModel {
        /**
         * <p>The default audience of the OIDC token. If multiple values are included, they are separated by commas (,). These values form an array for the <code>aud</code> field in the OIDC token.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://kubernetes.default.svc,https://example.***.com">https://kubernetes.default.svc,https://example.***.com</a></p>
         */
        @NameInMap("audience")
        public String audience;

        /**
         * <p>Specifies whether RRSA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The issuer of the OIDC token. If multiple values are included, they are separated by commas (,). The first value is used as the <code>iss</code> field in the OIDC token and the issuer URL of the OIDC identity provider (IdP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oidc-ack-***,https://kubernetes.default.svc">https://oidc-ack-***,https://kubernetes.default.svc</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The URL of the OIDC public key.</p>
         */
        @NameInMap("jwks_url")
        public String jwksUrl;

        /**
         * <p>The maximum configurable validity period of the OIDC token.</p>
         * 
         * <strong>example:</strong>
         * <p>12h</p>
         */
        @NameInMap("max_oidc_token_expiration")
        public String maxOidcTokenExpiration;

        /**
         * <p>The ARN of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1138***:oidc-provider/ack-rrsa-***</p>
         */
        @NameInMap("oidc_arn")
        public String oidcArn;

        /**
         * <p>The name of the OIDC IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-rrsa-***</p>
         */
        @NameInMap("oidc_name")
        public String oidcName;

        /**
         * <p>The URL of the OIDC configuration document.</p>
         */
        @NameInMap("open_api_configuration_url")
        public String openApiConfigurationUrl;

        public static DescribeClusterDetailResponseBodyRrsaConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyRrsaConfig self = new DescribeClusterDetailResponseBodyRrsaConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setAudience(String audience) {
            this.audience = audience;
            return this;
        }
        public String getAudience() {
            return this.audience;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setJwksUrl(String jwksUrl) {
            this.jwksUrl = jwksUrl;
            return this;
        }
        public String getJwksUrl() {
            return this.jwksUrl;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setMaxOidcTokenExpiration(String maxOidcTokenExpiration) {
            this.maxOidcTokenExpiration = maxOidcTokenExpiration;
            return this;
        }
        public String getMaxOidcTokenExpiration() {
            return this.maxOidcTokenExpiration;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setOidcArn(String oidcArn) {
            this.oidcArn = oidcArn;
            return this;
        }
        public String getOidcArn() {
            return this.oidcArn;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setOidcName(String oidcName) {
            this.oidcName = oidcName;
            return this;
        }
        public String getOidcName() {
            return this.oidcName;
        }

        public DescribeClusterDetailResponseBodyRrsaConfig setOpenApiConfigurationUrl(String openApiConfigurationUrl) {
            this.openApiConfigurationUrl = openApiConfigurationUrl;
            return this;
        }
        public String getOpenApiConfigurationUrl() {
            return this.openApiConfigurationUrl;
        }

    }

}
