// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetProjectPhaseDetailRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetProjectPhaseDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectPhaseDetailRequest self = new GetProjectPhaseDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectPhaseDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
