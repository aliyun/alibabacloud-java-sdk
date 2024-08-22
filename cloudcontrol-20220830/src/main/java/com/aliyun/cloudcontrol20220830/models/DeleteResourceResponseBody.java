// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class DeleteResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>task-433aead756057fff8189a7ce5****</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static DeleteResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceResponseBody self = new DeleteResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteResourceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
