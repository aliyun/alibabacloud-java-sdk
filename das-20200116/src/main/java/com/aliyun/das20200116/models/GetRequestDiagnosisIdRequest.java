// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisIdRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Sql")
    public String sql;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("__context")
    public String context;

    public static GetRequestDiagnosisIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisIdRequest self = new GetRequestDiagnosisIdRequest();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisIdRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public GetRequestDiagnosisIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRequestDiagnosisIdRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetRequestDiagnosisIdRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public GetRequestDiagnosisIdRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetRequestDiagnosisIdRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
