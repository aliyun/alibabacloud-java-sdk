// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CloneDisksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task group ID of the disk cloning operation. You can call <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/api-ecs-2014-05-26-describetasks">DescribeTasks</a> to query the task execution result.</p>
     * 
     * <strong>example:</strong>
     * <p>g-2ze2op2grqpclwu7****</p>
     */
    @NameInMap("TaskGroupId")
    public String taskGroupId;

    public static CloneDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneDisksResponseBody self = new CloneDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneDisksResponseBody setTaskGroupId(String taskGroupId) {
        this.taskGroupId = taskGroupId;
        return this;
    }
    public String getTaskGroupId() {
        return this.taskGroupId;
    }

}
