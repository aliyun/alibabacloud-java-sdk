// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetFoTaskStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    public static GetFoTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFoTaskStatusRequest self = new GetFoTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetFoTaskStatusRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
