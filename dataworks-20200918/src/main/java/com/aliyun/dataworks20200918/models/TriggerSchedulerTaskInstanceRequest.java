// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class TriggerSchedulerTaskInstanceRequest extends TeaModel {
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerTime")
    public Long triggerTime;

    public static TriggerSchedulerTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerSchedulerTaskInstanceRequest self = new TriggerSchedulerTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TriggerSchedulerTaskInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
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
