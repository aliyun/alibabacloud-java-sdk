// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTransModelListRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimTransModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimTransModelListRequest self = new GetBimTransModelListRequest();
        return TeaModel.build(map, self);
    }

    public GetBimTransModelListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
