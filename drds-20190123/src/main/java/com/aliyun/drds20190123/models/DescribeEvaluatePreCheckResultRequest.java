// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluatePreCheckResultRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeEvaluatePreCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluatePreCheckResultRequest self = new DescribeEvaluatePreCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluatePreCheckResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
