// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetStorageAnalysisResultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetStorageAnalysisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAnalysisResultRequest self = new GetStorageAnalysisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageAnalysisResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetStorageAnalysisResultRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetStorageAnalysisResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
