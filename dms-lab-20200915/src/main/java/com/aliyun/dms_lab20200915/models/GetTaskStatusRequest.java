// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class GetTaskStatusRequest extends TeaModel {
    @NameInMap("Uid")
    @Validation(required = true)
    public String uid;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static GetTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusRequest self = new GetTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
