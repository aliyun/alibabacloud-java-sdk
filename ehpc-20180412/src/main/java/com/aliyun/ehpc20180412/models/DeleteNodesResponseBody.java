// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteNodesResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodesResponseBody self = new DeleteNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DeleteNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
