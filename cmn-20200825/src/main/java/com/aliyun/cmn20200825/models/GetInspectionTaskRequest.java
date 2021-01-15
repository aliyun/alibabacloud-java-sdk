// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetInspectionTaskRequest extends TeaModel {
    // 巡检项ID
    @NameInMap("TaskId")
    public String taskId;

    public static GetInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionTaskRequest self = new GetInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetInspectionTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
