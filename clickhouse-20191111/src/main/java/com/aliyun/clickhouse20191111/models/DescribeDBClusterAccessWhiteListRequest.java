// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhiteListRequest self = new DescribeDBClusterAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhiteListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
