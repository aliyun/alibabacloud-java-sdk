// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkLogAnalyzeTaskRequest extends TeaModel {
    /**
     * <p>The ID of the Spark log analysis task. You can call the ListSparkLogAnalyzeTasks operation to query the IDs and states of all analysis tasks in the current cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static KillSparkLogAnalyzeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSparkLogAnalyzeTaskRequest self = new KillSparkLogAnalyzeTaskRequest();
        return TeaModel.build(map, self);
    }

    public KillSparkLogAnalyzeTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
