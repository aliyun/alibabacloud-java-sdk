// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionResponseBody extends TeaModel {
    @NameInMap("clusters")
    public java.util.List<DescribeClustersForRegionResponseBodyClusters> clusters;

    @NameInMap("page_info")
    public DescribeClustersForRegionResponseBodyPageInfo pageInfo;

    public static DescribeClustersForRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersForRegionResponseBody self = new DescribeClustersForRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersForRegionResponseBody setClusters(java.util.List<DescribeClustersForRegionResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersForRegionResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeClustersForRegionResponseBody setPageInfo(DescribeClustersForRegionResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeClustersForRegionResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeClustersForRegionResponseBodyClusters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cluster.local</p>
         */
        @NameInMap("cluster_domain")
        public String clusterDomain;

        /**
         * <strong>example:</strong>
         * <p>c905d1364c2dd4b6284a3f41790c4****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>ack.standard</p>
         */
        @NameInMap("cluster_spec")
        public String clusterSpec;

        /**
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        @NameInMap("container_cidr")
        public String containerCidr;

        /**
         * <strong>example:</strong>
         * <p>2020-12-01T20:40:40+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        @NameInMap("current_version")
        public String currentVersion;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        /**
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("ip_stack")
        public String ipStack;

        /**
         * <strong>example:</strong>
         * <p>test-cluster</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1.18.8-aliyun.1</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>ipvs</p>
         */
        @NameInMap("proxy_mode")
        public String proxyMode;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.0.0/20</p>
         */
        @NameInMap("service_cidr")
        public String serviceCidr;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>2020-12-08T15:37:00+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zeg8nf1ukc0fcmvq****</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static DescribeClustersForRegionResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersForRegionResponseBodyClusters self = new DescribeClustersForRegionResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersForRegionResponseBodyClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeClustersForRegionResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersForRegionResponseBodyClusters setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeClustersForRegionResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClustersForRegionResponseBodyClusters setContainerCidr(String containerCidr) {
            this.containerCidr = containerCidr;
            return this;
        }
        public String getContainerCidr() {
            return this.containerCidr;
        }

        public DescribeClustersForRegionResponseBodyClusters setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClustersForRegionResponseBodyClusters setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeClustersForRegionResponseBodyClusters setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeClustersForRegionResponseBodyClusters setInitVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }
        public String getInitVersion() {
            return this.initVersion;
        }

        public DescribeClustersForRegionResponseBodyClusters setIpStack(String ipStack) {
            this.ipStack = ipStack;
            return this;
        }
        public String getIpStack() {
            return this.ipStack;
        }

        public DescribeClustersForRegionResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersForRegionResponseBodyClusters setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
        }

        public DescribeClustersForRegionResponseBodyClusters setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeClustersForRegionResponseBodyClusters setProxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }
        public String getProxyMode() {
            return this.proxyMode;
        }

        public DescribeClustersForRegionResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClustersForRegionResponseBodyClusters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClustersForRegionResponseBodyClusters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClustersForRegionResponseBodyClusters setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public DescribeClustersForRegionResponseBodyClusters setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeClustersForRegionResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersForRegionResponseBodyClusters setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public DescribeClustersForRegionResponseBodyClusters setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeClustersForRegionResponseBodyClusters setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public DescribeClustersForRegionResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersForRegionResponseBodyClusters setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeClustersForRegionResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        public static DescribeClustersForRegionResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersForRegionResponseBodyPageInfo self = new DescribeClustersForRegionResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClustersForRegionResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClustersForRegionResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeClustersForRegionResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
