// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneImportTaskInfoRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67c520d1fa43455ea44fb69fa402d54d_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique identifier of the task.</p>
     * <blockquote>
     * <p>This parameter is optional. The system automatically generates a task ID if you do not specify this parameter. Tasks that have the same \<code>TaskId\\</code> belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>19162157</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetInterveneImportTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneImportTaskInfoRequest self = new GetInterveneImportTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetInterveneImportTaskInfoRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetInterveneImportTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
