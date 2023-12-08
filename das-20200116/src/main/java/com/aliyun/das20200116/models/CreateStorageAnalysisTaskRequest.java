// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateStorageAnalysisTaskRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

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
