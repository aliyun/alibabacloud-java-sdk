// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterDashboardRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDashboardRequest self = new DescribeClusterDashboardRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDashboardRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
