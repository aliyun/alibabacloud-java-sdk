// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceUsageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeDBInstanceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceUsageRequest self = new DescribeDBInstanceUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceUsageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
