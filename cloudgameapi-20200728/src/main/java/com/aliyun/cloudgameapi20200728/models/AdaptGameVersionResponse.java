// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AdaptGameVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static AdaptGameVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AdaptGameVersionResponse self = new AdaptGameVersionResponse();
        return TeaModel.build(map, self);
    }

    public AdaptGameVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AdaptGameVersionResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
