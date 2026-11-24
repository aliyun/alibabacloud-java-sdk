// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1Request extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c3fb96524f9274b4495df0f12a6b5****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The specifications of the cluster. This parameter is valid only when cluster_type is set to ManagedKubernetes and profile is configured. Valid values:</p>
     * <ul>
     * <li><code>ack.standard</code>: Basic Edition</li>
     * <li><code>ack.pro.small</code>: Pro Edition</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (contact customer service to apply for whitelist access)</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are the three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. By pre-allocating and dedicating control plane resources, these tiers ensure that API concurrency and pod scheduling capabilities are consistently maintained at a high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For more information about the cluster management fees for the Pro Edition and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed clusters, including ACK managed clusters (Pro Edition and Basic Edition), ACK Serverless clusters (Pro Edition and Basic Edition), ACK Edge clusters (Pro Edition and Basic Edition), and ACK Lingjun clusters (Pro Edition).</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
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
     * <p>The number of the page to return.</p>
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
     * <p>The subtype of the cluster. This parameter is valid only when cluster_type is set to ManagedKubernetes. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: ACK serverless cluster, including ACK serverless cluster Pro Edition and ACK serverless cluster Basic Edition.</li>
     * <li><code>Edge</code>: ACK Edge cluster, including ACK Edge cluster Pro Edition and ACK Edge cluster Basic Edition.</li>
     * <li><code>Serverless</code>: ACK ACK cluster, including ACK ACK cluster Pro Edition and ACK ACK cluster Basic Edition.</li>
     * <li><code>Lingjun</code>: ACK Lingjun cluster, which provides only the Pro Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The region of the cluster. You can specify this parameter to filter clusters in a specific region.</p>
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
