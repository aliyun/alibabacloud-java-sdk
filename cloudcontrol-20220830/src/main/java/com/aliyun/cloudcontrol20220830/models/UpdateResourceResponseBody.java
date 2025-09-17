// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class UpdateResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the asynchronous task. If the operation is asynchronous, this field is returned. In this case, the HTTP status code 202 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>task-433aead756057fff8189a7ce5****</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static UpdateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceResponseBody self = new UpdateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
