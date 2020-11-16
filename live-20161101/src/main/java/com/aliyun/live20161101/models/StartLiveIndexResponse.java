// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveIndexResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static StartLiveIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveIndexResponse self = new StartLiveIndexResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveIndexResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartLiveIndexResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
