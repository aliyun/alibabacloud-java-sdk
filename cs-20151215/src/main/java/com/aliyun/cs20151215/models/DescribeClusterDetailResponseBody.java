// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    /**
     * <p>Smart managed mode configuration.</p>
     */
    @NameInMap("auto_mode")
    public DescribeClusterDetailResponseBodyAutoMode autoMode;

    /**
     * <p>Local domain name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster.local</p>
     */
    @NameInMap("cluster_domain")
    public String clusterDomain;

    /**
     * <p>Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>Cluster specification when <code>cluster_type</code> is set to <code>ManagedKubernetes</code> and <code>profile</code> is configured. Valid values:</p>
     * <ul>
     * <li><p><code>ack.standard</code>: Basic Edition (default if left empty)</p>
     * </li>
     * <li><p><code>ack.pro.small</code>: Pro Edition</p>
     * </li>
     * <li><p><code>ack.pro.xlarge</code>: Pro XL</p>
     * </li>
     * <li><p><code>ack.pro.2xlarge</code>: Pro 2XL</p>
     * </li>
     * <li><p><code>ack.pro.4xlarge</code>: Pro 4XL (requires whitelist approval from customer service)</p>
     * </li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers offered by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. These tiers pre-allocate and dedicate control plane resources to ensure consistent high performance for API concurrency and pod scheduling, making them suitable for AI training and inference, large-scale clusters, and mission-critical workloads.</p>
     * <p>For cluster management fees of Pro Edition and provisioned control plane clusters, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>Cluster type.</p>
     * <ul>
     * <li><p><code>Kubernetes</code>: ACK dedicated cluster.</p>
     * </li>
     * <li><p><code>ManagedKubernetes</code>: ACK managed clusters, including ACK Pro Edition and Basic Edition clusters, ACK Serverless clusters (Pro and Basic), ACK Edge clusters (Pro and Basic), and ACK LINGJUN clusters (Pro).</p>
     * </li>
     * <li><p><code>ExternalKubernetes</code>: registered cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>CIDR block for pod networks, used with Flannel.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.xx.xx/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>Control plane configuration for dedicated clusters.</p>
     */
    @NameInMap("control_plane_config")
    public DescribeClusterDetailResponseBodyControlPlaneConfig controlPlaneConfig;

    /**
     * <p>Cluster connection configuration.</p>
     */
    @NameInMap("control_plane_endpoints_config")
    public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>Time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-07T09:57:26+08:00</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>Current Kubernetes version of the cluster. For supported Kubernetes versions in ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Overview of Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("current_version")
    public String currentVersion;

    /**
     * <p>Deletion protection for the cluster prevents accidental deletion through the console or API. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Deletion protection is enabled. You cannot delete the cluster through the console or API.</p>
     * </li>
     * <li><p><code>false</code>: Deletion protection is disabled. You can delete the cluster through the console or API.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>Docker version used in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>19.03.5</p>
     */
    @NameInMap("docker_version")
    @Deprecated
    public String dockerVersion;

    /**
     * <p>ID of the Server Load Balancer instance used for the cluster Ingress.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zehc05z3b8dwiifh****</p>
     */
    @NameInMap("external_loadbalancer_id")
    @Deprecated
    public String externalLoadbalancerId;

    /**
     * <p>Custom Subject Alternative Names (SANs) for the API server certificate.</p>
     */
    @NameInMap("extra_sans")
    public java.util.List<String> extraSans;

    /**
     * <p>Initial Kubernetes version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("init_version")
    public String initVersion;

    /**
     * <p>IP protocol stack of the cluster. Valid values:</p>
     * <ul>
     * <li><p>ipv4: Creates a cluster that supports IPv4 only.</p>
     * </li>
     * <li><p>dual: Creates a cluster that supports both IPv4 and IPv6.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>Maintenance window configuration for the cluster. This setting applies only to managed clusters (ACK Pro clusters).</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>Cluster endpoint, including internal and public endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;intranet_api_server_endpoint\&quot;:\&quot;<a href="https://192.168.xx.xx:6443%5C%5C%22***%7D">https://192.168.xx.xx:6443\\&quot;***}</a></p>
     */
    @NameInMap("master_url")
    public String masterUrl;

    /**
     * <p>Metadata of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;Addons\&quot;:***</p>
     */
    @NameInMap("meta_data")
    public String metaData;

    /**
     * <p>Cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Network type used by the cluster, such as VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("network_mode")
    @Deprecated
    public String networkMode;

    /**
     * <p>Next available Kubernetes version for upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>1.xx.x-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>Applies only to Flannel network plugin.</p>
     * <p>Subnet mask size allocated to each node, which controls the number of IP addresses assignable to the node.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>Automatic O\&amp;M policy for the cluster.</p>
     */
    @NameInMap("operation_policy")
    public DescribeClusterDetailResponseBodyOperationPolicy operationPolicy;

    /**
     * <p>Collection of ROS parameters for the cluster.</p>
     */
    @NameInMap("parameters")
    @Deprecated
    public java.util.Map<String, String> parameters;

    /**
     * <p>Indicates whether PrivateZone is enabled for the cluster.</p>
     * <ul>
     * <li><p><code>true</code>: Enabled.</p>
     * </li>
     * <li><p><code>false</code>: Disabled.</p>
     * </li>
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
     * <p>Cluster subtype.</p>
     * <ul>
     * <li><p><code>Default</code>: ACK managed cluster, including ACK Pro Edition and Basic Edition.</p>
     * </li>
     * <li><p><code>Edge</code>: ACK Edge cluster, including ACK Edge Pro Edition and Basic Edition.</p>
     * </li>
     * <li><p><code>Serverless</code>: ACK Serverless cluster, including ACK Serverless Pro Edition and Basic Edition.</p>
     * </li>
     * <li><p><code>Lingjun</code>: ACK LINGJUN cluster, available in Pro Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>kube-proxy proxy mode.</p>
     * <ul>
     * <li><p><code>iptables</code>: A mature and stable kube-proxy mode that uses iptables rules for Kubernetes service discovery and load balancing. Performance is moderate and degrades at scale. Suitable for clusters with a small number of services.</p>
     * </li>
     * <li><p><code>ipvs</code>: A high-performance kube-proxy mode that uses the Linux IPVS module for Kubernetes service discovery and load balancing. Suitable for clusters with many services and high load balancing demands.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>Region ID where the cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>Resource group ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyvw3wjm****</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    /**
     * <p>RRSA configuration.</p>
     */
    @NameInMap("rrsa_config")
    public DescribeClusterDetailResponseBodyRrsaConfig rrsaConfig;

    /**
     * <p>Security group ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-25yq****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

    /**
     * <p>CIDR block for service networks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.xx.xx/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>Total number of nodes in the cluster, including master and worker nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>Cluster status. Valid values:</p>
     * <ul>
     * <li><p><code>initial</code>: The cluster is being created.</p>
     * </li>
     * <li><p><code>failed</code>: Cluster creation failed.</p>
     * </li>
     * <li><p><code>running</code>: The cluster is running.</p>
     * </li>
     * <li><p><code>updating</code>: The cluster is being updated.</p>
     * </li>
     * <li><p><code>upgrading</code>: The cluster is being upgraded.</p>
     * </li>
     * <li><p><code>removing</code>: Nodes are being removed.</p>
     * </li>
     * <li><p><code>draining</code>: Nodes are being drained.</p>
     * </li>
     * <li><p><code>scaling</code>: The cluster is scaling.</p>
     * </li>
     * <li><p><code>inactive</code>: The cluster is inactive.</p>
     * </li>
     * <li><p><code>unavailable</code>: The cluster is unavailable.</p>
     * </li>
     * <li><p><code>deleting</code>: The cluster is being deleted.</p>
     * </li>
     * <li><p><code>deleted</code>: The cluster has been deleted.</p>
     * </li>
     * <li><p><code>delete_failed</code>: Cluster deletion failed.</p>
     * </li>
     * <li><p><code>waiting</code>: Waiting for access.</p>
     * </li>
     * <li><p><code>disconnected</code>: Disconnected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>CIDR block for pod networks.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.xx.xx/16</p>
     */
    @NameInMap("subnet_cidr")
    @Deprecated
    public String subnetCidr;

    /**
     * <p>Tags associated with the cluster.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>Time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    /**
     * <p>Last time the cluster was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-10T13:28:09+08:00</p>
     */
    @NameInMap("updated")
    public String updated;

    /**
     * <p>VPC ID of the cluster. This parameter is required when creating a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zecuu62b9zw7a7qn****</p>
     */
    @NameInMap("vpc_id")
    public String vpcId;

    /**
     * <p>vSwitch ID. This field is deprecated. Use vswitch_ids to query control plane vSwitches and node pool vswitch_ids to query data plane vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zete8s4qocqg0mf6****,vsw-2zete8s4qocqg0mf6****</p>
     */
    @NameInMap("vswitch_id")
    @Deprecated
    public String vswitchId;

    /**
     * <p>vSwitches for the cluster control plane.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>Name of the RAM role assigned to ECS instances acting as worker nodes in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
     */
    @NameInMap("worker_ram_role_name")
    public String workerRamRoleName;

    /**
     * <p>Zone ID within the region where the cluster is deployed.</p>
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
         * <p>Indicates whether smart managed mode is enabled.</p>
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
         * <p>Indicates whether auto-renewal is enabled for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        /**
         * <p>Auto-renewal duration for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>Billing method for control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Indicates whether Cloud Monitor is installed on nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>CPU management policy for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        /**
         * <p>Deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp10b35imuam5amw****</p>
         */
        @NameInMap("deploymentset_id")
        public String deploymentsetId;

        /**
         * <p>Image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>Operating system image type.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>Metadata access configuration for ECS instances.</p>
         */
        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>Instance types for control plane nodes.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>Key pair name. Specify either this parameter or login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>Port range for node services.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>Subscription duration for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>Time unit for node subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>Runtime name.</p>
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
         * <p>Number of control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>Indicates whether security hardening for compliance is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Indicates whether burst performance is enabled for node system disks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>System disk category for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>Disk performance level for node system disks. Applies only to ESSD disks.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>Provisioned IOPS for node system disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>System disk size for nodes, in GB. Minimum value: 40.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>Automatic snapshot backup policy for node system disks.</p>
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
         * <p>VPCs where the internal domain name resolution takes effect. By default, this includes the VPC where the cluster resides.</p>
         */
        @NameInMap("bind_vpcs")
        public java.util.List<String> bindVpcs;

        /**
         * <p>Indicates whether internal domain name access is enabled.</p>
         * <ul>
         * <li>true: Internal domain name access is enabled. Node-side components (kubelet, kube-proxy) access the API server through the internal domain name.</li>
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

    public static class DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig extends TeaModel {
        /**
         * <p>Internal domain name configuration for the cluster, applicable to ACK managed clusters. The internal domain name allows node-side system components such as kubelet and kube-proxy to access the API server. If internal domain name access is disabled, these components access the API server through the CLB IP address.</p>
         */
        @NameInMap("internal_dns_config")
        public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfigInternalDnsConfig internalDnsConfig;

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

    }

    public static class DescribeClusterDetailResponseBodyOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>Frequency of automatic cluster upgrades. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade frequency</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>patch: Latest patch version.</p>
         * </li>
         * <li><p>stable: Second latest minor version.</p>
         * </li>
         * <li><p>rapid: Latest minor version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Indicates whether automatic cluster upgrade is enabled.</p>
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
         * <p>Automatic cluster upgrade settings.</p>
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
         * <p>Default audience for the OIDC token. Multiple values are separated by commas (,). These values appear as an array in the aud field of the OIDC token.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://kubernetes.default.svc,https://example.***.com">https://kubernetes.default.svc,https://example.***.com</a></p>
         */
        @NameInMap("audience")
        public String audience;

        /**
         * <p>Indicates whether RRSA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Issuer of the OIDC token. Multiple values are separated by commas (,). The first value appears in the iss field of the OIDC token and serves as the issuer URL for the OIDC identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oidc-ack-***,https://kubernetes.default.svc">https://oidc-ack-***,https://kubernetes.default.svc</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>URL of the OIDC public key information.</p>
         */
        @NameInMap("jwks_url")
        public String jwksUrl;

        /**
         * <p>Maximum validity period configurable for the OIDC token.</p>
         * 
         * <strong>example:</strong>
         * <p>12h</p>
         */
        @NameInMap("max_oidc_token_expiration")
        public String maxOidcTokenExpiration;

        /**
         * <p>ARN of the OIDC identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1138***:oidc-provider/ack-rrsa-***</p>
         */
        @NameInMap("oidc_arn")
        public String oidcArn;

        /**
         * <p>Name of the OIDC identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-rrsa-***</p>
         */
        @NameInMap("oidc_name")
        public String oidcName;

        /**
         * <p>URL of the OIDC configuration document.</p>
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
