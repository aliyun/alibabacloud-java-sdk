// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class GetTaskStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusRequest self = new GetTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
