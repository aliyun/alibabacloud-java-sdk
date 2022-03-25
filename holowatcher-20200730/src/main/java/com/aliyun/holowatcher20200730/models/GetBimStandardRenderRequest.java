// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardRenderRequest extends TeaModel {
    // 标准图纸id
    @NameInMap("StandardId")
    public Long standardId;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardRenderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardRenderRequest self = new GetBimStandardRenderRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardRenderRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public GetBimStandardRenderRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
