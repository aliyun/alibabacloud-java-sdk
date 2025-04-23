// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetJobRequest extends TeaModel {
    @NameInMap("taskType")
    public String taskType;

    public static GetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRequest self = new GetJobRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
