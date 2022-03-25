// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimGlbModelListRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimGlbModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimGlbModelListRequest self = new GetBimGlbModelListRequest();
        return TeaModel.build(map, self);
    }

    public GetBimGlbModelListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
