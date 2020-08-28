// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoItemsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterNetInfoItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoItemsRequest self = new DescribeDBClusterNetInfoItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoItemsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
