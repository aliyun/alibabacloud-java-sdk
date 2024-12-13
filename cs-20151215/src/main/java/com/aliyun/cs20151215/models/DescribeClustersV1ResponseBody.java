// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1ResponseBody extends TeaModel {
    /**
     * <p>Details of the clusters.</p>
     */
    @NameInMap("clusters")
    public java.util.List<DescribeClustersV1ResponseBodyClusters> clusters;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page_info")
    public DescribeClustersV1ResponseBodyPageInfo pageInfo;

    public static DescribeClustersV1ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersV1ResponseBody self = new DescribeClustersV1ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersV1ResponseBody setClusters(java.util.List<DescribeClustersV1ResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersV1ResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeClustersV1ResponseBody setPageInfo(DescribeClustersV1ResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeClustersV1ResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade extends TeaModel {
        /**
         * <p>The frequency of auto cluster updates. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Update frequency</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>patch: the latest patch version.</li>
         * <li>stables: the second-latest minor version.</li>
         * <li>rapid: the latest minor version.</li>
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

        public static DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade self = new DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeClustersV1ResponseBodyClustersOperationPolicy extends TeaModel {
        /**
         * <p>The configurations of auto cluster update.</p>
         */
        @NameInMap("cluster_auto_upgrade")
        public DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade clusterAutoUpgrade;

        public static DescribeClustersV1ResponseBodyClustersOperationPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClustersOperationPolicy self = new DescribeClustersV1ResponseBodyClustersOperationPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClustersOperationPolicy setClusterAutoUpgrade(DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade clusterAutoUpgrade) {
            this.clusterAutoUpgrade = clusterAutoUpgrade;
            return this;
        }
        public DescribeClustersV1ResponseBodyClustersOperationPolicyClusterAutoUpgrade getClusterAutoUpgrade() {
            return this.clusterAutoUpgrade;
        }

    }

    public static class DescribeClustersV1ResponseBodyClusters extends TeaModel {
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
         * <p>c3fb96524f9274b4495df0f12a6b5****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure the <code>profile</code> parameter, you can further specify the edition of the cluster. Valid values:</p>
         * <ul>
         * <li><code>ack.pro.small</code>: ACK Pro cluster.</li>
         * <li><code>ack.standard</code>: ACK Basic cluster. If you leave the parameter empty, ACK Basic cluster is selected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.standard</p>
         */
        @NameInMap("cluster_spec")
        public String clusterSpec;

        /**
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
         * <li><code>ExternalKubernetes</code>: registered cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>The pod CIDR block and the configuration of the Flannel network plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        @NameInMap("container_cidr")
        public String containerCidr;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-20T10:51:29+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The Kubernetes version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.9-aliyun.1</p>
         */
        @NameInMap("current_version")
        public String currentVersion;

        /**
         * <p>Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the ACK console or by calling API operations. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.</li>
         * <li><code>false</code>: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.</li>
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
        public String dockerVersion;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance that is used by the Ingresses of the cluster.</p>
         * <p>The default SLB specification is slb.s1.small, which belongs to the high-performance instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2vcrbmlevo6kjpgch****</p>
         */
        @NameInMap("external_loadbalancer_id")
        public String externalLoadbalancerId;

        /**
         * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not configure this parameter, the latest Kubernetes version is used.</p>
         * <p>You can create clusters that run the latest two Kubernetes versions in the ACK console. You can call the API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.9-aliyun.1</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <p>The IP stack of the cluster. Valid values:</p>
         * <ul>
         * <li>ipv4: The cluster is an IPv4 cluster.</li>
         * <li>dual: The cluster is a dual-stack cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("ip_stack")
        public String ipStack;

        /**
         * <p>The maintenance window of the cluster. This feature is available only for ACK managed clusters and ACK Serverless clusters.</p>
         */
        @NameInMap("maintenance_window")
        public MaintenanceWindow maintenanceWindow;

        /**
         * <p>The address of the cluster API server. It includes an internal endpoint and a public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;api_server_endpoint\&quot;:\&quot;\&quot;,\&quot;intranet_api_server_endpoint\&quot;:\&quot;<a href="https://192.168.0.251:6443%5C%5C%22%7D">https://192.168.0.251:6443\\&quot;}</a></p>
         */
        @NameInMap("master_url")
        public String masterUrl;

        /**
         * <p>The metadata of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Addons\&quot;:[{\&quot;config\&quot;:***}</p>
         */
        @NameInMap("meta_data")
        public String metaData;

        /**
         * <p>The cluster name.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network mode of the cluster. Valid values:</p>
         * <ul>
         * <li><code>classic</code>: classic network.</li>
         * <li><code>vpc</code>: virtual private cloud (VPC).</li>
         * <li><code>overlay</code>: overlay network.</li>
         * <li><code>calico</code>: network powered by Calico.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("network_mode")
        public String networkMode;

        /**
         * <p>The Kubernetes version to which the cluster can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1.18.8-aliyun.1</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>The automatic O\&amp;M policy of the cluster.</p>
         */
        @NameInMap("operation_policy")
        public DescribeClustersV1ResponseBodyClustersOperationPolicy operationPolicy;

        /**
         * <p>Indicates whether Alibaba Cloud DNS PrivateZone is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Alibaba Cloud DNS PrivateZone is enabled.</li>
         * <li><code>false</code>: Alibaba Cloud DNS PrivateZone is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("private_zone")
        public Boolean privateZone;

        /**
         * <p>The cluster identifier. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
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
         * <p>The Kube-proxy mode. Valid values:</p>
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

        /**
         * <p>The ID of the security group of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2vcgwsrwgt5mp0yi****</p>
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
         * <p>The number of nodes in the cluster, including control planes and worker nodes.</p>
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
         * <p>Tis parameter is deprecated. Use the container_cidr parameter to obtain the pod CIDR block. The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:</p>
         * <ul>
         * <li>10.0.0.0/8</li>
         * <li>172.16-31.0.0/12-16</li>
         * <li>192.168.0.0/16</li>
         * </ul>
         * <p>The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
         * <p>For more information about the network planning of Container Service for Kubernetes (ACK) clusters, see <a href="https://help.aliyun.com/document_detail/86500.html">Plan CIDR blocks for an ACK cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.0.0/16</p>
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
         * <p>2020-09-16T11:09:55+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <p>The ID of the VPC where the cluster is deployed. This parameter is required when you create a cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vcg932hsxsxuqbgl****</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        /**
         * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. To ensure the high availability of the cluster, we recommend that you select vSwitches in different zones.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vc41xuumx5z2rdma****,vsw-2vc41xuumx5z2rdma****</p>
         */
        @NameInMap("vswitch_id")
        @Deprecated
        public String vswitchId;

        /**
         * <p>The vSwitches of the control planes.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        /**
         * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.</p>
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
         * <p>cn-beijing-b</p>
         */
        @NameInMap("zone_id")
        public String zoneId;

        public static DescribeClustersV1ResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClusters self = new DescribeClustersV1ResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeClustersV1ResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersV1ResponseBodyClusters setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeClustersV1ResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClustersV1ResponseBodyClusters setContainerCidr(String containerCidr) {
            this.containerCidr = containerCidr;
            return this;
        }
        public String getContainerCidr() {
            return this.containerCidr;
        }

        public DescribeClustersV1ResponseBodyClusters setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClustersV1ResponseBodyClusters setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeClustersV1ResponseBodyClusters setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeClustersV1ResponseBodyClusters setDockerVersion(String dockerVersion) {
            this.dockerVersion = dockerVersion;
            return this;
        }
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        public DescribeClustersV1ResponseBodyClusters setExternalLoadbalancerId(String externalLoadbalancerId) {
            this.externalLoadbalancerId = externalLoadbalancerId;
            return this;
        }
        public String getExternalLoadbalancerId() {
            return this.externalLoadbalancerId;
        }

        public DescribeClustersV1ResponseBodyClusters setInitVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }
        public String getInitVersion() {
            return this.initVersion;
        }

        public DescribeClustersV1ResponseBodyClusters setIpStack(String ipStack) {
            this.ipStack = ipStack;
            return this;
        }
        public String getIpStack() {
            return this.ipStack;
        }

        public DescribeClustersV1ResponseBodyClusters setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public MaintenanceWindow getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

        public DescribeClustersV1ResponseBodyClusters setMasterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
            return this;
        }
        public String getMasterUrl() {
            return this.masterUrl;
        }

        public DescribeClustersV1ResponseBodyClusters setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public DescribeClustersV1ResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersV1ResponseBodyClusters setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public DescribeClustersV1ResponseBodyClusters setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
        }

        public DescribeClustersV1ResponseBodyClusters setOperationPolicy(DescribeClustersV1ResponseBodyClustersOperationPolicy operationPolicy) {
            this.operationPolicy = operationPolicy;
            return this;
        }
        public DescribeClustersV1ResponseBodyClustersOperationPolicy getOperationPolicy() {
            return this.operationPolicy;
        }

        public DescribeClustersV1ResponseBodyClusters setPrivateZone(Boolean privateZone) {
            this.privateZone = privateZone;
            return this;
        }
        public Boolean getPrivateZone() {
            return this.privateZone;
        }

        public DescribeClustersV1ResponseBodyClusters setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeClustersV1ResponseBodyClusters setProxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }
        public String getProxyMode() {
            return this.proxyMode;
        }

        public DescribeClustersV1ResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClustersV1ResponseBodyClusters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClustersV1ResponseBodyClusters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClustersV1ResponseBodyClusters setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public DescribeClustersV1ResponseBodyClusters setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeClustersV1ResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersV1ResponseBodyClusters setSubnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        public DescribeClustersV1ResponseBodyClusters setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public DescribeClustersV1ResponseBodyClusters setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeClustersV1ResponseBodyClusters setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public DescribeClustersV1ResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersV1ResponseBodyClusters setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeClustersV1ResponseBodyClusters setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public DescribeClustersV1ResponseBodyClusters setWorkerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

        public DescribeClustersV1ResponseBodyClusters setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeClustersV1ResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        public static DescribeClustersV1ResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyPageInfo self = new DescribeClustersV1ResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClustersV1ResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeClustersV1ResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
