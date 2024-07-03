// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateStorageAnalysisTaskRequest extends TeaModel {
    /**
     * <p>The database name. If you specify a database, the operation analyzes the storage usage of the specified database.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID. For ApsaraDB for MongoDB instances, you can use this parameter to specify a node for storage analysis. You can call the <a href="https://help.aliyun.com/document_detail/123802.html">DescribeRoleZoneInfo</a> operation to query the information about nodes of an ApsaraDB for MongoDB instance.</p>
     * <ul>
     * <li>If you set this parameter to a value in the <strong>InsName</strong> format, such as <code>d-bp1872fa24d5****</code>, you can call this operation to analyze the hidden node that corresponds to the node ID.</li>
     * <li>If you set this parameter to a value in the <code>InsName#RoleId</code> format, such as <code>d-bp1872fa24d5****#299****5</code>, you can call this operation to analyze the specified node.</li>
     * </ul>
     * <blockquote>
     * <p> If you run a storage analysis task on an ApsaraDB for MongoDB replica set instance and you do not specify this parameter, only the hidden node of the instance is analyzed by default. If you run a storage analysis task on an ApsaraDB for MongoDB sharded cluster instance, we recommend that you set this parameter to specify a node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23302528</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The table name. If you specify a table in the specified database, the operation analyzes the storage usage of the specified table. If you specify a table, you must also specify the database to which the table belongs by using <strong>DbName</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static CreateStorageAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageAnalysisTaskRequest self = new CreateStorageAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageAnalysisTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateStorageAnalysisTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateStorageAnalysisTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateStorageAnalysisTaskRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
