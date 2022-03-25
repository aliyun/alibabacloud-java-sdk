// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectDetailRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectDetailRequest self = new GetBimProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetBimProjectDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
