// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class CheckTuringTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>871509423398305792</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CheckTuringTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTuringTaskRequest self = new CheckTuringTaskRequest();
        return TeaModel.build(map, self);
    }

    public CheckTuringTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
