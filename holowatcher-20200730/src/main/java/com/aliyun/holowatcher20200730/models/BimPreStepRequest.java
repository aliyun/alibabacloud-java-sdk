// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimPreStepRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static BimPreStepRequest build(java.util.Map<String, ?> map) throws Exception {
        BimPreStepRequest self = new BimPreStepRequest();
        return TeaModel.build(map, self);
    }

    public BimPreStepRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public BimPreStepRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
