// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>master</strong>: coordinator node.</li>
     * <li><strong>segment</strong>: compute node.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the information about all nodes is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>master</p>
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
