// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsResourceGroupsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeApsResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsResourceGroupsRequest self = new DescribeApsResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApsResourceGroupsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
