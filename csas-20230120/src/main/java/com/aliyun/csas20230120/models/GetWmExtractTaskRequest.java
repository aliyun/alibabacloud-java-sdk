// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetWmExtractTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wmt-9648c22d2eb2cb57bb855dcae7898464********</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetWmExtractTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWmExtractTaskRequest self = new GetWmExtractTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetWmExtractTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
