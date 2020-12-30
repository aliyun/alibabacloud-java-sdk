// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstancePolicyResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetInstancePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstancePolicyResponseBody self = new SetInstancePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstancePolicyResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SetInstancePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
