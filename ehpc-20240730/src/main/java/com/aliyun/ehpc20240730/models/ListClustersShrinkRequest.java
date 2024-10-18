// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListClustersShrinkRequest extends TeaModel {
    /**
     * <p>The cluster IDs. You can specify up to 20 IDs.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    /**
     * <p>The cluster names. You can specify up to 20 names.</p>
     */
    @NameInMap("ClusterNames")
    public String clusterNamesShrink;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 10 to 100. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListClustersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersShrinkRequest self = new ListClustersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersShrinkRequest setClusterIdsShrink(String clusterIdsShrink) {
        this.clusterIdsShrink = clusterIdsShrink;
        return this;
    }
    public String getClusterIdsShrink() {
        return this.clusterIdsShrink;
    }

    public ListClustersShrinkRequest setClusterNamesShrink(String clusterNamesShrink) {
        this.clusterNamesShrink = clusterNamesShrink;
        return this;
    }
    public String getClusterNamesShrink() {
        return this.clusterNamesShrink;
    }

    public ListClustersShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
