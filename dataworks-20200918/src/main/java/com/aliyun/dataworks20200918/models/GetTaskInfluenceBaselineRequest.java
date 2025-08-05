// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTaskInfluenceBaselineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static GetTaskInfluenceBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInfluenceBaselineRequest self = new GetTaskInfluenceBaselineRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskInfluenceBaselineRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
