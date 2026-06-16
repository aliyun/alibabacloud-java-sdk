// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskResultRequest extends TeaModel {
    /**
     * <p>The ID of the asynchronous task. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b67f6089-085a-9402-93c6-bac0561b3a06</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryAsyncTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncTaskResultRequest self = new QueryAsyncTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsyncTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
