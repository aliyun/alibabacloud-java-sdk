// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("End")
    public String end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Role")
    public String role;

    @NameInMap("SqlIdList")
    public String sqlIdList;

    @NameInMap("Start")
    public String start;

    public static GetAsyncErrorRequestStatResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultRequest self = new GetAsyncErrorRequestStatResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetAsyncErrorRequestStatResultRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetAsyncErrorRequestStatResultRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestStatResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestStatResultRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestStatResultRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetAsyncErrorRequestStatResultRequest setSqlIdList(String sqlIdList) {
        this.sqlIdList = sqlIdList;
        return this;
    }
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    public GetAsyncErrorRequestStatResultRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
