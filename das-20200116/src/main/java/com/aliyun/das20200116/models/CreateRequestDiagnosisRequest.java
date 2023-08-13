// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateRequestDiagnosisRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  This parameter must be specified for PolarDB for MySQL, PolarDB for PostgreSQL (Compatible with Oracle), and ApsaraDB for MongoDB instances.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The SQL statement that you want to diagnose.</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static CreateRequestDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRequestDiagnosisRequest self = new CreateRequestDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public CreateRequestDiagnosisRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CreateRequestDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRequestDiagnosisRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateRequestDiagnosisRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
