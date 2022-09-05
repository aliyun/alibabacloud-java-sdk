// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDBInstanceIPArrayListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListRequest self = new DescribeDBInstanceIPArrayListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceIPArrayListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
