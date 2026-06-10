// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionResponseBody extends TeaModel {
    /**
     * <p>A list of clusters.</p>
     */
    @NameInMap("clusters")
    public java.util.List<DescribeClustersForRegionResponseBodyClusters> clusters;

    /**
     * <p>The pagination information.</p>
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
         * <p>The cluster domain.</p>
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
         * <p>The specification of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>ack.standard</code>: Basic Edition</p>
         * </li>
         * <li><p><code>ack.pro.small</code>: Pro Edition</p>
         * </li>
         * <li><p><code>ack.pro.xlarge</code>: Pro XL</p>
         * </li>
         * <li><p><code>ack.pro.2xlarge</code>: Pro 2XL</p>
         * </li>
         * <li><p><code>ack.pro.4xlarge</code>: Pro 4XL. This specification is available only to allowlisted users.</p>
         * </li>
         * </ul>
         * <p>Pro XL, Pro 2XL, and Pro 4XL are three specifications available for the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. These specifications ensure a high and deterministic level of API concurrency and Pod scheduling capabilities by pre-allocating and dedicating control plane resources. They are suitable for AI training and inference, large-scale clusters, and mission-critical workloads.</p>
         * <p>For information about the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">cluster management fee</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">cluster management fee</a> for Pro Edition and ACK Pro provisioned control plane specifications, see the linked topic.</p>
         * 
         * <strong>example:</strong>
         * <p>ack.standard</p>
         */
        @NameInMap("cluster_spec")
        public String clusterSpec;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>Kubernetes</code>: an ACK dedicated cluster.</p>
         * </li>
         * <li><p><code>ManagedKubernetes</code>: an ACK managed cluster. This type includes ACK managed clusters (Pro and Basic editions), ACK Serverless clusters (Pro and Basic editions), ACK Edge clusters (Pro and Basic editions), and ACK Lingjun clusters (Pro edition).</p>
         * </li>
         * <li><p><code>ExternalKubernetes</code>: a registered cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("cluster_type")
        public String clusterType;

        /**
         * <p>The CIDR block for Pods in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        @NameInMap("container_cidr")
        public String containerCidr;

        /**
         * <p>The time the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T20:40:40+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The current version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        @NameInMap("current_version")
        public String currentVersion;

        /**
         * <p>Specifies whether deletion protection is enabled for the cluster. If enabled, you cannot delete the cluster from the console or by an API call. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Deletion protection is enabled.</p>
         * </li>
         * <li><p><code>false</code>: Deletion protection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletion_protection")
        public Boolean deletionProtection;

        /**
         * <p>The initial version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        @NameInMap("init_version")
        public String initVersion;

        /**
         * <p>The IP stack of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("ip_stack")
        public String ipStack;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cluster</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The available upgrade version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.18.8-aliyun.1</p>
         */
        @NameInMap("next_version")
        public String nextVersion;

        /**
         * <p>The subtype of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>Default</code>: An ACK managed cluster (Pro and Basic editions).</p>
         * </li>
         * <li><p><code>Edge</code>: An ACK Edge cluster (Pro and Basic editions).</p>
         * </li>
         * <li><p><code>Serverless</code>: An ACK Serverless cluster (Pro and Basic editions).</p>
         * </li>
         * <li><p><code>LingJun</code>: An ACK Lingjun cluster (Pro edition).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("profile")
        public String profile;

        /**
         * <p>The kube-proxy proxy mode of the cluster.</p>
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
         * <p>The ID of the resource group to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        /**
         * <p>The security group ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeihch86ooz9io4****</p>
         */
        @NameInMap("security_group_id")
        public String securityGroupId;

        /**
         * <p>The CIDR block for the service network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.0.0/20</p>
         */
        @NameInMap("service_cidr")
        public String serviceCidr;

        /**
         * <p>The number of nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The state of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>initial</code>: The cluster is being created.</p>
         * </li>
         * <li><p><code>failed</code>: Cluster creation failed.</p>
         * </li>
         * <li><p><code>running</code>: The cluster is running.</p>
         * </li>
         * <li><p><code>updating</code>: The cluster is being updated.</p>
         * </li>
         * <li><p><code>upgrading</code>: The cluster is being upgraded.</p>
         * </li>
         * <li><p><code>removing</code>: Nodes are being removed from the cluster.</p>
         * </li>
         * <li><p><code>draining</code>: Node draining is in progress.</p>
         * </li>
         * <li><p><code>scaling</code>: The cluster is being scaled.</p>
         * </li>
         * <li><p><code>inactive</code>: The cluster is inactive.</p>
         * </li>
         * <li><p><code>unavailable</code>: The cluster is unavailable.</p>
         * </li>
         * <li><p><code>deleting</code>: The cluster is being deleted.</p>
         * </li>
         * <li><p><code>deleted</code>: The cluster is deleted.</p>
         * </li>
         * <li><p><code>delete_failed</code>: Cluster deletion failed.</p>
         * </li>
         * <li><p><code>waiting</code>: The cluster is waiting for a connection.</p>
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
         * <p>The tags attached to the cluster.</p>
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
         * <p>The time the cluster was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-08T15:37:00+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        /**
         * <p>The VPC ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeg8nf1ukc0fcmvq****</p>
         */
        @NameInMap("vpc_id")
        public String vpcId;

        /**
         * <p>The IDs of the vSwitches for the control plane.</p>
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
         * <p>The returned page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries that match the query.</p>
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
