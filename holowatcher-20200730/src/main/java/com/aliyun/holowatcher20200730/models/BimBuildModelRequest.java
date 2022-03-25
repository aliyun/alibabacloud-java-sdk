// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimBuildModelRequest extends TeaModel {
    // 任务Id
    @NameInMap("TaskId")
    public String taskId;

    public static BimBuildModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BimBuildModelRequest self = new BimBuildModelRequest();
        return TeaModel.build(map, self);
    }

    public BimBuildModelRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
