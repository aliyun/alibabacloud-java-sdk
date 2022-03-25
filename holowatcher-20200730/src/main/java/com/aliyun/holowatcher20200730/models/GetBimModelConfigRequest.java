// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimModelConfigRequest extends TeaModel {
    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimModelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimModelConfigRequest self = new GetBimModelConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetBimModelConfigRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
