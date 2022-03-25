// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteProjectTransModelRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    // 转换图纸id
    @NameInMap("TransModelId")
    public Long transModelId;

    public static DeleteProjectTransModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectTransModelRequest self = new DeleteProjectTransModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectTransModelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DeleteProjectTransModelRequest setTransModelId(Long transModelId) {
        this.transModelId = transModelId;
        return this;
    }
    public Long getTransModelId() {
        return this.transModelId;
    }

}
