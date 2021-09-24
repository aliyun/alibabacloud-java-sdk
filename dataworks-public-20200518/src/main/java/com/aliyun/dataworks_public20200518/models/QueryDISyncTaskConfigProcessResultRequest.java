// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("AsyncProcessId")
    @Validation(required = true)
    public Long asyncProcessId;

    public static QueryDISyncTaskConfigProcessResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDISyncTaskConfigProcessResultRequest self = new QueryDISyncTaskConfigProcessResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDISyncTaskConfigProcessResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public QueryDISyncTaskConfigProcessResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public QueryDISyncTaskConfigProcessResultRequest setAsyncProcessId(Long asyncProcessId) {
        this.asyncProcessId = asyncProcessId;
        return this;
    }
    public Long getAsyncProcessId() {
        return this.asyncProcessId;
    }

}
