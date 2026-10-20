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
     * <p>The cluster specification. This parameter is valid when cluster_type is set to ManagedKubernetes and profile is configured. Valid values:</p>
     * <ul>
     * <li>ack.standard: Basic Edition.</li>
     * <li>ack.pro.small: Pro Edition.</li>
     * <li>ack.pro.xlarge: Pro XL.</li>
     * <li>ack.pro.2xlarge: Pro 2XL.</li>
     * <li>ack.pro.4xlarge: Pro 4XL. To use this specification, contact customer service to apply for whitelist access.</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are the three tiers provided by the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. By pre-allocating and dedicating control plane resources, these tiers ensure consistently high levels of API concurrency and pod scheduling capabilities. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For information about the cluster management fees for the Pro Edition and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li>Kubernetes: ACK dedicated cluster.</li>
     * <li>ManagedKubernetes: ACK managed clusters, including ACK managed clusters (Pro Edition and Basic Edition), ACK Serverless clusters (Pro Edition and Basic Edition), ACK Edge clusters (Pro Edition and Basic Edition), and ACK Lingjun clusters (Pro Edition).</li>
     * <li>ExternalKubernetes: registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The cluster name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The cluster subtype. This parameter is valid only when cluster_type is set to ManagedKubernetes. Valid values:</p>
     * <ul>
     * <li>Default: ACK serverless clusters, including ACK serverless cluster Pro Edition and Basic Edition.</li>
     * <li>Edge: ACK Edge clusters, including ACK Edge cluster Pro Edition and Basic Edition.</li>
     * <li>Serverless: ACK ACK clusters, including ACK ACK cluster Pro Edition and Basic Edition.</li>
     * <li>Lingjun: ACK Lingjun clusters, providing Pro Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The region of the cluster. Specify this parameter to filter clusters by region.</p>
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
