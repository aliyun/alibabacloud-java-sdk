// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TerminateAiOutboundTaskRequest extends TeaModel {
    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.</p>
     * <p>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Job ID.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API and check the <strong>Data</strong> field in the response, or invoke the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API and check the <strong>TaskId</strong> field in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1763****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TerminateAiOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateAiOutboundTaskRequest self = new TerminateAiOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public TerminateAiOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TerminateAiOutboundTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
