// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterPolicyResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetClusterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClusterPolicyResponseBody self = new SetClusterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClusterPolicyResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SetClusterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
