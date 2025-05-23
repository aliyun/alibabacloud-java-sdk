// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1Request extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ca418e5e6fa2849d78301341700axxxxx</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure the <code>profile</code> parameter, you can further specify the edition of the cluster. Valid values:</p>
     * <ul>
     * <li><code>ack.pro.small</code>: ACK Pro cluster.</li>
     * <li><code>ack.standard</code>: ACK Basic cluster. If you leave the parameter empty, ACK Basic cluster is selected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of the instance.</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
     * <li><code>ExternalKubernetes</code>: registered cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
     * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code>, an ACK managed cluster is created. In this case, you can further specify the cluster edition. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
     * <li><code>Edge</code>: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
     * <li><code>Serverless</code>: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
     * <li><code>Lingjun</code>: ACK Lingjun Pro cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The region ID of the clusters. You can use this parameter to query all clusters in the specified region.</p>
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
