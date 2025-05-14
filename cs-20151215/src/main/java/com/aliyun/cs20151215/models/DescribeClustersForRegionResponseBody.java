// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionResponseBody extends TeaModel {
    /**
     * <p>The information about the queried clusters.</p>
     */
    @NameInMap("clusters")
    public java.util.List<DescribeClustersForRegionResponseBodyClusters> clusters;

    /**
     * <p>The pagination details.</p>
     */
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
         * <p>c905d1364c2dd4b6284a3f41790c4****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The types of ACK managed clusters:</p>
         * <ul>
         * <li>ack.pro.small: ACK Pro cluster</li>
         * <li>ack.standard: ACK Basic cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.standard</p>
         */
        @NameInMap("cluster_spec")
        public String clusterSpec;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>Kubernetes: ACK dedicated cluster</li>
         * <li>ManagedKubernetes: ACK managed clusters. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
         * <li>ExternalKubernetes: registered cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>The CIDR block of pods in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        @NameInMap("container_cidr")
        public String containerCidr;

        /**
         * <p>The time at which the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T20:40:40+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The current Kubernetes version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        @NameInMap("current_version")
        public String currentVersion;

        /**
         * <p>Specifies whether to enable cluster deletion protection. If you enable this option, the cluster cannot be deleted in the console or by calling API operations. You can obtain the terminal ID by calling one of the following operations:</p>
         * <ul>
         * <li>true: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.</li>
         * <li>false: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        /**
         * <p>The initial Kubernetes version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <p>The IP protocol stack of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("ip_stack")
        public String ipStack;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cluster</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The Kubernetes version to which the cluster can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1.18.8-aliyun.1</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>The subtype of the clusters. Valid values:</p>
         * <ul>
         * <li>Default: ACK managed clusters. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
         * <li>Edge: ACK Edge clusters. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
         * <li>Serverless: ACK Serverless clusters. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
         * <li>Lingjun: ACK Lingjun Pro clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("profile")
        public String profile;

        /**
         * <p>The kube-proxy mode of the cluster.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>iptables: iptables.</li>
         * <li>ipvs: ipvs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipvs</p>
         */
        @NameInMap("proxy_mode")
        public String proxyMode;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>The ID of the cluster resource group.</p>
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
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The CIDR block of the service network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.0.0/20</p>
         */
        @NameInMap("service_cidr")
        public String serviceCidr;

        /**
         * <p>The number of nodes in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>initial: The cluster is being created.</li>
         * <li>failed: The cluster failed to be created.</li>
         * <li>running: The cluster is running.</li>
         * <li>Upgrading: The cluster is being updated.</li>
         * <li>scaling: The cluster is being scaled.</li>
         * <li>waiting: The cluster is waiting for connection requests.</li>
         * <li>disconnected: The cluster is disconnected.</li>
         * <li>inactive: The cluster is inactive.</li>
         * <li>unavailable: The cluster is unavailable.</li>
         * <li>deleting: The cluster is being deleted.</li>
         * <li>deleted: The ACK cluster is deleted.</li>
         * <li>delete_failed: The cluster failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The list of cluster tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The time zone.</p>
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
         * <p>2020-12-08T15:37:00+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeg8nf1ukc0fcmvq****</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        /**
         * <p>The list of vSwitches on the control plane of the cluster.</p>
         */
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
         * <p>The number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of records on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
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
