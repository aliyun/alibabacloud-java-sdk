// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodesRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("NodeType")
    public String nodeType;

    public static DescribeDBClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodesRequest self = new DescribeDBClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBClusterNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
