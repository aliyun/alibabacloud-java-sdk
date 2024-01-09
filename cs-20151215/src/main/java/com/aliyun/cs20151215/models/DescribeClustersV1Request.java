// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1Request extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The cluster type, which is available only when the cluster type is set to `ManagedKubernetes`. Valid values:</p>
     * <br>
     * <p>*   `ack.pro.small`: ACK Pro cluster</p>
     * <p>*   `ack.standard`: ACK Basic cluster</p>
     * <br>
     * <p>By default, this parameter is left empty, which means that ACK clusters are not filtered by this parameter.</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The cluster type. Valid values:</p>
     * <br>
     * <p>*   `Kubernetes`: ACK dedicated cluster.</p>
     * <p>*   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</p>
     * <p>*   `ExternalKubernetes`: registered cluster.</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The cluster name.</p>
     * <br>
     * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The identifier of the cluster. Valid values when the cluster_type parameter is set to `ManagedKubernetes`:</p>
     * <br>
     * <p>*   `Default`: ACK managed cluster</p>
     * <p>*   `Serverless`: ACK Serverless cluster</p>
     * <p>*   `Edge`: ACK Edge cluster</p>
     * <br>
     * <p>Valid values when the cluster_type parameter is set to `Ask`:</p>
     * <br>
     * <p>`ask.v2`: ACK Serverless cluster</p>
     * <br>
     * <p>By default, this parameter is left empty. If you leave this parameter empty, ACK clusters are not filtered by identifier.</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The region ID of the clusters. You can use this parameter to query all clusters in the specified region.</p>
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
