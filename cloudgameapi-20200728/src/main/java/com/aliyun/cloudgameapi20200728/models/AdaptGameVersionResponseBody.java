// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AdaptGameVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Id of the task
    @NameInMap("TaskId")
    public String taskId;

    public static AdaptGameVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdaptGameVersionResponseBody self = new AdaptGameVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AdaptGameVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AdaptGameVersionResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
