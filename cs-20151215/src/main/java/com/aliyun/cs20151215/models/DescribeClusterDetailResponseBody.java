// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    @NameInMap("auto_mode")
    public DescribeClusterDetailResponseBodyAutoMode autoMode;

    /**
     * <p>The domain name of the cluster.</p>
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
     * <p>The edition of the cluster</p>
     * <ul>
     * <li><code>ack.pro.small</code>: the Pro edition.</li>
     * <li><code>ack.standard</code>: the Basic edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of the instance.</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK managed Basic clusters, ACK managed Pro clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, ACK Edge Basic clusters, and ACK Lingjun Pro clusters.</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The pod CIDR block. The configuration of the Flannel network plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("container_cidr")
    public String containerCidr;

    /**
     * <p>The control plane configurations in an ACK dedicated cluster.</p>
     */
    @NameInMap("control_plane_config")
    public DescribeClusterDetailResponseBodyControlPlaneConfig controlPlaneConfig;

    @NameInMap("control_plane_endpoints_config")
    public DescribeClusterDetailResponseBodyControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-25T15:50:20+08:00</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The Kubernetes version of the cluster. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.6-aliyun.1</p>
     */
    @NameInMap("current_version")
    public String currentVersion;

    /**
     * <p>Indicates whether deletion protection is enabled for the cluster. If deletion protection is enabled, the cluster cannot be deleted in the Container Service console or by calling API operations. Valid values:</p>
     * <ul>
     * <li><code>true</code>: deletion protection is enabled for the cluster. This way, the cluster cannot be deleted in the Container Service console or by calling API operations.</li>
     * <li><code>false</code>: deletion protection is disabled for the cluster. This way, the cluster can be deleted in the Container Service console or by calling API operations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    /**
     * <p>The Docker version that is used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>19.03.5</p>
     */
    @NameInMap("docker_version")
    @Deprecated
    public String dockerVersion;

    /**
     * <p>The ID of the Server Load Balancer (SLB) instance that is created for the Ingress of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zehc05z3b8dwiifh****</p>
     */
    @NameInMap("external_loadbalancer_id")
    @Deprecated
    public String externalLoadbalancerId;

    @NameInMap("extra_sans")
    public java.util.List<String> extraSans;

    /**
     * <p>The initial Kubernetes version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.6-aliyun.1</p>
     */
    @NameInMap("init_version")
    public String initVersion;

    /**
     * <p>The IP stack of the cluster. Valid values:</p>
     * <ul>
     * <li>ipv4: The cluster is an IPv4 cluster.</li>
     * <li>dual: The cluster is an IPv4/IPv6 dual-stack cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("ip_stack")
    public String ipStack;

    /**
     * <p>The maintenance window of the cluster. This feature is available only in ACK Pro clusters.</p>
     */
    @NameInMap("maintenance_window")
    public MaintenanceWindow maintenanceWindow;

    /**
     * <p>The endpoints of the cluster, including an internal endpoint and a public endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;intranet_api_server_endpoint\&quot;:\&quot;<a href="https://192.168.0.251:6443%5C%5C%22***%7D">https://192.168.0.251:6443\\&quot;***}</a></p>
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
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network type of the cluster. Example: Virtual Private Cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("network_mode")
    @Deprecated
    public String networkMode;

    /**
     * <p>The Kubernetes version to which the cluster can be upgraded.</p>
     * 
     * <strong>example:</strong>
     * <p>1.18.8-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>This parameter is available only for Flannel.</p>
     * <p>The subnet mask length of the node CIDR block. This parameter indicates the maximum number of IP addresses that can be assigned to nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("node_cidr_mask")
    public String nodeCidrMask;

    /**
     * <p>The automatic O\&amp;M policy of the cluster.</p>
     */
    @NameInMap("operation_policy")
    public DescribeClusterDetailResponseBodyOperationPolicy operationPolicy;

    /**
     * <p>The Resource Orchestration Service (ROS) parameters of the cluster.</p>
     */
    @NameInMap("parameters")
    @Deprecated
    public java.util.Map<String, String> parameters;

    /**
     * <p>Indicates whether Alibaba Cloud DNS PrivateZone (PrivateZone) is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li><code>true</code>: PrivateZone is enabled.</li>
     * <li><code>false</code>: PrivateZone is dislabled.</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("private_zone")
    @Deprecated
    public Boolean privateZone;

    /**
     * <p>The subtype of the cluster.</p>
     * <ul>
     * <li><code>Default</code>. ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
     * <li><code>Edge</code>: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
     * <li><code>Serverless</code>: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
     * <li><code>Lingjun</code>: ACK Lingjun Pro cluster.</li>
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
     * <li><code>iptables</code>: a mature and stable kube-proxy mode that uses iptables rules to conduct Service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.</li>
     * <li><code>ipvs</code>: provides high performance and uses IP Virtual Server (IPVS). This allows you to configure service discovery and load balancing. This mode is suitable for clusters that are required to run a large number of services. We recommend that you use this mode in scenarios that require high load balancing performance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipvs</p>
     */
    @NameInMap("proxy_mode")
    public String proxyMode;

    /**
     * <p>The region ID of the cluster.</p>
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
     * <p>The Service CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.21.0.0/20</p>
     */
    @NameInMap("service_cidr")
    public String serviceCidr;

    /**
     * <p>The number of nodes in the cluster. Master nodes and worker nodes are included.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The status of the cluster. Valid values:</p>
     * <ul>
     * <li><code>initial</code>: The cluster is being created.</li>
     * <li><code>failed</code>: The cluster failed to be created.</li>
     * <li><code>running</code>: The cluster is running.</li>
     * <li><code>updating</code>: The cluster is being updated.</li>
     * <li><code>updating_failed</code>: The cluster failed to be updated.</li>
     * <li><code>scaling</code>: The cluster is being scaled.</li>
     * <li><code>waiting</code>: The cluster is waiting for connection requests.</li>
     * <li><code>disconnected</code>: The cluster is disconnected.</li>
     * <li><code>stopped</code>: The cluster is stopped.</li>
     * <li><code>deleting</code>: The cluster is being deleted.</li>
     * <li><code>deleted</code>: The cluster is deleted.</li>
     * <li><code>delete_failed</code>: The cluster failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The pod CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("subnet_cidr")
    @Deprecated
    public String subnetCidr;

    /**
     * <p>The resource labels of the cluster.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The time zone</p>
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
     * <p>2020-01-13T23:01:03+08:00</p>
     */
    @NameInMap("updated")
    public String updated;

    /**
     * <p>The ID of the VPC where the cluster is deployed. This parameter is required when you create a cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zecuu62b9zw7a7qn****</p>
     */
    @NameInMap("vpc_id")
    public String vpcId;

    /**
     * <p>The ID of the vSwitche. This field is deprecated. Use vswitch_ids to query the vSwitches on the control plane and vswitch_ids to query the vSwitches on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zete8s4qocqg0mf6****,vsw-2zete8s4qocqg0mf6****</p>
     */
    @NameInMap("vswitch_id")
    @Deprecated
    public String vswitchId;

    /**
     * <p>The vSwitch for the control plane of the cluster.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage Elastic Compute Service (ECS) instances.</p>
     * 
     * <strong>example:</strong>
     * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
     */
    @NameInMap("worker_ram_role_name")
    public String workerRamRoleName;

    /**
     * <p>The ID of the zone within the region where the cluster is located.</p>
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
         * <p>The auto-renewal duration for the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        /**
         * <p>The billing method of the control plane node.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("charge_type")
        public String chargeType;

        /**
         * <p>Indicates whether to install CloudMonitor for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloud_monitor_flags")
        public Boolean cloudMonitorFlags;

        /**
         * <p>The CPU management policy of nodes.</p>
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
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The type of the OS image.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        @NameInMap("image_type")
        public String imageType;

        @NameInMap("instance_metadata_options")
        public InstanceMetadataOptions instanceMetadataOptions;

        /**
         * <p>The instance types of the nodes.</p>
         */
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The name of the key pair. You must set key_pair or login_password.</p>
         * 
         * <strong>example:</strong>
         * <p>ack</p>
         */
        @NameInMap("key_pair")
        public String keyPair;

        /**
         * <p>The node port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("node_port_range")
        public String nodePortRange;

        /**
         * <p>The subscription duration of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The unit of the subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("period_unit")
        public String periodUnit;

        /**
         * <p>The runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>Indicates whether to enable Alibaba Cloud Linux Security Hardening.</p>
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
         * <p>Indicates whether to enable Multi-Level Protection Scheme (MLPS) security hardening.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("soc_enabled")
        public Boolean socEnabled;

        /**
         * <p>Indicates whether to enable the burst feature for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_disk_bursting_enabled")
        public Boolean systemDiskBurstingEnabled;

        /**
         * <p>The category of the system disk for nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        /**
         * <p>The performance level (PL) of the system disk that you want to use for the node. This parameter takes effect only for ESSDs.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The preset read/write IOPS of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("system_disk_provisioned_iops")
        public Long systemDiskProvisionedIops;

        /**
         * <p>The system disk size of the node. The value must be at least 40 GB.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        /**
         * <p>The automatic snapshot policy of the node.</p>
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
        @NameInMap("bind_vpcs")
        public java.util.List<String> bindVpcs;

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
         * <p>The frequency of auto cluster updates. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Update frequency</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>patch: specifies the latest patch version.</li>
         * <li>stable: specifies the second-latest minor version.</li>
         * <li>rapid: specifies the latest minor version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Specifies whether to enable auto cluster update.</p>
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
         * <p>The configurations of auto cluster update.</p>
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
        @NameInMap("audience")
        public String audience;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("issuer")
        public String issuer;

        @NameInMap("jwks_url")
        public String jwksUrl;

        @NameInMap("max_oidc_token_expiration")
        public String maxOidcTokenExpiration;

        @NameInMap("oidc_arn")
        public String oidcArn;

        @NameInMap("oidc_name")
        public String oidcName;

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
