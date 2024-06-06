// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDocTranslateTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetDocTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocTranslateTaskRequest self = new GetDocTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetDocTranslateTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
