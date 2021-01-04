// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDataCentersRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeDataCentersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCentersRequest self = new DescribeDataCentersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCentersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
