// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class ResumeC2paBucketSignTaskRequest extends TeaModel {
    /**
     * <p>The Bucket parent task ID returned by CreateC2paBucketSignTask.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>047b8305-9572-4eed-b7fb-8588b989b6e5</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ResumeC2paBucketSignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeC2paBucketSignTaskRequest self = new ResumeC2paBucketSignTaskRequest();
        return TeaModel.build(map, self);
    }

    public ResumeC2paBucketSignTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
