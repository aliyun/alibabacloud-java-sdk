// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterStatusRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterStatusRequest self = new DescribeClusterStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
