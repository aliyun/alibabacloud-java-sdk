// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTaskDetailRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimTaskDetailRequest self = new GetBimTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetBimTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
