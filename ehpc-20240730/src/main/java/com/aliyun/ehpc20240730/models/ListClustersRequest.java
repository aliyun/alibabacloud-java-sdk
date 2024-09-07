// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    @NameInMap("ClusterNames")
    public java.util.List<String> clusterNames;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public ListClustersRequest setClusterNames(java.util.List<String> clusterNames) {
        this.clusterNames = clusterNames;
        return this;
    }
    public java.util.List<String> getClusterNames() {
        return this.clusterNames;
    }

    public ListClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
