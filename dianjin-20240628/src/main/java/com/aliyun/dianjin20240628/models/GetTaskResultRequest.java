// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetTaskResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17071319</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultRequest self = new GetTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
