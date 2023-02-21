// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkLogAnalyzeTaskRequest extends TeaModel {
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
