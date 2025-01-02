// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ShrinkClusterResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>CC9FEF89-9BE5-5E03-845E-238B48D7599B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>task id</p>
     * 
     * <strong>example:</strong>
     * <p>i159136551662516768776</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ShrinkClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShrinkClusterResponseBody self = new ShrinkClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ShrinkClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ShrinkClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
