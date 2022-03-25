// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingListRequest extends TeaModel {
    // 任务id
    @NameInMap("TaskId")
    public String taskId;

    public static GetBimDrawingListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingListRequest self = new GetBimDrawingListRequest();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
