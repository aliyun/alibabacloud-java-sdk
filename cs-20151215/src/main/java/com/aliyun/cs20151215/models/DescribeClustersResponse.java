// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DescribeClustersResponseBody> body;

    public static DescribeClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponse self = new DescribeClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClustersResponse setBody(java.util.List<DescribeClustersResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeClustersResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeClustersResponseBodyTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static DescribeClustersResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyTags self = new DescribeClustersResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClustersResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClustersResponseBody extends TeaModel {
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("cluster_type")
        public String clusterType;

        @NameInMap("created")
        public String created;

        @NameInMap("current_version")
        public String currentVersion;

        @NameInMap("data_disk_category")
        public String dataDiskCategory;

        @NameInMap("data_disk_size")
        public Long dataDiskSize;

        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        @NameInMap("docker_version")
        public String dockerVersion;

        @NameInMap("external_loadbalancer_id")
        public String externalLoadbalancerId;

        @NameInMap("init_version")
        public String initVersion;

        @NameInMap("master_url")
        public String masterUrl;

        @NameInMap("meta_data")
        public String metaData;

        @NameInMap("name")
        public String name;

        @NameInMap("network_mode")
        public String networkMode;

        @NameInMap("private_zone")
        public Boolean privateZone;

        @NameInMap("profile")
        public String profile;

        @NameInMap("region_id")
        public String regionId;

        @NameInMap("resource_group_id")
        public String resourceGroupId;

        @NameInMap("security_group_id")
        public String securityGroupId;

        @NameInMap("size")
        public Long size;

        @NameInMap("state")
        public String state;

        @NameInMap("subnet_cidr")
        public String subnetCidr;

        @NameInMap("tags")
        public java.util.List<DescribeClustersResponseBodyTags> tags;

        @NameInMap("updated")
        public String updated;

        @NameInMap("vpc_id")
        public String vpcId;

        @NameInMap("vswitch_cidr")
        public String vswitchCidr;

        @NameInMap("vswitch_id")
        public String vswitchId;

        @NameInMap("worker_ram_role_name")
        public String workerRamRoleName;

        @NameInMap("zone_id")
        public String zoneId;

        public static DescribeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBody self = new DescribeClustersResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBody setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersResponseBody setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClustersResponseBody setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClustersResponseBody setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeClustersResponseBody setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeClustersResponseBody setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeClustersResponseBody setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeClustersResponseBody setDockerVersion(String dockerVersion) {
            this.dockerVersion = dockerVersion;
            return this;
        }
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        public DescribeClustersResponseBody setExternalLoadbalancerId(String externalLoadbalancerId) {
            this.externalLoadbalancerId = externalLoadbalancerId;
            return this;
        }
        public String getExternalLoadbalancerId() {
            return this.externalLoadbalancerId;
        }

        public DescribeClustersResponseBody setInitVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }
        public String getInitVersion() {
            return this.initVersion;
        }

        public DescribeClustersResponseBody setMasterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
            return this;
        }
        public String getMasterUrl() {
            return this.masterUrl;
        }

        public DescribeClustersResponseBody setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public DescribeClustersResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersResponseBody setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public DescribeClustersResponseBody setPrivateZone(Boolean privateZone) {
            this.privateZone = privateZone;
            return this;
        }
        public Boolean getPrivateZone() {
            return this.privateZone;
        }

        public DescribeClustersResponseBody setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeClustersResponseBody setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClustersResponseBody setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClustersResponseBody setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClustersResponseBody setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeClustersResponseBody setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersResponseBody setSubnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        public DescribeClustersResponseBody setTags(java.util.List<DescribeClustersResponseBodyTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeClustersResponseBodyTags> getTags() {
            return this.tags;
        }

        public DescribeClustersResponseBody setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public DescribeClustersResponseBody setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersResponseBody setVswitchCidr(String vswitchCidr) {
            this.vswitchCidr = vswitchCidr;
            return this;
        }
        public String getVswitchCidr() {
            return this.vswitchCidr;
        }

        public DescribeClustersResponseBody setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeClustersResponseBody setWorkerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

        public DescribeClustersResponseBody setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
