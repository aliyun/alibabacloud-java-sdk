// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetOtaTaskByTaskIdRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetOtaTaskByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOtaTaskByTaskIdRequest self = new GetOtaTaskByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public GetOtaTaskByTaskIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
