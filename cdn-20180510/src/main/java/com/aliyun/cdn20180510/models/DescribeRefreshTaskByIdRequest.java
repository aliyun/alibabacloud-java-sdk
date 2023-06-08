// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdRequest extends TeaModel {
    /**
     * <p>The ID of the task that you want to query.</p>
     * <br>
     * <p>You can call the [RefreshObjectCaches](~~91164~~) operation to query task IDs. Then, you can use the task IDs to query task status.</p>
     * <br>
     * <p>You can specify up to 10 task IDs. Separate task IDs with commas (,).</p>
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
