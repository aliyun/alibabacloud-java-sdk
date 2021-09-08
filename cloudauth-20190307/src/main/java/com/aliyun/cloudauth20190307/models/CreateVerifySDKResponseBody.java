// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySDKResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVerifySDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySDKResponseBody self = new CreateVerifySDKResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVerifySDKResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateVerifySDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
