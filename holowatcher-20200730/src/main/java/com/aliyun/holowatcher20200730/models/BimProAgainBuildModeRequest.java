// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProAgainBuildModeRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static BimProAgainBuildModeRequest build(java.util.Map<String, ?> map) throws Exception {
        BimProAgainBuildModeRequest self = new BimProAgainBuildModeRequest();
        return TeaModel.build(map, self);
    }

    public BimProAgainBuildModeRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
