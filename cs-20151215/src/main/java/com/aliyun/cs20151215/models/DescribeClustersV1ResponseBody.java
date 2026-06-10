// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1ResponseBody extends TeaModel {
    /**
     * <p>A list of clusters.</p>
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
         * <p>The upgrade channel. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade channels</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>patch</code>: Upgrades the cluster to the latest available patch version.</p>
         * </li>
         * <li><p><code>stable</code>: Upgrades the cluster to the latest stable minor version. This version is typically the second latest minor version.</p>
         * </li>
         * <li><p><code>rapid</code>: Upgrades the cluster to the latest available minor version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>patch</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Indicates whether auto-upgrade is enabled for the cluster.</p>
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
         * <p>The cluster auto-upgrade policy.</p>
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
         * <p>The edition of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ack.standard</p>
         */
        @NameInMap("cluster_spec")
        public String clusterSpec;

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>The CIDR block of pods. This parameter is applicable to Flannel networks.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.xx.xx/16</p>
         */
        @NameInMap("container_cidr")
        public String containerCidr;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-07T09:57:26+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The current version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        @NameInMap("current_version")
        public String currentVersion;

        /**
         * <p>Indicates whether deletion protection is enabled. If deletion protection is enabled, you cannot delete the cluster in the console or by calling an API operation. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Deletion protection is enabled.</p>
         * </li>
         * <li><p><code>false</code>: Deletion protection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        /**
         * <p>The Docker version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>19.03.5</p>
         */
        @NameInMap("docker_version")
        @Deprecated
        public String dockerVersion;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance that is used for the Ingress.</p>
         * <p>Default instance specification: slb.s1.small (performance-guaranteed).</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2vcrbmlevo6kjpgch****</p>
         */
        @NameInMap("external_loadbalancer_id")
        @Deprecated
        public String externalLoadbalancerId;

        /**
         * <p>The initial version of the cluster. For information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Kubernetes release overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <p>The IP stack of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>ipv4</code>: an IPv4-only cluster.</p>
         * </li>
         * <li><p><code>dual</code>: a dual-stack cluster that supports both IPv4 and IPv6.</p>
         * </li>
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
         * <p>The endpoints of the API server. The endpoints include an internal endpoint and a public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;api_server_endpoint\&quot;:\&quot;\&quot;,\&quot;intranet_api_server_endpoint\&quot;:\&quot;<a href="https://192.168.xx.xx:6443%5C%5C%22%7D">https://192.168.xx.xx:6443\\&quot;}</a></p>
         */
        @NameInMap("master_url")
        public String masterUrl;

        /**
         * <p>The metadata of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Addons\&quot;:[{\&quot;config\&quot;:***}}</p>
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
         * <p>The network mode of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>classic</code>: classic network</p>
         * </li>
         * <li><p><code>vpc</code>: VPC</p>
         * </li>
         * <li><p><code>overlay</code>: overlay network</p>
         * </li>
         * <li><p><code>calico</code>: Calico network</p>
         * </li>
         * </ul>
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
         * <p>The auto O\&amp;M policy of the cluster.</p>
         */
        @NameInMap("operation_policy")
        public DescribeClustersV1ResponseBodyClustersOperationPolicy operationPolicy;

        /**
         * <p>Indicates whether PrivateZone is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: PrivateZone is enabled.</p>
         * </li>
         * <li><p><code>false</code>: PrivateZone is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("private_zone")
        @Deprecated
        public Boolean privateZone;

        /**
         * <p>The subtype of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("profile")
        public String profile;

        /**
         * <p>The kube-proxy proxy mode.</p>
         * <ul>
         * <li><p><code>iptables</code>: a stable and mature proxy mode. The service discovery and load balancing of Kubernetes Services are implemented by using iptables rules. This mode offers moderate performance and is suitable for clusters that have a small number of Services.</p>
         * </li>
         * <li><p><code>ipvs</code>: a high-performance proxy mode. The service discovery and load balancing of Kubernetes Services are implemented by using the Linux IP Virtual Server (IPVS) module. This mode is suitable for clusters that have a large number of Services and require high-performance load balancing.</p>
         * </li>
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
         * <p>The ID of the security group to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2vcgwsrwgt5mp0yi****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The CIDR block of Services.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.xx.xx/20</p>
         */
        @NameInMap("service_cidr")
        public String serviceCidr;

        /**
         * <p>The total number of nodes in the cluster. This includes master nodes and worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The state of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>initial</code>: The cluster is being created.</p>
         * </li>
         * <li><p><code>failed</code>: The cluster failed to be created.</p>
         * </li>
         * <li><p><code>running</code>: The cluster is running.</p>
         * </li>
         * <li><p><code>updating</code>: The cluster is being updated.</p>
         * </li>
         * <li><p><code>upgrading</code>: The cluster is being upgraded.</p>
         * </li>
         * <li><p><code>removing</code>: Nodes are being removed from the cluster.</p>
         * </li>
         * <li><p><code>draining</code>: Nodes in the cluster are being drained.</p>
         * </li>
         * <li><p><code>scaling</code>: The cluster is being scaled.</p>
         * </li>
         * <li><p><code>inactive</code>: The cluster is inactive.</p>
         * </li>
         * <li><p><code>unavailable</code>: The cluster is unavailable.</p>
         * </li>
         * <li><p><code>deleting</code>: The cluster is being deleted.</p>
         * </li>
         * <li><p><code>deleted</code>: The cluster has been deleted.</p>
         * </li>
         * <li><p><code>delete_failed</code>: The cluster failed to be deleted.</p>
         * </li>
         * <li><p><code>waiting</code>: The cluster is awaiting connection.</p>
         * </li>
         * <li><p><code>disconnected</code>: The cluster is disconnected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>This parameter is deprecated. Use the <code>container_cidr</code> parameter to obtain the pod CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("subnet_cidr")
        @Deprecated
        public String subnetCidr;

        /**
         * <p>The tags of the cluster.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The time zone of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The time when the cluster was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-07T09:57:26+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <p>The ID of the VPC in which the cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vcg932hsxsxuqbgl****</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vc41xuumx5z2rdma****,vsw-2vc41xuumx5z2rdma****</p>
         */
        @NameInMap("vswitch_id")
        @Deprecated
        public String vswitchId;

        /**
         * <p>The vSwitches of the cluster control plane.</p>
         */
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        /**
         * <p>The name of the worker RAM role. This role is used to authorize Elastic Compute Service (ECS) instances to be used as worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
         */
        @NameInMap("worker_ram_role_name")
        @Deprecated
        public String workerRamRoleName;

        /**
         * <p>The ID of the zone in which the cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-b</p>
         */
        @NameInMap("zone_id")
        @Deprecated
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

        @Deprecated
        public DescribeClustersV1ResponseBodyClusters setDockerVersion(String dockerVersion) {
            this.dockerVersion = dockerVersion;
            return this;
        }
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        @Deprecated
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

        @Deprecated
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

        @Deprecated
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

        @Deprecated
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

        @Deprecated
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

        @Deprecated
        public DescribeClustersV1ResponseBodyClusters setWorkerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

        @Deprecated
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
         * <p>The total number of entries that were returned.</p>
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
