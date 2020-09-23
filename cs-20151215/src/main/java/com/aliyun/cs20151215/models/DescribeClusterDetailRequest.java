// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailRequest self = new DescribeClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
