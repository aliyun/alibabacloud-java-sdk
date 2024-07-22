// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetProjectTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20230823218109326025-1200</p>
     */
    @NameInMap("IdempotentId")
    public String idempotentId;

    /**
     * <strong>example:</strong>
     * <p>313123123</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetProjectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectTaskRequest self = new GetProjectTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectTaskRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public GetProjectTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
