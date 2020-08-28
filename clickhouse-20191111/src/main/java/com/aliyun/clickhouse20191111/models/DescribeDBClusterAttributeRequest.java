// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeRequest self = new DescribeDBClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
