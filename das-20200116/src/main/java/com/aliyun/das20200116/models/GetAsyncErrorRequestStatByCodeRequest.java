// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatByCodeRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Start")
    public Long start;

    public static GetAsyncErrorRequestStatByCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatByCodeRequest self = new GetAsyncErrorRequestStatByCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatByCodeRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetAsyncErrorRequestStatByCodeRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestStatByCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestStatByCodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestStatByCodeRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
