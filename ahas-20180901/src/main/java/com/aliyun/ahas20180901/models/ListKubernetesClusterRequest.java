// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListKubernetesClusterRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ClusterKey")
    public String clusterKey;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListKubernetesClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKubernetesClusterRequest self = new ListKubernetesClusterRequest();
        return TeaModel.build(map, self);
    }

    public ListKubernetesClusterRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListKubernetesClusterRequest setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
        return this;
    }
    public String getClusterKey() {
        return this.clusterKey;
    }

    public ListKubernetesClusterRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListKubernetesClusterRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListKubernetesClusterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
