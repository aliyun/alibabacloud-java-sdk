// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMySQLAllSessionAsyncRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("ResultId")
    public String resultId;

    public static GetMySQLAllSessionAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMySQLAllSessionAsyncRequest self = new GetMySQLAllSessionAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetMySQLAllSessionAsyncRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMySQLAllSessionAsyncRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetMySQLAllSessionAsyncRequest setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }
    public String getResultId() {
        return this.resultId;
    }

}
