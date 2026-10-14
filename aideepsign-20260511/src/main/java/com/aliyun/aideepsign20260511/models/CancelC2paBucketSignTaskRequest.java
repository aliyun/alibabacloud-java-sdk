// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CancelC2paBucketSignTaskRequest extends TeaModel {
    /**
     * <p>The parent task ID of the bucket returned by CreateC2paBucketSignTask.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>047b8305-9572-4eed-b7fb-8588b989b6e5</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelC2paBucketSignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelC2paBucketSignTaskRequest self = new CancelC2paBucketSignTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelC2paBucketSignTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
