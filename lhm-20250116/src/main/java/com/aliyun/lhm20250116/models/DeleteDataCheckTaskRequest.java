// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class DeleteDataCheckTaskRequest extends TeaModel {
    /**
     * <p>The list of task IDs. Batch deletion is supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskIds")
    public java.util.List<Long> taskIds;

    public static DeleteDataCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCheckTaskRequest self = new DeleteDataCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataCheckTaskRequest setTaskIds(java.util.List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

}
