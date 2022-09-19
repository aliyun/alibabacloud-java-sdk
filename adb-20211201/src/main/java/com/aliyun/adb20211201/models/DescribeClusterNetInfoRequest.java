// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeClusterNetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetInfoRequest self = new DescribeClusterNetInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
