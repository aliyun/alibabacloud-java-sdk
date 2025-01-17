// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateDocTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D3920BC3-A395-4CAD-9E84-7C39EB07507B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>0586df512c8b4bb382d7d9a6a01b5854</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateDocTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDocTranslateTaskResponseBody self = new CreateDocTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDocTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDocTranslateTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDocTranslateTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
