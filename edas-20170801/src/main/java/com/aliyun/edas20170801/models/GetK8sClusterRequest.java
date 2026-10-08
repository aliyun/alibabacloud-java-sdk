// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sClusterRequest extends TeaModel {
    /**
     * <p>The type of the Kubernetes cluster:</p>
     * <ul>
     * <li><p>5: an ACK cluster.</p>
     * </li>
     * <li><p>7: a self-managed Kubernetes cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ClusterType")
    public Integer clusterType;

    /**
     * <p>The number of the page to return for a paged query. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page for a paged query. The default value is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionTag")
    public String regionTag;

    /**
     * <p>The subtype of the cluster:</p>
     * <ul>
     * <li><p>Ask: an ASK cluster.</p>
     * </li>
     * <li><p>ManagedKubernetes: an ACK cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ask</p>
     */
    @NameInMap("SubClusterType")
    public String subClusterType;

    public static GetK8sClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetK8sClusterRequest self = new GetK8sClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetK8sClusterRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public GetK8sClusterRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetK8sClusterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetK8sClusterRequest setRegionTag(String regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public String getRegionTag() {
        return this.regionTag;
    }

    public GetK8sClusterRequest setSubClusterType(String subClusterType) {
        this.subClusterType = subClusterType;
        return this;
    }
    public String getSubClusterType() {
        return this.subClusterType;
    }

}
