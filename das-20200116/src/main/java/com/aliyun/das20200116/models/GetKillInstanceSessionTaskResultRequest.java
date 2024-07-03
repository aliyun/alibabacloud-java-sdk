// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetKillInstanceSessionTaskResultRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> You must specify this parameter if your database instance is a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-8vbkfj5a756um****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The task ID. You can obtain the task ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/609246.html">CreateKillInstanceSessionTask</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f77d535b45405bd462b21caa3ee8****</p>
     */
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
