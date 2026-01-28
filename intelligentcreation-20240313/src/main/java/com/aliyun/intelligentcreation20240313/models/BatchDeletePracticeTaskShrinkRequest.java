// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchDeletePracticeTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    @NameInMap("taskIds")
    public String taskIdsShrink;

    public static BatchDeletePracticeTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePracticeTaskShrinkRequest self = new BatchDeletePracticeTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeletePracticeTaskShrinkRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public BatchDeletePracticeTaskShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

}
