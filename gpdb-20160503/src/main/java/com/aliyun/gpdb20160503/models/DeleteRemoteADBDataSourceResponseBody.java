// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteRemoteADBDataSourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e9d60eb1-e90d-4bc6-a470-c8b767460858</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90000</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static DeleteRemoteADBDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemoteADBDataSourceResponseBody self = new DeleteRemoteADBDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRemoteADBDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRemoteADBDataSourceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
