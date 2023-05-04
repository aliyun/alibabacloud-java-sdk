// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdRequest extends TeaModel {
    /**
     * <p>The status of the task. Valid values:</p>
     * <br>
     * <p>*   **Complete**: The task is complete.</p>
     * <p>*   **Pending**: The task is pending.</p>
     * <p>*   **Refreshing**: The task is running.</p>
     * <p>*   **Failed**: The task failed.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeRefreshTaskByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTaskByIdRequest self = new DescribeRefreshTaskByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTaskByIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
