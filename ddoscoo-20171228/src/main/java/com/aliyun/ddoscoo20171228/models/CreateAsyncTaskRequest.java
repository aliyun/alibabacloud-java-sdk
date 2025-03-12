// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;timestamp&quot;: 1530276554, &quot;instanceId&quot;: &quot;ddoscoo-woieuroi234&quot;}</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    public static CreateAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTaskRequest self = new CreateAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAsyncTaskRequest setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public CreateAsyncTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
