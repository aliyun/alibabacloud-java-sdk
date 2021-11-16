// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsRequest extends TeaModel {
    // 集群类型。  - Kubernetes: 专有版集群。 - ManagedKubernetes：托管版集群。 - Ask：Serverless 集群。 - ExternalKubernetes：注册到ACK的外部集群。
    @NameInMap("cluster_type")
    public String clusterType;

    // 地域ID。
    @NameInMap("region")
    public String region;

    public static DescribeAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonsRequest self = new DescribeAddonsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddonsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeAddonsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
