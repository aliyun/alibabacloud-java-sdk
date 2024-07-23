// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the redeployment task.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25622.html">DescribeTasks</a> operation to query the redeployment result.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bp10e8orkp8x****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RedeployInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedeployInstanceResponseBody self = new RedeployInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RedeployInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RedeployInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
