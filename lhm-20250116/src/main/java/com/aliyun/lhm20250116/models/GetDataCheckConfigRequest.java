// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckConfigRequest extends TeaModel {
    /**
     * <p>The task ID that uniquely identifies a task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static GetDataCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckConfigRequest self = new GetDataCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckConfigRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
