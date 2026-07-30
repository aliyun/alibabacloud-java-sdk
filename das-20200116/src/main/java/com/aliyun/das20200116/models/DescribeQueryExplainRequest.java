// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>dbtest01</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the node.</p>
     * <blockquote>
     * <p>For PolarDB for MySQL instances, if you specify a node ID, the system queries the execution plan on that node. Otherwise, it queries the execution plan on a secondary node.For high availability ApsaraDB RDS for MySQL instances, if you specify an instance ID, the system queries the execution plan on that node. Otherwise, it queries the execution plan on a secondary node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp1v203xzzh0a****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>Schema information. This is a reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The SQL statement for which you want to get the execution plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from test where name = \&quot;mockUser\&quot;</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static DescribeQueryExplainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryExplainRequest self = new DescribeQueryExplainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQueryExplainRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeQueryExplainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeQueryExplainRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeQueryExplainRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DescribeQueryExplainRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
