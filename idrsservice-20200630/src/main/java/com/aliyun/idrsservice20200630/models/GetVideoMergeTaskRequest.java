// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetVideoMergeTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetVideoMergeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoMergeTaskRequest self = new GetVideoMergeTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoMergeTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
