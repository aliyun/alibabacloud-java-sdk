// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAutoPickPicRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetAutoPickPicRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoPickPicRequest self = new GetAutoPickPicRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoPickPicRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
