// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetReserveTaskDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetReserveTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReserveTaskDetailRequest self = new GetReserveTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetReserveTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
