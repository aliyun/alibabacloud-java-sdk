// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetTaskDetailRequest extends TeaModel {
    @NameInMap("TaskUid")
    public String taskUid;

    public static GetTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailRequest self = new GetTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
