// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDDLJobStatusRequest extends TeaModel {
    /**
     * <p>The ID of the DDL task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetDDLJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDDLJobStatusRequest self = new GetDDLJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDDLJobStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
