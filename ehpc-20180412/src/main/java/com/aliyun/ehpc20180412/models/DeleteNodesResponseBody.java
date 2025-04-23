// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * <ul>
     * <li>If you set the Sync parameter to true, the DeleteNodes operation is synchronous. Valid value: Not Available.</li>
     * <li>If you set the Sync parameter to false, the DeleteNodes operation is asynchronous. You can call the <a href="https://help.aliyun.com/document_detail/268225.html">ListTasks</a> operation to query the result of the task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodesResponseBody self = new DeleteNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
