// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TriggerSchedulerTaskInstanceRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The time defined by the HTTP Trigger node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("TriggerTime")
    public Long triggerTime;

    public static TriggerSchedulerTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerSchedulerTaskInstanceRequest self = new TriggerSchedulerTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TriggerSchedulerTaskInstanceRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public TriggerSchedulerTaskInstanceRequest setTriggerTime(Long triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }
    public Long getTriggerTime() {
        return this.triggerTime;
    }

}
