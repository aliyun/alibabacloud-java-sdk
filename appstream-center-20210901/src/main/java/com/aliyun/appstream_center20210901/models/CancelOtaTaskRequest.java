// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CancelOtaTaskRequest extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("TaskId")
    public String taskId;

    public static CancelOtaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOtaTaskRequest self = new CancelOtaTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelOtaTaskRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public CancelOtaTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
