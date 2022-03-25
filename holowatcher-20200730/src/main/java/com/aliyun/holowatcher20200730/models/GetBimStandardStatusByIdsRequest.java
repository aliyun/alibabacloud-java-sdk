// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardStatusByIdsRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardStatusByIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardStatusByIdsRequest self = new GetBimStandardStatusByIdsRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardStatusByIdsRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public GetBimStandardStatusByIdsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
