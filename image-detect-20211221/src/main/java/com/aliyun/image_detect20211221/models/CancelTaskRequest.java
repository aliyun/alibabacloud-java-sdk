// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class CancelTaskRequest extends TeaModel {
    @NameInMap("TaskUid")
    public String taskUid;

    public static CancelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTaskRequest self = new CancelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelTaskRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
