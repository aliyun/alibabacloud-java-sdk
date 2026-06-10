// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1Request extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c3fb96524f9274b4495df0f12a6b5****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The cluster specification. This parameter is valid only when <code>cluster_type</code> is set to <code>ManagedKubernetes</code> and the <code>profile</code> parameter is specified. Valid values:</p>
     * <ul>
     * <li><p><code>ack.standard</code>: Standard</p>
     * </li>
     * <li><p><code>ack.pro.small</code>: Pro</p>
     * </li>
     * <li><p><code>ack.pro.xlarge</code>: Pro XL</p>
     * </li>
     * <li><p><code>ack.pro.2xlarge</code>: Pro 2XL</p>
     * </li>
     * <li><p><code>ack.pro.4xlarge</code>: Pro 4XL (Contact customer service to enable this option.)</p>
     * </li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. These tiers pre-allocate and dedicate control plane resources to ensure a consistently high, predictable level of performance for API concurrency and pod scheduling. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For information about the cluster management fees for Pro and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fee</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fee</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The cluster type.</p>
     * <ul>
     * <li><p><code>Kubernetes</code>: an ACK dedicated cluster.</p>
     * </li>
     * <li><p><code>ManagedKubernetes</code>: an ACK managed cluster. This type includes ACK managed clusters (Pro and Standard), ACK Serverless clusters (Pro and Standard), ACK Edge clusters (Pro and Standard), and ACK Lingjun clusters (Pro).</p>
     * </li>
     * <li><p><code>ExternalKubernetes</code>: a registered cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>When <code>cluster_type</code> is set to <code>ManagedKubernetes</code>, you can further specify a sub-type of the cluster.</p>
     * <ul>
     * <li><p><code>Default</code>: an ACK managed cluster. This includes ACK Pro and ACK Standard clusters.</p>
     * </li>
     * <li><p><code>Edge</code>: an ACK Edge cluster. This includes ACK Edge Pro and ACK Edge Standard clusters.</p>
     * </li>
     * <li><p><code>Serverless</code>: an ACK Serverless cluster. This includes ACK Serverless Pro and ACK Serverless Standard clusters.</p>
     * </li>
     * <li><p><code>Lingjun</code>: an ACK Lingjun cluster (Pro edition).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The ID of the region to which the clusters belong.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region_id")
    public String regionId;

    public static DescribeClustersV1Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersV1Request self = new DescribeClustersV1Request();
        return TeaModel.build(map, self);
    }

    public DescribeClustersV1Request setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClustersV1Request setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeClustersV1Request setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClustersV1Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClustersV1Request setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClustersV1Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersV1Request setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeClustersV1Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
