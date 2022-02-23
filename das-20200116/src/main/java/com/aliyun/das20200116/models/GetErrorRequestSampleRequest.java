// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetErrorRequestSampleRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("SqlId")
    public String sqlId;

    @NameInMap("Start")
    public Long start;

    public static GetErrorRequestSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErrorRequestSampleRequest self = new GetErrorRequestSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetErrorRequestSampleRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetErrorRequestSampleRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetErrorRequestSampleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetErrorRequestSampleRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetErrorRequestSampleRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetErrorRequestSampleRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
