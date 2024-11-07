// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersForRegionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c8155823d057948c69a****</p>
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
     * <p>Kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <strong>example:</strong>
     * <p>test-cluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_number")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
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
