// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryDataImportProcessStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryDataImportProcessStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataImportProcessStatusRequest self = new QueryDataImportProcessStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataImportProcessStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
