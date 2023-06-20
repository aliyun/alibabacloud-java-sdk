// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1ResponseBody extends TeaModel {
    /**
     * <p>The list of the details of the queried cluster.</p>
     */
    @NameInMap("clusters")
    public java.util.List<DescribeClustersV1ResponseBodyClusters> clusters;

    /**
     * <p>The pagination details.</p>
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

    public static class DescribeClustersV1ResponseBodyClusters extends TeaModel {
        /**
         * <p>The ID of the queried cluster.</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The type of the managed Kubernetes cluster. This parameter is returned for a managed Kubernetes cluster. Valid values:</p>
         * <br>
         * <p>*   `ack.pro.small`: professional managed Kubernetes cluster</p>
         * <p>*   `ack.standard`: standard managed Kubernetes cluster</p>
         */
        @NameInMap("cluster_spec")
        public String clusterSpec;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   `Kubernetes`: dedicated Kubernetes cluster</p>
         * <p>*   `ManagedKubernetes`: managed Kubernetes cluster</p>
         * <p>*   `Ask`: ASK cluster</p>
         * <p>*   `ExternalKubernetes`: registered external cluster</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>The time when the cluster was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The Kubernetes version of the cluster.</p>
         */
        @NameInMap("current_version")
        public String currentVersion;

        /**
         * <p>Indicates whether deletion protection is enabled for the cluster. After deletion protection is enabled, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
         * <br>
         * <p>*   `true`: deletion protection is enabled for the cluster. The cluster cannot be deleted in the ACK console or by calling API operations.</p>
         * <p>*   `false`: deletion protection is disabled for the cluster. The cluster can be deleted in the ACK console or by calling API operations.</p>
         */
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        /**
         * <p>The Docker version that is used by the cluster.</p>
         */
        @NameInMap("docker_version")
        public String dockerVersion;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance that is used for the Ingress of the cluster.</p>
         * <br>
         * <p>The default SLB specification is slb.s1.small, which belongs to the high-performance instance type.</p>
         */
        @NameInMap("external_loadbalancer_id")
        public String externalLoadbalancerId;

        /**
         * <p>The Kubernetes version of the cluster. The Kubernetes versions provided by ACK are consistent with the open source Kubernetes versions. We recommend that you select the latest Kubernetes version. If you do not specify a Kubernetes version, the latest Kubernetes version is used by default.</p>
         * <br>
         * <p>You can create clusters of the latest two Kubernetes versions in the ACK console. You can create ACK clusters of earlier Kubernetes versions by calling API operations. For more information about the Kubernetes versions supported by ACK, see [Release notes for Kubernetes versions](~~185269~~).</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <p>The maintenance window of the cluster. This feature is available only in professional managed Kubernetes clusters.</p>
         */
        @NameInMap("maintenance_window")
        public MaintenanceWindow maintenanceWindow;

        /**
         * <p>The address of the cluster API server. It includes an internal endpoint and a public endpoint.</p>
         */
        @NameInMap("master_url")
        public String masterUrl;

        /**
         * <p>The metadata of the cluster.</p>
         */
        @NameInMap("meta_data")
        public String metaData;

        /**
         * <p>The name of the cluster.</p>
         * <br>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network mode of the cluster. Valid values:</p>
         * <br>
         * <p>*   `classic`: classic network</p>
         * <p>*   `vpc`: virtual private cloud (VPC)</p>
         * <p>*   `overlay`: overlay network</p>
         * <p>*   `calico`: network powered by Calico</p>
         */
        @NameInMap("network_mode")
        public String networkMode;

        /**
         * <p>The Kubernetes version to which the cluster can be upgraded.</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>Indicates whether Alibaba Cloud DNS PrivateZone is enabled. Valid values:</p>
         * <br>
         * <p>*   `true`: Alibaba Cloud DNS PrivateZone is enabled.</p>
         * <p>*   `false`: Alibaba Cloud DNS PrivateZone is disabled.</p>
         */
        @NameInMap("private_zone")
        public Boolean privateZone;

        /**
         * <p>The identifier of the cluster. Valid values:</p>
         * <br>
         * <p>*   `Edge`: The cluster is a managed edge Kubernetes cluster.</p>
         * <p>*   `Default`: The cluster is not a managed edge Kubernetes cluster.</p>
         */
        @NameInMap("profile")
        public String profile;

        /**
         * <p>The ID of the region where the cluster is deployed.</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the cluster belongs.</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The ID of the security group to which the instances of the cluster belong.</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The number of nodes in the cluster. Master nodes and worker nodes are included.</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   `initial`: The cluster is being created.</p>
         * <p>*   `failed`: The cluster failed to be created.</p>
         * <p>*   `running`: The cluster is running.</p>
         * <p>*   `updating`: The cluster is being upgraded.</p>
         * <p>*   `updating_failed`: The cluster failed to be upgraded.</p>
         * <p>*   `scaling`: The cluster is being scaled.</p>
         * <p>*   `stopped`: The cluster is stopped.</p>
         * <p>*   `deleting`: The cluster is being deleted.</p>
         * <p>*   `deleted`: The cluster is deleted.</p>
         * <p>*   `delete_failed`: The cluster failed to be deleted.</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:</p>
         * <br>
         * <p>*   10.0.0.0/8</p>
         * <p>*   172.16-31.0.0/12-16</p>
         * <p>*   192.168.0.0/16</p>
         * <br>
         * <p>The CIDR block of pods cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after the cluster is created.</p>
         * <br>
         * <p>For more information about subnetting for ACK clusters, see [Plan CIDR blocks for ACK clusters in a VPC](~~86500~~).</p>
         */
        @NameInMap("subnet_cidr")
        public String subnetCidr;

        /**
         * <p>The labels of the cluster.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The time when the cluster was updated.</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <p>The ID of the VPC where the cluster is deployed. You must specify a VPC when you create a cluster.</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        /**
         * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. We recommend that you select vSwitches in different zones to ensure high availability.</p>
         */
        @NameInMap("vswitch_id")
        public String vswitchId;

        /**
         * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes that are created on Elastic Compute Service (ECS) instances.</p>
         */
        @NameInMap("worker_ram_role_name")
        public String workerRamRoleName;

        /**
         * <p>The ID of the zone where the cluster is deployed.</p>
         */
        @NameInMap("zone_id")
        public String zoneId;

        public static DescribeClustersV1ResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClusters self = new DescribeClustersV1ResponseBodyClusters();
            return TeaModel.build(map, self);
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
         * <p>The number of the returned page.</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
