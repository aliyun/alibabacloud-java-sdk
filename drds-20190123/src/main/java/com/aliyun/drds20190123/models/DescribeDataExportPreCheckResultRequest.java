// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportPreCheckResultRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeDataExportPreCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportPreCheckResultRequest self = new DescribeDataExportPreCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportPreCheckResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
