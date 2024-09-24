// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class EvictTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17071319</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static EvictTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        EvictTaskRequest self = new EvictTaskRequest();
        return TeaModel.build(map, self);
    }

    public EvictTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
