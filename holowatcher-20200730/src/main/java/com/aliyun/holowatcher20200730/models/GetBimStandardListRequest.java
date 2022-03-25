// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardListRequest extends TeaModel {
    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardListRequest self = new GetBimStandardListRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
