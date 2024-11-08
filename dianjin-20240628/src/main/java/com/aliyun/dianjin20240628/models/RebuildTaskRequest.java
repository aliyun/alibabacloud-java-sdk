// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RebuildTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    public static RebuildTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildTaskRequest self = new RebuildTaskRequest();
        return TeaModel.build(map, self);
    }

    public RebuildTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
