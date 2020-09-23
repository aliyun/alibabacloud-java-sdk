// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    // 集群ID。
    @NameInMap("cluster_id")
    public String clusterId;

    // 集群类型。
    @NameInMap("cluster_type")
    public String clusterType;

    // 集群创建时间。
    @NameInMap("created")
    public String created;

    // 集群当前K8S版本。
    @NameInMap("current_version")
    public String currentVersion;

    // 集群是否开启删除保护。
    @NameInMap("deletion_protection")
    public Boolean deletionProtection;

    // 集群内Docker版本。
    @NameInMap("docker_version")
    public String dockerVersion;

    // 集群Ingress SLB ID。
    @NameInMap("external_loadbalancer_id")
    public String externalLoadbalancerId;

    // 集群实例类型。
    @NameInMap("instance_type")
    public String instanceType;

    // 集群元数据。
    @NameInMap("meta_data")
    public String metaData;

    // 集群名称。
    @NameInMap("name")
    public String name;

    // 集群采用的网络类型，例如：VPC网络。
    @NameInMap("network_mode")
    public String networkMode;

    // 集群所在地域ID。
    @NameInMap("region_id")
    public String regionId;

    // 集群资源组ID。
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    // 集群安全组ID。
    @NameInMap("security_group_id")
    public String securityGroupId;

    // 集群节点数量。
    @NameInMap("size")
    public Integer size;

    // 集群运行状态。
    @NameInMap("state")
    public String state;

    // 集群标签。
    @NameInMap("tags")
    public java.util.List<DescribeClusterDetailResponseBodyTags> tags;

    // 集群更新时间。
    @NameInMap("updated")
    public String updated;

    // 集群使用的VPC ID。
    @NameInMap("vpc_id")
    public String vpcId;

    // 集群使用的虚拟交换机ID。
    @NameInMap("vswitch_cidr")
    public String vswitchCidr;

    // 集群节点使用的虚拟交换机列表。
    @NameInMap("vswitch_id")
    public String vswitchId;

    // 集群所在地域内的可用区ID。
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

    public DescribeClusterDetailResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
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

    public DescribeClusterDetailResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DescribeClusterDetailResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeClusterDetailResponseBody setTags(java.util.List<DescribeClusterDetailResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeClusterDetailResponseBodyTags> getTags() {
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

    public DescribeClusterDetailResponseBody setVswitchCidr(String vswitchCidr) {
        this.vswitchCidr = vswitchCidr;
        return this;
    }
    public String getVswitchCidr() {
        return this.vswitchCidr;
    }

    public DescribeClusterDetailResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeClusterDetailResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeClusterDetailResponseBodyTags extends TeaModel {
        // 标签名。
        @NameInMap("key")
        public String key;

        // 标签值。
        @NameInMap("value")
        public String value;

        public static DescribeClusterDetailResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyTags self = new DescribeClusterDetailResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterDetailResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
