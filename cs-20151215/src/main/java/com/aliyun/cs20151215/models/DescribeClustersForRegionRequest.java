// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c8155823d057948c69a****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>Specifies the cluster specification. Valid values:</p>
     * <ul>
     * <li><code>ack.standard</code>: Basic edition.</li>
     * <li><code>ack.pro.small</code>: Pro edition.</li>
     * <li><code>ack.pro.xlarge</code>: Pro XL.</li>
     * <li><code>ack.pro.2xlarge</code>: Pro 2XL.</li>
     * <li><code>ack.pro.4xlarge</code>: Pro 4XL (requires whitelist approval from customer service).</li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are the three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. By pre-allocating and dedicating control plane resources, these tiers ensure that API concurrency and pod scheduling capabilities remain consistently at a high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
     * <p>For cluster management fees of the Pro edition and provisioned control plane editions, refer to &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.standard</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>Specifies the cluster type. Valid values:</p>
     * <ul>
     * <li>Kubernetes: ACK dedicated clusters.</li>
     * <li>ManagedKubernetes: ACK managed clusters, including ACK managed clusters (ACK Pro and ACK Basic), ACK Serverless clusters (Pro and Basic), ACK Edge clusters (Pro and Basic), and ACK Lingjun clusters (Pro).</li>
     * <li>ExternalKubernetes: registered clusters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>Specifies the cluster name for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>Specifies the cluster subtype. Valid values:</p>
     * <ul>
     * <li>Default: ACK managed clusters, including ACK Pro and ACK Basic.</li>
     * <li>Edge: ACK Edge clusters, including ACK Edge Pro and ACK Edge Basic.</li>
     * <li>Serverless: ACK Serverless clusters, including ACK Serverless Pro and ACK Serverless Basic.</li>
     * <li>LingJun: ACK Lingjun clusters, available only in Pro edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Serverless</p>
     */
    @NameInMap("profile")
    public String profile;

    public static DescribeClustersForRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersForRegionRequest self = new DescribeClustersForRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersForRegionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClustersForRegionRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeClustersForRegionRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClustersForRegionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClustersForRegionRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClustersForRegionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersForRegionRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

}
