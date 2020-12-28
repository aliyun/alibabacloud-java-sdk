// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteClusterResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterResponseBody self = new DeleteClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DeleteClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
