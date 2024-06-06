// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateTaskRequest self = new GetImageTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
