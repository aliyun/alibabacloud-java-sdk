// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetAsyncTaskStatusRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // TaskId
    @NameInMap("TaskId")
    public String taskId;

    public static GetAsyncTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskStatusRequest self = new GetAsyncTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskStatusRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetAsyncTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
