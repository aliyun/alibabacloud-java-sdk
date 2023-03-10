// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAsyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the task that you want to delete.</p>
     * <br>
     * <p>> You can call the [DescribeAsyncTasks](~~159405~~) operation to query the IDs of all asynchronous export tasks.</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static DeleteAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsyncTaskRequest self = new DeleteAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAsyncTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteAsyncTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
