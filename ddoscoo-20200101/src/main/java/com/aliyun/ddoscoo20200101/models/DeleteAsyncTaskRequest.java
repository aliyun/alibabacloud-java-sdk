// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAsyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the task that you want to delete.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/159405.html">DescribeAsyncTasks</a> operation to query the IDs of all asynchronous export tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
