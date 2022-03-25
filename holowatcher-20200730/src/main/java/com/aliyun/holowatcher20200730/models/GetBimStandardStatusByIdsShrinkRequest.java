// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardStatusByIdsShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardStatusByIdsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardStatusByIdsShrinkRequest self = new GetBimStandardStatusByIdsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardStatusByIdsShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public GetBimStandardStatusByIdsShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
