// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTaskByIdRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the task that you want to query.
    // 
    // You can call the [RefreshObjectCaches](~~91164~~) operation to query task IDs. Then, you can use the task IDs to query task status.
    // 
    // You can specify up to 10 task IDs. Separate task IDs with commas (,).
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeRefreshTaskByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTaskByIdRequest self = new DescribeRefreshTaskByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTaskByIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRefreshTaskByIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
