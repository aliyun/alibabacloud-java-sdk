// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcesRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcesRequest self = new DescribeClusterResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourcesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
