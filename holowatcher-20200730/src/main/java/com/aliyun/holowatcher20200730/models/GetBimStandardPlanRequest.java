// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardPlanRequest extends TeaModel {
    // 标准图纸id
    @NameInMap("Standard")
    public Long standard;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardPlanRequest self = new GetBimStandardPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardPlanRequest setStandard(Long standard) {
        this.standard = standard;
        return this;
    }
    public Long getStandard() {
        return this.standard;
    }

    public GetBimStandardPlanRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
