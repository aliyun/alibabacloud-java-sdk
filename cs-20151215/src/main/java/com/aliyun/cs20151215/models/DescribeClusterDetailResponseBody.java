// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The edition of the cluster if the cluster is an ACK managed cluster. Valid values:</p>
     * <ul>
     * <li><code>ack.pro.small</code>: ACK Pro</li>
     * <li><code>ack.standard</code>: ACK Basic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of cluster. Valid values:</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-25T15:50:20+08:00</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The current Kubernetes version of the cluster. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
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
    public String dockerVersion;

    /**
     * <strong>example:</strong>
     * <p>lb-2zehc05z3b8dwiifh****</p>
     */
    @NameInMap("external_loadbalancer_id")
    public String externalLoadbalancerId;

    /**
     * <p>The initial Kubernetes version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.6-aliyun.1</p>
     */
    @NameInMap("init_version")
    public String initVersion;

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
     * <p>The name of the cluster.</p>
     * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("network_mode")
    public String networkMode;

    /**
     * <strong>example:</strong>
     * <p>1.18.8-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>The ROS parameters of the cluster.</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("private_zone")
    public Boolean privateZone;

    /**
     * <p>Indicates the scenario in which the cluster is used. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: non-edge computing scenarios</li>
     * <li><code>Edge</code>: edge computing scenarios</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

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
     * <p>The ID of the security group to which the cluster belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-25yq****</p>
     */
    @NameInMap("security_group_id")
    public String securityGroupId;

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
     * <p>The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:</p>
     * <ul>
     * <li>10.0.0.0/8</li>
     * <li>172.16-31.0.0/12-16</li>
     * <li>192.168.0.0/16</li>
     * </ul>
     * <p>The pod CIDR block cannot overlap with the CIDR block of the VPC or the CIDR blocks of the clusters in the VPC.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/186964.html">Plan CIDR blocks for an ACK cluster</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("subnet_cidr")
    public String subnetCidr;

    /**
     * <p>The resource tags of the cluster.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

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
     * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. We recommend that you select vSwitches in different zones to ensure high availability.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zete8s4qocqg0mf6****,vsw-2zete8s4qocqg0mf6****</p>
     */
    @NameInMap("vswitch_id")
    public String vswitchId;

    /**
     * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage Elastic Compute Service (ECS) instances.</p>
     * 
     * <strong>example:</strong>
     * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
     */
    @NameInMap("worker_ram_role_name")
    public String workerRamRoleName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-a</p>
     */
    @NameInMap("zone_id")
    public String zoneId;

    public static DescribeClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponseBody self = new DescribeClusterDetailResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeClusterDetailResponseBody setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public DescribeClusterDetailResponseBody setExternalLoadbalancerId(String externalLoadbalancerId) {
        this.externalLoadbalancerId = externalLoadbalancerId;
        return this;
    }
    public String getExternalLoadbalancerId() {
        return this.externalLoadbalancerId;
    }

    public DescribeClusterDetailResponseBody setInitVersion(String initVersion) {
        this.initVersion = initVersion;
        return this;
    }
    public String getInitVersion() {
        return this.initVersion;
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

    public DescribeClusterDetailResponseBody setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

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

    public DescribeClusterDetailResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
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

    public DescribeClusterDetailResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeClusterDetailResponseBody setWorkerRamRoleName(String workerRamRoleName) {
        this.workerRamRoleName = workerRamRoleName;
        return this;
    }
    public String getWorkerRamRoleName() {
        return this.workerRamRoleName;
    }

    public DescribeClusterDetailResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
