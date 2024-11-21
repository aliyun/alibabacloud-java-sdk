// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BlockObjectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The blocking task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15940956620</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static BlockObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BlockObjectResponseBody self = new BlockObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public BlockObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BlockObjectResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
