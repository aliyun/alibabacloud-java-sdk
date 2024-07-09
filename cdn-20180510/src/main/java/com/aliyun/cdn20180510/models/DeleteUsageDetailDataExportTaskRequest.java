// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUsageDetailDataExportTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task. You can call the <a href="https://help.aliyun.com/document_detail/91062.html">DescribeUserUsageDataExportTask</a> operation to query tasks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteUsageDetailDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsageDetailDataExportTaskRequest self = new DeleteUsageDetailDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsageDetailDataExportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
