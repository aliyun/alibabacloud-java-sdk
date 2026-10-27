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
        /**
         * <p>The key of the cluster tag.</p>
         * 
         * <strong>example:</strong>
         * <p>example.tag.key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the cluster tag.</p>
         * 
         * <strong>example:</strong>
         * <p>example-tag-value</p>
         */
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
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c0123456789abcdef0123456789abcdef0</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T08:00:00+08:00</p>
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
         * <p>The data disk category of the node.</p>
         */
        @NameInMap("data_disk_category")
        public String dataDiskCategory;

        /**
         * <p>The data disk size of the node.</p>
         */
        @NameInMap("data_disk_size")
        public Long dataDiskSize;

        /**
         * <p>Indicates whether deletion protection is enabled for the cluster.</p>
         */
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        /**
         * <p>The Docker version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>20.10.17</p>
         */
        @NameInMap("docker_version")
        public String dockerVersion;

        /**
         * <p>The ID of the external load balancing instance used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        @NameInMap("external_loadbalancer_id")
        public String externalLoadbalancerId;

        /**
         * <p>The initial version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <p>The access address of the cluster API server, including the internal network access address and the public network access address.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;api_server_endpoint&quot;:&quot;&quot;,&quot;intranet_api_server_endpoint&quot;:&quot;<a href="https://192.0.2.10:6443%22%7D">https://192.0.2.10:6443&quot;}</a></p>
         */
        @NameInMap("master_url")
        public String masterUrl;

        /**
         * <p>The metadata of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;addons&quot;:[{&quot;name&quot;:&quot;kube-proxy&quot;,&quot;version&quot;:&quot;v1.32.1&quot;}]}</p>
         */
        @NameInMap("meta_data")
        public String metaData;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>example-cluster</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network mode of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("network_mode")
        public String networkMode;

        /**
         * <p>Indicates whether Private Zone is enabled for the cluster. Default value: false.</p>
         */
        @NameInMap("private_zone")
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
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>The resource group ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-a1b2c3d4e5f6g7h</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The security group ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The current number of nodes in the cluster, including master and worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The state of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The subnet CIDR of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/16</p>
         */
        @NameInMap("subnet_cidr")
        public String subnetCidr;

        /**
         * <p>The tags of the cluster.</p>
         */
        @NameInMap("tags")
        public java.util.List<DescribeClustersResponseBodyTags> tags;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-02T08:00:00+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <p>The VPC ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        /**
         * <p>The vSwitch CIDR.</p>
         */
        @NameInMap("vswitch_cidr")
        public String vswitchCidr;

        /**
         * <p>The ID of the vSwitch where the cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
         */
        @NameInMap("vswitch_id")
        public String vswitchId;

        /**
         * <p>The name of the RAM role used by the worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>example-worker-ram-role</p>
         */
        @NameInMap("worker_ram_role_name")
        public String workerRamRoleName;

        /**
         * <p>The zone ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
