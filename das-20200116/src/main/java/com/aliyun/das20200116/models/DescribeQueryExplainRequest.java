// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dbtest01</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>pi-bp1v203xzzh0a****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Schema")
    public String schema;

    /**
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
