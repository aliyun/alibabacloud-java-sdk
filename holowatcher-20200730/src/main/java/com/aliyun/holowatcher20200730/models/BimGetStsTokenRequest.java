// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimGetStsTokenRequest extends TeaModel {
    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static BimGetStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        BimGetStsTokenRequest self = new BimGetStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public BimGetStsTokenRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
