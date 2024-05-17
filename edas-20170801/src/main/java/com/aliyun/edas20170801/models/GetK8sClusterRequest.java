// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sClusterRequest extends TeaModel {
    /**
     * <p>The type of the Kubernetes cluster. Valid values:</p>
     * <br>
     * <p>*   5: ACK cluster</p>
     * <p>*   7: self-managed Kubernetes cluster</p>
     */
    @NameInMap("ClusterType")
    public Integer clusterType;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: 1000.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionTag")
    public String regionTag;

    /**
     * <p>The subtype of the cluster. Valid values:</p>
     * <br>
     * <p>*   Ask: Serverless Kubernetes cluster</p>
     * <p>*   ManagedKubernetes: ACK cluster</p>
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
