// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardAutoMarkRequest extends TeaModel {
    // 标准图纸id
    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardAutoMarkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardAutoMarkRequest self = new GetBimStandardAutoMarkRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardAutoMarkRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public GetBimStandardAutoMarkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
