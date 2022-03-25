// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProjectShareModelRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static BimProjectShareModelRequest build(java.util.Map<String, ?> map) throws Exception {
        BimProjectShareModelRequest self = new BimProjectShareModelRequest();
        return TeaModel.build(map, self);
    }

    public BimProjectShareModelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
