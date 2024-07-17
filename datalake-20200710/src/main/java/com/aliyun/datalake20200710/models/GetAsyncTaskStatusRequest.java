// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetAsyncTaskStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>f546c761570e5efc8146a1986f7890d2</p>
     */
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
