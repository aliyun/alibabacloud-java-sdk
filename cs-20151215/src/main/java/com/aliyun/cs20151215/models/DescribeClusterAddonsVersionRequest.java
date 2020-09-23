// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonsVersionRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterAddonsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonsVersionRequest self = new DescribeClusterAddonsVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonsVersionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
