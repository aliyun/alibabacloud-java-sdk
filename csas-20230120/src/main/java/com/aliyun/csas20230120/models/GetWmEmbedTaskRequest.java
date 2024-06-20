// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetWmEmbedTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job:5GfrJYsoaffmCE7Z5bZtjU********</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetWmEmbedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWmEmbedTaskRequest self = new GetWmEmbedTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetWmEmbedTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
