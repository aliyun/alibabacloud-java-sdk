// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c8155823d057948c69a****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The specification of the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>ack.standard</code>: Standard Edition</p>
     * </li>
     * <li><p><code>ack.pro.small</code>: Pro Edition</p>
     * </li>
     * <li><p><code>ack.pro.xlarge</code>: Pro XL</p>
     * </li>
     * <li><p><code>ack.pro.2xlarge</code>: Pro 2XL</p>
     * </li>
     * <li><p><code>ack.pro.4xlarge</code>: Pro 4XL (To use this specification, you must submit a ticket.)</p>
     * </li>
     * </ul>
     * <p>Pro XL, Pro 2XL, and Pro 4XL are three specifications available for the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. These specifications ensure a high and deterministic level of API concurrency and Pod scheduling capabilities by pre-allocating and dedicating control plane resources. They are suitable for AI training and inference, large-scale clusters, and mission-critical workloads.</p>
     * <p>For information about the cluster management fees for Pro Edition and provisioned control plane clusters, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">cluster management fee</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">cluster management fee</a>.</p>
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
     * <li><p><code>ManagedKubernetes</code>: an ACK managed cluster. This includes ACK managed clusters (Pro and Standard Editions), ACK Serverless clusters (Pro and Standard Editions), ACK Edge clusters (Pro and Standard Editions), and ACK Lingjun clusters (Pro Edition).</p>
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
     * <p>The name of the cluster. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The subtype of the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>Default</code>: ACK managed clusters, including Pro and Standard Editions.</p>
     * </li>
     * <li><p><code>Edge</code>: ACK Edge clusters, including Pro and Standard Editions.</p>
     * </li>
     * <li><p><code>Serverless</code>: ACK Serverless clusters, including Pro and Standard Editions.</p>
     * </li>
     * <li><p><code>LingJun</code>: ACK Lingjun clusters, available in the Pro Edition.</p>
     * </li>
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
