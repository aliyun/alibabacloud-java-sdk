// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeEndpointsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsRequest self = new DescribeEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
