// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeContactPointsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeContactPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactPointsRequest self = new DescribeContactPointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactPointsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
