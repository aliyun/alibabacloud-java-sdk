// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetTaskStatusByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTaskStatusByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusByIdRequest self = new GetTaskStatusByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusByIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
