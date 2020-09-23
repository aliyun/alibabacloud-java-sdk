// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterLogsRequest extends TeaModel {
    // 集群ID
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterLogsRequest self = new DescribeClusterLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterLogsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
