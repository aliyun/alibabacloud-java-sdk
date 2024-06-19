// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CommitContainerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB8D2B22-D636-4182-****-1FC9DBDAD66F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bp18cwvrb3v9tjk0tekz</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CommitContainerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitContainerResponseBody self = new CommitContainerResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitContainerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommitContainerResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
