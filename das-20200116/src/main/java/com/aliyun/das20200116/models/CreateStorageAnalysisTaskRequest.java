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
     * <p>The node ID. For ApsaraDB for MongoDB instances, you can use this parameter to specify a node for storage analysis. You can call the [DescribeRoleZoneInfo](https://help.aliyun.com/document_detail/123802.html) operation to query the information about nodes of an ApsaraDB for MongoDB instance.</p>
     * <br>
     * <p>*   If you set this parameter to a value in the **InsName** format, such as `d-bp1872fa24d5****`, you can call this operation to analyze the hidden node that corresponds to the node ID.</p>
     * <p>*   If you set this parameter to a value in the `InsName#RoleId` format, such as `d-bp1872fa24d5****#299****5`, you can call this operation to analyze the specified node.</p>
     * <br>
     * <p>>  If you run a storage analysis task on an ApsaraDB for MongoDB replica set instances and you do not specify this parameter, only the hidden node of the instance is analyzed by default. If you run a storage analysis task on an ApsaraDB for MongoDB sharded cluster instance, we recommend that you set this parameter to specify a node.</p>
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
