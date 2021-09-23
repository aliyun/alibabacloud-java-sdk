// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterListRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetGovernanceKubernetesClusterListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterListRequest self = new GetGovernanceKubernetesClusterListRequest();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetGovernanceKubernetesClusterListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetGovernanceKubernetesClusterListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetGovernanceKubernetesClusterListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
