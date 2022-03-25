// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimOriginModelRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimOriginModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimOriginModelRequest self = new GetBimOriginModelRequest();
        return TeaModel.build(map, self);
    }

    public GetBimOriginModelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
