// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkLogAnalyzeTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetSparkLogAnalyzeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkLogAnalyzeTaskRequest self = new GetSparkLogAnalyzeTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkLogAnalyzeTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
