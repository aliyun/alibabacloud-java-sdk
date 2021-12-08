// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class GetTaskResultRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultRequest self = new GetTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
