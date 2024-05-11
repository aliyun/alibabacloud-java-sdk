// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The node type. Valid values:</p>
     * <br>
     * <p>*   **master**: coordinator node.</p>
     * <p>*   **segment**: compute node.</p>
     * <br>
     * <p>> If you do not specify this parameter, the information about all nodes is returned.</p>
     */
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
