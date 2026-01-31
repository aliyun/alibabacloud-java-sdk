// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetTaskAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>ApplyCertificate</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskAttributeRequest self = new GetTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskAttributeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskAttributeRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
