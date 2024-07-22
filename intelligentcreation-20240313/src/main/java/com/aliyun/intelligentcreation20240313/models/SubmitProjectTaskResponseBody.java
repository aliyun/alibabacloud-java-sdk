// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitProjectTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>551FF252-6CFC-5DDA-9F84-9B07302385C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>313123123</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static SubmitProjectTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitProjectTaskResponseBody self = new SubmitProjectTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitProjectTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitProjectTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
