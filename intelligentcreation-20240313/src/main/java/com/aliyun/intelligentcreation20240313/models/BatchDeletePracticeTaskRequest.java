// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchDeletePracticeTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    public static BatchDeletePracticeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePracticeTaskRequest self = new BatchDeletePracticeTaskRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeletePracticeTaskRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public BatchDeletePracticeTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
