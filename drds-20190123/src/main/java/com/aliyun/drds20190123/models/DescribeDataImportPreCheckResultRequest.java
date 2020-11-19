// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportPreCheckResultRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeDataImportPreCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportPreCheckResultRequest self = new DescribeDataImportPreCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportPreCheckResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
