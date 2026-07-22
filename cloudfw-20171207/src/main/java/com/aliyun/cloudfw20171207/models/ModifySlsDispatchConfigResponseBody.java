// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CD646BA-490F-5584-9272-B6FFE3BB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID. Modifying log configurations is an asynchronous task. This field indicates the unique identifier of the task. You can use this ID to query the status of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>d8c995ec-40a5-4382-a3f3-57713096****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifySlsDispatchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySlsDispatchConfigResponseBody self = new ModifySlsDispatchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySlsDispatchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySlsDispatchConfigResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
