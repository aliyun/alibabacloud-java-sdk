// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class UpdateTaskPriorityRequest extends TeaModel {
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("TaskUid")
    public String taskUid;

    public static UpdateTaskPriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskPriorityRequest self = new UpdateTaskPriorityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskPriorityRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateTaskPriorityRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
