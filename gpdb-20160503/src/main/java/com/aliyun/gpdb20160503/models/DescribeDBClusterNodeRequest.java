// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("NodeType")
    public String nodeType;

    public static DescribeDBClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodeRequest self = new DescribeDBClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBClusterNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
