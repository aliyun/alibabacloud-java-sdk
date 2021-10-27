// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportTaskReportRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeDataImportTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportTaskReportRequest self = new DescribeDataImportTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportTaskReportRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
