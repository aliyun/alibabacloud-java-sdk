// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesToNodePoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7631D83-6E98-1949-B665-766A62xxxxxx</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-5a54309c80282e39ea00002f</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static AttachInstancesToNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesToNodePoolResponseBody self = new AttachInstancesToNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachInstancesToNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachInstancesToNodePoolResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
