// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateStorageAnalysisTaskRequest extends TeaModel {
    /**
     * <p>The database name. If you specify a database, the operation analyzes the storage usage of the specified database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  This parameter is reserved.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The table name. If you specify a table in the specified database, the operation analyzes the storage usage of the specified table. If you specify a table, you must also specify the database to which the table belongs by using **DbName**.</p>
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
