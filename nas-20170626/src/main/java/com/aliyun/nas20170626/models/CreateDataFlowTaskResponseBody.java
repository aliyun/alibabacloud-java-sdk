// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the dataflow task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-38aa8e890f45****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateDataFlowTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowTaskResponseBody self = new CreateDataFlowTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataFlowTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
