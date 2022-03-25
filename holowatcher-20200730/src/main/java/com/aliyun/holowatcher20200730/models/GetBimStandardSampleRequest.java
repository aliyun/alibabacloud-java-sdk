// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardSampleRequest extends TeaModel {
    // 标准图纸id
    @NameInMap("StandardId")
    public Long standardId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimStandardSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardSampleRequest self = new GetBimStandardSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetBimStandardSampleRequest setStandardId(Long standardId) {
        this.standardId = standardId;
        return this;
    }
    public Long getStandardId() {
        return this.standardId;
    }

    public GetBimStandardSampleRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
