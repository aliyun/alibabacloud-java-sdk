// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetKillInstanceSessionTaskResultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetKillInstanceSessionTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKillInstanceSessionTaskResultRequest self = new GetKillInstanceSessionTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetKillInstanceSessionTaskResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetKillInstanceSessionTaskResultRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetKillInstanceSessionTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
