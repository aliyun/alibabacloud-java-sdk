// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimRetryTransRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static BimRetryTransRequest build(java.util.Map<String, ?> map) throws Exception {
        BimRetryTransRequest self = new BimRetryTransRequest();
        return TeaModel.build(map, self);
    }

    public BimRetryTransRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
