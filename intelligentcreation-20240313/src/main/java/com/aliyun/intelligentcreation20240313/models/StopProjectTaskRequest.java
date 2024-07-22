// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopProjectTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static StopProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopProjectTaskRequest self = new StopProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopProjectTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
