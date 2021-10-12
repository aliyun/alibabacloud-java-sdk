// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionProgressRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static GetGameVersionProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionProgressRequest self = new GetGameVersionProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetGameVersionProgressRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
