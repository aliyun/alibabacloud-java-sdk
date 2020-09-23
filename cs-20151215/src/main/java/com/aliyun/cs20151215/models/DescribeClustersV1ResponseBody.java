// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1ResponseBody extends TeaModel {
    // 集群详情列表。
    @NameInMap("clusters")
    public java.util.List<DescribeClustersV1ResponseBodyClusters> clusters;

    // 分页信息。
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

    public static class DescribeClustersV1ResponseBodyClustersTags extends TeaModel {
        // 标签键。
        @NameInMap("key")
        public String key;

        // 标签值。
        @NameInMap("value")
        public String value;

        public static DescribeClustersV1ResponseBodyClustersTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClustersTags self = new DescribeClustersV1ResponseBodyClustersTags();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClustersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClustersV1ResponseBodyClustersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClustersV1ResponseBodyClusters extends TeaModel {
        // 集群健康状态。
        @NameInMap("cluster_healthy")
        public String clusterHealthy;

        // 集群ID。
        @NameInMap("cluster_id")
        public String clusterId;

        // 集群类型。
        @NameInMap("cluster_type")
        public String clusterType;

        // 集群创建时间。
        @NameInMap("created")
        public String created;

        // 集群当前版本。
        @NameInMap("current_version")
        public String currentVersion;

        // 数据盘类型。
        @NameInMap("data_disk_category")
        public String dataDiskCategory;

        // 数据盘大小。
        @NameInMap("data_disk_size")
        public Long dataDiskSize;

        // 集群是否开启删除保护。
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        // 集群使用的Docker版本。
        @NameInMap("docker_version")
        public String dockerVersion;

        // 集群Ingress对应的SLB的地址。
        @NameInMap("external_loadbalancer_id")
        public String externalLoadbalancerId;

        // 集群初始化版本。
        @NameInMap("init_version")
        public String initVersion;

        // 集群访问的端点信息。
        @NameInMap("master_url")
        public String masterUrl;

        // 集群元数据信息。
        @NameInMap("meta_data")
        public String metaData;

        // 集群名称。
        @NameInMap("name")
        public String name;

        // 集群使用的网络类型，例如：VPC网络。
        @NameInMap("network_mode")
        public String networkMode;

        // 节点状态。
        @NameInMap("node_status")
        public String nodeStatus;

        // 集群是否开启Private Zone。
        @NameInMap("private_zone")
        public Boolean privateZone;

        // 边缘集群表示，用于区分边缘托管版集群。
        @NameInMap("profile")
        public String profile;

        // 地域ID。
        @NameInMap("region_id")
        public String regionId;

        // 集群资源组ID。
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        // 集群安全组ID。
        @NameInMap("security_group_id")
        public String securityGroupId;

        // 集群节点数。
        @NameInMap("size")
        public Long size;

        // 集群运行状态。
        @NameInMap("state")
        public String state;

        // POD网段地址。
        @NameInMap("subnet_cidr")
        public String subnetCidr;

        // 集群标签。
        @NameInMap("tags")
        public java.util.List<DescribeClustersV1ResponseBodyClustersTags> tags;

        // 集群更新时间。
        @NameInMap("updated")
        public String updated;

        // 集群所在的VPC ID。
        @NameInMap("vpc_id")
        public String vpcId;

        // 虚拟交换机CIDR。
        @NameInMap("vswitch_cidr")
        public String vswitchCidr;

        // 集群使用的虚拟交换ID。
        @NameInMap("vswitch_id")
        public String vswitchId;

        // 集群Worker RAM角色。
        @NameInMap("worker_ram_role_name")
        public String workerRamRoleName;

        // 可用区ID。
        @NameInMap("zone_id")
        public String zoneId;

        public static DescribeClustersV1ResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClusters self = new DescribeClustersV1ResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClusters setClusterHealthy(String clusterHealthy) {
            this.clusterHealthy = clusterHealthy;
            return this;
        }
        public String getClusterHealthy() {
            return this.clusterHealthy;
        }

        public DescribeClustersV1ResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
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

        public DescribeClustersV1ResponseBodyClusters setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeClustersV1ResponseBodyClusters setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
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

        public DescribeClustersV1ResponseBodyClusters setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
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

        public DescribeClustersV1ResponseBodyClusters setTags(java.util.List<DescribeClustersV1ResponseBodyClustersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeClustersV1ResponseBodyClustersTags> getTags() {
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

        public DescribeClustersV1ResponseBodyClusters setVswitchCidr(String vswitchCidr) {
            this.vswitchCidr = vswitchCidr;
            return this;
        }
        public String getVswitchCidr() {
            return this.vswitchCidr;
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
        // 分页总数。
        @NameInMap("page_number")
        public Integer pageNumber;

        // 单页大小。
        @NameInMap("page_size")
        public Integer pageSize;

        // 结果总条目数。
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
