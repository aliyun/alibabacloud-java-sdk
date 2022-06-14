// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGovernanceKubernetesClusterRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Kubernetes集群Id
    @NameInMap("ClusterId")
    public String clusterId;

    // Kubernetes集群名
    @NameInMap("ClusterName")
    public String clusterName;

    // 当前页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页元素数量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryGovernanceKubernetesClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGovernanceKubernetesClusterRequest self = new QueryGovernanceKubernetesClusterRequest();
        return TeaModel.build(map, self);
    }

    public QueryGovernanceKubernetesClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryGovernanceKubernetesClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryGovernanceKubernetesClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QueryGovernanceKubernetesClusterRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryGovernanceKubernetesClusterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
