// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTaskReportRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeEvaluateTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTaskReportRequest self = new DescribeEvaluateTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTaskReportRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
