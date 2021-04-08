// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetQueryTraceFileRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetQueryTraceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryTraceFileRequest self = new GetQueryTraceFileRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryTraceFileRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
