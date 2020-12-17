// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersV1Request extends TeaModel {
    // 通过集群名称进行模糊查询。
    @NameInMap("name")
    public String name;

    // 集群类型。  Kubernetes: 专有版集群。 ManagedKubernetes：托管版集群。 Ask：Serverless集群。 ExternalKubernetes：注册集群。 ServiceMesh：ASM集群。
    @NameInMap("cluster_type")
    public String clusterType;

    // 单页大小。
    @NameInMap("page_size")
    public Long pageSize;

    // 分页数。
    @NameInMap("page_number")
    public Long pageNumber;

    public static DescribeClustersV1Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersV1Request self = new DescribeClustersV1Request();
        return TeaModel.build(map, self);
    }

    public DescribeClustersV1Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClustersV1Request setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClustersV1Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClustersV1Request setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
