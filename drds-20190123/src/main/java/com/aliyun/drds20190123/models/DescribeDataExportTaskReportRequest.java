// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportTaskReportRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeDataExportTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportTaskReportRequest self = new DescribeDataExportTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportTaskReportRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
